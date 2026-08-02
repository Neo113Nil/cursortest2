package xsna;

/* compiled from: EmptyBorder.kt */
/* loaded from: classes17.dex */
public final class wep implements k18 {
    public static final wep a = new wep();

    @Override // xsna.k18
    public final void a(final long j, final r5j0 r5j0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(2145108540);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2145108540, i, -1, "com.vk.core.compose.component.image.border.EmptyBorder.invoke (EmptyBorder.kt:14)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.uep
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    wep.this.a(j, r5j0Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.k18
    public final float b(int i, long j, androidx.compose.runtime.a aVar) {
        aVar.K(-915765124);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-915765124, i, -1, "com.vk.core.compose.component.image.border.EmptyBorder.calculateWidth (EmptyBorder.kt:17)");
        }
        float f = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }
}
