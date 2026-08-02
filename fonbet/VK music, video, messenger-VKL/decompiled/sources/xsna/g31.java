package xsna;

import android.view.View;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.music.haptic.MusicHapticEvent;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g31 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g31(View view, izs izsVar, boolean z) {
        this.d = view;
        this.e = izsVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AdvertBannerView advertBannerView;
        switch (this.b) {
            case 0:
                h31 h31Var = (h31) this.d;
                i31 i31Var = (i31) this.e;
                if (this.c) {
                    h31Var.getClass();
                    VideoMinimizableState P0 = rts0.b.a().P0();
                    if ((com.vk.libvideo.api.minimizable.a.k(P0) || (P0 instanceof VideoMinimizableState.FullscreenHorizontal)) && (advertBannerView = h31Var.f) != null) {
                        advertBannerView.post(new o31(advertBannerView, !i31Var.b || h31Var.d));
                    }
                }
                break;
            default:
                View view = (View) this.d;
                izs izsVar = (izs) this.e;
                cl40.a(view, MusicHapticEvent.LIGHT);
                izsVar.invoke(new sx40.b.i(this.c));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ g31(boolean z, h31 h31Var, i31 i31Var) {
        this.c = z;
        this.d = h31Var;
        this.e = i31Var;
    }
}
