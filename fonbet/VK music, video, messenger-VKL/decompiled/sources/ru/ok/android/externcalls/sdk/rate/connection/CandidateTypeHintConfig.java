package ru.ok.android.externcalls.sdk.rate.connection;

import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: CandidateTypeHintConfig.kt */
/* loaded from: classes9.dex */
public final class CandidateTypeHintConfig {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_HOST = "host";
    public static final String TYPE_PRFLX = "prflx";
    public static final String TYPE_RELAY = "relay";
    public static final String TYPE_SRFLX = "srflx";
    private final Map<String, Long> limits;

    /* compiled from: CandidateTypeHintConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CandidateTypeHintConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CandidateTypeHintConfig copy$default(CandidateTypeHintConfig candidateTypeHintConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = candidateTypeHintConfig.limits;
        }
        return candidateTypeHintConfig.copy(map);
    }

    public final Map<String, Long> component1() {
        return this.limits;
    }

    public final CandidateTypeHintConfig copy(Map<String, Long> map) {
        return new CandidateTypeHintConfig(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CandidateTypeHintConfig) && epx.f(this.limits, ((CandidateTypeHintConfig) obj).limits);
    }

    public final Map<String, Long> getLimits() {
        return this.limits;
    }

    public int hashCode() {
        return this.limits.hashCode();
    }

    public final boolean isEmpty() {
        return this.limits.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.limits.isEmpty();
    }

    public String toString() {
        return "CandidateTypeHintConfig(limits=" + this.limits + ")";
    }

    public CandidateTypeHintConfig(Map<String, Long> map) {
        this.limits = map;
    }

    public /* synthetic */ CandidateTypeHintConfig(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? jgp.b : map);
    }
}
