package xsna;

import com.vk.reefton.dto.ReefLocationSource;

/* compiled from: VkReefLocationDaemon.kt */
/* loaded from: classes5.dex */
public final class mfv0 implements unf0 {
    public final ezz a;

    public mfv0(ezz ezzVar) {
        this.a = ezzVar;
    }

    @Override // xsna.unf0
    public final void a(ReefLocationSource reefLocationSource, long j, long j2) {
        if (j <= 0 || reefLocationSource != ReefLocationSource.NETWORK) {
            return;
        }
        this.a.a(j, j2);
    }
}
