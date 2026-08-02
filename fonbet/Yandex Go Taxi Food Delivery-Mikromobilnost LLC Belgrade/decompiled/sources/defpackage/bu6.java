package defpackage;

import com.yandex.go.zone.dto.objects.a3;
import com.yandex.go.zone.dto.objects.e3;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;
import ru.yandex.taxi.orderpopup.ui.a;

/* loaded from: classes6.dex */
public final class bu6 implements f9e0, sdq0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ bu6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sdq0
    public void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((sls) obj).invoke();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                bbq0 bbq0Var = (bbq0) obj;
                n6u n6uVar = bbq0Var.c;
                n530 n530Var = n6uVar.c;
                kr krVar = bbq0Var.d.d;
                pxl pxlVar = n6uVar.b;
                Map f = b.f();
                if (krVar != null) {
                    n530Var.b(krVar, pxlVar, f);
                }
                ((waq0) this.c).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.f9e0
    public void b(int i, long j) {
        a aVar = (a) this.b;
        ((eu6) aVar.Dg()).le(e3.INSTANCE);
        ((eu6) aVar.Dg()).close();
        aVar.Ng("confirm");
        aVar.Mg(Integer.valueOf(i), Long.valueOf(j), "slider", "order_sent");
    }

    @Override // defpackage.f9e0
    public void c(d8e0 d8e0Var) {
        a aVar = (a) this.b;
        if (d8e0Var instanceof u7e0) {
            u7e0 u7e0Var = (u7e0) d8e0Var;
            aVar.Mg(null, null, "tap", u7e0Var.e);
            a3 a3Var = u7e0Var.g;
            if (a3Var instanceof e3) {
                ((eu6) aVar.Dg()).le(a3Var);
                ((eu6) aVar.Dg()).close();
                aVar.Ng("confirm");
            } else {
                ((eu6) aVar.Dg()).t3(a3Var);
                ((eu6) aVar.Dg()).close();
                aVar.Ng("confirm");
            }
        }
    }

    @Override // defpackage.f9e0
    public void d() {
        a aVar = (a) this.b;
        if (aVar.x == OrderPopupAnalytics$Screen.SUMMARY) {
            aVar.B.a("tap", "none", null, null, aVar.A.c);
        }
    }

    @Override // defpackage.f9e0
    public void e() {
        ((a) this.b).Ng("slide_out");
    }

    @Override // defpackage.f9e0
    public void f(int i, long j) {
        ((a) this.b).Mg(Integer.valueOf(i), Long.valueOf(j), "slider", "none");
    }

    @Override // defpackage.f9e0
    public void g() {
        ((a) this.b).Ng("tap_outside");
    }

    @Override // defpackage.sdq0
    public void h() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                ((sls) obj).invoke();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                bbq0 bbq0Var = (bbq0) this.b;
                n6u n6uVar = bbq0Var.c;
                n530 n530Var = n6uVar.c;
                kr krVar = bbq0Var.d.c;
                pxl pxlVar = n6uVar.b;
                Map f = b.f();
                if (krVar != null) {
                    n530Var.b(krVar, pxlVar, f);
                }
                ((waq0) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.f9e0
    public void onAttachedToWindow() {
        ((a) this.b).Lg((fu6) this.c);
    }

    @Override // defpackage.f9e0
    public void onBackPressed() {
        ((a) this.b).Ng("back_button");
    }

    @Override // defpackage.f9e0
    public void onDetachedFromWindow() {
        ((a) this.b).Cg();
        zk7 zk7Var = ((fu6) this.c).b;
        if (zk7Var != null) {
            zk7Var.a(e3.INSTANCE);
        }
    }
}
