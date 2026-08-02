package defpackage;

import NAlice.NAliceApi.quark.webchat.TLocalIoTSource;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;

/* loaded from: classes10.dex */
public final class m4x0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long beginMessage = protoReader.beginMessage();
        String str = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TLocalIoTSource(str, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                str = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TLocalIoTSource tLocalIoTSource = (TLocalIoTSource) obj;
        if (!jl40.l(tLocalIoTSource.getEndpointId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) tLocalIoTSource.getEndpointId());
        }
        protoWriter.writeBytes(tLocalIoTSource.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TLocalIoTSource tLocalIoTSource = (TLocalIoTSource) obj;
        int h = tLocalIoTSource.unknownFields().h();
        return !jl40.l(tLocalIoTSource.getEndpointId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, tLocalIoTSource.getEndpointId()) + h : h;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        return TLocalIoTSource.b((TLocalIoTSource) obj);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TLocalIoTSource tLocalIoTSource = (TLocalIoTSource) obj;
        reverseProtoWriter.writeBytes(tLocalIoTSource.unknownFields());
        if (jl40.l(tLocalIoTSource.getEndpointId(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) tLocalIoTSource.getEndpointId());
    }
}
