package com.vungle.ads;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* loaded from: classes7.dex */
public abstract class VungleError extends Exception {
    public final Sdk.SDKError.Reason a;
    public final String b;
    public final int c;
    public s d;

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, zcl zclVar) {
        this(reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VungleError vungleError = (VungleError) obj;
        return this.a == vungleError.a && epx.f(this.b, vungleError.b) && epx.f(this.d, vungleError.d);
    }

    public final int getCode() {
        return this.c;
    }

    public final String getErrorMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.b;
    }

    public int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        s sVar = this.d;
        return a + (sVar != null ? sVar.hashCode() : 0);
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.c(this.a, this.b, this.d);
    }

    public final VungleError setLogEntry$vungle_ads_release(s sVar) {
        this.d = sVar;
        return this;
    }

    public VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.a = reason;
        this.b = str;
        this.c = reason.getNumber();
    }
}
