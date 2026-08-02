package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u009d\u0001\u00107\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006>"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "", "header", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferHeaderDto;", Constants.KEY_MESSAGE, "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "comment", "primaryButton", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageButtonDto;", "secondaryButton", "statusIconType", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/StatusIconTypeDto;", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "closeAction", "quickActions", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferQuickActionDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferHeaderDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageButtonDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageButtonDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/StatusIconTypeDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;Ljava/util/List;)V", "getHeader", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferHeaderDto;", "getMessage", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "getDescription", "getComment", "getPrimaryButton", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageButtonDto;", "getSecondaryButton", "getStatusIconType", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/StatusIconTypeDto;", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getCloseAction", "getQuickActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferResultPageDto {
    private final String closeAction;
    private final String comment;
    private final String description;
    private final DivDataDto divkitWidget;
    private final TransferHeaderDto header;
    private final Themes<String> image;
    private final String message;
    private final TransferResultPageButtonDto primaryButton;
    private final List<TransferQuickActionDto> quickActions;
    private final TransferResultPageButtonDto secondaryButton;
    private final StatusIconTypeDto statusIconType;
    private final String title;

    public TransferResultPageDto(@Json(name = "header") TransferHeaderDto transferHeaderDto, @Json(name = "message") String str, @Json(name = "image") Themes<String> themes, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "comment") String str4, @Json(name = "primary_button") TransferResultPageButtonDto transferResultPageButtonDto, @Json(name = "secondary_button") TransferResultPageButtonDto transferResultPageButtonDto2, @Json(name = "status_icon_type") StatusIconTypeDto statusIconTypeDto, @Json(name = "divkit_widget") DivDataDto divDataDto, @Json(name = "close_action") String str5, @Json(name = "quick_actions") List<TransferQuickActionDto> list) {
        this.header = transferHeaderDto;
        this.message = str;
        this.image = themes;
        this.title = str2;
        this.description = str3;
        this.comment = str4;
        this.primaryButton = transferResultPageButtonDto;
        this.secondaryButton = transferResultPageButtonDto2;
        this.statusIconType = statusIconTypeDto;
        this.divkitWidget = divDataDto;
        this.closeAction = str5;
        this.quickActions = list;
    }

    public static /* synthetic */ TransferResultPageDto copy$default(TransferResultPageDto transferResultPageDto, TransferHeaderDto transferHeaderDto, String str, Themes themes, String str2, String str3, String str4, TransferResultPageButtonDto transferResultPageButtonDto, TransferResultPageButtonDto transferResultPageButtonDto2, StatusIconTypeDto statusIconTypeDto, DivDataDto divDataDto, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            transferHeaderDto = transferResultPageDto.header;
        }
        if ((i & 2) != 0) {
            str = transferResultPageDto.message;
        }
        if ((i & 4) != 0) {
            themes = transferResultPageDto.image;
        }
        if ((i & 8) != 0) {
            str2 = transferResultPageDto.title;
        }
        if ((i & 16) != 0) {
            str3 = transferResultPageDto.description;
        }
        if ((i & 32) != 0) {
            str4 = transferResultPageDto.comment;
        }
        if ((i & 64) != 0) {
            transferResultPageButtonDto = transferResultPageDto.primaryButton;
        }
        if ((i & 128) != 0) {
            transferResultPageButtonDto2 = transferResultPageDto.secondaryButton;
        }
        if ((i & 256) != 0) {
            statusIconTypeDto = transferResultPageDto.statusIconType;
        }
        if ((i & 512) != 0) {
            divDataDto = transferResultPageDto.divkitWidget;
        }
        if ((i & 1024) != 0) {
            str5 = transferResultPageDto.closeAction;
        }
        if ((i & 2048) != 0) {
            list = transferResultPageDto.quickActions;
        }
        String str6 = str5;
        List list2 = list;
        StatusIconTypeDto statusIconTypeDto2 = statusIconTypeDto;
        DivDataDto divDataDto2 = divDataDto;
        TransferResultPageButtonDto transferResultPageButtonDto3 = transferResultPageButtonDto;
        TransferResultPageButtonDto transferResultPageButtonDto4 = transferResultPageButtonDto2;
        String str7 = str3;
        String str8 = str4;
        return transferResultPageDto.copy(transferHeaderDto, str, themes, str2, str7, str8, transferResultPageButtonDto3, transferResultPageButtonDto4, statusIconTypeDto2, divDataDto2, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component10, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final List<TransferQuickActionDto> component12() {
        return this.quickActions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferResultPageButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component8, reason: from getter */
    public final TransferResultPageButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component9, reason: from getter */
    public final StatusIconTypeDto getStatusIconType() {
        return this.statusIconType;
    }

    public final TransferResultPageDto copy(@Json(name = "header") TransferHeaderDto header, @Json(name = "message") String message, @Json(name = "image") Themes<String> image, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "comment") String comment, @Json(name = "primary_button") TransferResultPageButtonDto primaryButton, @Json(name = "secondary_button") TransferResultPageButtonDto secondaryButton, @Json(name = "status_icon_type") StatusIconTypeDto statusIconType, @Json(name = "divkit_widget") DivDataDto divkitWidget, @Json(name = "close_action") String closeAction, @Json(name = "quick_actions") List<TransferQuickActionDto> quickActions) {
        return new TransferResultPageDto(header, message, image, title, description, comment, primaryButton, secondaryButton, statusIconType, divkitWidget, closeAction, quickActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResultPageDto)) {
            return false;
        }
        TransferResultPageDto transferResultPageDto = (TransferResultPageDto) other;
        return jl40.l(this.header, transferResultPageDto.header) && jl40.l(this.message, transferResultPageDto.message) && jl40.l(this.image, transferResultPageDto.image) && jl40.l(this.title, transferResultPageDto.title) && jl40.l(this.description, transferResultPageDto.description) && jl40.l(this.comment, transferResultPageDto.comment) && jl40.l(this.primaryButton, transferResultPageDto.primaryButton) && jl40.l(this.secondaryButton, transferResultPageDto.secondaryButton) && this.statusIconType == transferResultPageDto.statusIconType && jl40.l(this.divkitWidget, transferResultPageDto.divkitWidget) && jl40.l(this.closeAction, transferResultPageDto.closeAction) && jl40.l(this.quickActions, transferResultPageDto.quickActions);
    }

    public final String getCloseAction() {
        return this.closeAction;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final TransferHeaderDto getHeader() {
        return this.header;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getMessage() {
        return this.message;
    }

    public final TransferResultPageButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final List<TransferQuickActionDto> getQuickActions() {
        return this.quickActions;
    }

    public final TransferResultPageButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final StatusIconTypeDto getStatusIconType() {
        return this.statusIconType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.header.hashCode() * 31, 31, this.message);
        Themes<String> themes = this.image;
        int b2 = unr0.b(unr0.b((b + (themes == null ? 0 : themes.hashCode())) * 31, 31, this.title), 31, this.description);
        String str = this.comment;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        TransferResultPageButtonDto transferResultPageButtonDto = this.primaryButton;
        int hashCode2 = (hashCode + (transferResultPageButtonDto == null ? 0 : transferResultPageButtonDto.hashCode())) * 31;
        TransferResultPageButtonDto transferResultPageButtonDto2 = this.secondaryButton;
        int hashCode3 = (hashCode2 + (transferResultPageButtonDto2 == null ? 0 : transferResultPageButtonDto2.hashCode())) * 31;
        StatusIconTypeDto statusIconTypeDto = this.statusIconType;
        int hashCode4 = (hashCode3 + (statusIconTypeDto == null ? 0 : statusIconTypeDto.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        int hashCode5 = (hashCode4 + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        String str2 = this.closeAction;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TransferQuickActionDto> list = this.quickActions;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TransferHeaderDto transferHeaderDto = this.header;
        String str = this.message;
        Themes<String> themes = this.image;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.comment;
        TransferResultPageButtonDto transferResultPageButtonDto = this.primaryButton;
        TransferResultPageButtonDto transferResultPageButtonDto2 = this.secondaryButton;
        StatusIconTypeDto statusIconTypeDto = this.statusIconType;
        DivDataDto divDataDto = this.divkitWidget;
        String str5 = this.closeAction;
        List<TransferQuickActionDto> list = this.quickActions;
        StringBuilder sb = new StringBuilder("TransferResultPageDto(header=");
        sb.append(transferHeaderDto);
        sb.append(", message=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themes);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        g8e.D(sb, str3, ", comment=", str4, ", primaryButton=");
        sb.append(transferResultPageButtonDto);
        sb.append(", secondaryButton=");
        sb.append(transferResultPageButtonDto2);
        sb.append(", statusIconType=");
        sb.append(statusIconTypeDto);
        sb.append(", divkitWidget=");
        sb.append(divDataDto);
        sb.append(", closeAction=");
        return tse0.j(str5, ", quickActions=", Extension.C_BRAKE, sb, list);
    }
}
