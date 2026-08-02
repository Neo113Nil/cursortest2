package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "primaryButton", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetButtonDto;", "secondaryButton", "successSnackbar", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSnackbarDto;", "failureSnackbar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetButtonDto;Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetButtonDto;Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSnackbarDto;Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSnackbarDto;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPrimaryButton", "()Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetButtonDto;", "getSecondaryButton", "getSuccessSnackbar", "()Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSnackbarDto;", "getFailureSnackbar", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnbindAccountSheetDto {
    private final String description;
    private final UnbindAccountSnackbarDto failureSnackbar;
    private final UnbindAccountSheetButtonDto primaryButton;
    private final UnbindAccountSheetButtonDto secondaryButton;
    private final UnbindAccountSnackbarDto successSnackbar;
    private final String title;

    public UnbindAccountSheetDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "primary_button") UnbindAccountSheetButtonDto unbindAccountSheetButtonDto, @Json(name = "secondary_button") UnbindAccountSheetButtonDto unbindAccountSheetButtonDto2, @Json(name = "success_snackbar") UnbindAccountSnackbarDto unbindAccountSnackbarDto, @Json(name = "failure_snackbar") UnbindAccountSnackbarDto unbindAccountSnackbarDto2) {
        this.title = str;
        this.description = str2;
        this.primaryButton = unbindAccountSheetButtonDto;
        this.secondaryButton = unbindAccountSheetButtonDto2;
        this.successSnackbar = unbindAccountSnackbarDto;
        this.failureSnackbar = unbindAccountSnackbarDto2;
    }

    public static /* synthetic */ UnbindAccountSheetDto copy$default(UnbindAccountSheetDto unbindAccountSheetDto, String str, String str2, UnbindAccountSheetButtonDto unbindAccountSheetButtonDto, UnbindAccountSheetButtonDto unbindAccountSheetButtonDto2, UnbindAccountSnackbarDto unbindAccountSnackbarDto, UnbindAccountSnackbarDto unbindAccountSnackbarDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unbindAccountSheetDto.title;
        }
        if ((i & 2) != 0) {
            str2 = unbindAccountSheetDto.description;
        }
        if ((i & 4) != 0) {
            unbindAccountSheetButtonDto = unbindAccountSheetDto.primaryButton;
        }
        if ((i & 8) != 0) {
            unbindAccountSheetButtonDto2 = unbindAccountSheetDto.secondaryButton;
        }
        if ((i & 16) != 0) {
            unbindAccountSnackbarDto = unbindAccountSheetDto.successSnackbar;
        }
        if ((i & 32) != 0) {
            unbindAccountSnackbarDto2 = unbindAccountSheetDto.failureSnackbar;
        }
        UnbindAccountSnackbarDto unbindAccountSnackbarDto3 = unbindAccountSnackbarDto;
        UnbindAccountSnackbarDto unbindAccountSnackbarDto4 = unbindAccountSnackbarDto2;
        return unbindAccountSheetDto.copy(str, str2, unbindAccountSheetButtonDto, unbindAccountSheetButtonDto2, unbindAccountSnackbarDto3, unbindAccountSnackbarDto4);
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
    public final UnbindAccountSheetButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component4, reason: from getter */
    public final UnbindAccountSheetButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component5, reason: from getter */
    public final UnbindAccountSnackbarDto getSuccessSnackbar() {
        return this.successSnackbar;
    }

    /* renamed from: component6, reason: from getter */
    public final UnbindAccountSnackbarDto getFailureSnackbar() {
        return this.failureSnackbar;
    }

    public final UnbindAccountSheetDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "primary_button") UnbindAccountSheetButtonDto primaryButton, @Json(name = "secondary_button") UnbindAccountSheetButtonDto secondaryButton, @Json(name = "success_snackbar") UnbindAccountSnackbarDto successSnackbar, @Json(name = "failure_snackbar") UnbindAccountSnackbarDto failureSnackbar) {
        return new UnbindAccountSheetDto(title, description, primaryButton, secondaryButton, successSnackbar, failureSnackbar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnbindAccountSheetDto)) {
            return false;
        }
        UnbindAccountSheetDto unbindAccountSheetDto = (UnbindAccountSheetDto) other;
        return jl40.l(this.title, unbindAccountSheetDto.title) && jl40.l(this.description, unbindAccountSheetDto.description) && jl40.l(this.primaryButton, unbindAccountSheetDto.primaryButton) && jl40.l(this.secondaryButton, unbindAccountSheetDto.secondaryButton) && jl40.l(this.successSnackbar, unbindAccountSheetDto.successSnackbar) && jl40.l(this.failureSnackbar, unbindAccountSheetDto.failureSnackbar);
    }

    public final String getDescription() {
        return this.description;
    }

    public final UnbindAccountSnackbarDto getFailureSnackbar() {
        return this.failureSnackbar;
    }

    public final UnbindAccountSheetButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final UnbindAccountSheetButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final UnbindAccountSnackbarDto getSuccessSnackbar() {
        return this.successSnackbar;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.failureSnackbar.hashCode() + ((this.successSnackbar.hashCode() + ((this.secondaryButton.hashCode() + ((this.primaryButton.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.description)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        UnbindAccountSheetButtonDto unbindAccountSheetButtonDto = this.primaryButton;
        UnbindAccountSheetButtonDto unbindAccountSheetButtonDto2 = this.secondaryButton;
        UnbindAccountSnackbarDto unbindAccountSnackbarDto = this.successSnackbar;
        UnbindAccountSnackbarDto unbindAccountSnackbarDto2 = this.failureSnackbar;
        StringBuilder v = b64.v("UnbindAccountSheetDto(title=", str, ", description=", str2, ", primaryButton=");
        v.append(unbindAccountSheetButtonDto);
        v.append(", secondaryButton=");
        v.append(unbindAccountSheetButtonDto2);
        v.append(", successSnackbar=");
        v.append(unbindAccountSnackbarDto);
        v.append(", failureSnackbar=");
        v.append(unbindAccountSnackbarDto2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
