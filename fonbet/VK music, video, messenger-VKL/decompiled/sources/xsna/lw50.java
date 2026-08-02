package xsna;

import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;

/* compiled from: NavigationActionHandler.kt */
/* loaded from: classes5.dex */
public final class lw50 {
    public final f4z<ExternalEvent> a;
    public final lyd0 b;

    /* compiled from: NavigationActionHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileSettingType.values().length];
            try {
                iArr[ProfileSettingType.Profile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileSettingType.Contacts.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileSettingType.Interests.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileSettingType.Education.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileSettingType.Career.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfileSettingType.Personal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProfileSettingType.Military.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProfileSettingType.PersonalAccount.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProfileSettingType.Security.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lw50(f4z<ExternalEvent> f4zVar, lyd0 lyd0Var) {
        this.a = f4zVar;
        this.b = lyd0Var;
    }
}
