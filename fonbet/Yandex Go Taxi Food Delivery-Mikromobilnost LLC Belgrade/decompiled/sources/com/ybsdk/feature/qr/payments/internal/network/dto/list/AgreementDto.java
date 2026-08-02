package com.ybsdk.feature.qr.payments.internal.network.dto.list;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/AgreementDto;", "", "id", "", "title", "logo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "subscriptions", "", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/SubscriptionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSubscriptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AgreementDto {
    private final String id;
    private final Themes<String> logo;
    private final List<SubscriptionDto> subscriptions;
    private final String title;

    public AgreementDto(@Json(name = "agreement_id") String str, @Json(name = "title") String str2, @Json(name = "logo") Themes<String> themes, @Json(name = "subscriptions") List<SubscriptionDto> list) {
        this.id = str;
        this.title = str2;
        this.logo = themes;
        this.subscriptions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgreementDto copy$default(AgreementDto agreementDto, String str, String str2, Themes themes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agreementDto.id;
        }
        if ((i & 2) != 0) {
            str2 = agreementDto.title;
        }
        if ((i & 4) != 0) {
            themes = agreementDto.logo;
        }
        if ((i & 8) != 0) {
            list = agreementDto.subscriptions;
        }
        return agreementDto.copy(str, str2, themes, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component3() {
        return this.logo;
    }

    public final List<SubscriptionDto> component4() {
        return this.subscriptions;
    }

    public final AgreementDto copy(@Json(name = "agreement_id") String id, @Json(name = "title") String title, @Json(name = "logo") Themes<String> logo, @Json(name = "subscriptions") List<SubscriptionDto> subscriptions) {
        return new AgreementDto(id, title, logo, subscriptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreementDto)) {
            return false;
        }
        AgreementDto agreementDto = (AgreementDto) other;
        return jl40.l(this.id, agreementDto.id) && jl40.l(this.title, agreementDto.title) && jl40.l(this.logo, agreementDto.logo) && jl40.l(this.subscriptions, agreementDto.subscriptions);
    }

    public final String getId() {
        return this.id;
    }

    public final Themes<String> getLogo() {
        return this.logo;
    }

    public final List<SubscriptionDto> getSubscriptions() {
        return this.subscriptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        Themes<String> themes = this.logo;
        return this.subscriptions.hashCode() + ((b + (themes == null ? 0 : themes.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Themes<String> themes = this.logo;
        List<SubscriptionDto> list = this.subscriptions;
        StringBuilder v = b64.v("AgreementDto(id=", str, ", title=", str2, ", logo=");
        v.append(themes);
        v.append(", subscriptions=");
        v.append(list);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
