package NYT.quark.file.download;

import NYT.quark.file.download.EWrapperFieldFlag;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"LNYT/quark/file/download/EWrapperFieldFlag;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Enum", "quark-file-download_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EWrapperFieldFlag extends Message {
    public static final ProtoAdapter<EWrapperFieldFlag> ADAPTER;
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(EWrapperFieldFlag.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new ProtoAdapter<EWrapperFieldFlag>(fieldEncoding, a, syntax) { // from class: NYT.quark.file.download.EWrapperFieldFlag$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EWrapperFieldFlag decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EWrapperFieldFlag(reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EWrapperFieldFlag value) {
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EWrapperFieldFlag value) {
                return value.unknownFields().h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EWrapperFieldFlag redact(EWrapperFieldFlag value) {
                return value.copy(ByteString.c);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EWrapperFieldFlag value) {
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ EWrapperFieldFlag(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ EWrapperFieldFlag copy$default(EWrapperFieldFlag eWrapperFieldFlag, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = eWrapperFieldFlag.unknownFields();
        }
        return eWrapperFieldFlag.copy(byteString);
    }

    public final EWrapperFieldFlag copy(ByteString unknownFields) {
        return new EWrapperFieldFlag(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof EWrapperFieldFlag) && jl40.l(unknownFields(), ((EWrapperFieldFlag) other).unknownFields());
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m15newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "EWrapperFieldFlag{}";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"LNYT/quark/file/download/EWrapperFieldFlag$Enum;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ANY", "OTHER_COLUMNS", "ENUM_INT", "ENUM_STRING", "SERIALIZATION_YT", "SERIALIZATION_PROTOBUF", "REQUIRED_LIST", "OPTIONAL_LIST", "MAP_AS_LIST_OF_STRUCTS_LEGACY", "MAP_AS_LIST_OF_STRUCTS", "MAP_AS_DICT", "MAP_AS_OPTIONAL_DICT", "EMBEDDED", "ENUM_SKIP_UNKNOWN_VALUES", "ENUM_CHECK_VALUES", "Companion", "quark-file-download_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Enum implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Enum[] $VALUES;
        public static final ProtoAdapter<Enum> ADAPTER;
        public static final Enum ANY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Enum EMBEDDED;
        public static final Enum ENUM_CHECK_VALUES;
        public static final Enum ENUM_INT;
        public static final Enum ENUM_SKIP_UNKNOWN_VALUES;
        public static final Enum ENUM_STRING;
        public static final Enum MAP_AS_DICT;
        public static final Enum MAP_AS_LIST_OF_STRUCTS;
        public static final Enum MAP_AS_LIST_OF_STRUCTS_LEGACY;
        public static final Enum MAP_AS_OPTIONAL_DICT;
        public static final Enum OPTIONAL_LIST;
        public static final Enum OTHER_COLUMNS;
        public static final Enum REQUIRED_LIST;
        public static final Enum SERIALIZATION_PROTOBUF;
        public static final Enum SERIALIZATION_YT;
        private final int value;

        private static final /* synthetic */ Enum[] $values() {
            return new Enum[]{ANY, OTHER_COLUMNS, ENUM_INT, ENUM_STRING, SERIALIZATION_YT, SERIALIZATION_PROTOBUF, REQUIRED_LIST, OPTIONAL_LIST, MAP_AS_LIST_OF_STRUCTS_LEGACY, MAP_AS_LIST_OF_STRUCTS, MAP_AS_DICT, MAP_AS_OPTIONAL_DICT, EMBEDDED, ENUM_SKIP_UNKNOWN_VALUES, ENUM_CHECK_VALUES};
        }

        static {
            final Enum r0 = new Enum("ANY", 0, 0);
            ANY = r0;
            OTHER_COLUMNS = new Enum("OTHER_COLUMNS", 1, 1);
            ENUM_INT = new Enum("ENUM_INT", 2, 2);
            ENUM_STRING = new Enum("ENUM_STRING", 3, 3);
            SERIALIZATION_YT = new Enum("SERIALIZATION_YT", 4, 4);
            SERIALIZATION_PROTOBUF = new Enum("SERIALIZATION_PROTOBUF", 5, 5);
            REQUIRED_LIST = new Enum("REQUIRED_LIST", 6, 6);
            OPTIONAL_LIST = new Enum("OPTIONAL_LIST", 7, 7);
            MAP_AS_LIST_OF_STRUCTS_LEGACY = new Enum("MAP_AS_LIST_OF_STRUCTS_LEGACY", 8, 8);
            MAP_AS_LIST_OF_STRUCTS = new Enum("MAP_AS_LIST_OF_STRUCTS", 9, 9);
            MAP_AS_DICT = new Enum("MAP_AS_DICT", 10, 10);
            MAP_AS_OPTIONAL_DICT = new Enum("MAP_AS_OPTIONAL_DICT", 11, 11);
            EMBEDDED = new Enum("EMBEDDED", 12, 12);
            ENUM_SKIP_UNKNOWN_VALUES = new Enum("ENUM_SKIP_UNKNOWN_VALUES", 13, 13);
            ENUM_CHECK_VALUES = new Enum("ENUM_CHECK_VALUES", 14, 14);
            Enum[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(Enum.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter<Enum>(a, syntax, r0) { // from class: NYT.quark.file.download.EWrapperFieldFlag$Enum$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.EnumAdapter
                public EWrapperFieldFlag.Enum fromValue(int value) {
                    return EWrapperFieldFlag.Enum.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"LNYT/quark/file/download/EWrapperFieldFlag$Enum$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "LNYT/quark/file/download/EWrapperFieldFlag$Enum;", "fromValue", "value", "", "quark-file-download_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Enum fromValue(int value) {
                switch (value) {
                    case 0:
                        return Enum.ANY;
                    case 1:
                        return Enum.OTHER_COLUMNS;
                    case 2:
                        return Enum.ENUM_INT;
                    case 3:
                        return Enum.ENUM_STRING;
                    case 4:
                        return Enum.SERIALIZATION_YT;
                    case 5:
                        return Enum.SERIALIZATION_PROTOBUF;
                    case 6:
                        return Enum.REQUIRED_LIST;
                    case 7:
                        return Enum.OPTIONAL_LIST;
                    case 8:
                        return Enum.MAP_AS_LIST_OF_STRUCTS_LEGACY;
                    case 9:
                        return Enum.MAP_AS_LIST_OF_STRUCTS;
                    case 10:
                        return Enum.MAP_AS_DICT;
                    case 11:
                        return Enum.MAP_AS_OPTIONAL_DICT;
                    case 12:
                        return Enum.EMBEDDED;
                    case 13:
                        return Enum.ENUM_SKIP_UNKNOWN_VALUES;
                    case 14:
                        return Enum.ENUM_CHECK_VALUES;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m15newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EWrapperFieldFlag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EWrapperFieldFlag(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
