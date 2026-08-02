package NYT.platform.utils;

import NYT.platform.utils.EWrapperMessageFlag;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"LNYT/platform/utils/EWrapperMessageFlag;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Enum", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EWrapperMessageFlag extends Message {
    public static final ProtoAdapter<EWrapperMessageFlag> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(EWrapperMessageFlag.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new ProtoAdapter<EWrapperMessageFlag>(fieldEncoding, a, syntax) { // from class: NYT.platform.utils.EWrapperMessageFlag$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EWrapperMessageFlag decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EWrapperMessageFlag(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EWrapperMessageFlag value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EWrapperMessageFlag value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EWrapperMessageFlag redact(EWrapperMessageFlag value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EWrapperMessageFlag value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ EWrapperMessageFlag(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ EWrapperMessageFlag copy$default(EWrapperMessageFlag eWrapperMessageFlag, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = eWrapperMessageFlag.unknownFields();
        }
        return eWrapperMessageFlag.copy(byteString);
    }

    public final EWrapperMessageFlag copy(ByteString unknownFields) {
        return new EWrapperMessageFlag(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof EWrapperMessageFlag) && jl40.l(unknownFields(), ((EWrapperMessageFlag) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m10newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "EWrapperMessageFlag{}";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"LNYT/platform/utils/EWrapperMessageFlag$Enum;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE", "SORT_FIELDS_BY_FIELD_NUMBER", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Enum implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Enum[] $VALUES;
        public static final ProtoAdapter<Enum> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Enum DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE;
        public static final Enum SORT_FIELDS_BY_FIELD_NUMBER;
        private final int value;

        private static final /* synthetic */ Enum[] $values() {
            return new Enum[]{DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE, SORT_FIELDS_BY_FIELD_NUMBER};
        }

        static {
            final Enum r0 = new Enum("DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE", 0, 0);
            DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE = r0;
            SORT_FIELDS_BY_FIELD_NUMBER = new Enum("SORT_FIELDS_BY_FIELD_NUMBER", 1, 1);
            Enum[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(Enum.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter<Enum>(a, syntax, r0) { // from class: NYT.platform.utils.EWrapperMessageFlag$Enum$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.EnumAdapter
                public EWrapperMessageFlag.Enum fromValue(int value) {
                    return EWrapperMessageFlag.Enum.INSTANCE.fromValue(value);
                }
            };
        }

        private Enum(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Enum fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Enum valueOf(String str) {
            return (Enum) java.lang.Enum.valueOf(Enum.class, str);
        }

        public static Enum[] values() {
            return (Enum[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LNYT/platform/utils/EWrapperMessageFlag$Enum$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "LNYT/platform/utils/EWrapperMessageFlag$Enum;", "fromValue", "value", "", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Enum fromValue(int value) {
                if (value == 0) {
                    return Enum.DEPRECATED_SORT_FIELDS_AS_IN_PROTO_FILE;
                }
                if (value != 1) {
                    return null;
                }
                return Enum.SORT_FIELDS_BY_FIELD_NUMBER;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m10newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EWrapperMessageFlag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EWrapperMessageFlag(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
