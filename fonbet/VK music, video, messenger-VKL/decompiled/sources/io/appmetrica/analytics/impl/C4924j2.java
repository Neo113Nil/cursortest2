package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4924j2 extends MessageNano {
    public static volatile C4924j2[] d;
    public C4899i2[] a;
    public C4873h2 b;
    public String[] c;

    public C4924j2() {
        a();
    }

    public static C4924j2[] b() {
        if (d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (d == null) {
                        d = new C4924j2[0];
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final C4924j2 a() {
        this.a = C4899i2.b();
        this.b = null;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C4899i2[] c4899i2Arr = this.a;
        int i = 0;
        if (c4899i2Arr != null && c4899i2Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4899i2[] c4899i2Arr2 = this.a;
                if (i2 >= c4899i2Arr2.length) {
                    break;
                }
                C4899i2 c4899i2 = c4899i2Arr2[i2];
                if (c4899i2 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c4899i2) + computeSerializedSize;
                }
                i2++;
            }
        }
        C4873h2 c4873h2 = this.b;
        if (c4873h2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c4873h2);
        }
        String[] strArr = this.c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.c;
            if (i >= strArr2.length) {
                return computeSerializedSize + i3 + i4;
            }
            String str = strArr2[i];
            if (str != null) {
                i4++;
                i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C4899i2[] c4899i2Arr = this.a;
        int i = 0;
        if (c4899i2Arr != null && c4899i2Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4899i2[] c4899i2Arr2 = this.a;
                if (i2 >= c4899i2Arr2.length) {
                    break;
                }
                C4899i2 c4899i2 = c4899i2Arr2[i2];
                if (c4899i2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c4899i2);
                }
                i2++;
            }
        }
        C4873h2 c4873h2 = this.b;
        if (c4873h2 != null) {
            codedOutputByteBufferNano.writeMessage(2, c4873h2);
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4924j2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C4899i2[] c4899i2Arr = this.a;
                int length = c4899i2Arr == null ? 0 : c4899i2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C4899i2[] c4899i2Arr2 = new C4899i2[i];
                if (length != 0) {
                    System.arraycopy(c4899i2Arr, 0, c4899i2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C4899i2 c4899i2 = new C4899i2();
                    c4899i2Arr2[length] = c4899i2;
                    codedInputByteBufferNano.readMessage(c4899i2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C4899i2 c4899i22 = new C4899i2();
                c4899i2Arr2[length] = c4899i22;
                codedInputByteBufferNano.readMessage(c4899i22);
                this.a = c4899i2Arr2;
            } else if (readTag == 18) {
                if (this.b == null) {
                    this.b = new C4873h2();
                }
                codedInputByteBufferNano.readMessage(this.b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.c = strArr2;
            }
        }
        return this;
    }

    public static C4924j2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C4924j2().mergeFrom(codedInputByteBufferNano);
    }

    public static C4924j2 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C4924j2) MessageNano.mergeFrom(new C4924j2(), bArr);
    }
}
