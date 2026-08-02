package com.ybsdk.core.common.data.network.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import defpackage.jci0;
import defpackage.uza;
import defpackage.vng;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/core/common/data/network/adapters/RawJsonStringAdapter;", "", "Lcom/squareup/moshi/JsonWriter;", "writer", "", "string", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/String;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "fromJson", "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/String;", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RawJsonStringAdapter {
    public static final RawJsonStringAdapter a = new RawJsonStringAdapter();

    @FromJson
    @RawJsonString
    public final String fromJson(JsonReader reader, JsonAdapter<Object> adapter) {
        return adapter.toJson(reader.readJsonValue());
    }

    @ToJson
    public final void toJson(JsonWriter writer, @RawJsonString String string) {
        if (string == null) {
            writer.nullValue();
        } else {
            writer.value(new jci0(vng.H(new ByteArrayInputStream(string.getBytes(uza.a)))));
        }
    }
}
