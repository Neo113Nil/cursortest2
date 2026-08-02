package com.ybsdk.feature.partnerselection.internal.network.dto.partner;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.hg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/PartnerWithActionDto;", "listOfPartnerWithActionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPartnersResponseDtoJsonAdapter extends JsonAdapter<GetPartnersResponseDto> {
    private final JsonAdapter<List<PartnerWithActionDto>> listOfPartnerWithActionDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GetPartnersResponseDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = hg91.c;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ hg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr2, uza.a), "cursor", "transfer_id");
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, PartnerWithActionDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfPartnerWithActionDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "partners");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cursor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetPartnersResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<PartnerWithActionDto> list = null;
        String str = null;
        String str2 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = hg91.a;
            int i = 0;
            byte[] bArr2 = hg91.c;
            if (!hasNext) {
                jsonReader.endObject();
                if (list != null) {
                    return new GetPartnersResponseDto(list, str, str2);
                }
                byte[] bArr3 = new byte[5];
                while (i < 5) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("partners", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfPartnerWithActionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    byte[] bArr4 = new byte[5];
                    while (i < 5) {
                        bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                        i++;
                    }
                    throw Util.unexpectedNull("partners", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetPartnersResponseDto getPartnersResponseDto) {
        GetPartnersResponseDto getPartnersResponseDto2 = getPartnersResponseDto;
        if (getPartnersResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = new byte[5];
        for (int i = 0; i < 5; i++) {
            bArr[i] = (byte) (hg91.c[i] ^ hg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.listOfPartnerWithActionDtoAdapter.toJson(jsonWriter, (JsonWriter) getPartnersResponseDto2.getPartners());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getPartnersResponseDto2.getCursor());
        jsonWriter.name("transfer_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getPartnersResponseDto2.getTransferId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(GetPartnersResponseDto)");
    }
}
