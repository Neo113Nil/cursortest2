package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedPromosResponse;", "", "title", "", "promos", "", "Lcom/ybsdk/feature/cashback/impl/dto/responses/SuggestedCashbackPromoResponse;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPromos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestedPromosResponse {
    private final List<SuggestedCashbackPromoResponse> promos;
    private final String title;

    public SuggestedPromosResponse(@Json(name = "title") String str, @Json(name = "promos") List<SuggestedCashbackPromoResponse> list) {
        this.title = str;
        this.promos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedPromosResponse copy$default(SuggestedPromosResponse suggestedPromosResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedPromosResponse.title;
        }
        if ((i & 2) != 0) {
            list = suggestedPromosResponse.promos;
        }
        return suggestedPromosResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SuggestedCashbackPromoResponse> component2() {
        return this.promos;
    }

    public final SuggestedPromosResponse copy(@Json(name = "title") String title, @Json(name = "promos") List<SuggestedCashbackPromoResponse> promos) {
        return new SuggestedPromosResponse(title, promos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedPromosResponse)) {
            return false;
        }
        SuggestedPromosResponse suggestedPromosResponse = (SuggestedPromosResponse) other;
        return jl40.l(this.title, suggestedPromosResponse.title) && jl40.l(this.promos, suggestedPromosResponse.promos);
    }

    public final List<SuggestedCashbackPromoResponse> getPromos() {
        return this.promos;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.promos.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("SuggestedPromosResponse(title=", this.title, ", promos=", Extension.C_BRAKE, this.promos);
    }
}
