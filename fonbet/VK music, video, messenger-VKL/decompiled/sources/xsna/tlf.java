package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.common.id.UserId;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import com.vkontakte.android.R;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ded;
import xsna.rlf;

/* compiled from: ClipsUploaderVkStatusListener.kt */
/* loaded from: classes17.dex */
public final class tlf implements rlf {
    public final mhd a;
    public final ClipsRouter b;
    public final bdd c;

    public tlf(mhd mhdVar, ClipsRouter clipsRouter, bdd bddVar) {
        this.a = mhdVar;
        this.b = clipsRouter;
        this.c = bddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rlf
    public final void a(rlf.a aVar) {
        UserId e;
        Integer num;
        String str;
        VideoToClipInfo videoToClipInfo;
        ClipUploaderData.Author author = aVar.b;
        ClipUploadJob clipUploadJob = aVar.c;
        ClipUploaderParams clipUploaderParams = aVar.a;
        ded dedVar = aVar.d;
        if (epx.f(dedVar, ded.b.a)) {
            VkUiUploadFailureType vkUiUploadFailureType = VkUiUploadFailureType.CANCELLED;
            Integer num2 = clipUploaderParams != null ? clipUploaderParams.n : null;
            str = clipUploaderParams != null ? clipUploaderParams.o : null;
            if (num2 == null || str == null) {
                return;
            }
            fxv0.a.a(new hvv0(num2.intValue(), str, new pxv0(vkUiUploadFailureType)));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (epx.f(dedVar, ded.c.a)) {
            UserId e2 = author != null ? author.e() : null;
            Integer num3 = clipUploadJob.d;
            if (e2 != null && num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = clipUploaderParams != null ? clipUploaderParams.n : null;
                String str2 = clipUploaderParams != null ? clipUploaderParams.o : null;
                if (num4 != null && str2 != null) {
                    fxv0.a.a(new ivv0(num4.intValue(), e2.b, intValue, str2));
                    s3q0 s3q0Var2 = s3q0.a;
                }
            }
            if (clipUploaderParams != null && (videoToClipInfo = clipUploaderParams.u) != null && videoToClipInfo.d) {
                g620.f().e().y();
            }
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.a(SingleEvent.CLIP_UPLOAD);
            return;
        }
        if (epx.f(dedVar, ded.g.a)) {
            VkUiUploadFailureType vkUiUploadFailureType2 = VkUiUploadFailureType.DELETED;
            Integer num5 = clipUploaderParams != null ? clipUploaderParams.n : null;
            str = clipUploaderParams != null ? clipUploaderParams.o : null;
            if (num5 == null || str == null) {
                return;
            }
            fxv0.a.a(new hvv0(num5.intValue(), str, new pxv0(vkUiUploadFailureType2)));
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (dedVar instanceof ded.e) {
            ded.e eVar = (ded.e) dedVar;
            VkUiUploadFailureType vkUiUploadFailureType3 = VkUiUploadFailureType.ERROR;
            Integer num6 = clipUploaderParams != null ? clipUploaderParams.n : null;
            str = clipUploaderParams != null ? clipUploaderParams.o : null;
            if (num6 != null && str != null) {
                fxv0.a.a(new hvv0(num6.intValue(), str, new pxv0(vkUiUploadFailureType3)));
                s3q0 s3q0Var4 = s3q0.a;
            }
            Throwable th = eVar.a;
            dhr0.a.getClass();
            Context E = dhr0.E();
            if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9) {
                i0q0.f(new qif(E, R.string.clips_publish_error_flood_snack_message, 1));
                return;
            } else if (r1q.a(th)) {
                i0q0.j(new b04(E, 15));
                return;
            } else {
                i0q0.f(new qif(E, R.string.clips_publish_error_snack_message, 1));
                return;
            }
        }
        Object[] objArr = 0;
        if (!(dedVar instanceof ded.h)) {
            if (dedVar instanceof ded.a) {
                ded.a aVar2 = (ded.a) dedVar;
                if (clipUploaderParams != null ? epx.f(clipUploaderParams.h, Boolean.TRUE) : false) {
                    int i = clipUploadJob.b;
                    File file = clipUploadJob.j;
                    this.c.a(i, file != null ? file.getAbsolutePath() : null, clipUploadJob.h);
                    fgj0 fgj0Var = fgj0.a;
                    ShortVideoGetResponseDto shortVideoGetResponseDto = aVar2.a;
                    fgj0Var.getClass();
                    wjs0.a(new enc(fgj0.a(shortVideoGetResponseDto), clipUploadJob.b));
                    return;
                }
                return;
            }
            return;
        }
        ded.h hVar = (ded.h) dedVar;
        if (author == null || (e = author.e()) == null || (num = clipUploadJob.d) == null) {
            return;
        }
        int intValue2 = num.intValue();
        Integer num7 = clipUploaderParams != null ? clipUploaderParams.n : null;
        String str3 = clipUploaderParams != null ? clipUploaderParams.o : null;
        if (num7 != null && str3 != null) {
            fxv0.a.a(new jvv0(num7.intValue(), e.b, intValue2, str3));
            s3q0 s3q0Var5 = s3q0.a;
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new slf(hVar, objArr == true ? 1 : 0));
        asu0.a.getClass();
        ver0.a(vVar.m(asu0.i()).subscribe(new j22(new d05(10, this, aVar), 16)));
    }

    @Override // xsna.rlf
    public final void b(led ledVar) {
    }
}
