package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5340z8 extends MessageNano {
    public static volatile C5340z8[] h;
    public byte[] a;
    public byte[] b;
    public C5137r8 c;
    public C5290x8 d;
    public C5315y8 e;
    public C5315y8 f;
    public A8[] g;

    public C5340z8() {
        a();
    }

    public static C5340z8[] b() {
        if (h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new C5340z8[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final C5340z8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.a = bArr;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = A8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        C5137r8 c5137r8 = this.c;
        if (c5137r8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c5137r8);
        }
        C5290x8 c5290x8 = this.d;
        if (c5290x8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5290x8);
        }
        C5315y8 c5315y8 = this.e;
        if (c5315y8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c5315y8);
        }
        C5315y8 c5315y82 = this.f;
        if (c5315y82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c5315y82);
        }
        A8[] a8Arr = this.g;
        if (a8Arr != null && a8Arr.length > 0) {
            int i = 0;
            while (true) {
                A8[] a8Arr2 = this.g;
                if (i >= a8Arr2.length) {
                    break;
                }
                A8 a8 = a8Arr2[i];
                if (a8 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, a8) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        C5137r8 c5137r8 = this.c;
        if (c5137r8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c5137r8);
        }
        C5290x8 c5290x8 = this.d;
        if (c5290x8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5290x8);
        }
        C5315y8 c5315y8 = this.e;
        if (c5315y8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c5315y8);
        }
        C5315y8 c5315y82 = this.f;
        if (c5315y82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c5315y82);
        }
        A8[] a8Arr = this.g;
        if (a8Arr != null && a8Arr.length > 0) {
            int i = 0;
            while (true) {
                A8[] a8Arr2 = this.g;
                if (i >= a8Arr2.length) {
                    break;
                }
                A8 a8 = a8Arr2[i];
                if (a8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, a8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5340z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5340z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5340z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.c == null) {
                    this.c = new C5137r8();
                }
                codedInputByteBufferNano.readMessage(this.c);
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C5290x8();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag == 42) {
                if (this.e == null) {
                    this.e = new C5315y8();
                }
                codedInputByteBufferNano.readMessage(this.e);
            } else if (readTag == 50) {
                if (this.f == null) {
                    this.f = new C5315y8();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                A8[] a8Arr = this.g;
                int length = a8Arr == null ? 0 : a8Arr.length;
                int i = repeatedFieldArrayLength + length;
                A8[] a8Arr2 = new A8[i];
                if (length != 0) {
                    System.arraycopy(a8Arr, 0, a8Arr2, 0, length);
                }
                while (length < i - 1) {
                    A8 a8 = new A8();
                    a8Arr2[length] = a8;
                    codedInputByteBufferNano.readMessage(a8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                A8 a82 = new A8();
                a8Arr2[length] = a82;
                codedInputByteBufferNano.readMessage(a82);
                this.g = a8Arr2;
            }
        }
        return this;
    }

    public static C5340z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5340z8) MessageNano.mergeFrom(new C5340z8(), bArr);
    }
}
