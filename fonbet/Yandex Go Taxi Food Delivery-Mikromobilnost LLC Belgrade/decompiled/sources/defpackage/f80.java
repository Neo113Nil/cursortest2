package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class f80 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        boolean z;
        int readVarint32 = protoReader.readVarint32();
        if (readVarint32 != 0) {
            z = true;
            if (readVarint32 != 1) {
                throw new IOException(String.format("Invalid boolean value 0x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(readVarint32)}, 1)));
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        protoWriter.writeVarint32(((Boolean) obj).booleanValue() ? 1 : 0);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) bool);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final /* bridge */ /* synthetic */ int encodedSize(Object obj) {
        ((Boolean) obj).getClass();
        return 1;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return 0;
        }
        return super.encodedSizeWithTag(i, bool);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Boolean) obj).booleanValue();
        throw new UnsupportedOperationException();
    }
}
