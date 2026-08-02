package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes15.dex */
public final class h80 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        return Long.valueOf(protoReader.readVarint64());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        protoWriter.writeVarint64(((Number) obj).longValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) l);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        return k80.b(((Number) obj).longValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return 0;
        }
        return super.encodedSizeWithTag(i, l);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Number) obj).longValue();
        throw new UnsupportedOperationException();
    }
}
