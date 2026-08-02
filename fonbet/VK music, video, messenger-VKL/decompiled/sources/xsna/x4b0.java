package xsna;

import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;

/* compiled from: Effects.kt */
/* loaded from: classes7.dex */
public final class x4b0 implements kgn {
    public final /* synthetic */ TransformController a;
    public final /* synthetic */ OneVideoPlayer b;

    public x4b0(TransformController transformController, OneVideoPlayer oneVideoPlayer) {
        this.a = transformController;
        this.b = oneVideoPlayer;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.e(null);
        this.b.j0(null);
    }
}
