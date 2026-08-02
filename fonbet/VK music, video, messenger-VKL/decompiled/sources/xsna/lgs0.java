package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoDiscoveryRecommendationsState.kt */
/* loaded from: classes7.dex */
public interface lgs0 {

    /* compiled from: VideoDiscoveryRecommendationsState.kt */
    public static final class a implements lgs0, pat0 {
        public final VideoFile a;
        public final List<Doc2DocItem> b;
        public final VideoRecommendationVideosType c;
        public final boolean d;
        public final String e;
        public final int f;

        /* compiled from: VideoDiscoveryRecommendationsState.kt */
        /* renamed from: xsna.lgs0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3267a extends FunctionReferenceImpl implements izs<Doc2DocItem, Boolean> {
            @Override // xsna.izs
            public final Boolean invoke(Doc2DocItem doc2DocItem) {
                return Boolean.valueOf(((a) this.receiver).j(doc2DocItem));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(VideoFile videoFile, List<? extends Doc2DocItem> list, VideoRecommendationVideosType videoRecommendationVideosType, boolean z, String str) {
            this.a = videoFile;
            this.b = list;
            this.c = videoRecommendationVideosType;
            this.d = z;
            this.e = str;
            Integer g = i7o0.g(list, new C3267a(1, this, a.class, "isCurrentVideoItem", "isCurrentVideoItem(Lcom/vk/dto/video/Doc2DocItem;)Z", 0));
            this.f = g != null ? g.intValue() : -1;
        }

        public static a h(a aVar, VideoFile videoFile) {
            List<Doc2DocItem> list = aVar.b;
            VideoRecommendationVideosType videoRecommendationVideosType = aVar.c;
            boolean z = aVar.d;
            String str = aVar.e;
            aVar.getClass();
            return new a(videoFile, list, videoRecommendationVideosType, z, str);
        }

        @Override // xsna.pat0
        public final pat0 b() {
            a2s0 f;
            VideoFile videoFile;
            if (this.c != VideoRecommendationVideosType.OFFLINE || (f = f()) == null || (videoFile = f.a) == null) {
                return null;
            }
            return h(this, videoFile);
        }

        @Override // xsna.kat0
        public final a2s0 c() {
            List<VideoFile> list;
            VideoFile videoFile;
            Doc2DocItem.Video video = (Doc2DocItem.Video) j5g.k0(i());
            if (video == null || (list = video.b) == null || (videoFile = (VideoFile) j5g.Y(list)) == null) {
                return null;
            }
            return new a2s0(videoFile, VideoApplyNewVideoSourceType.Other);
        }

        @Override // xsna.kat0
        public final a2s0 d() {
            List<VideoFile> list;
            Iterator it = i().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (j((Doc2DocItem) it.next())) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                Doc2DocItem.Video video = (Doc2DocItem.Video) j5g.b0(valueOf.intValue() - 1, i());
                VideoFile videoFile = (video == null || (list = video.b) == null) ? null : (VideoFile) j5g.Y(list);
                if (videoFile != null) {
                    return new a2s0(videoFile, VideoApplyNewVideoSourceType.Other);
                }
            }
            return null;
        }

        @Override // xsna.kat0
        public final VideoFile e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r0 != null) goto L33;
         */
        @Override // xsna.kat0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a2s0 f() {
            VideoFile videoFile;
            List<VideoFile> list;
            List<VideoFile> list2;
            Iterator it = i().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (j((Doc2DocItem) it.next())) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                Doc2DocItem.Video video = (Doc2DocItem.Video) j5g.b0(valueOf.intValue() + 1, i());
                videoFile = (video == null || (list2 = video.b) == null) ? null : (VideoFile) j5g.Y(list2);
            }
            Doc2DocItem.Video video2 = (Doc2DocItem.Video) j5g.a0(i());
            videoFile = (video2 == null || (list = video2.b) == null) ? null : (VideoFile) j5g.Y(list);
            if (!rl3.y0(new VideoRecommendationVideosType[]{VideoRecommendationVideosType.SIMILAR_VIDEOS, VideoRecommendationVideosType.SIMILAR_MUSIC, VideoRecommendationVideosType.MUSIC_MIX}).contains(this.c)) {
                videoFile = null;
            }
            if (videoFile != null) {
                return new a2s0(videoFile, VideoApplyNewVideoSourceType.Other);
            }
            return null;
        }

        @Override // xsna.kat0
        public final a2s0 g() {
            List<VideoFile> list;
            VideoFile videoFile;
            Doc2DocItem.Video video = (Doc2DocItem.Video) j5g.a0(i());
            if (video == null || (list = video.b) == null || (videoFile = (VideoFile) j5g.Y(list)) == null) {
                return null;
            }
            return new a2s0(videoFile, VideoApplyNewVideoSourceType.Other);
        }

        @Override // xsna.pat0
        public final VideoRecommendationVideosType getType() {
            return this.c;
        }

        public final int hashCode() {
            int b = qoy.b((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
            String str = this.e;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final ArrayList i() {
            List<Doc2DocItem> list = this.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Doc2DocItem.Video) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final boolean j(Doc2DocItem doc2DocItem) {
            List<VideoFile> list = doc2DocItem.b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (VideoFile videoFile : list) {
                int o0 = videoFile.o0();
                VideoFile videoFile2 = this.a;
                if (o0 == videoFile2.o0() && epx.f(videoFile.I0(), videoFile2.I0())) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(currentVideo=");
            sb.append(this.a);
            sb.append(", videos=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", canShowAdBanner=");
            sb.append(this.d);
            sb.append(", vsId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: VideoDiscoveryRecommendationsState.kt */
    public static final class b implements lgs0 {
        public static final b a = new b();
    }
}
