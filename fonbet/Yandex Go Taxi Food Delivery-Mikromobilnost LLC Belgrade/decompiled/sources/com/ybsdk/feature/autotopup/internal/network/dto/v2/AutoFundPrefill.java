package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundPrefill;", "", "limit", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getLimit", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundPrefill {
    private final Money limit;

    public /* synthetic */ AutoFundPrefill(Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money);
    }

    public static /* synthetic */ AutoFundPrefill copy$default(AutoFundPrefill autoFundPrefill, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            money = autoFundPrefill.limit;
        }
        return autoFundPrefill.copy(money);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getLimit() {
        return this.limit;
    }

    public final AutoFundPrefill copy(@Json(name = "limit") Money limit) {
        return new AutoFundPrefill(limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoFundPrefill) && jl40.l(this.limit, ((AutoFundPrefill) other).limit);
    }

    public final Money getLimit() {
        return this.limit;
    }

    public int hashCode() {
        Money money = this.limit;
        if (money == null) {
            return 0;
        }
        return money.hashCode();
    }

    public String toString() {
        return "AutoFundPrefill(limit=" + this.limit + Extension.C_BRAKE;
    }

    public AutoFundPrefill(@Json(name = "limit") Money money) {
        this.limit = money;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoFundPrefill() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
