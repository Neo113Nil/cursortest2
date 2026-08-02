package xsna;

import com.vk.api.video.VideoSave;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.newsfeed.posting.impl.domain.model.upload.b;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* compiled from: UploadInteractor.kt */
/* loaded from: classes4.dex */
public final class nbq0 {
    public final mui0 a;
    public final k170 b;
    public final ConcurrentSkipListSet<Integer> c = new ConcurrentSkipListSet<>();
    public final kvm0 d = new kvm0(this, 7);

    /* compiled from: UploadInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadNotification.State.values().length];
            try {
                iArr[UploadNotification.State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadNotification.State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nbq0(mui0 mui0Var, k170 k170Var) {
        this.a = mui0Var;
        this.b = k170Var;
    }

    public final void a(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{lhg.a(i, "Upload. Cancel taskId: ")});
        }
        com.vk.upload.impl.a.b(i, null);
        this.c.remove(Integer.valueOf(i));
        this.b.invoke(new UploadUpdate.Cancel(i));
    }

    public final void b(int i) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{lhg.a(i, "Upload. Retry taskId:")});
        }
        this.c.add(Integer.valueOf(i));
        com.vk.upload.impl.a.e(i);
    }

    public final void c(UploadDto uploadDto, UserId userId, boolean z) {
        int h;
        String str;
        UserId a2 = userId == null ? this.a.a() : userId;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Upload. Start taskId:" + uploadDto.I4().d});
        }
        AttachmentType attachmentType = uploadDto.I4().g;
        int i = attachmentType == null ? -1 : b.a.$EnumSwitchMapping$0[attachmentType.ordinal()];
        com.vk.upload.impl.b bVar = null;
        if (i == 1) {
            String str2 = uploadDto.I4().c;
            if (str2 != null) {
                bVar = new com.vk.upload.impl.tasks.i(str2, a2, true, false);
            }
        } else if (i == 2) {
            String str3 = uploadDto.I4().c;
            if (str3 != null) {
                bVar = new com.vk.upload.impl.tasks.x(str3, a2);
            }
        } else if (i == 3) {
            Object x2 = uploadDto.x2();
            VideoFile videoFile = x2 != null ? (VideoFile) x2 : null;
            if (videoFile != null) {
                bVar = new VideoUploadTaskNew(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL), videoFile.getTitle(), videoFile.j1(), VideoSave.Target.POST, a2, "UploadTaskMapper", null, true, null, null, null, null, null, null, 0L, null, false, z, false, 393024);
            }
        } else if (i == 4 && (str = uploadDto.I4().c) != null) {
            int i2 = uploadDto.I4().d;
            com.vk.upload.impl.tasks.d dVar = new com.vk.upload.impl.tasks.d(str, true);
            dVar.d = i2;
            bVar = dVar;
        }
        if (bVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(uploadDto.I4().d);
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = this.c;
        if (concurrentSkipListSet.contains(valueOf)) {
            return;
        }
        UploadDto.UploadState I4 = uploadDto.I4();
        UploadDto.UploadStep uploadStep = I4.b;
        UploadDto.b7.getClass();
        if (!I4.equals(UploadDto.a.b) && (epx.f(uploadStep, UploadDto.UploadStep.Uploading.b) || (uploadStep instanceof UploadDto.UploadStep.Failed))) {
            ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
            if (com.vk.upload.impl.a.a(uploadDto.I4().d)) {
                com.vk.upload.impl.a.e(uploadDto.I4().d);
                h = uploadDto.I4().d;
                concurrentSkipListSet.add(Integer.valueOf(h));
                this.b.invoke(new UploadUpdate.Start(uploadDto.I4().d, h, uploadDto.e9()));
            }
        }
        h = com.vk.upload.impl.a.h(bVar, this.d);
        concurrentSkipListSet.add(Integer.valueOf(h));
        this.b.invoke(new UploadUpdate.Start(uploadDto.I4().d, h, uploadDto.e9()));
    }
}
