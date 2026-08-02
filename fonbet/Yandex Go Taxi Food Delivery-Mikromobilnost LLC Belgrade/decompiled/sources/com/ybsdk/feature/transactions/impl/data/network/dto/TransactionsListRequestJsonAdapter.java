package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsListRequestJsonAdapter extends JsonAdapter<TransactionsListRequest> {
    private volatile Constructor<TransactionsListRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("limit", "cursor", "agreement_id", "accessor_id");
    private final JsonAdapter<String> stringAdapter;

    public TransactionsListRequestJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "limit");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cursor");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransactionsListRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("limit", "limit", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -11) {
            if (num == null) {
                throw Util.missingProperty("limit", "limit", jsonReader);
            }
            int intValue = num.intValue();
            if (str2 != null) {
                return new TransactionsListRequest(intValue, str, str2, str3);
            }
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        Constructor<TransactionsListRequest> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = TransactionsListRequest.class.getDeclaredConstructor(cls2, String.class, String.class, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        if (num == null) {
            throw Util.missingProperty("limit", "limit", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(num, str, str2, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransactionsListRequest transactionsListRequest) {
        TransactionsListRequest transactionsListRequest2 = transactionsListRequest;
        if (transactionsListRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("limit");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(transactionsListRequest2.getLimit()));
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsListRequest2.getCursor());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transactionsListRequest2.getAgreementId());
        jsonWriter.name("accessor_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transactionsListRequest2.getAccessorId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(TransactionsListRequest)");
    }
}
