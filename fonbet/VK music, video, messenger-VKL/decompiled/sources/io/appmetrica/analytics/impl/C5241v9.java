package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5241v9 extends MessageNano {
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static volatile C5241v9[] j;
    public C5164s9[] a;
    public C5035n9 b;
    public C4957k9[] c;
    public C5190t9[] d;
    public String[] e;
    public byte[][] f;

    public C5241v9() {
        a();
    }

    public static C5241v9[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new C5241v9[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final C5241v9 a() {
        this.a = C5164s9.b();
        this.b = null;
        this.c = C4957k9.b();
        this.d = C5190t9.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5164s9[] c5164s9Arr = this.a;
        int i2 = 0;
        if (c5164s9Arr != null && c5164s9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5164s9[] c5164s9Arr2 = this.a;
                if (i3 >= c5164s9Arr2.length) {
                    break;
                }
                C5164s9 c5164s9 = c5164s9Arr2[i3];
                if (c5164s9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c5164s9) + computeSerializedSize;
                }
                i3++;
            }
        }
        C5035n9 c5035n9 = this.b;
        if (c5035n9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c5035n9);
        }
        C4957k9[] c4957k9Arr = this.c;
        if (c4957k9Arr != null && c4957k9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C4957k9[] c4957k9Arr2 = this.c;
                if (i4 >= c4957k9Arr2.length) {
                    break;
                }
                C4957k9 c4957k9 = c4957k9Arr2[i4];
                if (c4957k9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c4957k9) + computeSerializedSize;
                }
                i4++;
            }
        }
        C5190t9[] c5190t9Arr = this.d;
        if (c5190t9Arr != null && c5190t9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C5190t9[] c5190t9Arr2 = this.d;
                if (i5 >= c5190t9Arr2.length) {
                    break;
                }
                C5190t9 c5190t9 = c5190t9Arr2[i5];
                if (c5190t9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c5190t9) + computeSerializedSize;
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i6];
                if (str != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i6++;
            }
            computeSerializedSize = computeSerializedSize + i7 + i8;
        }
        byte[][] bArr = this.f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = this.f;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i9 + i10;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i10++;
                i9 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i9;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5164s9[] c5164s9Arr = this.a;
        int i2 = 0;
        if (c5164s9Arr != null && c5164s9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C5164s9[] c5164s9Arr2 = this.a;
                if (i3 >= c5164s9Arr2.length) {
                    break;
                }
                C5164s9 c5164s9 = c5164s9Arr2[i3];
                if (c5164s9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c5164s9);
                }
                i3++;
            }
        }
        C5035n9 c5035n9 = this.b;
        if (c5035n9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5035n9);
        }
        C4957k9[] c4957k9Arr = this.c;
        if (c4957k9Arr != null && c4957k9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C4957k9[] c4957k9Arr2 = this.c;
                if (i4 >= c4957k9Arr2.length) {
                    break;
                }
                C4957k9 c4957k9 = c4957k9Arr2[i4];
                if (c4957k9 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c4957k9);
                }
                i4++;
            }
        }
        C5190t9[] c5190t9Arr = this.d;
        if (c5190t9Arr != null && c5190t9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                C5190t9[] c5190t9Arr2 = this.d;
                if (i5 >= c5190t9Arr2.length) {
                    break;
                }
                C5190t9 c5190t9 = c5190t9Arr2[i5];
                if (c5190t9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c5190t9);
                }
                i5++;
            }
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i6 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i6];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i6++;
            }
        }
        byte[][] bArr = this.f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5241v9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5241v9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5241v9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C5164s9[] c5164s9Arr = this.a;
                int length = c5164s9Arr == null ? 0 : c5164s9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                C5164s9[] c5164s9Arr2 = new C5164s9[i2];
                if (length != 0) {
                    System.arraycopy(c5164s9Arr, 0, c5164s9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    C5164s9 c5164s9 = new C5164s9();
                    c5164s9Arr2[length] = c5164s9;
                    codedInputByteBufferNano.readMessage(c5164s9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5164s9 c5164s92 = new C5164s9();
                c5164s9Arr2[length] = c5164s92;
                codedInputByteBufferNano.readMessage(c5164s92);
                this.a = c5164s9Arr2;
            } else if (readTag == 34) {
                if (this.b == null) {
                    this.b = new C5035n9();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C4957k9[] c4957k9Arr = this.c;
                int length2 = c4957k9Arr == null ? 0 : c4957k9Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                C4957k9[] c4957k9Arr2 = new C4957k9[i3];
                if (length2 != 0) {
                    System.arraycopy(c4957k9Arr, 0, c4957k9Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    C4957k9 c4957k9 = new C4957k9();
                    c4957k9Arr2[length2] = c4957k9;
                    codedInputByteBufferNano.readMessage(c4957k9);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C4957k9 c4957k92 = new C4957k9();
                c4957k9Arr2[length2] = c4957k92;
                codedInputByteBufferNano.readMessage(c4957k92);
                this.c = c4957k9Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C5190t9[] c5190t9Arr = this.d;
                int length3 = c5190t9Arr == null ? 0 : c5190t9Arr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                C5190t9[] c5190t9Arr2 = new C5190t9[i4];
                if (length3 != 0) {
                    System.arraycopy(c5190t9Arr, 0, c5190t9Arr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    C5190t9 c5190t9 = new C5190t9();
                    c5190t9Arr2[length3] = c5190t9;
                    codedInputByteBufferNano.readMessage(c5190t9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C5190t9 c5190t92 = new C5190t9();
                c5190t9Arr2[length3] = c5190t92;
                codedInputByteBufferNano.readMessage(c5190t92);
                this.d = c5190t9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i5];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i5 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i6 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i6][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i6 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f = bArr2;
            }
        }
        return this;
    }

    public static C5241v9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5241v9) MessageNano.mergeFrom(new C5241v9(), bArr);
    }
}
