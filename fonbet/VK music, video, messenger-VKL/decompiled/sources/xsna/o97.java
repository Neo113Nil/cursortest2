package xsna;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.hsk0;

/* compiled from: BiometricsLockStatInteractor.kt */
/* loaded from: classes15.dex */
public final class o97 {

    /* compiled from: BiometricsLockStatInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UnlockType.values().length];
            try {
                iArr[UnlockType.PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnlockType.BIOMETRICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type a(hsk0 hsk0Var) {
        if (hsk0Var instanceof hsk0.b) {
            return MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type.BIOMETRICS_ENTRANCE;
        }
        if (hsk0Var instanceof hsk0.a) {
            return MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type.AUTO_LOCK_TIME;
        }
        if (hsk0Var instanceof hsk0.e) {
            return MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type.HIDE_APP_CONTENT;
        }
        if (hsk0Var instanceof hsk0.c) {
            return MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type.CHANGE_PIN_PASSWORD;
        }
        if (hsk0Var instanceof hsk0.d) {
            return MobileOfficialAppsCoreSecureStat$TypeClickSecureLockSettingsItem.Type.DISABLE_SECURE_ENTRANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
