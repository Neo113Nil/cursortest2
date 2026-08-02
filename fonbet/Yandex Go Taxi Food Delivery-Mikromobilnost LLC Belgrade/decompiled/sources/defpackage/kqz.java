package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import com.yandex.go.lottie_loader.data.repositories.b;
import com.yandex.go.lottie_loader.data.repositories.c;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.safety.center.lost_item.modal.mapper.a;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes.dex */
public final class kqz implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ kqz(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                e s = xpb1.s((t2g) xvf0Var.get());
                q5z.i(s);
                return s;
            case 1:
                jpz t = xpb1.t((t2g) xvf0Var.get());
                q5z.i(t);
                return t;
            case 2:
                return xpb1.v((t2g) xvf0Var.get());
            case 3:
                iqz w = xpb1.w((t2g) xvf0Var.get());
                q5z.i(w);
                return w;
            case 4:
                qqz x = xpb1.x((t2g) xvf0Var.get());
                q5z.i(x);
                return x;
            case 5:
                return new lrz((xdf) xvf0Var.get());
            case 6:
                return new a((ru.yandex.taxi.widget.utils.e) xvf0Var.get());
            case 7:
                return new wrz((lx4) xvf0Var.get());
            case 8:
                return new b((dne0) xvf0Var.get());
            case 9:
                return new c((dne0) xvf0Var.get());
            case 10:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                LoyaltyApi loyaltyApi = (LoyaltyApi) on2Var.a(GoApiName.TaxiV4, LoyaltyApi.class);
                q5z.i(loyaltyApi);
                return loyaltyApi;
            case 11:
                return new gp50(24, (nxz) xvf0Var.get());
            case 12:
                return new u8w((pho) xvf0Var.get());
            case 13:
                return new jvz((rqo) xvf0Var.get());
            case 14:
                return new ufm(1, (x1f0) xvf0Var.get());
            case 15:
                return new bn9((k7x0) xvf0Var.get());
            case 16:
                return new qyz((ryz) xvf0Var.get());
            case 17:
                return new b200((rqo) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.maas.impl.ride.c((arv0) xvf0Var.get());
            case 19:
                return new au50(19, (dqe0) xvf0Var.get());
            case 20:
                return new y300((hcs) xvf0Var.get());
            case 21:
                View view = ((a400) xvf0Var.get()).f;
                int i2 = g6h0.map;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                ViewStub viewStub = (ViewStub) ((View) rp31.d(view, i2));
                q5z.i(viewStub);
                return viewStub;
            case 22:
                View view2 = ((a400) xvf0Var.get()).f;
                int i3 = g6h0.source_pin;
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                View view3 = (View) rp31.d(view2, i3);
                q5z.i(view3);
                return view3;
            case 23:
                o500 o500Var = ((a400) xvf0Var.get()).d;
                q5z.i(o500Var);
                return o500Var;
            case 24:
                NotificationStackComponent notificationStackComponent = ((a400) xvf0Var.get()).c;
                q5z.i(notificationStackComponent);
                return notificationStackComponent;
            case 25:
                NotificationStackComponent notificationStackComponent2 = ((a400) xvf0Var.get()).b;
                q5z.i(notificationStackComponent2);
                return notificationStackComponent2;
            case 26:
                ru.yandex.taxi.statebar.a aVar = ((a400) xvf0Var.get()).e;
                q5z.i(aVar);
                return aVar;
            case 27:
                return d400.a((ah00) xvf0Var.get());
            case 28:
                return new o61((pho) xvf0Var.get());
            default:
                return new u8w((pho) xvf0Var.get());
        }
    }
}
