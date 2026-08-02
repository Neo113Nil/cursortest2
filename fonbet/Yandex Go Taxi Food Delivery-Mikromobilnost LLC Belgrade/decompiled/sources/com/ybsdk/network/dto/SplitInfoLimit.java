package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/network/dto/SplitInfoLimit;", "", "total", "Lcom/ybsdk/core/common/data/network/dto/Money;", "remaining", "hasActiveSplit", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;)V", "getTotal", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getRemaining", "getHasActiveSplit", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/Boolean;)Lcom/ybsdk/network/dto/SplitInfoLimit;", "equals", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitInfoLimit {
    private final Boolean hasActiveSplit;
    private final Money remaining;
    private final Money total;

    public SplitInfoLimit(@Json(name = "total") Money money, @Json(name = "remaining") Money money2, @Json(name = "has_active_split") Boolean bool) {
        this.total = money;
        this.remaining = money2;
        this.hasActiveSplit = bool;
    }

    public static /* synthetic */ SplitInfoLimit copy$default(SplitInfoLimit splitInfoLimit, Money money, Money money2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            money = splitInfoLimit.total;
        }
        if ((i & 2) != 0) {
            money2 = splitInfoLimit.remaining;
        }
        if ((i & 4) != 0) {
            bool = splitInfoLimit.hasActiveSplit;
        }
        return splitInfoLimit.copy(money, money2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getRemaining() {
        return this.remaining;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasActiveSplit() {
        return this.hasActiveSplit;
    }

    public final SplitInfoLimit copy(@Json(name = "total") Money total, @Json(name = "remaining") Money remaining, @Json(name = "has_active_split") Boolean hasActiveSplit) {
        return new SplitInfoLimit(total, remaining, hasActiveSplit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitInfoLimit)) {
            return false;
        }
        SplitInfoLimit splitInfoLimit = (SplitInfoLimit) other;
        return jl40.l(this.total, splitInfoLimit.total) && jl40.l(this.remaining, splitInfoLimit.remaining) && jl40.l(this.hasActiveSplit, splitInfoLimit.hasActiveSplit);
    }

    public final Boolean getHasActiveSplit() {
        return this.hasActiveSplit;
    }

    public final Money getRemaining() {
        return this.remaining;
    }

    public final Money getTotal() {
        return this.total;
    }

    public int hashCode() {
        int c = tse0.c(this.remaining, this.total.hashCode() * 31, 31);
        Boolean bool = this.hasActiveSplit;
        return c + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        Money money = this.total;
        Money money2 = this.remaining;
        Boolean bool = this.hasActiveSplit;
        StringBuilder sb = new StringBuilder("SplitInfoLimit(total=");
        sb.append(money);
        sb.append(", remaining=");
        sb.append(money2);
        sb.append(", hasActiveSplit=");
        return nzs.d(sb, bool, Extension.C_BRAKE);
    }
}
