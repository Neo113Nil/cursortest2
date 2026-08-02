package xsna;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: VideoQuality.kt */
/* loaded from: classes17.dex */
public final class bat0 {

    /* compiled from: VideoQuality.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static List a(VideoFile videoFile, ArrayList arrayList, sht0 sht0Var) {
        if ((arrayList != null ? rdi.x(arrayList) : null) != null && sht0Var != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int height = ((FrameSize) it.next()).getHeight();
                if (height >= 240) {
                    arrayList2.add(Integer.valueOf(height != 240 ? height != 360 ? height != 480 ? height != 720 ? height != 1080 ? height != 1440 ? height != 2160 ? -1 : 2160 : 1440 : 1080 : 720 : 480 : 360 : 240));
                }
            }
            if (arrayList2.size() > 1) {
                Collections.sort(arrayList2, Collections.reverseOrder());
                int i = a.$EnumSwitchMapping$0[sht0Var.a.ordinal()];
                if (i == 1) {
                    arrayList2.add(0, -4);
                } else if (i == 2) {
                    arrayList2.add(0, -2);
                }
            }
            return j5g.R(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_2160))) {
            arrayList3.add(2160);
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_1440))) {
            arrayList3.add(1440);
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_1080))) {
            arrayList3.add(1080);
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_720))) {
            arrayList3.add(Integer.valueOf(PublisherConfiguration.DEFAULT_MAX_RES));
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_480))) {
            arrayList3.add(480);
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_360))) {
            arrayList3.add(360);
        }
        if (!TextUtils.isEmpty(videoFile.w9().Ab(VideoUrl.URL_240))) {
            arrayList3.add(Integer.valueOf(PsExtractor.VIDEO_STREAM_MASK));
        }
        return arrayList3;
    }
}
