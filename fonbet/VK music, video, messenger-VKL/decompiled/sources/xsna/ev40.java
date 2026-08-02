package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicPlaybackAnalyticsTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class ev40 implements dv40 {
    public final Object a;

    public ev40(du70 du70Var) {
        this.a = msy.a(LazyThreadSafetyMode.NONE, new pvh(du70Var, 24));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dv40
    public final void a(iwa0 iwa0Var, boolean z) {
        MusicTrack musicTrack = iwa0Var.b.b.a;
        if ((musicTrack.Tb() && !iwa0Var.m) || musicTrack.Wb() || musicTrack.Vb() || musicTrack.Mb()) {
            zj40 zj40Var = new zj40(iwa0Var.c.a, SchemeStat$TypeAction.a.b(null, null, ((hs90) this.a.getValue()).a(iwa0Var), 3));
            zj40Var.c = z;
            zj40Var.q();
        }
    }
}
