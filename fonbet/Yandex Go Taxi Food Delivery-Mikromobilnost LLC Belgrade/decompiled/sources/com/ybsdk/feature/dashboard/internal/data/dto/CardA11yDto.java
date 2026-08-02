package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CardA11yDto;", "", "balance", "", "<init>", "(Ljava/lang/String;)V", "getBalance", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardA11yDto {
    private final String balance;

    public CardA11yDto(@Json(name = "balance") String str) {
        this.balance = str;
    }

    public static /* synthetic */ CardA11yDto copy$default(CardA11yDto cardA11yDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardA11yDto.balance;
        }
        return cardA11yDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    public final CardA11yDto copy(@Json(name = "balance") String balance) {
        return new CardA11yDto(balance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardA11yDto) && jl40.l(this.balance, ((CardA11yDto) other).balance);
    }

    public final String getBalance() {
        return this.balance;
    }

    public int hashCode() {
        String str = this.balance;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("CardA11yDto(balance=", this.balance, Extension.C_BRAKE);
    }
}
