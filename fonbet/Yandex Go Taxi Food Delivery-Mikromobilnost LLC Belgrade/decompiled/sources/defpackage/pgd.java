package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import com.yandex.go.navigation.compose.modal.ComposeAdapterModalView;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public abstract class pgd extends h55 {
    public ComposeAdapterModalView D;
    public final chd E;

    public pgd(int i) {
        super(null);
        this.E = new chd();
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        cms n8aVar;
        r0 c = bvf0.c(tz20.a);
        wz20 wz20Var = new wz20(c);
        lyc lycVar = new lyc(3, this);
        wfd P = P();
        chd chdVar = this.E;
        zfd a = P.a(obj, chdVar);
        oe4 oe4Var = a.b;
        if (jl40.l(oe4Var, me4.a)) {
            n8aVar = null;
        } else if (oe4Var instanceof ne4) {
            n8aVar = ((ne4) oe4Var).a;
        } else {
            if (!(oe4Var instanceof le4)) {
                w511.b();
                return;
            }
            n8aVar = new n8a(29, oe4Var, lycVar);
        }
        hgd hgdVar = new hgd(Q());
        zw20 zw20Var = new zw20();
        chdVar.d = true;
        Map map = chdVar.c;
        f22 f22Var = new f22(5);
        a7u0 a7u0Var = n1m0.a;
        m1m0 m1m0Var = new m1m0(map, f22Var);
        chdVar.b = m1m0Var;
        chdVar.c = null;
        ComposeAdapterModalView composeAdapterModalView = new ComposeAdapterModalView(Q(), new a(-2017325131, new et0(n8aVar, wz20Var, lycVar, hgdVar, zw20Var, m1m0Var, a, 5), true), c, zw20Var, R());
        this.D = composeAdapterModalView;
        S().s(composeAdapterModalView, T());
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        boolean z = this.z;
        chd chdVar = this.E;
        chdVar.d = false;
        if (z) {
            chdVar.a = null;
            chdVar.c = null;
        } else {
            m1m0 m1m0Var = chdVar.b;
            chdVar.c = m1m0Var != null ? m1m0Var.a() : null;
        }
        chdVar.b = null;
        ComposeAdapterModalView composeAdapterModalView = this.D;
        if (composeAdapterModalView != null) {
            this.D = null;
            S().l(composeAdapterModalView);
        }
    }

    public abstract wfd P();

    public abstract Context Q();

    public String R() {
        return "#none#";
    }

    public abstract w030 S();

    public boolean T() {
        return !(this instanceof k01);
    }

    public pgd() {
        this(0);
    }
}
