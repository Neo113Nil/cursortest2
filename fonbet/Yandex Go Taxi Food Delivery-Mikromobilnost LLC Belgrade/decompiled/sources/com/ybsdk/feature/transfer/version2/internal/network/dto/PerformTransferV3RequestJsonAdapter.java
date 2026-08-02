package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3RequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Request;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferV3Request;", "transferV3RequestAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TfaInfoDto;", "nullableTfaInfoDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PerformTransferV3RequestJsonAdapter extends JsonAdapter<PerformTransferV3Request> {
    private volatile Constructor<PerformTransferV3Request> constructorRef;
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonAdapter<TfaInfoDto> nullableTfaInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transfer", "check_id", "hmac", "tfa");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TransferV3Request> transferV3RequestAdapter;

    public PerformTransferV3RequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.transferV3RequestAdapter = moshi.adapter(TransferV3Request.class, emptySet, "transfer");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "checkId");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
        this.nullableTfaInfoDtoAdapter = moshi.adapter(TfaInfoDto.class, emptySet, "tfa");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PerformTransferV3Request fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TransferV3Request transferV3Request = null;
        String str = null;
        HmacDto hmacDto = null;
        TfaInfoDto tfaInfoDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                transferV3Request = this.transferV3RequestAdapter.fromJson(jsonReader);
                if (transferV3Request == null) {
                    throw Util.unexpectedNull("transfer", "transfer", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("checkId", "check_id", jsonReader);
                }
            } else if (selectName == 2) {
                hmacDto = this.hmacDtoAdapter.fromJson(jsonReader);
                if (hmacDto == null) {
                    throw Util.unexpectedNull("hmac", "hmac", jsonReader);
                }
            } else if (selectName == 3) {
                tfaInfoDto = this.nullableTfaInfoDtoAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (transferV3Request == null) {
                throw Util.missingProperty("transfer", "transfer", jsonReader);
            }
            if (str == null) {
                throw Util.missingProperty("checkId", "check_id", jsonReader);
            }
            if (hmacDto != null) {
                return new PerformTransferV3Request(transferV3Request, str, hmacDto, tfaInfoDto);
            }
            throw Util.missingProperty("hmac", "hmac", jsonReader);
        }
        Constructor<PerformTransferV3Request> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PerformTransferV3Request.class.getDeclaredConstructor(TransferV3Request.class, String.class, HmacDto.class, TfaInfoDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (transferV3Request == null) {
            throw Util.missingProperty("transfer", "transfer", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("checkId", "check_id", jsonReader);
        }
        if (hmacDto != null) {
            return constructor.newInstance(transferV3Request, str, hmacDto, tfaInfoDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("hmac", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PerformTransferV3Request performTransferV3Request) {
        PerformTransferV3Request performTransferV3Request2 = performTransferV3Request;
        if (performTransferV3Request2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transfer");
        this.transferV3RequestAdapter.toJson(jsonWriter, (JsonWriter) performTransferV3Request2.getTransfer());
        jsonWriter.name("check_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performTransferV3Request2.getCheckId());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) performTransferV3Request2.getHmac());
        jsonWriter.name("tfa");
        this.nullableTfaInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) performTransferV3Request2.getTfa());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(PerformTransferV3Request)");
    }
}
