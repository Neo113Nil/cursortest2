package xsna;

import android.content.Context;
import com.vk.libdelayedjobs.WorkPolicy;
import java.util.concurrent.TimeUnit;
import xsna.k840;

/* compiled from: MusicOfflineSyncInteractorImpl.kt */
/* loaded from: classes.dex */
public final class yq40 {
    public final Context a;
    public final up40 b;
    public final dq40 c;
    public final qgp0 d;
    public final bpn0 e = new bpn0(new ho4(this, 1));

    public yq40(Context context, vp40 vp40Var, dq40 dq40Var, qgp0 qgp0Var) {
        this.a = context;
        this.b = vp40Var;
        this.c = dq40Var;
        this.d = qgp0Var;
    }

    public final zq40 a() {
        return (zq40) this.e.getValue();
    }

    public final void b(boolean z) {
        long j = k840.b.d.a() ? 15L : 1440L;
        WorkPolicy workPolicy = z ? WorkPolicy.REPLACE : WorkPolicy.KEEP;
        uh uhVar = uh.b;
        ((xsl) uhVar.b()).e("AudioConfigInfoSyncJob", new em4(new fyx()), new lx90(j, TimeUnit.MINUTES, usl.a(usl.h, workPolicy, 250)));
        ((xsl) uhVar.b()).c("AudioRestrictionInfoSyncJob");
    }

    public final void c(boolean z) {
        ((xsl) uh.b.b()).e("MusicRestrictionsSyncJob", new u450(new fyx()), new lx90(k840.b.e.a() ? 15L : 120L, TimeUnit.MINUTES, usl.a(usl.h, z ? WorkPolicy.REPLACE : WorkPolicy.KEEP, 250)));
    }
}
