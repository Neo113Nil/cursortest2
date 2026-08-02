package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;", "", "requestId", "", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "appNotFoundSheet", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "resultData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupResultDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/CommonSheet;Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupResultDto;)V", "getRequestId", "()Ljava/lang/String;", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getAppNotFoundSheet", "()Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "getResultData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupResultDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "SaveAutoTopupResultDto", "SaveAutoTopupButtonDto", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveAutoTopupSuccessResponse {
    private final CommonSheet appNotFoundSheet;
    private final ActionButtonDto button;
    private final String requestId;
    private final SaveAutoTopupResultDto resultData;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupButtonDto;", "", "text", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveAutoTopupButtonDto {
        private final String action;
        private final String text;

        public SaveAutoTopupButtonDto(@Json(name = "text") String str, @Json(name = "action") String str2) {
            this.text = str;
            this.action = str2;
        }

        public static /* synthetic */ SaveAutoTopupButtonDto copy$default(SaveAutoTopupButtonDto saveAutoTopupButtonDto, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saveAutoTopupButtonDto.text;
            }
            if ((i & 2) != 0) {
                str2 = saveAutoTopupButtonDto.action;
            }
            return saveAutoTopupButtonDto.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final SaveAutoTopupButtonDto copy(@Json(name = "text") String text, @Json(name = "action") String action) {
            return new SaveAutoTopupButtonDto(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveAutoTopupButtonDto)) {
                return false;
            }
            SaveAutoTopupButtonDto saveAutoTopupButtonDto = (SaveAutoTopupButtonDto) other;
            return jl40.l(this.text, saveAutoTopupButtonDto.text) && jl40.l(this.action, saveAutoTopupButtonDto.action);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("SaveAutoTopupButtonDto(text=", this.text, ", action=", this.action, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupResultDto;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", "subtitle", "primaryButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupButtonDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupButtonDto;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse$SaveAutoTopupButtonDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveAutoTopupResultDto {
        private final Themes<String> image;
        private final SaveAutoTopupButtonDto primaryButton;
        private final String subtitle;
        private final String title;

        public SaveAutoTopupResultDto(@Json(name = "image") Themes<String> themes, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "primary_button") SaveAutoTopupButtonDto saveAutoTopupButtonDto) {
            this.image = themes;
            this.title = str;
            this.subtitle = str2;
            this.primaryButton = saveAutoTopupButtonDto;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveAutoTopupResultDto copy$default(SaveAutoTopupResultDto saveAutoTopupResultDto, Themes themes, String str, String str2, SaveAutoTopupButtonDto saveAutoTopupButtonDto, int i, Object obj) {
            if ((i & 1) != 0) {
                themes = saveAutoTopupResultDto.image;
            }
            if ((i & 2) != 0) {
                str = saveAutoTopupResultDto.title;
            }
            if ((i & 4) != 0) {
                str2 = saveAutoTopupResultDto.subtitle;
            }
            if ((i & 8) != 0) {
                saveAutoTopupButtonDto = saveAutoTopupResultDto.primaryButton;
            }
            return saveAutoTopupResultDto.copy(themes, str, str2, saveAutoTopupButtonDto);
        }

        public final Themes<String> component1() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final SaveAutoTopupButtonDto getPrimaryButton() {
            return this.primaryButton;
        }

        public final SaveAutoTopupResultDto copy(@Json(name = "image") Themes<String> image, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "primary_button") SaveAutoTopupButtonDto primaryButton) {
            return new SaveAutoTopupResultDto(image, title, subtitle, primaryButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveAutoTopupResultDto)) {
                return false;
            }
            SaveAutoTopupResultDto saveAutoTopupResultDto = (SaveAutoTopupResultDto) other;
            return jl40.l(this.image, saveAutoTopupResultDto.image) && jl40.l(this.title, saveAutoTopupResultDto.title) && jl40.l(this.subtitle, saveAutoTopupResultDto.subtitle) && jl40.l(this.primaryButton, saveAutoTopupResultDto.primaryButton);
        }

        public final Themes<String> getImage() {
            return this.image;
        }

        public final SaveAutoTopupButtonDto getPrimaryButton() {
            return this.primaryButton;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.primaryButton.hashCode() + unr0.b(unr0.b(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }

        public String toString() {
            return "SaveAutoTopupResultDto(image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", primaryButton=" + this.primaryButton + Extension.C_BRAKE;
        }
    }

    public SaveAutoTopupSuccessResponse(@Json(name = "request_id") String str, @Json(name = "button") ActionButtonDto actionButtonDto, @Json(name = "app_not_found_sheet") CommonSheet commonSheet, @Json(name = "result_data") SaveAutoTopupResultDto saveAutoTopupResultDto) {
        this.requestId = str;
        this.button = actionButtonDto;
        this.appNotFoundSheet = commonSheet;
        this.resultData = saveAutoTopupResultDto;
    }

    public static /* synthetic */ SaveAutoTopupSuccessResponse copy$default(SaveAutoTopupSuccessResponse saveAutoTopupSuccessResponse, String str, ActionButtonDto actionButtonDto, CommonSheet commonSheet, SaveAutoTopupResultDto saveAutoTopupResultDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveAutoTopupSuccessResponse.requestId;
        }
        if ((i & 2) != 0) {
            actionButtonDto = saveAutoTopupSuccessResponse.button;
        }
        if ((i & 4) != 0) {
            commonSheet = saveAutoTopupSuccessResponse.appNotFoundSheet;
        }
        if ((i & 8) != 0) {
            saveAutoTopupResultDto = saveAutoTopupSuccessResponse.resultData;
        }
        return saveAutoTopupSuccessResponse.copy(str, actionButtonDto, commonSheet, saveAutoTopupResultDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    /* renamed from: component4, reason: from getter */
    public final SaveAutoTopupResultDto getResultData() {
        return this.resultData;
    }

    public final SaveAutoTopupSuccessResponse copy(@Json(name = "request_id") String requestId, @Json(name = "button") ActionButtonDto button, @Json(name = "app_not_found_sheet") CommonSheet appNotFoundSheet, @Json(name = "result_data") SaveAutoTopupResultDto resultData) {
        return new SaveAutoTopupSuccessResponse(requestId, button, appNotFoundSheet, resultData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAutoTopupSuccessResponse)) {
            return false;
        }
        SaveAutoTopupSuccessResponse saveAutoTopupSuccessResponse = (SaveAutoTopupSuccessResponse) other;
        return jl40.l(this.requestId, saveAutoTopupSuccessResponse.requestId) && jl40.l(this.button, saveAutoTopupSuccessResponse.button) && jl40.l(this.appNotFoundSheet, saveAutoTopupSuccessResponse.appNotFoundSheet) && jl40.l(this.resultData, saveAutoTopupSuccessResponse.resultData);
    }

    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final SaveAutoTopupResultDto getResultData() {
        return this.resultData;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        ActionButtonDto actionButtonDto = this.button;
        int hashCode2 = (hashCode + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        CommonSheet commonSheet = this.appNotFoundSheet;
        return this.resultData.hashCode() + ((hashCode2 + (commonSheet != null ? commonSheet.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SaveAutoTopupSuccessResponse(requestId=" + this.requestId + ", button=" + this.button + ", appNotFoundSheet=" + this.appNotFoundSheet + ", resultData=" + this.resultData + Extension.C_BRAKE;
    }
}
