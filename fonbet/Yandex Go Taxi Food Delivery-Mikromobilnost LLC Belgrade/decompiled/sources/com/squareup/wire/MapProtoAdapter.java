package com.squareup.wire;

import defpackage.gw00;
import defpackage.j73;
import defpackage.ny61;
import defpackage.qoi0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J5\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0019J#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ/\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/squareup/wire/MapProtoAdapter;", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "value", "", "encodedSize", "(Ljava/util/Map;)I", "tag", "encodedSizeWithTag", "(ILjava/util/Map;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Lzy11;", "encode", "(Lcom/squareup/wire/ProtoWriter;Ljava/util/Map;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/util/Map;)V", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;ILjava/util/Map;)V", "(Lcom/squareup/wire/ReverseProtoWriter;ILjava/util/Map;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/util/Map;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/util/Map;", "redact", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/squareup/wire/MapEntryProtoAdapter;", "entryAdapter", "Lcom/squareup/wire/MapEntryProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, ? extends V>> {
    private final MapEntryProtoAdapter<K, V> entryAdapter;

    public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        super(FieldEncoding.LENGTH_DELIMITED, qoi0.a(Map.class), null, protoAdapter2.getSyntax(), b.f(), null, 32, null);
        this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader reader) {
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (nextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            ny61.r("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return gw00.e(new Pair(identity, identity2));
        }
        ny61.r("Map entry with null value");
        return null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Map<K, ? extends V> value) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int tag, Map<K, ? extends V> value) {
        if (value == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) value.entrySet().toArray(new Map.Entry[0]);
        j73.U(entryArr);
        for (Map.Entry entry : entryArr) {
            this.entryAdapter.encodeWithTag(writer, tag, (int) entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map<K, ? extends V> value) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, Map<K, ? extends V> value) {
        int i = 0;
        if (value == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            i += this.entryAdapter.encodedSizeWithTag(tag, it.next());
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> redact(Map<K, ? extends V> value) {
        return b.f();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Map<K, ? extends V> value) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int tag, Map<K, ? extends V> value) {
        if (value == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(writer, tag, (int) it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader32 reader) {
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        int beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (nextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            ny61.r("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return gw00.e(new Pair(identity, identity2));
        }
        ny61.r("Map entry with null value");
        return null;
    }
}
