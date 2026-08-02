package org.chromium.base;

import internal.J.N;
import org.chromium.base.FileUtils;
import xsna.dyx;

/* loaded from: classes8.dex */
public class FileUtilsJni implements FileUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static FileUtils.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new FileUtilsJni() : (FileUtils.Natives) obj;
    }

    public static void setInstanceForTesting(FileUtils.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.FileUtils.Natives
    public String getAbsoluteFilePath(String str) {
        return (String) N.MWck3aif(str);
    }
}
