package com.squareup.wire;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.cvu0;
import defpackage.f73;
import defpackage.j;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import defpackage.xfo;
import defpackage.yp6;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.array.DerValue;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\nJ\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\nJ\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\u001fH\u0016¢\u0006\u0004\b6\u0010!J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\nJ\u000f\u00108\u001a\u00020\u001fH\u0016¢\u0006\u0004\b8\u0010!J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010\u000eJ)\u0010=\u001a\u00020\f2\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020*2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010AR\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/squareup/wire/ByteArrayProtoReader32;", "Lcom/squareup/wire/ProtoReader32;", "", "source", "", "pos", "limit", "<init>", "([BII)V", "internalNextLengthDelimited", "()I", "expectedEndTag", "Lzy11;", "skipGroup", "(I)V", "internalReadVarint32", "fieldEncoding", "afterPackableScalar", "beforeLengthDelimitedScalar", "byteCount", "skip", "Lokio/ByteString;", "readByteString", "(I)Lokio/ByteString;", "", "readUtf8", "(I)Ljava/lang/String;", "", "readByte", "()B", "readIntLe", "", "readLongLe", "()J", "Lcom/squareup/wire/ProtoReader;", "asProtoReader", "()Lcom/squareup/wire/ProtoReader;", "beginMessage", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "endMessageAndGetUnknownFields", "nextLengthDelimited", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "()Lcom/squareup/wire/FieldEncoding;", "()V", "readBytes", "()Lokio/ByteString;", "", "beforePossiblyPackedScalar", "()Z", "readString", "()Ljava/lang/String;", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "tag", "readUnknownField", "", "value", "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "nextFieldMinLengthInBytes", "[B", CA20Status.STATUS_USER_I, "recursionDepth", ClidProvider.STATE, "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "Lyp6;", "bufferStack", "Ljava/util/List;", "Lcom/squareup/wire/ProtoReader32AsProtoReader;", "protoReader", "Lcom/squareup/wire/ProtoReader32AsProtoReader;", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {
    private final List<yp6> bufferStack;
    private int limit;
    private FieldEncoding nextFieldEncoding;
    private int pos;
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;
    private final byte[] source;
    private int state;
    private int tag;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ByteArrayProtoReader32(byte[] bArr, int i, int i2) {
        this.source = bArr;
        this.pos = i;
        this.limit = i2;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int fieldEncoding) {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        int i = this.pos;
        int i2 = this.limit;
        if (i > i2) {
            xfo.d(this.limit, this.pos, " but was ", "Expected to end at ");
        } else {
            if (i != i2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
        }
    }

    private final int beforeLengthDelimitedScalar() {
        if (this.state == 2) {
            int i = this.limit - this.pos;
            this.state = 6;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    private final int internalNextLengthDelimited() {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int internalReadVarint32 = internalReadVarint32();
        if (internalReadVarint32 < 0) {
            StringBuilder t = b64.t(internalReadVarint32, "Negative length: ", ". Reader position: ");
            t.append(this.pos);
            t.append(". Last read tag: ");
            throw new ProtocolException(oyr.s(t, this.tag, '.'));
        }
        if (this.pushedLimit != -1) {
            ny61.k();
            return 0;
        }
        int i = this.limit;
        this.pushedLimit = i;
        int i2 = this.pos + internalReadVarint32;
        this.limit = i2;
        if (i2 <= i) {
            return internalReadVarint32;
        }
        ny61.b();
        return 0;
    }

    private final int internalReadVarint32() {
        int i;
        byte readByte = readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        byte readByte2 = readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            byte readByte3 = readByte();
            if (readByte3 >= 0) {
                i = readByte3 << PKIBody._CCR;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                byte readByte4 = readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    byte readByte5 = readByte();
                    int i4 = i3 | (readByte5 << DerValue.tag_UniversalString);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (readByte() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.pos);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i | i2;
    }

    private final byte readByte() {
        int i = this.pos;
        if (i == this.limit) {
            ny61.b();
            return (byte) 0;
        }
        byte[] bArr = this.source;
        this.pos = i + 1;
        return bArr[i];
    }

    private final ByteString readByteString(int byteCount) {
        int i = this.pos;
        int i2 = i + byteCount;
        if (i2 > this.limit) {
            ny61.b();
            return null;
        }
        byte[] bArr = this.source;
        if (byteCount == j.b) {
            byteCount = bArr.length;
        }
        j.b(bArr.length, i, byteCount);
        ByteString byteString = new ByteString(f73.m(i, byteCount + i, bArr));
        this.pos = i2;
        return byteString;
    }

    private final int readIntLe() {
        int i = this.pos;
        if (i + 4 > this.limit) {
            ny61.b();
            return 0;
        }
        byte[] bArr = this.source;
        int i2 = i + 1;
        this.pos = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.pos = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.pos = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.pos = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    private final long readLongLe() {
        int i = this.pos;
        if (i + 8 > this.limit) {
            ny61.b();
            return 0L;
        }
        byte[] bArr = this.source;
        this.pos = i + 1;
        this.pos = i + 2;
        this.pos = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.pos = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.pos = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.pos = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.pos = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.pos = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    private final String readUtf8(int byteCount) {
        int i = this.pos;
        int i2 = byteCount + i;
        if (i2 > this.limit) {
            ny61.b();
            return null;
        }
        String r = cvu0.r(i, i2, 4, this.source);
        this.pos = i2;
        return r;
    }

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(oyr.s(sb, this.tag, '.'));
            }
            int i = internalReadVarint32 >> 3;
            int i2 = internalReadVarint32 & 7;
            if (i2 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i2 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i2 == 2) {
                skip(internalReadVarint32());
            } else {
                if (i2 == 3) {
                    int i3 = this.recursionDepth + 1;
                    this.recursionDepth = i3;
                    if (i3 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i2 == 4) {
                    if (i == expectedEndTag) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.pos + ". Last read tag: " + i + '.');
                }
                if (i2 != 5) {
                    StringBuilder t = b64.t(i2, "Unexpected field encoding: ", ". Reader position: ");
                    t.append(this.pos);
                    t.append(". Last read tag: ");
                    t.append(i);
                    t.append('.');
                    throw new ProtocolException(t.toString());
                }
                this.state = 5;
                readFixed32();
            }
        }
        ny61.b();
    }

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        fieldEncoding.rawProtoAdapter().encodeWithTag(new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1)), tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoReader32
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder("unexpected state: ");
                sb.append(this.state);
                sb.append(". Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(oyr.s(sb, this.tag, '.'));
            }
        }
        return true;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() {
        if (this.state != 2) {
            ny61.r("Unexpected call to beginMessage()");
            return 0;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            ny61.v("Wire recursion limit exceeded");
            return 0;
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new yp6());
        }
        int i2 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString endMessageAndGetUnknownFields(int token) {
        if (this.state != 6) {
            ny61.r("Unexpected call to endMessage()");
            return null;
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            ny61.r("No corresponding call to beginMessage()");
            return null;
        }
        if (this.pos != this.limit && i != 0) {
            xfo.d(this.limit, this.pos, " but was ", "Expected to end at ");
            return null;
        }
        this.limit = token;
        yp6 yp6Var = this.bufferStack.get(i);
        long j = yp6Var.b;
        return j > 0 ? yp6Var.l0(j) : ByteString.c;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            ny61.r("nextFieldEncoding is not set");
            return 0;
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        if (i == 4) {
            return 1;
        }
        w511.b();
        return 0;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        ny61.r("Unexpected call to nextDelimited()");
        return 0;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            ny61.r("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(oyr.s(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.pos);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(oyr.s(sb2, this.tag, '.'));
                }
                if (i3 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i2;
                }
                StringBuilder t = b64.t(i3, "Unexpected field encoding: ", ". Reader position: ");
                t.append(this.pos);
                t.append(". Last read tag: ");
                throw new ProtocolException(oyr.s(t, this.tag, '.'));
            }
            skipGroup(i2);
        }
        return -1;
    }

    @Override // com.squareup.wire.ProtoReader32
    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    public ByteString readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() {
        int i = this.state;
        if (i == 5 || i == 2) {
            int readIntLe = readIntLe();
            afterPackableScalar(5);
            return readIntLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() {
        int i = this.state;
        if (i == 1 || i == 2) {
            long readLongLe = readLongLe();
            afterPackableScalar(1);
            return readLongLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(oyr.s(sb, this.tag, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r6 & Byte.MAX_VALUE) << i2;
            if ((readByte() & DerValue.TAG_CONTEXT) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("WireInput encountered a malformed varint. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb2, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            skip(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            ny61.r("Unexpected call to skip()");
        }
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }

    private final void skip(int byteCount) {
        int i = this.pos + byteCount;
        if (i <= this.limit) {
            this.pos = i;
        } else {
            ny61.b();
        }
    }
}
