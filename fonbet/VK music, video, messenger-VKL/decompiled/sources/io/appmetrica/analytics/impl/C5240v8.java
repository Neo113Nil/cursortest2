package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5240v8 extends MessageNano {
    public static volatile C5240v8[] b;
    public C5189t8 a;

    public C5240v8() {
        a();
    }

    public static C5240v8[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5240v8[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5240v8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5189t8 c5189t8 = this.a;
        return c5189t8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c5189t8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5189t8 c5189t8 = this.a;
        if (c5189t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5189t8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5240v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                    this.a = new C5189t8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            }
        }
        return this;
    }

    public static C5240v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5240v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5240v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5240v8) MessageNano.mergeFrom(new C5240v8(), bArr);
    }
}
