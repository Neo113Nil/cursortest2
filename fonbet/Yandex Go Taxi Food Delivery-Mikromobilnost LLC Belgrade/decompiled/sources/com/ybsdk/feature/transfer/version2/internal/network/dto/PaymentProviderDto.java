package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "", "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "id", "name", "subtitle", "action", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getId", "()Ljava/lang/String;", "getName", "getSubtitle", "getAction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentProviderDto {
    private final String action;
    private final String id;
    private final Themes<String> logo;
    private final String name;
    private final String subtitle;

    public PaymentProviderDto(@Json(name = "logo") Themes<String> themes, @Json(name = "provider_id") String str, @Json(name = "name") String str2, @Json(name = "subtitle") String str3, @Json(name = "action") String str4) {
        this.logo = themes;
        this.id = str;
        this.name = str2;
        this.subtitle = str3;
        this.action = str4;
    }

    public static /* synthetic */ PaymentProviderDto copy$default(PaymentProviderDto paymentProviderDto, Themes themes, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = paymentProviderDto.logo;
        }
        if ((i & 2) != 0) {
            str = paymentProviderDto.id;
        }
        if ((i & 4) != 0) {
            str2 = paymentProviderDto.name;
        }
        if ((i & 8) != 0) {
            str3 = paymentProviderDto.subtitle;
        }
        if ((i & 16) != 0) {
            str4 = paymentProviderDto.action;
        }
        String str5 = str4;
        String str6 = str2;
        return paymentProviderDto.copy(themes, str, str6, str3, str5);
    }

    public final Themes<String> component1() {
        return this.logo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final PaymentProviderDto copy(@Json(name = "logo") Themes<String> logo, @Json(name = "provider_id") String id, @Json(name = "name") String name, @Json(name = "subtitle") String subtitle, @Json(name = "action") String action) {
        return new PaymentProviderDto(logo, id, name, subtitle, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentProviderDto)) {
            return false;
        }
        PaymentProviderDto paymentProviderDto = (PaymentProviderDto) other;
        return jl40.l(this.logo, paymentProviderDto.logo) && jl40.l(this.id, paymentProviderDto.id) && jl40.l(this.name, paymentProviderDto.name) && jl40.l(this.subtitle, paymentProviderDto.subtitle) && jl40.l(this.action, paymentProviderDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getId() {
        return this.id;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        Themes<String> themes = this.logo;
        int b = unr0.b(unr0.b((themes == null ? 0 : themes.hashCode()) * 31, 31, this.id), 31, this.name);
        String str = this.subtitle;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Themes<String> themes = this.logo;
        String str = this.id;
        String str2 = this.name;
        String str3 = this.subtitle;
        String str4 = this.action;
        StringBuilder sb = new StringBuilder("PaymentProviderDto(logo=");
        sb.append(themes);
        sb.append(", id=");
        sb.append(str);
        sb.append(", name=");
        g8e.D(sb, str2, ", subtitle=", str3, ", action=");
        return oyr.t(sb, str4, Extension.C_BRAKE);
    }
}
