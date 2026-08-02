package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5189t8 extends MessageNano {
    public static volatile C5189t8[] f;
    public byte[] a;
    public byte[] b;
    public C5290x8 c;
    public C5215u8[] d;
    public int e;

    public C5189t8() {
        a();
    }

    public static C5189t8[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C5189t8[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C5189t8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = C5215u8.b();
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C5290x8 c5290x8 = this.c;
        if (c5290x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5290x8);
        }
        C5215u8[] c5215u8Arr = this.d;
        if (c5215u8Arr != null && c5215u8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5215u8[] c5215u8Arr2 = this.d;
                if (i >= c5215u8Arr2.length) {
                    break;
                }
                C5215u8 c5215u8 = c5215u8Arr2[i];
                if (c5215u8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c5215u8) + computeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.e;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(5, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C5290x8 c5290x8 = this.c;
        if (c5290x8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5290x8);
        }
        C5215u8[] c5215u8Arr = this.d;
        if (c5215u8Arr != null && c5215u8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5215u8[] c5215u8Arr2 = this.d;
                if (i >= c5215u8Arr2.length) {
                    break;
                }
                C5215u8 c5215u8 = c5215u8Arr2[i];
                if (c5215u8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c5215u8);
                }
                i++;
            }
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5189t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5189t8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5189t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C5290x8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C5215u8[] c5215u8Arr = this.d;
                int length = c5215u8Arr == null ? 0 : c5215u8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5215u8[] c5215u8Arr2 = new C5215u8[i];
                if (length != 0) {
                    System.arraycopy(c5215u8Arr, 0, c5215u8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5215u8 c5215u8 = new C5215u8();
                    c5215u8Arr2[length] = c5215u8;
                    codedInputByteBufferNano.readMessage(c5215u8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5215u8 c5215u82 = new C5215u8();
                c5215u8Arr2[length] = c5215u82;
                codedInputByteBufferNano.readMessage(c5215u82);
                this.d = c5215u8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.e = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5189t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5189t8) MessageNano.mergeFrom(new C5189t8(), bArr);
    }
}
