package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.card.api.entities.CardTokenType;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/TokenResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/TokenResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/api/entities/CardTokenType;", "cardTokenTypeAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TokenResponseJsonAdapter extends JsonAdapter<TokenResponse> {
    private final JsonAdapter<CardTokenType> cardTokenTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_TOKEN, "token_id", "type", "suffix");
    private final JsonAdapter<String> stringAdapter;

    public TokenResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        this.cardTokenTypeAdapter = moshi.adapter(CardTokenType.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TokenResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        CardTokenType cardTokenType = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("tokenId", "token_id", jsonReader);
                }
            } else if (selectName == 2) {
                cardTokenType = this.cardTokenTypeAdapter.fromJson(jsonReader);
                if (cardTokenType == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("suffix", "suffix", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("tokenId", "token_id", jsonReader);
        }
        if (cardTokenType == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (str3 != null) {
            return new TokenResponse(str, str2, cardTokenType, str3);
        }
        throw Util.missingProperty("suffix", "suffix", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TokenResponse tokenResponse) {
        TokenResponse tokenResponse2 = tokenResponse;
        if (tokenResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tokenResponse2.getToken());
        jsonWriter.name("token_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tokenResponse2.getTokenId());
        jsonWriter.name("type");
        this.cardTokenTypeAdapter.toJson(jsonWriter, (JsonWriter) tokenResponse2.getType());
        jsonWriter.name("suffix");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) tokenResponse2.getSuffix());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(TokenResponse)");
    }
}
