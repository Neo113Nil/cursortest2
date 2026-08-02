package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "primaryButton", "Lcom/ybsdk/core/common/data/network/dto/CommonSheetButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommonSheetButton;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPrimaryButton", "()Lcom/ybsdk/core/common/data/network/dto/CommonSheetButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonSheet {
    private final String description;
    private final CommonSheetButton primaryButton;
    private final String title;

    public CommonSheet(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "primary_button") CommonSheetButton commonSheetButton) {
        this.title = str;
        this.description = str2;
        this.primaryButton = commonSheetButton;
    }

    public static /* synthetic */ CommonSheet copy$default(CommonSheet commonSheet, String str, String str2, CommonSheetButton commonSheetButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonSheet.title;
        }
        if ((i & 2) != 0) {
            str2 = commonSheet.description;
        }
        if ((i & 4) != 0) {
            commonSheetButton = commonSheet.primaryButton;
        }
        return commonSheet.copy(str, str2, commonSheetButton);
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
    public final CommonSheetButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final CommonSheet copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "primary_button") CommonSheetButton primaryButton) {
        return new CommonSheet(title, description, primaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSheet)) {
            return false;
        }
        CommonSheet commonSheet = (CommonSheet) other;
        return jl40.l(this.title, commonSheet.title) && jl40.l(this.description, commonSheet.description) && jl40.l(this.primaryButton, commonSheet.primaryButton);
    }

    public final String getDescription() {
        return this.description;
    }

    public final CommonSheetButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.primaryButton.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.description);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        CommonSheetButton commonSheetButton = this.primaryButton;
        StringBuilder v = b64.v("CommonSheet(title=", str, ", description=", str2, ", primaryButton=");
        v.append(commonSheetButton);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
