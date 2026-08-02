package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5112q8 extends MessageNano {
    public static volatile C5112q8[] e;
    public C5340z8 a;
    public B8 b;
    public C5163s8 c;
    public C5315y8 d;

    public C5112q8() {
        a();
    }

    public static C5112q8[] b() {
        if (e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (e == null) {
                        e = new C5112q8[0];
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final C5112q8 a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
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
        if (b8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, b8);
        }
        C5163s8 c5163s8 = this.c;
        if (c5163s8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5163s8);
        }
        C5315y8 c5315y8 = this.d;
        return c5315y8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c5315y8) + computeSerializedSize : computeSerializedSize;
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
        C5163s8 c5163s8 = this.c;
        if (c5163s8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5163s8);
        }
        C5315y8 c5315y8 = this.d;
        if (c5315y8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5315y8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5112q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new B8();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C5163s8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.d == null) {
                    this.d = new C5315y8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            }
        }
        return this;
    }

    public static C5112q8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5112q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5112q8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5112q8) MessageNano.mergeFrom(new C5112q8(), bArr);
    }
}
