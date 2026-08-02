package xsna;

import com.vk.dto.common.Peer;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$CallType;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipCallTypeAnalytics.kt */
/* loaded from: classes7.dex */
public final class gjw0 {

    /* compiled from: VoipCallTypeAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipCallTypeAnalytics.values().length];
            try {
                iArr[VoipCallTypeAnalytics.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallTypeAnalytics.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipCallTypeAnalytics.CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Peer.Type.values().length];
            try {
                iArr2[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Peer.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Peer.Type.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final MobileOfficialAppsCallsStat$CallType a(VoipCallTypeAnalytics voipCallTypeAnalytics) {
        int i = a.$EnumSwitchMapping$0[voipCallTypeAnalytics.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsCallsStat$CallType.USER;
        }
        if (i == 2) {
            return MobileOfficialAppsCallsStat$CallType.GROUP;
        }
        if (i == 3) {
            return MobileOfficialAppsCallsStat$CallType.CONTACT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final VoipCallTypeAnalytics b(Peer.Type type) {
        int i = a.$EnumSwitchMapping$1[type.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? VoipCallTypeAnalytics.GROUP : VoipCallTypeAnalytics.USER : VoipCallTypeAnalytics.CONTACT;
    }
}
