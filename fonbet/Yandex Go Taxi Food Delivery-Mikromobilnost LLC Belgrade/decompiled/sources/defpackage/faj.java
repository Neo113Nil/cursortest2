package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.data.config.impl.internal.a;
import com.yandex.go.due_timetable.data.api.ScheduledOrderSeatsAvailableApi;
import com.yandex.go.places.experiments.gallery.b;
import com.yandex.payment.divkit.usecases.j;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.f;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes5.dex */
public final class faj implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ faj(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new eaj((a) xvf0Var.get());
            case 1:
                return new bbj((Context) xvf0Var.get());
            case 2:
                return new dfj((Activity) xvf0Var.get());
            case 3:
                return new com.ybsdk.feature.savings.internal.data.a((SavingsApi) xvf0Var.get());
            case 4:
                return new cu1((rqo) xvf0Var.get(), 1);
            case 5:
                return new cgc0((po80) xvf0Var.get());
            case 6:
                return new xgc0((itp0) xvf0Var.get());
            case 7:
                return new yzh((hsj) xvf0Var.get());
            case 8:
                return new b((rqo) xvf0Var.get());
            case 9:
                return new gly0();
            case 10:
                return new zch((ah00) xvf0Var.get());
            case 11:
                return new com.ybsdk.screens.divbottomsheet.a((DivBottomSheetApi) xvf0Var.get());
            case 12:
                return new q6k((bw) xvf0Var.get());
            case 13:
                return (bw) xvf0Var.get();
            case 14:
                return (bw) xvf0Var.get();
            case 15:
                return (unf) xvf0Var.get();
            case 16:
                return (unf) xvf0Var.get();
            case 17:
                return new wtf((j) xvf0Var.get());
            case 18:
                return (iu31) xvf0Var.get();
            case 19:
                return (iu31) xvf0Var.get();
            case 20:
                return new q60((Activity) xvf0Var.get());
            case 21:
                return new mml((wxk) xvf0Var.get());
            case 22:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.a((q8s) xvf0Var.get());
            case 23:
                return new f42((AppAnalyticsReporter) xvf0Var.get(), 6);
            case 24:
                return new yim((sim) xvf0Var.get());
            case 25:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ScheduledOrderSeatsAvailableApi scheduledOrderSeatsAvailableApi = (ScheduledOrderSeatsAvailableApi) on2Var.a(GoApiName.TaxiV4, ScheduledOrderSeatsAvailableApi.class);
                q5z.i(scheduledOrderSeatsAvailableApi);
                return scheduledOrderSeatsAvailableApi;
            case 26:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.a((vs) xvf0Var.get());
            case 27:
                return new e((klb0) xvf0Var.get());
            case 28:
                return new vyc((e1q0) xvf0Var.get());
            default:
                return new f((tts0) xvf0Var.get());
        }
    }

    public /* synthetic */ faj(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
