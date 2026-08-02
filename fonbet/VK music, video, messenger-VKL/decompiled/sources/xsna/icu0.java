package xsna;

import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;

/* compiled from: VkAuthMetaInfoExt.kt */
/* loaded from: classes15.dex */
public final class icu0 {

    /* compiled from: VkAuthMetaInfoExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AfterPhoneReuseVerificationWay.values().length];
            try {
                iArr[AfterPhoneReuseVerificationWay.BY_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VkAuthMetaInfo a(VkAuthMetaInfo vkAuthMetaInfo, AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay) {
        return (afterPhoneReuseVerificationWay == null ? -1 : a.$EnumSwitchMapping$0[afterPhoneReuseVerificationWay.ordinal()]) == 1 ? VkAuthMetaInfo.zb(vkAuthMetaInfo, SilentAuthSource.BY_ECOSYSTEM_PUSH, null, null, 55) : vkAuthMetaInfo;
    }
}
