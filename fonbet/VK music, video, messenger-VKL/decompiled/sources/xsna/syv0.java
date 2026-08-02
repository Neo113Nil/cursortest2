package xsna;

import com.vk.auth.oauth.VkOAuthService;

/* compiled from: VkVerificationBasePresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class syv0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VkOAuthService.values().length];
        try {
            iArr[VkOAuthService.ESIA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VkOAuthService.TINKOFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VkOAuthService.SBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VkOAuthService.ALFA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VkOAuthService.VTB.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
