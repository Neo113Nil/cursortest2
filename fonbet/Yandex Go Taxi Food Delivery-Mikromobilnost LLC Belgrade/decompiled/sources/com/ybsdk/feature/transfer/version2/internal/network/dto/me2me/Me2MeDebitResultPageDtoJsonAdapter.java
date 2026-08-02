package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "partnerDtoAdapter", "", "stringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitResultPageDtoJsonAdapter extends JsonAdapter<Me2MeDebitResultPageDto> {
    private final JsonReader.Options options;
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;
    private final JsonAdapter<PartnerDto> partnerDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public Me2MeDebitResultPageDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.j;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("header", new String(bArr2, uza.a), "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        EmptySet emptySet = EmptySet.a;
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
        this.partnerDtoAdapter = moshi.adapter(PartnerDto.class, emptySet, "ybInfo");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitResultPageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PageHeaderDto pageHeaderDto = null;
        PartnerDto partnerDto = null;
        String str = null;
        String str2 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            byte[] bArr2 = gf91.j;
            if (!hasNext) {
                jsonReader.endObject();
                if (pageHeaderDto == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (partnerDto != null) {
                    if (str == null) {
                        throw Util.missingProperty("title", "title", jsonReader);
                    }
                    if (str2 != null) {
                        return new Me2MeDebitResultPageDto(pageHeaderDto, partnerDto, str, str2);
                    }
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                byte[] bArr3 = new byte[9];
                for (int i = 0; i < 9; i++) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                }
                throw Util.missingProperty("ybInfo", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader);
                if (pageHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 1) {
                partnerDto = this.partnerDtoAdapter.fromJson(jsonReader);
                if (partnerDto == null) {
                    byte[] bArr4 = new byte[9];
                    for (int i2 = 0; i2 < 9; i2++) {
                        bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                    }
                    throw Util.unexpectedNull("ybInfo", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitResultPageDto me2MeDebitResultPageDto) {
        Me2MeDebitResultPageDto me2MeDebitResultPageDto2 = me2MeDebitResultPageDto;
        if (me2MeDebitResultPageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultPageDto2.getHeader());
        byte[] bArr = new byte[9];
        for (int i = 0; i < 9; i++) {
            bArr[i] = (byte) (gf91.j[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.partnerDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultPageDto2.getYbInfo());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultPageDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitResultPageDto2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(Me2MeDebitResultPageDto)");
    }
}
