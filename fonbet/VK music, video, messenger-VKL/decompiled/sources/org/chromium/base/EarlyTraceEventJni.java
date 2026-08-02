package org.chromium.base;

import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import xsna.dyx;

/* loaded from: classes8.dex */
class EarlyTraceEventJni implements EarlyTraceEvent.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static EarlyTraceEvent.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new EarlyTraceEventJni() : (EarlyTraceEvent.Natives) obj;
    }

    public static void setInstanceForTesting(EarlyTraceEvent.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncBeginEvent(String str, long j, long j2) {
        N.M_Gv8TwM(str, j, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncEndEvent(long j, long j2) {
        N.MrKsqeCD(j, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyBeginEvent(String str, long j, int i, long j2) {
        N.MrWG2uUW(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyEndEvent(String str, long j, int i, long j2) {
        N.MmyrhqXB(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelBeginEvent(String str, long j, int i, long j2) {
        N.M7UXCmoq(str, j, i, j2);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelEndEvent(String str, long j, int i, long j2) {
        N.MRlw2LEn(str, j, i, j2);
    }
}
