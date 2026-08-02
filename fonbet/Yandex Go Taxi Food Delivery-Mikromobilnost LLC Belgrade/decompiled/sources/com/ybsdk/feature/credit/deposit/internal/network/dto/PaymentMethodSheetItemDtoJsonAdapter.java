package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "coloredTextDtoAdapter", "nullableColoredTextDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/AftInfo;", "nullableAftInfoAdapter", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/WalletInfo;", "nullableWalletInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodSheetItemDtoJsonAdapter extends JsonAdapter<PaymentMethodSheetItemDto> {
    private final JsonAdapter<ColoredTextDto> coloredTextDtoAdapter;
    private volatile Constructor<PaymentMethodSheetItemDto> constructorRef;
    private final JsonAdapter<AftInfo> nullableAftInfoAdapter;
    private final JsonAdapter<ColoredTextDto> nullableColoredTextDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<WalletInfo> nullableWalletInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_method_id", "client_selection_id", "payment_method_type", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "header_description", "image", "aft_info", "wallet_info");
    private final JsonAdapter<String> stringAdapter;

    public PaymentMethodSheetItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodType");
        this.coloredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, "title");
        this.nullableColoredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.nullableAftInfoAdapter = moshi.adapter(AftInfo.class, emptySet, "aftInfo");
        this.nullableWalletInfoAdapter = moshi.adapter(WalletInfo.class, emptySet, "walletInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentMethodSheetItemDto fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        ColoredTextDto coloredTextDto = null;
        ColoredTextDto coloredTextDto2 = null;
        ColoredTextDto coloredTextDto3 = null;
        Themes<String> themes = null;
        AftInfo aftInfo = null;
        WalletInfo walletInfo = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("paymentMethodType", "payment_method_type", jsonReader);
                    }
                    break;
                case 3:
                    coloredTextDto = this.coloredTextDtoAdapter.fromJson(jsonReader);
                    if (coloredTextDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 4:
                    coloredTextDto2 = this.nullableColoredTextDtoAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    break;
                case 5:
                    coloredTextDto3 = this.nullableColoredTextDtoAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    break;
                case 6:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    break;
                case 7:
                    aftInfo = this.nullableAftInfoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    walletInfo = this.nullableWalletInfoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i2 == -116) {
            WalletInfo walletInfo2 = walletInfo;
            AftInfo aftInfo2 = aftInfo;
            Themes<String> themes2 = themes;
            ColoredTextDto coloredTextDto4 = coloredTextDto3;
            ColoredTextDto coloredTextDto5 = coloredTextDto2;
            ColoredTextDto coloredTextDto6 = coloredTextDto;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            if (str4 == null) {
                throw Util.missingProperty("paymentMethodType", "payment_method_type", jsonReader);
            }
            if (coloredTextDto6 != null) {
                return new PaymentMethodSheetItemDto(str6, str5, str4, coloredTextDto6, coloredTextDto5, coloredTextDto4, themes2, aftInfo2, walletInfo2);
            }
            throw Util.missingProperty("title", "title", jsonReader);
        }
        WalletInfo walletInfo3 = walletInfo;
        AftInfo aftInfo3 = aftInfo;
        Themes<String> themes3 = themes;
        ColoredTextDto coloredTextDto7 = coloredTextDto3;
        ColoredTextDto coloredTextDto8 = coloredTextDto2;
        ColoredTextDto coloredTextDto9 = coloredTextDto;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Constructor<PaymentMethodSheetItemDto> constructor = this.constructorRef;
        if (constructor == null) {
            i = i2;
            constructor = PaymentMethodSheetItemDto.class.getDeclaredConstructor(String.class, String.class, String.class, ColoredTextDto.class, ColoredTextDto.class, ColoredTextDto.class, Themes.class, AftInfo.class, WalletInfo.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        } else {
            i = i2;
        }
        Constructor<PaymentMethodSheetItemDto> constructor2 = constructor;
        if (str7 == null) {
            throw Util.missingProperty("paymentMethodType", "payment_method_type", jsonReader);
        }
        if (coloredTextDto9 != null) {
            return constructor2.newInstance(str9, str8, str7, coloredTextDto9, coloredTextDto8, coloredTextDto7, themes3, aftInfo3, walletInfo3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentMethodSheetItemDto paymentMethodSheetItemDto) {
        PaymentMethodSheetItemDto paymentMethodSheetItemDto2 = paymentMethodSheetItemDto;
        if (paymentMethodSheetItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getPaymentMethodId());
        jsonWriter.name("client_selection_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getClientSelectionId());
        jsonWriter.name("payment_method_type");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getPaymentMethodType());
        jsonWriter.name("title");
        this.coloredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableColoredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getDescription());
        jsonWriter.name("header_description");
        this.nullableColoredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getHeaderDescription());
        jsonWriter.name("image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getImage());
        jsonWriter.name("aft_info");
        this.nullableAftInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getAftInfo());
        jsonWriter.name("wallet_info");
        this.nullableWalletInfoAdapter.toJson(jsonWriter, (JsonWriter) paymentMethodSheetItemDto2.getWalletInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(PaymentMethodSheetItemDto)");
    }
}
