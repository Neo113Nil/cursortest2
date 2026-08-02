package xsna;

import android.os.Parcelable;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.hfr;

/* compiled from: AttachMatcher.kt */
/* loaded from: classes2.dex */
public final class m24 {
    public static AttachWithId a(List list, AttachWithId attachWithId) {
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        hfr.a aVar = new hfr.a(rli0.k(new i5g(list), attachWithId.getClass()));
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            if (((AttachWithId) next).getId() == attachWithId.getId()) {
                obj = next;
                break;
            }
        }
        return (AttachWithId) obj;
    }

    public static AttachDoc b(AttachDoc attachDoc, AttachDoc attachDoc2) {
        AttachDoc attachDoc3 = new AttachDoc(attachDoc2);
        attachDoc3.b = attachDoc.b;
        attachDoc3.p = attachDoc.p;
        attachDoc3.q = attachDoc.q;
        attachDoc3.r = attachDoc.r;
        attachDoc3.f = attachDoc.f;
        return attachDoc3;
    }

    public static AttachImage c(AttachImage attachImage, AttachImage attachImage2) {
        AttachImage attachImage3 = new AttachImage(attachImage2);
        attachImage3.b = attachImage.b;
        attachImage3.r = attachImage.r;
        attachImage3.l = attachImage.l;
        attachImage3.m = attachImage.m;
        attachImage3.u = attachImage.u;
        return attachImage3;
    }

    public static AttachVideo d(AttachVideo attachVideo, AttachVideo attachVideo2) {
        AttachVideo attachVideo3 = new AttachVideo(attachVideo2);
        attachVideo3.g = attachVideo.g;
        attachVideo3.f = attachVideo.f;
        attachVideo3.m = attachVideo.m;
        attachVideo3.o = attachVideo.o;
        attachVideo3.p = attachVideo.p;
        attachVideo3.e = Math.max(attachVideo.e, attachVideo2.e);
        VideoUrlStorage w9 = attachVideo3.b.w9();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        if (w9.Ab(videoUrl) == null || attachVideo3.b.Q0() || attachVideo3.b.s5()) {
            VideoFile videoFile = attachVideo3.b;
            HashMap hashMap = new HashMap(videoFile.w9().b);
            String Ab = attachVideo.b.w9().Ab(videoUrl);
            if (Ab != null) {
                if (!myc0.f(Ab)) {
                    Ab = null;
                }
                if (Ab != null) {
                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl, Ab);
                }
            }
            VideoUrl videoUrl2 = VideoUrl.URL_240;
            String Ab2 = attachVideo.b.w9().Ab(videoUrl2);
            if (Ab2 != null) {
                String str = myc0.f(Ab2) ? Ab2 : null;
                if (str != null) {
                    VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl2, str);
                }
            }
            videoFile.ua(new VideoUrlStorage(hashMap));
        }
        if (attachVideo.c.Jb() && attachVideo2.c.b.isEmpty()) {
            attachVideo3.c = attachVideo.c;
        }
        if (attachVideo.d.Jb() && attachVideo2.d.b.isEmpty()) {
            attachVideo3.d = attachVideo.d;
        }
        return attachVideo3;
    }

    public static AttachVideoMsg e(AttachVideoMsg attachVideoMsg, AttachVideoMsg attachVideoMsg2) {
        AttachVideoMsg attachVideoMsg3 = new AttachVideoMsg(attachVideoMsg2);
        attachVideoMsg3.i = attachVideoMsg.i;
        attachVideoMsg3.g = attachVideoMsg.g;
        attachVideoMsg3.h = attachVideoMsg.h;
        attachVideoMsg3.k = attachVideoMsg.k;
        attachVideoMsg3.l = attachVideoMsg.l;
        attachVideoMsg3.f = Math.max(attachVideoMsg.f, attachVideoMsg2.f);
        attachVideoMsg3.o = attachVideoMsg.o;
        VideoUrlStorage w9 = attachVideoMsg3.b.w9();
        VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
        if (w9.Ab(videoUrl) == null || attachVideoMsg3.b.Q0() || attachVideoMsg3.b.s5()) {
            VideoFile videoFile = attachVideoMsg3.b;
            HashMap hashMap = new HashMap(videoFile.w9().b);
            String Ab = attachVideoMsg.b.w9().Ab(videoUrl);
            if (Ab != null) {
                if (!myc0.f(Ab)) {
                    Ab = null;
                }
                if (Ab != null) {
                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl, Ab);
                }
            }
            VideoUrl videoUrl2 = VideoUrl.URL_240;
            String Ab2 = attachVideoMsg.b.w9().Ab(videoUrl2);
            if (Ab2 != null) {
                String str = myc0.f(Ab2) ? Ab2 : null;
                if (str != null) {
                    VideoUrlStorage.b bVar2 = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl2, str);
                }
            }
            videoFile.ua(new VideoUrlStorage(hashMap));
        }
        attachVideoMsg3.c = attachVideoMsg.c;
        if (attachVideoMsg.d.Jb() && attachVideoMsg2.d.b.isEmpty()) {
            attachVideoMsg3.d = attachVideoMsg.d;
        }
        if (attachVideoMsg.e.Jb() && attachVideoMsg2.e.b.isEmpty()) {
            attachVideoMsg3.e = attachVideoMsg.e;
        }
        return attachVideoMsg3;
    }

    public static AttachWall f(AttachWall attachWall, AttachWall attachWall2) {
        AttachWithId attachWithId;
        AttachWithId a;
        AttachWall attachWall3 = new AttachWall(attachWall2);
        attachWall3.b = attachWall.b;
        attachWall3.q = attachWall.q;
        List<Attach> list = attachWall.o;
        List<Attach> list2 = attachWall2.o;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Parcelable parcelable : list2) {
            if ((parcelable instanceof AttachWithId) && (a = a(list, (attachWithId = (AttachWithId) parcelable))) != null) {
                parcelable = a instanceof AttachImage ? c((AttachImage) a, (AttachImage) parcelable) : a instanceof AttachDoc ? b((AttachDoc) a, (AttachDoc) parcelable) : attachWithId;
            }
            arrayList.add(parcelable);
        }
        attachWall3.o = new ArrayList(arrayList);
        return attachWall3;
    }
}
