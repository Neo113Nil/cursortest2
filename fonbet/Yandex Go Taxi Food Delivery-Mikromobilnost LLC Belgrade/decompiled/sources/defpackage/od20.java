package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class od20 extends GeneratedMessageLite implements pd20 {
    public static final int COMPRESSED_LOG_DATA_FIELD_NUMBER = 1;
    private static final od20 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    private static volatile of90 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private ByteString compressedLogData_;
    private ByteString hash_;
    private long timestamp_;

    static {
        od20 od20Var = new od20();
        DEFAULT_INSTANCE = od20Var;
        GeneratedMessageLite.registerDefaultInstance(od20.class, od20Var);
    }

    private od20() {
        ByteString byteString = ByteString.a;
        this.compressedLogData_ = byteString;
        this.hash_ = byteString;
    }

    private void clearCompressedLogData() {
        this.bitField0_ &= -2;
        this.compressedLogData_ = getDefaultInstance().getCompressedLogData();
    }

    private void clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = getDefaultInstance().getHash();
    }

    private void clearTimestamp() {
        this.bitField0_ &= -5;
        this.timestamp_ = 0L;
    }

    public static od20 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nd20 newBuilder() {
        return (nd20) DEFAULT_INSTANCE.createBuilder();
    }

    public static od20 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (od20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static od20 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompressedLogData(ByteString byteString) {
        byteString.getClass();
        this.bitField0_ |= 1;
        this.compressedLogData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(ByteString byteString) {
        byteString.getClass();
        this.bitField0_ |= 2;
        this.hash_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j) {
        this.bitField0_ |= 4;
        this.timestamp_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (md20.a[methodToInvoke.ordinal()]) {
            case 1:
                return new od20();
            case 2:
                return new nd20(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003စ\u0002", new Object[]{"bitField0_", "compressedLogData_", "hash_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (od20.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs(DEFAULT_INSTANCE);
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public ByteString getCompressedLogData() {
        return this.compressedLogData_;
    }

    public ByteString getHash() {
        return this.hash_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasCompressedLogData() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 4) != 0;
    }

    public static nd20 newBuilder(od20 od20Var) {
        return (nd20) DEFAULT_INSTANCE.createBuilder(od20Var);
    }

    public static od20 parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (od20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static od20 parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static od20 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static od20 parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static od20 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static od20 parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static od20 parseFrom(InputStream inputStream) throws IOException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static od20 parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static od20 parseFrom(eac eacVar) throws IOException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static od20 parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (od20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
