package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import java.util.LinkedHashSet;

/* compiled from: VideoRecommendationsLoader.kt */
/* loaded from: classes7.dex */
public final class yat0 {
    public final u9t0 a;
    public final lyr0 b;
    public final l5o c;
    public final boolean d;
    public final LinkedHashSet e;
    public final boolean f;
    public final io.reactivex.rxjava3.subjects.d<s3q0> g;
    public final io.reactivex.rxjava3.subjects.d<String> h;
    public final tat0 i;
    public final sat0 j;

    /* compiled from: VideoRecommendationsLoader.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoDiscoveryCatalogRepository$Section.SectionType.values().length];
            try {
                iArr[VideoDiscoveryCatalogRepository$Section.SectionType.Similar.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoDiscoveryCatalogRepository$Section.SectionType.ForYou.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoDiscoveryCatalogRepository$Section.SectionType.Author.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoDiscoveryCatalogRepository$Section.SectionType.ContinueWatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AboutVideoItem.SimilarVideoRedesign.Style.values().length];
            try {
                iArr2[AboutVideoItem.SimilarVideoRedesign.Style.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AboutVideoItem.SimilarVideoRedesign.Style.COMPACT_NO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AboutVideoItem.SimilarVideoRedesign.Style.COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public yat0(u9t0 u9t0Var, lyr0 lyr0Var, l5o l5oVar, boolean z) {
        this.a = u9t0Var;
        this.b = lyr0Var;
        this.c = l5oVar;
        this.d = z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.e = linkedHashSet;
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        this.f = com.vk.toggle.b.A.a(videoFeatures);
        this.g = io.reactivex.rxjava3.subjects.d.O0(s3q0.a);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.h = io.reactivex.rxjava3.subjects.d.O0("");
        this.i = new tat0(l5oVar, z, linkedHashSet2, linkedHashSet3, linkedHashSet);
        this.j = new sat0(l5oVar, linkedHashSet2, linkedHashSet3, linkedHashSet);
    }
}
