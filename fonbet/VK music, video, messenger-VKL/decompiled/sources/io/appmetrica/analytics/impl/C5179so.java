package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.so, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5179so extends MessageNano {
    public static volatile C5179so[] b;
    public C5102po[] a;

    public C5179so() {
        a();
    }

    public static C5179so[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5179so[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5179so a() {
        this.a = C5102po.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5102po[] c5102poArr = this.a;
        if (c5102poArr != null && c5102poArr.length > 0) {
            int i = 0;
            while (true) {
                C5102po[] c5102poArr2 = this.a;
                if (i >= c5102poArr2.length) {
                    break;
                }
                C5102po c5102po = c5102poArr2[i];
                if (c5102po != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5102po) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5102po[] c5102poArr = this.a;
        if (c5102poArr != null && c5102poArr.length > 0) {
            int i = 0;
            while (true) {
                C5102po[] c5102poArr2 = this.a;
                if (i >= c5102poArr2.length) {
                    break;
                }
                C5102po c5102po = c5102poArr2[i];
                if (c5102po != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5102po);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5179so mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C5102po[] c5102poArr = this.a;
                int length = c5102poArr == null ? 0 : c5102poArr.length;
                int i = repeatedFieldArrayLength + length;
                C5102po[] c5102poArr2 = new C5102po[i];
                if (length != 0) {
                    System.arraycopy(c5102poArr, 0, c5102poArr2, 0, length);
                }
                while (length < i - 1) {
                    C5102po c5102po = new C5102po();
                    c5102poArr2[length] = c5102po;
                    codedInputByteBufferNano.readMessage(c5102po);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5102po c5102po2 = new C5102po();
                c5102poArr2[length] = c5102po2;
                codedInputByteBufferNano.readMessage(c5102po2);
                this.a = c5102poArr2;
            }
        }
        return this;
    }

    public static C5179so b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5179so().mergeFrom(codedInputByteBufferNano);
    }

    public static C5179so a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5179so) MessageNano.mergeFrom(new C5179so(), bArr);
    }
}
