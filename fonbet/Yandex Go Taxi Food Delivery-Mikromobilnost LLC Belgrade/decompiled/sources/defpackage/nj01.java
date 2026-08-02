package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferAmountEditedScreen;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.TransferMainAnalyticsInteractor$Companion$LogType;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public final class nj01 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj01 b;

    public /* synthetic */ nj01(qj01 qj01Var, int i) {
        this.a = i;
        this.b = qj01Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qj01 qj01Var = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                kj01 kj01Var = (kj01) pair.getSecond();
                if (qj01Var.e != TransferMainAnalyticsInteractor$Companion$LogType.TEMPLATE) {
                    lj01 lj01Var = (lj01) qj01Var.j.getValue();
                    em3 em3Var = qj01Var.a.q0;
                    TransferEvents$TransferAmountEditedScreen transferEvents$TransferAmountEditedScreen = kj01Var.c;
                    String str2 = qj01Var.b;
                    String str3 = qj01Var.c;
                    String str4 = qj01Var.d;
                    String str5 = lj01Var != null ? lj01Var.a : null;
                    String str6 = lj01Var != null ? lj01Var.b : null;
                    String str7 = lj01Var != null ? lj01Var.c : null;
                    String str8 = lj01Var != null ? lj01Var.d : null;
                    LinkedHashMap w = g8e.w(9, "new_value", str);
                    w.put(MetaDataField.SCREEN_FIELD, transferEvents$TransferAmountEditedScreen.getOriginalValue());
                    w.put("transfer_session_id", str2);
                    if (str3 != null) {
                        w.put("transfer_direction", str3);
                    }
                    if (str4 != null) {
                        w.put("transfer_scenario", str4);
                    }
                    if (str5 != null) {
                        w.put("sending_amount", str5);
                    }
                    if (str6 != null) {
                        w.put("receiving_amount", str6);
                    }
                    if (str7 != null) {
                        w.put("currency_code", str7);
                    }
                    if (str8 != null) {
                        w.put("exchange_rate", str8);
                    }
                    em3Var.a.a("transfer.amount_edited", w);
                    break;
                } else {
                    hwo0 hwo0Var = qj01Var.f;
                    if (hwo0Var != null) {
                        String str9 = kj01Var.a;
                        z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                        String str10 = (String) hwo0Var.b;
                        String str11 = (String) hwo0Var.x;
                        if (str11 == null) {
                            str11 = "";
                        }
                        LinkedHashMap t = x4e.t(3, "scenario_hash", str10, "amount", str9);
                        t.put("item_type", str11);
                        z94Var.a.a("template_transfer.amount_change", t);
                        break;
                    }
                }
                break;
            case 1:
                unq unqVar = (unq) obj;
                int i2 = oj01.a[qj01Var.e.ordinal()];
                if (i2 == 1) {
                    em3 em3Var2 = qj01Var.a.q0;
                    String str12 = unqVar.a;
                    String str13 = qj01Var.b;
                    String str14 = qj01Var.c;
                    String str15 = qj01Var.d;
                    LinkedHashMap t2 = x4e.t(4, "text", str12, "transfer_session_id", str13);
                    if (str14 != null) {
                        t2.put("transfer_direction", str14);
                    }
                    if (str15 != null) {
                        t2.put("transfer_scenario", str15);
                    }
                    em3Var2.a.a("transfer.payment_amount_fee_info_shown", t2);
                    break;
                } else if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    w511.b();
                    break;
                }
                break;
            default:
                rvz0 rvz0Var = (rvz0) obj;
                TransferMainAnalyticsInteractor$Companion$LogType transferMainAnalyticsInteractor$Companion$LogType = qj01Var.e;
                AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
                int i3 = pj01.a[transferMainAnalyticsInteractor$Companion$LogType.ordinal()];
                if (i3 == 1) {
                    em3 em3Var3 = appAnalyticsReporter.q0;
                    String n = qj01.n(rvz0Var);
                    String str16 = qj01Var.b;
                    String str17 = qj01Var.c;
                    String str18 = qj01Var.d;
                    LinkedHashMap t3 = x4e.t(4, "text", n, "transfer_session_id", str16);
                    if (str17 != null) {
                        t3.put("transfer_direction", str17);
                    }
                    if (str18 != null) {
                        t3.put("transfer_scenario", str18);
                    }
                    em3Var3.a.a("transfer.payment_amount_tooltip_shown", t3);
                    break;
                } else if (i3 == 2) {
                    appAnalyticsReporter.L.a.a("payment.mobile_services.payment_amount_tooltip_shown", g8e.w(1, "text", qj01.n(rvz0Var)));
                    break;
                } else if (i3 == 3) {
                    appAnalyticsReporter.E.a.a("payment.internet_tv.payment_amount_tooltip_shown", g8e.w(1, "text", qj01.n(rvz0Var)));
                    break;
                } else if (i3 != 4) {
                    if (i3 != 5) {
                        w511.b();
                        break;
                    } else {
                        hwo0 hwo0Var2 = qj01Var.f;
                        if (hwo0Var2 != null) {
                            String n2 = qj01.n(rvz0Var);
                            z94 z94Var2 = ((AppAnalyticsReporter) hwo0Var2.c).n0;
                            TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var2.w;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                            linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                            linkedHashMap.put("text", n2);
                            z94Var2.a.a("template_transfer.amount_tooltip_shown", linkedHashMap);
                            break;
                        }
                    }
                }
                break;
        }
        return zy11Var;
    }
}
