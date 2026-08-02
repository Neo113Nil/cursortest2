package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pdf.internal.network.dto.SplitContractDraftCreateRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/pdf/internal/network/dto/SplitContractDraftCreateRequest$Item;", "listOfItemAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "", "stringAdapter", "", "nullableBooleanAdapter", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitContractDraftCreateRequestJsonAdapter extends JsonAdapter<SplitContractDraftCreateRequest> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<List<SplitContractDraftCreateRequest.Item>> listOfItemAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("items", "total_amount", "plan_constructor", "merchant_id", "is_prepayment");
    private final JsonAdapter<String> stringAdapter;

    public SplitContractDraftCreateRequestJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, SplitContractDraftCreateRequest.Item.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfItemAdapter = moshi.adapter(newParameterizedType, emptySet, "items");
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "totalAmount");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "planConstructor");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isPrepayment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SplitContractDraftCreateRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SplitContractDraftCreateRequest.Item> list = null;
        BigDecimal bigDecimal = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfItemAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("items", "items", jsonReader);
                }
            } else if (selectName == 1) {
                bigDecimal = this.bigDecimalAdapter.fromJson(jsonReader);
                if (bigDecimal == null) {
                    throw Util.unexpectedNull("totalAmount", "total_amount", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("planConstructor", "plan_constructor", jsonReader);
                }
            } else if (selectName == 3) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("merchantID", "merchant_id", jsonReader);
                }
            } else if (selectName == 4) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("items", "items", jsonReader);
        }
        if (bigDecimal == null) {
            throw Util.missingProperty("totalAmount", "total_amount", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("planConstructor", "plan_constructor", jsonReader);
        }
        if (str2 != null) {
            return new SplitContractDraftCreateRequest(list, bigDecimal, str, str2, bool);
        }
        throw Util.missingProperty("merchantID", "merchant_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SplitContractDraftCreateRequest splitContractDraftCreateRequest) {
        SplitContractDraftCreateRequest splitContractDraftCreateRequest2 = splitContractDraftCreateRequest;
        if (splitContractDraftCreateRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfItemAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftCreateRequest2.getItems());
        jsonWriter.name("total_amount");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftCreateRequest2.getTotalAmount());
        jsonWriter.name("plan_constructor");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftCreateRequest2.getPlanConstructor());
        jsonWriter.name("merchant_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftCreateRequest2.getMerchantID());
        jsonWriter.name("is_prepayment");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) splitContractDraftCreateRequest2.isPrepayment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(SplitContractDraftCreateRequest)");
    }
}
