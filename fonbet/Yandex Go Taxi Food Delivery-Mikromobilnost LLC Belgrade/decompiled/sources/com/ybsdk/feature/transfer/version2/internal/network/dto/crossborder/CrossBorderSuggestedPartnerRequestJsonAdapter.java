package com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnerRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnerRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderSuggestedPartnerRequestJsonAdapter extends JsonAdapter<CrossBorderSuggestedPartnerRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CrossBorderSuggestedPartnerRequest> constructorRef;
    private final JsonReader.Options options = JsonReader.Options.of("receiver_phone", "destination_country", "show_full_list");
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderSuggestedPartnerRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "receiverPhone");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showFullList");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderSuggestedPartnerRequest fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
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
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("destinationCountry", "destination_country", jsonReader);
                }
            } else if (selectName == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("showFullList", "show_full_list", jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
            }
            if (str2 != null) {
                return new CrossBorderSuggestedPartnerRequest(str, str2, bool.booleanValue());
            }
            throw Util.missingProperty("destinationCountry", "destination_country", jsonReader);
        }
        Constructor<CrossBorderSuggestedPartnerRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CrossBorderSuggestedPartnerRequest.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, str2, bool, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("destinationCountry", "destination_country", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest) {
        CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest2 = crossBorderSuggestedPartnerRequest;
        if (crossBorderSuggestedPartnerRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderSuggestedPartnerRequest2.getReceiverPhone());
        jsonWriter.name("destination_country");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderSuggestedPartnerRequest2.getDestinationCountry());
        jsonWriter.name("show_full_list");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(crossBorderSuggestedPartnerRequest2.getShowFullList()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(CrossBorderSuggestedPartnerRequest)");
    }
}
