package org.chromium.base;

import internal.J.N;
import org.chromium.base.JavaExceptionReporter;
import xsna.dyx;

/* loaded from: classes8.dex */
class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static JavaExceptionReporter.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new JavaExceptionReporterJni() : (JavaExceptionReporter.Natives) obj;
    }

    public static void setInstanceForTesting(JavaExceptionReporter.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaException(boolean z, Throwable th) {
        N.MLlibBXh(z, th);
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaStackTrace(String str) {
        N.MmS4zlEt(str);
    }
}
