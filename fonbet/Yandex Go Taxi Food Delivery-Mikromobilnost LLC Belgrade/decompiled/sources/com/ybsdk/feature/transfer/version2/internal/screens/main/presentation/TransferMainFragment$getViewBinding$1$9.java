package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferSuggestClickBehaviour;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import defpackage.em3;
import defpackage.g8e;
import defpackage.hwo0;
import defpackage.l0p;
import defpackage.mj01;
import defpackage.qj01;
import defpackage.qq7;
import defpackage.rl01;
import defpackage.uc5;
import defpackage.w511;
import defpackage.wk01;
import defpackage.wls;
import defpackage.xk01;
import defpackage.z94;
import defpackage.zk01;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransferMainFragment$getViewBinding$1$9 extends FunctionReferenceImpl implements wls {
    public TransferMainFragment$getViewBinding$1$9(uc5 uc5Var) {
        super(2, uc5Var, a.class, "onSuggestClick", "onSuggestClick(Ljava/math/BigDecimal;Lcom/ybsdk/widgets/common/SuggestView$State$Behaviour;)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BigDecimal add;
        TransferEvents$TransferSuggestClickBehaviour transferEvents$TransferSuggestClickBehaviour;
        BigDecimal bigDecimal = (BigDecimal) obj;
        SuggestView$State$Behaviour suggestView$State$Behaviour = (SuggestView$State$Behaviour) obj2;
        a aVar = (a) this.receiver;
        wk01 b = zk01.b((xk01) aVar.X());
        if (b != null) {
            String str = b.g.b;
            int i = rl01.g[suggestView$State$Behaviour.ordinal()];
            if (i == 1) {
                add = b.d.add(bigDecimal);
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                add = bigDecimal;
            }
            qj01 qj01Var = aVar.V;
            AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
            String plainString = bigDecimal.toPlainString();
            if (suggestView$State$Behaviour != SuggestView$State$Behaviour.PLUS) {
                plainString = null;
            }
            int i2 = mj01.c[qj01Var.e.ordinal()];
            if (i2 == 1) {
                em3 em3Var = appAnalyticsReporter.q0;
                int i3 = mj01.e[suggestView$State$Behaviour.ordinal()];
                if (i3 == 1) {
                    transferEvents$TransferSuggestClickBehaviour = TransferEvents$TransferSuggestClickBehaviour.PLUS;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    transferEvents$TransferSuggestClickBehaviour = TransferEvents$TransferSuggestClickBehaviour.REPLACE;
                }
                String str2 = qj01Var.b;
                String str3 = qj01Var.c;
                String str4 = qj01Var.d;
                LinkedHashMap w = g8e.w(6, CreateApplicationWithProductJsonAdapter.productKey, str);
                w.put("behaviour", transferEvents$TransferSuggestClickBehaviour.getOriginalValue());
                if (plainString != null) {
                    w.put("amount", plainString);
                }
                w.put("transfer_session_id", str2);
                if (str3 != null) {
                    w.put("transfer_direction", str3);
                }
                if (str4 != null) {
                    w.put("transfer_scenario", str4);
                }
                em3Var.a.a("transfer.suggest_click", w);
            } else if (i2 == 2) {
                qq7 qq7Var = appAnalyticsReporter.L;
                if (plainString == null) {
                    plainString = "";
                }
                qq7Var.a.a("payment.mobile_services.payment_suggests_click", g8e.w(1, "amount", plainString));
            } else if (i2 == 3) {
                l0p l0pVar = appAnalyticsReporter.E;
                if (plainString == null) {
                    plainString = "";
                }
                l0pVar.a.a("payment.internet_tv.payment_suggests_click", g8e.w(1, "amount", plainString));
            } else if (i2 != 4) {
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                hwo0 hwo0Var = qj01Var.f;
                if (hwo0Var != null) {
                    if (plainString == null) {
                        plainString = "";
                    }
                    z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                    TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                    String str5 = (String) hwo0Var.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                    linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                    linkedHashMap.put("amount", plainString);
                    linkedHashMap.put("scenario_hash", str5);
                    z94Var.a.a("template_transfer.suggests_click", linkedHashMap);
                }
            }
            aVar.n0(add.toPlainString());
        }
        return zy11.a;
    }
}
