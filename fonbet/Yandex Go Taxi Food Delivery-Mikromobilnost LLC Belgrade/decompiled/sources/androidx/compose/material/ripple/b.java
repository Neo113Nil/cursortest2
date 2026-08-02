package androidx.compose.material.ripple;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ac2;
import defpackage.b64;
import defpackage.c1y;
import defpackage.cjs0;
import defpackage.cot;
import defpackage.e530;
import defpackage.f02;
import defpackage.fud;
import defpackage.fwi;
import defpackage.h8w;
import defpackage.i28;
import defpackage.ixe0;
import defpackage.izx;
import defpackage.jxe0;
import defpackage.k28;
import defpackage.kub1;
import defpackage.kxe0;
import defpackage.ldc;
import defpackage.lxe0;
import defpackage.m810;
import defpackage.nfh;
import defpackage.npb1;
import defpackage.pam;
import defpackage.qam;
import defpackage.qje;
import defpackage.qv10;
import defpackage.r4u0;
import defpackage.rrk0;
import defpackage.rzo;
import defpackage.s72;
import defpackage.sls;
import defpackage.t72;
import defpackage.tje;
import defpackage.w511;
import defpackage.wu60;
import defpackage.xfc;
import defpackage.xy40;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class b extends e530 implements fud, pam, izx {
    public boolean B;
    public final h8w a;
    public final boolean b;
    public final float c;
    public final xfc w;
    public final sls x;
    public r4u0 y;
    public float z;
    public long A = 0;
    public final xy40 C = new xy40((Object) null);

    public b(h8w h8wVar, boolean z, float f, xfc xfcVar, sls slsVar) {
        this.a = h8wVar;
        this.b = z;
        this.c = f;
        this.w = xfcVar;
        this.x = slsVar;
    }

    public final void E0(lxe0 lxe0Var) {
        RippleHostView rippleHostView;
        if (!(lxe0Var instanceof jxe0)) {
            if (lxe0Var instanceof kxe0) {
                RippleHostView rippleHostView2 = ((ac2) this).E;
                if (rippleHostView2 != null) {
                    rippleHostView2.removeRipple();
                    return;
                }
                return;
            }
            if (!(lxe0Var instanceof ixe0) || (rippleHostView = ((ac2) this).E) == null) {
                return;
            }
            rippleHostView.removeRipple();
            return;
        }
        jxe0 jxe0Var = (jxe0) lxe0Var;
        long j = this.A;
        float f = this.z;
        ac2 ac2Var = (ac2) this;
        RippleContainer rippleContainer = ac2Var.D;
        if (rippleContainer == null) {
            Object obj = (View) npb1.c(ac2Var, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    w511.f(qv10.p("Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", obj));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    RippleContainer rippleContainer2 = new RippleContainer(viewGroup.getContext());
                    viewGroup.addView(rippleContainer2);
                    rippleContainer = rippleContainer2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof RippleContainer) {
                        rippleContainer = (RippleContainer) childAt;
                        break;
                    }
                    i++;
                }
            }
            ac2Var.D = rippleContainer;
        }
        RippleHostView rippleHostView3 = rippleContainer.getRippleHostView(ac2Var);
        rippleHostView3.m37addRippleKOepWvA(jxe0Var, ac2Var.b, j, m810.b(f), ac2Var.w.a(), ((rrk0) ac2Var.x.invoke()).d, new f02(2, ac2Var));
        ac2Var.E = rippleHostView3;
        rzo.D(ac2Var);
    }

    @Override // defpackage.izx, defpackage.ga10
    public final void a(long j) {
        float w0;
        this.B = true;
        fwi fwiVar = qje.P(this).R;
        this.A = rzo.a0(j);
        float f = this.c;
        if (Float.isNaN(f)) {
            long j2 = this.A;
            w0 = wu60.d(kub1.a(cjs0.d(j2), cjs0.b(j2))) / 2.0f;
            if (this.b) {
                w0 += fwiVar.w0(10.0f);
            }
        } else {
            w0 = fwiVar.w0(f);
        }
        this.z = w0;
        xy40 xy40Var = this.C;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            E0((lxe0) objArr[i2]);
        }
        xy40Var.j();
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        k28 k28Var = c1yVar.a;
        c1yVar.a();
        r4u0 r4u0Var = this.y;
        if (r4u0Var != null) {
            float f = this.z;
            long a = this.w.a();
            float floatValue = ((Number) r4u0Var.c.e()).floatValue();
            if (floatValue > 0.0f) {
                long b = ldc.b(a, floatValue, 0.0f, 0.0f, 0.0f, 14);
                if (r4u0Var.a) {
                    float d = cjs0.d(k28Var.c());
                    float b2 = cjs0.b(k28Var.c());
                    nfh nfhVar = k28Var.b;
                    long v = nfhVar.v();
                    nfhVar.q().save();
                    try {
                        ((cot) nfhVar.a).f(0.0f, 0.0f, d, b2, 1);
                        qam.z(c1yVar, b, f, 0L, 0.0f, null, 0, HProv.PP_SAME_MEDIA);
                    } finally {
                        b64.C(nfhVar, v);
                    }
                } else {
                    qam.z(c1yVar, b, f, 0L, 0.0f, null, 0, HProv.PP_SAME_MEDIA);
                }
            }
        }
        ac2 ac2Var = (ac2) this;
        i28 q = k28Var.b.q();
        RippleHostView rippleHostView = ac2Var.E;
        if (rippleHostView != null) {
            rippleHostView.m38setRipplePropertiesbiQXAtU(ac2Var.A, m810.b(ac2Var.z), ac2Var.w.a(), ((rrk0) ac2Var.x.invoke()).d);
            Canvas canvas = t72.a;
            rippleHostView.draw(((s72) q).a);
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        tje.N(getCoroutineScope(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }
}
