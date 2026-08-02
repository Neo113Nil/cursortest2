package xsna;

import com.unity3d.mediation.LevelPlayPrivacySettings;
import xsna.lau;

/* compiled from: UnityLevelPlayFeatureImpl.kt */
/* loaded from: classes6.dex */
public final class e4q0 implements lau.b {
    @Override // xsna.lau.b
    public final void a(int i) {
        if (i == 2) {
            LevelPlayPrivacySettings.setCCPA(false);
        } else if (i == 1) {
            LevelPlayPrivacySettings.setCCPA(true);
        }
    }
}
