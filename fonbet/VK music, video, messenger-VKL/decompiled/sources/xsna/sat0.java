package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: VideoRecommendationsEventProcessor.kt */
/* loaded from: classes7.dex */
public final class sat0 {
    public final l5o a;
    public final LinkedHashSet b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public sat0(l5o l5oVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3) {
        this.a = l5oVar;
        this.b = linkedHashSet;
        this.c = linkedHashSet2;
        this.d = linkedHashSet3;
    }

    public final List<AboutVideoItem.SimilarVideoRedesign> a(VideoFile videoFile, LinkedHashMap<String, AboutVideoItem.SimilarVideoRedesign> linkedHashMap, boolean z) {
        AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = linkedHashMap.get(videoFile.r1());
        if (similarVideoRedesign != null) {
            linkedHashMap.put(videoFile.r1(), AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign, null, z, false, 125));
            LinkedHashSet linkedHashSet = this.b;
            if (z) {
                linkedHashSet.add(videoFile.r1());
            } else {
                linkedHashSet.remove(videoFile.r1());
            }
        }
        return j5g.O0(linkedHashMap.values());
    }

    public final List b(long j, LinkedHashMap linkedHashMap) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        for (AboutVideoItem.SimilarVideoRedesign similarVideoRedesign : linkedHashMap.values()) {
            if (similarVideoRedesign.b.a.I0().b == j) {
                linkedHashSet.add(similarVideoRedesign.b.a.r1());
            }
        }
        for (String str : linkedHashSet) {
            AboutVideoItem.SimilarVideoRedesign similarVideoRedesign2 = (AboutVideoItem.SimilarVideoRedesign) linkedHashMap.get(str);
            if (similarVideoRedesign2 != null) {
                linkedHashMap.put(str, AboutVideoItem.SimilarVideoRedesign.a(similarVideoRedesign2, null, false, false, 123));
                this.c.remove(str);
            }
        }
        return j5g.O0(linkedHashMap.values());
    }
}
