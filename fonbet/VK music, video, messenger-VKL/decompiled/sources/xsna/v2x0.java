package xsna;

import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.VoipHintsLauncher;

/* compiled from: VoipUIDependencies.kt */
/* loaded from: classes7.dex */
public final class v2x0 {
    public final e1w0 a;
    public final c2f0 b;
    public final d1w0 c;
    public final lmc d;
    public final fq4 e;
    public final bbv f;
    public final a g;

    /* compiled from: VoipUIDependencies.kt */
    public static final class a {
        public final m570 a;
        public final qr2 b;
        public final com.vk.voip.call_effects.a c;
        public final vpn0 d;

        public a(m570 m570Var, qr2 qr2Var, com.vk.voip.call_effects.a aVar, vpn0 vpn0Var) {
            this.a = m570Var;
            this.b = qr2Var;
            this.c = aVar;
            this.d = vpn0Var;
        }

        public final CallEffectsDependency a() {
            return this.c;
        }

        public final l570 b() {
            return this.a;
        }
    }

    public v2x0(e1w0 e1w0Var, c2f0 c2f0Var, d1w0 d1w0Var, lmc lmcVar, fq4 fq4Var, bbv bbvVar, a aVar) {
        this.a = e1w0Var;
        this.b = c2f0Var;
        this.c = d1w0Var;
        this.d = lmcVar;
        this.e = fq4Var;
        this.f = bbvVar;
        this.g = aVar;
    }

    public final a a() {
        return this.g;
    }

    public final c2f0 b() {
        return this.b;
    }

    public final VoipHintsLauncher c() {
        return this.a;
    }

    public final fq4 d() {
        return this.e;
    }
}
