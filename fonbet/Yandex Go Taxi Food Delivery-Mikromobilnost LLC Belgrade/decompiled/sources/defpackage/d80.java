package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* loaded from: classes11.dex */
public final class d80 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        return protoReader.readBytes().v();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        if (length == j.b) {
            length = bArr.length;
        }
        j.b(bArr.length, 0L, length);
        protoWriter.writeBytes(new ByteString(f73.m(0, length, bArr)));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) bArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return 0;
        }
        return super.encodedSizeWithTag(i, bArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        throw new UnsupportedOperationException();
    }
}
