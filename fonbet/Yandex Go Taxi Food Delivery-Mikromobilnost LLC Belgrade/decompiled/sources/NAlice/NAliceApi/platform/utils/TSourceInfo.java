package NAlice.NAliceApi.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.qoi0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"LNAlice/NAliceApi/platform/utils/TSourceInfo;", "Lcom/squareup/wire/Message;", "", "LocalIoTSource", "LNAlice/NAliceApi/platform/utils/TLocalIoTSource;", "LocalScenarioSource", "LNAlice/NAliceApi/platform/utils/TLocalScenarioSource;", "unknownFields", "Lokio/ByteString;", "<init>", "(LNAlice/NAliceApi/platform/utils/TLocalIoTSource;LNAlice/NAliceApi/platform/utils/TLocalScenarioSource;Lokio/ByteString;)V", "getLocalIoTSource$annotations", "()V", "getLocalIoTSource", "()LNAlice/NAliceApi/platform/utils/TLocalIoTSource;", "getLocalScenarioSource$annotations", "getLocalScenarioSource", "()LNAlice/NAliceApi/platform/utils/TLocalScenarioSource;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TSourceInfo extends Message {
    public static final ProtoAdapter<TSourceInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "NAlice.NAliceApi.platform.utils.TLocalIoTSource#ADAPTER", jsonName = "local_iot_source", oneofName = "Source", schemaIndex = 0, tag = 1)
    private final TLocalIoTSource LocalIoTSource;

    @WireField(adapter = "NAlice.NAliceApi.platform.utils.TLocalScenarioSource#ADAPTER", jsonName = "local_scenario_source", oneofName = "Source", schemaIndex = 1, tag = 2)
    private final TLocalScenarioSource LocalScenarioSource;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TSourceInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TSourceInfo>(fieldEncoding, a, syntax) { // from class: NAlice.NAliceApi.platform.utils.TSourceInfo$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TSourceInfo decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                TLocalIoTSource tLocalIoTSource = null;
                TLocalScenarioSource tLocalScenarioSource = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TSourceInfo(tLocalIoTSource, tLocalScenarioSource, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        tLocalIoTSource = TLocalIoTSource.ADAPTER.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        tLocalScenarioSource = TLocalScenarioSource.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TSourceInfo value) {
                TLocalIoTSource.ADAPTER.encodeWithTag(writer, 1, (int) value.getLocalIoTSource());
                TLocalScenarioSource.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocalScenarioSource());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TSourceInfo value) {
                return TLocalScenarioSource.ADAPTER.encodedSizeWithTag(2, value.getLocalScenarioSource()) + TLocalIoTSource.ADAPTER.encodedSizeWithTag(1, value.getLocalIoTSource()) + value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TSourceInfo redact(TSourceInfo value) {
                TLocalIoTSource localIoTSource = value.getLocalIoTSource();
                TLocalIoTSource redact = localIoTSource != null ? TLocalIoTSource.ADAPTER.redact(localIoTSource) : null;
                TLocalScenarioSource localScenarioSource = value.getLocalScenarioSource();
                return value.copy(redact, localScenarioSource != null ? TLocalScenarioSource.ADAPTER.redact(localScenarioSource) : null, ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TSourceInfo value) {
                writer.writeBytes(value.unknownFields());
                TLocalScenarioSource.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocalScenarioSource());
                TLocalIoTSource.ADAPTER.encodeWithTag(writer, 1, (int) value.getLocalIoTSource());
            }
        };
    }

    public TSourceInfo(TLocalIoTSource tLocalIoTSource, TLocalScenarioSource tLocalScenarioSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.LocalIoTSource = tLocalIoTSource;
        this.LocalScenarioSource = tLocalScenarioSource;
        if (Internal.countNonNull(tLocalIoTSource, tLocalScenarioSource) <= 1) {
            return;
        }
        ny61.g("At most one of LocalIoTSource, LocalScenarioSource may be non-null");
        throw null;
    }

    public static /* synthetic */ TSourceInfo copy$default(TSourceInfo tSourceInfo, TLocalIoTSource tLocalIoTSource, TLocalScenarioSource tLocalScenarioSource, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            tLocalIoTSource = tSourceInfo.LocalIoTSource;
        }
        if ((i & 2) != 0) {
            tLocalScenarioSource = tSourceInfo.LocalScenarioSource;
        }
        if ((i & 4) != 0) {
            byteString = tSourceInfo.unknownFields();
        }
        return tSourceInfo.copy(tLocalIoTSource, tLocalScenarioSource, byteString);
    }

    @ColumnNameOption("local_iot_source")
    public static /* synthetic */ void getLocalIoTSource$annotations() {
    }

    @ColumnNameOption("local_scenario_source")
    public static /* synthetic */ void getLocalScenarioSource$annotations() {
    }

    public final TSourceInfo copy(TLocalIoTSource LocalIoTSource, TLocalScenarioSource LocalScenarioSource, ByteString unknownFields) {
        return new TSourceInfo(LocalIoTSource, LocalScenarioSource, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TSourceInfo)) {
            return false;
        }
        TSourceInfo tSourceInfo = (TSourceInfo) other;
        return jl40.l(unknownFields(), tSourceInfo.unknownFields()) && jl40.l(this.LocalIoTSource, tSourceInfo.LocalIoTSource) && jl40.l(this.LocalScenarioSource, tSourceInfo.LocalScenarioSource);
    }

    public final TLocalIoTSource getLocalIoTSource() {
        return this.LocalIoTSource;
    }

    public final TLocalScenarioSource getLocalScenarioSource() {
        return this.LocalScenarioSource;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TLocalIoTSource tLocalIoTSource = this.LocalIoTSource;
        int hashCode2 = (hashCode + (tLocalIoTSource != null ? tLocalIoTSource.hashCode() : 0)) * 37;
        TLocalScenarioSource tLocalScenarioSource = this.LocalScenarioSource;
        int hashCode3 = hashCode2 + (tLocalScenarioSource != null ? tLocalScenarioSource.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m2newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TLocalIoTSource tLocalIoTSource = this.LocalIoTSource;
        if (tLocalIoTSource != null) {
            arrayList.add("LocalIoTSource=" + tLocalIoTSource);
        }
        TLocalScenarioSource tLocalScenarioSource = this.LocalScenarioSource;
        if (tLocalScenarioSource != null) {
            arrayList.add("LocalScenarioSource=" + tLocalScenarioSource);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TSourceInfo{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m2newBuilder();
    }

    public /* synthetic */ TSourceInfo(TLocalIoTSource tLocalIoTSource, TLocalScenarioSource tLocalScenarioSource, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tLocalIoTSource, (i & 2) != 0 ? null : tLocalScenarioSource, (i & 4) != 0 ? ByteString.c : byteString);
    }

    public TSourceInfo() {
        this(null, null, null, 7, null);
    }
}
