package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import xsna.gx8;

/* compiled from: WebAppCore.kt */
/* loaded from: classes11.dex */
public final class lex0 implements gx8.a {
    public final CacheTarget b = CacheTarget.SYSTEM;

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return this.b;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        mgn0 mgn0Var = wgn0.a;
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        gnlVar.a().b();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "SuperappKitCommon";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}
