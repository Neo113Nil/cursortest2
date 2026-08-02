package xsna;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: SourceErrorResolver.kt */
/* loaded from: classes2.dex */
public final class egk0 implements owp {
    @Override // xsna.owp
    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        if (m7qVar == null) {
            return EmptyList.b;
        }
        sht0 sht0Var = m7qVar.e;
        if (jgz.e(m7qVar) instanceof mv70) {
            return EmptyList.b;
        }
        String a = cqm0.a(m7qVar.f);
        if (a == null) {
            return EmptyList.b;
        }
        if ((th instanceof OneVideoPlaybackException) && ((OneVideoPlaybackException) th).j() == OneVideoPlaybackException.Type.SOURCE && !drm0.D(sht0Var.b.toString(), a, false)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                return Collections.singletonList(new unn0(m7q.a(m7qVar, sht0Var.d(a), null, null, 0, false, false, null, j, null, null, false, 133955567)));
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.owp
    public final void reset() {
    }
}
