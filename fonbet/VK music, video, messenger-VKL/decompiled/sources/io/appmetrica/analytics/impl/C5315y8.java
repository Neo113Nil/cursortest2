package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5315y8 extends MessageNano {
    public static volatile C5315y8[] c;
    public C5060o8 a;
    public C5060o8[] b;

    public C5315y8() {
        a();
    }

    public static C5315y8[] b() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new C5315y8[0];
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C5315y8 a() {
        this.a = null;
        this.b = C5060o8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5060o8 c5060o8 = this.a;
        if (c5060o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5060o8);
        }
        C5060o8[] c5060o8Arr = this.b;
        if (c5060o8Arr != null && c5060o8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5060o8[] c5060o8Arr2 = this.b;
                if (i >= c5060o8Arr2.length) {
                    break;
                }
                C5060o8 c5060o82 = c5060o8Arr2[i];
                if (c5060o82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5060o82) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5060o8 c5060o8 = this.a;
        if (c5060o8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5060o8);
        }
        C5060o8[] c5060o8Arr = this.b;
        if (c5060o8Arr != null && c5060o8Arr.length > 0) {
            int i = 0;
            while (true) {
                C5060o8[] c5060o8Arr2 = this.b;
                if (i >= c5060o8Arr2.length) {
                    break;
                }
                C5060o8 c5060o82 = c5060o8Arr2[i];
                if (c5060o82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5060o82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5315y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5060o8();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5060o8[] c5060o8Arr = this.b;
                int length = c5060o8Arr == null ? 0 : c5060o8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C5060o8[] c5060o8Arr2 = new C5060o8[i];
                if (length != 0) {
                    System.arraycopy(c5060o8Arr, 0, c5060o8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C5060o8 c5060o8 = new C5060o8();
                    c5060o8Arr2[length] = c5060o8;
                    codedInputByteBufferNano.readMessage(c5060o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5060o8 c5060o82 = new C5060o8();
                c5060o8Arr2[length] = c5060o82;
                codedInputByteBufferNano.readMessage(c5060o82);
                this.b = c5060o8Arr2;
            }
        }
        return this;
    }

    public static C5315y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5315y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C5315y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5315y8) MessageNano.mergeFrom(new C5315y8(), bArr);
    }
}
