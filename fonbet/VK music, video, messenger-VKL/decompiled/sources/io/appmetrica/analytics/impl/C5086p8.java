package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5086p8 extends MessageNano {
    public static volatile C5086p8[] b;
    public C5112q8 a;

    public C5086p8() {
        a();
    }

    public static C5086p8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5086p8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5086p8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5112q8 c5112q8 = this.a;
        return c5112q8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5112q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5112q8 c5112q8 = this.a;
        if (c5112q8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5112q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5086p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.a = new C5112q8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
        return this;
    }

    public static C5086p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5086p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5086p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5086p8) MessageNano.mergeFrom(new C5086p8(), bArr);
    }
}
