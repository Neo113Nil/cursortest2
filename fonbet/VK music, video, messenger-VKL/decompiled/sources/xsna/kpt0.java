package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.media.MediaUtils;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.mno0;

/* compiled from: VideoUtils.kt */
/* loaded from: classes16.dex */
public final class kpt0 {
    public static final String a(int i) {
        if (i < 0) {
            i = 0;
        }
        return i < 3600 ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)}, 3));
    }

    public static final mno0.i b(gi5 gi5Var) {
        long j = gi5Var.r;
        if (j <= 0) {
            return null;
        }
        long j2 = gi5Var.q;
        if (j2 < 0) {
            return null;
        }
        long j3 = j - j2;
        if (j3 <= 0) {
            return null;
        }
        int i = (int) (j3 / 1000);
        return i < 3600 ? new mno0.i(String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2))) : new mno0.i(String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)}, 3)));
    }

    public static final mno0 c(int i, VideoFile videoFile) {
        String platform = videoFile.getPlatform();
        String platform2 = (platform == null || platform.length() == 0) ? "" : videoFile.getPlatform();
        if (videoFile.z0()) {
            return new mno0.g(R.string.video_live_upcoming);
        }
        if (videoFile.q0()) {
            return new mno0.g(R.string.video_live);
        }
        if (videoFile.getDuration() <= 0 && (platform2.length() != 0 || videoFile.getDuration() != 0)) {
            return new mno0.i(platform2);
        }
        String a = a(videoFile.getDuration() - i);
        return platform2.length() == 0 ? new mno0.i(a) : new mno0.i(pzl.b(platform2, " · ", a));
    }

    public static final mno0 d(VideoFile videoFile) {
        return c(0, videoFile);
    }

    public static final boolean e(VideoFile videoFile) {
        VideoRestriction O = videoFile.O();
        return O == null || O.d;
    }

    public static final String f(Context context, String str, boolean z) {
        if (!z) {
            return (str == null || str.length() == 0) ? "" : ucp.j(str, null).toString();
        }
        String obj = s490.d(context, str, "", R.attr.vk_ui_text_secondary).toString();
        return (obj == null || obj.length() == 0) ? "" : ucp.j(obj, null).toString();
    }

    public static final mno0 g(VideoFile videoFile) {
        return uqm0.g(videoFile.L8()) ? new mno0.h(R.string.views_count_raw, Collections.singletonList(uqm0.f(videoFile.L8()))) : new mno0.f(R.plurals.views_count, videoFile.L8(), Collections.singletonList(Integer.valueOf(videoFile.L8())));
    }

    public static final boolean h(VideoFile videoFile, boolean z, boolean z2) {
        VideoRestriction O = videoFile.O();
        RestrictionButton restrictionButton = O != null ? O.e : null;
        if (!z2 || O == null || O.f) {
            return true;
        }
        if (z && e5o.a(videoFile)) {
            return true;
        }
        if (restrictionButton == null) {
            return false;
        }
        VideoRestriction.SupportedAction.Companion.getClass();
        return VideoRestriction.SupportedAction.a.a(restrictionButton);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(Context context, Uri uri, MediaUtils.d dVar, ContinuationImpl continuationImpl) {
        ipt0 ipt0Var;
        int i;
        if (continuationImpl instanceof ipt0) {
            ipt0Var = (ipt0) continuationImpl;
            int i2 = ipt0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ipt0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = ipt0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ipt0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    jpt0 jpt0Var = new jpt0(dVar, uri, context, null);
                    ipt0Var.L$0 = null;
                    ipt0Var.L$1 = null;
                    ipt0Var.L$2 = null;
                    ipt0Var.label = 1;
                    obj = myc0.k(b, jpt0Var, ipt0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        ipt0Var = new ipt0(continuationImpl);
        Object obj2 = ipt0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ipt0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
