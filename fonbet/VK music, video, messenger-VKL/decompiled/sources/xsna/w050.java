package xsna;

import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;

/* compiled from: MusicPlaylistItems.kt */
/* loaded from: classes3.dex */
public final class w050 extends mab0<lab0> {
    @Override // xsna.mab0
    public final PlaylistScreenContentType a(int i) {
        return ((lab0) this.a.get(i)).getContentType();
    }

    @Override // xsna.mab0
    public final Object b(int i) {
        return ((lab0) this.a.get(i)).getKey();
    }
}
