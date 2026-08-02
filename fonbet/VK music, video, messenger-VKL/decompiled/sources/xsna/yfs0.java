package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoDiscoveryCatalogState.kt */
/* loaded from: classes7.dex */
public interface yfs0 {

    /* compiled from: VideoDiscoveryCatalogState.kt */
    public static final class a implements yfs0, pat0 {
        public final VideoFile a;
        public final VideoDiscoveryCatalogRepository$Section b;
        public final List<VideoDiscoveryCatalogRepository$Section> c;
        public final VideoRecommendationVideosType d;
        public final boolean e;
        public final String f;
        public final int g;

        /* compiled from: VideoDiscoveryCatalogState.kt */
        /* renamed from: xsna.yfs0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4100a extends FunctionReferenceImpl implements izs<Doc2DocItem, Boolean> {
            @Override // xsna.izs
            public final Boolean invoke(Doc2DocItem doc2DocItem) {
                return Boolean.valueOf(((a) this.receiver).j(doc2DocItem));
            }
        }

        public a(VideoFile videoFile, VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, List<VideoDiscoveryCatalogRepository$Section> list, VideoRecommendationVideosType videoRecommendationVideosType, boolean z, String str) {
            Collection collection;
            this.a = videoFile;
            this.b = videoDiscoveryCatalogRepository$Section;
            this.c = list;
            this.d = videoRecommendationVideosType;
            this.e = z;
            this.f = str;
            Integer g = i7o0.g((videoDiscoveryCatalogRepository$Section == null || (collection = videoDiscoveryCatalogRepository$Section.d) == null) ? EmptyList.b : collection, new C4100a(1, this, a.class, "isCurrentVideoItem", "isCurrentVideoItem(Lcom/vk/dto/video/Doc2DocItem;)Z", 0));
            this.g = g != null ? g.intValue() : -1;
        }

        public static a h(a aVar, VideoFile videoFile, VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, int i) {
            if ((i & 2) != 0) {
                videoDiscoveryCatalogRepository$Section = aVar.b;
            }
            List<VideoDiscoveryCatalogRepository$Section> list = aVar.c;
            VideoRecommendationVideosType videoRecommendationVideosType = aVar.d;
            boolean z = aVar.e;
            String str = aVar.f;
            aVar.getClass();
            return new a(videoFile, videoDiscoveryCatalogRepository$Section, list, videoRecommendationVideosType, z, str);
        }

        @Override // xsna.pat0
        public final pat0 b() {
            return null;
        }

        @Override // xsna.kat0
        public final a2s0 c() {
            List<VideoFile> list;
            VideoFile videoFile;
            Doc2DocItem.Video video = (Doc2DocItem.Video) j5g.k0(i());
            if (video == null || (list = video.b) == null || (videoFile = (VideoFile) j5g.a0(list)) == null) {
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
                VideoFile videoFile = (video == null || (list = video.b) == null) ? null : (VideoFile) j5g.a0(list);
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
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
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
                videoFile = (video == null || (list2 = video.b) == null) ? null : (VideoFile) j5g.a0(list2);
            }
            Doc2DocItem.Video video2 = (Doc2DocItem.Video) j5g.a0(i());
            videoFile = (video2 == null || (list = video2.b) == null) ? null : (VideoFile) j5g.a0(list);
            if (!rl3.y0(new VideoRecommendationVideosType[]{VideoRecommendationVideosType.SIMILAR_VIDEOS, VideoRecommendationVideosType.MUSIC_MIX}).contains(this.d)) {
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
            if (video == null || (list = video.b) == null || (videoFile = (VideoFile) j5g.a0(list)) == null) {
                return null;
            }
            return new a2s0(videoFile, VideoApplyNewVideoSourceType.Other);
        }

        @Override // xsna.pat0
        public final VideoRecommendationVideosType getType() {
            return this.d;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.b;
            int b = qoy.b((this.d.hashCode() + fw3.a((hashCode + (videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
            String str = this.f;
            return b + (str != null ? str.hashCode() : 0);
        }

        public final ArrayList i() {
            Iterable iterable;
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.b;
            if (videoDiscoveryCatalogRepository$Section == null || (iterable = videoDiscoveryCatalogRepository$Section.d) == null) {
                iterable = EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
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
            sb.append(", currentSection=");
            sb.append(this.b);
            sb.append(", sections=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", canShowAdBanner=");
            sb.append(this.e);
            sb.append(", vsId=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: VideoDiscoveryCatalogState.kt */
    public static final class b implements yfs0 {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Loading(previouslyLoadedState=" + this.a + ')';
        }
    }
}
