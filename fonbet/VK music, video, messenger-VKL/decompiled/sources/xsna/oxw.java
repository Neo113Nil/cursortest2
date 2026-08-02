package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoRendererException;

/* compiled from: InitDecoderErrorResolver.kt */
/* loaded from: classes2.dex */
public final class oxw implements owp {
    public boolean a;

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        OneVideoRendererException h;
        if (!this.a && (th instanceof OneVideoPlaybackException)) {
            OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) th;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.RENDERER && (h = oneVideoPlaybackException.h()) != null && h.l()) {
                this.a = true;
                return e43.l(b9l.a, l9g0.a);
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
        this.a = false;
    }
}
