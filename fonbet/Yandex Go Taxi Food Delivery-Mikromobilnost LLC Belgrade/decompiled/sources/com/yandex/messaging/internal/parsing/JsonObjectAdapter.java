package com.yandex.messaging.internal.parsing;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import defpackage.ffx;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.yp6;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/internal/parsing/JsonObjectAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlinx/serialization/json/c;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lkotlinx/serialization/json/c;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lkotlinx/serialization/json/c;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JsonObjectAdapter extends JsonAdapter<c> {
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public c fromJson(JsonReader reader) throws JsonDataException {
        try {
            rbx rbxVar = sbx.d;
            InputStream p2 = reader.nextSource().p2();
            rbxVar.getClass();
            return (c) ffx.A(rbxVar, c.Companion.serializer(), p2);
        } catch (IOException e) {
            throw new JsonDataException(e.getMessage());
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, c value) {
        if (value != null) {
            yp6 yp6Var = new yp6();
            yp6Var.x0(value.toString());
            writer.value(yp6Var);
        }
    }
}
