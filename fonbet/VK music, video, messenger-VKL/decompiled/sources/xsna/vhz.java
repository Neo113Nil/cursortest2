package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.dialogs.BaseAnimationDialog;

/* compiled from: LiteInteractiveStateDelegate.kt */
/* loaded from: classes3.dex */
public final class vhz extends af6 {
    public final whz d;

    public vhz(whz whzVar) {
        super(whzVar);
        this.d = whzVar;
    }

    @Override // xsna.io2
    public final void C() {
        this.d.getView().setAlpha(1.0f);
        this.c = false;
    }

    @Override // xsna.io2
    public final void D0() {
        this.d.getView().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.io2
    public final void J() {
        this.d.getView().postDelayed(new jk9(this, 5), BaseAnimationDialog.d0);
    }

    @Override // xsna.io2
    public final void e0() {
        this.c = true;
    }
}
