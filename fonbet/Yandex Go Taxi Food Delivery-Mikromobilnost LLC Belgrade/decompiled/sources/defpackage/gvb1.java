package defpackage;

import android.content.res.TypedArray;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes6.dex */
public abstract class gvb1 {
    public static final void a(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        ny61.g("Attribute not defined in set.");
    }

    public static tt b(String str, l030 l030Var, s030 s030Var, w3i w3iVar, dt20 dt20Var) {
        str.getClass();
        s030Var.getClass();
        w3iVar.getClass();
        dt20Var.getClass();
        tt ttVar = new tt();
        int i = 2;
        ttVar.a = new o3g(dt20Var, i);
        int i2 = 0;
        ttVar.b = new o3g(dt20Var, i2);
        int i3 = 3;
        ttVar.c = new o3g(dt20Var, i3);
        ttVar.d = new p3g(w3iVar, i);
        int i4 = 4;
        ttVar.e = new p3g(w3iVar, i4);
        n3w a = n3w.a(str);
        p3g p3gVar = new p3g(w3iVar, 5);
        ttVar.f = p3gVar;
        ttVar.g = i5m.b(new ys10((xvf0) a, (xvf0) p3gVar, i3));
        ttVar.h = n3w.a(l030Var);
        n3w a2 = n3w.a(s030Var);
        p3g p3gVar2 = new p3g(w3iVar, i3);
        int i5 = 1;
        p3g p3gVar3 = new p3g(w3iVar, i5);
        p3g p3gVar4 = (p3g) ttVar.e;
        xvf0 xvf0Var = (xvf0) ttVar.g;
        n3w n3wVar = (n3w) ttVar.h;
        bo2 bo2Var = new bo2(p3gVar4, xvf0Var, n3wVar, a2, xvf0Var, (p3g) ttVar.f, p3gVar2, p3gVar3);
        o3g o3gVar = new o3g(dt20Var, i5);
        ttVar.i = o3gVar;
        p3g p3gVar5 = new p3g(w3iVar, 6);
        ttVar.j = p3gVar5;
        p3g p3gVar6 = new p3g(w3iVar, 7);
        ttVar.k = p3gVar6;
        p3g p3gVar7 = new p3g(w3iVar, i2);
        ttVar.l = p3gVar7;
        ttVar.m = i5m.b(new x0z(15, new bo2((o3g) ttVar.b, (o3g) ttVar.c, (p3g) ttVar.d, bo2Var, o3gVar, p3gVar5, p3gVar6, p3gVar7, 24, false), a2, (o3g) ttVar.a, n3wVar));
        ttVar.n = i5m.b(new ys10((o3g) ttVar.a, new bo2((o3g) ttVar.b, (o3g) ttVar.c, (p3g) ttVar.d, new h0z((p3g) ttVar.e, (xvf0) ttVar.g, 20), (o3g) ttVar.i, (p3g) ttVar.j, (p3g) ttVar.k, (p3g) ttVar.l, 22, false), i4));
        return ttVar;
    }

    public static final dj70 c(wi70 wi70Var, boolean z, boolean z2) {
        wp2 wp2Var;
        bj70 bj70Var = wi70Var.d;
        CharSequence charSequence = wi70Var.b;
        CharSequence charSequence2 = wi70Var.a;
        pi70 pi70Var = bj70Var.a;
        qwa0 qwa0Var = null;
        if (pi70Var instanceof ni70) {
            wp2Var = AppColor$Palette.Control;
        } else {
            if (!(pi70Var instanceof oi70)) {
                w511.b();
                return null;
            }
            wp2Var = ((oi70) pi70Var).b;
        }
        wp2 wp2Var2 = wp2Var;
        if (z2 && ((charSequence2.length() > 0 || charSequence.length() > 0) && wi70Var.g)) {
            qwa0Var = pwa0.a;
        } else if (z && (charSequence2.length() > 0 || charSequence.length() > 0)) {
            qwa0Var = owa0.a;
        }
        return new dj70(wi70Var.a, wi70Var.b, wi70Var.d.c, wp2Var2, wi70Var.e, qwa0Var, wi70Var.c.toString());
    }
}
