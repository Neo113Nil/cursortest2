package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/TransferSheetItemDto;", "", "id", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "onSelectedAction", "selfTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "selfTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "me2meTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "aftTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "getOnSelectedAction", "getSelfTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "getSelfTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "getMe2meTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "getAftTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferSheetItemDto {
    private final String action;
    private final AftTopupPayloadDto aftTopupPayload;
    private final String description;
    private final String id;
    private final Me2MeTopupPayloadDto me2meTopupPayload;
    private final String onSelectedAction;
    private final SelfTopupPayloadDto selfTopupPayload;
    private final SelfTransferPayloadDto selfTransferPayload;
    private final Themes<String> themedImage;
    private final String title;

    public TransferSheetItemDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "image") Themes<String> themes, @Json(name = "action") String str4, @Json(name = "on_selected_action") String str5, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayloadDto, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayloadDto, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2MeTopupPayloadDto, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayloadDto) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.themedImage = themes;
        this.action = str4;
        this.onSelectedAction = str5;
        this.selfTransferPayload = selfTransferPayloadDto;
        this.selfTopupPayload = selfTopupPayloadDto;
        this.me2meTopupPayload = me2MeTopupPayloadDto;
        this.aftTopupPayload = aftTopupPayloadDto;
    }

    public static /* synthetic */ TransferSheetItemDto copy$default(TransferSheetItemDto transferSheetItemDto, String str, String str2, String str3, Themes themes, String str4, String str5, SelfTransferPayloadDto selfTransferPayloadDto, SelfTopupPayloadDto selfTopupPayloadDto, Me2MeTopupPayloadDto me2MeTopupPayloadDto, AftTopupPayloadDto aftTopupPayloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferSheetItemDto.id;
        }
        if ((i & 2) != 0) {
            str2 = transferSheetItemDto.title;
        }
        if ((i & 4) != 0) {
            str3 = transferSheetItemDto.description;
        }
        if ((i & 8) != 0) {
            themes = transferSheetItemDto.themedImage;
        }
        if ((i & 16) != 0) {
            str4 = transferSheetItemDto.action;
        }
        if ((i & 32) != 0) {
            str5 = transferSheetItemDto.onSelectedAction;
        }
        if ((i & 64) != 0) {
            selfTransferPayloadDto = transferSheetItemDto.selfTransferPayload;
        }
        if ((i & 128) != 0) {
            selfTopupPayloadDto = transferSheetItemDto.selfTopupPayload;
        }
        if ((i & 256) != 0) {
            me2MeTopupPayloadDto = transferSheetItemDto.me2meTopupPayload;
        }
        if ((i & 512) != 0) {
            aftTopupPayloadDto = transferSheetItemDto.aftTopupPayload;
        }
        Me2MeTopupPayloadDto me2MeTopupPayloadDto2 = me2MeTopupPayloadDto;
        AftTopupPayloadDto aftTopupPayloadDto2 = aftTopupPayloadDto;
        SelfTransferPayloadDto selfTransferPayloadDto2 = selfTransferPayloadDto;
        SelfTopupPayloadDto selfTopupPayloadDto2 = selfTopupPayloadDto;
        String str6 = str4;
        String str7 = str5;
        return transferSheetItemDto.copy(str, str2, str3, themes, str6, str7, selfTransferPayloadDto2, selfTopupPayloadDto2, me2MeTopupPayloadDto2, aftTopupPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component4() {
        return this.themedImage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOnSelectedAction() {
        return this.onSelectedAction;
    }

    /* renamed from: component7, reason: from getter */
    public final SelfTransferPayloadDto getSelfTransferPayload() {
        return this.selfTransferPayload;
    }

    /* renamed from: component8, reason: from getter */
    public final SelfTopupPayloadDto getSelfTopupPayload() {
        return this.selfTopupPayload;
    }

    /* renamed from: component9, reason: from getter */
    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    public final TransferSheetItemDto copy(@Json(name = "id") String id, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> themedImage, @Json(name = "action") String action, @Json(name = "on_selected_action") String onSelectedAction, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayload, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayload, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2meTopupPayload, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayload) {
        return new TransferSheetItemDto(id, title, description, themedImage, action, onSelectedAction, selfTransferPayload, selfTopupPayload, me2meTopupPayload, aftTopupPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferSheetItemDto)) {
            return false;
        }
        TransferSheetItemDto transferSheetItemDto = (TransferSheetItemDto) other;
        return jl40.l(this.id, transferSheetItemDto.id) && jl40.l(this.title, transferSheetItemDto.title) && jl40.l(this.description, transferSheetItemDto.description) && jl40.l(this.themedImage, transferSheetItemDto.themedImage) && jl40.l(this.action, transferSheetItemDto.action) && jl40.l(this.onSelectedAction, transferSheetItemDto.onSelectedAction) && jl40.l(this.selfTransferPayload, transferSheetItemDto.selfTransferPayload) && jl40.l(this.selfTopupPayload, transferSheetItemDto.selfTopupPayload) && jl40.l(this.me2meTopupPayload, transferSheetItemDto.me2meTopupPayload) && jl40.l(this.aftTopupPayload, transferSheetItemDto.aftTopupPayload);
    }

    public final String getAction() {
        return this.action;
    }

    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    public final String getOnSelectedAction() {
        return this.onSelectedAction;
    }

    public final SelfTopupPayloadDto getSelfTopupPayload() {
        return this.selfTopupPayload;
    }

    public final SelfTransferPayloadDto getSelfTransferPayload() {
        return this.selfTransferPayload;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int c = nnm.c(this.themedImage, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.action;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onSelectedAction;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelfTransferPayloadDto selfTransferPayloadDto = this.selfTransferPayload;
        int hashCode3 = (hashCode2 + (selfTransferPayloadDto == null ? 0 : selfTransferPayloadDto.hashCode())) * 31;
        SelfTopupPayloadDto selfTopupPayloadDto = this.selfTopupPayload;
        int hashCode4 = (hashCode3 + (selfTopupPayloadDto == null ? 0 : selfTopupPayloadDto.hashCode())) * 31;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = this.me2meTopupPayload;
        int hashCode5 = (hashCode4 + (me2MeTopupPayloadDto == null ? 0 : me2MeTopupPayloadDto.hashCode())) * 31;
        AftTopupPayloadDto aftTopupPayloadDto = this.aftTopupPayload;
        return hashCode5 + (aftTopupPayloadDto != null ? aftTopupPayloadDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        Themes<String> themes = this.themedImage;
        String str4 = this.action;
        String str5 = this.onSelectedAction;
        SelfTransferPayloadDto selfTransferPayloadDto = this.selfTransferPayload;
        SelfTopupPayloadDto selfTopupPayloadDto = this.selfTopupPayload;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = this.me2meTopupPayload;
        AftTopupPayloadDto aftTopupPayloadDto = this.aftTopupPayload;
        StringBuilder v = b64.v("TransferSheetItemDto(id=", str, ", title=", str2, ", description=");
        n.B(v, str3, ", themedImage=", themes, ", action=");
        g8e.D(v, str4, ", onSelectedAction=", str5, ", selfTransferPayload=");
        v.append(selfTransferPayloadDto);
        v.append(", selfTopupPayload=");
        v.append(selfTopupPayloadDto);
        v.append(", me2meTopupPayload=");
        v.append(me2MeTopupPayloadDto);
        v.append(", aftTopupPayload=");
        v.append(aftTopupPayloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
