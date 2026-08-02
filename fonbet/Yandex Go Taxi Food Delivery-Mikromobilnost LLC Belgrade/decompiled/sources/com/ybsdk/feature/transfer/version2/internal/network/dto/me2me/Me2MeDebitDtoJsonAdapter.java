package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/ReceiverInfoDto;", "receiverInfoDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "partnerDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitDtoJsonAdapter extends JsonAdapter<Me2MeDebitDto> {
    private final JsonReader.Options options;
    private final JsonAdapter<PartnerDto> partnerDtoAdapter;
    private final JsonAdapter<ReceiverInfoDto> receiverInfoDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public Me2MeDebitDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.j;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "receiver_info", new String(bArr2, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.receiverInfoDtoAdapter = moshi.adapter(ReceiverInfoDto.class, emptySet, "receiverInfo");
        this.partnerDtoAdapter = moshi.adapter(PartnerDto.class, emptySet, "ybInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ReceiverInfoDto receiverInfoDto = null;
        PartnerDto partnerDto = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            byte[] bArr2 = gf91.j;
            if (!hasNext) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (receiverInfoDto == null) {
                    throw Util.missingProperty("receiverInfo", "receiver_info", jsonReader);
                }
                if (partnerDto != null) {
                    return new Me2MeDebitDto(str, str2, receiverInfoDto, partnerDto);
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 2) {
                receiverInfoDto = this.receiverInfoDtoAdapter.fromJson(jsonReader);
                if (receiverInfoDto == null) {
                    throw Util.unexpectedNull("receiverInfo", "receiver_info", jsonReader);
                }
            } else if (selectName == 3 && (partnerDto = this.partnerDtoAdapter.fromJson(jsonReader)) == null) {
                byte[] bArr4 = new byte[9];
                for (int i2 = 0; i2 < 9; i2++) {
                    bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                }
                throw Util.unexpectedNull("ybInfo", new String(bArr4, uza.a), jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitDto me2MeDebitDto) {
        Me2MeDebitDto me2MeDebitDto2 = me2MeDebitDto;
        if (me2MeDebitDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitDto2.getDescription());
        jsonWriter.name("receiver_info");
        this.receiverInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitDto2.getReceiverInfo());
        byte[] bArr = new byte[9];
        for (int i = 0; i < 9; i++) {
            bArr[i] = (byte) (gf91.j[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.partnerDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitDto2.getYbInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(Me2MeDebitDto)");
    }
}
