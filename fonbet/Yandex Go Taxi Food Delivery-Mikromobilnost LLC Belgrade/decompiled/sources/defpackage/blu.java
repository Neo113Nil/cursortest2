package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public final class blu extends GeneratedMessageLite implements elu {
    public static final int BUCKET_FIELD_NUMBER = 3;
    private static final blu DEFAULT_INSTANCE;
    public static final int FINITE_SUM_FIELD_NUMBER = 1001;
    public static final int NAME_FIELD_NUMBER = 1000;
    public static final int NAME_HASH_FIELD_NUMBER = 1;
    private static volatile of90 PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private int bitField0_;
    private long finiteSum_;
    private long nameHash_;
    private long sum_;
    private oqw bucket_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";

    static {
        blu bluVar = new blu();
        DEFAULT_INSTANCE = bluVar;
        GeneratedMessageLite.registerDefaultInstance(blu.class, bluVar);
    }

    private blu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucket(Iterable<? extends a> iterable) {
        ensureBucketIsMutable();
        b.addAll(iterable, this.bucket_);
    }

    private void addBucket(a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.add(aVar);
    }

    private void clearBucket() {
        this.bucket_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearFiniteSum() {
        this.bitField0_ &= -9;
        this.finiteSum_ = 0L;
    }

    private void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    private void clearNameHash() {
        this.bitField0_ &= -2;
        this.nameHash_ = 0L;
    }

    private void clearSum() {
        this.bitField0_ &= -3;
        this.sum_ = 0L;
    }

    private void ensureBucketIsMutable() {
        oqw oqwVar = this.bucket_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.bucket_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static blu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dlu newBuilder() {
        return (dlu) DEFAULT_INSTANCE.createBuilder();
    }

    public static blu parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (blu) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blu parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeBucket(int i) {
        ensureBucketIsMutable();
        this.bucket_.remove(i);
    }

    private void setBucket(int i, a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.set(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiniteSum(long j) {
        this.bitField0_ |= 8;
        this.finiteSum_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        this.name_ = byteString.r();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameHash(long j) {
        this.bitField0_ |= 1;
        this.nameHash_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSum(long j) {
        this.bitField0_ |= 2;
        this.sum_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (zku.a[methodToInvoke.ordinal()]) {
            case 1:
                return new blu();
            case 2:
                return new dlu(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϩ\u0005\u0000\u0001\u0000\u0001စ\u0000\u0002ဂ\u0001\u0003\u001bϨဈ\u0002ϩဂ\u0003", new Object[]{"bitField0_", "nameHash_", "sum_", "bucket_", a.class, "name_", "finiteSum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (blu.class) {
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

    public a getBucket(int i) {
        return (a) this.bucket_.get(i);
    }

    public int getBucketCount() {
        return this.bucket_.size();
    }

    public List<a> getBucketList() {
        return this.bucket_;
    }

    public clu getBucketOrBuilder(int i) {
        return (clu) this.bucket_.get(i);
    }

    public List<? extends clu> getBucketOrBuilderList() {
        return this.bucket_;
    }

    public long getFiniteSum() {
        return this.finiteSum_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.g(this.name_);
    }

    public long getNameHash() {
        return this.nameHash_;
    }

    public long getSum() {
        return this.sum_;
    }

    public boolean hasFiniteSum() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNameHash() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSum() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends GeneratedMessageLite implements clu {
        public static final int COUNT_FIELD_NUMBER = 4;
        private static final a DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private int bitField0_;
        private long count_ = 1;
        private long max_;
        private long min_;

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearCount() {
            this.bitField0_ &= -5;
            this.count_ = 1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.bitField0_ &= -3;
            this.max_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.bitField0_ &= -2;
            this.min_ = 0L;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static alu newBuilder() {
            return (alu) DEFAULT_INSTANCE.createBuilder();
        }

        public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(long j) {
            this.bitField0_ |= 4;
            this.count_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(long j) {
            this.bitField0_ |= 2;
            this.max_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(long j) {
            this.bitField0_ |= 1;
            this.min_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (zku.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new alu(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0002", new Object[]{"bitField0_", "min_", "max_", "count_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (a.class) {
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

        public long getCount() {
            return this.count_;
        }

        public long getMax() {
            return this.max_;
        }

        public long getMin() {
            return this.min_;
        }

        public boolean hasCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMax() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMin() {
            return (this.bitField0_ & 1) != 0;
        }

        public static alu newBuilder(a aVar) {
            return (alu) DEFAULT_INSTANCE.createBuilder(aVar);
        }

        public static a parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static a parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static a parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static a parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static a parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static a parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static a parseFrom(InputStream inputStream) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static a parseFrom(eac eacVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static a parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (a) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static dlu newBuilder(blu bluVar) {
        return (dlu) DEFAULT_INSTANCE.createBuilder(bluVar);
    }

    public static blu parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (blu) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static blu parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static blu parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static blu parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addBucket(int i, a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.add(i, aVar);
    }

    public static blu parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static blu parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static blu parseFrom(InputStream inputStream) throws IOException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blu parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static blu parseFrom(eac eacVar) throws IOException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static blu parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (blu) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
