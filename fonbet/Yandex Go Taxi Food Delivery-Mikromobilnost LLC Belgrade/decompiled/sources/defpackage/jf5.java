package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.analytics.realtime.service.batched.a;
import com.yandex.go.network_metrics.experiment.NetworkReportingExperiment;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.logistics.sdk.g;
import ru.yandex.taxi.plus.sdk.micro_widget.websdk.DisabledThemeSwitchingFrameLayout;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final /* synthetic */ class jf5 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jf5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                a aVar = (a) obj2;
                aVar.getClass();
                hst hstVar = jst.e;
                list.size();
                mei0 mei0Var = (mei0) kotlin.collections.a.R(list);
                Objects.toString(mei0Var != null ? mei0Var.toMap() : null);
                hstVar.getClass();
                ew2 ew2Var = aVar.b;
                IReporterYandex iReporterYandex = ((uv2) ew2Var.b).a;
                cxq0 cxq0Var = (cxq0) ew2Var.c;
                cxq0Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!((mei0) obj3).getPayload().isEmpty()) {
                        arrayList.add(obj3);
                    }
                }
                String Jg = ((h) cxq0Var.b).Jg();
                kj Ig = ((f0) cxq0Var.c).a.Ig();
                Long valueOf = Ig != null ? Long.valueOf(Ig.a) : null;
                String a = ((kb20) cxq0Var.w).a();
                nei0 nei0Var = (nei0) cxq0Var.x;
                Pair pair = new Pair("BufferId", UUID.randomUUID().toString());
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((mei0) it.next()).toMap());
                }
                Pair pair2 = new Pair("Buffer", arrayList2);
                Pair pair3 = new Pair("User", b.i(new Pair("PhonePdId", Jg), new Pair("YandexUid", valueOf), new Pair("DeviceId", a)));
                nei0Var.getClass();
                Map<String, Object> i2 = b.i(pair, pair2, pair3, new Pair("Platform", b.i(new Pair("PlatformName", "Android"), new Pair("ApplicationName", nei0Var.a), new Pair("AppVersion", nei0Var.b), new Pair("OSVersion", Build.VERSION.RELEASE))));
                iReporterYandex.reportDiagnosticEvent("InApp.Realtime.Buffered", i2);
                hst hstVar2 = jst.e;
                Objects.toString(i2);
                hstVar2.getClass();
                if (ew2Var.a) {
                    iReporterYandex.reportEvent("InApp.Realtime.Buffered", i2);
                    break;
                }
                break;
            case 1:
                ru.yandex.taxi.cashback.view.a aVar2 = (ru.yandex.taxi.cashback.view.a) obj2;
                aVar2.getClass();
                ViewGroup viewGroup = aVar2.b;
                int i3 = r49.a[((PlusSdkWidgetExperiment) obj).c.ordinal()];
                if (i3 == 1) {
                    q49 q49Var = new q49(aVar2);
                    aVar2.j.c(viewGroup);
                    q49Var.d(viewGroup);
                    aVar2.j = q49Var;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    p49 p49Var = new p49(aVar2);
                    aVar2.j.c(viewGroup);
                    if (p49Var.b == null) {
                        ru.yandex.taxi.cashback.view.a aVar3 = p49Var.c;
                        xrd0 xrd0Var = aVar3.e;
                        lb7 lb7Var = aVar3.g;
                        aa0 aa0Var = xrd0Var.a;
                        p49Var.b = new zrd0(viewGroup, (z3d0) aa0Var.a.get(), (c0) aa0Var.b.get(), (n5c) aa0Var.c.get(), (alc0) aa0Var.d.get(), (q2c) aa0Var.e.get(), (u2d0) aa0Var.f.get(), (ru.yandex.taxi.plus.sdk.badge.widget.a) aa0Var.g.get(), lb7Var, (tt2) aa0Var.h.get(), (x1f0) aa0Var.i.get(), (slq0) aa0Var.j.get());
                    }
                    zrd0 zrd0Var = p49Var.b;
                    PlaqueView plaqueView = zrd0Var != null ? zrd0Var.n : null;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    DisabledThemeSwitchingFrameLayout disabledThemeSwitchingFrameLayout = p49Var.a;
                    disabledThemeSwitchingFrameLayout.addView(plaqueView, layoutParams);
                    viewGroup.addView(disabledThemeSwitchingFrameLayout);
                    aVar2.j = p49Var;
                }
                break;
            case 2:
                rfi rfiVar = (rfi) obj;
                ky11 ky11Var = ((g) obj2).d;
                boolean z = rfiVar instanceof pfi;
                ny11 ny11Var = ny11.a;
                if (z) {
                    ky11Var.e(((pfi) rfiVar).a(), ny11Var);
                } else if (!(rfiVar instanceof qfi)) {
                    w511.b();
                    break;
                } else {
                    ky11Var.b(((qfi) rfiVar).a(), ny11Var);
                }
                break;
            case 3:
                ((gls) obj2).setDestinationInput((String) obj);
                break;
            case 4:
                break;
            case 5:
                ((flex.engine.a) obj2).k((kr) obj);
                break;
            case 6:
                com.yandex.go.network_metrics.experiment.a.a((com.yandex.go.network_metrics.experiment.a) obj2, (NetworkReportingExperiment) obj);
                break;
            case 7:
                urc0 urc0Var = (urc0) obj;
                com.yandex.plus.home.plaque.feature.internal.presentation.a aVar4 = (com.yandex.plus.home.plaque.feature.internal.presentation.a) obj2;
                pgz pgzVar = aVar4.b;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "PlaqueViewControllerImpl", "changeState(" + urc0Var + ')');
                }
                PlaqueView.show$default(aVar4.f, urc0Var.a, e3n.e(urc0Var.b), null, 4, null);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            case 8:
                Object emit = ((vpr) obj2).emit((hkc0) obj, continuation);
                if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                ((AtomicReference) obj2).set((myq0) obj);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            default:
                ((ajr) obj2).a.l((zir) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, (a) this.b, a.class, "commitAndSend", "commitAndSend(Ljava/util/List;)V", 4);
            case 1:
                return new AdaptedFunctionReference(2, (ru.yandex.taxi.cashback.view.a) this.b, ru.yandex.taxi.cashback.view.a.class, "updateExperiment", "updateExperiment(Lru/yandex/taxi/cashback/experiments/PlusSdkWidgetExperiment;)V", 4);
            case 2:
                return new AdaptedFunctionReference(2, (g) this.b, g.class, "handleOrderEvent", "handleOrderEvent(Lru/yandex/taxi/logistics/sdk/deliveries/api/source/domain/DeliveryOrderEvent;)V", 4);
            case 3:
                return new AdaptedFunctionReference(2, (gls) this.b, gls.class, "setDestinationInput", "setDestinationInput(Ljava/lang/String;)V", 4);
            case 4:
                return new FunctionReferenceImpl(2, (com.yandex.go.payments.superapp.a) this.b, com.yandex.go.payments.superapp.a.class, "handlePaymentChanges", "handlePaymentChanges(Lcom/yandex/go/payments/data/LpmPaymentChanges;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 5:
                return new AdaptedFunctionReference(2, (flex.engine.a) this.b, flex.engine.a.class, "dispatchAction", "dispatchAction(Lflex/core/model/Action;)V", 4);
            case 6:
                return new AdaptedFunctionReference(2, (com.yandex.go.network_metrics.experiment.a) this.b, com.yandex.go.network_metrics.experiment.a.class, "applyExperiment", "applyExperiment(Lcom/yandex/go/network_metrics/experiment/NetworkReportingExperiment;)V", 4);
            case 7:
                return new AdaptedFunctionReference(2, (com.yandex.plus.home.plaque.feature.internal.presentation.a) this.b, com.yandex.plus.home.plaque.feature.internal.presentation.a.class, "changeState", "changeState(Lcom/yandex/plus/home/plaque/feature/internal/presentation/PlaqueUiState;)V", 4);
            case 8:
                return new FunctionReferenceImpl(2, (vpr) this.b, vpr.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 9:
                return new AdaptedFunctionReference(2, (AtomicReference) this.b, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            default:
                return new AdaptedFunctionReference(2, (ajr) this.b, ajr.class, "updateGeoParams", "updateGeoParams(Lcom/yandex/go/flex/common/api/FlexGeoParams;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
