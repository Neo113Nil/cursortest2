package NAlice.NAliceApi.quark.webchat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.q4x0;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LNAlice/NAliceApi/quark/webchat/TSourceInfo;", "Lcom/squareup/wire/Message;", "", "LNAlice/NAliceApi/quark/webchat/TLocalIoTSource;", "localIoTSource", "LNAlice/NAliceApi/quark/webchat/TLocalIoTSource;", "c", "()LNAlice/NAliceApi/quark/webchat/TLocalIoTSource;", "getLocalIoTSource$annotations", "()V", "LNAlice/NAliceApi/quark/webchat/TLocalScenarioSource;", "localScenarioSource", "LNAlice/NAliceApi/quark/webchat/TLocalScenarioSource;", "f", "()LNAlice/NAliceApi/quark/webchat/TLocalScenarioSource;", "getLocalScenarioSource$annotations", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TSourceInfo extends Message {
    public static final q4x0 a = new q4x0(FieldEncoding.LENGTH_DELIMITED, qoi0.a(TSourceInfo.class), "type.googleapis.com/NAlice.NAliceApi.TSourceInfo", Syntax.PROTO_3, null, "alice/protos/api/source/source.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "NAlice.NAliceApi.quark.webchat.TLocalIoTSource#ADAPTER", jsonName = "local_iot_source", oneofName = "Source", schemaIndex = 0, tag = 1)
    private final TLocalIoTSource localIoTSource;

    @WireField(adapter = "NAlice.NAliceApi.quark.webchat.TLocalScenarioSource#ADAPTER", jsonName = "local_scenario_source", oneofName = "Source", schemaIndex = 1, tag = 2)
    private final TLocalScenarioSource localScenarioSource;

    public TSourceInfo(TLocalIoTSource tLocalIoTSource, TLocalScenarioSource tLocalScenarioSource, ByteString byteString) {
        super(a, byteString);
        this.localIoTSource = tLocalIoTSource;
        this.localScenarioSource = tLocalScenarioSource;
        if (Internal.countNonNull(tLocalIoTSource, tLocalScenarioSource) <= 1) {
            return;
        }
        ny61.g("At most one of localIoTSource, localScenarioSource may be non-null");
        throw null;
    }

    /* renamed from: c, reason: from getter */
    public final TLocalIoTSource getLocalIoTSource() {
        return this.localIoTSource;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TSourceInfo)) {
            return false;
        }
        TSourceInfo tSourceInfo = (TSourceInfo) obj;
        return jl40.l(unknownFields(), tSourceInfo.unknownFields()) && jl40.l(this.localIoTSource, tSourceInfo.localIoTSource) && jl40.l(this.localScenarioSource, tSourceInfo.localScenarioSource);
    }

    /* renamed from: f, reason: from getter */
    public final TLocalScenarioSource getLocalScenarioSource() {
        return this.localScenarioSource;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TLocalIoTSource tLocalIoTSource = this.localIoTSource;
        int hashCode2 = (hashCode + (tLocalIoTSource != null ? tLocalIoTSource.hashCode() : 0)) * 37;
        TLocalScenarioSource tLocalScenarioSource = this.localScenarioSource;
        int hashCode3 = hashCode2 + (tLocalScenarioSource != null ? tLocalScenarioSource.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TLocalIoTSource tLocalIoTSource = this.localIoTSource;
        if (tLocalIoTSource != null) {
            arrayList.add("localIoTSource=" + tLocalIoTSource);
        }
        TLocalScenarioSource tLocalScenarioSource = this.localScenarioSource;
        if (tLocalScenarioSource != null) {
            arrayList.add("localScenarioSource=" + tLocalScenarioSource);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TSourceInfo{", "}", null, 56);
    }

    public TSourceInfo() {
        this(null, null, ByteString.c);
    }
}
