package defpackage;

import androidx.media3.exoplayer.dash.DashManifestStaleException;

/* loaded from: classes10.dex */
public final class kgg implements tyy {
    public final /* synthetic */ ogg a;

    public void a() {
        long j;
        ogg oggVar = this.a;
        synchronized (u0a1.b) {
            try {
                j = u0a1.c ? u0a1.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        oggVar.g0 = j;
        oggVar.l(true);
    }

    @Override // defpackage.tyy
    public void b() {
        ogg oggVar = this.a;
        oggVar.T.b();
        DashManifestStaleException dashManifestStaleException = oggVar.V;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }
}
