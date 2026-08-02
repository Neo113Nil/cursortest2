package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class gvy0 extends xey0 {
    public final ArrayList U;
    public final ArrayList V;
    public b1z0 W;
    public cwm X;
    public String Y;
    public kiw Z;
    public String a0;
    public String b0;
    public String c0;
    public oez0 d0;
    public ejb0 e0;
    public y5z0 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public int u0;

    public gvy0(giy0 giy0Var, nl nlVar) {
        super(giy0Var, nlVar, null);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = null;
        this.X = null;
        this.a0 = "Close";
        this.b0 = "Replay";
        this.c0 = "Ad can be skipped after %ds";
        this.g0 = false;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.l0 = true;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = true;
        this.q0 = 10.0f;
        this.r0 = 5.0f;
        this.s0 = -1.0f;
        this.t0 = -1.0f;
        this.u0 = 0;
    }

    @Override // xsna.xey0
    public final String l() {
        oez0 oez0Var = this.d0;
        return oez0Var != null ? oez0Var.b : this.K;
    }

    public final void s(float f) {
        this.s0 = f;
    }

    public final float t() {
        return this.s0;
    }

    public final float u() {
        return this.t0;
    }

    public final String v() {
        int i = this.u0;
        String a = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? lhg.a(i, "mediaSectionType-") : "pauseroll" : "postroll" : "midroll" : "preroll" : "standalone";
        if (this.s0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return a;
        }
        StringBuilder b = ho8.b(a, " point=");
        b.append(this.s0);
        return b.toString();
    }
}
