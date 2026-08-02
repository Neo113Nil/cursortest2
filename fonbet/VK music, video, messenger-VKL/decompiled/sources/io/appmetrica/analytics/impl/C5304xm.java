package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5304xm extends MessageNano {
    public static volatile C5304xm[] b;
    public C5279wm[] a;

    public C5304xm() {
        a();
    }

    public static C5304xm[] b() {
        if (b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (b == null) {
                        b = new C5304xm[0];
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final C5304xm a() {
        this.a = C5279wm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5279wm[] c5279wmArr = this.a;
        if (c5279wmArr != null && c5279wmArr.length > 0) {
            int i = 0;
            while (true) {
                C5279wm[] c5279wmArr2 = this.a;
                if (i >= c5279wmArr2.length) {
                    break;
                }
                C5279wm c5279wm = c5279wmArr2[i];
                if (c5279wm != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c5279wm) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5279wm[] c5279wmArr = this.a;
        if (c5279wmArr != null && c5279wmArr.length > 0) {
            int i = 0;
            while (true) {
                C5279wm[] c5279wmArr2 = this.a;
                if (i >= c5279wmArr2.length) {
                    break;
                }
                C5279wm c5279wm = c5279wmArr2[i];
                if (c5279wm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c5279wm);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5304xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C5279wm[] c5279wmArr = this.a;
                int length = c5279wmArr == null ? 0 : c5279wmArr.length;
                int i = repeatedFieldArrayLength + length;
                C5279wm[] c5279wmArr2 = new C5279wm[i];
                if (length != 0) {
                    System.arraycopy(c5279wmArr, 0, c5279wmArr2, 0, length);
                }
                while (length < i - 1) {
                    C5279wm c5279wm = new C5279wm();
                    c5279wmArr2[length] = c5279wm;
                    codedInputByteBufferNano.readMessage(c5279wm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5279wm c5279wm2 = new C5279wm();
                c5279wmArr2[length] = c5279wm2;
                codedInputByteBufferNano.readMessage(c5279wm2);
                this.a = c5279wmArr2;
            }
        }
        return this;
    }

    public static C5304xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5304xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5304xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5304xm) MessageNano.mergeFrom(new C5304xm(), bArr);
    }
}
