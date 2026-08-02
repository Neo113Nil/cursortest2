package com.yandex.pulse.metrics;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.dqw;
import defpackage.eac;
import defpackage.fqw;
import defpackage.of90;
import defpackage.oqw;
import defpackage.oxs;
import defpackage.p9;
import defpackage.pyo;
import defpackage.rcy;
import defpackage.vcy;
import defpackage.w511;
import defpackage.zt10;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public final class LibraryProtos$LibraryProfileProto extends GeneratedMessageLite implements zt10 {
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int CHANNEL_FIELD_NUMBER = 3;
    private static final LibraryProtos$LibraryProfileProto DEFAULT_INSTANCE;
    public static final int FIELD_TRIAL_FIELD_NUMBER = 4;
    private static volatile of90 PARSER = null;
    public static final int YA_FIELD_NUMBER = 5;
    private int bitField0_;
    private int channel_;
    private b ya_;
    private String appPackageName_ = "";
    private String appVersion_ = "";
    private oqw fieldTrial_ = GeneratedMessageLite.emptyProtobufList();

    public enum Channel implements dqw {
        CHANNEL_UNKNOWN(0),
        CHANNEL_CANARY(1),
        CHANNEL_DEV(2),
        CHANNEL_BETA(3),
        CHANNEL_STABLE(4);

        public static final int CHANNEL_BETA_VALUE = 3;
        public static final int CHANNEL_CANARY_VALUE = 1;
        public static final int CHANNEL_DEV_VALUE = 2;
        public static final int CHANNEL_STABLE_VALUE = 4;
        public static final int CHANNEL_UNKNOWN_VALUE = 0;
        private static final fqw internalValueMap = new com.yandex.pulse.metrics.b();
        private final int value;

        Channel(int i) {
            this.value = i;
        }

        public static Channel a(int i) {
            if (i == 0) {
                return CHANNEL_UNKNOWN;
            }
            if (i == 1) {
                return CHANNEL_CANARY;
            }
            if (i == 2) {
                return CHANNEL_DEV;
            }
            if (i == 3) {
                return CHANNEL_BETA;
            }
            if (i != 4) {
                return null;
            }
            return CHANNEL_STABLE;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto = new LibraryProtos$LibraryProfileProto();
        DEFAULT_INSTANCE = libraryProtos$LibraryProfileProto;
        GeneratedMessageLite.registerDefaultInstance(LibraryProtos$LibraryProfileProto.class, libraryProtos$LibraryProfileProto);
    }

    private LibraryProtos$LibraryProfileProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTrial(Iterable<? extends a> iterable) {
        ensureFieldTrialIsMutable();
        com.google.protobuf.b.addAll(iterable, this.fieldTrial_);
    }

    private void addFieldTrial(a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(aVar);
    }

    private void clearAppPackageName() {
        this.bitField0_ &= -2;
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearAppVersion() {
        this.bitField0_ &= -3;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    private void clearChannel() {
        this.bitField0_ &= -5;
        this.channel_ = 0;
    }

    private void clearFieldTrial() {
        this.fieldTrial_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearYa() {
        this.ya_ = null;
        this.bitField0_ &= -9;
    }

    private void ensureFieldTrialIsMutable() {
        oqw oqwVar = this.fieldTrial_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.fieldTrial_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static LibraryProtos$LibraryProfileProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeYa(b bVar) {
        bVar.getClass();
        b bVar2 = this.ya_;
        if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
            this.ya_ = bVar;
        } else {
            this.ya_ = (b) ((e) b.newBuilder(this.ya_).mergeFrom((GeneratedMessageLite) bVar)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static com.yandex.pulse.metrics.a newBuilder() {
        return (com.yandex.pulse.metrics.a) DEFAULT_INSTANCE.createBuilder();
    }

    public static LibraryProtos$LibraryProfileProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldTrial(int i) {
        ensureFieldTrialIsMutable();
        this.fieldTrial_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.appPackageName_ = str;
    }

    private void setAppPackageNameBytes(ByteString byteString) {
        this.appPackageName_ = byteString.r();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appVersion_ = str;
    }

    private void setAppVersionBytes(ByteString byteString) {
        this.appVersion_ = byteString.r();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(Channel channel) {
        this.channel_ = channel.getNumber();
        this.bitField0_ |= 4;
    }

    private void setFieldTrial(int i, a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.set(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYa(b bVar) {
        bVar.getClass();
        this.ya_ = bVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (rcy.a[methodToInvoke.ordinal()]) {
            case 1:
                return new LibraryProtos$LibraryProfileProto();
            case 2:
                return new com.yandex.pulse.metrics.a(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"bitField0_", "appPackageName_", "appVersion_", "channel_", c.a, "fieldTrial_", a.class, "ya_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (LibraryProtos$LibraryProfileProto.class) {
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

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public ByteString getAppPackageNameBytes() {
        return ByteString.g(this.appPackageName_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public ByteString getAppVersionBytes() {
        return ByteString.g(this.appVersion_);
    }

    public Channel getChannel() {
        Channel a2 = Channel.a(this.channel_);
        return a2 == null ? Channel.CHANNEL_UNKNOWN : a2;
    }

    public a getFieldTrial(int i) {
        return (a) this.fieldTrial_.get(i);
    }

    public int getFieldTrialCount() {
        return this.fieldTrial_.size();
    }

    public List<a> getFieldTrialList() {
        return this.fieldTrial_;
    }

    public vcy getFieldTrialOrBuilder(int i) {
        return (vcy) this.fieldTrial_.get(i);
    }

    public List<? extends vcy> getFieldTrialOrBuilderList() {
        return this.fieldTrial_;
    }

    public b getYa() {
        b bVar = this.ya_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public boolean hasAppPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasYa() {
        return (this.bitField0_ & 8) != 0;
    }

    public static final class a extends GeneratedMessageLite implements vcy {
        private static final a DEFAULT_INSTANCE;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        public static final int NAME_ID_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private int bitField0_;
        private int groupId_;
        private int nameId_;

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            GeneratedMessageLite.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
        }

        private void clearNameId() {
            this.bitField0_ &= -2;
            this.nameId_ = 0;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static d newBuilder() {
            return (d) DEFAULT_INSTANCE.createBuilder();
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
        public void setGroupId(int i) {
            this.bitField0_ |= 2;
            this.groupId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameId(int i) {
            this.bitField0_ |= 1;
            this.nameId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (rcy.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new a();
                case 2:
                    return new d();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"bitField0_", "nameId_", "groupId_"});
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

        public int getGroupId() {
            return this.groupId_;
        }

        public int getNameId() {
            return this.nameId_;
        }

        public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static d newBuilder(a aVar) {
            return (d) DEFAULT_INSTANCE.createBuilder(aVar);
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

    public static final class b extends GeneratedMessageLite implements zt10 {
        private static final b DEFAULT_INSTANCE;
        public static final int METRICA_API_KEY_FIELD_NUMBER = 1;
        private static volatile of90 PARSER;
        private int bitField0_;
        private String metricaApiKey_ = "";

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        private void clearMetricaApiKey() {
            this.bitField0_ &= -2;
            this.metricaApiKey_ = getDefaultInstance().getMetricaApiKey();
        }

        public static b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static e newBuilder() {
            return (e) DEFAULT_INSTANCE.createBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static of90 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetricaApiKey(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.metricaApiKey_ = str;
        }

        private void setMetricaApiKeyBytes(ByteString byteString) {
            this.metricaApiKey_ = byteString.r();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            of90 of90Var;
            switch (rcy.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new e(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "metricaApiKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    of90 of90Var2 = PARSER;
                    if (of90Var2 != null) {
                        return of90Var2;
                    }
                    synchronized (b.class) {
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

        public String getMetricaApiKey() {
            return this.metricaApiKey_;
        }

        public ByteString getMetricaApiKeyBytes() {
            return ByteString.g(this.metricaApiKey_);
        }

        public boolean hasMetricaApiKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public static e newBuilder(b bVar) {
            return (e) DEFAULT_INSTANCE.createBuilder(bVar);
        }

        public static b parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
        }

        public static b parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static b parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
        }

        public static b parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static b parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
        }

        public static b parseFrom(eac eacVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
        }

        public static b parseFrom(eac eacVar, pyo pyoVar) throws IOException {
            return (b) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
        }
    }

    public static com.yandex.pulse.metrics.a newBuilder(LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto) {
        return (com.yandex.pulse.metrics.a) DEFAULT_INSTANCE.createBuilder(libraryProtos$LibraryProfileProto);
    }

    public static LibraryProtos$LibraryProfileProto parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addFieldTrial(int i, a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(i, aVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(InputStream inputStream) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(eac eacVar) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static LibraryProtos$LibraryProfileProto parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (LibraryProtos$LibraryProfileProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
