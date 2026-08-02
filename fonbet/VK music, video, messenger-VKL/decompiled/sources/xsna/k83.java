package xsna;

import com.vk.core.apps.BuildInfo;

/* compiled from: AppRedirectUtils.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class k83 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BuildInfo.Client.values().length];
        try {
            iArr[BuildInfo.Client.VK_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BuildInfo.Client.VK_ME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BuildInfo.Client.VK_CALLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BuildInfo.Client.VK_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BuildInfo.Client.VK_TV.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BuildInfo.Client.VK_DATING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BuildInfo.Client.VK_MUSIC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
