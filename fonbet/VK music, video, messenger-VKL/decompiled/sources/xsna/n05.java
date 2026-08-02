package xsna;

import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;

/* compiled from: AudiobookChapterItems.kt */
/* loaded from: classes3.dex */
public final class n05 extends mab0<hlb> {
    public n05() {
        throw null;
    }

    @Override // xsna.mab0
    public final PlaylistScreenContentType a(int i) {
        return PlaylistScreenContentType.TRACK_ITEM;
    }

    @Override // xsna.mab0
    public final Object b(int i) {
        return ((hlb) this.a.get(i)).a.b;
    }
}
