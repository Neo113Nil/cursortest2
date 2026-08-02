package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* loaded from: classes11.dex */
public final class e80 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        return protoReader.readBytes();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        protoWriter.writeBytes((ByteString) obj);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        ByteString byteString = (ByteString) obj;
        if (byteString == null) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        return ((ByteString) obj).h();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        ByteString byteString = (ByteString) obj;
        if (byteString == null) {
            return 0;
        }
        return super.encodedSizeWithTag(i, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        throw new UnsupportedOperationException();
    }
}
