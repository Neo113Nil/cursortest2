package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferStatusDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "widget", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "getTitle", "()Ljava/lang/String;", "getDescription", "getWidget", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullWidgetDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitResultDto {
    private final String description;
    private final TransferStatusDto status;
    private final String title;
    private final Me2MeDebitAutoPullWidgetDto widget;

    public Me2MeDebitResultDto(@Json(name = "status") TransferStatusDto transferStatusDto, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "me2me_debit_auto_pull_widget") Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto) {
        this.status = transferStatusDto;
        this.title = str;
        this.description = str2;
        this.widget = me2MeDebitAutoPullWidgetDto;
    }

    public static /* synthetic */ Me2MeDebitResultDto copy$default(Me2MeDebitResultDto me2MeDebitResultDto, TransferStatusDto transferStatusDto, String str, String str2, Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            transferStatusDto = me2MeDebitResultDto.status;
        }
        if ((i & 2) != 0) {
            str = me2MeDebitResultDto.title;
        }
        if ((i & 4) != 0) {
            str2 = me2MeDebitResultDto.description;
        }
        if ((i & 8) != 0) {
            me2MeDebitAutoPullWidgetDto = me2MeDebitResultDto.widget;
        }
        return me2MeDebitResultDto.copy(transferStatusDto, str, str2, me2MeDebitAutoPullWidgetDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferStatusDto getStatus() {
        return this.status;
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
    public final Me2MeDebitAutoPullWidgetDto getWidget() {
        return this.widget;
    }

    public final Me2MeDebitResultDto copy(@Json(name = "status") TransferStatusDto status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "me2me_debit_auto_pull_widget") Me2MeDebitAutoPullWidgetDto widget) {
        return new Me2MeDebitResultDto(status, title, description, widget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitResultDto)) {
            return false;
        }
        Me2MeDebitResultDto me2MeDebitResultDto = (Me2MeDebitResultDto) other;
        return this.status == me2MeDebitResultDto.status && jl40.l(this.title, me2MeDebitResultDto.title) && jl40.l(this.description, me2MeDebitResultDto.description) && jl40.l(this.widget, me2MeDebitResultDto.widget);
    }

    public final String getDescription() {
        return this.description;
    }

    public final TransferStatusDto getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Me2MeDebitAutoPullWidgetDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Me2MeDebitAutoPullWidgetDto me2MeDebitAutoPullWidgetDto = this.widget;
        return hashCode3 + (me2MeDebitAutoPullWidgetDto != null ? me2MeDebitAutoPullWidgetDto.hashCode() : 0);
    }

    public String toString() {
        return "Me2MeDebitResultDto(status=" + this.status + ", title=" + this.title + ", description=" + this.description + ", widget=" + this.widget + Extension.C_BRAKE;
    }
}
