package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.blockeduser.BlockedUserModalView;
import com.yandex.go.blockeduser.data.c;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.plus.sdk.catching_up_cashback.a;
import ru.yandex.taxi.plus.sdk.plus_subs_promo.PlusSubsPromoModalView;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes6.dex */
public final class a46 extends m230 {
    public final /* synthetic */ int E = 1;
    public final w030 F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public Object N;

    public a46(w030 w030Var, f46 f46Var, x36 x36Var, yvf0 yvf0Var, jj3 jj3Var, gf41 gf41Var, h3y h3yVar, MapNotificationsMuteRepository mapNotificationsMuteRepository, yvf0 yvf0Var2) {
        super(null);
        this.F = w030Var;
        this.H = f46Var;
        this.I = x36Var;
        this.G = yvf0Var;
        this.K = jj3Var;
        this.L = gf41Var;
        this.M = h3yVar;
        this.N = mapNotificationsMuteRepository;
        this.J = yvf0Var2;
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        int i = this.E;
        Object obj2 = this.M;
        switch (i) {
            case 1:
                v5c0 v5c0Var = (v5c0) this.N;
                if (v5c0Var != null) {
                    ((PlusSubsPromoModalView) v5c0Var.b).dismissWithAction(null);
                }
                this.N = null;
                ((oqd0) this.K).a();
                ((ney) obj2).d(this);
                break;
            case 2:
                String str = ((u770) obj).a;
                v5c0 v5c0Var2 = (v5c0) this.N;
                if (v5c0Var2 != null) {
                    ((PlusSubsPromoModalView) v5c0Var2.b).dismissWithAction(null);
                }
                this.N = null;
                ((oqd0) this.J).a();
                ((ney) obj2).d(this);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        Object obj2 = this.M;
        int i2 = 6;
        Object obj3 = this.H;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                y36 y36Var = new y36(this);
                cxq0 cxq0Var = ((f46) obj3).a;
                return new BlockedUserModalView((Context) ((x36) obj4).a.a.get(), new e46(y36Var, (c) ((xvf0) cxq0Var.b).get(), (h) ((xvf0) cxq0Var.c).get(), (l46) ((ee) cxq0Var.w).get(), (b1) ((fn5) cxq0Var.x).get()));
            case 1:
                h59 h59Var = (h59) obj;
                cnp0 cnp0Var = (cnp0) obj4;
                ComponentActivity componentActivity = (ComponentActivity) obj3;
                Lifecycle lifecycle = componentActivity.getLifecycle();
                String str = h59Var.a;
                String str2 = h59Var.b;
                boolean c = ((pwy0) this.J).getThemeType().c();
                c29 c29Var = new c29(2, this);
                d59 d59Var = new d59(this, 0);
                u2d0 u2d0Var = cnp0Var.a;
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(componentActivity, c ? x1i0.Component_Dark : x1i0.Component_Light);
                x2d0 x2d0Var = u2d0Var.c;
                a aVar = new a(x2d0Var.b, cnp0Var.c);
                c59 c59Var = new c59(str, x2d0Var.d, 0);
                PlusSubsPromoModalView plusSubsPromoModalView = new PlusSubsPromoModalView(contextThemeWrapper, new omd0(c29Var, aVar, u2d0Var.i, new io11(c29Var), c59Var, (jmo) u2d0Var.o.getValue()), ((ujd0) cnp0Var.b.j.getValue()).a(contextThemeWrapper, lifecycle, str, str2, c59Var, d59Var), u2d0Var.f);
                v5c0 v5c0Var = new v5c0(6, plusSubsPromoModalView);
                plusSubsPromoModalView.setExtraModalContainer((ViewGroup) componentActivity.findViewById(xhh0.top_modal_views_container));
                dn7 dn7Var = new dn7(20, this);
                plusSubsPromoModalView.setOnBackPressedListener(dn7Var);
                plusSubsPromoModalView.setOnTouchOutsideListener(dn7Var);
                ((ney) obj2).b(this, new vb3(3, this));
                this.N = v5c0Var;
                return plusSubsPromoModalView;
            default:
                String str3 = ((u770) obj).a;
                spp0 spp0Var = (spp0) obj4;
                ComponentActivity componentActivity2 = (ComponentActivity) obj3;
                Lifecycle lifecycle2 = componentActivity2.getLifecycle();
                boolean c2 = ((pwy0) this.G).getThemeType().c();
                aq80 aq80Var = new aq80(this);
                d59 d59Var2 = new d59(this, 1);
                u2d0 u2d0Var2 = spp0Var.a;
                ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(componentActivity2, c2 ? x1i0.Component_Dark : x1i0.Component_Light);
                x2d0 x2d0Var2 = u2d0Var2.c;
                ru.yandex.taxi.plus.sdk.plusburns.a aVar2 = new ru.yandex.taxi.plus.sdk.plusburns.a(x2d0Var2.b, spp0Var.c);
                c59 c59Var2 = new c59(str3, x2d0Var2.d, 1);
                PlusSubsPromoModalView plusSubsPromoModalView2 = new PlusSubsPromoModalView(contextThemeWrapper2, new omd0(aq80Var, aVar2, u2d0Var2.i, new io11(aq80Var), c59Var2, (jmo) u2d0Var2.o.getValue()), ((ujd0) spp0Var.b.j.getValue()).a(contextThemeWrapper2, lifecycle2, str3, null, c59Var2, d59Var2), u2d0Var2.f);
                v5c0 v5c0Var2 = new v5c0(i2, plusSubsPromoModalView2);
                plusSubsPromoModalView2.setExtraModalContainer((ViewGroup) componentActivity2.findViewById(xhh0.top_modal_views_container));
                wnb0 wnb0Var = new wnb0(10, this);
                plusSubsPromoModalView2.setOnBackPressedListener(wnb0Var);
                plusSubsPromoModalView2.setOnTouchOutsideListener(wnb0Var);
                ((ney) obj2).b(this, new vb3(9, this));
                this.N = v5c0Var2;
                return plusSubsPromoModalView2;
        }
    }

    public a46(w030 w030Var, ComponentActivity componentActivity, cnp0 cnp0Var, pwy0 pwy0Var, oqd0 oqd0Var, s3d0 s3d0Var, yvf0 yvf0Var, ney neyVar) {
        super(null);
        this.F = w030Var;
        this.H = componentActivity;
        this.I = cnp0Var;
        this.J = pwy0Var;
        this.K = oqd0Var;
        this.L = s3d0Var;
        this.G = yvf0Var;
        this.M = neyVar;
    }

    public a46(w030 w030Var, ComponentActivity componentActivity, spp0 spp0Var, pwy0 pwy0Var, oqd0 oqd0Var, s3d0 s3d0Var, e8b0 e8b0Var, ney neyVar) {
        super(null);
        this.F = w030Var;
        this.H = componentActivity;
        this.I = spp0Var;
        this.G = pwy0Var;
        this.J = oqd0Var;
        this.K = s3d0Var;
        this.L = e8b0Var;
        this.M = neyVar;
    }
}
