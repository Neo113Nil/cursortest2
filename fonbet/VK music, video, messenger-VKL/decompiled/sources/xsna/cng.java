package xsna;

import com.vk.dto.music.MusicTrack;
import xsna.ec40;

/* compiled from: CommonStoriesOpenBridge.kt */
/* loaded from: classes7.dex */
public final class cng implements ec40.a<MusicTrack> {
    public final /* synthetic */ rzl0 b;

    public cng(rzl0 rzl0Var) {
        this.b = rzl0Var;
    }

    @Override // xsna.ec40.a
    public final /* bridge */ /* synthetic */ boolean a(MusicTrack musicTrack) {
        return false;
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<MusicTrack> ec40Var) {
        this.b.invoke(Integer.valueOf(ec40Var.a));
        return Boolean.FALSE.booleanValue();
    }
}
