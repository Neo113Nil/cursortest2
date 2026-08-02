package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;", "autoTopupSettingsV2ToolbarAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;", "autoTopupSettingsV2SettingDataAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;", "autoTopupSettingsPaymentV4DataAdapter", "nullableStringAdapter", "", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;", "autoTopupSettingsV2ExitBottomSheetAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Prefill;", "nullableAutoTopupSettingsV2PrefillAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2SuccessDataJsonAdapter extends JsonAdapter<AutoTopupSettingsV2SuccessData> {
    private final JsonAdapter<AutoTopupSettingsPaymentV4Data> autoTopupSettingsPaymentV4DataAdapter;
    private final JsonAdapter<AutoTopupSettingsV2ExitBottomSheet> autoTopupSettingsV2ExitBottomSheetAdapter;
    private final JsonAdapter<AutoTopupSettingsV2SettingData> autoTopupSettingsV2SettingDataAdapter;
    private final JsonAdapter<AutoTopupSettingsV2Toolbar> autoTopupSettingsV2ToolbarAdapter;
    private volatile Constructor<AutoTopupSettingsV2SuccessData> constructorRef;
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<AutoTopupSettingsV2Prefill> nullableAutoTopupSettingsV2PrefillAdapter;
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonAdapter<List<FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "toolbar", "divkit_content_main_block", "autotopup", "autofund", "payment_methods", "autotopup_id", "fullscreens", "selected_payment_method", "exit_bottom_sheet", "prefill");
    private final JsonAdapter<String> stringAdapter;

    public AutoTopupSettingsV2SuccessDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.autoTopupSettingsV2ToolbarAdapter = moshi.adapter(AutoTopupSettingsV2Toolbar.class, emptySet, "toolbar");
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitContentMainBlock");
        this.autoTopupSettingsV2SettingDataAdapter = moshi.adapter(AutoTopupSettingsV2SettingData.class, emptySet, "autotopup");
        this.autoTopupSettingsPaymentV4DataAdapter = moshi.adapter(AutoTopupSettingsPaymentV4Data.class, emptySet, "paymentMethods");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autotopupId");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, FullScreenDto.class), emptySet, "fullscreens");
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "selectedPaymentMethod");
        this.autoTopupSettingsV2ExitBottomSheetAdapter = moshi.adapter(AutoTopupSettingsV2ExitBottomSheet.class, emptySet, "exitBottomSheet");
        this.nullableAutoTopupSettingsV2PrefillAdapter = moshi.adapter(AutoTopupSettingsV2Prefill.class, emptySet, "prefill");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2SuccessData fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar = null;
        DivDataDto divDataDto = null;
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData = null;
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2 = null;
        AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data = null;
        String str2 = null;
        List<FullScreenDto> list = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet = null;
        AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill = null;
        while (true) {
            String str3 = str;
            AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar2 = autoTopupSettingsV2Toolbar;
            DivDataDto divDataDto2 = divDataDto;
            AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData3 = autoTopupSettingsV2SettingData;
            AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData4 = autoTopupSettingsV2SettingData2;
            AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data2 = autoTopupSettingsPaymentV4Data;
            String str4 = str2;
            List<FullScreenDto> list2 = list;
            CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
            if (!jsonReader.hasNext()) {
                AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet2 = autoTopupSettingsV2ExitBottomSheet;
                jsonReader.endObject();
                if (i2 == -1025) {
                    if (str3 == null) {
                        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                    }
                    if (autoTopupSettingsV2Toolbar2 == null) {
                        throw Util.missingProperty("toolbar", "toolbar", jsonReader);
                    }
                    if (divDataDto2 == null) {
                        throw Util.missingProperty("divkitContentMainBlock", "divkit_content_main_block", jsonReader);
                    }
                    if (autoTopupSettingsV2SettingData3 == null) {
                        throw Util.missingProperty("autotopup", "autotopup", jsonReader);
                    }
                    if (autoTopupSettingsV2SettingData4 == null) {
                        throw Util.missingProperty("autofund", "autofund", jsonReader);
                    }
                    if (autoTopupSettingsPaymentV4Data2 == null) {
                        throw Util.missingProperty("paymentMethods", "payment_methods", jsonReader);
                    }
                    if (autoTopupSettingsV2ExitBottomSheet2 != null) {
                        return new AutoTopupSettingsV2SuccessData(str3, autoTopupSettingsV2Toolbar2, divDataDto2, autoTopupSettingsV2SettingData3, autoTopupSettingsV2SettingData4, autoTopupSettingsPaymentV4Data2, str4, list2, currentPaymentMethodDto2, autoTopupSettingsV2ExitBottomSheet2, autoTopupSettingsV2Prefill);
                    }
                    throw Util.missingProperty("exitBottomSheet", "exit_bottom_sheet", jsonReader);
                }
                Constructor<AutoTopupSettingsV2SuccessData> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = AutoTopupSettingsV2SuccessData.class.getDeclaredConstructor(String.class, AutoTopupSettingsV2Toolbar.class, DivDataDto.class, AutoTopupSettingsV2SettingData.class, AutoTopupSettingsV2SettingData.class, AutoTopupSettingsPaymentV4Data.class, String.class, List.class, CurrentPaymentMethodDto.class, AutoTopupSettingsV2ExitBottomSheet.class, AutoTopupSettingsV2Prefill.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<AutoTopupSettingsV2SuccessData> constructor2 = constructor;
                if (str3 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (autoTopupSettingsV2Toolbar2 == null) {
                    throw Util.missingProperty("toolbar", "toolbar", jsonReader);
                }
                if (divDataDto2 == null) {
                    throw Util.missingProperty("divkitContentMainBlock", "divkit_content_main_block", jsonReader);
                }
                if (autoTopupSettingsV2SettingData3 == null) {
                    throw Util.missingProperty("autotopup", "autotopup", jsonReader);
                }
                if (autoTopupSettingsV2SettingData4 == null) {
                    throw Util.missingProperty("autofund", "autofund", jsonReader);
                }
                if (autoTopupSettingsPaymentV4Data2 == null) {
                    throw Util.missingProperty("paymentMethods", "payment_methods", jsonReader);
                }
                if (autoTopupSettingsV2ExitBottomSheet2 == null) {
                    throw Util.missingProperty("exitBottomSheet", "exit_bottom_sheet", jsonReader);
                }
                return constructor2.newInstance(str3, autoTopupSettingsV2Toolbar2, divDataDto2, autoTopupSettingsV2SettingData3, autoTopupSettingsV2SettingData4, autoTopupSettingsPaymentV4Data2, str4, list2, currentPaymentMethodDto2, autoTopupSettingsV2ExitBottomSheet2, autoTopupSettingsV2Prefill, Integer.valueOf(i), null);
            }
            AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet3 = autoTopupSettingsV2ExitBottomSheet;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 1:
                    autoTopupSettingsV2Toolbar = this.autoTopupSettingsV2ToolbarAdapter.fromJson(jsonReader);
                    if (autoTopupSettingsV2Toolbar == null) {
                        throw Util.unexpectedNull("toolbar", "toolbar", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 2:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("divkitContentMainBlock", "divkit_content_main_block", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 3:
                    autoTopupSettingsV2SettingData = this.autoTopupSettingsV2SettingDataAdapter.fromJson(jsonReader);
                    if (autoTopupSettingsV2SettingData == null) {
                        throw Util.unexpectedNull("autotopup", "autotopup", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 4:
                    autoTopupSettingsV2SettingData2 = this.autoTopupSettingsV2SettingDataAdapter.fromJson(jsonReader);
                    if (autoTopupSettingsV2SettingData2 == null) {
                        throw Util.unexpectedNull("autofund", "autofund", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 5:
                    autoTopupSettingsPaymentV4Data = this.autoTopupSettingsPaymentV4DataAdapter.fromJson(jsonReader);
                    if (autoTopupSettingsPaymentV4Data == null) {
                        throw Util.unexpectedNull("paymentMethods", "payment_methods", jsonReader);
                    }
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 7:
                    list = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 8:
                    currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                case 9:
                    autoTopupSettingsV2ExitBottomSheet = this.autoTopupSettingsV2ExitBottomSheetAdapter.fromJson(jsonReader);
                    if (autoTopupSettingsV2ExitBottomSheet == null) {
                        throw Util.unexpectedNull("exitBottomSheet", "exit_bottom_sheet", jsonReader);
                    }
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                case 10:
                    autoTopupSettingsV2Prefill = this.nullableAutoTopupSettingsV2PrefillAdapter.fromJson(jsonReader);
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    i2 = -1025;
                default:
                    autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2ExitBottomSheet3;
                    str = str3;
                    autoTopupSettingsV2Toolbar = autoTopupSettingsV2Toolbar2;
                    divDataDto = divDataDto2;
                    autoTopupSettingsV2SettingData = autoTopupSettingsV2SettingData3;
                    autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData4;
                    autoTopupSettingsPaymentV4Data = autoTopupSettingsPaymentV4Data2;
                    str2 = str4;
                    list = list2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData) {
        AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData2 = autoTopupSettingsV2SuccessData;
        if (autoTopupSettingsV2SuccessData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getAgreementId());
        jsonWriter.name("toolbar");
        this.autoTopupSettingsV2ToolbarAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getToolbar());
        jsonWriter.name("divkit_content_main_block");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getDivkitContentMainBlock());
        jsonWriter.name("autotopup");
        this.autoTopupSettingsV2SettingDataAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getAutotopup());
        jsonWriter.name("autofund");
        this.autoTopupSettingsV2SettingDataAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getAutofund());
        jsonWriter.name("payment_methods");
        this.autoTopupSettingsPaymentV4DataAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getPaymentMethods());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getAutotopupId());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getFullscreens());
        jsonWriter.name("selected_payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getSelectedPaymentMethod());
        jsonWriter.name("exit_bottom_sheet");
        this.autoTopupSettingsV2ExitBottomSheetAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getExitBottomSheet());
        jsonWriter.name("prefill");
        this.nullableAutoTopupSettingsV2PrefillAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SuccessData2.getPrefill());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(AutoTopupSettingsV2SuccessData)");
    }
}
