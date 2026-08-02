package defpackage;

import android.content.Context;
import com.yandex.go.urbanads.b;
import com.ybsdk.feature.accountdetails.internal.interactors.a;
import com.ybsdk.feature.accountdetails.internal.network.AccountDetailsApi;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.testpayment.internal.network.AutoPaymentsApi;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsFragment;

/* loaded from: classes5.dex */
public final class lk implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static lk a(c1 c1Var) {
        return new lk(15, c1Var);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new a((com.ybsdk.feature.accountdetails.internal.data.a) ((c1) obj).get());
            case 1:
                return (AccountDetailsApi) ((t0k0) ((gwf) obj).get()).b(AccountDetailsApi.class);
            case 2:
                return new ryh(10, (h0w) ((p4) obj).get());
            case 3:
                return new com.yandex.go.places.impl.ui.main.actions.video_queue.a((fk0) ((lk) obj).get());
            case 4:
                return new fk0((com.yandex.div.core.expression.variables.a) ((x4g) obj).get());
            case 5:
                return new ddf(8, (g191) ((c1) obj).get());
            case 6:
                return new dr0((sk7) ((f2b) obj).get());
            case 7:
                return new pj((pho) ((aag) obj).get());
            case 8:
                return new ds0((jwh) ((k2g) obj).get());
            case 9:
                return new bt0((z4s) ((dxf) obj).get());
            case 10:
                return new ru.yandex.taxi.logistics.sdk.address_details.impl.domain.a((dci) ((k2g) obj).get());
            case 11:
                rwp0 rwp0Var = (rwp0) ((ddf) obj).b;
                q5z.i(rwp0Var);
                return rwp0Var;
            case 12:
                return new cd1((b) ((hbg) obj).get(), 0);
            case 13:
                return new cd1((b) ((kyf) obj).get(), 1);
            case 14:
                return new b1((pho) ((xyf) obj).get());
            case 15:
                return new zp1((yp1) ((c1) obj).get());
            case 16:
                return new t42(i2, (ci70) ((dag) obj).get());
            case 17:
                return new iw2((co40) ((t160) obj).get());
            case 18:
                return new p33((Context) ((m1g) obj).get());
            case 19:
                return new pd3((b1) ((c1) obj).get());
            case 20:
                return new com.ybsdk.feature.testpayment.internal.data.a((AutoPaymentsApi) ((dhy0) obj).get());
            case 21:
                return new AutoPullsFragment((t4) obj);
            case 22:
                return new xv3((mf1) ((gwf) obj).get());
            case 23:
                return (AutoTopupApi) ((t0k0) ((gwf) obj).get()).b(AutoTopupApi.class);
            case 24:
                return new yw3((Context) ((o9g) obj).get());
            case 25:
                return new com.ybsdk.feature.autotopup.internal.data.a((AutoTopupApi) ((lk) obj).get());
            case 26:
                return new a24((Context) ((gwf) obj).get());
            case 27:
                return new com.ybsdk.feature.testpayment.internal.data.b((com.ybsdk.feature.testpayment.internal.network.AutoTopupApi) ((dhy0) obj).get());
            case 28:
                return new ru.yandex.taxi.map_common.map.a((el00) ((f4g) obj).get());
            default:
                return new lr4((jwh) ((w5g) obj).get());
        }
    }
}
