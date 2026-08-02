package xsna;

import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hfr;

/* compiled from: VkAppCallback.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class e9u0 extends FunctionReferenceImpl implements izs<Photo, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Photo photo) {
        Photo photo2 = photo;
        z8u0 z8u0Var = (z8u0) this.receiver;
        z8u0Var.getClass();
        ce60.b.getClass();
        p870 f = p870.f();
        hfr.a aVar = new hfr.a(rli0.j(rli0.t(new i5g(z8u0Var.s), new h3e0(16)), new z4t0(photo2, 1)));
        while (aVar.hasNext()) {
            PhotoAttachment photoAttachment = (PhotoAttachment) aVar.next();
            Photo photo3 = photoAttachment.l;
            photo3.r = photo2.r;
            photo3.x = photo2.x;
            f.e(120, photoAttachment);
        }
        f.e(113, photo2);
        if (z8u0Var.R()) {
            boolean S = z8u0Var.S();
            m68 m68Var = z8u0Var.y;
            if (m68Var != null) {
                m68Var.z = S;
            }
        }
        return s3q0.a;
    }
}
