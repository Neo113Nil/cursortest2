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
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"LNAlice/NAliceApi/platform/utils/TLocalIoTSource;", "Lcom/squareup/wire/Message;", "", "EndpointId", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEndpointId$annotations", "()V", "getEndpointId", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TLocalIoTSource extends Message {
    public static final ProtoAdapter<TLocalIoTSource> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endpoint_id", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String EndpointId;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TLocalIoTSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TLocalIoTSource>(fieldEncoding, a, syntax) { // from class: NAlice.NAliceApi.platform.utils.TLocalIoTSource$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TLocalIoTSource decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TLocalIoTSource(str, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TLocalIoTSource value) {
                if (!jl40.l(value.getEndpointId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEndpointId());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TLocalIoTSource value) {
                int h = value.unknownFields().h();
                return !jl40.l(value.getEndpointId(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEndpointId()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TLocalIoTSource redact(TLocalIoTSource value) {
                return TLocalIoTSource.copy$default(value, null, ByteString.c, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TLocalIoTSource value) {
                writer.writeBytes(value.unknownFields());
                if (jl40.l(value.getEndpointId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEndpointId());
            }
        };
    }

    public /* synthetic */ TLocalIoTSource(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TLocalIoTSource copy$default(TLocalIoTSource tLocalIoTSource, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tLocalIoTSource.EndpointId;
        }
        if ((i & 2) != 0) {
            byteString = tLocalIoTSource.unknownFields();
        }
        return tLocalIoTSource.copy(str, byteString);
    }

    @ColumnNameOption("endpoint_id")
    public static /* synthetic */ void getEndpointId$annotations() {
    }

    public final TLocalIoTSource copy(String EndpointId, ByteString unknownFields) {
        return new TLocalIoTSource(EndpointId, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TLocalIoTSource)) {
            return false;
        }
        TLocalIoTSource tLocalIoTSource = (TLocalIoTSource) other;
        return jl40.l(unknownFields(), tLocalIoTSource.unknownFields()) && jl40.l(this.EndpointId, tLocalIoTSource.EndpointId);
    }

    public final String getEndpointId() {
        return this.EndpointId;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.EndpointId.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m0newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("EndpointId=", Internal.sanitize(this.EndpointId), arrayList);
        return a.X(arrayList, Extension.FIX_SPACE, "TLocalIoTSource{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m0newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TLocalIoTSource() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TLocalIoTSource(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.EndpointId = str;
    }
}
