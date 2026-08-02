package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import defpackage.oq6;
import defpackage.yp6;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 .*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002/.B\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R \u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b$\u0010%\u001a\u0004\b\b\u0010\u001dR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)V", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Loq6;", "sink", "Lzy11;", "encode", "(Loq6;)V", "", "()[B", "encodeByteString", "()Lokio/ByteString;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;)V", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "unknownFields$annotations", "()V", "", "cachedSerializedSize", CA20Status.STATUS_USER_I, "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "Companion", "Builder", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/Message;", "M", "B", "", "<init>", "()V", "Lzy11;", "prepareForNewUnknownFields", "Lokio/ByteString;", "unknownFields", "addUnknownFields", "(Lokio/ByteString;)Lcom/squareup/wire/Message$Builder;", "", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "value", "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)Lcom/squareup/wire/Message$Builder;", "clearUnknownFields", "()Lcom/squareup/wire/Message$Builder;", "buildUnknownFields", "()Lokio/ByteString;", "build", "()Lcom/squareup/wire/Message;", "unknownFieldsByteString", "Lokio/ByteString;", "getUnknownFieldsByteString$wire_runtime", "setUnknownFieldsByteString$wire_runtime", "(Lokio/ByteString;)V", "Lyp6;", "unknownFieldsBuffer", "Lyp6;", "getUnknownFieldsBuffer$wire_runtime", "()Lyp6;", "setUnknownFieldsBuffer$wire_runtime", "(Lyp6;)V", "Lcom/squareup/wire/ProtoWriter;", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient yp6 unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.c;
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new yp6();
                ProtoWriter protoWriter = new ProtoWriter(this.unknownFieldsBuffer);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.c;
            }
        }

        public final Builder<M, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
            prepareForNewUnknownFields();
            fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, tag, (int) value);
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString unknownFields) {
            if (unknownFields.h() > 0) {
                prepareForNewUnknownFields();
                this.unknownFieldsWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            yp6 yp6Var = this.unknownFieldsBuffer;
            if (yp6Var != null) {
                this.unknownFieldsByteString = yp6Var.l0(yp6Var.b);
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.c;
            yp6 yp6Var = this.unknownFieldsBuffer;
            if (yp6Var != null) {
                yp6Var.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        /* renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final yp6 getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        /* renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final ByteString getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        /* renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(yp6 yp6Var) {
            this.unknownFieldsBuffer = yp6Var;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    /* renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.c : byteString;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/Message$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getSerialVersionUID$annotations", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }

        private Companion() {
        }
    }

    public final void encode(oq6 sink) throws IOException {
        this.adapter.encode(sink, (oq6) this);
    }

    public final void encode(OutputStream stream) throws IOException {
        this.adapter.encode(stream, (OutputStream) this);
    }
}
