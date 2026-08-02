package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.EnumJsonFormatter;
import defpackage.unr0;
import java.io.IOException;
import java.lang.Enum;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0012\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/EnumJsonAdapter;", "", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/wire/internal/EnumJsonFormatter;", "enumJsonFormatter", "<init>", "(Lcom/squareup/wire/internal/EnumJsonFormatter;)V", "Lcom/squareup/moshi/JsonWriter;", "out", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Enum;)V", "Lcom/squareup/moshi/JsonReader;", "input", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Enum;", "Lcom/squareup/wire/internal/EnumJsonFormatter;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnumJsonAdapter<E extends Enum<E> & WireEnum> extends JsonAdapter<E> {
    private final EnumJsonFormatter<E> enumJsonFormatter;

    public EnumJsonAdapter(EnumJsonFormatter<E> enumJsonFormatter) {
        this.enumJsonFormatter = enumJsonFormatter;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/squareup/moshi/JsonReader;)TE; */
    @Override // com.squareup.moshi.JsonAdapter
    public Enum fromJson(JsonReader input) throws IOException {
        String nextString = input.nextString();
        Enum r3 = (Enum) this.enumJsonFormatter.fromString(nextString);
        if (r3 != null) {
            return r3;
        }
        StringBuilder x = unr0.x("Unexpected ", nextString, " at path ");
        x.append(input.getPath());
        throw new JsonDataException(x.toString());
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/squareup/moshi/JsonWriter;TE;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter out, Enum value) throws IOException {
        if (value == 0) {
            out.nullValue();
            return;
        }
        Object stringOrNumber = this.enumJsonFormatter.toStringOrNumber((EnumJsonFormatter<E>) value);
        if (stringOrNumber instanceof Number) {
            out.value((Number) stringOrNumber);
        } else {
            out.value(stringOrNumber.toString());
        }
    }
}
