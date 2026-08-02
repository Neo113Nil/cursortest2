package xsna;

import android.os.Parcelable;
import com.vk.api.base.Document;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Iterator;

/* compiled from: AttachmentsPostingViewController.kt */
/* loaded from: classes4.dex */
public final class f94 implements izs<UploadNotification.b, s3q0> {
    public final /* synthetic */ b94 b;

    /* compiled from: AttachmentsPostingViewController.kt */
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

    public f94(b94 b94Var) {
        this.b = b94Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(UploadNotification.b bVar) {
        Attachment attachment;
        Object obj;
        Object obj2;
        z84 z84Var;
        UploadNotification.b bVar2 = bVar;
        b94 b94Var = this.b;
        qcc0 qcc0Var = b94Var.m;
        int i = bVar2.a;
        int i2 = a.$EnumSwitchMapping$0[bVar2.b.ordinal()];
        if (i2 == 1) {
            Parcelable parcelable = bVar2.e;
            zu90 P0 = qcc0Var.P0(i);
            o64 o64Var = qcc0Var.C;
            if (P0 != null) {
                P0.Y2(false);
            }
            Iterator it = o64Var.u().iterator();
            while (true) {
                attachment = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Parcelable parcelable2 = (Attachment) obj;
                if ((parcelable2 instanceof ju90) && ((ju90) parcelable2).S() == i) {
                    break;
                }
            }
            Attachment attachment2 = (Attachment) obj;
            Iterator it2 = o64Var.u().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Parcelable parcelable3 = (Attachment) obj2;
                if ((parcelable3 instanceof ju90) && ((ju90) parcelable3).S() == i) {
                    break;
                }
            }
            Attachment attachment3 = (Attachment) obj2;
            if (parcelable instanceof Attachment) {
                if ((attachment3 instanceof PendingPhotoAttachment) && (parcelable instanceof PhotoAttachment)) {
                    PhotoAttachment photoAttachment = (PhotoAttachment) parcelable;
                    PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment3;
                    photoAttachment.o = pendingPhotoAttachment.f;
                    photoAttachment.p = pendingPhotoAttachment.g;
                    photoAttachment.q = pendingPhotoAttachment.h;
                }
                attachment = (Attachment) parcelable;
            } else if (parcelable instanceof Document) {
                attachment = new DocumentAttachment((Document) parcelable);
            } else if (parcelable instanceof MusicTrack) {
                attachment = new AudioAttachment((MusicTrack) parcelable);
            } else if (parcelable instanceof VideoFile) {
                attachment = new VideoAttachment((VideoFile) parcelable);
            }
            if (attachment2 != null && attachment != null) {
                o64Var.p2(attachment2, attachment);
                z84 z84Var2 = b94Var.p;
                if (z84Var2 != null) {
                    z84Var2.X3(i, attachment);
                }
            }
            if (!b94Var.j() && (z84Var = b94Var.p) != null) {
                z84Var.b.Ca();
            }
        } else if (i2 != 2) {
            int i3 = bVar2.c;
            int i4 = bVar2.d;
            zu90 P02 = qcc0Var.P0(i);
            if (P02 != null) {
                P02.f3(i3, i4);
            }
        } else {
            Throwable th = bVar2.f;
            zu90 P03 = qcc0Var.P0(i);
            if (P03 != null) {
                P03.i4(true);
                P03.Y2(false);
            }
            z84 z84Var3 = b94Var.p;
            if (z84Var3 != null) {
                z84Var3.P6(i, th);
            }
        }
        return s3q0.a;
    }
}
