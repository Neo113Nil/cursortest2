package com.ybsdk.core.common.data.network.dto.nfc;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "nullableListOfNfcProductTypeDtoAdapter", "nullableNfcProductTypeDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NfcInfoDtoJsonAdapter extends JsonAdapter<NfcInfoDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<NfcInfoDto> constructorRef;
    private final JsonAdapter<List<NfcProductTypeDto>> nullableListOfNfcProductTypeDtoAdapter;
    private final JsonAdapter<NfcProductTypeDto> nullableNfcProductTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_nfc_available", "is_nfc_payment_setup", "is_nfc_payment_default", "tokenized_product_types", "default_nfc_product_type");

    public NfcInfoDtoJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isNfcAvailable");
        this.nullableListOfNfcProductTypeDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, NfcProductTypeDto.class), emptySet, "tokenizedProductTypes");
        this.nullableNfcProductTypeDtoAdapter = moshi.adapter(NfcProductTypeDto.class, emptySet, "defaultNfcProductType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List<NfcProductTypeDto> list = null;
        NfcProductTypeDto nfcProductTypeDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isNfcAvailable", "is_nfc_available", jsonReader);
                }
            } else if (selectName == 1) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isNfcPaymentSetup", "is_nfc_payment_setup", jsonReader);
                }
            } else if (selectName == 2) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("isNfcPaymentDefault", "is_nfc_payment_default", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.nullableListOfNfcProductTypeDtoAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                nfcProductTypeDto = this.nullableNfcProductTypeDtoAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -25) {
            List<NfcProductTypeDto> list2 = list;
            if (bool == null) {
                throw Util.missingProperty("isNfcAvailable", "is_nfc_available", jsonReader);
            }
            NfcProductTypeDto nfcProductTypeDto2 = nfcProductTypeDto;
            boolean booleanValue = bool.booleanValue();
            if (bool2 == null) {
                throw Util.missingProperty("isNfcPaymentSetup", "is_nfc_payment_setup", jsonReader);
            }
            boolean booleanValue2 = bool2.booleanValue();
            if (bool3 != null) {
                return new NfcInfoDto(booleanValue, booleanValue2, bool3.booleanValue(), list2, nfcProductTypeDto2);
            }
            throw Util.missingProperty("isNfcPaymentDefault", "is_nfc_payment_default", jsonReader);
        }
        List<NfcProductTypeDto> list3 = list;
        NfcProductTypeDto nfcProductTypeDto3 = nfcProductTypeDto;
        Constructor<NfcInfoDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = NfcInfoDto.class.getDeclaredConstructor(cls3, cls3, cls3, List.class, NfcProductTypeDto.class, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<NfcInfoDto> constructor2 = constructor;
        if (bool == null) {
            throw Util.missingProperty("isNfcAvailable", "is_nfc_available", jsonReader);
        }
        if (bool2 == null) {
            throw Util.missingProperty("isNfcPaymentSetup", "is_nfc_payment_setup", jsonReader);
        }
        if (bool3 != null) {
            return constructor2.newInstance(bool, bool2, bool3, list3, nfcProductTypeDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("isNfcPaymentDefault", "is_nfc_payment_default", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcInfoDto nfcInfoDto) {
        NfcInfoDto nfcInfoDto2 = nfcInfoDto;
        if (nfcInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_nfc_available");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcInfoDto2.isNfcAvailable()));
        jsonWriter.name("is_nfc_payment_setup");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcInfoDto2.isNfcPaymentSetup()));
        jsonWriter.name("is_nfc_payment_default");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcInfoDto2.isNfcPaymentDefault()));
        jsonWriter.name("tokenized_product_types");
        this.nullableListOfNfcProductTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) nfcInfoDto2.getTokenizedProductTypes());
        jsonWriter.name("default_nfc_product_type");
        this.nullableNfcProductTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) nfcInfoDto2.getDefaultNfcProductType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(NfcInfoDto)");
    }
}
