package defpackage;

import android.content.Context;
import com.yandex.go.walking.navigation.impl.location_mock.simulator.a;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;
import java.util.UUID;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.widgets.data.api.WidgetsApi;
import ru.yandex.taxi.widgets.data.repository.t;
import ru.yandex.taxi.widgets.data.repository.widget_models.c;

/* loaded from: classes8.dex */
public final class d441 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public d441(qt41 qt41Var, n3w n3wVar) {
        this.a = 21;
        this.b = n3wVar;
    }

    public static j551 a(wcg wcgVar) {
        tt2 tt2Var = wcgVar.a.c;
        q5z.h(tt2Var);
        return new j551(tt2Var, (xvr0) wcgVar.m.get(), (t) wcgVar.l.get(), (c) wcgVar.n.get());
    }

    @Override // defpackage.yvf0
    public final Object get() {
        a6d0 a6d0Var;
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((el00) xvf0Var.get());
            case 1:
                return new sof0(i2, (b) xvf0Var.get());
            case 2:
                return new m641((r) xvf0Var.get());
            case 3:
                return new b741((pho) xvf0Var.get());
            case 4:
                return new y841((zuj0) xvf0Var.get());
            case 5:
                return new gf41(i5m.a(xvf0Var));
            case 6:
                return new vf41((an41) xvf0Var.get());
            case 7:
                return new ih01((pho) xvf0Var.get());
            case 8:
                c2d0 c2d0Var = (c2d0) xvf0Var.get();
                try {
                    a6d0Var = new a6d0(c2d0Var.a);
                } catch (Exception unused) {
                    jst.e.getClass();
                    a6d0Var = null;
                }
                return new akd(scc.g(new l5z0(), new a3u0(UUID.randomUUID().toString(), c2d0Var.k, new uyi(4, a6d0Var))));
            case 9:
                return i4d0.a((i4d0) xvf0Var.get());
            case 10:
                return new com.yandex.plus.glide.b((Context) xvf0Var.get());
            case 11:
                ru.yandex.taxi.cashback.sdk.t tVar = (ru.yandex.taxi.cashback.sdk.t) xvf0Var.get();
                zia0 zia0Var = new zia0();
                zia0Var.c = tVar.e;
                mhd0 mhd0Var = zia0Var.a;
                zia0.a(mhd0Var, "themeProvider");
                n4u0 n4u0Var = zia0Var.c;
                zia0.a(n4u0Var, "themeFlow");
                return new ofa0(mhd0Var, (e5o) zia0Var.b, n4u0Var, (xyj) zia0Var.d).w();
            case 12:
                return pl41.a((tj21) xvf0Var.get());
            case 13:
                return new t61((pho) xvf0Var.get());
            case 14:
                return new dm41((pho) xvf0Var.get());
            case 15:
                return new an41((zm41) xvf0Var.get());
            case 16:
                return new uw7((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get(), 3);
            case 17:
                return new gq41((lx4) xvf0Var.get());
            case 18:
                return new iq41((rqo) xvf0Var.get());
            case 19:
                return new izs(i2, xvf0Var);
            case 20:
                return new or41((zm41) xvf0Var.get());
            case 21:
                return new pt41((dnp0) xvf0Var.get());
            case 22:
                return new k051((nnx0) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.widgets.data.datasources.api.a((WidgetsApi) xvf0Var.get());
            case 24:
                return new y451((eex) xvf0Var.get());
            case 25:
                d551 d551Var = (d551) xvf0Var.get();
                d551Var.getClass();
                return new wcg(d551Var);
            case 26:
                q551 q551Var = (q551) ((wcg) xvf0Var.get()).o.get();
                q5z.i(q551Var);
                return q551Var;
            case 27:
                return new l551((wcg) xvf0Var.get());
            case 28:
                xvr0 xvr0Var = (xvr0) ((wcg) xvf0Var.get()).m.get();
                q5z.i(xvr0Var);
                return xvr0Var;
            default:
                return a((wcg) xvf0Var.get());
        }
    }

    public /* synthetic */ d441(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
