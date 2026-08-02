package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.lyr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vat0 implements izs {
    public final /* synthetic */ yat0 b;
    public final /* synthetic */ VideoFile c;
    public final /* synthetic */ VideoRecommendationVideosType d;
    public final /* synthetic */ lyr0.a e;
    public final /* synthetic */ String f;

    public /* synthetic */ vat0(yat0 yat0Var, VideoFile videoFile, VideoRecommendationVideosType videoRecommendationVideosType, lyr0.a aVar, String str) {
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            AboutVideoItem aboutVideoItem = (AboutVideoItem) obj2;
            if (aboutVideoItem instanceof AboutVideoItem.SimilarVideoRedesign) {
                AboutVideoItem.SimilarVideoRedesign similarVideoRedesign = (AboutVideoItem.SimilarVideoRedesign) aboutVideoItem;
                if (!similarVideoRedesign.d && !similarVideoRedesign.c) {
                }
            }
            arrayList.add(obj2);
        }
        boolean isEmpty = arrayList.isEmpty();
        yat0 yat0Var = this.b;
        VideoFile videoFile = this.c;
        VideoRecommendationVideosType videoRecommendationVideosType = this.d;
        if (isEmpty) {
            AboutVideoItem.k kVar = AboutVideoItem.k.b;
            if (yat0Var.f) {
                kVar = null;
            }
            vfs0 vfs0Var = new vfs0();
            if (!gsi0.b().c) {
                vfs0Var = null;
            }
            yat0Var.i.getClass();
            if (videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE) {
                c1217b = AboutVideoItem.w.b.a.b;
            } else {
                String P = videoFile.P();
                c1217b = new AboutVideoItem.w.b.C1217b(P != null ? P : "");
            }
            return rl3.I(new hfz[]{kVar, vfs0Var, c1217b, gsi0.b().c ? new pfs0() : null});
        }
        lyr0.a aVar = this.e;
        if (!(aVar instanceof lyr0.a.b)) {
            String P2 = videoFile.P();
            AboutVideoItem.z zVar = new AboutVideoItem.z(P2 == null ? "" : P2, false, videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE, videoRecommendationVideosType == VideoRecommendationVideosType.SIMILAR_MUSIC, videoRecommendationVideosType == VideoRecommendationVideosType.MUSIC_MIX, (!bool.booleanValue() && yat0Var.d) || (!yat0Var.d && yat0Var.f), false);
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
            List I = rl3.I(new hfz[]{zVar, zgs0Var, vfs0Var2});
            yat0Var.i.getClass();
            return j5g.u0(e43.m(gsi0.b().c ? new pfs0() : null), j5g.u0(tat0.d(arrayList), I));
        }
        AboutVideoItem.k kVar2 = AboutVideoItem.k.b;
        if (yat0Var.f) {
            kVar2 = null;
        }
        lyr0.a.b bVar = (lyr0.a.b) aVar;
        AboutVideoItem.a aVar2 = new AboutVideoItem.a(bVar.a, bVar.b, Long.valueOf(videoFile.I0().b), Integer.valueOf(videoFile.o0()), this.f);
        String P3 = videoFile.P();
        AboutVideoItem.z zVar2 = new AboutVideoItem.z(P3 == null ? "" : P3, false, videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE, videoRecommendationVideosType == VideoRecommendationVideosType.SIMILAR_MUSIC, videoRecommendationVideosType == VideoRecommendationVideosType.MUSIC_MIX, true, true);
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
        List I2 = rl3.I(new hfz[]{kVar2, aVar2, zVar2, zgs0Var2, vfs0Var3});
        yat0Var.i.getClass();
        return j5g.u0(e43.m(gsi0.b().c ? new pfs0() : null), j5g.u0(tat0.d(arrayList), I2));
    }
}
