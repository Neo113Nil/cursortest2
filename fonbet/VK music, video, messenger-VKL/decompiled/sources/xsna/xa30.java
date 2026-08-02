package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import xsna.aa30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xa30 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xa30(za30 za30Var, vmp0 vmp0Var, boolean z) {
        this.d = za30Var;
        this.e = vmp0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        aa30 bVar;
        switch (this.b) {
            case 0:
                za30 za30Var = (za30) this.d;
                vmp0 vmp0Var = (vmp0) this.e;
                float floatValue = ((Float) obj).floatValue();
                if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    bVar = new aa30.a(vmp0Var.a.b);
                } else if (floatValue == 1.0f) {
                    bVar = new aa30.a(vmp0Var.a.c);
                } else {
                    ei eiVar = vmp0Var.a;
                    bVar = new aa30.b(eiVar, floatValue, this.c ? eiVar.c : eiVar.b, 4);
                }
                za30Var.c(bVar);
                return s3q0.a;
            default:
                return ((io.reactivex.rxjava3.core.g) obj).g(new bx80(new vi6(this.c, (VideoAutoPlay) this.d, (VideoFile) this.e), 14), Integer.MAX_VALUE);
        }
    }

    public /* synthetic */ xa30(boolean z, VideoAutoPlay videoAutoPlay, VideoFile videoFile) {
        this.c = z;
        this.d = videoAutoPlay;
        this.e = videoFile;
    }
}
