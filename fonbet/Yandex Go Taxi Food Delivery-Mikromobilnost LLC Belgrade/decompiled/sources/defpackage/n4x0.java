package defpackage;

import NAlice.NAliceApi.quark.webchat.TLocalScenarioSource;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;

/* loaded from: classes10.dex */
public final class n4x0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long beginMessage = protoReader.beginMessage();
        String str = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TLocalScenarioSource(str, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        TLocalScenarioSource tLocalScenarioSource = (TLocalScenarioSource) obj;
        if (!jl40.l(tLocalScenarioSource.getScenarioId(), "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) tLocalScenarioSource.getScenarioId());
        }
        protoWriter.writeBytes(tLocalScenarioSource.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TLocalScenarioSource tLocalScenarioSource = (TLocalScenarioSource) obj;
        int h = tLocalScenarioSource.unknownFields().h();
        return !jl40.l(tLocalScenarioSource.getScenarioId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, tLocalScenarioSource.getScenarioId()) + h : h;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        return TLocalScenarioSource.b((TLocalScenarioSource) obj);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TLocalScenarioSource tLocalScenarioSource = (TLocalScenarioSource) obj;
        reverseProtoWriter.writeBytes(tLocalScenarioSource.unknownFields());
        if (jl40.l(tLocalScenarioSource.getScenarioId(), "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) tLocalScenarioSource.getScenarioId());
    }
}
