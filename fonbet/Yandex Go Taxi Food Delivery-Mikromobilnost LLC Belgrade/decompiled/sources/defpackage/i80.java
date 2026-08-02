package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;

/* loaded from: classes15.dex */
public final class i80 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        return Integer.valueOf(protoReader.readVarint32());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        protoWriter.writeVarint32(((Number) obj).intValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() == 0) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) num);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        return k80.a(((Number) obj).intValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i, num);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Number) obj).intValue();
        throw new UnsupportedOperationException();
    }
}
