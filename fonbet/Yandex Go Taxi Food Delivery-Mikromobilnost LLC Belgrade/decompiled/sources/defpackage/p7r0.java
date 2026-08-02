package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.payments.shared.business.b1;
import com.yandex.go.sharing_personal_goals.data.mapper.a;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import com.yandex.go.user_profile.fullscreen.models.l;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.shadow.ShadowWrapperImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes10.dex */
public final class p7r0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ p7r0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 3;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new cug((pho) xvf0Var.get());
            case 1:
                return new jc4((pho) xvf0Var.get());
            case 2:
                return new rx2((pho) xvf0Var.get());
            case 3:
                return new zf((pho) xvf0Var.get());
            case 4:
                return new q7r0((pho) xvf0Var.get());
            case 5:
                return new r7r0((pho) xvf0Var.get());
            case 6:
                return new ydr0((l) xvf0Var.get());
            case 7:
                return new qfr0((rqo) xvf0Var.get());
            case 8:
                return new ShadowWrapperImpl((Context) xvf0Var.get());
            case 9:
                return new wyo0(i2, (Context) xvf0Var.get());
            case 10:
                return new o7r0((pho) xvf0Var.get());
            case 11:
                return new onr0((pho) xvf0Var.get());
            case 12:
                return new pnr0((pho) xvf0Var.get());
            case 13:
                return new qnr0((pho) xvf0Var.get());
            case 14:
                return new znr0((fga0) xvf0Var.get());
            case 15:
                return new cpr0((zuj0) xvf0Var.get());
            case 16:
                return new b1((cpr0) xvf0Var.get());
            case 17:
                SharedPreferences sharedPreferences = ((Context) xvf0Var.get()).getSharedPreferences("telemost_preferences", 0);
                q5z.i(sharedPreferences);
                return sharedPreferences;
            case 18:
                return new v0m0((ud0) xvf0Var.get(), 1);
            case 19:
                return new nqr0((oyq) xvf0Var.get());
            case 20:
                return new a((e) xvf0Var.get());
            case 21:
                return new wrr0((com.yandex.go.sharing_personal_goals.data.a) xvf0Var.get());
            case 22:
                return new d6i((rqo) xvf0Var.get(), 3);
            case 23:
                return new hay((Context) xvf0Var.get());
            case 24:
                return new w1s0((dne0) xvf0Var.get());
            case 25:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ShortcutsApi shortcutsApi = (ShortcutsApi) on2Var.a(GoApiName.TaxiV4, ShortcutsApi.class);
                q5z.i(shortcutsApi);
                return shortcutsApi;
            case 26:
                return new d2s0((rqo) xvf0Var.get());
            case 27:
                return new f2s0((sm40) xvf0Var.get());
            case 28:
                return new j2s0((Context) xvf0Var.get());
            default:
                return new o3s0((fva0) xvf0Var.get());
        }
    }
}
