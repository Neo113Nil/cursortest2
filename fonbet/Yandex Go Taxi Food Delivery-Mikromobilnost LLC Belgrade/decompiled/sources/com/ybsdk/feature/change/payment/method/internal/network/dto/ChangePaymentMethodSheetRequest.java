package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003Jw\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/ChangePaymentMethodSheetRequest;", "", "scenario", "", "isFirstLaunch", "", "selectedPaymentMethodId", "agreementId", "newCardTrustId", "successActions", "", "failActions", "cancelActions", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getScenario", "()Ljava/lang/String;", "()Z", "getSelectedPaymentMethodId", "getAgreementId", "getNewCardTrustId", "getSuccessActions", "()Ljava/util/List;", "getFailActions", "getCancelActions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePaymentMethodSheetRequest {
    private final String agreementId;
    private final List<String> cancelActions;
    private final List<String> failActions;
    private final boolean isFirstLaunch;
    private final String newCardTrustId;
    private final String scenario;
    private final String selectedPaymentMethodId;
    private final List<String> successActions;

    public ChangePaymentMethodSheetRequest(@Json(name = "scenario") String str, @Json(name = "is_first_launch") boolean z, @Json(name = "selected_payment_method_id") String str2, @Json(name = "agreement_id") String str3, @Json(name = "new_card_trust_id") String str4, @Json(name = "success_actions") List<String> list, @Json(name = "fail_actions") List<String> list2, @Json(name = "cancel_actions") List<String> list3) {
        this.scenario = str;
        this.isFirstLaunch = z;
        this.selectedPaymentMethodId = str2;
        this.agreementId = str3;
        this.newCardTrustId = str4;
        this.successActions = list;
        this.failActions = list2;
        this.cancelActions = list3;
    }

    public static /* synthetic */ ChangePaymentMethodSheetRequest copy$default(ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest, String str, boolean z, String str2, String str3, String str4, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePaymentMethodSheetRequest.scenario;
        }
        if ((i & 2) != 0) {
            z = changePaymentMethodSheetRequest.isFirstLaunch;
        }
        if ((i & 4) != 0) {
            str2 = changePaymentMethodSheetRequest.selectedPaymentMethodId;
        }
        if ((i & 8) != 0) {
            str3 = changePaymentMethodSheetRequest.agreementId;
        }
        if ((i & 16) != 0) {
            str4 = changePaymentMethodSheetRequest.newCardTrustId;
        }
        if ((i & 32) != 0) {
            list = changePaymentMethodSheetRequest.successActions;
        }
        if ((i & 64) != 0) {
            list2 = changePaymentMethodSheetRequest.failActions;
        }
        if ((i & 128) != 0) {
            list3 = changePaymentMethodSheetRequest.cancelActions;
        }
        List list4 = list2;
        List list5 = list3;
        String str5 = str4;
        List list6 = list;
        return changePaymentMethodSheetRequest.copy(str, z, str2, str3, str5, list6, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFirstLaunch() {
        return this.isFirstLaunch;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNewCardTrustId() {
        return this.newCardTrustId;
    }

    public final List<String> component6() {
        return this.successActions;
    }

    public final List<String> component7() {
        return this.failActions;
    }

    public final List<String> component8() {
        return this.cancelActions;
    }

    public final ChangePaymentMethodSheetRequest copy(@Json(name = "scenario") String scenario, @Json(name = "is_first_launch") boolean isFirstLaunch, @Json(name = "selected_payment_method_id") String selectedPaymentMethodId, @Json(name = "agreement_id") String agreementId, @Json(name = "new_card_trust_id") String newCardTrustId, @Json(name = "success_actions") List<String> successActions, @Json(name = "fail_actions") List<String> failActions, @Json(name = "cancel_actions") List<String> cancelActions) {
        return new ChangePaymentMethodSheetRequest(scenario, isFirstLaunch, selectedPaymentMethodId, agreementId, newCardTrustId, successActions, failActions, cancelActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePaymentMethodSheetRequest)) {
            return false;
        }
        ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest = (ChangePaymentMethodSheetRequest) other;
        return jl40.l(this.scenario, changePaymentMethodSheetRequest.scenario) && this.isFirstLaunch == changePaymentMethodSheetRequest.isFirstLaunch && jl40.l(this.selectedPaymentMethodId, changePaymentMethodSheetRequest.selectedPaymentMethodId) && jl40.l(this.agreementId, changePaymentMethodSheetRequest.agreementId) && jl40.l(this.newCardTrustId, changePaymentMethodSheetRequest.newCardTrustId) && jl40.l(this.successActions, changePaymentMethodSheetRequest.successActions) && jl40.l(this.failActions, changePaymentMethodSheetRequest.failActions) && jl40.l(this.cancelActions, changePaymentMethodSheetRequest.cancelActions);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final List<String> getCancelActions() {
        return this.cancelActions;
    }

    public final List<String> getFailActions() {
        return this.failActions;
    }

    public final String getNewCardTrustId() {
        return this.newCardTrustId;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSelectedPaymentMethodId() {
        return this.selectedPaymentMethodId;
    }

    public final List<String> getSuccessActions() {
        return this.successActions;
    }

    public int hashCode() {
        int e = unr0.e(this.scenario.hashCode() * 31, 31, this.isFirstLaunch);
        String str = this.selectedPaymentMethodId;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agreementId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.newCardTrustId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.successActions;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.failActions;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.cancelActions;
        return hashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean isFirstLaunch() {
        return this.isFirstLaunch;
    }

    public String toString() {
        String str = this.scenario;
        boolean z = this.isFirstLaunch;
        String str2 = this.selectedPaymentMethodId;
        String str3 = this.agreementId;
        String str4 = this.newCardTrustId;
        List<String> list = this.successActions;
        List<String> list2 = this.failActions;
        List<String> list3 = this.cancelActions;
        StringBuilder l = oo31.l("ChangePaymentMethodSheetRequest(scenario=", str, ", isFirstLaunch=", ", selectedPaymentMethodId=", z);
        g8e.D(l, str2, ", agreementId=", str3, ", newCardTrustId=");
        tse0.x(str4, ", successActions=", ", failActions=", l, list);
        return vfc.p(l, list2, ", cancelActions=", list3, Extension.C_BRAKE);
    }

    public /* synthetic */ ChangePaymentMethodSheetRequest(String str, boolean z, String str2, String str3, String str4, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, list, list2, list3);
    }
}
