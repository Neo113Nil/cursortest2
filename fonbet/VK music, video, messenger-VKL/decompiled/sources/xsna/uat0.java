package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.lyr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uat0 implements izs {
    public final /* synthetic */ yat0 b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ VideoRecommendationVideosType d;
    public final /* synthetic */ lyr0.a e;
    public final /* synthetic */ String f;

    public /* synthetic */ uat0(yat0 yat0Var, VideoFile videoFile, VideoRecommendationVideosType videoRecommendationVideosType, lyr0.a aVar, String str) {
        this.b = yat0Var;
        this.c = videoFile;
        this.d = videoRecommendationVideosType;
        this.e = aVar;
        this.f = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hfz c1217b;
        Pair pair = (Pair) obj;
        List list = (List) pair.d();
        Boolean bool = (Boolean) pair.g();
        tat0 tat0Var = this.b.i;
        tat0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AboutVideoItem aboutVideoItem = (AboutVideoItem) next;
            if (aboutVideoItem instanceof AboutVideoItem.SimilarVideoRedesign) {
                AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) aboutVideoItem;
                boolean z2 = similarVideoRedesign.d;
                noj0 noj0Var = similarVideoRedesign.b;
                boolean z3 = z2 || tat0Var.d.contains(noj0Var.a.r1());
                if (!similarVideoRedesign.c && !tat0Var.c.contains(noj0Var.a.r1())) {
                    z = false;
                }
                if (!z3 && !z) {
                }
            }
            arrayList.add(next);
        }
        boolean isEmpty = arrayList.isEmpty();
        VideoFile videoFile = this.c;
        VideoRecommendationVideosType videoRecommendationVideosType = this.d;
        if (isEmpty) {
            AboutVideoItem.k kVar = AboutVideoItem.k.b;
            if (com.vk.toggle.d.u().e) {
                kVar = null;
            }
            vfs0 vfs0Var = new vfs0();
            if (!gsi0.b().c) {
                vfs0Var = null;
            }
            if (videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE) {
                c1217b = AboutVideoItem.w.b.a.b;
            } else {
                String P = videoFile.P();
                c1217b = new AboutVideoItem.w.b.C1217b(P != null ? P : "");
            }
            return rl3.I(new hfz[]{kVar, vfs0Var, c1217b, gsi0.b().c ? new pfs0() : null});
        }
        lyr0.a aVar = this.e;
        if (aVar instanceof lyr0.a.b) {
            lyr0.a.b bVar = (lyr0.a.b) aVar;
            AboutVideoItem.k kVar2 = AboutVideoItem.k.b;
            if (com.vk.toggle.d.u().e) {
                kVar2 = null;
            }
            AboutVideoItem.a aVar2 = new AboutVideoItem.a(bVar.a, bVar.b, Long.valueOf(videoFile.I0().b), Integer.valueOf(videoFile.o0()), this.f);
            String P2 = videoFile.P();
            AboutVideoItem.z zVar = new AboutVideoItem.z(P2 == null ? "" : P2, false, videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE, videoRecommendationVideosType == VideoRecommendationVideosType.SIMILAR_MUSIC, videoRecommendationVideosType == VideoRecommendationVideosType.MUSIC_MIX, true, true);
            if (gsi0.b().c) {
                zVar = null;
            }
            zgs0 zgs0Var = new zgs0();
            if (!gsi0.b().c) {
                zgs0Var = null;
            }
            vfs0 vfs0Var2 = new vfs0();
            if (!gsi0.b().c) {
                vfs0Var2 = null;
            }
            return j5g.u0(e43.m(gsi0.b().c ? new pfs0() : null), j5g.u0(tat0.d(arrayList), rl3.I(new hfz[]{kVar2, aVar2, zVar, zgs0Var, vfs0Var2})));
        }
        boolean booleanValue = bool.booleanValue();
        boolean z4 = tat0Var.b;
        boolean z5 = (!booleanValue && z4) || (!z4 && com.vk.toggle.d.u().e);
        String P3 = videoFile.P();
        AboutVideoItem.z zVar2 = new AboutVideoItem.z(P3 == null ? "" : P3, false, videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE, videoRecommendationVideosType == VideoRecommendationVideosType.SIMILAR_MUSIC, videoRecommendationVideosType == VideoRecommendationVideosType.MUSIC_MIX, z5, false);
        if (gsi0.b().c) {
            zVar2 = null;
        }
        zgs0 zgs0Var2 = new zgs0();
        if (!gsi0.b().c) {
            zgs0Var2 = null;
        }
        vfs0 vfs0Var3 = new vfs0();
        if (!gsi0.b().c) {
            vfs0Var3 = null;
        }
        return j5g.u0(e43.m(gsi0.b().c ? new pfs0() : null), j5g.u0(tat0.d(arrayList), rl3.I(new hfz[]{zVar2, zgs0Var2, vfs0Var3})));
    }
}
