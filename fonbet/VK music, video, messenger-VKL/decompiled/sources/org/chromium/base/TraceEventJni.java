package org.chromium.base;

import internal.J.N;
import org.chromium.base.TraceEvent;
import xsna.dyx;

/* loaded from: classes11.dex */
class TraceEventJni implements TraceEvent.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static TraceEvent.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new TraceEventJni() : (TraceEvent.Natives) obj;
    }

    public static void setInstanceForTesting(TraceEvent.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void addViewDump(int i, int i2, boolean z, boolean z2, String str, String str2, long j) {
        N.MmnP6i1r(i, i2, z, z2, str, str2, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void begin(String str, String str2) {
        N.M9XfPu17(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginToplevel(String str) {
        N.M_y76mct(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginWithIntArg(String str, int i) {
        N.MfyKGfoR(str, i);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void end(String str, long j) {
        N.Mw73xTww(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void endToplevel() {
        N.MLJecZJ9();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void finishAsync(long j) {
        N.MffNhCLU(j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void initViewHierarchyDump(long j, Object obj) {
        N.Ml5G_GLY(j, obj);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instant(String str, String str2) {
        N.ML40H8ed(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidIPC(String str, long j) {
        N.MgOW0Igo(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidToolbar(int i, int i2, int i3) {
        N.MtoXPJsu(i, i2, i3);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void registerEnabledObserver() {
        N.MFFzPOVw();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public long startActivityDump(String str, long j) {
        return N.MwX2YEhL(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startAsync(String str, long j) {
        N.MHopMqLX(str, j);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupActivityStart(long j, long j2) {
        N.MvcVeOsg(j, j2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupLaunchCause(long j, long j2, int i) {
        N.MbWHcONC(j, j2, i);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startupTimeToFirstVisibleContent2(long j, long j2, long j3) {
        N.MCS8G8B2(j, j2, j3);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public boolean viewHierarchyDumpEnabled() {
        return N.MnfJQqTB();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupFirstInstance(long j, long j2, boolean z) {
        N.MU2h8swg(j, j2, z);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupNotFirstInstance(long j, long j2) {
        N.MSryNsDk(j, j2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStage1(long j, long j2) {
        N.MkM80XCq(j, j2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStartChromiumLocked(long j, long j2, int i, int i2, int i3) {
        N.MhNry1OP(j, j2, i, i2, i3);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupTotalFactoryInit(long j, long j2) {
        N.MsUcOjxl(j, j2);
    }
}
