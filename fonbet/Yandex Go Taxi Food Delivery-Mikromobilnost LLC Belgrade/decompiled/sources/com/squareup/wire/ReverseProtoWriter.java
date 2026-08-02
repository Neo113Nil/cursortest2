package com.squareup.wire;

import defpackage.i3y;
import defpackage.ny61;
import defpackage.oq6;
import defpackage.oyr;
import defpackage.t7q0;
import defpackage.tls;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.yp6;
import defpackage.zfj0;
import java.io.IOException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.normalizer.Normalizer;
import ru.CryptoPro.reprov.x509.PolicyConstraintsExtension;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0012\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\bJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\bJ\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ\u0015\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter;", "", "<init>", "()V", "", "minByteCount", "Lzy11;", PolicyConstraintsExtension.REQUIRE, "(I)V", "emitCurrentSegment", "Loq6;", "sink", "writeTo", "(Loq6;)V", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoWriter;", "block", "writeForward$wire_runtime", "(Ltls;)V", "writeForward", "Lokio/ByteString;", "value", "writeBytes", "(Lokio/ByteString;)V", "", "writeString", "(Ljava/lang/String;)V", "fieldNumber", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "writeTag", "(ILcom/squareup/wire/FieldEncoding;)V", "writeSignedVarint32$wire_runtime", "writeSignedVarint32", "writeVarint32", "", "writeVarint64", "(J)V", "writeFixed32", "writeFixed64", "Lyp6;", "tail", "Lyp6;", "head", "Lyp6$a;", "cursor", "Lyp6$a;", "", "array", "[B", "arrayLimit", CA20Status.STATUS_USER_I, "forwardBuffer$delegate", "Li3y;", "getForwardBuffer", "()Lyp6;", "forwardBuffer", "forwardWriter$delegate", "getForwardWriter", "()Lcom/squareup/wire/ProtoWriter;", "forwardWriter", "getByteCount", "()I", "byteCount", "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;

    /* renamed from: forwardBuffer$delegate, reason: from kotlin metadata */
    private final i3y forwardBuffer;

    /* renamed from: forwardWriter$delegate, reason: from kotlin metadata */
    private final i3y forwardWriter;
    private yp6 tail = new yp6();
    private yp6 head = new yp6();
    private final yp6.a cursor = new yp6.a();
    private byte[] array = EMPTY_ARRAY;

    public ReverseProtoWriter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.forwardBuffer = a.b(lazyThreadSafetyMode, new zfj0(12));
        this.forwardWriter = a.b(lazyThreadSafetyMode, new vyf0(22, this));
    }

    private final void emitCurrentSegment() {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.N1(this.tail);
        yp6 yp6Var = this.tail;
        this.tail = this.head;
        this.head = yp6Var;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yp6 forwardBuffer_delegate$lambda$0() {
        return new yp6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoWriter forwardWriter_delegate$lambda$0(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final yp6 getForwardBuffer() {
        return (yp6) this.forwardBuffer.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter.getValue();
    }

    private final void require(int minByteCount) {
        if (this.arrayLimit >= minByteCount) {
            return;
        }
        emitCurrentSegment();
        this.head.w(this.cursor);
        yp6.a aVar = this.cursor;
        aVar.getClass();
        if (minByteCount <= 0) {
            w511.f(oyr.i(minByteCount, "minByteCount <= 0: "));
            return;
        }
        if (minByteCount > 8192) {
            w511.f(oyr.i(minByteCount, "minByteCount > Segment.SIZE: "));
            return;
        }
        yp6 yp6Var = aVar.a;
        if (yp6Var == null) {
            ny61.r("not attached to a buffer");
            return;
        }
        if (!aVar.b) {
            ny61.r("expandBuffer() only permitted for read/write buffers");
            return;
        }
        long j = yp6Var.b;
        t7q0 a0 = yp6Var.a0(minByteCount);
        int i = 8192 - a0.c;
        a0.c = 8192;
        yp6Var.b = i + j;
        aVar.c = a0;
        aVar.w = j;
        aVar.x = a0.a;
        aVar.y = 8192 - i;
        aVar.z = 8192;
        yp6.a aVar2 = this.cursor;
        if (aVar2.w == 0) {
            int i2 = aVar2.z;
            byte[] bArr = aVar2.x;
            if (i2 == bArr.length) {
                this.array = bArr;
                this.arrayLimit = i2;
                return;
            }
        }
        ny61.r("Check failed.");
    }

    public final int getByteCount() {
        return (this.array.length - this.arrayLimit) + ((int) this.tail.b);
    }

    public final void writeBytes(ByteString value) {
        int h = value.h();
        while (h != 0) {
            require(1);
            int min = Math.min(this.arrayLimit, h);
            int i = this.arrayLimit - min;
            this.arrayLimit = i;
            h -= min;
            value.c(h, i, min, this.array);
        }
    }

    public final void writeFixed32(int value) {
        require(4);
        int i = this.arrayLimit;
        int i2 = i - 4;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 3] = (byte) ((value >>> 8) & 255);
        bArr[i - 2] = (byte) ((value >>> 16) & 255);
        bArr[i - 1] = (byte) ((value >>> 24) & 255);
    }

    public final void writeFixed64(long value) {
        require(8);
        int i = this.arrayLimit;
        int i2 = i - 8;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 7] = (byte) ((value >>> 8) & 255);
        bArr[i - 6] = (byte) ((value >>> 16) & 255);
        bArr[i - 5] = (byte) ((value >>> 24) & 255);
        bArr[i - 4] = (byte) ((value >>> 32) & 255);
        bArr[i - 3] = (byte) ((value >>> 40) & 255);
        bArr[i - 2] = (byte) ((value >>> 48) & 255);
        bArr[i - 1] = (byte) ((value >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(tls block) throws IOException {
        block.invoke(getForwardWriter());
        yp6 forwardBuffer = getForwardBuffer();
        writeBytes(forwardBuffer.l0(forwardBuffer.b));
    }

    public final void writeSignedVarint32$wire_runtime(int value) {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    public final void writeString(String value) {
        int length = value.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char charAt = value.charAt(length);
            if (charAt < 128) {
                require(1);
                int i2 = this.arrayLimit;
                byte[] bArr = this.array;
                int i3 = i2 - 1;
                bArr[i3] = (byte) charAt;
                int max = Math.max(-1, i - i3);
                int i4 = i3;
                length = i;
                while (length > max) {
                    char charAt2 = value.charAt(length);
                    if (charAt2 >= 128) {
                        break;
                    }
                    length--;
                    i4--;
                    bArr[i4] = (byte) charAt2;
                }
                this.arrayLimit = i4;
            } else {
                if (charAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i5 = this.arrayLimit;
                    int i6 = i5 - 1;
                    this.arrayLimit = i6;
                    bArr2[i6] = (byte) (128 | (charAt & '?'));
                    int i7 = i5 - 2;
                    this.arrayLimit = i7;
                    bArr2[i7] = (byte) ((charAt >> 6) | 192);
                } else if (charAt < 55296 || charAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i8 = this.arrayLimit;
                    int i9 = i8 - 1;
                    this.arrayLimit = i9;
                    bArr3[i9] = (byte) ((charAt & '?') | 128);
                    int i10 = i8 - 2;
                    this.arrayLimit = i10;
                    bArr3[i10] = (byte) (128 | (63 & (charAt >> 6)));
                    int i11 = i8 - 3;
                    this.arrayLimit = i11;
                    bArr3[i11] = (byte) ((charAt >> '\f') | 224);
                } else {
                    char charAt3 = i >= 0 ? value.charAt(i) : Normalizer.DONE;
                    if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i12 = this.arrayLimit - 1;
                        this.arrayLimit = i12;
                        bArr4[i12] = 63;
                    } else {
                        length -= 2;
                        int i13 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i14 = this.arrayLimit;
                        int i15 = i14 - 1;
                        this.arrayLimit = i15;
                        bArr5[i15] = (byte) ((i13 & 63) | 128);
                        int i16 = i14 - 2;
                        this.arrayLimit = i16;
                        bArr5[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        int i17 = i14 - 3;
                        this.arrayLimit = i17;
                        bArr5[i17] = (byte) (128 | (63 & (i13 >> 12)));
                        int i18 = i14 - 4;
                        this.arrayLimit = i18;
                        bArr5[i18] = (byte) ((i13 >> 18) | PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                    }
                }
                length = i;
            }
        }
    }

    public final void writeTag(int fieldNumber, FieldEncoding fieldEncoding) {
        writeVarint32(ProtoWriter.INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeTo(oq6 sink) throws IOException {
        emitCurrentSegment();
        sink.N1(this.tail);
    }

    public final void writeVarint32(int value) {
        int varint32Size$wire_runtime = ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
        require(varint32Size$wire_runtime);
        int i = this.arrayLimit - varint32Size$wire_runtime;
        this.arrayLimit = i;
        while (true) {
            int i2 = value & (-128);
            byte[] bArr = this.array;
            if (i2 == 0) {
                bArr[i] = (byte) value;
                return;
            } else {
                bArr[i] = (byte) ((value & HProv.PP_VERSION_TIMESTAMP) | 128);
                value >>>= 7;
                i++;
            }
        }
    }

    public final void writeVarint64(long value) {
        int varint64Size$wire_runtime = ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
        require(varint64Size$wire_runtime);
        int i = this.arrayLimit - varint64Size$wire_runtime;
        this.arrayLimit = i;
        while (true) {
            long j = (-128) & value;
            byte[] bArr = this.array;
            if (j == 0) {
                bArr[i] = (byte) value;
                return;
            } else {
                bArr[i] = (byte) ((127 & value) | 128);
                value >>>= 7;
                i++;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter$Companion;", "", "<init>", "()V", "EMPTY_ARRAY", "", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
