package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import xsna.q5b0;

/* compiled from: PlayerWithAdControlsView.kt */
/* loaded from: classes16.dex */
public final class o5b0 implements OneVideoAdBaseControls.a {
    public final /* synthetic */ q5b0.a a;
    public final /* synthetic */ kzr0 b;
    public final /* synthetic */ ConstraintLayout c;

    public o5b0(q5b0.a aVar, kzr0 kzr0Var, ConstraintLayout constraintLayout) {
        this.a = aVar;
        this.b = kzr0Var;
        this.c = constraintLayout;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
    public final void a(boolean z) {
        this.a.a.a(z);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
    public final void b() {
        this.a.a.c(this.b.b);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
    public final void c() {
        OneVideoAdBaseControls oneVideoAdBaseControls = (OneVideoAdBaseControls) this.c;
        OneVideoAdBaseControls.c state = oneVideoAdBaseControls.getState();
        OneVideoAdBaseControls.SoundState soundState = state.b;
        OneVideoAdBaseControls.SoundState soundState2 = OneVideoAdBaseControls.SoundState.ON;
        q5b0.a aVar = this.a;
        if (soundState == soundState2) {
            oneVideoAdBaseControls.setState(OneVideoAdBaseControls.c.a(state, OneVideoAdBaseControls.SoundState.OFF, 0, 0, 29));
            aVar.a.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            oneVideoAdBaseControls.setState(OneVideoAdBaseControls.c.a(state, soundState2, 0, 0, 29));
            aVar.a.g(1.0f);
        }
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
    public final void d() {
        this.a.a.h(this.b);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.a
    public final void e() {
    }
}
