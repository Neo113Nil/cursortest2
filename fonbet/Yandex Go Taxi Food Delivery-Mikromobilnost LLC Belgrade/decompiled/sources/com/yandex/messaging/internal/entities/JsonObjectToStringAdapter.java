package com.yandex.messaging.internal.entities;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import defpackage.qq6;
import defpackage.yp6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/internal/entities/JsonObjectToStringAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/JsonWriter;", "writer", "", "s", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/String;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JsonObjectToStringAdapter {
    @JsonString
    @FromJson
    public final String fromJson(JsonReader reader) {
        qq6 nextSource = reader.nextSource();
        try {
            String I0 = nextSource.I0();
            nextSource.close();
            return I0;
        } finally {
        }
    }

    @ToJson
    public final void toJson(JsonWriter writer, @JsonString String s) {
        yp6 yp6Var = new yp6();
        yp6Var.x0(s);
        writer.value(yp6Var);
    }
}
