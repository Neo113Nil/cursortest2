package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5032n6 extends MessageNano {
    public static volatile C5032n6[] f;
    public String a;
    public String b;
    public C4980l6[] c;
    public C5032n6 d;
    public C5032n6[] e;

    public C5032n6() {
        a();
    }

    public static C5032n6[] b() {
        if (f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f == null) {
                        f = new C5032n6[0];
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final C5032n6 a() {
        this.a = "";
        this.b = "";
        this.c = C4980l6.b();
        this.d = null;
        this.e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.a) + super.computeSerializedSize();
        if (!this.b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        C4980l6[] c4980l6Arr = this.c;
        int i = 0;
        if (c4980l6Arr != null && c4980l6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4980l6[] c4980l6Arr2 = this.c;
                if (i2 >= c4980l6Arr2.length) {
                    break;
                }
                C4980l6 c4980l6 = c4980l6Arr2[i2];
                if (c4980l6 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c4980l6) + computeStringSize;
                }
                i2++;
            }
        }
        C5032n6 c5032n6 = this.d;
        if (c5032n6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c5032n6);
        }
        C5032n6[] c5032n6Arr = this.e;
        if (c5032n6Arr != null && c5032n6Arr.length > 0) {
            while (true) {
                C5032n6[] c5032n6Arr2 = this.e;
                if (i >= c5032n6Arr2.length) {
                    break;
                }
                C5032n6 c5032n62 = c5032n6Arr2[i];
                if (c5032n62 != null) {
                    computeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c5032n62) + computeStringSize;
                }
                i++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        C4980l6[] c4980l6Arr = this.c;
        int i = 0;
        if (c4980l6Arr != null && c4980l6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C4980l6[] c4980l6Arr2 = this.c;
                if (i2 >= c4980l6Arr2.length) {
                    break;
                }
                C4980l6 c4980l6 = c4980l6Arr2[i2];
                if (c4980l6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c4980l6);
                }
                i2++;
            }
        }
        C5032n6 c5032n6 = this.d;
        if (c5032n6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c5032n6);
        }
        C5032n6[] c5032n6Arr = this.e;
        if (c5032n6Arr != null && c5032n6Arr.length > 0) {
            while (true) {
                C5032n6[] c5032n6Arr2 = this.e;
                if (i >= c5032n6Arr2.length) {
                    break;
                }
                C5032n6 c5032n62 = c5032n6Arr2[i];
                if (c5032n62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c5032n62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C5032n6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5032n6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5032n6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C4980l6[] c4980l6Arr = this.c;
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
                this.c = c4980l6Arr2;
            } else if (readTag == 34) {
                if (this.d == null) {
                    this.d = new C5032n6();
                }
                codedInputByteBufferNano.readMessage(this.d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C5032n6[] c5032n6Arr = this.e;
                int length2 = c5032n6Arr == null ? 0 : c5032n6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C5032n6[] c5032n6Arr2 = new C5032n6[i2];
                if (length2 != 0) {
                    System.arraycopy(c5032n6Arr, 0, c5032n6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C5032n6 c5032n6 = new C5032n6();
                    c5032n6Arr2[length2] = c5032n6;
                    codedInputByteBufferNano.readMessage(c5032n6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C5032n6 c5032n62 = new C5032n6();
                c5032n6Arr2[length2] = c5032n62;
                codedInputByteBufferNano.readMessage(c5032n62);
                this.e = c5032n6Arr2;
            }
        }
        return this;
    }

    public static C5032n6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5032n6) MessageNano.mergeFrom(new C5032n6(), bArr);
    }
}
