package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.FrameSize;

/* compiled from: VideoTrackExt.kt */
/* loaded from: classes8.dex */
public final class nlt0 {

    /* compiled from: VideoTrackExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameSize.values().length];
            try {
                iArr[FrameSize._144p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameSize._240p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameSize._360p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FrameSize._480p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FrameSize._720p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FrameSize._1080p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FrameSize._1440p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FrameSize._2160p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FrameSize._4320p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(one.video.player.tracks.c cVar, Context context) {
        int i;
        if (cVar != null) {
            switch (a.$EnumSwitchMapping$0[((cms0) cVar.c).b().ordinal()]) {
                case 1:
                    i = R.string.one_video_quality_144;
                    break;
                case 2:
                    i = R.string.one_video_quality_240;
                    break;
                case 3:
                    i = R.string.one_video_quality_360;
                    break;
                case 4:
                    i = R.string.one_video_quality_480;
                    break;
                case 5:
                    i = R.string.one_video_quality_720;
                    break;
                case 6:
                    i = R.string.one_video_quality_1080;
                    break;
                case 7:
                    i = R.string.one_video_quality_1440;
                    break;
                case 8:
                    i = R.string.one_video_quality_2160;
                    break;
                case 9:
                    i = R.string.one_video_quality_4320;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            i = R.string.one_video_quality_auto;
        }
        return context.getString(i);
    }
}
