package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class D8 extends MessageNano {
    public static volatile D8[] c;
    public C5340z8 a;
    public C8 b;

    public D8() {
        a();
    }

    public static D8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new D8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final D8 a() {
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
        C8 c8 = this.b;
        return c8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5340z8 c5340z8 = this.a;
        if (c5340z8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5340z8);
        }
        C8 c8 = this.b;
        if (c8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.b = new C8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            }
        }
        return this;
    }

    public static D8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D8().mergeFrom(codedInputByteBufferNano);
    }

    public static D8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (D8) MessageNano.mergeFrom(new D8(), bArr);
    }
}
