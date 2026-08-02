package xsna;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.g;
import com.ironsource.C4498pe;
import com.ironsource.C4584ub;
import com.ironsource.O9;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.imageloader.view.VKImageView;
import com.vk.imageloader.view.VKOverlayImageView;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ir40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ir40(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                MusicPageInfoBlockNewVh musicPageInfoBlockNewVh = (MusicPageInfoBlockNewVh) this.c;
                LayerDrawable layerDrawable = (LayerDrawable) this.d;
                VKOverlayImageView vKOverlayImageView = (VKOverlayImageView) this.e;
                VKImageView vKImageView = musicPageInfoBlockNewVh.h;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                int height = (int) (vKImageView.getHeight() * 0.7f);
                layerDrawable.setLayerInset(1, 0, 0, 0, height);
                layerDrawable.setLayerInset(2, 0, height, 0, 0);
                vKOverlayImageView.setOverlay(layerDrawable);
                break;
            case 1:
                O9.a((C4498pe) this.c, (InitListener) this.d, (C4498pe) this.e);
                break;
            case 2:
                xop0 xop0Var = (xop0) this.c;
                com.google.firebase.perf.v1.i iVar = (com.google.firebase.perf.v1.i) this.d;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.e;
                g.b n = com.google.firebase.perf.v1.g.n();
                n.f(iVar);
                xop0Var.f(n, applicationProcessState);
                break;
            case 3:
                ((rhq0) this.c).e.c().i((FragmentActivity) this.d, (ExtendedUserProfile) this.e);
                break;
            case 4:
                com.vungle.ads.internal.load.i.a((com.vungle.ads.internal.load.j) this.c, (com.vungle.ads.internal.model.i3) this.d, (com.vungle.ads.internal.network.o) this.e);
                break;
            default:
                C4584ub.b((Context) this.c, (LevelPlayInitRequest) this.d, (LevelPlayInitListener) this.e);
                break;
        }
    }
}
