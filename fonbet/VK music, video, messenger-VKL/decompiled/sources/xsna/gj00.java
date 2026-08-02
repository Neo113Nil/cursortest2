package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;

/* compiled from: ManifestParsingResolver.kt */
/* loaded from: classes2.dex */
public final class gj00 implements owp {
    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        OneVideoPlaybackException oneVideoPlaybackException;
        OneVideoSourceException i;
        if (th instanceof OneVideoPlaybackException) {
            if (((m7qVar != null ? m7qVar.e : null) instanceof f9v) && (((i = (oneVideoPlaybackException = (OneVideoPlaybackException) th).i()) != null && i.h()) || oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED)) {
                return Collections.singletonList(new ova0(5000L));
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
    }
}
