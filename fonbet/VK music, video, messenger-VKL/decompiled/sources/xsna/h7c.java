package xsna;

import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class h7c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h7c(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                l7c.f((xw80) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                ((axq) this.e).b(this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                vc30.a((MovieActorsView$MovieActorsState) this.e, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(this.d | 1);
                com.vk.libvideo.design.compose.video.videocard.a.b((VideoCardViewState.Size) this.e, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }
}
