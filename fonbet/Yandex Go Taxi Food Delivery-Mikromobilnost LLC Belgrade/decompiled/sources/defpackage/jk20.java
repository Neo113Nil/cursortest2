package defpackage;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import kotlin.collections.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class jk20 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r4.Z != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MobilityHubSourceAction a(za31 za31Var) {
        String str;
        if (za31Var != null) {
            oa31 oa31Var = za31Var.a;
            mi31 mi31Var = za31Var.c;
            pex0 pex0Var = mi31Var != null ? mi31Var.a : null;
            boolean z = true;
            switch (ik20.a[oa31Var.c.ordinal()]) {
                case 1:
                    if (z) {
                        return MobilityHubSourceAction.OPENED_FROM_TAXI_VERTICAL;
                    }
                    break;
                case 2:
                    if (pex0Var == null) {
                        VerticalTariffDto verticalTariffDto = (VerticalTariffDto) a.R(oa31Var.f);
                        if (verticalTariffDto != null && (str = verticalTariffDto.a) != null) {
                            z = true ^ str.equals(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
                            if (z) {
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    } else {
                        if (!jl40.l(pex0Var.b, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                            TariffOrderFlow tariffOrderFlow = pex0Var.u0;
                            if (tariffOrderFlow != TariffOrderFlow.DRIVE_FLOW) {
                                if (pex0Var.Y == null) {
                                    if (tariffOrderFlow != TariffOrderFlow.DELIVERY_FLOW) {
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    z = false;
                    if (z) {
                    }
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return null;
    }
}
