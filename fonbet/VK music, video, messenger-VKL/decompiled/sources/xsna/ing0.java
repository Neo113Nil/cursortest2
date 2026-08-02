package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.media.player.video.view.SimpleVideoView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ing0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ing0(float f, jng0 jng0Var) {
        this.c = f;
        this.d = jng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                jng0 jng0Var = (jng0) this.d;
                float f = this.c;
                float f2 = 1.0f;
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 1.0f) {
                    f2 = (f * 0.1f) + 1;
                }
                float f3 = f2;
                if (jng0Var.d >= 4) {
                    jng0Var.d = 0;
                }
                jng0Var.a.play(jng0Var.c[jng0Var.d], 1.0f, 1.0f, 0, 0, f3);
                jng0Var.d++;
                break;
            default:
                SimpleVideoView.f((SimpleVideoView) this.d, this.c);
                break;
        }
    }

    public /* synthetic */ ing0(SimpleVideoView simpleVideoView, float f) {
        this.d = simpleVideoView;
        this.c = f;
    }
}
