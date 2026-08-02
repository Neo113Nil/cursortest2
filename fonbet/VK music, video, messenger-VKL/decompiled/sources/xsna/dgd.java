package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.xzc;

/* compiled from: ClipsAdVideoExt.kt */
/* loaded from: classes17.dex */
public final class dgd {

    /* compiled from: ClipsAdVideoExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkVideoAdsType.values().length];
            try {
                iArr[SdkVideoAdsType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkVideoAdsType.MAIL_SHORT_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SdkVideoAdsType.MY_TARGET_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SdkVideoAdsType.VK_SHORT_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SdkVideoAdsType.MAIL_PROMOTED_SHORT_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final xzc a(SdkVideoFile sdkVideoFile) {
        SdkVideoAdInfo X0 = sdkVideoFile.X0();
        if (X0 == null) {
            return new xzc.c(sdkVideoFile.o0(), sdkVideoFile.I0());
        }
        switch (a.$EnumSwitchMapping$0[X0.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new xzc.a(sdkVideoFile.o0(), sdkVideoFile.I0());
            case 4:
                UserId userId = X0.e;
                return userId != null ? new xzc.b(sdkVideoFile.o0(), sdkVideoFile.I0(), userId) : new xzc.a(sdkVideoFile.o0(), sdkVideoFile.I0());
            case 5:
            case 6:
                return new xzc.c(sdkVideoFile.o0(), sdkVideoFile.I0());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UserId b(SdkVideoFile sdkVideoFile) {
        xzc a2 = a(sdkVideoFile);
        if (a2 instanceof xzc.c) {
            return ((xzc.c) a2).b;
        }
        if (a2 instanceof xzc.a) {
            return null;
        }
        if (a2 instanceof xzc.b) {
            return ((xzc.b) a2).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(SdkVideoFile sdkVideoFile) {
        return (sdkVideoFile.X0() == null && sdkVideoFile.p1() == null) ? false : true;
    }

    public static final boolean d(SdkVideoFile sdkVideoFile) {
        xzc a2 = a(sdkVideoFile);
        if (a2 instanceof xzc.c) {
            return false;
        }
        if ((a2 instanceof xzc.a) || (a2 instanceof xzc.b)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean e(SdkVideoFile sdkVideoFile) {
        SdkVideoAdInfo X0;
        SdkVideoAdInfo X02 = sdkVideoFile.X0();
        return (X02 != null ? X02.h : null) == SdkVideoAdsType.MAIL_PROMOTED_SHORT_VIDEO && (X0 = sdkVideoFile.X0()) != null && X0.i && sdkVideoFile.m1() != null;
    }

    public static final boolean f(SdkVideoFile sdkVideoFile) {
        SdkVideoAdInfo X0 = sdkVideoFile.X0();
        if (X0 == null) {
            return false;
        }
        switch (a.$EnumSwitchMapping$0[X0.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
