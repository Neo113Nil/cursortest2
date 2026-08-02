package defpackage;

import com.yandex.go.due.api.analytics.model.DueAnalyticViewType;
import com.yandex.go.due_timetable.experiment.PreorderViewTypeExperiment;
import com.yandex.go.due_timetable.experiment.model.PriceHeightCalculationStrategyType;
import com.yandex.go.due_timetable.experiment.model.SettingsForTariffClass;
import com.yandex.go.due_timetable.experiment.model.TimetableViewTypeSettings;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes12.dex */
public final class l1n implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ l1n(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        if (r2 == null) goto L60;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        TimetableViewTypeSettings timetableViewTypeSettings;
        TimetableViewTypeSettings timetableViewTypeSettings2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        PriceHeightCalculationStrategyType priceHeightCalculationStrategyType = null;
        priceHeightCalculationStrategyType = null;
        priceHeightCalculationStrategyType = null;
        priceHeightCalculationStrategyType = null;
        switch (i) {
            case 0:
                unm0 unm0Var = (unm0) obj;
                n1n n1nVar = gVar.O;
                g1n g1nVar = gVar.y;
                pex0 m = ((k) n1nVar.b).m();
                if (m != null && (str = m.b) != null) {
                    SettingsForTariffClass settingsForTariffClass = (SettingsForTariffClass) ((PreorderViewTypeExperiment) n1nVar.a.a.b()).b.a.get(str);
                    if (g1nVar instanceof e1n) {
                        if (settingsForTariffClass != null && (timetableViewTypeSettings2 = settingsForTariffClass.b) != null) {
                            priceHeightCalculationStrategyType = timetableViewTypeSettings2.b;
                            break;
                        }
                    } else {
                        if (!(g1nVar instanceof f1n)) {
                            w511.b();
                            return null;
                        }
                        if (settingsForTariffClass != null && (timetableViewTypeSettings = settingsForTariffClass.a) != null) {
                            priceHeightCalculationStrategyType = timetableViewTypeSettings.b;
                            break;
                        }
                    }
                }
                priceHeightCalculationStrategyType = PriceHeightCalculationStrategyType.PER_DAY_WITH_ON_DEMAND_AS_MAX_VALUE;
                gVar.Ng(new vzm(unm0Var, priceHeightCalculationStrategyType));
                return zy11Var;
            case 1:
                e8z0 e8z0Var = (e8z0) obj;
                dvm dvmVar = gVar.M;
                if (e8z0Var instanceof c8z0) {
                    DueAnalyticViewType dueAnalyticViewType = DueAnalyticViewType.TIMETABLE;
                    bus0 bus0Var = ((c8z0) e8z0Var).a;
                    zts0 zts0Var = bus0Var instanceof zts0 ? (zts0) bus0Var : null;
                    dvmVar.d(dueAnalyticViewType, true, null, zts0Var != null ? Double.valueOf(zts0Var.b) : null);
                    return zy11Var;
                }
                if (!(e8z0Var instanceof b8z0)) {
                    if (e8z0Var instanceof d8z0) {
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                DueAnalyticViewType dueAnalyticViewType2 = DueAnalyticViewType.TIMETABLE;
                b8z0 b8z0Var = (b8z0) e8z0Var;
                Calendar calendar = b8z0Var.b;
                bus0 bus0Var2 = b8z0Var.a;
                zts0 zts0Var2 = bus0Var2 instanceof zts0 ? (zts0) bus0Var2 : null;
                dvmVar.d(dueAnalyticViewType2, false, calendar, zts0Var2 != null ? Double.valueOf(zts0Var2.b) : null);
                return zy11Var;
            default:
                int i2 = j1n.a[((PriceUpdate$PriceLoadingState) obj).ordinal()];
                if (i2 == 1) {
                    gVar.Og(cvm.b);
                    ((ej1) gVar.z.a).r(new urm(8));
                    return zy11Var;
                }
                if (i2 == 2 || i2 == 3) {
                    gVar.Og(cvm.w);
                    ((ej1) gVar.z.a).r(new qu(9));
                    return zy11Var;
                }
                if (i2 == 4) {
                    gVar.Ng(wzm.a);
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
