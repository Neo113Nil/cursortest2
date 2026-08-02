package xsna;

import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.toggle.features.FeedFeatures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: MyTargetVideoFileFactory.kt */
/* loaded from: classes4.dex */
public final class ht50 {
    public final ibr0 a;

    public ht50(ibr0 ibr0Var) {
        this.a = ibr0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static VideoUrlStorage a(List list) {
        VideoUrl videoUrl;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    VideoUrl videoUrl2 = (VideoUrl) pair.d();
                    String str = (String) pair.g();
                    if (!myc0.f(str)) {
                        str = null;
                    }
                    if (str != null) {
                        VideoUrlStorage.b bVar = VideoUrlStorage.c;
                        VideoUrlStorage.d.b(hashMap, videoUrl2, str);
                    }
                }
                return new VideoUrlStorage(hashMap);
            }
            nnx nnxVar = (nnx) it.next();
            if (com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_FORMATS_SUPPORT)) {
                Iterator<E> it3 = VideoUrl.k().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (epx.f(((VideoUrl) obj).l(), nnxVar.getFormat())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                videoUrl = (VideoUrl) obj;
            } else {
                String format = nnxVar.getFormat();
                if (format != null) {
                    switch (format.hashCode()) {
                        case -1113079323:
                            if (format.equals("mp4_1080")) {
                                videoUrl = VideoUrl.URL_1080;
                                break;
                            }
                            break;
                        case -1113075603:
                            if (format.equals("mp4_1440")) {
                                videoUrl = VideoUrl.URL_1440;
                                break;
                            }
                            break;
                        case -1113048633:
                            if (format.equals("mp4_2160")) {
                                videoUrl = VideoUrl.URL_2160;
                                break;
                            }
                            break;
                        case 1211021280:
                            if (format.equals("mp4_240")) {
                                videoUrl = VideoUrl.URL_240;
                                break;
                            }
                            break;
                        case 1211022303:
                            if (format.equals("mp4_360")) {
                                videoUrl = VideoUrl.URL_360;
                                break;
                            }
                            break;
                        case 1211023326:
                            if (format.equals("mp4_480")) {
                                videoUrl = VideoUrl.URL_480;
                                break;
                            }
                            break;
                        case 1211026023:
                            if (format.equals("mp4_720")) {
                                videoUrl = VideoUrl.URL_720;
                                break;
                            }
                            break;
                    }
                }
                videoUrl = null;
            }
            Pair pair2 = videoUrl != null ? new Pair(videoUrl, nnxVar.a()) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
    }
}
