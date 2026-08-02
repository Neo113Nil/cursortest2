package xsna;

import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.yzc;

/* compiled from: ClipsAdVideoExt.kt */
/* loaded from: classes18.dex */
public final class egd {

    /* compiled from: ClipsAdVideoExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAdsType.values().length];
            try {
                iArr[VideoAdsType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAdsType.MAIL_SHORT_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAdsType.MY_TARGET_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoAdsType.VK_SHORT_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final yzc a(VideoFile videoFile) {
        VideoAdInfo X0 = videoFile.X0();
        if (X0 == null) {
            return new yzc.c(videoFile.o0(), videoFile.I0());
        }
        switch (a.$EnumSwitchMapping$0[X0.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new yzc.a(videoFile.o0(), videoFile.I0());
            case 4:
                UserId userId = X0.e;
                return userId != null ? new yzc.b(videoFile.o0(), videoFile.I0(), userId) : new yzc.a(videoFile.o0(), videoFile.I0());
            case 5:
            case 6:
                return new yzc.c(videoFile.o0(), videoFile.I0());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean b(VideoFile videoFile) {
        yzc a2 = a(videoFile);
        if (a2 instanceof yzc.c) {
            return false;
        }
        if ((a2 instanceof yzc.a) || (a2 instanceof yzc.b)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(VideoFile videoFile) {
        VideoAdInfo X0 = videoFile.X0();
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
