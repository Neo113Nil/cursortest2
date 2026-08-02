package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import xsna.odn;

/* compiled from: DisplayAudioBookChaptersFeature.kt */
/* loaded from: classes3.dex */
public final class mdn extends e.a {
    public final /* synthetic */ ndn b;

    public mdn(ndn ndnVar) {
        this.b = ndnVar;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        ndn ndnVar = this.b;
        ndnVar.T(new odn.e(ndnVar.U()));
    }
}
