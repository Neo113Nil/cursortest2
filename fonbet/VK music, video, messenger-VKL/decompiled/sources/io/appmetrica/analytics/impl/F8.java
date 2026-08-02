package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class F8 extends MessageNano {
    public static volatile F8[] b;
    public C8 a;

    public F8() {
        a();
    }

    public static F8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new F8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final F8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C8 c8 = this.a;
        return c8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C8 c8 = this.a;
        if (c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.a == null) {
                    this.a = new C8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
        return this;
    }

    public static F8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F8().mergeFrom(codedInputByteBufferNano);
    }

    public static F8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (F8) MessageNano.mergeFrom(new F8(), bArr);
    }
}
