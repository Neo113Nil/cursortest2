package com.squareup.wire;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qq6;
import defpackage.tls;
import defpackage.vfc;
import defpackage.w511;
import defpackage.yp6;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0012J'\u00102\u001a\u00020\u00152\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\fJ)\u00106\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0018\u0010A\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Lcom/squareup/wire/ProtoReader;", "", "Lqq6;", "source", "<init>", "(Lqq6;)V", "", "internalNextLengthDelimited", "()I", "expectedEndTag", "Lzy11;", "skipGroup", "(I)V", "internalReadVarint32", "fieldEncoding", "afterPackableScalar", "", "beforeLengthDelimitedScalar", "()J", "beginMessage", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lokio/ByteString;", "endMessageAndGetUnknownFields", "(J)Lokio/ByteString;", "endMessage", "(J)V", "nextLengthDelimited", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "()Lcom/squareup/wire/FieldEncoding;", "skip", "()V", "readBytes", "()Lokio/ByteString;", "", "beforePossiblyPackedScalar$wire_runtime", "()Z", "beforePossiblyPackedScalar", "", "readString", "()Ljava/lang/String;", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "Lkotlin/Function1;", "tagHandler", "-forEachTag", "(Ltls;)Lokio/ByteString;", "forEachTag", "tag", "readUnknownField", "value", "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "nextFieldMinLengthInBytes", "Lqq6;", "pos", "J", "limit", "recursionDepth", CA20Status.STATUS_USER_I, ClidProvider.STATE, "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "Lyp6;", "bufferStack", "Ljava/util/List;", "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public class ProtoReader {
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private int recursionDepth;
    private final qq6 source;
    private long limit = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;
    private final List<yp6> bufferStack = new ArrayList();

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

    public ProtoReader(qq6 qq6Var) {
        this.source = qq6Var;
    }

    private final void afterPackableScalar(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j <= j2) {
            if (j != j2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(oyr.s(sb, this.tag, '.'));
        }
        long j = this.limit - this.pos;
        this.source.B1(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
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
        long j = this.limit;
        this.pushedLimit = j;
        long j2 = this.pos + internalReadVarint32;
        this.limit = j2;
        if (j2 <= j) {
            return internalReadVarint32;
        }
        ny61.b();
        return 0;
    }

    private final int internalReadVarint32() {
        int i;
        this.source.B1(1L);
        this.pos++;
        byte readByte = this.source.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.source.B1(1L);
        this.pos++;
        byte readByte2 = this.source.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.source.B1(1L);
            this.pos++;
            byte readByte3 = this.source.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << PKIBody._CCR;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.source.B1(1L);
                this.pos++;
                byte readByte4 = this.source.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.source.B1(1L);
                    this.pos++;
                    byte readByte5 = this.source.readByte();
                    int i4 = i3 | (readByte5 << DerValue.tag_UniversalString);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            this.source.B1(1L);
                            this.pos++;
                            if (this.source.readByte() < 0) {
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

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit && !this.source.I1()) {
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
                long internalReadVarint322 = internalReadVarint32();
                this.pos += internalReadVarint322;
                this.source.skip(internalReadVarint322);
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
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    vfc.y(sb2, this.pos, ". Last read tag: ", i);
                    sb2.append('.');
                    throw new ProtocolException(sb2.toString());
                }
                if (i2 != 5) {
                    StringBuilder t = b64.t(i2, "Unexpected field encoding: ", ". Reader position: ");
                    vfc.y(t, this.pos, ". Last read tag: ", i);
                    t.append('.');
                    throw new ProtocolException(t.toString());
                }
                this.state = 5;
                readFixed32();
            }
        }
        ny61.b();
    }

    /* renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m131forEachTag(tls tagHandler) {
        long beginMessage = beginMessage();
        while (true) {
            int nextTag = nextTag();
            if (nextTag == -1) {
                return endMessageAndGetUnknownFields(beginMessage);
            }
            tagHandler.invoke(Integer.valueOf(nextTag));
        }
    }

    public void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        fieldEncoding.rawProtoAdapter().encodeWithTag(new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1)), tag, (int) value);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
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

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            ny61.r("Unexpected call to beginMessage()");
            return 0L;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            ny61.v("Wire recursion limit exceeded");
            return 0L;
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new yp6());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    @jxi
    public final void endMessage(long token) throws IOException {
        endMessageAndGetUnknownFields(token);
    }

    public ByteString endMessageAndGetUnknownFields(long token) throws IOException {
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
        if (this.pos == this.limit || i == 0) {
            this.limit = token;
            yp6 yp6Var = this.bufferStack.get(i);
            long j = yp6Var.b;
            return j > 0 ? yp6Var.l0(j) : ByteString.c;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            ny61.r("nextFieldEncoding is not set");
            return 0L;
        }
        if (i == 1) {
            return this.limit - this.pos;
        }
        if (i == 2) {
            return 4L;
        }
        if (i == 3) {
            return 8L;
        }
        if (i == 4) {
            return 1L;
        }
        w511.b();
        return 0L;
    }

    public int nextLengthDelimited() throws IOException {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        ny61.r("Unexpected call to nextDelimited()");
        return 0;
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            ny61.r("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit && !this.source.I1()) {
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

    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.B1(beforeLengthDelimitedScalar);
        return this.source.l0(beforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i == 5 || i == 2) {
            this.source.B1(4L);
            this.pos += 4;
            int d2 = this.source.d2();
            afterPackableScalar(5);
            return d2;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i == 1 || i == 2) {
            this.source.B1(8L);
            this.pos += 8;
            long X = this.source.X();
            afterPackableScalar(1);
            return X;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb, this.tag, '.'));
    }

    public String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.B1(beforeLengthDelimitedScalar);
        return this.source.j0(beforeLengthDelimitedScalar);
    }

    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() throws IOException {
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

    public long readVarint64() throws IOException {
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
            this.source.B1(1L);
            this.pos++;
            j |= (r6 & Byte.MAX_VALUE) << i2;
            if ((this.source.readByte() & DerValue.TAG_CONTEXT) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("Malformed VARINT. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(oyr.s(sb2, this.tag, '.'));
    }

    public void skip() throws IOException {
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
            this.source.skip(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            ny61.r("Unexpected call to skip()");
        }
    }
}
