package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes14.dex */
public final class idv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jdv0 b;

    public /* synthetic */ idv0(jdv0 jdv0Var, int i) {
        this.a = i;
        this.b = jdv0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        mi31 mi31Var;
        Boolean bool;
        mi31 mi31Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jdv0 jdv0Var = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                biv0 biv0Var = jdv0Var.b;
                fwu0 fwu0Var = jdv0Var.i;
                SummaryStateTracker summaryStateTracker = jdv0Var.j;
                x4e.z(intValue, biv0Var.c, null);
                if (intValue == 3) {
                    summaryStateTracker.a.l(SummaryStateTracker.SolidSummaryState.EXPANDED);
                    fnx0 n = ((k) jdv0Var.e).n();
                    if (n != null && (mi31Var = n.a) != null) {
                        if (mi31Var.a.K0) {
                            mo40 mo40Var = jdv0Var.f;
                            String str = mi31Var.b;
                            lo40 lo40Var = mo40Var.a;
                            boolean z = lo40Var.a;
                            if (jl40.l(lo40Var.b, str)) {
                                lo40Var.a = false;
                                mo40Var.b.g(zy11Var);
                            }
                            if (z) {
                                jdv0Var.g.a(SavePersonalStateNotifier$SavePersonalStateReason.SUMMARY_BUTTON_EXPAND_CARD);
                            }
                        }
                        fwu0Var.getClass();
                        break;
                    }
                } else if (intValue == 6) {
                    summaryStateTracker.a.l(SummaryStateTracker.SolidSummaryState.COLLAPSED);
                    fwu0Var.getClass();
                    break;
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                int intValue2 = ((Number) pair.getFirst()).intValue();
                boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                ghd ghdVar = jdv0Var.a;
                sev0 sev0Var = jdv0Var.c;
                if (intValue2 == 3) {
                    bool = (Boolean) sev0Var.a.getValue();
                } else if (intValue2 != 6) {
                    sev0Var.getClass();
                    bool = null;
                } else {
                    bool = (Boolean) sev0Var.b.getValue();
                }
                if (bool != null && !bool.booleanValue()) {
                    if (intValue2 == 3) {
                        SummaryExpandReason summaryExpandReason = SummaryExpandReason.PULL;
                        if (summaryExpandReason == null) {
                            ghdVar.getClass();
                        } else {
                            ghdVar.a.d(summaryExpandReason);
                        }
                    } else if (intValue2 == 6) {
                        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.Pull;
                        e6t0 e6t0Var = ghdVar.a;
                        if (summaryAnalytics$SummaryCollapseReasonV2 != null) {
                            switch (fhd.a[summaryAnalytics$SummaryCollapseReasonV2.ordinal()]) {
                                case 1:
                                    e6t0Var.getClass();
                                    e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Pull);
                                    e6t0Var.b(summaryAnalytics$SummaryCollapseReasonV2);
                                    break;
                                case 2:
                                    e6t0Var.getClass();
                                    e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Tap);
                                    e6t0Var.b(summaryAnalytics$SummaryCollapseReasonV2);
                                    break;
                                case 3:
                                    e6t0Var.getClass();
                                    e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.BackButton);
                                    e6t0Var.b(summaryAnalytics$SummaryCollapseReasonV2);
                                    break;
                                case 4:
                                    e6t0Var.getClass();
                                    e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.OutCard);
                                    e6t0Var.b(summaryAnalytics$SummaryCollapseReasonV2);
                                    break;
                                case 5:
                                case 6:
                                    e6t0Var.b(summaryAnalytics$SummaryCollapseReasonV2);
                                    break;
                                default:
                                    w511.b();
                                    break;
                            }
                        }
                    }
                }
                if (booleanValue) {
                    if (intValue2 == 3) {
                        r0 r0Var = sev0Var.a;
                        Boolean bool2 = Boolean.FALSE;
                        r0Var.getClass();
                        r0Var.m(null, bool2);
                        break;
                    } else if (intValue2 == 6) {
                        r0 r0Var2 = sev0Var.b;
                        Boolean bool3 = Boolean.FALSE;
                        r0Var2.getClass();
                        r0Var2.m(null, bool3);
                        break;
                    } else {
                        sev0Var.getClass();
                        break;
                    }
                }
                break;
            default:
                fnx0 n2 = ((k) jdv0Var.e).n();
                if (n2 != null && (mi31Var2 = n2.a) != null) {
                    pex0 pex0Var = mi31Var2.a;
                    if (pex0Var.K0) {
                        is60 is60Var = pex0Var.J0.b;
                        fco fcoVar = jdv0Var.h;
                        String a = is60Var.a();
                        r0 r0Var3 = fcoVar.a;
                        r0Var3.getClass();
                        r0Var3.m(null, a);
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
