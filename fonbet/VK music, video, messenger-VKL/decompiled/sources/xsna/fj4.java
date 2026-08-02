package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: AudioBookRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj4 extends FunctionReferenceImpl implements izs<sy40, ipw<dz40.d>> {
    @Override // xsna.izs
    public final ipw<dz40.d> invoke(sy40 sy40Var) {
        PlayerTrack playerTrack;
        MusicTrack musicTrack;
        sy40 sy40Var2 = sy40Var;
        oj4 oj4Var = (oj4) this.receiver;
        oj4Var.getClass();
        DownloadingState downloadingState = sy40Var2.n;
        if (!((Boolean) oj4Var.a.getValue()).booleanValue() || ((playerTrack = sy40Var2.d) != null && (musicTrack = playerTrack.b) != null && jnj.d(musicTrack.V))) {
            downloadingState = null;
        }
        return new ipw<>(izi0.m(downloadingState != null ? new dz40.d.e.a(downloadingState) : null, dz40.d.f.a, dz40.d.g.a, dz40.d.j.a));
    }
}
