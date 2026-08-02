package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.hg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderReceiverDto;", "crossBorderReceiverDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "", "stringAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderCheckUserPartnerSuccessDtoJsonAdapter extends JsonAdapter<CrossBorderCheckUserPartnerSuccessDto> {
    private volatile Constructor<CrossBorderCheckUserPartnerSuccessDto> constructorRef;
    private final JsonAdapter<CrossBorderReceiverDto> crossBorderReceiverDtoAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderCheckUserPartnerSuccessDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = hg91.g;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ hg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("receiver", "currency_rate", "currency", new String(bArr2, uza.a), "fee", "convertation_template");
        EmptySet emptySet = EmptySet.a;
        this.crossBorderReceiverDtoAdapter = moshi.adapter(CrossBorderReceiverDto.class, emptySet, "receiver");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "currencyRate");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "currency");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "fee");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderCheckUserPartnerSuccessDto fromJson(JsonReader jsonReader) {
        int i;
        byte[] bArr = hg91.a;
        byte[] bArr2 = hg91.g;
        jsonReader.beginObject();
        int i2 = -1;
        CrossBorderReceiverDto crossBorderReceiverDto = null;
        Money money = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i2 == -49) {
                    String str5 = str4;
                    String str6 = str3;
                    String str7 = str2;
                    String str8 = str;
                    Money money2 = money;
                    CrossBorderReceiverDto crossBorderReceiverDto2 = crossBorderReceiverDto;
                    if (crossBorderReceiverDto2 == null) {
                        throw Util.missingProperty("receiver_", "receiver", jsonReader);
                    }
                    if (money2 == null) {
                        throw Util.missingProperty("currencyRate", "currency_rate", jsonReader);
                    }
                    if (str8 == null) {
                        throw Util.missingProperty("currency", "currency", jsonReader);
                    }
                    if (str7 != null) {
                        return new CrossBorderCheckUserPartnerSuccessDto(crossBorderReceiverDto2, money2, str8, str7, str6, str5);
                    }
                    byte[] bArr5 = new byte[18];
                    int i3 = 0;
                    for (int i4 = 18; i3 < i4; i4 = 18) {
                        bArr5[i3] = (byte) (bArr4[i3] ^ bArr3[i3 % 8]);
                        i3++;
                    }
                    throw Util.missingProperty("checkUserPartnerId", new String(bArr5, uza.a), jsonReader);
                }
                String str9 = str4;
                String str10 = str3;
                String str11 = str2;
                String str12 = str;
                Money money3 = money;
                CrossBorderReceiverDto crossBorderReceiverDto3 = crossBorderReceiverDto;
                Constructor<CrossBorderCheckUserPartnerSuccessDto> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = CrossBorderCheckUserPartnerSuccessDto.class.getDeclaredConstructor(CrossBorderReceiverDto.class, Money.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<CrossBorderCheckUserPartnerSuccessDto> constructor2 = constructor;
                if (crossBorderReceiverDto3 == null) {
                    throw Util.missingProperty("receiver_", "receiver", jsonReader);
                }
                if (money3 == null) {
                    throw Util.missingProperty("currencyRate", "currency_rate", jsonReader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("currency", "currency", jsonReader);
                }
                if (str11 != null) {
                    return constructor2.newInstance(crossBorderReceiverDto3, money3, str12, str11, str10, str9, Integer.valueOf(i), null);
                }
                byte[] bArr6 = new byte[18];
                for (int i5 = 0; i5 < 18; i5++) {
                    bArr6[i5] = (byte) (bArr4[i5] ^ bArr3[i5 % 8]);
                }
                throw Util.missingProperty("checkUserPartnerId", new String(bArr6, uza.a), jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    crossBorderReceiverDto = this.crossBorderReceiverDtoAdapter.fromJson(jsonReader);
                    if (crossBorderReceiverDto == null) {
                        throw Util.unexpectedNull("receiver_", "receiver", jsonReader);
                    }
                    break;
                case 1:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("currencyRate", "currency_rate", jsonReader);
                    }
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("currency", "currency", jsonReader);
                    }
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        byte[] bArr7 = new byte[18];
                        int i6 = 0;
                        for (int i7 = 18; i6 < i7; i7 = 18) {
                            bArr7[i6] = (byte) (bArr4[i6] ^ bArr3[i6 % 8]);
                            i6++;
                        }
                        throw Util.unexpectedNull("checkUserPartnerId", new String(bArr7, uza.a), jsonReader);
                    }
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    break;
            }
            bArr = bArr3;
            bArr2 = bArr4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto) {
        CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto2 = crossBorderCheckUserPartnerSuccessDto;
        if (crossBorderCheckUserPartnerSuccessDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver");
        this.crossBorderReceiverDtoAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getReceiver());
        jsonWriter.name("currency_rate");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getCurrencyRate());
        jsonWriter.name("currency");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getCurrency());
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            bArr[i] = (byte) (hg91.g[i] ^ hg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getCheckUserPartnerId());
        jsonWriter.name("fee");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getFee());
        jsonWriter.name("convertation_template");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderCheckUserPartnerSuccessDto2.getConvertationTemplate());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(CrossBorderCheckUserPartnerSuccessDto)");
    }
}
