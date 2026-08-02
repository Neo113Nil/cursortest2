package com.ybsdk.feature.cashback.impl.dto.requests;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/requests/MakeCashbackPromoDecisionRequest;", "", "agreementId", "", "decisions", "", "Lcom/ybsdk/feature/cashback/impl/dto/requests/DecisionsRequest;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAgreementId", "()Ljava/lang/String;", "getDecisions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MakeCashbackPromoDecisionRequest {
    private final String agreementId;
    private final List<DecisionsRequest> decisions;

    public MakeCashbackPromoDecisionRequest(@Json(name = "agreement_id") String str, @Json(name = "decisions") List<DecisionsRequest> list) {
        this.agreementId = str;
        this.decisions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MakeCashbackPromoDecisionRequest copy$default(MakeCashbackPromoDecisionRequest makeCashbackPromoDecisionRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = makeCashbackPromoDecisionRequest.agreementId;
        }
        if ((i & 2) != 0) {
            list = makeCashbackPromoDecisionRequest.decisions;
        }
        return makeCashbackPromoDecisionRequest.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final List<DecisionsRequest> component2() {
        return this.decisions;
    }

    public final MakeCashbackPromoDecisionRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "decisions") List<DecisionsRequest> decisions) {
        return new MakeCashbackPromoDecisionRequest(agreementId, decisions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MakeCashbackPromoDecisionRequest)) {
            return false;
        }
        MakeCashbackPromoDecisionRequest makeCashbackPromoDecisionRequest = (MakeCashbackPromoDecisionRequest) other;
        return jl40.l(this.agreementId, makeCashbackPromoDecisionRequest.agreementId) && jl40.l(this.decisions, makeCashbackPromoDecisionRequest.decisions);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final List<DecisionsRequest> getDecisions() {
        return this.decisions;
    }

    public int hashCode() {
        return this.decisions.hashCode() + (this.agreementId.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("MakeCashbackPromoDecisionRequest(agreementId=", this.agreementId, ", decisions=", Extension.C_BRAKE, this.decisions);
    }
}
