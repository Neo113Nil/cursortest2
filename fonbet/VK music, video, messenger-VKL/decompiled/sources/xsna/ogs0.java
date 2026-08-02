package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xsna.luc;
import xsna.vfg0;
import xsna.wzd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ogs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ogs0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((com.vk.video.ui.discovery.minimizable.related_videos.c) obj2).e.invoke(new c.s0.j(i2, (rbt0) obj, VideoRelatedVideosPagingType.Playlist));
                break;
            default:
                dms0 dms0Var = (dms0) obj2;
                vfg0.a aVar = (vfg0.a) obj;
                if (aVar instanceof vfg0.a.c) {
                    bwd bwdVar = dms0Var.e;
                    File file = ((vfg0.a.c) aVar).a;
                    szd szdVar = bwdVar.e;
                    com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(i2, szdVar.o.a.c);
                    if (cVar != null) {
                        com.vk.clips.editor.state.model.c a = com.vk.clips.editor.state.model.c.a(cVar, file, 0L, 0L, cVar.a, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 524254);
                        List l = e43.l(new wzd.c(new zvd(i2, 0)), new wzd.a(luc.g.a, 1));
                        ArrayList arrayList = new ArrayList(i7o0.a(szdVar.o.a.c));
                        if (arrayList.size() > i2) {
                            arrayList.set(i2, a);
                            szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList, null, null, null, null, 123), j5g.V(l));
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
