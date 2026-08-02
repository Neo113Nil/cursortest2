package NAlice.NAliceApi.quark.webchat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.jl40;
import defpackage.n4x0;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"LNAlice/NAliceApi/quark/webchat/TLocalScenarioSource;", "Lcom/squareup/wire/Message;", "", "", "scenarioId", "Ljava/lang/String;", "getScenarioId", "()Ljava/lang/String;", "getScenarioId$annotations", "()V", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TLocalScenarioSource extends Message {
    public static final n4x0 a = new n4x0(FieldEncoding.LENGTH_DELIMITED, qoi0.a(TLocalScenarioSource.class), "type.googleapis.com/NAlice.NAliceApi.TLocalScenarioSource", Syntax.PROTO_3, null, "alice/protos/api/source/source.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "scenario_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String scenarioId;

    public TLocalScenarioSource() {
        this("", ByteString.c);
    }

    public static TLocalScenarioSource b(TLocalScenarioSource tLocalScenarioSource) {
        String str = tLocalScenarioSource.scenarioId;
        tLocalScenarioSource.getClass();
        return new TLocalScenarioSource(str, ByteString.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TLocalScenarioSource)) {
            return false;
        }
        TLocalScenarioSource tLocalScenarioSource = (TLocalScenarioSource) obj;
        return jl40.l(unknownFields(), tLocalScenarioSource.unknownFields()) && jl40.l(this.scenarioId, tLocalScenarioSource.scenarioId);
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.scenarioId.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("scenarioId=", Internal.sanitize(this.scenarioId), arrayList);
        return a.X(arrayList, Extension.FIX_SPACE, "TLocalScenarioSource{", "}", null, 56);
    }

    public TLocalScenarioSource(String str, ByteString byteString) {
        super(a, byteString);
        this.scenarioId = str;
    }
}
