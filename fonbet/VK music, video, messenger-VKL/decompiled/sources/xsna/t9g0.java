package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;

/* compiled from: ResizablePictureContentImpl.kt */
/* loaded from: classes17.dex */
public final class t9g0 extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final kg50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public t9g0(efj efjVar, float f, float f2, PictureRadius pictureRadius, iy5 iy5Var) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.d.a(f);
        this.c = cq.f(f2);
        this.d = androidx.compose.runtime.k.b(pictureRadius);
        this.e = androidx.compose.runtime.k.b(iy5Var);
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-658457653);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-658457653, i2, -1, "com.vk.core.compose.component.horizontal.ResizablePictureContentImpl.Draw (ResizablePictureContentImpl.kt:39)");
            }
            ggv0.a((efj) ((zak0) this.a).getValue(), new u9g0(j, ((vak0) this.b).getFloatValue(), ((pco) ((zak0) this.c).getValue()).b), (PictureRadius) ((zak0) this.d).getValue(), (iy5) ((zak0) this.e).getValue(), null, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.s9g0
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    t9g0.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
