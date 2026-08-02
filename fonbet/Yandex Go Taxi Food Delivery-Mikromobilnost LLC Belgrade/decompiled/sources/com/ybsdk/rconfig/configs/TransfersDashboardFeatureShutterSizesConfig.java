package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.no01;
import defpackage.unr0;
import defpackage.xra1;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardFeatureShutterSizesConfig;", "", "", "isEnabled", "", "collapsedRatio", "", "halfRatio", "expandedStateEnabled", "collapsedStateEnabled", "<init>", "(ZDFZZ)V", "Lno01;", "toEntity", "()Lno01;", "component1", "()Z", "component2", "()D", "component3", "()F", "component4", "component5", "copy", "(ZDFZZ)Lcom/ybsdk/rconfig/configs/TransfersDashboardFeatureShutterSizesConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", CA20Status.STATUS_REQUEST_D, "getCollapsedRatio", "F", "getHalfRatio", "getExpandedStateEnabled", "getCollapsedStateEnabled", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransfersDashboardFeatureShutterSizesConfig {

    @Json(name = "collapsed_ratio")
    private final double collapsedRatio;

    @Json(name = "collapsed_state_enabled")
    private final boolean collapsedStateEnabled;

    @Json(name = "expanded_state_enabled")
    private final boolean expandedStateEnabled;

    @Json(name = "half_ratio")
    private final float halfRatio;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    public TransfersDashboardFeatureShutterSizesConfig(boolean z, double d, float f, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.collapsedRatio = d;
        this.halfRatio = f;
        this.expandedStateEnabled = z2;
        this.collapsedStateEnabled = z3;
    }

    public static /* synthetic */ TransfersDashboardFeatureShutterSizesConfig copy$default(TransfersDashboardFeatureShutterSizesConfig transfersDashboardFeatureShutterSizesConfig, boolean z, double d, float f, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transfersDashboardFeatureShutterSizesConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            d = transfersDashboardFeatureShutterSizesConfig.collapsedRatio;
        }
        if ((i & 4) != 0) {
            f = transfersDashboardFeatureShutterSizesConfig.halfRatio;
        }
        if ((i & 8) != 0) {
            z2 = transfersDashboardFeatureShutterSizesConfig.expandedStateEnabled;
        }
        if ((i & 16) != 0) {
            z3 = transfersDashboardFeatureShutterSizesConfig.collapsedStateEnabled;
        }
        boolean z4 = z3;
        float f2 = f;
        return transfersDashboardFeatureShutterSizesConfig.copy(z, d, f2, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCollapsedRatio() {
        return this.collapsedRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final float getHalfRatio() {
        return this.halfRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExpandedStateEnabled() {
        return this.expandedStateEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCollapsedStateEnabled() {
        return this.collapsedStateEnabled;
    }

    public final TransfersDashboardFeatureShutterSizesConfig copy(boolean isEnabled, double collapsedRatio, float halfRatio, boolean expandedStateEnabled, boolean collapsedStateEnabled) {
        return new TransfersDashboardFeatureShutterSizesConfig(isEnabled, collapsedRatio, halfRatio, expandedStateEnabled, collapsedStateEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransfersDashboardFeatureShutterSizesConfig)) {
            return false;
        }
        TransfersDashboardFeatureShutterSizesConfig transfersDashboardFeatureShutterSizesConfig = (TransfersDashboardFeatureShutterSizesConfig) other;
        return this.isEnabled == transfersDashboardFeatureShutterSizesConfig.isEnabled && Double.compare(this.collapsedRatio, transfersDashboardFeatureShutterSizesConfig.collapsedRatio) == 0 && Float.compare(this.halfRatio, transfersDashboardFeatureShutterSizesConfig.halfRatio) == 0 && this.expandedStateEnabled == transfersDashboardFeatureShutterSizesConfig.expandedStateEnabled && this.collapsedStateEnabled == transfersDashboardFeatureShutterSizesConfig.collapsedStateEnabled;
    }

    public final double getCollapsedRatio() {
        return this.collapsedRatio;
    }

    public final boolean getCollapsedStateEnabled() {
        return this.collapsedStateEnabled;
    }

    public final boolean getExpandedStateEnabled() {
        return this.expandedStateEnabled;
    }

    public final float getHalfRatio() {
        return this.halfRatio;
    }

    public int hashCode() {
        return Boolean.hashCode(this.collapsedStateEnabled) + unr0.e(g8e.c(this.halfRatio, unr0.a(Boolean.hashCode(this.isEnabled) * 31, 31, this.collapsedRatio), 31), 31, this.expandedStateEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final no01 toEntity() {
        boolean z = this.isEnabled;
        double d = this.collapsedRatio;
        if (d > 1.0d) {
            d = 1.0d;
        }
        float f = this.halfRatio;
        if (f > 1.0f) {
            f = 1.0f;
        }
        return new no01(z, d, f, this.expandedStateEnabled, this.collapsedStateEnabled);
    }

    public String toString() {
        boolean z = this.isEnabled;
        double d = this.collapsedRatio;
        float f = this.halfRatio;
        boolean z2 = this.expandedStateEnabled;
        boolean z3 = this.collapsedStateEnabled;
        StringBuilder sb = new StringBuilder("TransfersDashboardFeatureShutterSizesConfig(isEnabled=");
        sb.append(z);
        sb.append(", collapsedRatio=");
        sb.append(d);
        sb.append(", halfRatio=");
        sb.append(f);
        sb.append(", expandedStateEnabled=");
        sb.append(z2);
        return xra1.a(sb, ", collapsedStateEnabled=", z3, Extension.C_BRAKE);
    }
}
