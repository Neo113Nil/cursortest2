package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.WalletsInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/WalletsInfoResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/network/dto/WalletsInfoResponse$WalletInfo;", "listOfWalletInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lcom/ybsdk/network/dto/WalletsInfoResponse$SplitInfo;", "nullableSplitInfoAdapter", "Lcom/ybsdk/network/dto/WalletsInfoResponse$SaverInfo;", "nullableSaverInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletsInfoResponseJsonAdapter extends JsonAdapter<WalletsInfoResponse> {
    private volatile Constructor<WalletsInfoResponse> constructorRef;
    private final JsonAdapter<List<WalletsInfoResponse.WalletInfo>> listOfWalletInfoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<WalletsInfoResponse.SaverInfo> nullableSaverInfoAdapter;
    private final JsonAdapter<WalletsInfoResponse.SplitInfo> nullableSplitInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("wallets_info", "should_poll", "split_info", "saver_info");

    public WalletsInfoResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, WalletsInfoResponse.WalletInfo.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfWalletInfoAdapter = moshi.adapter(newParameterizedType, emptySet, "walletsInfo");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "shouldPoll");
        this.nullableSplitInfoAdapter = moshi.adapter(WalletsInfoResponse.SplitInfo.class, emptySet, "splitInfo");
        this.nullableSaverInfoAdapter = moshi.adapter(WalletsInfoResponse.SaverInfo.class, emptySet, "saverInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WalletsInfoResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<WalletsInfoResponse.WalletInfo> list = null;
        Boolean bool = null;
        WalletsInfoResponse.SplitInfo splitInfo = null;
        WalletsInfoResponse.SaverInfo saverInfo = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfWalletInfoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("walletsInfo", "wallets_info", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                splitInfo = this.nullableSplitInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                saverInfo = this.nullableSaverInfoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new WalletsInfoResponse(list, bool, splitInfo, saverInfo);
        }
        Constructor<WalletsInfoResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WalletsInfoResponse.class.getDeclaredConstructor(List.class, Boolean.class, WalletsInfoResponse.SplitInfo.class, WalletsInfoResponse.SaverInfo.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(list, bool, splitInfo, saverInfo, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WalletsInfoResponse walletsInfoResponse) {
        WalletsInfoResponse walletsInfoResponse2 = walletsInfoResponse;
        if (walletsInfoResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("wallets_info");
        this.listOfWalletInfoAdapter.toJson(jsonWriter, (JsonWriter) walletsInfoResponse2.getWalletsInfo());
        jsonWriter.name("should_poll");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) walletsInfoResponse2.getShouldPoll());
        jsonWriter.name("split_info");
        this.nullableSplitInfoAdapter.toJson(jsonWriter, (JsonWriter) walletsInfoResponse2.getSplitInfo());
        jsonWriter.name("saver_info");
        this.nullableSaverInfoAdapter.toJson(jsonWriter, (JsonWriter) walletsInfoResponse2.getSaverInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(WalletsInfoResponse)");
    }
}
