package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.ResponseInfo;

/* compiled from: ErrorInvalidCodeResolver.kt */
/* loaded from: classes2.dex */
public final class cwp implements owp {
    public boolean a;

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        OneVideoSourceException i;
        OneVideoSourceException.a g;
        OneVideoSourceException.a g2;
        ResponseInfo responseInfo = null;
        OneVideoPlaybackException oneVideoPlaybackException = th instanceof OneVideoPlaybackException ? (OneVideoPlaybackException) th : null;
        if (oneVideoPlaybackException == null) {
            return EmptyList.b;
        }
        if (!this.a) {
            OneVideoSourceException i2 = oneVideoPlaybackException.i();
            if (i2 != null && (g2 = i2.g()) != null) {
                responseInfo = g2.d;
            }
            if ((responseInfo != null && responseInfo.h()) || (responseInfo == null && (i = oneVideoPlaybackException.i()) != null && (g = i.g()) != null && g.a == 400)) {
                this.a = true;
                return Collections.singletonList(l9g0.a);
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
        this.a = false;
    }
}
