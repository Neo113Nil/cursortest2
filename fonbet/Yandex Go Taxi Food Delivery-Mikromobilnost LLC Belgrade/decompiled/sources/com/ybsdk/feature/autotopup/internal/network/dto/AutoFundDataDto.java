package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDataDto;", "", BackendConfig.Restrictions.ENABLED, "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "infoAction", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Z", "getTitle", "()Ljava/lang/String;", "getDescription", "getInfoAction", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundDataDto {
    private final String description;
    private final boolean enabled;
    private final String infoAction;
    private final String title;

    public AutoFundDataDto(@Json(name = "is_turned_on") boolean z, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "info_action") String str3) {
        this.enabled = z;
        this.title = str;
        this.description = str2;
        this.infoAction = str3;
    }

    public static /* synthetic */ AutoFundDataDto copy$default(AutoFundDataDto autoFundDataDto, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoFundDataDto.enabled;
        }
        if ((i & 2) != 0) {
            str = autoFundDataDto.title;
        }
        if ((i & 4) != 0) {
            str2 = autoFundDataDto.description;
        }
        if ((i & 8) != 0) {
            str3 = autoFundDataDto.infoAction;
        }
        return autoFundDataDto.copy(z, str, str2, str3);
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
    public final String getInfoAction() {
        return this.infoAction;
    }

    public final AutoFundDataDto copy(@Json(name = "is_turned_on") boolean enabled, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "info_action") String infoAction) {
        return new AutoFundDataDto(enabled, title, description, infoAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoFundDataDto)) {
            return false;
        }
        AutoFundDataDto autoFundDataDto = (AutoFundDataDto) other;
        return this.enabled == autoFundDataDto.enabled && jl40.l(this.title, autoFundDataDto.title) && jl40.l(this.description, autoFundDataDto.description) && jl40.l(this.infoAction, autoFundDataDto.infoAction);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getInfoAction() {
        return this.infoAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.enabled) * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.infoAction;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.title;
        return g8e.r(ly3.v("AutoFundDataDto(enabled=", ", title=", str, ", description=", z), this.description, ", infoAction=", this.infoAction, Extension.C_BRAKE);
    }
}
