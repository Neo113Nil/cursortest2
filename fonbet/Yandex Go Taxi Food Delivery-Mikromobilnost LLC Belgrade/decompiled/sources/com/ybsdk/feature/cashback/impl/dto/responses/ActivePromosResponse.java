package com.ybsdk.feature.cashback.impl.dto.responses;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/dto/responses/ActivePromosResponse;", "", "title", "", "promos", "", "Lcom/ybsdk/feature/cashback/impl/dto/responses/ActiveCashbackPromoResponse;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPromos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActivePromosResponse {
    private final List<ActiveCashbackPromoResponse> promos;
    private final String title;

    public ActivePromosResponse(@Json(name = "title") String str, @Json(name = "promos") List<ActiveCashbackPromoResponse> list) {
        this.title = str;
        this.promos = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivePromosResponse copy$default(ActivePromosResponse activePromosResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePromosResponse.title;
        }
        if ((i & 2) != 0) {
            list = activePromosResponse.promos;
        }
        return activePromosResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ActiveCashbackPromoResponse> component2() {
        return this.promos;
    }

    public final ActivePromosResponse copy(@Json(name = "title") String title, @Json(name = "promos") List<ActiveCashbackPromoResponse> promos) {
        return new ActivePromosResponse(title, promos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivePromosResponse)) {
            return false;
        }
        ActivePromosResponse activePromosResponse = (ActivePromosResponse) other;
        return jl40.l(this.title, activePromosResponse.title) && jl40.l(this.promos, activePromosResponse.promos);
    }

    public final List<ActiveCashbackPromoResponse> getPromos() {
        return this.promos;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.promos.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nnm.h("ActivePromosResponse(title=", this.title, ", promos=", Extension.C_BRAKE, this.promos);
    }
}
