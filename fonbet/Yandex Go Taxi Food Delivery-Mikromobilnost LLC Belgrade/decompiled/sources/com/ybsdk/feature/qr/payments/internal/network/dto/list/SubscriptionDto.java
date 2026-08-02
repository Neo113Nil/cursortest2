package com.ybsdk.feature.qr.payments.internal.network.dto.list;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/SubscriptionDto;", "", "id", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "themedLogo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getLogo$annotations", "()V", "getLogo", "getThemedLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionDto {
    private final String description;
    private final String id;
    private final String logo;
    private final Themes<String> themedLogo;
    private final String title;

    public SubscriptionDto(@Json(name = "subscription_id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "logo") String str4, @Json(name = "themed_logo") Themes<String> themes) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.logo = str4;
        this.themedLogo = themes;
    }

    public static /* synthetic */ SubscriptionDto copy$default(SubscriptionDto subscriptionDto, String str, String str2, String str3, String str4, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionDto.title;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionDto.description;
        }
        if ((i & 8) != 0) {
            str4 = subscriptionDto.logo;
        }
        if ((i & 16) != 0) {
            themes = subscriptionDto.themedLogo;
        }
        Themes themes2 = themes;
        String str5 = str3;
        return subscriptionDto.copy(str, str2, str5, str4, themes2);
    }

    @jxi
    public static /* synthetic */ void getLogo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> component5() {
        return this.themedLogo;
    }

    public final SubscriptionDto copy(@Json(name = "subscription_id") String id, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") String logo, @Json(name = "themed_logo") Themes<String> themedLogo) {
        return new SubscriptionDto(id, title, description, logo, themedLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDto)) {
            return false;
        }
        SubscriptionDto subscriptionDto = (SubscriptionDto) other;
        return jl40.l(this.id, subscriptionDto.id) && jl40.l(this.title, subscriptionDto.title) && jl40.l(this.description, subscriptionDto.description) && jl40.l(this.logo, subscriptionDto.logo) && jl40.l(this.themedLogo, subscriptionDto.themedLogo);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> getThemedLogo() {
        return this.themedLogo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes = this.themedLogo;
        return hashCode2 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.logo;
        Themes<String> themes = this.themedLogo;
        StringBuilder v = b64.v("SubscriptionDto(id=", str, ", title=", str2, ", description=");
        g8e.D(v, str3, ", logo=", str4, ", themedLogo=");
        return smw0.l(v, themes, Extension.C_BRAKE);
    }
}
