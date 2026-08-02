package xsna;

import android.os.Parcelable;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: PodcastRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class vib0 extends FunctionReferenceImpl implements izs<sy40, ipw<dz40.d>> {
    @Override // xsna.izs
    public final ipw<dz40.d> invoke(sy40 sy40Var) {
        PlaybackLaunchMeta playbackLaunchMeta;
        ((djb0) this.receiver).getClass();
        PlayerTrack playerTrack = sy40Var.d;
        dz40.d.i iVar = null;
        Parcelable parcelable = (playerTrack == null || (playbackLaunchMeta = playerTrack.c) == null) ? null : playbackLaunchMeta.e;
        PlaySourceMeta.a aVar = parcelable instanceof PlaySourceMeta.a ? (PlaySourceMeta.a) parcelable : null;
        dz40.d.i iVar2 = dz40.d.i.a;
        if (aVar != null && aVar.p7()) {
            iVar = iVar2;
        }
        return new ipw<>(izi0.m(iVar, dz40.d.h.a, dz40.d.j.a));
    }
}
