package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4774d6 extends MessageNano {
    public static volatile C4774d6[] d;
    public C5006m6 a;
    public C5006m6[] b;
    public String c;

    public C4774d6() {
        a();
    }

    public static C4774d6[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C4774d6[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final C4774d6 a() {
        this.a = null;
        this.b = C5006m6.b();
        this.c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5006m6 c5006m6 = this.a;
        if (c5006m6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5006m6);
        }
        C5006m6[] c5006m6Arr = this.b;
        if (c5006m6Arr != null && c5006m6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5006m6[] c5006m6Arr2 = this.b;
                if (i >= c5006m6Arr2.length) {
                    break;
                }
                C5006m6 c5006m62 = c5006m6Arr2[i];
                if (c5006m62 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5006m62) + computeSerializedSize;
                }
                i++;
            }
        }
        return !this.c.equals("") ? CodedOutputByteBufferNano.computeStringSize(3, this.c) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5006m6 c5006m6 = this.a;
        if (c5006m6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5006m6);
        }
        C5006m6[] c5006m6Arr = this.b;
        if (c5006m6Arr != null && c5006m6Arr.length > 0) {
            int i = 0;
            while (true) {
                C5006m6[] c5006m6Arr2 = this.b;
                if (i >= c5006m6Arr2.length) {
                    break;
                }
                C5006m6 c5006m62 = c5006m6Arr2[i];
                if (c5006m62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5006m62);
                }
                i++;
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4774d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5006m6();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5006m6[] c5006m6Arr = this.b;
                int length = c5006m6Arr == null ? 0 : c5006m6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5006m6[] c5006m6Arr2 = new C5006m6[i];
                if (length != 0) {
                    System.arraycopy(c5006m6Arr, 0, c5006m6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5006m6 c5006m6 = new C5006m6();
                    c5006m6Arr2[length] = c5006m6;
                    codedInputByteBufferNano.readMessage(c5006m6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5006m6 c5006m62 = new C5006m6();
                c5006m6Arr2[length] = c5006m62;
                codedInputByteBufferNano.readMessage(c5006m62);
                this.b = c5006m6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.c = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C4774d6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4774d6().mergeFrom(codedInputByteBufferNano);
    }

    public static C4774d6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4774d6) MessageNano.mergeFrom(new C4774d6(), bArr);
    }
}
