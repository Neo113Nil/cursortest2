package com.ybsdk.feature.transfer.version2.internal.network.dto.targets;

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
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetSuggestedTargetsRequestJsonAdapter extends JsonAdapter<GetSuggestedTargetsRequest> {
    private volatile Constructor<GetSuggestedTargetsRequest> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("receiver_phone", "agreement_id", MetaDataField.DEVICE_ID_FIELD, "cursor", "limit");
    private final JsonAdapter<String> stringAdapter;

    public GetSuggestedTargetsRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "receiverPhone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetSuggestedTargetsRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("receiverPhone", "receiver_phone", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                str5 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -25) {
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            if (str10 != null) {
                return new GetSuggestedTargetsRequest(str10, str9, str8, str7, str6);
            }
            throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
        }
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        Constructor<GetSuggestedTargetsRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GetSuggestedTargetsRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str15 != null) {
            return constructor.newInstance(str15, str14, str13, str12, str11, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetSuggestedTargetsRequest getSuggestedTargetsRequest) {
        GetSuggestedTargetsRequest getSuggestedTargetsRequest2 = getSuggestedTargetsRequest;
        if (getSuggestedTargetsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getSuggestedTargetsRequest2.getReceiverPhone());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getSuggestedTargetsRequest2.getAgreementId());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getSuggestedTargetsRequest2.getDeviceId());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getSuggestedTargetsRequest2.getCursor());
        jsonWriter.name("limit");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getSuggestedTargetsRequest2.getLimit());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(GetSuggestedTargetsRequest)");
    }
}
