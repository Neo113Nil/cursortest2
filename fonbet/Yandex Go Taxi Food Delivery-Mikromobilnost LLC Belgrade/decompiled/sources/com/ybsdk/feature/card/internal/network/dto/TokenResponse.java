package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.card.api.entities.CardTokenType;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/TokenResponse;", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "", "tokenId", "type", "Lcom/ybsdk/feature/card/api/entities/CardTokenType;", "suffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/api/entities/CardTokenType;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTokenId", "getType", "()Lcom/ybsdk/feature/card/api/entities/CardTokenType;", "getSuffix", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenResponse {
    private final String suffix;
    private final String token;
    private final String tokenId;
    private final CardTokenType type;

    public TokenResponse(@Json(name = "token") String str, @Json(name = "token_id") String str2, @Json(name = "type") CardTokenType cardTokenType, @Json(name = "suffix") String str3) {
        this.token = str;
        this.tokenId = str2;
        this.type = cardTokenType;
        this.suffix = str3;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, String str, String str2, CardTokenType cardTokenType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenResponse.token;
        }
        if ((i & 2) != 0) {
            str2 = tokenResponse.tokenId;
        }
        if ((i & 4) != 0) {
            cardTokenType = tokenResponse.type;
        }
        if ((i & 8) != 0) {
            str3 = tokenResponse.suffix;
        }
        return tokenResponse.copy(str, str2, cardTokenType, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* renamed from: component3, reason: from getter */
    public final CardTokenType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    public final TokenResponse copy(@Json(name = "token") String token, @Json(name = "token_id") String tokenId, @Json(name = "type") CardTokenType type, @Json(name = "suffix") String suffix) {
        return new TokenResponse(token, tokenId, type, suffix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) other;
        return jl40.l(this.token, tokenResponse.token) && jl40.l(this.tokenId, tokenResponse.tokenId) && this.type == tokenResponse.type && jl40.l(this.suffix, tokenResponse.suffix);
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final CardTokenType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.suffix.hashCode() + ((this.type.hashCode() + unr0.b(this.token.hashCode() * 31, 31, this.tokenId)) * 31);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.tokenId;
        CardTokenType cardTokenType = this.type;
        String str3 = this.suffix;
        StringBuilder v = b64.v("TokenResponse(token=", str, ", tokenId=", str2, ", type=");
        v.append(cardTokenType);
        v.append(", suffix=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
