package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.cg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/main/internal/data/network/dto/SbpYbsDto;", "listOfSbpYbsDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetDto;", "bindAccountSheetDtoAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbpAccountsYbsSuccessDataDtoJsonAdapter extends JsonAdapter<SbpAccountsYbsSuccessDataDto> {
    private final JsonAdapter<BindAccountSheetDto> bindAccountSheetDtoAdapter;
    private final JsonAdapter<List<SbpYbsDto>> listOfSbpYbsDtoAdapter;
    private final JsonReader.Options options;

    public SbpAccountsYbsSuccessDataDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = cg91.b;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ cg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr2, uza.a), "bind_account_sheet");
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, SbpYbsDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfSbpYbsDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "ybs");
        this.bindAccountSheetDtoAdapter = moshi.adapter(BindAccountSheetDto.class, emptySet, "bindAccountSheet");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SbpAccountsYbsSuccessDataDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<SbpYbsDto> list = null;
        BindAccountSheetDto bindAccountSheetDto = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = cg91.a;
            int i = 0;
            byte[] bArr2 = cg91.b;
            if (!hasNext) {
                jsonReader.endObject();
                if (list != null) {
                    if (bindAccountSheetDto != null) {
                        return new SbpAccountsYbsSuccessDataDto(list, bindAccountSheetDto);
                    }
                    throw Util.missingProperty("bindAccountSheet", "bind_account_sheet", jsonReader);
                }
                byte[] bArr3 = new byte[5];
                while (i < 5) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("ybs", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfSbpYbsDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    byte[] bArr4 = new byte[5];
                    while (i < 5) {
                        bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                        i++;
                    }
                    throw Util.unexpectedNull("ybs", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 1 && (bindAccountSheetDto = this.bindAccountSheetDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("bindAccountSheet", "bind_account_sheet", jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto) {
        SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto2 = sbpAccountsYbsSuccessDataDto;
        if (sbpAccountsYbsSuccessDataDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = new byte[5];
        for (int i = 0; i < 5; i++) {
            bArr[i] = (byte) (cg91.b[i] ^ cg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.listOfSbpYbsDtoAdapter.toJson(jsonWriter, (JsonWriter) sbpAccountsYbsSuccessDataDto2.getYbs());
        jsonWriter.name("bind_account_sheet");
        this.bindAccountSheetDtoAdapter.toJson(jsonWriter, (JsonWriter) sbpAccountsYbsSuccessDataDto2.getBindAccountSheet());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(SbpAccountsYbsSuccessDataDto)");
    }
}
