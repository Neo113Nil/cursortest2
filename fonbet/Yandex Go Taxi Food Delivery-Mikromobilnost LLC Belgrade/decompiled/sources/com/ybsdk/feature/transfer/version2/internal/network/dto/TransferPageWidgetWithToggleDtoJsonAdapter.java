package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/ControlColor;", "controlColorAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InfoButton;", "infoButtonAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableMoneyAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferPageWidgetWithToggleDtoJsonAdapter extends JsonAdapter<TransferPageWidgetWithToggleDto> {
    private final JsonAdapter<ControlColor> controlColorAdapter;
    private final JsonAdapter<InfoButton> infoButtonAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "text_color", "background_color", "control_color", "info_button", "autofund_amount", "autotopup_amount", "autotopup_threshold");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public TransferPageWidgetWithToggleDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "textColor");
        this.controlColorAdapter = moshi.adapter(ControlColor.class, emptySet, "controlColor");
        this.infoButtonAdapter = moshi.adapter(InfoButton.class, emptySet, "infoButton");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "autoFundAmount");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "autoTopupAmount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransferPageWidgetWithToggleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Themes<String> themes = null;
        Themes<String> themes2 = null;
        ControlColor controlColor = null;
        InfoButton infoButton = null;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        while (true) {
            String str2 = str;
            Themes<String> themes3 = themes;
            Themes<String> themes4 = themes2;
            ControlColor controlColor2 = controlColor;
            InfoButton infoButton2 = infoButton;
            if (!jsonReader.hasNext()) {
                Money money4 = money;
                jsonReader.endObject();
                if (str2 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (themes3 == null) {
                    throw Util.missingProperty("textColor", "text_color", jsonReader);
                }
                if (themes4 == null) {
                    throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                }
                if (controlColor2 == null) {
                    throw Util.missingProperty("controlColor", "control_color", jsonReader);
                }
                if (infoButton2 == null) {
                    throw Util.missingProperty("infoButton", "info_button", jsonReader);
                }
                if (money4 != null) {
                    return new TransferPageWidgetWithToggleDto(str2, themes3, themes4, controlColor2, infoButton2, money4, money2, money3);
                }
                throw Util.missingProperty("autoFundAmount", "autofund_amount", jsonReader);
            }
            Money money5 = money;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    money = money5;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 1:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("textColor", "text_color", jsonReader);
                    }
                    money = money5;
                    str = str2;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 2:
                    themes2 = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes2 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    money = money5;
                    str = str2;
                    themes = themes3;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 3:
                    controlColor = this.controlColorAdapter.fromJson(jsonReader);
                    if (controlColor == null) {
                        throw Util.unexpectedNull("controlColor", "control_color", jsonReader);
                    }
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    infoButton = infoButton2;
                case 4:
                    infoButton = this.infoButtonAdapter.fromJson(jsonReader);
                    if (infoButton == null) {
                        throw Util.unexpectedNull("infoButton", "info_button", jsonReader);
                    }
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                case 5:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("autoFundAmount", "autofund_amount", jsonReader);
                    }
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 6:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                case 7:
                    money3 = this.nullableMoneyAdapter.fromJson(jsonReader);
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
                default:
                    money = money5;
                    str = str2;
                    themes = themes3;
                    themes2 = themes4;
                    controlColor = controlColor2;
                    infoButton = infoButton2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto) {
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto2 = transferPageWidgetWithToggleDto;
        if (transferPageWidgetWithToggleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getTitle());
        jsonWriter.name("text_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getTextColor());
        jsonWriter.name("background_color");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getBackgroundColor());
        jsonWriter.name("control_color");
        this.controlColorAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getControlColor());
        jsonWriter.name("info_button");
        this.infoButtonAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getInfoButton());
        jsonWriter.name("autofund_amount");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getAutoFundAmount());
        jsonWriter.name("autotopup_amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getAutoTopupAmount());
        jsonWriter.name("autotopup_threshold");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transferPageWidgetWithToggleDto2.getAutoTopupThreshold());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(TransferPageWidgetWithToggleDto)");
    }
}
