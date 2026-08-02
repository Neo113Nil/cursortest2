package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/CardPromo;", "", "", "interactionsValue", "plasticPromoInteractionCount", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/ybsdk/rconfig/CardPromo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getInteractionsValue", "getPlasticPromoInteractionCount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CardPromo {

    @Json(name = "interactions_value")
    private final int interactionsValue;

    @Json(name = "plastic_promo_interaction_count")
    private final int plasticPromoInteractionCount;

    public /* synthetic */ CardPromo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 3 : i2);
    }

    public static /* synthetic */ CardPromo copy$default(CardPromo cardPromo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardPromo.interactionsValue;
        }
        if ((i3 & 2) != 0) {
            i2 = cardPromo.plasticPromoInteractionCount;
        }
        return cardPromo.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInteractionsValue() {
        return this.interactionsValue;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlasticPromoInteractionCount() {
        return this.plasticPromoInteractionCount;
    }

    public final CardPromo copy(int interactionsValue, int plasticPromoInteractionCount) {
        return new CardPromo(interactionsValue, plasticPromoInteractionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPromo)) {
            return false;
        }
        CardPromo cardPromo = (CardPromo) other;
        return this.interactionsValue == cardPromo.interactionsValue && this.plasticPromoInteractionCount == cardPromo.plasticPromoInteractionCount;
    }

    public final int getInteractionsValue() {
        return this.interactionsValue;
    }

    public final int getPlasticPromoInteractionCount() {
        return this.plasticPromoInteractionCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.plasticPromoInteractionCount) + (Integer.hashCode(this.interactionsValue) * 31);
    }

    public String toString() {
        return b64.d(this.interactionsValue, this.plasticPromoInteractionCount, "CardPromo(interactionsValue=", ", plasticPromoInteractionCount=", Extension.C_BRAKE);
    }

    public CardPromo(int i, int i2) {
        this.interactionsValue = i;
        this.plasticPromoInteractionCount = i2;
    }
}
