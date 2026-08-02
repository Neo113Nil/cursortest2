package defpackage;

import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.settings.main.data.PaymentMenuItemAppearance;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class h700 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[MainMenuLogOutUiState.values().length];
        try {
            iArr[MainMenuLogOutUiState.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MainMenuLogOutUiState.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MainMenuLogOutUiState.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PaymentMenuItemAppearance.values().length];
        try {
            iArr2[PaymentMenuItemAppearance.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PaymentMenuItemAppearance.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PaymentMenuItemAppearance.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[SharedAccountMenuViewModel.BadgeType.values().length];
        try {
            iArr3[SharedAccountMenuViewModel.BadgeType.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[SharedAccountMenuViewModel.BadgeType.PROTECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
