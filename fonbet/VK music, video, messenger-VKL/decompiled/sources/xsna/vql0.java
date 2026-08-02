package xsna;

import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.tags.Tag;
import com.vk.stat.scheme.SchemeStat$FeedPinEntryPoint;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vql0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w8i d;

    public /* synthetic */ vql0(w8i w8iVar, int i, int i2) {
        this.b = i2;
        this.d = w8iVar;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((arl0) this.d).x.notifyItemChanged(this.c);
                break;
            default:
                z8u0 z8u0Var = (z8u0) this.d;
                AttachmentWithMedia attachmentWithMedia = z8u0Var.H;
                PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
                if (photoAttachment != null) {
                    for (Tag tag : photoAttachment.l.x) {
                        zzq zzqVar = (zzq) z8u0Var.v.getValue();
                        int i = tag.b;
                        long j = tag.d.b;
                        String str = z8u0Var.f;
                        Integer valueOf = Integer.valueOf(this.c);
                        zzqVar.getClass();
                        zzqVar.c(i, j, SchemeStat$FeedPinEntryPoint.PHOTO_VIEWER, valueOf, str);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
