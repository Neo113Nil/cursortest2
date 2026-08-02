package com.squareup.wire;

import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import defpackage.g0c;
import defpackage.gw00;
import defpackage.j73;
import defpackage.lfx;
import defpackage.ny61;
import defpackage.oq6;
import defpackage.oyr;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.qq6;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.yp6;
import defpackage.zy11;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import okio.ByteString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\u001a2\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000f\u001a0\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0012\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0016H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001c\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001f\u001a6\u0010$\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0080\b¢\u0006\u0004\b$\u0010%\u001a6\u0010$\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0080\b¢\u0006\u0004\b$\u0010'\u001a\u001e\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010*\u001a,\u0010-\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010,\u001a\u00020+H\u0080\b¢\u0006\u0004\b-\u0010.\u001a,\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b0\u00101\u001a,\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b2\u00101\u001aJ\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001070\u0001\"\u0004\b\u0000\u00103\"\u0004\b\u0001\u001042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0080\b¢\u0006\u0004\b8\u00109\u001a\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b=\u0010<\u001a\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b>\u0010<\u001a\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b?\u0010<\u001a\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b@\u0010<\u001a\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\bA\u0010<\u001a\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bC\u0010<\u001a\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bD\u0010<\u001a\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bE\u0010<\u001a\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bF\u0010<\u001a\u0015\u0010G\u001a\b\u0012\u0004\u0012\u00020B0\u0001H\u0000¢\u0006\u0004\bG\u0010<\u001a\u000f\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bI\u0010J\u001a\u000f\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bL\u0010M\u001a\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020(0\u0001H\u0000¢\u0006\u0004\bN\u0010<\u001a\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0000¢\u0006\u0004\bO\u0010<\u001a\u0019\u0010R\u001a\f\u0012\b\u0012\u00060Pj\u0002`Q0\u0001H\u0000¢\u0006\u0004\bR\u0010<\u001a\u0019\u0010U\u001a\f\u0012\b\u0012\u00060Sj\u0002`T0\u0001H\u0000¢\u0006\u0004\bU\u0010<\u001a\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0\u0001H\u0000¢\u0006\u0004\bV\u0010<\u001a!\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0002\b\u0003\u0018\u0001070\u0001H\u0000¢\u0006\u0004\bW\u0010<\u001a\u001b\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010/0\u0001H\u0000¢\u0006\u0004\bX\u0010<\u001a\u0017\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0\u0001H\u0000¢\u0006\u0004\bZ\u0010<\u001a\u0017\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0001H\u0000¢\u0006\u0004\b\\\u0010<\u001a7\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010]*\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010_\u001a\u00020(H\u0000¢\u0006\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010c\"\u0014\u0010d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010c\"\u0014\u0010e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010c¨\u0006f"}, d2 = {"E", "Lcom/squareup/wire/ProtoAdapter;", "", "tag", "value", "commonEncodedSizeWithTag", "(Lcom/squareup/wire/ProtoAdapter;ILjava/lang/Object;)I", "Lcom/squareup/wire/ReverseProtoWriter;", "writer", "Lzy11;", "delegateEncode", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ProtoWriter;", "commonEncodeWithTag", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoWriter;ILjava/lang/Object;)V", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ReverseProtoWriter;ILjava/lang/Object;)V", "Loq6;", "sink", "commonEncode", "(Lcom/squareup/wire/ProtoAdapter;Loq6;Ljava/lang/Object;)V", "", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)[B", "Lokio/ByteString;", "commonEncodeByteString", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Lokio/ByteString;", "bytes", "commonDecode", "(Lcom/squareup/wire/ProtoAdapter;[B)Ljava/lang/Object;", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)Ljava/lang/Object;", "Lqq6;", "source", "(Lcom/squareup/wire/ProtoAdapter;Lqq6;)Ljava/lang/Object;", "Lcom/squareup/wire/ProtoReader;", "reader", "", "destination", "commonTryDecode", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoReader;Ljava/util/List;)V", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoReader32;Ljava/util/List;)V", "", "commonToString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/WireField$Label;", "label", "commonWithLabel", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/WireField$Label;)Lcom/squareup/wire/ProtoAdapter;", "", "commonCreatePacked", "(Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "commonCreateRepeated", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "keyAdapter", "valueAdapter", "", "commonNewMapAdapter", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "", "commonBool", "()Lcom/squareup/wire/ProtoAdapter;", "commonInt32", "commonUint32", "commonSint32", "commonFixed32", "commonSfixed32", "", "commonInt64", "commonUint64", "commonSint64", "commonFixed64", "commonSfixed64", "Lcom/squareup/wire/FloatProtoAdapter;", "commonFloat", "()Lcom/squareup/wire/FloatProtoAdapter;", "Lcom/squareup/wire/DoubleProtoAdapter;", "commonDouble", "()Lcom/squareup/wire/DoubleProtoAdapter;", "commonString", "commonBytes", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "commonDuration", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "commonInstant", "commonEmpty", "commonStructMap", "commonStructList", "", "commonStructNull", "", "commonStructValue", "T", "delegate", "typeUrl", "commonWrapper", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "FIXED_BOOL_SIZE", CA20Status.STATUS_USER_I, "FIXED_32_SIZE", "FIXED_64_SIZE", "wire-runtime"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProtoAdapterKt {
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;

    public static final ProtoAdapter<Boolean> commonBool() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Boolean.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Boolean>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonBool$1
            {
                Boolean bool = Boolean.FALSE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader reader) {
                return Boolean.valueOf(reader.readVarint32() != 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Boolean bool) {
                encode(protoWriter, bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
                return encodedSize(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
                return redact(bool.booleanValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Boolean bool) {
                encode(reverseProtoWriter, bool.booleanValue());
            }

            public void encode(ProtoWriter writer, boolean value) {
                writer.writeVarint32(value ? 1 : 0);
            }

            public int encodedSize(boolean value) {
                return 1;
            }

            public Boolean redact(boolean value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, boolean value) {
                writer.writeVarint32(value ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader32 reader) {
                return Boolean.valueOf(reader.readVarint32() != 0);
            }
        };
    }

    public static final ProtoAdapter<ByteString> commonBytes() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(ByteString.class);
        final Syntax syntax = Syntax.PROTO_2;
        final ByteString byteString = ByteString.c;
        return new ProtoAdapter<ByteString>(fieldEncoding, a, syntax, byteString) { // from class: com.squareup.wire.ProtoAdapterKt$commonBytes$1
            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader reader) {
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader32 reader) {
                return reader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ByteString value) {
                writer.writeBytes(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString value) {
                return value.h();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ByteString redact(ByteString value) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ByteString value) {
                writer.writeBytes(value);
            }
        };
    }

    public static final <E> ProtoAdapter<List<E>> commonCreatePacked(ProtoAdapter<E> protoAdapter) {
        if (protoAdapter.getFieldEncoding() != FieldEncoding.LENGTH_DELIMITED) {
            return new PackedProtoAdapter(protoAdapter);
        }
        ny61.g("Unable to pack a length-delimited type.");
        return null;
    }

    public static final <E> ProtoAdapter<List<E>> commonCreateRepeated(ProtoAdapter<E> protoAdapter) {
        return new RepeatedProtoAdapter(protoAdapter);
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, byte[] bArr) {
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(bArr, 0, 0, 6, (Object) null));
    }

    public static final DoubleProtoAdapter commonDouble() {
        return new DoubleProtoAdapter();
    }

    public static final ProtoAdapter<Duration> commonDuration() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(Duration.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Duration>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonDuration$1
            private final int getSameSignNanos(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
            }

            private final long getSameSignSeconds(Duration duration) {
                return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return Duration.ofSeconds(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Duration value) {
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Duration value) {
                long sameSignSeconds = getSameSignSeconds(value);
                int encodedSizeWithTag = sameSignSeconds != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(sameSignSeconds)) : 0;
                int sameSignNanos = getSameSignNanos(value);
                return sameSignNanos != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(sameSignNanos)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration redact(Duration value) {
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Duration value) {
                int sameSignNanos = getSameSignNanos(value);
                if (sameSignNanos != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(sameSignNanos));
                }
                long sameSignSeconds = getSameSignSeconds(value);
                if (sameSignSeconds != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(sameSignSeconds));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Duration decode(ProtoReader32 reader) {
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return Duration.ofSeconds(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<zy11> commonEmpty() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(zy11.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<zy11>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonEmpty$1
            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                    reader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ zy11 redact(zy11 zy11Var) {
                redact2(zy11Var);
                return zy11.a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, zy11 value) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(zy11 value) {
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, zy11 value) {
            }

            /* renamed from: redact, reason: avoid collision after fix types in other method */
            public void redact2(zy11 value) {
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ zy11 decode(ProtoReader protoReader) {
                decode2(protoReader);
                return zy11.a;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ zy11 decode(ProtoReader32 protoReader32) {
                decode2(protoReader32);
                return zy11.a;
            }

            /* renamed from: decode, reason: avoid collision after fix types in other method */
            public void decode2(ProtoReader32 reader) {
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        reader.readUnknownField(nextTag);
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return;
                    }
                }
            }
        };
    }

    public static final <E> byte[] commonEncode(ProtoAdapter<E> protoAdapter, E e) {
        yp6 yp6Var = new yp6();
        protoAdapter.encode((oq6) yp6Var, (yp6) e);
        return yp6Var.B(yp6Var.b);
    }

    public static final <E> ByteString commonEncodeByteString(ProtoAdapter<E> protoAdapter, E e) {
        yp6 yp6Var = new yp6();
        protoAdapter.encode((oq6) yp6Var, (yp6) e);
        return yp6Var.l0(yp6Var.b);
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ReverseProtoWriter reverseProtoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            int byteCount = reverseProtoWriter.getByteCount();
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
            reverseProtoWriter.writeVarint32(reverseProtoWriter.getByteCount() - byteCount);
        } else {
            protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        }
        reverseProtoWriter.writeTag(i, protoAdapter.getFieldEncoding());
    }

    public static final <E> int commonEncodedSizeWithTag(ProtoAdapter<E> protoAdapter, int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = protoAdapter.encodedSize(e);
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.INSTANCE.varint32Size$wire_runtime(encodedSize);
        }
        return ProtoWriter.INSTANCE.tagSize$wire_runtime(i) + encodedSize;
    }

    public static final ProtoAdapter<Integer> commonFixed32() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED32;
        final g0c a = qoi0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                return Integer.valueOf(reader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                return Integer.valueOf(reader.readFixed32());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.writeFixed32(value);
            }

            public int encodedSize(int value) {
                return 4;
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.writeFixed32(value);
            }
        };
    }

    public static final ProtoAdapter<Long> commonFixed64() {
        final FieldEncoding fieldEncoding = FieldEncoding.FIXED64;
        final g0c a = qoi0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonFixed64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                return Long.valueOf(reader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                return Long.valueOf(reader.readFixed64());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.writeFixed64(value);
            }

            public int encodedSize(long value) {
                return 8;
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.writeFixed64(value);
            }
        };
    }

    public static final FloatProtoAdapter commonFloat() {
        return new FloatProtoAdapter();
    }

    public static final ProtoAdapter<Instant> commonInstant() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(Instant.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Instant>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInstant$1
            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return Instant.ofEpochSecond(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Instant value) {
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instant value) {
                long epochSecond = value.getEpochSecond();
                int encodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
                int nano = value.getNano();
                return nano != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) + encodedSizeWithTag : encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant redact(Instant value) {
                return value;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Instant value) {
                int nano = value.getNano();
                if (nano != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(nano));
                }
                long epochSecond = value.getEpochSecond();
                if (epochSecond != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(epochSecond));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instant decode(ProtoReader32 reader) {
                int beginMessage = reader.beginMessage();
                long j = 0;
                int i = 0;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return Instant.ofEpochSecond(j, i);
                    }
                    if (nextTag == 1) {
                        j = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        i = ProtoAdapter.INT32.decode(reader).intValue();
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Integer> commonInt32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                return Integer.valueOf(reader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.writeSignedVarint32$wire_runtime(value);
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.int32Size$wire_runtime(value);
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.writeSignedVarint32$wire_runtime(value);
            }
        };
    }

    public static final ProtoAdapter<Long> commonInt64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonInt64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                return Long.valueOf(reader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.writeVarint64(value);
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.writeVarint64(value);
            }
        };
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> commonNewMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static final ProtoAdapter<Integer> commonSfixed32() {
        return commonFixed32();
    }

    public static final ProtoAdapter<Long> commonSfixed64() {
        return commonFixed64();
    }

    public static final ProtoAdapter<Integer> commonSint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            public int encodedSize(int value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(companion.encodeZigZag32$wire_runtime(value));
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.writeVarint32(ProtoWriter.INSTANCE.encodeZigZag32$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                return Integer.valueOf(ProtoWriter.INSTANCE.decodeZigZag32$wire_runtime(reader.readVarint32()));
            }
        };
    }

    public static final ProtoAdapter<Long> commonSint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonSint64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            public int encodedSize(long value) {
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint64Size$wire_runtime(companion.encodeZigZag64$wire_runtime(value));
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.writeVarint64(ProtoWriter.INSTANCE.encodeZigZag64$wire_runtime(value));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                return Long.valueOf(ProtoWriter.INSTANCE.decodeZigZag64$wire_runtime(reader.readVarint64()));
            }
        };
    }

    public static final ProtoAdapter<String> commonString() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(String.class);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<String>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonString$1
            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader reader) {
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader32 reader) {
                return reader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, String value) {
                writer.writeString(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String value) {
                return (int) q5z.d0(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public String redact(String value) {
                throw new UnsupportedOperationException();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, String value) {
                writer.writeString(value);
            }
        };
    }

    public static final ProtoAdapter<List<?>> commonStructList() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<List<?>>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructList$1
            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader reader) {
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List<?> value) {
                if (value == null) {
                    return;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) it.next());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                Iterator<?> it = value.iterator();
                while (it.hasNext()) {
                    i += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<Object> redact(List<?> value) {
                if (value == null) {
                    return null;
                }
                List<?> list = value;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
                }
                return arrayList;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List<?> value) {
                if (value == null) {
                    return;
                }
                for (int size = value.size() - 1; -1 < size; size--) {
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, (int) value.get(size));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<?> decode(ProtoReader32 reader) {
                ArrayList arrayList = new ArrayList();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return arrayList;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                    }
                }
            }
        };
    }

    public static final ProtoAdapter<Map<String, ?>> commonStructMap() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(Map.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Map<String, ?>>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructMap$1
            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader reader) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        long beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 != 2) {
                                reader.readUnknownField(nextTag2);
                            } else {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Map<String, ?> value) {
                if (value == null) {
                    return;
                }
                Set<Map.Entry<String, ?>> entrySet = value.entrySet();
                Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[0]);
                j73.U(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    int byteCount = writer.getByteCount();
                    ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 2, (int) value2);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) str);
                    writer.writeVarint32(writer.getByteCount() - byteCount);
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Map<String, ?> value) {
                int i = 0;
                if (value == null) {
                    return 0;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    int encodedSizeWithTag = ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value2) + ProtoAdapter.STRING.encodedSizeWithTag(1, key);
                    ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                    i += companion.varint32Size$wire_runtime(encodedSizeWithTag) + companion.tagSize$wire_runtime(1) + encodedSizeWithTag;
                }
                return i;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, Object> redact(Map<String, ?> value) {
                if (value == null) {
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(value.size()));
                Iterator<T> it = value.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Map<String, ?> value) {
                if (value == null) {
                    return;
                }
                for (Map.Entry<String, ?> entry : value.entrySet()) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                    ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value2) + encodedSizeWithTag;
                    writer.writeTag(1, FieldEncoding.LENGTH_DELIMITED);
                    writer.writeVarint32(encodedSizeWithTag2);
                    protoAdapter.encodeWithTag(writer, 1, (int) key);
                    protoAdapter2.encodeWithTag(writer, 2, (int) value2);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Map<String, ?> decode(ProtoReader32 reader) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return linkedHashMap;
                    }
                    if (nextTag != 1) {
                        reader.skip();
                    } else {
                        int beginMessage2 = reader.beginMessage();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int nextTag2 = reader.nextTag();
                            if (nextTag2 == -1) {
                                break;
                            }
                            if (nextTag2 == 1) {
                                str = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag2 != 2) {
                                reader.readUnknownField(nextTag2);
                            } else {
                                obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                            }
                        }
                        reader.endMessageAndGetUnknownFields(beginMessage2);
                        if (str != null) {
                            linkedHashMap.put(str, obj);
                        }
                    }
                }
            }
        };
    }

    public static final ProtoAdapter commonStructNull() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Void.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructNull$1
            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                ny61.v(oyr.i(readVarint32, "expected 0 but was "));
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Void value) {
                writer.writeTag(tag, getFieldEncoding());
                encode(writer, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Void value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Void value) {
                int encodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(tag);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Void value) {
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Void value) {
                writer.writeVarint32(0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Void value) {
                encode(writer, value);
                writer.writeTag(tag, getFieldEncoding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                int readVarint32 = reader.readVarint32();
                if (readVarint32 == 0) {
                    return null;
                }
                ny61.v(oyr.i(readVarint32, "expected 0 but was "));
                return null;
            }
        };
    }

    public static final ProtoAdapter<Object> commonStructValue() {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(Object.class);
        final Syntax syntax = Syntax.PROTO_3;
        return new ProtoAdapter<Object>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonStructValue$1
            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            obj = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.skip();
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Object value) {
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value);
                } else if (value instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                } else {
                    ny61.g(qv10.o("unexpected struct value: ", value));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ReverseProtoWriter writer, int tag, Object value) {
                if (value != null) {
                    super.encodeWithTag(writer, tag, (int) value);
                    return;
                }
                int byteCount = writer.getByteCount();
                encode(writer, value);
                writer.writeVarint32(writer.getByteCount() - byteCount);
                writer.writeTag(tag, getFieldEncoding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, value);
                }
                if (value instanceof Number) {
                    return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) value).doubleValue()));
                }
                if (value instanceof String) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value);
                }
                if (value instanceof Boolean) {
                    return ProtoAdapter.BOOL.encodedSizeWithTag(4, value);
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, value);
                }
                ny61.g(qv10.o("unexpected struct value: ", value));
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int tag, Object value) {
                if (value != null) {
                    return super.encodedSizeWithTag(tag, value);
                }
                int encodedSize = encodedSize(value);
                ProtoWriter.Companion companion = ProtoWriter.INSTANCE;
                return companion.varint32Size$wire_runtime(encodedSize) + companion.tagSize$wire_runtime(tag) + encodedSize;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object redact(Object value) {
                if (value == null) {
                    return ProtoAdapter.STRUCT_NULL.redact(value);
                }
                if (value instanceof Number) {
                    return value;
                }
                if (value instanceof String) {
                    return null;
                }
                if (value instanceof Boolean) {
                    return value;
                }
                if (value instanceof Map) {
                    return ProtoAdapter.STRUCT_MAP.redact((Map) value);
                }
                if (value instanceof List) {
                    return ProtoAdapter.STRUCT_LIST.redact(value);
                }
                ny61.g(qv10.o("unexpected struct value: ", value));
                return null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter writer, int tag, Object value) {
                if (value == null) {
                    writer.writeTag(tag, getFieldEncoding());
                    writer.writeVarint32(encodedSize(value));
                    encode(writer, value);
                    return;
                }
                super.encodeWithTag(writer, tag, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Object decode(ProtoReader32 reader) {
                int beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                                break;
                            case 2:
                                obj = ProtoAdapter.DOUBLE.decode(reader);
                                break;
                            case 3:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 5:
                                obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                                break;
                            case 6:
                                obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                                break;
                            default:
                                reader.skip();
                                break;
                        }
                    } else {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return obj;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Object value) {
                if (value == null) {
                    ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, (int) value);
                    return;
                }
                if (value instanceof Number) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(((Number) value).doubleValue()));
                    return;
                }
                if (value instanceof String) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value);
                    return;
                }
                if (value instanceof Boolean) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value);
                    return;
                }
                if (value instanceof Map) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value);
                } else if (value instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, (int) value);
                } else {
                    ny61.g(qv10.o("unexpected struct value: ", value));
                }
            }
        };
    }

    public static final <E> String commonToString(E e) {
        return String.valueOf(e);
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader protoReader, List<E> list) {
        if (protoReader.beforePossiblyPackedScalar$wire_runtime()) {
            list.add(protoAdapter.decode(protoReader));
        }
    }

    public static final ProtoAdapter<Integer> commonUint32() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Integer.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Integer>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint32$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader reader) {
                return Integer.valueOf(reader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Integer num) {
                encode(protoWriter, num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
                return encodedSize(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Integer redact(Integer num) {
                return redact(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Integer num) {
                encode(reverseProtoWriter, num.intValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader32 reader) {
                return Integer.valueOf(reader.readVarint32());
            }

            public void encode(ProtoWriter writer, int value) {
                writer.writeVarint32(value);
            }

            public int encodedSize(int value) {
                return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
            }

            public Integer redact(int value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, int value) {
                writer.writeVarint32(value);
            }
        };
    }

    public static final ProtoAdapter<Long> commonUint64() {
        final FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final g0c a = qoi0.a(Long.TYPE);
        final Syntax syntax = Syntax.PROTO_2;
        return new ProtoAdapter<Long>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.ProtoAdapterKt$commonUint64$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader reader) {
                return Long.valueOf(reader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Long l) {
                encode(protoWriter, l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Long l) {
                return encodedSize(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Long redact(Long l) {
                return redact(l.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Long l) {
                encode(reverseProtoWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader32 reader) {
                return Long.valueOf(reader.readVarint64());
            }

            public void encode(ProtoWriter writer, long value) {
                writer.writeVarint64(value);
            }

            public int encodedSize(long value) {
                return ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
            }

            public Long redact(long value) {
                throw new UnsupportedOperationException();
            }

            public void encode(ReverseProtoWriter writer, long value) {
                writer.writeVarint64(value);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> ProtoAdapter<?> commonWithLabel(ProtoAdapter<E> protoAdapter, WireField.Label label) {
        return label.isRepeated() ? label.isPacked() ? protoAdapter.asPacked() : protoAdapter.asRepeated() : protoAdapter;
    }

    public static final <T> ProtoAdapter<T> commonWrapper(final ProtoAdapter<T> protoAdapter, final String str) {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final lfx type = protoAdapter.getType();
        final Syntax syntax = Syntax.PROTO_3;
        final T identity = protoAdapter.getIdentity();
        return new ProtoAdapter<T>(str, fieldEncoding, type, syntax, identity) { // from class: com.squareup.wire.ProtoAdapterKt$commonWrapper$1
            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader reader) {
                T identity2 = protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter2.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, T value) {
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(T value) {
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(1, value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T redact(T value) {
                if (value == null) {
                    return null;
                }
                return protoAdapter.redact(value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, T value) {
                if (value == null || value.equals(protoAdapter.getIdentity())) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public T decode(ProtoReader32 reader) {
                T identity2 = protoAdapter.getIdentity();
                ProtoAdapter<T> protoAdapter2 = protoAdapter;
                int beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return identity2;
                    }
                    if (nextTag == 1) {
                        identity2 = protoAdapter2.decode(reader);
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }
        };
    }

    public static final <E> void delegateEncode(ProtoAdapter<E> protoAdapter, ReverseProtoWriter reverseProtoWriter, E e) {
        reverseProtoWriter.writeForward$wire_runtime(new ProtoAdapterKt$delegateEncode$1(protoAdapter, e));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, ByteString byteString) {
        return protoAdapter.decode(ProtoReader32Kt.ProtoReader32$default(byteString, 0, 0, 6, (Object) null));
    }

    public static final <E> E commonDecode(ProtoAdapter<E> protoAdapter, qq6 qq6Var) {
        return protoAdapter.decode(new ProtoReader(qq6Var));
    }

    public static final <E> void commonTryDecode(ProtoAdapter<E> protoAdapter, ProtoReader32 protoReader32, List<E> list) {
        if (protoReader32.beforePossiblyPackedScalar()) {
            list.add(protoAdapter.decode(protoReader32));
        }
    }

    public static final <E> void commonEncode(ProtoAdapter<E> protoAdapter, oq6 oq6Var, E e) {
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        protoAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) e);
        reverseProtoWriter.writeTo(oq6Var);
    }

    public static final <E> void commonEncodeWithTag(ProtoAdapter<E> protoAdapter, ProtoWriter protoWriter, int i, E e) {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, protoAdapter.getFieldEncoding());
        if (protoAdapter.getFieldEncoding() == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(protoAdapter.encodedSize(e));
        }
        protoAdapter.encode(protoWriter, (ProtoWriter) e);
    }
}
