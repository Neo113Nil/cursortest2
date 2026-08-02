package defpackage;

import com.yandex.go.rida.bids.data.BidsApi;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.taxi.order.details.v2.state.elements.buttons.f;
import com.yandex.go.taxi.order.map.o;
import com.ybsdk.feature.main.internal.data.network.SbpAccountApi;
import com.ybsdk.feature.main.internal.data.network.c;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.data.b;
import com.ybsdk.feature.savings.internal.interactors.d;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.sbp.old.internal.network.SbpOldApi;
import com.ybsdk.feature.sbp.old.internal.screens.SbpOldFragment;
import ru.yandex.taxi.map_common.map.utils.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes14.dex */
public final class jzi0 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;

    public jzi0(qvl0 qvl0Var, e7g e7gVar) {
        this.a = 15;
        this.b = e7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new s9n((l7x0) ((l6g) obj).get());
            case 1:
                return new ljj0((dqe0) ((w0g) obj).get());
            case 2:
                return ((h580) ((jc50) obj).get()).a();
            case 3:
                return new coj0((gyc) ((r0g) obj).get());
            case 4:
                return new woj0((b8r) ((p6g) obj).get());
            case 5:
                BidsApi bidsApi = (BidsApi) ((on2) ((g6g) obj).get()).a(GoApiName.TaxiV4, BidsApi.class);
                q5z.i(bidsApi);
                return bidsApi;
            case 6:
                return new qck0((f) ((nt0) obj).get());
            case 7:
                return new xfk0((tbk0) ((zni0) obj).get());
            case 8:
                return new fok0((dne0) ((t6g) obj).get());
            case 9:
                return new ppk0((nt0) obj);
            case 10:
                return new o((a) ((u4g) obj).get());
            case 11:
                return new xtk0((a3v) ((ebg) obj).get());
            case 12:
                return new ij20((jwh) ((y6g) obj).get());
            case 13:
                w4l0 w4l0Var = (w4l0) ((aye0) obj).b;
                q5z.i(w4l0Var);
                return w4l0Var;
            case 14:
                SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) ((jbh) ((rqo) ((b7g) obj).get())).e(SafetyCenterExperiment.u).c();
                q5z.i(safetyCenterExperiment);
                return safetyCenterExperiment;
            case 15:
                return ((gf41) ((e7g) obj).get()).a();
            case 16:
                return new d((b) ((q150) obj).get());
            case 17:
                return new gbm0((cab0) ((g7g) obj).get());
            case 18:
                return (SavingsApi) ((t0k0) ((g7g) obj).get()).b(SavingsApi.class);
            case 19:
                return new c((SbpAccountApi) ((v400) obj).get());
            case 20:
                return new SbpOldFragment((cta0) obj);
            case 21:
                return (SbpOldApi) ((t0k0) ((g7g) obj).get()).b(SbpOldApi.class);
            case 22:
                return new com.ybsdk.feature.sbp.old.internal.data.a((SbpOldApi) ((jzi0) obj).get());
            case 23:
                return new SbpPartnersFragment((m580) obj);
            case 24:
                return new rm5((zuj0) ((b4g) obj).get(), 2);
            case 25:
                return new hxm0((com.yandex.go.scooters.domain.c) ((s3f0) obj).get());
            case 26:
                return new gzm0(0, (qx5) obj);
            case 27:
                return new ozm0((pzm0) ((qzm0) obj).get());
            case 28:
                return ((smp) ((j7g) obj).get()).a();
            default:
                ((f2i) obj).get();
                return new s1n0();
        }
    }

    public /* synthetic */ jzi0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
