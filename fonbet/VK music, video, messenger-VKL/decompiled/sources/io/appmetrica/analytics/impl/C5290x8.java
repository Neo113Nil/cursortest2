package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5290x8 extends MessageNano {
    public static volatile C5290x8[] c;
    public C5265w8[] a;
    public int b;

    public C5290x8() {
        a();
    }

    public static C5290x8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5290x8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5290x8 a() {
        this.a = C5265w8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5265w8[] c5265w8Arr = this.a;
        if (c5265w8Arr != null && c5265w8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5265w8[] c5265w8Arr2 = this.a;
                if (i >= c5265w8Arr2.length) {
                    break;
                }
                C5265w8 c5265w8 = c5265w8Arr2[i];
                if (c5265w8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5265w8) + computeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.b;
        return i2 != 0 ? CodedOutputByteBufferNano.computeUInt32Size(2, i2) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5265w8[] c5265w8Arr = this.a;
        if (c5265w8Arr != null && c5265w8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5265w8[] c5265w8Arr2 = this.a;
                if (i >= c5265w8Arr2.length) {
                    break;
                }
                C5265w8 c5265w8 = c5265w8Arr2[i];
                if (c5265w8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5265w8);
                }
                i++;
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5290x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5265w8[] c5265w8Arr = this.a;
                int length = c5265w8Arr == null ? 0 : c5265w8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5265w8[] c5265w8Arr2 = new C5265w8[i];
                if (length != 0) {
                    System.arraycopy(c5265w8Arr, 0, c5265w8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5265w8 c5265w8 = new C5265w8();
                    c5265w8Arr2[length] = c5265w8;
                    codedInputByteBufferNano.readMessage(c5265w8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5265w8 c5265w82 = new C5265w8();
                c5265w8Arr2[length] = c5265w82;
                codedInputByteBufferNano.readMessage(c5265w82);
                this.a = c5265w8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.b = codedInputByteBufferNano.readUInt32();
            }
        }
        return this;
    }

    public static C5290x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5290x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5290x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5290x8) MessageNano.mergeFrom(new C5290x8(), bArr);
    }
}
