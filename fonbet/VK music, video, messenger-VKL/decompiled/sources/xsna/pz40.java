package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicPlaylistCoverGenerator.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz40 extends FunctionReferenceImpl implements izs<MusicTrack, Thumb> {
    public static final pz40 b = new pz40(1, MusicTrack.class, "getThumb", "getThumb()Lcom/vk/dto/music/Thumb;", 0);

    @Override // xsna.izs
    public final Thumb invoke(MusicTrack musicTrack) {
        return musicTrack.Jb();
    }
}
