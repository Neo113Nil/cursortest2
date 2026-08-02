package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001eHÆ\u0003JÑ\u0001\u0010N\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001J\u0013\u0010O\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006T"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/TransferButtonDto;", "", "id", "", "title", "transferType", "isCommentFieldEnabled", "", "hint", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", BackendConfig.Restrictions.ENABLED, "action", "selfTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "selfTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "itemsSheetPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/BottomSheetPayloadDto;", "sectionsSheetPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;", "requisitesPersonTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesPersonTransferPayloadDto;", "requisitesLegalTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferPayloadDto;", "requisitesHcsTransferPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDto;", "me2meTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "aftTopupPayload", "Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;ZLjava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/BottomSheetPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesPersonTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;)V", "getId", "()Ljava/lang/String;", "getTitle", "getTransferType", "()Z", "getHint", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getEnabled", "getAction", "getSelfTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTransferPayloadDto;", "getSelfTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SelfTopupPayloadDto;", "getItemsSheetPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/BottomSheetPayloadDto;", "getSectionsSheetPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/SectionsSheetPayloadDto;", "getRequisitesPersonTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesPersonTransferPayloadDto;", "getRequisitesLegalTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferPayloadDto;", "getRequisitesHcsTransferPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferPayloadDto;", "getMe2meTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/Me2MeTopupPayloadDto;", "getAftTopupPayload", "()Lcom/ybsdk/feature/transfer/version2/api/dto/AftTopupPayloadDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferButtonDto {
    private final String action;
    private final AftTopupPayloadDto aftTopupPayload;
    private final boolean enabled;
    private final String hint;
    private final String id;
    private final boolean isCommentFieldEnabled;
    private final BottomSheetPayloadDto itemsSheetPayload;
    private final Me2MeTopupPayloadDto me2meTopupPayload;
    private final RequisitesHcsTransferPayloadDto requisitesHcsTransferPayload;
    private final RequisitesLegalTransferPayloadDto requisitesLegalTransferPayload;
    private final RequisitesPersonTransferPayloadDto requisitesPersonTransferPayload;
    private final SectionsSheetPayloadDto sectionsSheetPayload;
    private final SelfTopupPayloadDto selfTopupPayload;
    private final SelfTransferPayloadDto selfTransferPayload;
    private final Themes<String> themedImage;
    private final String title;
    private final String transferType;

    public TransferButtonDto(@Json(name = "id") String str, @Json(name = "title") String str2, @Json(name = "type") String str3, @Json(name = "is_comment_field_enabled") boolean z, @Json(name = "hint") String str4, @Json(name = "image") Themes<String> themes, @Json(name = "enabled") boolean z2, @Json(name = "action") String str5, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayloadDto, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayloadDto, @Json(name = "items_sheet_payload") BottomSheetPayloadDto bottomSheetPayloadDto, @Json(name = "sections_sheet_payload") SectionsSheetPayloadDto sectionsSheetPayloadDto, @Json(name = "requisites_person_transfer_payload") RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto, @Json(name = "requisites_legal_transfer_payload") RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto, @Json(name = "requisites_hcs_transfer_payload") RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2MeTopupPayloadDto, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayloadDto) {
        this.id = str;
        this.title = str2;
        this.transferType = str3;
        this.isCommentFieldEnabled = z;
        this.hint = str4;
        this.themedImage = themes;
        this.enabled = z2;
        this.action = str5;
        this.selfTransferPayload = selfTransferPayloadDto;
        this.selfTopupPayload = selfTopupPayloadDto;
        this.itemsSheetPayload = bottomSheetPayloadDto;
        this.sectionsSheetPayload = sectionsSheetPayloadDto;
        this.requisitesPersonTransferPayload = requisitesPersonTransferPayloadDto;
        this.requisitesLegalTransferPayload = requisitesLegalTransferPayloadDto;
        this.requisitesHcsTransferPayload = requisitesHcsTransferPayloadDto;
        this.me2meTopupPayload = me2MeTopupPayloadDto;
        this.aftTopupPayload = aftTopupPayloadDto;
    }

    public static /* synthetic */ TransferButtonDto copy$default(TransferButtonDto transferButtonDto, String str, String str2, String str3, boolean z, String str4, Themes themes, boolean z2, String str5, SelfTransferPayloadDto selfTransferPayloadDto, SelfTopupPayloadDto selfTopupPayloadDto, BottomSheetPayloadDto bottomSheetPayloadDto, SectionsSheetPayloadDto sectionsSheetPayloadDto, RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto, RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto, RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto, Me2MeTopupPayloadDto me2MeTopupPayloadDto, AftTopupPayloadDto aftTopupPayloadDto, int i, Object obj) {
        AftTopupPayloadDto aftTopupPayloadDto2;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto2;
        String str6;
        TransferButtonDto transferButtonDto2;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto2;
        String str7;
        String str8;
        boolean z3;
        String str9;
        Themes themes2;
        boolean z4;
        String str10;
        SelfTransferPayloadDto selfTransferPayloadDto2;
        SelfTopupPayloadDto selfTopupPayloadDto2;
        BottomSheetPayloadDto bottomSheetPayloadDto2;
        SectionsSheetPayloadDto sectionsSheetPayloadDto2;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto2;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto2;
        String str11 = (i & 1) != 0 ? transferButtonDto.id : str;
        String str12 = (i & 2) != 0 ? transferButtonDto.title : str2;
        String str13 = (i & 4) != 0 ? transferButtonDto.transferType : str3;
        boolean z5 = (i & 8) != 0 ? transferButtonDto.isCommentFieldEnabled : z;
        String str14 = (i & 16) != 0 ? transferButtonDto.hint : str4;
        Themes themes3 = (i & 32) != 0 ? transferButtonDto.themedImage : themes;
        boolean z6 = (i & 64) != 0 ? transferButtonDto.enabled : z2;
        String str15 = (i & 128) != 0 ? transferButtonDto.action : str5;
        SelfTransferPayloadDto selfTransferPayloadDto3 = (i & 256) != 0 ? transferButtonDto.selfTransferPayload : selfTransferPayloadDto;
        SelfTopupPayloadDto selfTopupPayloadDto3 = (i & 512) != 0 ? transferButtonDto.selfTopupPayload : selfTopupPayloadDto;
        BottomSheetPayloadDto bottomSheetPayloadDto3 = (i & 1024) != 0 ? transferButtonDto.itemsSheetPayload : bottomSheetPayloadDto;
        SectionsSheetPayloadDto sectionsSheetPayloadDto3 = (i & 2048) != 0 ? transferButtonDto.sectionsSheetPayload : sectionsSheetPayloadDto;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto3 = (i & 4096) != 0 ? transferButtonDto.requisitesPersonTransferPayload : requisitesPersonTransferPayloadDto;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto3 = (i & 8192) != 0 ? transferButtonDto.requisitesLegalTransferPayload : requisitesLegalTransferPayloadDto;
        String str16 = str11;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto3 = (i & 16384) != 0 ? transferButtonDto.requisitesHcsTransferPayload : requisitesHcsTransferPayloadDto;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto3 = (i & 32768) != 0 ? transferButtonDto.me2meTopupPayload : me2MeTopupPayloadDto;
        if ((i & 65536) != 0) {
            me2MeTopupPayloadDto2 = me2MeTopupPayloadDto3;
            aftTopupPayloadDto2 = transferButtonDto.aftTopupPayload;
            requisitesHcsTransferPayloadDto2 = requisitesHcsTransferPayloadDto3;
            str7 = str12;
            str8 = str13;
            z3 = z5;
            str9 = str14;
            themes2 = themes3;
            z4 = z6;
            str10 = str15;
            selfTransferPayloadDto2 = selfTransferPayloadDto3;
            selfTopupPayloadDto2 = selfTopupPayloadDto3;
            bottomSheetPayloadDto2 = bottomSheetPayloadDto3;
            sectionsSheetPayloadDto2 = sectionsSheetPayloadDto3;
            requisitesPersonTransferPayloadDto2 = requisitesPersonTransferPayloadDto3;
            requisitesLegalTransferPayloadDto2 = requisitesLegalTransferPayloadDto3;
            str6 = str16;
            transferButtonDto2 = transferButtonDto;
        } else {
            aftTopupPayloadDto2 = aftTopupPayloadDto;
            me2MeTopupPayloadDto2 = me2MeTopupPayloadDto3;
            str6 = str16;
            transferButtonDto2 = transferButtonDto;
            requisitesHcsTransferPayloadDto2 = requisitesHcsTransferPayloadDto3;
            str7 = str12;
            str8 = str13;
            z3 = z5;
            str9 = str14;
            themes2 = themes3;
            z4 = z6;
            str10 = str15;
            selfTransferPayloadDto2 = selfTransferPayloadDto3;
            selfTopupPayloadDto2 = selfTopupPayloadDto3;
            bottomSheetPayloadDto2 = bottomSheetPayloadDto3;
            sectionsSheetPayloadDto2 = sectionsSheetPayloadDto3;
            requisitesPersonTransferPayloadDto2 = requisitesPersonTransferPayloadDto3;
            requisitesLegalTransferPayloadDto2 = requisitesLegalTransferPayloadDto3;
        }
        return transferButtonDto2.copy(str6, str7, str8, z3, str9, themes2, z4, str10, selfTransferPayloadDto2, selfTopupPayloadDto2, bottomSheetPayloadDto2, sectionsSheetPayloadDto2, requisitesPersonTransferPayloadDto2, requisitesLegalTransferPayloadDto2, requisitesHcsTransferPayloadDto2, me2MeTopupPayloadDto2, aftTopupPayloadDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final SelfTopupPayloadDto getSelfTopupPayload() {
        return this.selfTopupPayload;
    }

    /* renamed from: component11, reason: from getter */
    public final BottomSheetPayloadDto getItemsSheetPayload() {
        return this.itemsSheetPayload;
    }

    /* renamed from: component12, reason: from getter */
    public final SectionsSheetPayloadDto getSectionsSheetPayload() {
        return this.sectionsSheetPayload;
    }

    /* renamed from: component13, reason: from getter */
    public final RequisitesPersonTransferPayloadDto getRequisitesPersonTransferPayload() {
        return this.requisitesPersonTransferPayload;
    }

    /* renamed from: component14, reason: from getter */
    public final RequisitesLegalTransferPayloadDto getRequisitesLegalTransferPayload() {
        return this.requisitesLegalTransferPayload;
    }

    /* renamed from: component15, reason: from getter */
    public final RequisitesHcsTransferPayloadDto getRequisitesHcsTransferPayload() {
        return this.requisitesHcsTransferPayload;
    }

    /* renamed from: component16, reason: from getter */
    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    /* renamed from: component17, reason: from getter */
    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCommentFieldEnabled() {
        return this.isCommentFieldEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final Themes<String> component6() {
        return this.themedImage;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component9, reason: from getter */
    public final SelfTransferPayloadDto getSelfTransferPayload() {
        return this.selfTransferPayload;
    }

    public final TransferButtonDto copy(@Json(name = "id") String id, @Json(name = "title") String title, @Json(name = "type") String transferType, @Json(name = "is_comment_field_enabled") boolean isCommentFieldEnabled, @Json(name = "hint") String hint, @Json(name = "image") Themes<String> themedImage, @Json(name = "enabled") boolean enabled, @Json(name = "action") String action, @Json(name = "self_transfer_payload") SelfTransferPayloadDto selfTransferPayload, @Json(name = "self_topup_payload") SelfTopupPayloadDto selfTopupPayload, @Json(name = "items_sheet_payload") BottomSheetPayloadDto itemsSheetPayload, @Json(name = "sections_sheet_payload") SectionsSheetPayloadDto sectionsSheetPayload, @Json(name = "requisites_person_transfer_payload") RequisitesPersonTransferPayloadDto requisitesPersonTransferPayload, @Json(name = "requisites_legal_transfer_payload") RequisitesLegalTransferPayloadDto requisitesLegalTransferPayload, @Json(name = "requisites_hcs_transfer_payload") RequisitesHcsTransferPayloadDto requisitesHcsTransferPayload, @Json(name = "me2me_topup_payload") Me2MeTopupPayloadDto me2meTopupPayload, @Json(name = "aft_topup_payload") AftTopupPayloadDto aftTopupPayload) {
        return new TransferButtonDto(id, title, transferType, isCommentFieldEnabled, hint, themedImage, enabled, action, selfTransferPayload, selfTopupPayload, itemsSheetPayload, sectionsSheetPayload, requisitesPersonTransferPayload, requisitesLegalTransferPayload, requisitesHcsTransferPayload, me2meTopupPayload, aftTopupPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferButtonDto)) {
            return false;
        }
        TransferButtonDto transferButtonDto = (TransferButtonDto) other;
        return jl40.l(this.id, transferButtonDto.id) && jl40.l(this.title, transferButtonDto.title) && jl40.l(this.transferType, transferButtonDto.transferType) && this.isCommentFieldEnabled == transferButtonDto.isCommentFieldEnabled && jl40.l(this.hint, transferButtonDto.hint) && jl40.l(this.themedImage, transferButtonDto.themedImage) && this.enabled == transferButtonDto.enabled && jl40.l(this.action, transferButtonDto.action) && jl40.l(this.selfTransferPayload, transferButtonDto.selfTransferPayload) && jl40.l(this.selfTopupPayload, transferButtonDto.selfTopupPayload) && jl40.l(this.itemsSheetPayload, transferButtonDto.itemsSheetPayload) && jl40.l(this.sectionsSheetPayload, transferButtonDto.sectionsSheetPayload) && jl40.l(this.requisitesPersonTransferPayload, transferButtonDto.requisitesPersonTransferPayload) && jl40.l(this.requisitesLegalTransferPayload, transferButtonDto.requisitesLegalTransferPayload) && jl40.l(this.requisitesHcsTransferPayload, transferButtonDto.requisitesHcsTransferPayload) && jl40.l(this.me2meTopupPayload, transferButtonDto.me2meTopupPayload) && jl40.l(this.aftTopupPayload, transferButtonDto.aftTopupPayload);
    }

    public final String getAction() {
        return this.action;
    }

    public final AftTopupPayloadDto getAftTopupPayload() {
        return this.aftTopupPayload;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getId() {
        return this.id;
    }

    public final BottomSheetPayloadDto getItemsSheetPayload() {
        return this.itemsSheetPayload;
    }

    public final Me2MeTopupPayloadDto getMe2meTopupPayload() {
        return this.me2meTopupPayload;
    }

    public final RequisitesHcsTransferPayloadDto getRequisitesHcsTransferPayload() {
        return this.requisitesHcsTransferPayload;
    }

    public final RequisitesLegalTransferPayloadDto getRequisitesLegalTransferPayload() {
        return this.requisitesLegalTransferPayload;
    }

    public final RequisitesPersonTransferPayloadDto getRequisitesPersonTransferPayload() {
        return this.requisitesPersonTransferPayload;
    }

    public final SectionsSheetPayloadDto getSectionsSheetPayload() {
        return this.sectionsSheetPayload;
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

    public final String getTransferType() {
        return this.transferType;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.title);
        String str = this.transferType;
        int e = unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCommentFieldEnabled);
        String str2 = this.hint;
        int e2 = unr0.e(nnm.c(this.themedImage, (e + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.enabled);
        String str3 = this.action;
        int hashCode = (e2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SelfTransferPayloadDto selfTransferPayloadDto = this.selfTransferPayload;
        int hashCode2 = (hashCode + (selfTransferPayloadDto == null ? 0 : selfTransferPayloadDto.hashCode())) * 31;
        SelfTopupPayloadDto selfTopupPayloadDto = this.selfTopupPayload;
        int hashCode3 = (hashCode2 + (selfTopupPayloadDto == null ? 0 : selfTopupPayloadDto.hashCode())) * 31;
        BottomSheetPayloadDto bottomSheetPayloadDto = this.itemsSheetPayload;
        int hashCode4 = (hashCode3 + (bottomSheetPayloadDto == null ? 0 : bottomSheetPayloadDto.hashCode())) * 31;
        SectionsSheetPayloadDto sectionsSheetPayloadDto = this.sectionsSheetPayload;
        int hashCode5 = (hashCode4 + (sectionsSheetPayloadDto == null ? 0 : sectionsSheetPayloadDto.hashCode())) * 31;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto = this.requisitesPersonTransferPayload;
        int hashCode6 = (hashCode5 + (requisitesPersonTransferPayloadDto == null ? 0 : requisitesPersonTransferPayloadDto.hashCode())) * 31;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto = this.requisitesLegalTransferPayload;
        int hashCode7 = (hashCode6 + (requisitesLegalTransferPayloadDto == null ? 0 : requisitesLegalTransferPayloadDto.hashCode())) * 31;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto = this.requisitesHcsTransferPayload;
        int hashCode8 = (hashCode7 + (requisitesHcsTransferPayloadDto == null ? 0 : requisitesHcsTransferPayloadDto.hashCode())) * 31;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = this.me2meTopupPayload;
        int hashCode9 = (hashCode8 + (me2MeTopupPayloadDto == null ? 0 : me2MeTopupPayloadDto.hashCode())) * 31;
        AftTopupPayloadDto aftTopupPayloadDto = this.aftTopupPayload;
        return hashCode9 + (aftTopupPayloadDto != null ? aftTopupPayloadDto.hashCode() : 0);
    }

    public final boolean isCommentFieldEnabled() {
        return this.isCommentFieldEnabled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.transferType;
        boolean z = this.isCommentFieldEnabled;
        String str4 = this.hint;
        Themes<String> themes = this.themedImage;
        boolean z2 = this.enabled;
        String str5 = this.action;
        SelfTransferPayloadDto selfTransferPayloadDto = this.selfTransferPayload;
        SelfTopupPayloadDto selfTopupPayloadDto = this.selfTopupPayload;
        BottomSheetPayloadDto bottomSheetPayloadDto = this.itemsSheetPayload;
        SectionsSheetPayloadDto sectionsSheetPayloadDto = this.sectionsSheetPayload;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayloadDto = this.requisitesPersonTransferPayload;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayloadDto = this.requisitesLegalTransferPayload;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayloadDto = this.requisitesHcsTransferPayload;
        Me2MeTopupPayloadDto me2MeTopupPayloadDto = this.me2meTopupPayload;
        AftTopupPayloadDto aftTopupPayloadDto = this.aftTopupPayload;
        StringBuilder v = b64.v("TransferButtonDto(id=", str, ", title=", str2, ", transferType=");
        tse0.y(str3, ", isCommentFieldEnabled=", ", hint=", v, z);
        n.B(v, str4, ", themedImage=", themes, ", enabled=");
        unr0.A(", action=", str5, ", selfTransferPayload=", v, z2);
        v.append(selfTransferPayloadDto);
        v.append(", selfTopupPayload=");
        v.append(selfTopupPayloadDto);
        v.append(", itemsSheetPayload=");
        v.append(bottomSheetPayloadDto);
        v.append(", sectionsSheetPayload=");
        v.append(sectionsSheetPayloadDto);
        v.append(", requisitesPersonTransferPayload=");
        v.append(requisitesPersonTransferPayloadDto);
        v.append(", requisitesLegalTransferPayload=");
        v.append(requisitesLegalTransferPayloadDto);
        v.append(", requisitesHcsTransferPayload=");
        v.append(requisitesHcsTransferPayloadDto);
        v.append(", me2meTopupPayload=");
        v.append(me2MeTopupPayloadDto);
        v.append(", aftTopupPayload=");
        v.append(aftTopupPayloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
