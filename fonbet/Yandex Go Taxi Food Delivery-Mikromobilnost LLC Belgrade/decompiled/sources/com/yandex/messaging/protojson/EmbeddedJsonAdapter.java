package com.yandex.messaging.protojson;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import defpackage.ydz;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/protojson/EmbeddedJsonAdapter;", "T", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "jsonAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonAdapter;", "protojson_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmbeddedJsonAdapter<T> extends ProtoAdapter<T> {
    private final JsonAdapter<T> jsonAdapter;

    public EmbeddedJsonAdapter(JsonAdapter<T> jsonAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) String.class);
        this.jsonAdapter = jsonAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String readString = protoReader.readString();
        try {
            return this.jsonAdapter.fromJson(readString);
        } catch (Exception e) {
            if (!(e instanceof JsonDataException) && !(e instanceof JsonEncodingException)) {
                throw e;
            }
            if (!ydz.a.a()) {
                return null;
            }
            ydz.c("EmbeddedJsonAdapter", "Error parse json: " + readString, e);
            return null;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        protoWriter.writeString(this.jsonAdapter.toJson(obj));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        if (obj == null) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) obj);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int i;
        String json2 = this.jsonAdapter.toJson(obj);
        int length = json2.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = json2.charAt(i2);
            if (charAt >= 128) {
                if (charAt < 2048) {
                    i3 += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 += 3;
                } else if (charAt <= 56319 && (i = i2 + 1) < length && json2.charAt(i) >= 56320 && json2.charAt(i) <= 57343) {
                    i3 += 4;
                    i2 = i;
                }
                i2++;
            }
            i3++;
            i2++;
        }
        return i3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        if (obj == null) {
            return 0;
        }
        return super.encodedSizeWithTag(i, obj);
    }
}
