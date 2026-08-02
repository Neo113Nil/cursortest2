package xsna;

import com.vk.core.apps.BuildInfo;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationSmallIconHelper.kt */
/* loaded from: classes5.dex */
public final class wh70 {

    /* compiled from: NotificationSmallIconHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BuildInfo.Client.values().length];
            try {
                iArr[BuildInfo.Client.VK_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuildInfo.Client.VK_EDU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuildInfo.Client.SAMPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BuildInfo.Client.VK_MINI_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BuildInfo.Client.VK_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BuildInfo.Client.VK_TV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BuildInfo.Client.VK_ADMIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BuildInfo.Client.VK_DATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BuildInfo.Client.VK_MUSIC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BuildInfo.Client.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BuildInfo.Client.VK_CALLS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BuildInfo.Client.VK_ME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String a(BuildInfo.Client client) {
        switch (a.$EnumSwitchMapping$0[client.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "message_24";
            case 11:
                return "message_calls_24";
            case 12:
                return "message_vkme_24";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
