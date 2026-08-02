package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class aao implements jmm {
    public final DrmSession$DrmSessionException a;

    public aao(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.jmm
    public final boolean a() {
        return false;
    }

    @Override // defpackage.jmm
    public final rcf b() {
        return null;
    }

    @Override // defpackage.jmm
    public final Map d() {
        return null;
    }

    @Override // defpackage.jmm
    public final void e(mmm mmmVar) {
    }

    @Override // defpackage.jmm
    public final UUID f() {
        return b87.a;
    }

    @Override // defpackage.jmm
    public final byte[] g() {
        return null;
    }

    @Override // defpackage.jmm
    public final DrmSession$DrmSessionException getError() {
        return this.a;
    }

    @Override // defpackage.jmm
    public final int getState() {
        return 1;
    }

    @Override // defpackage.jmm
    public final void h(mmm mmmVar) {
    }

    @Override // defpackage.jmm
    public final boolean i(String str) {
        return false;
    }
}
