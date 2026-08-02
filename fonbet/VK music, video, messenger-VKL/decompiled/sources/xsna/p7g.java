package xsna;

import androidx.compose.runtime.a;
import java.util.ArrayList;
import xsna.dak0;
import xsna.wlp0;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class p7g extends m7e0<l5g> {

    /* compiled from: Transition.kt */
    public static final class a implements gzs<Boolean> {
        public final /* synthetic */ wlp0 b;

        public a(wlp0 wlp0Var) {
            this.b = wlp0Var;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return ((zak0) this.b.d).getValue();
        }
    }

    /* compiled from: Transition.kt */
    public static final class b implements gzs<wlp0.b<Boolean>> {
        public final /* synthetic */ wlp0 b;

        public b(wlp0 wlp0Var) {
            this.b = wlp0Var;
        }

        @Override // xsna.gzs
        public final wlp0.b<Boolean> invoke() {
            return this.b.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m7e0
    public final mtk0<l5g> a(wlp0<Boolean> wlp0Var, String str, int i, androidx.compose.runtime.a aVar, int i2) {
        Object B;
        aVar.K(-2133734837);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2133734837, i2, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState (Animator.kt:200)");
        }
        l7e0 l7e0Var = new l7e0(this, i);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        wh50 wh50Var = wlp0Var.d;
        z46 z46Var = wlp0Var.a;
        boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
        aVar.K(1880460593);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:205)");
        }
        ArrayList arrayList = this.a;
        long j = booleanValue ? ((l5g) ((ohy) j5g.i0(((q7e0) ((sxo0) j5g.i0(arrayList)).e).b)).b).a : ((l5g) ((ohy) j5g.Y(((q7e0) ((sxo0) j5g.Y(arrayList)).e).b)).b).a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        d8g g = l5g.g(j);
        boolean J = aVar.J(g);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (J || x == c0012a) {
            x = (itp0) b9g.a.invoke(g);
            aVar.R(x);
        }
        itp0 itp0Var = (itp0) x;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        if (wlp0Var.g()) {
            aVar.K(1666827533);
            aVar.j();
            B = z46Var.B();
        } else {
            aVar.K(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
            B = aVar.x();
            if (z || B == c0012a) {
                dak0 a2 = dak0.a.a();
                izs<Object, s3q0> e = a2 != null ? a2.e() : null;
                dak0 b2 = dak0.a.b(a2);
                try {
                    Object B2 = z46Var.B();
                    dak0.a.d(a2, b2, e);
                    aVar.R(B2);
                    B = B2;
                } catch (Throwable th) {
                    dak0.a.d(a2, b2, e);
                    throw th;
                }
            }
            aVar.j();
        }
        boolean booleanValue2 = ((Boolean) B).booleanValue();
        aVar.K(1880460593);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:205)");
        }
        long j2 = booleanValue2 ? ((l5g) ((ohy) j5g.i0(((q7e0) ((sxo0) j5g.i0(arrayList)).e).b)).b).a : ((l5g) ((ohy) j5g.Y(((q7e0) ((sxo0) j5g.Y(arrayList)).e).b)).b).a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        l5g c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, aVar);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
        Object x2 = aVar.x();
        if (z2 || x2 == c0012a) {
            x2 = bbk0.b(new a(wlp0Var));
            aVar.R(x2);
        }
        boolean booleanValue3 = ((Boolean) ((mtk0) x2).getValue()).booleanValue();
        aVar.K(1880460593);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1880460593, 0, -1, "androidx.compose.animation.graphics.vector.ColorPropertyValues.createState.<anonymous> (Animator.kt:205)");
        }
        long j3 = booleanValue3 ? ((l5g) ((ohy) j5g.i0(((q7e0) ((sxo0) j5g.i0(arrayList)).e).b)).b).a : ((l5g) ((ohy) j5g.Y(((q7e0) ((sxo0) j5g.Y(arrayList)).e).b)).b).a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        l5g c2 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j3, aVar);
        boolean z3 = (i6 > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
        Object x3 = aVar.x();
        if (z3 || x3 == c0012a) {
            x3 = bbk0.b(new b(wlp0Var));
            aVar.R(x3);
        }
        wlp0.d c3 = ump0.c(wlp0Var, c, c2, (phr) l7e0Var.invoke(((mtk0) x3).getValue(), aVar, 0), itp0Var, aVar, ((i4 << 6) & 458752) | i5);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c3;
    }
}
