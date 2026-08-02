package ru.ok.android.externcalls.analytics.config;

import java.util.concurrent.Executor;
import xsna.bh10;
import xsna.epx;
import xsna.gzs;
import xsna.tj0;
import xsna.zcl;

/* compiled from: UploadConfig.kt */
/* loaded from: classes9.dex */
public final class UploadConfig {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEFAULT_COMPRESS_CONTENT = false;
    public static final boolean DEFAULT_DISABLE_UPLOAD_IN_CALL = true;
    public static final int DEFAULT_LOCAL_FILE_COUNT = 100;
    public static final int DEFAULT_MAX_EVENT_COUNT = 800;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 15;
    public static final boolean DEFAULT_USE_DB_CACHE = false;
    private final gzs<Boolean> autoDetectFileCompressionProvider;
    private final gzs<Boolean> compressContentProvider;
    private final gzs<Boolean> disableUploadWhenCallIsActiveProvider;
    private final gzs<Integer> maxEventCountProvider;
    private final gzs<Integer> maxFileLengthKbProvider;
    private final gzs<Integer> maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final gzs<Long> timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;
    private final gzs<Boolean> useDbCacheProvider;

    /* compiled from: UploadConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public UploadConfig() {
        this(0, null, 0L, 0L, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final int component1() {
        return this.uploadJobId;
    }

    public final gzs<Boolean> component10() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final gzs<Boolean> component11() {
        return this.autoDetectFileCompressionProvider;
    }

    public final gzs<Boolean> component12() {
        return this.useDbCacheProvider;
    }

    public final Executor component2() {
        return this.uploadExecutor;
    }

    public final long component3() {
        return this.maxTimeToUploadMillis;
    }

    public final long component4() {
        return this.silenceToUploadMillis;
    }

    public final gzs<Integer> component5() {
        return this.maxFileLengthKbProvider;
    }

    public final gzs<Integer> component6() {
        return this.maxEventCountProvider;
    }

    public final gzs<Integer> component7() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final gzs<Long> component8() {
        return this.timeToUploadNextMsProvider;
    }

    public final gzs<Boolean> component9() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int i, Executor executor, long j, long j2, gzs<Integer> gzsVar, gzs<Integer> gzsVar2, gzs<Integer> gzsVar3, gzs<Long> gzsVar4, gzs<Boolean> gzsVar5, gzs<Boolean> gzsVar6, gzs<Boolean> gzsVar7, gzs<Boolean> gzsVar8) {
        return new UploadConfig(i, executor, j, j2, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, gzsVar6, gzsVar7, gzsVar8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) obj;
        return this.uploadJobId == uploadConfig.uploadJobId && epx.f(this.uploadExecutor, uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && epx.f(this.maxFileLengthKbProvider, uploadConfig.maxFileLengthKbProvider) && epx.f(this.maxEventCountProvider, uploadConfig.maxEventCountProvider) && epx.f(this.maxLocalCacheFileCountProvider, uploadConfig.maxLocalCacheFileCountProvider) && epx.f(this.timeToUploadNextMsProvider, uploadConfig.timeToUploadNextMsProvider) && epx.f(this.compressContentProvider, uploadConfig.compressContentProvider) && epx.f(this.disableUploadWhenCallIsActiveProvider, uploadConfig.disableUploadWhenCallIsActiveProvider) && epx.f(this.autoDetectFileCompressionProvider, uploadConfig.autoDetectFileCompressionProvider) && epx.f(this.useDbCacheProvider, uploadConfig.useDbCacheProvider);
    }

    public final boolean getAutoDetectFileCompression() {
        Boolean invoke;
        gzs<Boolean> gzsVar = this.autoDetectFileCompressionProvider;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
            return true;
        }
        return invoke.booleanValue();
    }

    public final gzs<Boolean> getAutoDetectFileCompressionProvider() {
        return this.autoDetectFileCompressionProvider;
    }

    public final boolean getCompressContent() {
        Boolean invoke;
        gzs<Boolean> gzsVar = this.compressContentProvider;
        if (gzsVar != null && (invoke = gzsVar.invoke()) != null) {
            return invoke.booleanValue();
        }
        gzs<Boolean> gzsVar2 = this.useDbCacheProvider;
        Boolean invoke2 = gzsVar2 != null ? gzsVar2.invoke() : null;
        if (invoke2 != null) {
            return invoke2.booleanValue();
        }
        return false;
    }

    public final gzs<Boolean> getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean invoke;
        gzs<Boolean> gzsVar = this.disableUploadWhenCallIsActiveProvider;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
            return true;
        }
        return invoke.booleanValue();
    }

    public final gzs<Boolean> getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer invoke;
        gzs<Integer> gzsVar = this.maxEventCountProvider;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
            return 800;
        }
        return invoke.intValue();
    }

    public final int getFileLengthTriggerToUploadBytes() {
        Integer invoke;
        gzs<Integer> gzsVar = this.maxFileLengthKbProvider;
        return ((gzsVar == null || (invoke = gzsVar.invoke()) == null) ? 15 : invoke.intValue()) * 1000;
    }

    public final gzs<Integer> getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final gzs<Integer> getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer invoke;
        gzs<Integer> gzsVar = this.maxLocalCacheFileCountProvider;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
            return 100;
        }
        return invoke.intValue();
    }

    public final gzs<Integer> getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        gzs<Long> gzsVar = this.timeToUploadNextMsProvider;
        if (gzsVar != null) {
            return gzsVar.invoke();
        }
        return null;
    }

    public final gzs<Long> getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public final boolean getUseDbCache() {
        Boolean invoke;
        gzs<Boolean> gzsVar = this.useDbCacheProvider;
        if (gzsVar == null || (invoke = gzsVar.invoke()) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    public final gzs<Boolean> getUseDbCacheProvider() {
        return this.useDbCacheProvider;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int a = bh10.a(bh10.a((hashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        gzs<Integer> gzsVar = this.maxFileLengthKbProvider;
        int hashCode2 = (a + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        gzs<Integer> gzsVar2 = this.maxEventCountProvider;
        int hashCode3 = (hashCode2 + (gzsVar2 == null ? 0 : gzsVar2.hashCode())) * 31;
        gzs<Integer> gzsVar3 = this.maxLocalCacheFileCountProvider;
        int hashCode4 = (hashCode3 + (gzsVar3 == null ? 0 : gzsVar3.hashCode())) * 31;
        gzs<Long> gzsVar4 = this.timeToUploadNextMsProvider;
        int hashCode5 = (hashCode4 + (gzsVar4 == null ? 0 : gzsVar4.hashCode())) * 31;
        gzs<Boolean> gzsVar5 = this.compressContentProvider;
        int hashCode6 = (hashCode5 + (gzsVar5 == null ? 0 : gzsVar5.hashCode())) * 31;
        gzs<Boolean> gzsVar6 = this.disableUploadWhenCallIsActiveProvider;
        int hashCode7 = (hashCode6 + (gzsVar6 == null ? 0 : gzsVar6.hashCode())) * 31;
        gzs<Boolean> gzsVar7 = this.autoDetectFileCompressionProvider;
        int hashCode8 = (hashCode7 + (gzsVar7 == null ? 0 : gzsVar7.hashCode())) * 31;
        gzs<Boolean> gzsVar8 = this.useDbCacheProvider;
        return hashCode8 + (gzsVar8 != null ? gzsVar8.hashCode() : 0);
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        gzs<Integer> gzsVar = this.maxFileLengthKbProvider;
        gzs<Integer> gzsVar2 = this.maxEventCountProvider;
        gzs<Integer> gzsVar3 = this.maxLocalCacheFileCountProvider;
        gzs<Long> gzsVar4 = this.timeToUploadNextMsProvider;
        gzs<Boolean> gzsVar5 = this.compressContentProvider;
        gzs<Boolean> gzsVar6 = this.disableUploadWhenCallIsActiveProvider;
        gzs<Boolean> gzsVar7 = this.autoDetectFileCompressionProvider;
        gzs<Boolean> gzsVar8 = this.useDbCacheProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        tj0.d(sb, ", silenceToUploadMillis=", j2, ", maxFileLengthKbProvider=");
        sb.append(gzsVar);
        sb.append(", maxEventCountProvider=");
        sb.append(gzsVar2);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(gzsVar3);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(gzsVar4);
        sb.append(", compressContentProvider=");
        sb.append(gzsVar5);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(gzsVar6);
        sb.append(", autoDetectFileCompressionProvider=");
        sb.append(gzsVar7);
        sb.append(", useDbCacheProvider=");
        sb.append(gzsVar8);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, gzs<Integer> gzsVar, gzs<Integer> gzsVar2, gzs<Integer> gzsVar3, gzs<Long> gzsVar4, gzs<Boolean> gzsVar5, gzs<Boolean> gzsVar6, gzs<Boolean> gzsVar7, gzs<Boolean> gzsVar8) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = gzsVar;
        this.maxEventCountProvider = gzsVar2;
        this.maxLocalCacheFileCountProvider = gzsVar3;
        this.timeToUploadNextMsProvider = gzsVar4;
        this.compressContentProvider = gzsVar5;
        this.disableUploadWhenCallIsActiveProvider = gzsVar6;
        this.autoDetectFileCompressionProvider = gzsVar7;
        this.useDbCacheProvider = gzsVar8;
    }

    public /* synthetic */ UploadConfig(int i, Executor executor, long j, long j2, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5, gzs gzsVar6, gzs gzsVar7, gzs gzsVar8, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 3815413 : i, (i2 & 2) != 0 ? null : executor, (i2 & 4) != 0 ? Long.MAX_VALUE : j, (i2 & 8) != 0 ? 15000L : j2, (i2 & 16) != 0 ? null : gzsVar, (i2 & 32) != 0 ? null : gzsVar2, (i2 & 64) != 0 ? null : gzsVar3, (i2 & 128) != 0 ? null : gzsVar4, (i2 & 256) != 0 ? null : gzsVar5, (i2 & 512) != 0 ? null : gzsVar6, (i2 & 1024) != 0 ? null : gzsVar7, (i2 & 2048) != 0 ? null : gzsVar8);
    }
}
