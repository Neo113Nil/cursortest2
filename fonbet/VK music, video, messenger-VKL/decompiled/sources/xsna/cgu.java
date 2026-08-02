package xsna;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.state.State;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: GridReference.java */
/* loaded from: classes11.dex */
public final class cgu extends androidx.constraintlayout.core.state.c {
    public String A0;
    public int B0;
    public jfu n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public float v0;
    public float w0;
    public String x0;
    public String y0;
    public String z0;

    public cgu(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        if (helper == State.Helper.ROW) {
            this.t0 = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.u0 = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, xsna.dpf0
    public final void apply() {
        s();
        jfu jfuVar = this.n0;
        int i = this.s0;
        jfuVar.getClass();
        if ((i == 0 || i == 1) && jfuVar.V0 != i) {
            jfuVar.V0 = i;
        }
        int i2 = this.t0;
        if (i2 != 0) {
            jfu jfuVar2 = this.n0;
            if (i2 > 50) {
                jfuVar2.getClass();
            } else if (jfuVar2.M0 != i2) {
                jfuVar2.M0 = i2;
                jfuVar2.m0();
                jfuVar2.i0();
            }
        }
        int i3 = this.u0;
        if (i3 != 0) {
            jfu jfuVar3 = this.n0;
            if (i3 > 50) {
                jfuVar3.getClass();
            } else if (jfuVar3.O0 != i3) {
                jfuVar3.O0 = i3;
                jfuVar3.m0();
                jfuVar3.i0();
            }
        }
        float f = this.v0;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            jfu jfuVar4 = this.n0;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jfuVar4.getClass();
            } else if (jfuVar4.P0 != f) {
                jfuVar4.P0 = f;
            }
        }
        float f2 = this.w0;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            jfu jfuVar5 = this.n0;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jfuVar5.getClass();
            } else if (jfuVar5.Q0 != f2) {
                jfuVar5.Q0 = f2;
            }
        }
        String str = this.x0;
        if (str != null && !str.isEmpty()) {
            jfu jfuVar6 = this.n0;
            String str2 = this.x0;
            String str3 = jfuVar6.R0;
            if (str3 == null || !str3.equals(str2)) {
                jfuVar6.R0 = str2;
            }
        }
        String str4 = this.y0;
        if (str4 != null && !str4.isEmpty()) {
            jfu jfuVar7 = this.n0;
            String str5 = this.y0;
            String str6 = jfuVar7.S0;
            if (str6 == null || !str6.equals(str5)) {
                jfuVar7.S0 = str5;
            }
        }
        String str7 = this.z0;
        if (str7 != null && !str7.isEmpty()) {
            jfu jfuVar8 = this.n0;
            String str8 = this.z0;
            String str9 = jfuVar8.T0;
            if (str9 == null || !str9.equals(str8.toString())) {
                jfuVar8.K0 = false;
                jfuVar8.T0 = str8.toString();
            }
        }
        String str10 = this.A0;
        if (str10 != null && !str10.isEmpty()) {
            jfu jfuVar9 = this.n0;
            String str11 = this.A0;
            String str12 = jfuVar9.U0;
            if (str12 == null || !str12.equals(str11)) {
                jfuVar9.K0 = false;
                jfuVar9.U0 = str11;
            }
        }
        jfu jfuVar10 = this.n0;
        jfuVar10.a1 = this.B0;
        int i4 = this.o0;
        jfuVar10.z0 = i4;
        jfuVar10.B0 = i4;
        jfuVar10.C0 = i4;
        jfuVar10.A0 = this.p0;
        jfuVar10.x0 = this.q0;
        jfuVar10.y0 = this.r0;
        r();
    }

    @Override // androidx.constraintlayout.core.state.c
    @NonNull
    public final e2v s() {
        if (this.n0 == null) {
            this.n0 = new jfu();
        }
        return this.n0;
    }
}
