package com.ybsdk.feature.autotopup.internal.domain.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusResultDataEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.aa4;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/utils/text/Text;", "nullableTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "textAdapter", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "themedImageUrlEntityAdapter", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;", "statusAdapter", "", "booleanAdapter", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "actionButtonEntityAdapter", "nullableActionButtonEntityAdapter", "", "nullableStringAdapter", "Laa4;", "nullableLoadingDataEntityAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "nullableSaveAutoTopupRequestAdapter", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "nullableRegularAutotopupEntityAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutotopupPaymentStatusResultDataEntityJsonAdapter extends JsonAdapter<AutotopupPaymentStatusResultDataEntity> {
    private final JsonAdapter<ActionButtonEntity> actionButtonEntityAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ActionButtonEntity> nullableActionButtonEntityAdapter;
    private final JsonAdapter<aa4> nullableLoadingDataEntityAdapter;
    private final JsonAdapter<RegularAutotopupEntity> nullableRegularAutotopupEntityAdapter;
    private final JsonAdapter<SaveAutoTopupRequest> nullableSaveAutoTopupRequestAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Text> nullableTextAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "logo", ACSPConstants.STATUS, "isLogoWithStatus", "primaryButton", "secondaryButton", "failedPaymentId", "loadingData", "saveAutoTopupRequest", "regularAutotopup");
    private final JsonAdapter<AutotopupPaymentStatusResultDataEntity.Status> statusAdapter;
    private final JsonAdapter<Text> textAdapter;
    private final JsonAdapter<ThemedImageUrlEntity> themedImageUrlEntityAdapter;

    public AutotopupPaymentStatusResultDataEntityJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTextAdapter = moshi.adapter(Text.class, emptySet, "title");
        this.textAdapter = moshi.adapter(Text.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themedImageUrlEntityAdapter = moshi.adapter(ThemedImageUrlEntity.class, emptySet, "logo");
        this.statusAdapter = moshi.adapter(AutotopupPaymentStatusResultDataEntity.Status.class, emptySet, ACSPConstants.STATUS);
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isLogoWithStatus");
        this.actionButtonEntityAdapter = moshi.adapter(ActionButtonEntity.class, emptySet, "primaryButton");
        this.nullableActionButtonEntityAdapter = moshi.adapter(ActionButtonEntity.class, emptySet, "secondaryButton");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "failedPaymentId");
        this.nullableLoadingDataEntityAdapter = moshi.adapter(aa4.class, emptySet, "loadingData");
        this.nullableSaveAutoTopupRequestAdapter = moshi.adapter(SaveAutoTopupRequest.class, emptySet, "saveAutoTopupRequest");
        this.nullableRegularAutotopupEntityAdapter = moshi.adapter(RegularAutotopupEntity.class, emptySet, "regularAutotopup");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutotopupPaymentStatusResultDataEntity fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Text text = null;
        Text text2 = null;
        Text text3 = null;
        ThemedImageUrlEntity themedImageUrlEntity = null;
        AutotopupPaymentStatusResultDataEntity.Status status = null;
        ActionButtonEntity actionButtonEntity = null;
        ActionButtonEntity actionButtonEntity2 = null;
        String str = null;
        aa4 aa4Var = null;
        SaveAutoTopupRequest saveAutoTopupRequest = null;
        RegularAutotopupEntity regularAutotopupEntity = null;
        while (true) {
            Boolean bool2 = bool;
            Text text4 = text;
            Text text5 = text2;
            if (!jsonReader.hasNext()) {
                Text text6 = text3;
                jsonReader.endObject();
                if (text5 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (themedImageUrlEntity == null) {
                    throw Util.missingProperty("logo", "logo", jsonReader);
                }
                if (status == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (bool2 == null) {
                    throw Util.missingProperty("isLogoWithStatus", "isLogoWithStatus", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (actionButtonEntity != null) {
                    return new AutotopupPaymentStatusResultDataEntity(text4, text5, text6, themedImageUrlEntity, status, booleanValue, actionButtonEntity, actionButtonEntity2, str, aa4Var, saveAutoTopupRequest, regularAutotopupEntity);
                }
                throw Util.missingProperty("primaryButton", "primaryButton", jsonReader);
            }
            Text text7 = text3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 0:
                    text = this.nullableTextAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text2 = text5;
                case 1:
                    text2 = this.textAdapter.fromJson(jsonReader);
                    if (text2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                case 2:
                    text3 = this.nullableTextAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text = text4;
                    text2 = text5;
                case 3:
                    themedImageUrlEntity = this.themedImageUrlEntityAdapter.fromJson(jsonReader);
                    if (themedImageUrlEntity == null) {
                        throw Util.unexpectedNull("logo", "logo", jsonReader);
                    }
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 4:
                    status = this.statusAdapter.fromJson(jsonReader);
                    if (status == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 5:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isLogoWithStatus", "isLogoWithStatus", jsonReader);
                    }
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 6:
                    actionButtonEntity = this.actionButtonEntityAdapter.fromJson(jsonReader);
                    if (actionButtonEntity == null) {
                        throw Util.unexpectedNull("primaryButton", "primaryButton", jsonReader);
                    }
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 7:
                    actionButtonEntity2 = this.nullableActionButtonEntityAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 8:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 9:
                    aa4Var = this.nullableLoadingDataEntityAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 10:
                    saveAutoTopupRequest = this.nullableSaveAutoTopupRequestAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                case 11:
                    regularAutotopupEntity = this.nullableRegularAutotopupEntityAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
                default:
                    bool = bool2;
                    text3 = text7;
                    text = text4;
                    text2 = text5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity) {
        AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity2 = autotopupPaymentStatusResultDataEntity;
        if (autotopupPaymentStatusResultDataEntity2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableTextAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.textAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getDescription());
        jsonWriter.name("amount");
        this.nullableTextAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getAmount());
        jsonWriter.name("logo");
        this.themedImageUrlEntityAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getLogo());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getStatus());
        jsonWriter.name("isLogoWithStatus");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(autotopupPaymentStatusResultDataEntity2.isLogoWithStatus()));
        jsonWriter.name("primaryButton");
        this.actionButtonEntityAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getPrimaryButton());
        jsonWriter.name("secondaryButton");
        this.nullableActionButtonEntityAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getSecondaryButton());
        jsonWriter.name("failedPaymentId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getFailedPaymentId());
        jsonWriter.name("loadingData");
        this.nullableLoadingDataEntityAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getLoadingData());
        jsonWriter.name("saveAutoTopupRequest");
        this.nullableSaveAutoTopupRequestAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getSaveAutoTopupRequest());
        jsonWriter.name("regularAutotopup");
        this.nullableRegularAutotopupEntityAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultDataEntity2.getRegularAutotopup());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(AutotopupPaymentStatusResultDataEntity)");
    }
}
