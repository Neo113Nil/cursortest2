package defpackage;

import android.app.Activity;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.navigator.user_placemark.c;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.domain.chat.h;
import com.yandex.messaging.internal.authorized.chat.b;
import com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsFragment;
import com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit.DivTransactionInfoFragment;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2CrossBorderApi;
import com.ybsdk.network.Api;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.communications.data.a;

/* loaded from: classes14.dex */
public final class ibz0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ ibz0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        mh20 mh20Var = mh20.a;
        int i2 = 0;
        int i3 = 1;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new hbz0((Activity) xvf0Var2.get(), (fdz0) xvf0Var.get());
            case 1:
                return tga1.e((lqo) xvf0Var2.get()) ? (nh20) xvf0Var.get() : mh20Var;
            case 2:
                return ((lqo) xvf0Var2.get()).a(tz10.o) ? (nh20) xvf0Var.get() : mh20Var;
            case 3:
                return new kcz0((a) xvf0Var2.get(), (ipf0) xvf0Var.get());
            case 4:
                return new zqz0((i130) xvf0Var2.get(), (nqz0) xvf0Var.get());
            case 5:
                return new ltz0((zuj0) xvf0Var.get(), (viv0) xvf0Var2.get());
            case 6:
                return new com.ybsdk.screens.notice.data.a((Api) xvf0Var2.get(), (com.ybsdk.common.repositiories.agreements.a) xvf0Var.get());
            case 7:
                return new v301((pav) xvf0Var2.get(), xvf0Var);
            case 8:
                return new j801((Set) xvf0Var2.get(), (d2q0) xvf0Var.get());
            case 9:
                return new kcz0((erq) xvf0Var2.get(), (sf01) xvf0Var.get());
            case 10:
                se01 se01Var = (se01) xvf0Var2.get();
                tw51 tw51Var = (tw51) xvf0Var.get();
                obg obgVar = se01Var.c;
                eg01 eg01Var = new eg01(tw51Var);
                obgVar.getClass();
                obg obgVar2 = obgVar.a;
                qcz0 qcz0Var = new qcz0(obgVar2.g, 12);
                int i4 = 3;
                fg01 fg01Var = new fg01(eg01Var, i4);
                fg01 fg01Var2 = new fg01(eg01Var, i2);
                ag01 ag01Var = zf01.a;
                v8c0 v8c0Var = new v8c0(n3w.a(new dg01(new hwo0(qcz0Var, fg01Var, fg01Var2, new qcz0(ag01Var, 13), 25))), 28);
                int i5 = 25;
                kk kkVar = new kk(n3w.a(new pjl(new jdj(obgVar2.g, fg01Var2, fg01Var, i4))), i5);
                xvf0 xvf0Var3 = obgVar2.m;
                nbg nbgVar = obgVar2.e;
                nbg nbgVar2 = obgVar2.n;
                qx5 qx5Var = new qx5(n3w.a(new of01(new w040(new y101(xvf0Var3, nbgVar, nbgVar2, i3), new fg01(eg01Var, i3), fg01Var, new fg01(eg01Var, 2), nbgVar2, obgVar2.o, new ibz0(obgVar2.p, nbgVar, 9), nbgVar))), obgVar2.o, i5);
                LinkedHashMap A = gtq0.A(3);
                A.put(TransactionsFragment.class, v8c0Var);
                A.put(DivTransactionInfoFragment.class, kkVar);
                A.put(TransactionsFeedFragment.class, qx5Var);
                vf01 vf01Var = (vf01) i5m.b(new ubq0((xvf0) ag01Var, (xvf0) obgVar2.b, (xvf0) obgVar2.d, (xvf0) obgVar2.e, (xvf0) idp0.a, (v7p) obgVar2.f, (xvf0) new br00(A), 15)).get();
                q5z.i(vf01Var);
                return vf01Var;
            case 11:
                return new com.ybsdk.feature.transfer.version2.internal.data.a((Transfer2CrossBorderApi) xvf0Var2.get(), (Transfer2Api) xvf0Var.get());
            case 12:
                return new ki50(i3, (zuj0) xvf0Var2.get(), (dqe0) xvf0Var.get());
            case 13:
                return new s411((o) xvf0Var2.get(), (p411) xvf0Var.get());
            case 14:
                return new j511((d860) xvf0Var2.get(), (FlexAdapter) xvf0Var.get(), i2);
            case 15:
                return new kcz0((d860) xvf0Var2.get(), (FlexAdapter) xvf0Var.get());
            case 16:
                return new j511((d860) xvf0Var2.get(), (FlexAdapter) xvf0Var.get(), i3);
            case 17:
                return new ru.yandex.taxi.combo.interactor.a((ysg) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 18:
                return new a201(11, (g) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 19:
                return new s421((zuj0) xvf0Var2.get(), (ore) xvf0Var.get());
            case 20:
                return new h((kse) xvf0Var.get(), (b) xvf0Var2.get());
            case 21:
                return new com.yandex.messaging.internal.urlpreview.b((to3) xvf0Var2.get(), (kse) xvf0Var.get());
            case 22:
                return new c((rqo) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 23:
                return new a201((on2) xvf0Var2.get(), (p1v) xvf0Var.get());
            case 24:
                return new rh31((e1g) xvf0Var2.get(), (wev0) xvf0Var.get());
            case 25:
                return new jk31((ck31) xvf0Var2.get(), (arv0) xvf0Var.get());
            case 26:
                return new a201(26, (b741) xvf0Var2.get(), (w041) xvf0Var.get());
            case 27:
                return new g941((vif) xvf0Var2.get(), (DefaultEnvironment) xvf0Var.get());
            case 28:
                return new v470((mg41) xvf0Var2.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), 4);
            default:
                return new c051((kse) xvf0Var2.get(), i5m.a(xvf0Var));
        }
    }

    public /* synthetic */ ibz0(pcz0 pcz0Var, h420 h420Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = h420Var;
        this.c = xvf0Var;
    }
}
