package defpackage;

import com.yandex.urbanads.internal.divkit.video.UrbanAdsDivPlayerView;

/* loaded from: classes7.dex */
public final class gf21 implements q4l {
    public final /* synthetic */ UrbanAdsDivPlayerView a;

    public gf21(UrbanAdsDivPlayerView urbanAdsDivPlayerView) {
        this.a = urbanAdsDivPlayerView;
    }

    @Override // defpackage.q4l
    public final void b() {
    }

    @Override // defpackage.q4l
    public final void c() {
        ff21 ff21Var;
        UrbanAdsDivPlayerView urbanAdsDivPlayerView = this.a;
        if (urbanAdsDivPlayerView.hasWindowFocus()) {
            urbanAdsDivPlayerView.setKeepScreenOn(true);
            return;
        }
        ff21Var = urbanAdsDivPlayerView.attachedPlayer;
        if (ff21Var != null) {
            ff21Var.pause();
        }
    }

    @Override // defpackage.q4l
    public final void d(long j) {
    }

    @Override // defpackage.q4l
    public final void e() {
    }

    @Override // defpackage.q4l
    public final void f() {
    }

    @Override // defpackage.q4l
    public final void g() {
    }

    @Override // defpackage.q4l
    public final void onPause() {
        this.a.setKeepScreenOn(false);
    }
}
