package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;", "", BackendConfig.Restrictions.ENABLED, "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;", "info", "titleEndBadge", "Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;)V", "getEnabled", "()Z", "getTitle", "()Ljava/lang/String;", "getDescription", "getAmount", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;", "getInfo", "getTitleEndBadge", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/TextBadgeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.ybsdk.feature.autotopup.internal.network.dto.AutofundDataDto, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C0142AutofundDataDto {
    private final AutoFundMoneyDto amount;
    private final String description;
    private final boolean enabled;
    private final String info;
    private final String title;
    private final TextBadgeDto titleEndBadge;

    public C0142AutofundDataDto(@Json(name = "enabled") boolean z, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "amount") AutoFundMoneyDto autoFundMoneyDto, @Json(name = "info") String str3, @Json(name = "title_end_badge") TextBadgeDto textBadgeDto) {
        this.enabled = z;
        this.title = str;
        this.description = str2;
        this.amount = autoFundMoneyDto;
        this.info = str3;
        this.titleEndBadge = textBadgeDto;
    }

    public static /* synthetic */ C0142AutofundDataDto copy$default(C0142AutofundDataDto c0142AutofundDataDto, boolean z, String str, String str2, AutoFundMoneyDto autoFundMoneyDto, String str3, TextBadgeDto textBadgeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c0142AutofundDataDto.enabled;
        }
        if ((i & 2) != 0) {
            str = c0142AutofundDataDto.title;
        }
        if ((i & 4) != 0) {
            str2 = c0142AutofundDataDto.description;
        }
        if ((i & 8) != 0) {
            autoFundMoneyDto = c0142AutofundDataDto.amount;
        }
        if ((i & 16) != 0) {
            str3 = c0142AutofundDataDto.info;
        }
        if ((i & 32) != 0) {
            textBadgeDto = c0142AutofundDataDto.titleEndBadge;
        }
        String str4 = str3;
        TextBadgeDto textBadgeDto2 = textBadgeDto;
        return c0142AutofundDataDto.copy(z, str, str2, autoFundMoneyDto, str4, textBadgeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
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
    public final AutoFundMoneyDto getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* renamed from: component6, reason: from getter */
    public final TextBadgeDto getTitleEndBadge() {
        return this.titleEndBadge;
    }

    public final C0142AutofundDataDto copy(@Json(name = "enabled") boolean enabled, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "amount") AutoFundMoneyDto amount, @Json(name = "info") String info, @Json(name = "title_end_badge") TextBadgeDto titleEndBadge) {
        return new C0142AutofundDataDto(enabled, title, description, amount, info, titleEndBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0142AutofundDataDto)) {
            return false;
        }
        C0142AutofundDataDto c0142AutofundDataDto = (C0142AutofundDataDto) other;
        return this.enabled == c0142AutofundDataDto.enabled && jl40.l(this.title, c0142AutofundDataDto.title) && jl40.l(this.description, c0142AutofundDataDto.description) && jl40.l(this.amount, c0142AutofundDataDto.amount) && jl40.l(this.info, c0142AutofundDataDto.info) && jl40.l(this.titleEndBadge, c0142AutofundDataDto.titleEndBadge);
    }

    public final AutoFundMoneyDto getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TextBadgeDto getTitleEndBadge() {
        return this.titleEndBadge;
    }

    public int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.enabled) * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        AutoFundMoneyDto autoFundMoneyDto = this.amount;
        int hashCode2 = (hashCode + (autoFundMoneyDto == null ? 0 : autoFundMoneyDto.hashCode())) * 31;
        String str2 = this.info;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextBadgeDto textBadgeDto = this.titleEndBadge;
        return hashCode3 + (textBadgeDto != null ? textBadgeDto.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.title;
        String str2 = this.description;
        AutoFundMoneyDto autoFundMoneyDto = this.amount;
        String str3 = this.info;
        TextBadgeDto textBadgeDto = this.titleEndBadge;
        StringBuilder v = ly3.v("AutofundDataDto(enabled=", ", title=", str, ", description=", z);
        v.append(str2);
        v.append(", amount=");
        v.append(autoFundMoneyDto);
        v.append(", info=");
        v.append(str3);
        v.append(", titleEndBadge=");
        v.append(textBadgeDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
