package org.chromium.base;

import internal.J.N;
import org.chromium.base.ImportantFileWriterAndroid;
import xsna.dyx;

/* loaded from: classes8.dex */
public class ImportantFileWriterAndroidJni implements ImportantFileWriterAndroid.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static ImportantFileWriterAndroid.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new ImportantFileWriterAndroidJni() : (ImportantFileWriterAndroid.Natives) obj;
    }

    public static void setInstanceForTesting(ImportantFileWriterAndroid.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.ImportantFileWriterAndroid.Natives
    public boolean writeFileAtomically(String str, byte[] bArr) {
        return N.MsOKBrZ5(str, bArr);
    }
}
