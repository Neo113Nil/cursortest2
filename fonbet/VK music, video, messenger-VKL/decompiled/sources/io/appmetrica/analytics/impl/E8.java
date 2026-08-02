package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class E8 extends MessageNano {
    public static volatile E8[] c;
    public C5340z8 a;
    public B8 b;

    public E8() {
        a();
    }

    public static E8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new E8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final E8 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5340z8 c5340z8 = this.a;
        if (c5340z8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5340z8);
        }
        B8 b8 = this.b;
        return b8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, b8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5340z8 c5340z8 = this.a;
        if (c5340z8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5340z8);
        }
        B8 b8 = this.b;
        if (b8 != null) {
            codedOutputByteBufferNano.writeMessage(2, b8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5340z8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.b == null) {
                    this.b = new B8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static E8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E8().mergeFrom(codedInputByteBufferNano);
    }

    public static E8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (E8) MessageNano.mergeFrom(new E8(), bArr);
    }
}
