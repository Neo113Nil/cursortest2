package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.navigator.map_interactions.experiment.a;
import com.yandex.go.taxi.experiments.i;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchFragment;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.e;

/* loaded from: classes5.dex */
public final class mvy implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ mvy(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static mvy a(eqh eqhVar) {
        return new mvy(eqhVar, 7);
    }

    public static mvy b(eqh eqhVar) {
        return new mvy(eqhVar, 8);
    }

    public static mvy c(eqh eqhVar) {
        return new mvy(eqhVar, 18);
    }

    public static tc9 d(tw51 tw51Var) {
        u2g u2gVar = new u2g(tw51Var, 27);
        jl00 jl00Var = new jl00(u2gVar, 6);
        j3g j3gVar = new j3g(tw51Var, 5);
        int i = 2;
        wvq wvqVar = new wvq((v7p) new jl00(new j3g(tw51Var, 2), i), (xvf0) new u2g(tw51Var, 24), (xvf0) jp10.a, (xvf0) new u2g(tw51Var, 25), (xvf0) new u2g(tw51Var, 22), (xvf0) new j3g(tw51Var, 4), 18, (byte) 0);
        int i2 = 0;
        ip10 ip10Var = new ip10(wvqVar, i2);
        u2g u2gVar2 = new u2g(tw51Var, 23);
        j3g j3gVar2 = new j3g(tw51Var, 0);
        j3g j3gVar3 = new j3g(tw51Var, 1);
        qo10 qo10Var = new qo10(j3gVar3, 1);
        return new tc9(new sp10(), ImmutableMap.i(MerchantOffersFragment.class, new x0z(new gc((Object) jl00Var, (xvf0) u2gVar, (xvf0) j3gVar, (xvf0) ip10Var, (xvf0) u2gVar2, (xvf0) j3gVar2, (xvf0) qo10Var, (xvf0) new jl00(new u2g(tw51Var, 21), 3), (xvf0) new qo10(j3gVar3, i2), 24), new qo10(j3gVar3, i), qo10Var, new u2g(tw51Var, 29), 10), MerchantOffersTestSearchFragment.class, new jl00(new e3u((xvf0) u2gVar2, (xvf0) ip10Var, (xvf0) sq10.a, 26, (byte) 0), 5), MerchantOffersSearchFragment.class, new jl00(new prq(new u2g(tw51Var, 26), new ip10(wvqVar, 1), new u2g(tw51Var, 28), new j3g(tw51Var, 3), j3gVar3, 24), 4)));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new u8w((pho) xvf0Var.get());
            case 1:
                return new d6i((rqo) xvf0Var.get(), 1);
            case 2:
                return new e((d) xvf0Var.get());
            case 3:
                return new u8w((pho) xvf0Var.get());
            case 4:
                return new ekz((y5i) xvf0Var.get());
            case 5:
                return new kpz((com.yandex.go.lootbox.impl.domain.interactors.animation.e) xvf0Var.get());
            case 6:
                return new jqz((com.yandex.go.lootbox.impl.domain.interactors.animation.e) xvf0Var.get());
            case 7:
                return new e400((pho) xvf0Var.get());
            case 8:
                return new pj((pho) xvf0Var.get());
            case 9:
                return new ac00(i5m.a(xvf0Var));
            case 10:
                return new ce00((zuj0) xvf0Var.get());
            case 11:
                Lifecycle lifecycle = ((MapFragment) xvf0Var.get()).getLifecycle();
                q5z.i(lifecycle);
                return lifecycle;
            case 12:
                return new a((rqo) xvf0Var.get());
            case 13:
                return new pj((pho) xvf0Var.get());
            case 14:
                return new i((rqo) xvf0Var.get());
            case 15:
                return new cz00((h010) xvf0Var.get());
            case 16:
                return new ez00((l110) xvf0Var.get());
            case 17:
                return new ru.yandex.taxi.masstransit.main.flex.a((y210) xvf0Var.get());
            case 18:
                return new n310((pho) xvf0Var.get());
            case 19:
                return new u310((n310) xvf0Var.get());
            case 20:
                return new c410((n310) xvf0Var.get());
            case 21:
                return new i610((s6d0) xvf0Var.get());
            case 22:
                return new w810((wiq0) xvf0Var.get());
            case 23:
                return new com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data.a((Transfer2Api) xvf0Var.get());
            case 24:
                return new com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.a((Transfer2Api) xvf0Var.get());
            case 25:
                return new com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a((Transfer2Api) xvf0Var.get());
            case 26:
                return new oi10((z22) xvf0Var.get());
            case 27:
                return new xi10((Context) xvf0Var.get());
            case 28:
                return new com.ybsdk.screens.menu.domain.a((com.ybsdk.common.repositiories.menu.a) xvf0Var.get());
            default:
                return d((tw51) xvf0Var.get());
        }
    }
}
