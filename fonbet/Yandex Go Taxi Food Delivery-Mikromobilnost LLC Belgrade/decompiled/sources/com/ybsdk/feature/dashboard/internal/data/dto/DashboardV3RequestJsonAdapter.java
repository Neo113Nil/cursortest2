package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "nullableListOfNfcProductTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "nullableNfcSystemInfoAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardV3RequestJsonAdapter extends JsonAdapter<DashboardV3Request> {
    private volatile Constructor<DashboardV3Request> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<List<NfcProductTypeDto>> nullableListOfNfcProductTypeDtoAdapter;
    private final JsonAdapter<NfcSystemInfo> nullableNfcSystemInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("tokenized_product_types", "nfc_system_info", "initial_deeplink", "communications_shown_info", "sessions_count_without_fullscreen", "hash");

    public DashboardV3RequestJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, NfcProductTypeDto.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfNfcProductTypeDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "tokenizedProductTypes");
        this.nullableNfcSystemInfoAdapter = moshi.adapter(NfcSystemInfo.class, emptySet, "nfcSystemInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "initialDeeplink");
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationShownInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreen");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DashboardV3Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        List<NfcProductTypeDto> list = null;
        NfcSystemInfo nfcSystemInfo = null;
        String str = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        Integer num = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfNfcProductTypeDtoAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    nfcSystemInfo = this.nullableNfcSystemInfoAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
                    }
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -36) {
            Integer num2 = num;
            CommunicationsShownInfoDto communicationsShownInfoDto2 = communicationsShownInfoDto;
            String str3 = str;
            NfcSystemInfo nfcSystemInfo2 = nfcSystemInfo;
            List<NfcProductTypeDto> list2 = list;
            if (num2 == null) {
                throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
            }
            return new DashboardV3Request(list2, nfcSystemInfo2, str3, communicationsShownInfoDto2, num2.intValue(), str2);
        }
        String str4 = str2;
        Integer num3 = num;
        CommunicationsShownInfoDto communicationsShownInfoDto3 = communicationsShownInfoDto;
        String str5 = str;
        NfcSystemInfo nfcSystemInfo3 = nfcSystemInfo;
        List<NfcProductTypeDto> list3 = list;
        Constructor<DashboardV3Request> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = DashboardV3Request.class.getDeclaredConstructor(List.class, NfcSystemInfo.class, String.class, CommunicationsShownInfoDto.class, cls2, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<DashboardV3Request> constructor2 = constructor;
        if (num3 != null) {
            return constructor2.newInstance(list3, nfcSystemInfo3, str5, communicationsShownInfoDto3, num3, str4, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreen", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DashboardV3Request dashboardV3Request) {
        DashboardV3Request dashboardV3Request2 = dashboardV3Request;
        if (dashboardV3Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("tokenized_product_types");
        this.nullableListOfNfcProductTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Request2.getTokenizedProductTypes());
        jsonWriter.name("nfc_system_info");
        this.nullableNfcSystemInfoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Request2.getNfcSystemInfo());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Request2.getInitialDeeplink());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Request2.getCommunicationShownInfo());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(dashboardV3Request2.getSessionsCountWithoutFullscreen()));
        jsonWriter.name("hash");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dashboardV3Request2.getHash());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DashboardV3Request)");
    }
}
