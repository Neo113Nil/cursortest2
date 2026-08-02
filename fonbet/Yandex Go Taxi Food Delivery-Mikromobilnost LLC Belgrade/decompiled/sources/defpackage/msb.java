package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.yandex.pulse.metrics.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public final class msb extends GeneratedMessageLite implements zt10 {
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final msb DEFAULT_INSTANCE;
    public static final int HISTOGRAM_EVENT_FIELD_NUMBER = 6;
    public static final int LIBRARY_METRICS_FIELD_NUMBER = 1000;
    private static volatile of90 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SYSTEM_PROFILE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long clientId_;
    private oqw histogramEvent_ = GeneratedMessageLite.emptyProtobufList();
    private oqw libraryMetrics_ = GeneratedMessageLite.emptyProtobufList();
    private int sessionId_;
    private SystemProfileProtos$SystemProfileProto systemProfile_;

    static {
        msb msbVar = new msb();
        DEFAULT_INSTANCE = msbVar;
        GeneratedMessageLite.registerDefaultInstance(msb.class, msbVar);
    }

    private msb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistogramEvent(Iterable<? extends blu> iterable) {
        ensureHistogramEventIsMutable();
        b.addAll(iterable, this.histogramEvent_);
    }

    private void addAllLibraryMetrics(Iterable<? extends tcy> iterable) {
        ensureLibraryMetricsIsMutable();
        b.addAll(iterable, this.libraryMetrics_);
    }

    private void addHistogramEvent(blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(bluVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLibraryMetrics(tcy tcyVar) {
        tcyVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.add(tcyVar);
    }

    private void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = 0L;
    }

    private void clearHistogramEvent() {
        this.histogramEvent_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLibraryMetrics() {
        this.libraryMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = 0;
    }

    private void clearSystemProfile() {
        this.systemProfile_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureHistogramEventIsMutable() {
        oqw oqwVar = this.histogramEvent_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.histogramEvent_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureLibraryMetricsIsMutable() {
        oqw oqwVar = this.libraryMetrics_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.libraryMetrics_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static msb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSystemProfile(SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto) {
        systemProfileProtos$SystemProfileProto.getClass();
        SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto2 = this.systemProfile_;
        if (systemProfileProtos$SystemProfileProto2 == null || systemProfileProtos$SystemProfileProto2 == SystemProfileProtos$SystemProfileProto.getDefaultInstance()) {
            this.systemProfile_ = systemProfileProtos$SystemProfileProto;
        } else {
            this.systemProfile_ = (SystemProfileProtos$SystemProfileProto) ((r) SystemProfileProtos$SystemProfileProto.newBuilder(this.systemProfile_).mergeFrom((GeneratedMessageLite) systemProfileProtos$SystemProfileProto)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static lsb newBuilder() {
        return (lsb) DEFAULT_INSTANCE.createBuilder();
    }

    public static msb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (msb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static msb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeHistogramEvent(int i) {
        ensureHistogramEventIsMutable();
        this.histogramEvent_.remove(i);
    }

    private void removeLibraryMetrics(int i) {
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(long j) {
        this.bitField0_ |= 1;
        this.clientId_ = j;
    }

    private void setHistogramEvent(int i, blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.set(i, bluVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLibraryMetrics(int i, tcy tcyVar) {
        tcyVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.set(i, tcyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(int i) {
        this.bitField0_ |= 2;
        this.sessionId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemProfile(SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto) {
        systemProfileProtos$SystemProfileProto.getClass();
        this.systemProfile_ = systemProfileProtos$SystemProfileProto;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (ksb.a[methodToInvoke.ordinal()]) {
            case 1:
                return new msb();
            case 2:
                return new lsb(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001Ϩ\u0005\u0000\u0002\u0000\u0001စ\u0000\u0002င\u0001\u0003ဉ\u0002\u0006\u001bϨ\u001b", new Object[]{"bitField0_", "clientId_", "sessionId_", "systemProfile_", "histogramEvent_", blu.class, "libraryMetrics_", tcy.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (msb.class) {
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

    public long getClientId() {
        return this.clientId_;
    }

    public blu getHistogramEvent(int i) {
        return (blu) this.histogramEvent_.get(i);
    }

    public int getHistogramEventCount() {
        return this.histogramEvent_.size();
    }

    public List<blu> getHistogramEventList() {
        return this.histogramEvent_;
    }

    public elu getHistogramEventOrBuilder(int i) {
        return (elu) this.histogramEvent_.get(i);
    }

    public List<? extends elu> getHistogramEventOrBuilderList() {
        return this.histogramEvent_;
    }

    public tcy getLibraryMetrics(int i) {
        return (tcy) this.libraryMetrics_.get(i);
    }

    public int getLibraryMetricsCount() {
        return this.libraryMetrics_.size();
    }

    public List<tcy> getLibraryMetricsList() {
        return this.libraryMetrics_;
    }

    public ucy getLibraryMetricsOrBuilder(int i) {
        return (ucy) this.libraryMetrics_.get(i);
    }

    public List<? extends ucy> getLibraryMetricsOrBuilderList() {
        return this.libraryMetrics_;
    }

    public int getSessionId() {
        return this.sessionId_;
    }

    public SystemProfileProtos$SystemProfileProto getSystemProfile() {
        SystemProfileProtos$SystemProfileProto systemProfileProtos$SystemProfileProto = this.systemProfile_;
        return systemProfileProtos$SystemProfileProto == null ? SystemProfileProtos$SystemProfileProto.getDefaultInstance() : systemProfileProtos$SystemProfileProto;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSystemProfile() {
        return (this.bitField0_ & 4) != 0;
    }

    public static lsb newBuilder(msb msbVar) {
        return (lsb) DEFAULT_INSTANCE.createBuilder(msbVar);
    }

    public static msb parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (msb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static msb parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static msb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static msb parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addHistogramEvent(int i, blu bluVar) {
        bluVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(i, bluVar);
    }

    private void addLibraryMetrics(int i, tcy tcyVar) {
        tcyVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.add(i, tcyVar);
    }

    public static msb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static msb parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static msb parseFrom(InputStream inputStream) throws IOException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static msb parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static msb parseFrom(eac eacVar) throws IOException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static msb parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (msb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
