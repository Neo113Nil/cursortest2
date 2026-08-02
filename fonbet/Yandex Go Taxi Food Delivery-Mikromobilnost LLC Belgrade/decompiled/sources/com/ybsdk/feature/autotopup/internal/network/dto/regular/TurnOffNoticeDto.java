package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonTextPrimary", "buttonTextSecondary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getButtonTextPrimary", "getButtonTextSecondary", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TurnOffNoticeDto {
    private final String buttonTextPrimary;
    private final String buttonTextSecondary;
    private final String description;
    private final String title;

    public TurnOffNoticeDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "primary_button_text") String str3, @Json(name = "secondary_button_text") String str4) {
        this.title = str;
        this.description = str2;
        this.buttonTextPrimary = str3;
        this.buttonTextSecondary = str4;
    }

    public static /* synthetic */ TurnOffNoticeDto copy$default(TurnOffNoticeDto turnOffNoticeDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = turnOffNoticeDto.title;
        }
        if ((i & 2) != 0) {
            str2 = turnOffNoticeDto.description;
        }
        if ((i & 4) != 0) {
            str3 = turnOffNoticeDto.buttonTextPrimary;
        }
        if ((i & 8) != 0) {
            str4 = turnOffNoticeDto.buttonTextSecondary;
        }
        return turnOffNoticeDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getButtonTextPrimary() {
        return this.buttonTextPrimary;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonTextSecondary() {
        return this.buttonTextSecondary;
    }

    public final TurnOffNoticeDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "primary_button_text") String buttonTextPrimary, @Json(name = "secondary_button_text") String buttonTextSecondary) {
        return new TurnOffNoticeDto(title, description, buttonTextPrimary, buttonTextSecondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnOffNoticeDto)) {
            return false;
        }
        TurnOffNoticeDto turnOffNoticeDto = (TurnOffNoticeDto) other;
        return jl40.l(this.title, turnOffNoticeDto.title) && jl40.l(this.description, turnOffNoticeDto.description) && jl40.l(this.buttonTextPrimary, turnOffNoticeDto.buttonTextPrimary) && jl40.l(this.buttonTextSecondary, turnOffNoticeDto.buttonTextSecondary);
    }

    public final String getButtonTextPrimary() {
        return this.buttonTextPrimary;
    }

    public final String getButtonTextSecondary() {
        return this.buttonTextSecondary;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonTextSecondary.hashCode() + unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.description), 31, this.buttonTextPrimary);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return g8e.r(b64.v("TurnOffNoticeDto(title=", str, ", description=", str2, ", buttonTextPrimary="), this.buttonTextPrimary, ", buttonTextSecondary=", this.buttonTextSecondary, Extension.C_BRAKE);
    }
}
