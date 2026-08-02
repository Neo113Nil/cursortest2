package com.vungle.ads.fpd;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.imi0;
import xsna.lmi0;
import xsna.mqr;
import xsna.ozl;
import xsna.zcl;

@imi0
/* loaded from: classes7.dex */
public final class SessionContext {
    public static final Companion Companion = new Companion(null);
    public Float a;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public SessionContext() {
    }

    public static final void write$Self(SessionContext sessionContext, cti ctiVar, SerialDescriptor serialDescriptor) {
        if (!ctiVar.z() && sessionContext.a == null) {
            return;
        }
        ctiVar.s(serialDescriptor, 0, mqr.a, sessionContext.a);
    }

    public final SessionContext setLevelPercentile(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 100.0f) {
            this.a = Float.valueOf(f);
        }
        return this;
    }

    @ozl
    public /* synthetic */ SessionContext(int i, Float f, lmi0 lmi0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
    }

    @ozl
    public final SessionContext setFriends(List<String> list) {
        return this;
    }

    @ozl
    public final SessionContext setHealthPercentile(float f) {
        return this;
    }

    @ozl
    public final SessionContext setInGamePurchasesUSD(float f) {
        return this;
    }

    @ozl
    public final SessionContext setPage(String str) {
        return this;
    }

    @ozl
    public final SessionContext setSessionDuration(int i) {
        return this;
    }

    @ozl
    public final SessionContext setSessionStartTime(int i) {
        return this;
    }

    @ozl
    public final SessionContext setSignupDate(int i) {
        return this;
    }

    @ozl
    public final SessionContext setTimeSpent(int i) {
        return this;
    }

    @ozl
    public final SessionContext setUserID(String str) {
        return this;
    }

    @ozl
    public final SessionContext setUserLevelPercentile(float f) {
        return this;
    }

    @ozl
    public final SessionContext setUserScorePercentile(float f) {
        return this;
    }
}
