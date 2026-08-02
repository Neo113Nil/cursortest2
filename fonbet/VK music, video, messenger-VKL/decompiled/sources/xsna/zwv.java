package xsna;

import android.os.SystemClock;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.libvideo.autoplay.b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ImAutoplayFactory.kt */
/* loaded from: classes2.dex */
public final class zwv {
    public String a;

    public static yg5 a(Attach attach) {
        VideoFile videoFile;
        if (attach instanceof AttachWithVideo) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            return b.C1208b.a().e(((AttachWithVideo) attach).A(), null);
        }
        if (attach instanceof AttachDoc) {
            AttachDoc attachDoc = (AttachDoc) attach;
            if (attachDoc.x5()) {
                ConcurrentHashMap<AttachDoc, VideoFile> concurrentHashMap = a4w.a;
                if (attachDoc.x5()) {
                    ConcurrentHashMap<AttachDoc, VideoFile> concurrentHashMap2 = a4w.a;
                    VideoFile videoFile2 = concurrentHashMap2.get(attachDoc);
                    if (videoFile2 == null) {
                        VideoFileOld videoFileOld = new VideoFileOld();
                        if (attachDoc.l.length() == 0) {
                            videoFileOld.R = true;
                        } else {
                            HashMap hashMap = new HashMap();
                            VideoUrl videoUrl = VideoUrl.URL_240;
                            String str = attachDoc.l;
                            if (str != null) {
                                if (!myc0.f(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                                    VideoUrlStorage.d.b(hashMap, videoUrl, str);
                                }
                            }
                            VideoUrl videoUrl2 = VideoUrl.EXTERNAL_URL;
                            String str2 = attachDoc.l;
                            if (str2 != null) {
                                if (!myc0.f(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                                    VideoUrlStorage.d.b(hashMap, videoUrl2, str2);
                                }
                            }
                            videoFileOld.f = new VideoUrlStorage(hashMap);
                            videoFileOld.R = false;
                        }
                        videoFileOld.j0 = true;
                        videoFileOld.A0 = SystemClock.elapsedRealtime();
                        videoFileOld.b = attachDoc.d;
                        videoFileOld.c = (int) attachDoc.e;
                        videoFileOld.q = (int) (attachDoc.m / 1000);
                        videoFileOld.l = attachDoc.g;
                        videoFileOld.m0 = attachDoc.getWidth();
                        videoFileOld.n0 = attachDoc.getHeight();
                        videoFileOld.e = Integer.MAX_VALUE;
                        videoFileOld.z = true;
                        videoFile = videoFileOld;
                    } else {
                        boolean G7 = videoFile2.G7();
                        videoFile = videoFile2;
                        if (G7) {
                            videoFile = videoFile2;
                            if (attachDoc.l.length() > 0) {
                                VideoFileOld copy = videoFile2.copy();
                                HashMap hashMap2 = new HashMap(copy.f.b);
                                VideoUrl videoUrl3 = VideoUrl.URL_240;
                                String str3 = attachDoc.l;
                                if (str3 != null) {
                                    if (!myc0.f(str3)) {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        VideoUrlStorage.b bVar3 = VideoUrlStorage.c;
                                        VideoUrlStorage.d.b(hashMap2, videoUrl3, str3);
                                    }
                                }
                                copy.f = new VideoUrlStorage(hashMap2);
                                copy.R = false;
                                copy.A0 = SystemClock.elapsedRealtime();
                                videoFile = copy;
                            }
                        }
                    }
                    concurrentHashMap2.put(attachDoc, videoFile);
                    bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
                    return b.C1208b.a().e(videoFile, null);
                }
            }
        }
        return null;
    }
}
