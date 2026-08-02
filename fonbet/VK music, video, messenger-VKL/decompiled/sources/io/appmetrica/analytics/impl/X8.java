package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class X8 extends MessageNano {
    public static volatile X8[] b;
    public W8[] a;

    public X8() {
        a();
    }

    public static X8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new X8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final X8 a() {
        this.a = W8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        W8[] w8Arr = this.a;
        if (w8Arr != null && w8Arr.length > 0) {
            int i = 0;
            while (true) {
                W8[] w8Arr2 = this.a;
                if (i >= w8Arr2.length) {
                    break;
                }
                W8 w8 = w8Arr2[i];
                if (w8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, w8) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        W8[] w8Arr = this.a;
        if (w8Arr != null && w8Arr.length > 0) {
            int i = 0;
            while (true) {
                W8[] w8Arr2 = this.a;
                if (i >= w8Arr2.length) {
                    break;
                }
                W8 w8 = w8Arr2[i];
                if (w8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, w8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                W8[] w8Arr = this.a;
                int length = w8Arr == null ? 0 : w8Arr.length;
                int i = repeatedFieldArrayLength + length;
                W8[] w8Arr2 = new W8[i];
                if (length != 0) {
                    System.arraycopy(w8Arr, 0, w8Arr2, 0, length);
                }
                while (length < i - 1) {
                    W8 w8 = new W8();
                    w8Arr2[length] = w8;
                    codedInputByteBufferNano.readMessage(w8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                W8 w82 = new W8();
                w8Arr2[length] = w82;
                codedInputByteBufferNano.readMessage(w82);
                this.a = w8Arr2;
            }
        }
        return this;
    }

    public static X8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X8().mergeFrom(codedInputByteBufferNano);
    }

    public static X8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X8) MessageNano.mergeFrom(new X8(), bArr);
    }
}
