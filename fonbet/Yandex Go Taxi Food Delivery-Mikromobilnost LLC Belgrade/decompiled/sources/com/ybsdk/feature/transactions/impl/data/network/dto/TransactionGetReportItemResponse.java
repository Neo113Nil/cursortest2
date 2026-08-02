package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionGetReportItemResponse;", "", "action", "", "title", "icon", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getAction", "()Ljava/lang/String;", "getTitle", "getIcon", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionGetReportItemResponse {
    private final String action;
    private final ThemedParameter<String> icon;
    private final String title;

    public TransactionGetReportItemResponse(@Json(name = "action") String str, @Json(name = "title") String str2, @Json(name = "icon") ThemedParameter<String> themedParameter) {
        this.action = str;
        this.title = str2;
        this.icon = themedParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionGetReportItemResponse copy$default(TransactionGetReportItemResponse transactionGetReportItemResponse, String str, String str2, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionGetReportItemResponse.action;
        }
        if ((i & 2) != 0) {
            str2 = transactionGetReportItemResponse.title;
        }
        if ((i & 4) != 0) {
            themedParameter = transactionGetReportItemResponse.icon;
        }
        return transactionGetReportItemResponse.copy(str, str2, themedParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ThemedParameter<String> component3() {
        return this.icon;
    }

    public final TransactionGetReportItemResponse copy(@Json(name = "action") String action, @Json(name = "title") String title, @Json(name = "icon") ThemedParameter<String> icon) {
        return new TransactionGetReportItemResponse(action, title, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionGetReportItemResponse)) {
            return false;
        }
        TransactionGetReportItemResponse transactionGetReportItemResponse = (TransactionGetReportItemResponse) other;
        return jl40.l(this.action, transactionGetReportItemResponse.action) && jl40.l(this.title, transactionGetReportItemResponse.title) && jl40.l(this.icon, transactionGetReportItemResponse.icon);
    }

    public final String getAction() {
        return this.action;
    }

    public final ThemedParameter<String> getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + unr0.b(this.action.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.title;
        ThemedParameter<String> themedParameter = this.icon;
        StringBuilder v = b64.v("TransactionGetReportItemResponse(action=", str, ", title=", str2, ", icon=");
        v.append(themedParameter);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
