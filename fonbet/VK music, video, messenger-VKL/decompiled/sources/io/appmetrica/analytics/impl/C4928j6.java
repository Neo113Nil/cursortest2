package io.appmetrica.analytics.impl;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4928j6 extends MessageNano {
    public static final int l = 0;
    public static final int m = 1;
    public static volatile C4928j6[] n;
    public static byte[] o;
    public static volatile boolean p;
    public C5032n6 a;
    public C4774d6 b;
    public String c;
    public int d;
    public C4980l6[] e;
    public String f;
    public int g;
    public C4903i6 h;
    public byte[] i;
    public byte[] j;
    public C4825f6[] k;

    public C4928j6() {
        if (!p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!p) {
                        o = InternalNano.bytesDefaultValue("JVM");
                        p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static C4928j6[] b() {
        if (n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (n == null) {
                        n = new C4928j6[0];
                    }
                } finally {
                }
            }
        }
        return n;
    }

    public final C4928j6 a() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = -1;
        this.e = C4980l6.b();
        this.f = "";
        this.g = 0;
        this.h = null;
        this.i = (byte[]) o.clone();
        this.j = WireFormatNano.EMPTY_BYTES;
        this.k = C4825f6.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5032n6 c5032n6 = this.a;
        if (c5032n6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5032n6);
        }
        C4774d6 c4774d6 = this.b;
        if (c4774d6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4774d6);
        }
        if (!this.c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C4980l6[] c4980l6Arr = this.e;
        int i2 = 0;
        if (c4980l6Arr != null && c4980l6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4980l6[] c4980l6Arr2 = this.e;
                if (i3 >= c4980l6Arr2.length) {
                    break;
                }
                C4980l6 c4980l6 = c4980l6Arr2[i3];
                if (c4980l6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c4980l6) + computeSerializedSize;
                }
                i3++;
            }
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        int i4 = this.g;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        C4903i6 c4903i6 = this.h;
        if (c4903i6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c4903i6);
        }
        if (!Arrays.equals(this.i, o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        C4825f6[] c4825f6Arr = this.k;
        if (c4825f6Arr != null && c4825f6Arr.length > 0) {
            while (true) {
                C4825f6[] c4825f6Arr2 = this.k;
                if (i2 >= c4825f6Arr2.length) {
                    break;
                }
                C4825f6 c4825f6 = c4825f6Arr2[i2];
                if (c4825f6 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c4825f6) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5032n6 c5032n6 = this.a;
        if (c5032n6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c5032n6);
        }
        C4774d6 c4774d6 = this.b;
        if (c4774d6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4774d6);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        int i = this.d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C4980l6[] c4980l6Arr = this.e;
        int i2 = 0;
        if (c4980l6Arr != null && c4980l6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C4980l6[] c4980l6Arr2 = this.e;
                if (i3 >= c4980l6Arr2.length) {
                    break;
                }
                C4980l6 c4980l6 = c4980l6Arr2[i3];
                if (c4980l6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c4980l6);
                }
                i3++;
            }
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        int i4 = this.g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        C4903i6 c4903i6 = this.h;
        if (c4903i6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c4903i6);
        }
        if (!Arrays.equals(this.i, o)) {
            codedOutputByteBufferNano.writeBytes(9, this.i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        C4825f6[] c4825f6Arr = this.k;
        if (c4825f6Arr != null && c4825f6Arr.length > 0) {
            while (true) {
                C4825f6[] c4825f6Arr2 = this.k;
                if (i2 >= c4825f6Arr2.length) {
                    break;
                }
                C4825f6 c4825f6 = c4825f6Arr2[i2];
                if (c4825f6 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c4825f6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C4928j6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4928j6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4928j6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new C5032n6();
                    }
                    codedInputByteBufferNano.readMessage(this.a);
                    break;
                case 18:
                    if (this.b == null) {
                        this.b = new C4774d6();
                    }
                    codedInputByteBufferNano.readMessage(this.b);
                    break;
                case 26:
                    this.c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.d = readInt32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C4980l6[] c4980l6Arr = this.e;
                    int length = c4980l6Arr == null ? 0 : c4980l6Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C4980l6[] c4980l6Arr2 = new C4980l6[i];
                    if (length != 0) {
                        System.arraycopy(c4980l6Arr, 0, c4980l6Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C4980l6 c4980l6 = new C4980l6();
                        c4980l6Arr2[length] = c4980l6;
                        codedInputByteBufferNano.readMessage(c4980l6);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C4980l6 c4980l62 = new C4980l6();
                    c4980l6Arr2[length] = c4980l62;
                    codedInputByteBufferNano.readMessage(c4980l62);
                    this.e = c4980l6Arr2;
                    break;
                case 50:
                    this.f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.g = readInt322;
                        break;
                    }
                case 66:
                    if (this.h == null) {
                        this.h = new C4903i6();
                    }
                    codedInputByteBufferNano.readMessage(this.h);
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    this.i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C4825f6[] c4825f6Arr = this.k;
                    int length2 = c4825f6Arr == null ? 0 : c4825f6Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C4825f6[] c4825f6Arr2 = new C4825f6[i2];
                    if (length2 != 0) {
                        System.arraycopy(c4825f6Arr, 0, c4825f6Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C4825f6 c4825f6 = new C4825f6();
                        c4825f6Arr2[length2] = c4825f6;
                        codedInputByteBufferNano.readMessage(c4825f6);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C4825f6 c4825f62 = new C4825f6();
                    c4825f6Arr2[length2] = c4825f62;
                    codedInputByteBufferNano.readMessage(c4825f62);
                    this.k = c4825f6Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C4928j6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4928j6) MessageNano.mergeFrom(new C4928j6(), bArr);
    }
}
