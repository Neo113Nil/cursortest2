package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Money;", "listOfAutoTopupSettingsV2MoneyAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ChangeSettingBottomSheet;", "autoTopupSettingsV2ChangeSettingBottomSheetAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2SettingDataJsonAdapter extends JsonAdapter<AutoTopupSettingsV2SettingData> {
    private final JsonAdapter<AutoTopupSettingsV2ChangeSettingBottomSheet> autoTopupSettingsV2ChangeSettingBottomSheetAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AutoTopupSettingsV2SettingData> constructorRef;
    private final JsonAdapter<List<AutoTopupSettingsV2Money>> listOfAutoTopupSettingsV2MoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "amounts", "change_setting_bottom_sheet", "unselected_payment_method_action");

    public AutoTopupSettingsV2SettingDataJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, BackendConfig.Restrictions.ENABLED);
        this.listOfAutoTopupSettingsV2MoneyAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupSettingsV2Money.class), emptySet, "amounts");
        this.autoTopupSettingsV2ChangeSettingBottomSheetAdapter = moshi.adapter(AutoTopupSettingsV2ChangeSettingBottomSheet.class, emptySet, "changeSettingBottomSheet");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "unselectedPaymentMethodAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsV2SettingData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        List<AutoTopupSettingsV2Money> list = null;
        AutoTopupSettingsV2ChangeSettingBottomSheet autoTopupSettingsV2ChangeSettingBottomSheet = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfAutoTopupSettingsV2MoneyAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("amounts", "amounts", jsonReader);
                }
            } else if (selectName == 2) {
                autoTopupSettingsV2ChangeSettingBottomSheet = this.autoTopupSettingsV2ChangeSettingBottomSheetAdapter.fromJson(jsonReader);
                if (autoTopupSettingsV2ChangeSettingBottomSheet == null) {
                    throw Util.unexpectedNull("changeSettingBottomSheet", "change_setting_bottom_sheet", jsonReader);
                }
            } else if (selectName == 3) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (bool == null) {
                throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
            }
            boolean booleanValue = bool.booleanValue();
            if (list == null) {
                throw Util.missingProperty("amounts", "amounts", jsonReader);
            }
            if (autoTopupSettingsV2ChangeSettingBottomSheet != null) {
                return new AutoTopupSettingsV2SettingData(booleanValue, list, autoTopupSettingsV2ChangeSettingBottomSheet, str);
            }
            throw Util.missingProperty("changeSettingBottomSheet", "change_setting_bottom_sheet", jsonReader);
        }
        Constructor<AutoTopupSettingsV2SettingData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AutoTopupSettingsV2SettingData.class.getDeclaredConstructor(Boolean.TYPE, List.class, AutoTopupSettingsV2ChangeSettingBottomSheet.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (bool == null) {
            throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("amounts", "amounts", jsonReader);
        }
        if (autoTopupSettingsV2ChangeSettingBottomSheet != null) {
            return constructor.newInstance(bool, list, autoTopupSettingsV2ChangeSettingBottomSheet, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("changeSettingBottomSheet", "change_setting_bottom_sheet", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData) {
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SettingData;
        if (autoTopupSettingsV2SettingData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(autoTopupSettingsV2SettingData2.getEnabled()));
        jsonWriter.name("amounts");
        this.listOfAutoTopupSettingsV2MoneyAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SettingData2.getAmounts());
        jsonWriter.name("change_setting_bottom_sheet");
        this.autoTopupSettingsV2ChangeSettingBottomSheetAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SettingData2.getChangeSettingBottomSheet());
        jsonWriter.name("unselected_payment_method_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsV2SettingData2.getUnselectedPaymentMethodAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(AutoTopupSettingsV2SettingData)");
    }
}
