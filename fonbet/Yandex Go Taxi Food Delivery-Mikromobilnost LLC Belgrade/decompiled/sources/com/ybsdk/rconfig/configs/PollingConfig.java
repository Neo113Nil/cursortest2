package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingConfig;", "", "", "initialDelay", CA20Status.STATUS_REQUEST_D, "getInitialDelay", "()D", "maxDuration", "getMaxDuration", "Backoff", "Simple", "Lcom/ybsdk/rconfig/configs/PollingConfig$Backoff;", "Lcom/ybsdk/rconfig/configs/PollingConfig$Simple;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class PollingConfig {

    @Json(name = "initial_delay")
    private final double initialDelay;

    @Json(name = "max_duration")
    private final double maxDuration;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingConfig$Backoff;", "Lcom/ybsdk/rconfig/configs/PollingConfig;", "base", "", "cap", "factor", "initialDelay", "maxDuration", "<init>", "(DDDDD)V", "getBase", "()D", "getCap", "getFactor", "getInitialDelay", "getMaxDuration", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Backoff extends PollingConfig {

        @Json(name = "base")
        private final double base;

        @Json(name = "cap")
        private final double cap;

        @Json(name = "factor")
        private final double factor;

        @Json(name = "initial_delay")
        private final double initialDelay;

        @Json(name = "max_duration")
        private final double maxDuration;

        public Backoff(double d, double d2, double d3, double d4, double d5) {
            super(d4, d5);
            this.base = d;
            this.cap = d2;
            this.factor = d3;
            this.initialDelay = d4;
            this.maxDuration = d5;
        }

        public static /* synthetic */ Backoff copy$default(Backoff backoff, double d, double d2, double d3, double d4, double d5, int i, Object obj) {
            if ((i & 1) != 0) {
                d = backoff.base;
            }
            double d6 = d;
            if ((i & 2) != 0) {
                d2 = backoff.cap;
            }
            return backoff.copy(d6, d2, (i & 4) != 0 ? backoff.factor : d3, (i & 8) != 0 ? backoff.initialDelay : d4, (i & 16) != 0 ? backoff.maxDuration : d5);
        }

        /* renamed from: component1, reason: from getter */
        public final double getBase() {
            return this.base;
        }

        /* renamed from: component2, reason: from getter */
        public final double getCap() {
            return this.cap;
        }

        /* renamed from: component3, reason: from getter */
        public final double getFactor() {
            return this.factor;
        }

        /* renamed from: component4, reason: from getter */
        public final double getInitialDelay() {
            return this.initialDelay;
        }

        /* renamed from: component5, reason: from getter */
        public final double getMaxDuration() {
            return this.maxDuration;
        }

        public final Backoff copy(double base, double cap, double factor, double initialDelay, double maxDuration) {
            return new Backoff(base, cap, factor, initialDelay, maxDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Backoff)) {
                return false;
            }
            Backoff backoff = (Backoff) other;
            return Double.compare(this.base, backoff.base) == 0 && Double.compare(this.cap, backoff.cap) == 0 && Double.compare(this.factor, backoff.factor) == 0 && Double.compare(this.initialDelay, backoff.initialDelay) == 0 && Double.compare(this.maxDuration, backoff.maxDuration) == 0;
        }

        public final double getBase() {
            return this.base;
        }

        public final double getCap() {
            return this.cap;
        }

        public final double getFactor() {
            return this.factor;
        }

        public double getInitialDelay() {
            return this.initialDelay;
        }

        @Override // com.ybsdk.rconfig.configs.PollingConfig
        public double getMaxDuration() {
            return this.maxDuration;
        }

        public int hashCode() {
            return Double.hashCode(this.maxDuration) + unr0.a(unr0.a(unr0.a(Double.hashCode(this.base) * 31, 31, this.cap), 31, this.factor), 31, this.initialDelay);
        }

        public String toString() {
            double d = this.base;
            double d2 = this.cap;
            double d3 = this.factor;
            double d4 = this.initialDelay;
            double d5 = this.maxDuration;
            StringBuilder u = oyr.u(d, "Backoff(base=", ", cap=");
            u.append(d2);
            nzs.o(u, ", factor=", d3, ", initialDelay=");
            u.append(d4);
            u.append(", maxDuration=");
            u.append(d5);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingConfig$Simple;", "Lcom/ybsdk/rconfig/configs/PollingConfig;", "base", "", "initialDelay", "maxDuration", "<init>", "(DDD)V", "getBase", "()D", "getInitialDelay", "getMaxDuration", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Simple extends PollingConfig {

        @Json(name = "base")
        private final double base;

        @Json(name = "initial_delay")
        private final double initialDelay;

        @Json(name = "max_duration")
        private final double maxDuration;

        public Simple(double d, double d2, double d3) {
            super(d2, d3);
            this.base = d;
            this.initialDelay = d2;
            this.maxDuration = d3;
        }

        public static /* synthetic */ Simple copy$default(Simple simple, double d, double d2, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = simple.base;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = simple.initialDelay;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = simple.maxDuration;
            }
            return simple.copy(d4, d5, d3);
        }

        /* renamed from: component1, reason: from getter */
        public final double getBase() {
            return this.base;
        }

        /* renamed from: component2, reason: from getter */
        public final double getInitialDelay() {
            return this.initialDelay;
        }

        /* renamed from: component3, reason: from getter */
        public final double getMaxDuration() {
            return this.maxDuration;
        }

        public final Simple copy(double base, double initialDelay, double maxDuration) {
            return new Simple(base, initialDelay, maxDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) other;
            return Double.compare(this.base, simple.base) == 0 && Double.compare(this.initialDelay, simple.initialDelay) == 0 && Double.compare(this.maxDuration, simple.maxDuration) == 0;
        }

        public final double getBase() {
            return this.base;
        }

        public double getInitialDelay() {
            return this.initialDelay;
        }

        @Override // com.ybsdk.rconfig.configs.PollingConfig
        public double getMaxDuration() {
            return this.maxDuration;
        }

        public int hashCode() {
            return Double.hashCode(this.maxDuration) + unr0.a(Double.hashCode(this.base) * 31, 31, this.initialDelay);
        }

        public String toString() {
            double d = this.base;
            double d2 = this.initialDelay;
            double d3 = this.maxDuration;
            StringBuilder u = oyr.u(d, "Simple(base=", ", initialDelay=");
            u.append(d2);
            u.append(", maxDuration=");
            u.append(d3);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }
    }

    public PollingConfig(double d, double d2) {
        this.initialDelay = d;
        this.maxDuration = d2;
    }

    public double getMaxDuration() {
        return this.maxDuration;
    }
}
