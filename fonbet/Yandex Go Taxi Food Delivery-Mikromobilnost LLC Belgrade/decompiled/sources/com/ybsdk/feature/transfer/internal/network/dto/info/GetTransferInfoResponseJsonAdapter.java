package com.ybsdk.feature.transfer.internal.network.dto.info;

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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/info/GetTransferInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/internal/network/dto/info/WalletLimit;", "nullableWalletLimitAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetTransferInfoResponseJsonAdapter extends JsonAdapter<GetTransferInfoResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<GetTransferInfoResponse> constructorRef;
    private final JsonAdapter<WalletLimit> nullableWalletLimitAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("transfer_id", "min_limit", "max_limit", "fps_on");
    private final JsonAdapter<String> stringAdapter;

    public GetTransferInfoResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "transferId");
        this.nullableWalletLimitAdapter = moshi.adapter(WalletLimit.class, emptySet, "minLimit");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isFpsOn");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetTransferInfoResponse fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        WalletLimit walletLimit = null;
        WalletLimit walletLimit2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("transferId", "transfer_id", jsonReader);
                }
            } else if (selectName == 1) {
                walletLimit = this.nullableWalletLimitAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                walletLimit2 = this.nullableWalletLimitAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                bool2 = this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("isFpsOn", "fps_on", jsonReader);
                }
                i = -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str != null) {
                return new GetTransferInfoResponse(str, walletLimit, walletLimit2, bool2.booleanValue());
            }
            throw Util.missingProperty("transferId", "transfer_id", jsonReader);
        }
        Constructor<GetTransferInfoResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GetTransferInfoResponse.class.getDeclaredConstructor(String.class, WalletLimit.class, WalletLimit.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, walletLimit, walletLimit2, bool2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("transferId", "transfer_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetTransferInfoResponse getTransferInfoResponse) {
        GetTransferInfoResponse getTransferInfoResponse2 = getTransferInfoResponse;
        if (getTransferInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("transfer_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getTransferInfoResponse2.getTransferId());
        jsonWriter.name("min_limit");
        this.nullableWalletLimitAdapter.toJson(jsonWriter, (JsonWriter) getTransferInfoResponse2.getMinLimit());
        jsonWriter.name("max_limit");
        this.nullableWalletLimitAdapter.toJson(jsonWriter, (JsonWriter) getTransferInfoResponse2.getMaxLimit());
        jsonWriter.name("fps_on");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(getTransferInfoResponse2.isFpsOn()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(GetTransferInfoResponse)");
    }
}
