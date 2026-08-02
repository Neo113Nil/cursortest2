package xsna;

import android.content.Context;
import com.vk.dto.photo.Photo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k68 implements izs {
    public final /* synthetic */ Photo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ m68 d;
    public final /* synthetic */ Context e;

    public /* synthetic */ k68(Photo photo, boolean z, m68 m68Var, Context context) {
        this.b = photo;
        this.c = z;
        this.d = m68Var;
        this.e = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = ((t9x0) obj).a;
        Photo photo = this.b;
        photo.h = i;
        boolean z = photo.n;
        boolean z2 = this.c;
        m68 m68Var = this.d;
        if (z != z2) {
            m68Var.g(this.e, photo, z);
        } else {
            m68Var.getClass();
            ce60.b.getClass();
            p870.f().d(113, 100, photo);
        }
        return s3q0.a;
    }
}
