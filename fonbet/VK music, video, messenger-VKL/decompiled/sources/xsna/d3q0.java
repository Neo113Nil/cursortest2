package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: UnexpectedErrorResolver.kt */
/* loaded from: classes2.dex */
public final class d3q0 implements owp {
    public boolean a;

    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        if (this.a || !(th instanceof OneVideoPlaybackException) || ((OneVideoPlaybackException) th).j() != OneVideoPlaybackException.Type.UNEXPECTED) {
            return EmptyList.b;
        }
        this.a = true;
        return Collections.singletonList(l9g0.a);
    }

    @Override // xsna.owp
    public final void reset() {
        this.a = false;
    }
}
