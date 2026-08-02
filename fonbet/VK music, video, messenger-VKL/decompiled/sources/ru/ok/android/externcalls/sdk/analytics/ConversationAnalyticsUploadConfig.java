package ru.ok.android.externcalls.sdk.analytics;

import xsna.epx;
import xsna.gsi0;
import xsna.odj;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: ConversationAnalyticsUploadConfig.kt */
/* loaded from: classes9.dex */
public final class ConversationAnalyticsUploadConfig {
    private final boolean autoDetectContentCompression;
    private final boolean compressContent;
    private final boolean disableUploadWhenCallIsActiveProvider;
    private final int maxEventCount;
    private final int maxLocalFileCount;
    private final int maxLocalFileSizeKb;
    private final Long timeToUploadNextFileMs;
    private final boolean useDbCache;

    public ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4) {
        this.maxLocalFileSizeKb = i;
        this.maxEventCount = i2;
        this.maxLocalFileCount = i3;
        this.timeToUploadNextFileMs = l;
        this.compressContent = z;
        this.disableUploadWhenCallIsActiveProvider = z2;
        this.autoDetectContentCompression = z3;
        this.useDbCache = z4;
    }

    public static /* synthetic */ ConversationAnalyticsUploadConfig copy$default(ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig, int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = conversationAnalyticsUploadConfig.maxLocalFileSizeKb;
        }
        if ((i4 & 2) != 0) {
            i2 = conversationAnalyticsUploadConfig.maxEventCount;
        }
        if ((i4 & 4) != 0) {
            i3 = conversationAnalyticsUploadConfig.maxLocalFileCount;
        }
        if ((i4 & 8) != 0) {
            l = conversationAnalyticsUploadConfig.timeToUploadNextFileMs;
        }
        if ((i4 & 16) != 0) {
            z = conversationAnalyticsUploadConfig.compressContent;
        }
        if ((i4 & 32) != 0) {
            z2 = conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider;
        }
        if ((i4 & 64) != 0) {
            z3 = conversationAnalyticsUploadConfig.autoDetectContentCompression;
        }
        if ((i4 & 128) != 0) {
            z4 = conversationAnalyticsUploadConfig.useDbCache;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        return conversationAnalyticsUploadConfig.copy(i, i2, i3, l, z7, z8, z5, z6);
    }

    public final int component1() {
        return this.maxLocalFileSizeKb;
    }

    public final int component2() {
        return this.maxEventCount;
    }

    public final int component3() {
        return this.maxLocalFileCount;
    }

    public final Long component4() {
        return this.timeToUploadNextFileMs;
    }

    public final boolean component5() {
        return this.compressContent;
    }

    public final boolean component6() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final boolean component7() {
        return this.autoDetectContentCompression;
    }

    public final boolean component8() {
        return this.useDbCache;
    }

    public final ConversationAnalyticsUploadConfig copy(int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4) {
        return new ConversationAnalyticsUploadConfig(i, i2, i3, l, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationAnalyticsUploadConfig)) {
            return false;
        }
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) obj;
        return this.maxLocalFileSizeKb == conversationAnalyticsUploadConfig.maxLocalFileSizeKb && this.maxEventCount == conversationAnalyticsUploadConfig.maxEventCount && this.maxLocalFileCount == conversationAnalyticsUploadConfig.maxLocalFileCount && epx.f(this.timeToUploadNextFileMs, conversationAnalyticsUploadConfig.timeToUploadNextFileMs) && this.compressContent == conversationAnalyticsUploadConfig.compressContent && this.disableUploadWhenCallIsActiveProvider == conversationAnalyticsUploadConfig.disableUploadWhenCallIsActiveProvider && this.autoDetectContentCompression == conversationAnalyticsUploadConfig.autoDetectContentCompression && this.useDbCache == conversationAnalyticsUploadConfig.useDbCache;
    }

    public final boolean getAutoDetectContentCompression() {
        return this.autoDetectContentCompression;
    }

    public final boolean getCompressContent() {
        return this.compressContent;
    }

    public final boolean getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getMaxEventCount() {
        return this.maxEventCount;
    }

    public final int getMaxLocalFileCount() {
        return this.maxLocalFileCount;
    }

    public final int getMaxLocalFileSizeKb() {
        return this.maxLocalFileSizeKb;
    }

    public final Long getTimeToUploadNextFileMs() {
        return this.timeToUploadNextFileMs;
    }

    public final boolean getUseDbCache() {
        return this.useDbCache;
    }

    public int hashCode() {
        int a = shy.a(this.maxLocalFileCount, shy.a(this.maxEventCount, Integer.hashCode(this.maxLocalFileSizeKb) * 31, 31), 31);
        Long l = this.timeToUploadNextFileMs;
        return Boolean.hashCode(this.useDbCache) + qoy.b(qoy.b(qoy.b((a + (l == null ? 0 : l.hashCode())) * 31, 31, this.compressContent), 31, this.disableUploadWhenCallIsActiveProvider), 31, this.autoDetectContentCompression);
    }

    public String toString() {
        int i = this.maxLocalFileSizeKb;
        int i2 = this.maxEventCount;
        int i3 = this.maxLocalFileCount;
        Long l = this.timeToUploadNextFileMs;
        boolean z = this.compressContent;
        boolean z2 = this.disableUploadWhenCallIsActiveProvider;
        boolean z3 = this.autoDetectContentCompression;
        boolean z4 = this.useDbCache;
        StringBuilder a = odj.a(i, i2, "ConversationAnalyticsUploadConfig(maxLocalFileSizeKb=", ", maxEventCount=", ", maxLocalFileCount=");
        a.append(i3);
        a.append(", timeToUploadNextFileMs=");
        a.append(l);
        a.append(", compressContent=");
        gsi0.c(a, z, ", disableUploadWhenCallIsActiveProvider=", z2, ", autoDetectContentCompression=");
        a.append(z3);
        a.append(", useDbCache=");
        a.append(z4);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ ConversationAnalyticsUploadConfig(int i, int i2, int i3, Long l, boolean z, boolean z2, boolean z3, boolean z4, int i4, zcl zclVar) {
        this(i, i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? null : l, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? false : z3, (i4 & 128) != 0 ? false : z4);
    }
}
