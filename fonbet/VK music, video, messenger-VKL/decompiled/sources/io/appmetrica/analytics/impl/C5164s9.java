package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5164s9 extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile C5164s9[] q;
    public long a;
    public C5138r9 b;
    public C5113q9[] c;

    public C5164s9() {
        a();
    }

    public static C5164s9[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new C5164s9[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final C5164s9 a() {
        this.a = 0L;
        this.b = null;
        this.c = C5113q9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + super.computeSerializedSize();
        C5138r9 c5138r9 = this.b;
        if (c5138r9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c5138r9);
        }
        C5113q9[] c5113q9Arr = this.c;
        if (c5113q9Arr != null && c5113q9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5113q9[] c5113q9Arr2 = this.c;
                if (i2 >= c5113q9Arr2.length) {
                    break;
                }
                C5113q9 c5113q9 = c5113q9Arr2[i2];
                if (c5113q9 != null) {
                    computeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c5113q9) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        C5138r9 c5138r9 = this.b;
        if (c5138r9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c5138r9);
        }
        C5113q9[] c5113q9Arr = this.c;
        if (c5113q9Arr != null && c5113q9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C5113q9[] c5113q9Arr2 = this.c;
                if (i2 >= c5113q9Arr2.length) {
                    break;
                }
                C5113q9 c5113q9 = c5113q9Arr2[i2];
                if (c5113q9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5113q9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5164s9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                this.a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C5138r9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5113q9[] c5113q9Arr = this.c;
                int length = c5113q9Arr == null ? 0 : c5113q9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C5113q9[] c5113q9Arr2 = new C5113q9[i2];
                if (length != 0) {
                    System.arraycopy(c5113q9Arr, 0, c5113q9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C5113q9 c5113q9 = new C5113q9();
                    c5113q9Arr2[length] = c5113q9;
                    codedInputByteBufferNano.readMessage(c5113q9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5113q9 c5113q92 = new C5113q9();
                c5113q9Arr2[length] = c5113q92;
                codedInputByteBufferNano.readMessage(c5113q92);
                this.c = c5113q9Arr2;
            }
        }
        return this;
    }

    public static C5164s9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5164s9().mergeFrom(codedInputByteBufferNano);
    }

    public static C5164s9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5164s9) MessageNano.mergeFrom(new C5164s9(), bArr);
    }
}
