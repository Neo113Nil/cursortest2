package xsna;

import com.vk.dto.photo.Photo;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.z8u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class v0o0 implements izs {
    public final /* synthetic */ Photo b;
    public final /* synthetic */ x0o0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ v0o0(Photo photo, x0o0 x0o0Var, int i) {
        this.b = photo;
        this.c = x0o0Var;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Photo photo = this.b;
        photo.r = true;
        photo.l = false;
        photo.m = false;
        x0o0 x0o0Var = this.c;
        x0o0Var.b.invoke(photo);
        x0o0.k(x0o0Var, photo, null, 4);
        z8u0.d dVar = x0o0Var.j;
        if (dVar != null) {
            dVar.a(new PhotoAttachment(photo));
        }
        cvk.u(this.d, false);
        return s3q0.a;
    }
}
