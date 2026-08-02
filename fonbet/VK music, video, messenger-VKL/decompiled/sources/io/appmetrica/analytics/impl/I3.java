package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class I3 extends MessageNano {
    public static volatile I3[] b;
    public H3[] a;

    public I3() {
        a();
    }

    public static I3[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new I3[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final I3 a() {
        this.a = H3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        H3[] h3Arr = this.a;
        if (h3Arr != null && h3Arr.length > 0) {
            int i = 0;
            while (true) {
                H3[] h3Arr2 = this.a;
                if (i >= h3Arr2.length) {
                    break;
                }
                H3 h3 = h3Arr2[i];
                if (h3 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, h3) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        H3[] h3Arr = this.a;
        if (h3Arr != null && h3Arr.length > 0) {
            int i = 0;
            while (true) {
                H3[] h3Arr2 = this.a;
                if (i >= h3Arr2.length) {
                    break;
                }
                H3 h3 = h3Arr2[i];
                if (h3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, h3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                H3[] h3Arr = this.a;
                int length = h3Arr == null ? 0 : h3Arr.length;
                int i = repeatedFieldArrayLength + length;
                H3[] h3Arr2 = new H3[i];
                if (length != 0) {
                    System.arraycopy(h3Arr, 0, h3Arr2, 0, length);
                }
                while (length < i - 1) {
                    H3 h3 = new H3();
                    h3Arr2[length] = h3;
                    codedInputByteBufferNano.readMessage(h3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                H3 h32 = new H3();
                h3Arr2[length] = h32;
                codedInputByteBufferNano.readMessage(h32);
                this.a = h3Arr2;
            }
        }
        return this;
    }

    public static I3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I3().mergeFrom(codedInputByteBufferNano);
    }

    public static I3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (I3) MessageNano.mergeFrom(new I3(), bArr);
    }
}
