package org.chromium.base;

import internal.J.N;
import org.chromium.base.InputHintChecker;
import xsna.dyx;

/* loaded from: classes8.dex */
public class InputHintCheckerJni implements InputHintChecker.Natives {
    private static dyx sOverride;

    public static InputHintChecker.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new InputHintCheckerJni() : (InputHintChecker.Natives) obj;
    }

    public static void setInstanceForTesting(InputHintChecker.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean failedToInitializeForTesting() {
        return N.MczIGOvj_ForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean hasInputForTesting() {
        return N.MQ$6ljxU_ForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean hasInputWithThrottlingForTesting() {
        return N.MDDrLK5r_ForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public boolean isInitializedForTesting() {
        return N.MUOsQUSh_ForTesting();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void onCompositorViewHolderTouchEvent() {
        N.M6mA2913();
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void setIsAfterInputYieldForTesting(boolean z) {
        N.MtNxwUj9_ForTesting(z);
    }

    @Override // org.chromium.base.InputHintChecker.Natives
    public void setView(Object obj) {
        N.MTGiZpkh(obj);
    }
}
