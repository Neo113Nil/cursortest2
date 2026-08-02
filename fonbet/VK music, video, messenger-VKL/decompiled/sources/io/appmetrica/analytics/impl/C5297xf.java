package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5297xf extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile C5297xf[] g;
    public C5247vf a;
    public C5272wf[] b;

    public C5297xf() {
        a();
    }

    public static C5297xf[] b() {
        if (g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new C5297xf[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final C5297xf a() {
        this.a = null;
        this.b = C5272wf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C5247vf c5247vf = this.a;
        if (c5247vf != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c5247vf);
        }
        C5272wf[] c5272wfArr = this.b;
        if (c5272wfArr != null && c5272wfArr.length > 0) {
            int i = 0;
            while (true) {
                C5272wf[] c5272wfArr2 = this.b;
                if (i >= c5272wfArr2.length) {
                    break;
                }
                C5272wf c5272wf = c5272wfArr2[i];
                if (c5272wf != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c5272wf) + computeSerializedSize;
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C5247vf c5247vf = this.a;
        if (c5247vf != null) {
            codedOutputByteBufferNano.writeMessage(1, c5247vf);
        }
        C5272wf[] c5272wfArr = this.b;
        if (c5272wfArr != null && c5272wfArr.length > 0) {
            int i = 0;
            while (true) {
                C5272wf[] c5272wfArr2 = this.b;
                if (i >= c5272wfArr2.length) {
                    break;
                }
                C5272wf c5272wf = c5272wfArr2[i];
                if (c5272wf != null) {
                    codedOutputByteBufferNano.writeMessage(2, c5272wf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5297xf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new C5247vf();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C5272wf[] c5272wfArr = this.b;
                int length = c5272wfArr == null ? 0 : c5272wfArr.length;
                int i = repeatedFieldArrayLength + length;
                C5272wf[] c5272wfArr2 = new C5272wf[i];
                if (length != 0) {
                    System.arraycopy(c5272wfArr, 0, c5272wfArr2, 0, length);
                }
                while (length < i - 1) {
                    C5272wf c5272wf = new C5272wf();
                    c5272wfArr2[length] = c5272wf;
                    codedInputByteBufferNano.readMessage(c5272wf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C5272wf c5272wf2 = new C5272wf();
                c5272wfArr2[length] = c5272wf2;
                codedInputByteBufferNano.readMessage(c5272wf2);
                this.b = c5272wfArr2;
            }
        }
        return this;
    }

    public static C5297xf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5297xf().mergeFrom(codedInputByteBufferNano);
    }

    public static C5297xf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5297xf) MessageNano.mergeFrom(new C5297xf(), bArr);
    }
}
