package com.ybsdk.feature.credit.deposit.api;

import com.ybsdk.core.navigation.ScreenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/api/CreditScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "<init>", "()V", "agreementId", "", "getAgreementId", "()Ljava/lang/String;", "scenario", "getScenario", "Lcom/ybsdk/feature/credit/deposit/api/BoostDepositScreenParams;", "Lcom/ybsdk/feature/credit/deposit/api/CreditDepositScreenParams;", "Lcom/ybsdk/feature/credit/deposit/api/CreditLimitDepositScreenParams;", "Lcom/ybsdk/feature/credit/deposit/api/MkkDepositScreenParams;", "feature-credit-deposit-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CreditScreenParams implements ScreenParams {
    public /* synthetic */ CreditScreenParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getAgreementId();

    public abstract String getScenario();

    private CreditScreenParams() {
    }
}
