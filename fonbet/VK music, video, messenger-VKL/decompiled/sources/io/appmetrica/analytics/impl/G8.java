package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class G8 extends MessageNano {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static volatile G8[] o;
    public int a;
    public F8 b;
    public D8 c;
    public E8 d;
    public C5086p8 e;
    public C5240v8 f;

    public G8() {
        a();
    }

    public static G8[] b() {
        if (o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (o == null) {
                        o = new G8[0];
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public final G8 a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.a;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        F8 f8 = this.b;
        if (f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, f8);
        }
        D8 d8 = this.c;
        if (d8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, d8);
        }
        E8 e8 = this.d;
        if (e8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, e8);
        }
        C5086p8 c5086p8 = this.e;
        if (c5086p8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5086p8);
        }
        C5240v8 c5240v8 = this.f;
        return c5240v8 != null ? CodedOutputByteBufferNano.computeMessageSize(6, c5240v8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        F8 f8 = this.b;
        if (f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, f8);
        }
        D8 d8 = this.c;
        if (d8 != null) {
            codedOutputByteBufferNano.writeMessage(3, d8);
        }
        E8 e8 = this.d;
        if (e8 != null) {
            codedOutputByteBufferNano.writeMessage(4, e8);
        }
        C5086p8 c5086p8 = this.e;
        if (c5086p8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5086p8);
        }
        C5240v8 c5240v8 = this.f;
        if (c5240v8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5240v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static G8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag != 0) {
                if (readTag == 8) {
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.a = readInt32;
                            break;
                    }
                } else if (readTag == 18) {
                    if (this.b == null) {
                        this.b = new F8();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                } else if (readTag == 26) {
                    if (this.c == null) {
                        this.c = new D8();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                } else if (readTag == 34) {
                    if (this.d == null) {
                        this.d = new E8();
                    }
                    codedInputByteBufferNano.readMessage(this.d);
                } else if (readTag == 42) {
                    if (this.e == null) {
                        this.e = new C5086p8();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                } else if (readTag != 50) {
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    }
                } else {
                    if (this.f == null) {
                        this.f = new C5240v8();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                }
            }
        }
        return this;
    }

    public static G8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (G8) MessageNano.mergeFrom(new G8(), bArr);
    }
}
