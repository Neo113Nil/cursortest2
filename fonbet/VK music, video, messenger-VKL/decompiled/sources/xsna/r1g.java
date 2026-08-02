package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoScaleType;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.proto.PublisherConfiguration;
import xsna.q1g;
import xsna.zu50;

/* compiled from: CollageItemsViewer.kt */
/* loaded from: classes4.dex */
public final class r1g implements zu50.a {
    public final a a;
    public final b b;
    public final c c = new c();

    /* compiled from: CollageItemsViewer.kt */
    public interface a {
        Activity getActivity();

        MediaAdView o();

        e0g p();
    }

    /* compiled from: CollageItemsViewer.kt */
    public static final class c implements io2 {
        public FrameLayout b;

        @Override // xsna.io2
        public final void C() {
            cp2.b(this.b, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }

        @Override // xsna.io2
        public final void D0() {
            j6r0.d(this.b, 4, false, 50, null);
        }

        @Override // xsna.io2
        public final boolean G() {
            return false;
        }

        @Override // xsna.io2
        public final void J() {
            j6r0.d(this.b, 0, false, 50, null);
        }

        @Override // xsna.io2
        public final boolean M() {
            return false;
        }

        @Override // xsna.io2
        public final void e0() {
            cp2.d(this.b, 50L, null, null, 30);
        }

        @Override // xsna.io2
        public final boolean f0() {
            return false;
        }

        @Override // xsna.io2
        public final Rect g0() {
            FrameLayout frameLayout = this.b;
            return frameLayout != null ? bwt0.C(frameLayout) : new Rect();
        }

        @Override // xsna.io2
        public final VideoResizer.VideoFitType getContentScaleType() {
            return VideoResizer.VideoFitType.CROP;
        }

        @Override // xsna.io2
        public final float i0() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.io2
        public final Rect t0() {
            FrameLayout frameLayout = this.b;
            return frameLayout != null ? bwt0.C(frameLayout) : new Rect();
        }
    }

    public r1g(a aVar) {
        this.a = aVar;
        this.b = new b(aVar);
    }

    @Override // xsna.zu50.a
    public final boolean a(int i) {
        q1g.b bVar;
        a aVar = this.a;
        e0g p = aVar.p();
        MediaAdView o = aVar.o();
        Activity activity = aVar.getActivity();
        if (p != null) {
            ArrayList arrayList = p.a;
            if (o != null && activity != null) {
                String str = ((q1g) arrayList.get(i)).b;
                if ("image".equals(str)) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList) {
                        q1g q1gVar = (q1g) obj;
                        if (epx.f(q1gVar.b, "image") && q1gVar.c != null) {
                            arrayList3.add(obj);
                        }
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        kiw kiwVar = ((q1g) it.next()).c;
                        if (kiwVar != null) {
                            UserId userId = new UserId(0L);
                            UserId userId2 = new UserId(0L);
                            Serializer.c<Image> cVar = Image.CREATOR;
                            Photo photo = new Photo(0, 0, userId, userId2, 0, 0, 0, 0, 0, false, false, false, false, false, false, "", "", "", "", Image.b.c(kiwVar.a, kiwVar.b, kiwVar.c, ImageSizeKey.SIZE_KEY_UNDEFINED), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, false, 0, false, null, null, null, PhotoScaleType.TOP_CROP, Boolean.FALSE, null);
                            photo.y.b.set(0, new ImageSize(kiwVar.a, kiwVar.b, kiwVar.c, null, (char) 0, false, 56, null));
                            arrayList2.add(new PhotoAttachment(photo));
                        }
                    }
                    b bVar2 = this.b;
                    bVar2.b = arrayList3;
                    ImageViewer.f(myc0.d(), arrayList3.indexOf(arrayList.get(i)), arrayList2, activity, bVar2, null, null, null, false, null, false, 4080);
                    return true;
                }
                if ("video".equals(str) && (bVar = ((q1g) arrayList.get(i)).d) != null) {
                    ArrayList arrayList4 = bVar.b;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        if (epx.f(((q1g.a) obj2).a, "mp4")) {
                            arrayList5.add(obj2);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        q1g.a a2 = vcq.a(360, arrayList5);
                        if (a2 != null) {
                            hashMap.put("mp4_360", new VideoUrlInfo(a2.c, a2.b, false, false, true, true, ""));
                        }
                        q1g.a a3 = vcq.a(480, arrayList5);
                        if (a3 != null) {
                            hashMap.put("mp4_480", new VideoUrlInfo(a3.c, a3.b, false, false, true, true, ""));
                        }
                        q1g.a a4 = vcq.a(PublisherConfiguration.DEFAULT_MAX_RES, arrayList5);
                        if (a4 != null) {
                            hashMap.put("mp4_720", new VideoUrlInfo(a4.c, a4.b, false, false, true, true, ""));
                        }
                        q1g.a a5 = vcq.a(1080, arrayList5);
                        if (a5 != null) {
                            hashMap.put("mp4_1080", new VideoUrlInfo(a5.c, a5.b, false, false, true, true, ""));
                        }
                        VideoFileOld videoFileOld = new VideoFileOld();
                        videoFileOld.f = new VideoUrlStorage(hashMap);
                        videoFileOld.C = false;
                        videoFileOld.B = false;
                        videoFileOld.T = false;
                        videoFileOld.J = false;
                        videoFileOld.b2(VideoCanDownload.FILE);
                        FrameLayout a6 = o.getCollageView().a(i);
                        c cVar2 = this.c;
                        if (a6 != null) {
                            cVar2.b = a6;
                        } else {
                            cVar2.b = o;
                        }
                        ydt0.s(fxc0.B().Y(), activity, videoFileOld, cVar2, true, null, null, null, null, null, 16320);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* compiled from: CollageItemsViewer.kt */
    public static final class b implements ImageViewer.a {
        public final a a;
        public ArrayList b;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            MediaAdView o;
            a aVar = this.a;
            e0g p = aVar.p();
            if (p != null && (o = aVar.o()) != null) {
                ArrayList arrayList = this.b;
                q1g q1gVar = arrayList != null ? (q1g) arrayList.get(i) : null;
                Integer valueOf = q1gVar != null ? Integer.valueOf(p.a.indexOf(q1gVar)) : null;
                if (valueOf != null) {
                    return o.getCollageView().a(valueOf.intValue());
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                return Integer.valueOf(arrayList.size());
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
