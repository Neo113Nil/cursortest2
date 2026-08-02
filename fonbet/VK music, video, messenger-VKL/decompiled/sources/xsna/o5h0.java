package xsna;

import java.util.EnumSet;
import one.video.player.OneVideoPlayer;

/* compiled from: ScenarioProvider.kt */
/* loaded from: classes8.dex */
public final class o5h0 {
    public static final EnumSet<OneVideoPlayer.State> e = EnumSet.of(OneVideoPlayer.State.PLAYING, OneVideoPlayer.State.PAUSED);
    public final n5h0 a;
    public axp b;
    public m5h0<?> c;
    public OneVideoPlayer.State d = OneVideoPlayer.State.IDLE;

    public o5h0(xds0 xds0Var, mwp mwpVar) {
        this.a = new n5h0(xds0Var, mwpVar);
    }
}
