package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class J3 extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile J3[] g;
    public G3 a;
    public G3[] b;

    public J3() {
        a();
    }

    public static J3[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new J3[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final J3 a() {
        this.a = null;
        this.b = G3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        G3 g3 = this.a;
        if (g3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, g3);
        }
        G3[] g3Arr = this.b;
        if (g3Arr != null && g3Arr.length > 0) {
            int i = 0;
            while (true) {
                G3[] g3Arr2 = this.b;
                if (i >= g3Arr2.length) {
                    break;
                }
                G3 g32 = g3Arr2[i];
                if (g32 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, g32) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        G3 g3 = this.a;
        if (g3 != null) {
            codedOutputByteBufferNano.writeMessage(1, g3);
        }
        G3[] g3Arr = this.b;
        if (g3Arr != null && g3Arr.length > 0) {
            int i = 0;
            while (true) {
                G3[] g3Arr2 = this.b;
                if (i >= g3Arr2.length) {
                    break;
                }
                G3 g32 = g3Arr2[i];
                if (g32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, g32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new G3();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                G3[] g3Arr = this.b;
                int length = g3Arr == null ? 0 : g3Arr.length;
                int i = repeatedFieldArrayLength + length;
                G3[] g3Arr2 = new G3[i];
                if (length != 0) {
                    System.arraycopy(g3Arr, 0, g3Arr2, 0, length);
                }
                while (length < i - 1) {
                    G3 g3 = new G3();
                    g3Arr2[length] = g3;
                    codedInputByteBufferNano.readMessage(g3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                G3 g32 = new G3();
                g3Arr2[length] = g32;
                codedInputByteBufferNano.readMessage(g32);
                this.b = g3Arr2;
            }
        }
        return this;
    }

    public static J3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J3().mergeFrom(codedInputByteBufferNano);
    }

    public static J3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (J3) MessageNano.mergeFrom(new J3(), bArr);
    }
}
