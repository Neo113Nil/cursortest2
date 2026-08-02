package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardButtonResponse;", "", "title", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardButtonResponse {
    private final String action;
    private final String title;

    public CardButtonResponse(@Json(name = "title") String str, @Json(name = "action") String str2) {
        this.title = str;
        this.action = str2;
    }

    public static /* synthetic */ CardButtonResponse copy$default(CardButtonResponse cardButtonResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardButtonResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = cardButtonResponse.action;
        }
        return cardButtonResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final CardButtonResponse copy(@Json(name = "title") String title, @Json(name = "action") String action) {
        return new CardButtonResponse(title, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardButtonResponse)) {
            return false;
        }
        CardButtonResponse cardButtonResponse = (CardButtonResponse) other;
        return jl40.l(this.title, cardButtonResponse.title) && jl40.l(this.action, cardButtonResponse.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("CardButtonResponse(title=", this.title, ", action=", this.action, Extension.C_BRAKE);
    }
}
