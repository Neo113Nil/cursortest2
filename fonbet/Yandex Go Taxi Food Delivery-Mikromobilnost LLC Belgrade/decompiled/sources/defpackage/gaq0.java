package defpackage;

import com.yandex.go.morphlex.action.route_address.c;
import com.yandex.go.morphlex.action.select_due.b;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.favourites.a;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.settings.internal.network.SettingsApi;
import com.ybsdk.feature.split.deposit.internal.data.network.SplitDepositApi;
import com.ybsdk.feature.status.screen.internal.data.StatusScreenApi;
import com.ybsdk.feature.stories.internal.network.StoriesApi;

/* loaded from: classes12.dex */
public final class gaq0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ gaq0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static gaq0 a(z0s0 z0s0Var) {
        return new gaq0(z0s0Var, 15);
    }

    public static gaq0 b(l9t0 l9t0Var) {
        return new gaq0(l9t0Var, 16);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new faq0((pj) ((hbn) xvf0Var).get());
            case 1:
                return new lhq0((u1v) ((h3g) xvf0Var).get());
            case 2:
                return new pgk0(20, (z22) ((twf) xvf0Var).get());
            case 3:
                return new b1m0(1, (sr4) ((tl3) xvf0Var).get());
            case 4:
                return new ndl0(25, (j011) ((twf) xvf0Var).get());
            case 5:
                return new pgk0(24, (nw8) ((h1t) xvf0Var).get());
            case 6:
                return new b(i5m.a((zmm0) xvf0Var));
            case 7:
                return new c(i5m.a((gzn0) xvf0Var));
            case 8:
                return (SettingsApi) ((t0k0) ((g7g) xvf0Var).get()).b(SettingsApi.class);
            case 9:
                return new fkr0((sae) ((ywf) xvf0Var).get());
            case 10:
                String str = ((b6s0) ((wor0) ((ywf) xvf0Var).b).a).a;
                q5z.i(str);
                return str;
            case 11:
                return new a((gst) ((z0s0) xvf0Var).get());
            case 12:
                return new sgs0((wm8) ((owf) xvf0Var).get());
            case 13:
                return new wor0((fcj0) ((h0l0) xvf0Var).get());
            case 14:
                return new c8t0((s8t0) ((wjr0) xvf0Var).get());
            case 15:
                return new com.yandex.go.quark.soul.domain.a((g9t0) ((z0s0) xvf0Var).get());
            case 16:
                return new f9t0((l9t0) xvf0Var);
            case 17:
                return new com.yandex.go.address_confirmation.modal.a((ru.yandex.taxi.widget.c) ((aag) xvf0Var).get());
            case 18:
                return new wbt0((tit0) ((x0g) xvf0Var).get());
            case 19:
                return new tgt0((ei00) xvf0Var);
            case 20:
                return (SplitDepositApi) ((t0k0) ((o9g) xvf0Var).get()).b(SplitDepositApi.class);
            case 21:
                return new ytt0((w530) ((o9g) xvf0Var).get());
            case 22:
                return new com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.a((SplitDepositApi) ((gaq0) xvf0Var).get());
            case 23:
                return new lut0((wor0) ((o9g) xvf0Var).get());
            case 24:
                return new ru.yandex.taxi.single.a((ru.yandex.taxi.single.b) ((sit0) xvf0Var).get());
            case 25:
                return (StatusScreenApi) ((t0k0) ((o9g) xvf0Var).get()).b(StatusScreenApi.class);
            case 26:
                return new com.ybsdk.feature.status.screen.internal.data.c((StatusScreenApi) ((gaq0) xvf0Var).get());
            case 27:
                return new zbu0((m) ((h0l0) xvf0Var).get());
            case 28:
                return new com.ybsdk.feature.stories.internal.domain.a((com.ybsdk.feature.stories.internal.data.a) ((l9t0) xvf0Var).get());
            default:
                return (StoriesApi) ((t0k0) ((hag) xvf0Var).get()).b(StoriesApi.class);
        }
    }
}
