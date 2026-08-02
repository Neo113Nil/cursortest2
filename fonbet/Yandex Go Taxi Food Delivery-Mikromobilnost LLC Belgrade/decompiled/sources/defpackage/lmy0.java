package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.m;
import androidx.compose.foundation.interaction.a;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final /* synthetic */ class lmy0 implements zls {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h8w c;
    public final /* synthetic */ jmy0 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;

    public /* synthetic */ lmy0(boolean z, boolean z2, zx40 zx40Var, jmy0 jmy0Var, float f, float f2) {
        this.a = z;
        this.b = z2;
        this.c = zx40Var;
        this.w = jmy0Var;
        this.x = f;
        this.y = f2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m3u0 n;
        m3u0 n2;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(1398930845);
        h8w h8wVar = this.c;
        oz40 b = a.b(h8wVar, btsVar, 0);
        dmh dmhVar = (dmh) this.w;
        dmhVar.getClass();
        btsVar.e0(998675979);
        oz40 b2 = a.b(h8wVar, btsVar, 0);
        boolean z = this.a;
        long j = !z ? dmhVar.h : this.b ? dmhVar.g : ((Boolean) b2.getValue()).booleanValue() ? dmhVar.e : dmhVar.f;
        if (z) {
            btsVar.e0(318120148);
            n = m.a(j, sb2.K(150, 0, null, 6), null, btsVar, 48, 12);
            btsVar.t(false);
        } else {
            btsVar.e0(318223006);
            n = f.n(new ldc(j), btsVar);
            btsVar.t(false);
        }
        m3u0 m3u0Var = n;
        btsVar.t(false);
        boolean booleanValue = ((Boolean) b.getValue()).booleanValue();
        float f = this.y;
        float f2 = booleanValue ? this.x : f;
        if (z) {
            btsVar.e0(1361082574);
            n2 = b.a(f2, sb2.K(150, 0, null, 6), null, null, btsVar, 48, 12);
            btsVar.t(false);
        } else {
            btsVar.e0(1361186796);
            n2 = f.n(new y7m(f), btsVar);
            btsVar.t(false);
        }
        xa6 xa6Var = (xa6) f.n(new xa6(((y7m) n2.getValue()).a, new a6t0(((ldc) m3u0Var.getValue()).a)), btsVar).getValue();
        f530 i = bb1.i(c530.a, new qjf0(xa6Var.a, xa6Var, 4));
        btsVar.t(false);
        return i;
    }
}
