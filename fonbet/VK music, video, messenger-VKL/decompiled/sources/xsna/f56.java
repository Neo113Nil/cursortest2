package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;
import xsna.g56;
import xsna.to50;
import xsna.z1f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f56 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f56(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                g56 g56Var = (g56) this.c;
                g56Var.o.f8(((g56.a) this.d).a, (iag) this.e, g56Var);
                return s3q0.a;
            case 1:
                one.video.player.j jVar = (one.video.player.j) this.c;
                xk80 xk80Var = (xk80) this.d;
                one.video.player.tracks.c cVar = (one.video.player.tracks.c) this.e;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().n(xk80Var, cVar);
                }
                return s3q0.a;
            case 2:
                to50 to50Var = (to50) this.c;
                to50.d dVar = (to50.d) this.d;
                to50.d dVar2 = (to50.d) this.e;
                if (!to50Var.a(dVar.a, dVar.b)) {
                    return to50Var.b(dVar, dVar2, to50Var.a, to50Var.c);
                }
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return new to50.b(f, f, f, 15);
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                PhotoViewer.d(photoViewer, (ClippingImageView) this.d, (x6e0) this.e, null, new PhotoViewer.r(0, photoViewer, PhotoViewer.class, "onFinishScaleIn", "onFinishScaleIn()V", 0), 8);
                return s3q0.a;
            case 4:
                return z1f0.C((z1f0) this.c, (z1f0.a) this.d, (gzs) this.e);
            default:
                izs izsVar = (izs) this.c;
                ((wh50) this.e).setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                izsVar.invoke(this.d);
                return s3q0.a;
        }
    }
}
