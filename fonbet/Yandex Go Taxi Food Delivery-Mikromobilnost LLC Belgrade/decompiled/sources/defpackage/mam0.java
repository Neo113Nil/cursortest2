package defpackage;

import android.content.Context;
import com.yandex.go.due_timetable.domain.interactor.b;
import com.yandex.go.scooters.data.ScootersPaymentApi;
import com.yandex.go.scooters.passes.active.domain.d;
import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.passes.active.v3.g;
import com.yandex.go.scooters.photocontrol.data.ScootersPhotocontrolStatusApi;
import com.ybsdk.feature.savings.internal.mapper.a;
import com.ybsdk.feature.savings.internal.mapper.c;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.sbp.old.internal.screens.SbpOldFragment;
import java.util.LinkedHashMap;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.o;
import ru.yandex.taxi.scooters.domain.n;
import ru.yandex.taxi.scooters.domain.r;
import ru.yandex.taxi.scooters.utils.timers.h;

/* loaded from: classes13.dex */
public final class mam0 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public mam0(hio0 hio0Var, j7g j7gVar, l7g l7gVar) {
        this.a = 28;
        this.b = j7gVar;
        this.c = l7gVar;
    }

    public static hhm0 a(ihm0 ihm0Var, tw51 tw51Var) {
        int i = 21;
        jzi0 jzi0Var = new jzi0(i, new g7g(tw51Var, i));
        int i2 = 22;
        int i3 = 20;
        jzi0 jzi0Var2 = new jzi0(i3, new cta0(new jzi0(i2, jzi0Var), new g7g(tw51Var, i3), new g7g(tw51Var, 23), new g7g(tw51Var, 24), new g7g(tw51Var, i2), 28));
        LinkedHashMap A = gtq0.A(1);
        A.put(SbpOldFragment.class, jzi0Var2);
        hhm0 hhm0Var = (hhm0) i5m.b(new dsl(khm0.a, new br00(A), 5)).get();
        q5z.i(hhm0Var);
        return hhm0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new c((a) ((h69) obj).get(), (w530) ((g7g) xvf0Var).get());
            case 1:
                return new SavingsDashboardFragmentV2((ibm0) ((n3w) obj).a, (mdm0) ((g7g) xvf0Var).get());
            case 2:
                return new SavingsDashboardFragmentV4((mbm0) ((n3w) obj).a, (zon) ((k6g) xvf0Var).get());
            case 3:
                return new tcm0((adp0) ((g4m0) obj).get(), ((br00) xvf0Var).a);
            case 4:
                return a((ihm0) obj, (tw51) xvf0Var.get());
            case 5:
                return new zim0((ndl0) ((e7g) obj).get(), (dfm0) ((e7g) xvf0Var).get());
            case 6:
                return new b((tt2) ((xvf0) obj).get(), (com.yandex.go.due_timetable.data.repository.a) ((zmm0) xvf0Var).get());
            case 7:
                return new com.yandex.go.due_timetable.domain.interactor.impl.a((com.yandex.go.due_timetable.data.repository.impl.a) ((xvf0) obj).get(), (snm0) ((upk0) xvf0Var).get());
            case 8:
                return new rpm0((okv) ((y3g) obj).get(), (rm5) ((jzi0) xvf0Var).get());
            case 9:
                return new ru.yandex.taxi.scooters.domain.a((n) ((u6o0) obj).get(), (v7j0) xvf0Var.get());
            case 10:
                return new nqm0((ru.yandex.taxi.scooters.domain.b) ((xvf0) obj).get(), (jqm0) ((mam0) xvf0Var).get());
            case 11:
                return new com.yandex.go.scooters.passes.active.v3.freeze.c((f) ((elo0) obj).get(), (d) ((zxm0) xvf0Var).get());
            case 12:
                return new com.yandex.go.scooters.passes.active.v3.renew.disabling.c((f) ((elo0) obj).get(), (r) xvf0Var.get());
            case 13:
                return new g((yp2) ((e7g) obj).get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 14:
                return new com.yandex.go.scooters.passes.active.v3.winback.c((f) ((elo0) obj).get(), (com.yandex.go.scooters.passes.active.v3.winback.domain.a) ((zxm0) xvf0Var).get());
            case 15:
                return new com.yandex.go.scooters.domain.b((e) ((k7g) obj).get(), (com.yandex.go.scooters.domain.a) ((n0k0) xvf0Var).get());
            case 16:
                return new g8n0((Context) ((xvf0) obj).get(), (e8n0) ((qzm0) xvf0Var).get());
            case 17:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a((pwy0) ((xvf0) obj).get(), (d3a) ((qzm0) xvf0Var).get());
            case 18:
                return new com.yandex.go.scooters.debt.data.a((ScootersPaymentApi) ((m7g) obj).get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 19:
                return new thn0((i47) ((qzm0) obj).get(), (h) xvf0Var.get());
            case 20:
                return new ein0((tse) ((xvf0) obj).get(), (fin0) ((jag) xvf0Var).get());
            case 21:
                return new eln0((ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a) ((xvf0) obj).get(), (ru.yandex.taxi.scooters.presentation.feedback.data.a) ((s3f0) xvf0Var).get());
            case 22:
                return new ru.yandex.taxi.scooters.presentation.finish_info.b((o) ((s3f0) obj).get(), (eln0) xvf0Var.get());
            case 23:
                return new ru.yandex.taxi.scooters.data.mapper.e((com.yandex.go.scooters.payments.domain.b) ((m7g) obj).get(), (n6a0) ((k7g) xvf0Var).get());
            case 24:
                return new com.yandex.go.scooters.passes.data.mapper.a((ru.yandex.taxi.widget.utils.e) ((k7g) obj).get(), (ru.yandex.taxi.scooters.data.mapper.e) ((mam0) xvf0Var).get());
            case 25:
                return new com.yandex.go.scooters.passes.d(i5m.a((fmn) obj), (wco0) ((mbo0) xvf0Var).get());
            case 26:
                return new com.yandex.go.scooters.passes.data.a((com.yandex.go.scooters.passes.data.mapper.a) ((mam0) obj).get(), (com.yandex.go.scooters.passes.data.d) ((z8n0) xvf0Var).get());
            case 27:
                return new krl0((com.yandex.go.scooters.photocontrol.data.c) ((mdo0) obj).get(), (ijo0) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.photocontrol.data.b((ru.yandex.taxi.scooters.data.a) xvf0Var.get(), (ScootersPhotocontrolStatusApi) ((on2) ((j7g) obj).get()).a(GoApiName.TaxiV4, ScootersPhotocontrolStatusApi.class));
            default:
                return new rko0((f3p0) ((xvf0) obj).get(), (tdn0) ((l7g) xvf0Var).get());
        }
    }

    public /* synthetic */ mam0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }
}
