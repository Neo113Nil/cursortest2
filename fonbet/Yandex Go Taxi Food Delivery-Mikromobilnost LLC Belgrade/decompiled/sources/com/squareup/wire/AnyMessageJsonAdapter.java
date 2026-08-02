package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.unr0;
import defpackage.zzb;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/wire/AnyMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "", "Lcom/squareup/wire/ProtoAdapter;", "typeUrlToAdapter", "<init>", "(Lcom/squareup/moshi/Moshi;Ljava/util/Map;)V", "Lcom/squareup/moshi/JsonReader;", "name", "readStringNamed", "(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)Ljava/lang/String;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/squareup/wire/AnyMessage;)V", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/moshi/Moshi;", "Ljava/util/Map;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnyMessageJsonAdapter extends JsonAdapter<AnyMessage> {
    private final Moshi moshi;
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public AnyMessageJsonAdapter(Moshi moshi, Map<String, ? extends ProtoAdapter<?>> map) {
        this.moshi = moshi;
        this.typeUrlToAdapter = map;
    }

    private final String readStringNamed(JsonReader jsonReader, String str) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jl40.l(jsonReader.nextName(), str)) {
                return jsonReader.nextString();
            }
            jsonReader.skipValue();
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public AnyMessage fromJson(JsonReader reader) throws IOException {
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
            return null;
        }
        JsonReader peekJson = reader.peekJson();
        try {
            String readStringNamed = readStringNamed(peekJson, "@type");
            peekJson.close();
            if (readStringNamed == null) {
                kbs.s(reader.getPath(), "expected @type in ");
                return null;
            }
            ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(readStringNamed);
            if (protoAdapter != null) {
                return AnyMessage.INSTANCE.pack((Message) this.moshi.adapter(((zzb) protoAdapter.getType()).a()).fromJson(reader));
            }
            StringBuilder x = unr0.x("Cannot resolve type: ", readStringNamed, " in ");
            x.append(reader.getPath());
            throw new JsonDataException(x.toString());
        } finally {
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, AnyMessage value) throws IOException {
        if (value == null) {
            writer.nullValue();
            return;
        }
        writer.beginObject();
        writer.name("@type");
        writer.value(value.getTypeUrl());
        ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(value.getTypeUrl());
        if (protoAdapter == null) {
            kbs.k("Cannot find type for url: ", value.getTypeUrl(), " in ", writer.getPath());
            return;
        }
        JsonAdapter adapter = this.moshi.adapter(((zzb) protoAdapter.getType()).a());
        int beginFlatten = writer.beginFlatten();
        adapter.toJson(writer, (JsonWriter) value.unpack(protoAdapter));
        writer.endFlatten(beginFlatten);
        writer.endObject();
    }
}
