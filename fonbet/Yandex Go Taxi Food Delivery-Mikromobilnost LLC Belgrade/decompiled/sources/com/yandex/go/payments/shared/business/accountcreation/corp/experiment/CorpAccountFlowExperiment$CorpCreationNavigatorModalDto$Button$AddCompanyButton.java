package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/p;", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton extends p {
    public static final i Companion = new i();
    public final String a;
    public final String b;

    public CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    @Override // com.yandex.go.payments.shared.business.accountcreation.corp.experiment.p
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // com.yandex.go.payments.shared.business.accountcreation.corp.experiment.p
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public CorpAccountFlowExperiment$CorpCreationNavigatorModalDto$Button$AddCompanyButton() {
        this.a = "";
        this.b = null;
    }
}
