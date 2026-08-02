package org.chromium.base;

import internal.J.N;
import org.chromium.base.FieldTrialList;
import xsna.dyx;

/* loaded from: classes8.dex */
class FieldTrialListJni implements FieldTrialList.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static FieldTrialList.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new FieldTrialListJni() : (FieldTrialList.Natives) obj;
    }

    public static void setInstanceForTesting(FieldTrialList.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean createFieldTrial(String str, String str2) {
        return N.MGqzwlIM(str, str2);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public String findFullName(String str) {
        return (String) N.MdC43qwX(str);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public String getVariationParameter(String str, String str2) {
        return (String) N.MZWMOP4I(str, str2);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public void logActiveTrials() {
        N.MHz6Fn06();
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean trialExists(String str) {
        return N.Mmqqda9c(str);
    }
}
