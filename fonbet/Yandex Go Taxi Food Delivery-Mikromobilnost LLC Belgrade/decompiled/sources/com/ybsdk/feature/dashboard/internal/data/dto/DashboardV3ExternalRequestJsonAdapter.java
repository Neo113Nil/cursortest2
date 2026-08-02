package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ExternalRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ExternalRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "nullableListOfNfcProductTypeDtoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "nullableNfcSystemInfoAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardV3ExternalRequestJsonAdapter extends JsonAdapter<DashboardV3ExternalRequest> {
    private volatile Constructor<DashboardV3ExternalRequest> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<NfcProductTypeDto>> nullableListOfNfcProductTypeDtoAdapter;
    private final JsonAdapter<NfcSystemInfo> nullableNfcSystemInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("member_id", "tokenized_product_types", "nfc_system_info", "sessions_count_without_fullscreen");
    private final JsonAdapter<String> stringAdapter;

    public DashboardV3ExternalRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "memberId");
        this.nullableListOfNfcProductTypeDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, NfcProductTypeDto.class), emptySet, "tokenizedProductTypes");
        this.nullableNfcSystemInfoAdapter = moshi.adapter(NfcSystemInfo.class, emptySet, "nfcSystemInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardV3ExternalRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<NfcProductTypeDto> list = null;
        NfcSystemInfo nfcSystemInfo = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("memberId", "member_id", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.nullableListOfNfcProductTypeDtoAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                nfcSystemInfo = this.nullableNfcSystemInfoAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            if (str == null) {
                throw Util.missingProperty("memberId", "member_id", jsonReader);
            }
            if (num != null) {
                return new DashboardV3ExternalRequest(str, list, nfcSystemInfo, num.intValue());
            }
            throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
        }
        Constructor<DashboardV3ExternalRequest> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = DashboardV3ExternalRequest.class.getDeclaredConstructor(String.class, List.class, NfcSystemInfo.class, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("memberId", "member_id", jsonReader);
        }
        if (num != null) {
            return constructor.newInstance(str, list, nfcSystemInfo, num, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardV3ExternalRequest dashboardV3ExternalRequest) {
        DashboardV3ExternalRequest dashboardV3ExternalRequest2 = dashboardV3ExternalRequest;
        if (dashboardV3ExternalRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("member_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3ExternalRequest2.getMemberId());
        jsonWriter.name("tokenized_product_types");
        this.nullableListOfNfcProductTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3ExternalRequest2.getTokenizedProductTypes());
        jsonWriter.name("nfc_system_info");
        this.nullableNfcSystemInfoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3ExternalRequest2.getNfcSystemInfo());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(dashboardV3ExternalRequest2.getSessionsCountWithoutFullscreen()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(DashboardV3ExternalRequest)");
    }
}
