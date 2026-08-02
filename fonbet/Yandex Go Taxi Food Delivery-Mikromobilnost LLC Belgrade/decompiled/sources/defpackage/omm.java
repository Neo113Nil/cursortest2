package defpackage;

import android.os.Looper;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* loaded from: classes10.dex */
public final class omm implements qmm {
    @Override // defpackage.qmm
    public final jmm acquireSession(mmm mmmVar, a aVar) {
        if (aVar.r == null) {
            return null;
        }
        return new aao(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // defpackage.qmm
    public final int getCryptoType(a aVar) {
        return aVar.r != null ? 1 : 0;
    }

    @Override // defpackage.qmm
    public final void setPlayer(Looper looper, vyc0 vyc0Var) {
    }
}
