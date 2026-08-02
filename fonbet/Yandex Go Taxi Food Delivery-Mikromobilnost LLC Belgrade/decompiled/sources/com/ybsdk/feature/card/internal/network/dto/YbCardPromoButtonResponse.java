package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoButtonResponse;", "", "title", "", "subtitle", "visible", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getVisible", "()Z", "getAction", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardPromoButtonResponse {
    private final String action;
    private final String subtitle;
    private final String title;
    private final boolean visible;

    public YbCardPromoButtonResponse(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "visible") boolean z, @Json(name = "action") String str3) {
        this.title = str;
        this.subtitle = str2;
        this.visible = z;
        this.action = str3;
    }

    public static /* synthetic */ YbCardPromoButtonResponse copy$default(YbCardPromoButtonResponse ybCardPromoButtonResponse, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardPromoButtonResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = ybCardPromoButtonResponse.subtitle;
        }
        if ((i & 4) != 0) {
            z = ybCardPromoButtonResponse.visible;
        }
        if ((i & 8) != 0) {
            str3 = ybCardPromoButtonResponse.action;
        }
        return ybCardPromoButtonResponse.copy(str, str2, z, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final YbCardPromoButtonResponse copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "visible") boolean visible, @Json(name = "action") String action) {
        return new YbCardPromoButtonResponse(title, subtitle, visible, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardPromoButtonResponse)) {
            return false;
        }
        YbCardPromoButtonResponse ybCardPromoButtonResponse = (YbCardPromoButtonResponse) other;
        return jl40.l(this.title, ybCardPromoButtonResponse.title) && jl40.l(this.subtitle, ybCardPromoButtonResponse.subtitle) && this.visible == ybCardPromoButtonResponse.visible && jl40.l(this.action, ybCardPromoButtonResponse.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.visible);
        String str2 = this.action;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return n.m(", action=", this.action, Extension.C_BRAKE, b64.v("YbCardPromoButtonResponse(title=", str, ", subtitle=", str2, ", visible="), this.visible);
    }
}
