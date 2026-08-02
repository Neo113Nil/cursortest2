package xsna;

import com.vk.music.player.LoopMode;

/* compiled from: MusicPlayerAttributeProviderImpl.kt */
/* loaded from: classes3.dex */
public final class wv40 implements vv40 {
    public final com.vk.music.pref.a a;

    public wv40(com.vk.music.pref.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.vv40
    public final LoopMode a() {
        return this.a.n0();
    }

    @Override // xsna.vv40
    public final boolean c() {
        return this.a.M();
    }
}
