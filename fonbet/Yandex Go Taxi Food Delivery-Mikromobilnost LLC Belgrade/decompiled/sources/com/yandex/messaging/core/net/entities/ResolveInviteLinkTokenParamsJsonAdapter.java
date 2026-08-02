package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveInviteLinkTokenParamsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/ResolveInviteLinkTokenParams;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveInviteLinkTokenParamsJsonAdapter extends JsonAdapter<ResolveInviteLinkTokenParams> {
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
    private final JsonAdapter<String> stringAdapter;

    public ResolveInviteLinkTokenParamsJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, AuthSdkActivity.RESPONSE_TYPE_TOKEN);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ResolveInviteLinkTokenParams fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new ResolveInviteLinkTokenParams(str);
        }
        throw Util.missingProperty(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ResolveInviteLinkTokenParams resolveInviteLinkTokenParams) {
        ResolveInviteLinkTokenParams resolveInviteLinkTokenParams2 = resolveInviteLinkTokenParams;
        if (resolveInviteLinkTokenParams2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) resolveInviteLinkTokenParams2.getToken());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ResolveInviteLinkTokenParams)");
    }
}
