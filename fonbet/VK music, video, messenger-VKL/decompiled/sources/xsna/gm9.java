package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.log.L;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedList;
import java.util.WeakHashMap;
import xsna.fm9;
import xsna.szb0;

/* compiled from: CameraUIPositionsImpl.kt */
/* loaded from: classes16.dex */
public final class gm9 implements fm9 {
    public static final float c2 = iah0.a(16.0f);
    public static final float d2 = iah0.a(8.0f);
    public static final int e2;
    public static final int f2;
    public static final int g2;
    public static final int h2;
    public static final int i2;
    public static final int j2;
    public static final int k2;
    public static final float l2;
    public static final int m2;
    public static final int n2;
    public static final int o2;
    public static final int p2;
    public static final float q2;
    public static final float r2;
    public View A;
    public final szb0.a A0;
    public final szb0.a A1;
    public View B;
    public final szb0.a B0;
    public final szb0.a B1;
    public View C;
    public final szb0.a C0;
    public final szb0.a C1;
    public View D;
    public final szb0.a D0;
    public final szb0.a D1;
    public View E;
    public final szb0.a E0;
    public final szb0.a E1;
    public View F;
    public final szb0.a F0;
    public final szb0.a F1;
    public View G;
    public final szb0.a G0;
    public final szb0.a G1;
    public View H;
    public final szb0.a H0;
    public final szb0.a H1;
    public View I;
    public final szb0.a I0;
    public final szb0.a I1;
    public View J;
    public final szb0.a J0;
    public final szb0.a J1;
    public View K;
    public final szb0.a K0;
    public final szb0.a K1;
    public View L;
    public final szb0.a L0;
    public final szb0.a L1;
    public View M;
    public final szb0.a M0;
    public final szb0.a M1;
    public View N;
    public final szb0.a N0;
    public final szb0.a N1;
    public View O;
    public final szb0.a O0;
    public final szb0.a O1;
    public View P;
    public final szb0.a P0;
    public final szb0.a P1;
    public View Q;
    public final szb0.a Q0;
    public final szb0.a Q1;
    public View R;
    public final szb0.a R0;
    public final szb0.a R1;
    public View S;
    public final szb0.a S0;
    public final szb0.a S1;
    public View T;
    public final szb0.a T0;
    public final szb0.a T1;
    public View U;
    public final szb0.a U0;
    public final szb0.a U1;
    public View V;
    public final szb0.a V0;
    public final szb0.a V1;
    public View W;
    public final szb0.a W0;
    public final szb0.a W1;
    public View X;
    public final szb0.a X0;
    public final szb0.a X1;
    public View Y;
    public final szb0.a Y0;
    public final szb0.a Y1;
    public View Z;
    public final szb0.a Z0;
    public final szb0.a Z1;
    public View a0;
    public final szb0.a a1;
    public final szb0.a a2;
    public View b0;
    public final szb0.a b1;
    public final szb0.a b2;
    public View c0;
    public final szb0.a c1;
    public StoryCameraParams d;
    public final szb0.a d0;
    public final szb0.a d1;
    public iz8 e;
    public final szb0.a e0;
    public final szb0.a e1;
    public final szb0.a f0;
    public final szb0.a f1;
    public MasksWrap g;
    public final szb0.a g0;
    public final szb0.a g1;
    public View h;
    public final szb0.a h0;
    public final szb0.a h1;
    public View i;
    public final szb0.a i0;
    public final szb0.a i1;
    public View j;
    public final szb0.a j0;
    public final szb0.a j1;
    public p5p k;
    public final szb0.a k0;
    public final szb0.a k1;
    public pe8 l;
    public final szb0.a l0;
    public final szb0.a l1;
    public View m;
    public final szb0.a m0;
    public final szb0.a m1;
    public View n;
    public final szb0.a n0;
    public final szb0.a n1;
    public View o;
    public final szb0.a o0;
    public final szb0.a o1;
    public TabsRecycler p;
    public final szb0.a p0;
    public final szb0.a p1;
    public View q;
    public final szb0.a q0;
    public final szb0.a q1;
    public AppCompatTextView r;
    public final szb0.a r0;
    public final szb0.a r1;
    public View s;
    public final szb0.a s0;
    public final szb0.a s1;
    public View t;
    public final szb0.a t0;
    public final szb0.a t1;
    public ShutterButton u;
    public final szb0.a u0;
    public final szb0.a u1;
    public View v;
    public final szb0.a v0;
    public final szb0.a v1;
    public View w;
    public final szb0.a w0;
    public final szb0.a w1;
    public View x;
    public final szb0.a x0;
    public final szb0.a x1;
    public View y;
    public final szb0.a y0;
    public final szb0.a y1;
    public View z;
    public final szb0.a z0;
    public final szb0.a z1;
    public an9 b = new an9();
    public final LinkedList<StoryCameraMode> c = new LinkedList<>();
    public final szb0 f = new szb0();

    /* compiled from: CameraUIPositionsImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraMode.values().length];
            try {
                iArr[StoryCameraMode.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraMode.QR_SCANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraMode.VMOJI_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int a2 = y8g0.a(R.dimen.story_camera_tabs_height);
        e2 = a2;
        int a3 = y8g0.a(R.dimen.story_shutter_tabs_height);
        f2 = a3;
        g2 = a3 - a2;
        h2 = iah0.a(84.0f);
        int a4 = iah0.a(68.0f);
        i2 = a4;
        j2 = a4 - a2;
        k2 = iah0.a(42.0f);
        iah0.a(124.0f);
        l2 = iah0.a(12.0f);
        m2 = iah0.a(64.0f);
        int a5 = iah0.a(10);
        n2 = a5;
        o2 = a5 - a2;
        p2 = iah0.a(-10.0f);
        q2 = 0.33f;
        r2 = y8g0.a(R.dimen.camera_icon_size);
        iah0.a(4.0f);
    }

    public gm9() {
        int i = 0;
        long j = 0;
        int i3 = 127;
        this.d0 = new szb0.a(i, j, i3);
        this.e0 = new szb0.a(i, j, i3);
        this.f0 = new szb0.a(i, j, i3);
        this.g0 = new szb0.a(i, j, i3);
        this.h0 = new szb0.a(i, j, i3);
        this.i0 = new szb0.a(i, j, i3);
        this.j0 = new szb0.a(i, j, i3);
        this.k0 = new szb0.a(i, j, i3);
        this.l0 = new szb0.a(i, j, i3);
        this.m0 = new szb0.a(i, j, i3);
        this.n0 = new szb0.a(i, j, i3);
        this.o0 = new szb0.a(i, j, i3);
        this.p0 = new szb0.a(i, j, i3);
        this.q0 = new szb0.a(i, j, i3);
        this.r0 = new szb0.a(i, j, i3);
        this.s0 = new szb0.a(i, j, i3);
        this.t0 = new szb0.a(i, j, i3);
        this.u0 = new szb0.a(i, j, i3);
        this.v0 = new szb0.a(i, j, i3);
        this.w0 = new szb0.a(i, j, i3);
        this.x0 = new szb0.a(i, j, i3);
        this.y0 = new szb0.a(i, j, i3);
        this.z0 = new szb0.a(i, j, i3);
        this.A0 = new szb0.a(i, j, i3);
        this.B0 = new szb0.a(i, j, i3);
        this.C0 = new szb0.a(i, j, i3);
        this.D0 = new szb0.a(i, j, i3);
        this.E0 = new szb0.a(i, j, i3);
        this.F0 = new szb0.a(i, j, i3);
        this.G0 = new szb0.a(i, j, i3);
        this.H0 = new szb0.a(i, j, i3);
        this.I0 = new szb0.a(i, j, i3);
        this.J0 = new szb0.a(i, j, i3);
        this.K0 = new szb0.a(i, j, i3);
        this.L0 = new szb0.a(i, j, i3);
        this.M0 = new szb0.a(i, j, i3);
        this.N0 = new szb0.a(i, j, i3);
        this.O0 = new szb0.a(i, j, i3);
        this.P0 = new szb0.a(i, j, i3);
        this.Q0 = new szb0.a(i, j, i3);
        this.R0 = new szb0.a(i, j, i3);
        this.S0 = new szb0.a(i, j, i3);
        this.T0 = new szb0.a(i, j, i3);
        this.U0 = new szb0.a(i, j, i3);
        this.V0 = new szb0.a(i, j, i3);
        this.W0 = new szb0.a(i, j, i3);
        this.X0 = new szb0.a(i, j, i3);
        this.Y0 = new szb0.a(i, j, i3);
        this.Z0 = new szb0.a(i, j, i3);
        szb0.a aVar = new szb0.a(i, j, i3);
        aVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i4 = 8;
        aVar.e = 8;
        this.a1 = aVar;
        this.b1 = new szb0.a(i, j, i3);
        this.c1 = new szb0.a(i, j, i3);
        this.d1 = new szb0.a(i, j, i3);
        this.e1 = new szb0.a(i, j, i3);
        this.f1 = new szb0.a(i, j, i3);
        this.g1 = new szb0.a(i, j, i3);
        this.h1 = new szb0.a(i, j, i3);
        this.i1 = new szb0.a(i, j, i3);
        this.j1 = new szb0.a(i, j, i3);
        this.k1 = new szb0.a(i, j, i3);
        this.l1 = new szb0.a(i, j, i3);
        this.m1 = new szb0.a(i, j, i3);
        this.n1 = new szb0.a(i, j, i3);
        this.o1 = new szb0.a(i, j, i3);
        this.p1 = new szb0.a(i, j, i3);
        this.q1 = new szb0.a(i, j, i3);
        this.r1 = new szb0.a(i, j, i3);
        szb0.a aVar2 = new szb0.a(i, j, i3);
        aVar2.d = -1.0f;
        aVar2.e = 8;
        this.s1 = aVar2;
        szb0.a aVar3 = new szb0.a(i, j, i3);
        aVar3.d = 0.5f;
        aVar3.e = 0;
        this.t1 = aVar3;
        szb0.a aVar4 = new szb0.a(i, j, i3);
        aVar4.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar4.e = 8;
        aVar4.g = true;
        this.u1 = aVar4;
        szb0.a aVar5 = new szb0.a(i, j, i3);
        aVar5.d = 1.0f;
        aVar5.e = 0;
        this.v1 = aVar5;
        szb0.a aVar6 = new szb0.a(i, j, i3);
        aVar6.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar6.g = true;
        aVar6.f = 0L;
        aVar6.e = 8;
        this.w1 = aVar6;
        szb0.a aVar7 = new szb0.a(i, j, i3);
        aVar7.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar7.e = 8;
        this.x1 = aVar7;
        szb0.a aVar8 = new szb0.a(i, j, i3);
        aVar8.d = 1.0f;
        aVar8.e = 0;
        this.y1 = aVar8;
        szb0.a aVar9 = new szb0.a(i, j, i3);
        aVar9.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar9.e = 8;
        this.z1 = aVar9;
        szb0.a aVar10 = new szb0.a(i, j, i3);
        aVar10.d = 1.0f;
        aVar10.e = 0;
        this.A1 = aVar10;
        szb0.a aVar11 = new szb0.a(i, j, i3);
        aVar11.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar11.e = 8;
        szb0.a aVar12 = new szb0.a(i, j, i3);
        aVar12.d = 1.0f;
        aVar12.e = 0;
        this.B1 = aVar12;
        float f = r2;
        this.C1 = szb0.a.a(aVar11, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        this.D1 = szb0.a.a(aVar12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        long j3 = 200;
        int i5 = 71;
        this.E1 = new szb0.a(i4, j3, i5);
        int i6 = 95;
        this.F1 = new szb0.a(i, j3, i6);
        int i7 = 4;
        this.G1 = new szb0.a(i7, j3, i5);
        this.H1 = new szb0.a(i, j3, i6);
        this.I1 = new szb0.a(i7, j, i5);
        this.J1 = new szb0.a(i4, j, i5);
        this.K1 = new szb0.a(i, j, i6);
        this.L1 = szb0.a.a(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -y8g0.a(R.dimen.camera_progress_height), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.M1 = szb0.a.a(aVar12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.N1 = szb0.a.a(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(40.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.O1 = szb0.a.a(aVar11, -c2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        this.P1 = szb0.a.a(aVar12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        this.Q1 = szb0.a.a(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.R1 = szb0.a.a(aVar12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.S1 = szb0.a.a(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        this.T1 = szb0.a.a(aVar12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 125);
        int i8 = 127;
        this.U1 = new szb0.a(i, j, i8);
        this.V1 = new szb0.a(i, j, i8);
        this.W1 = new szb0.a(i, j, i8);
        this.X1 = new szb0.a(i, j, i8);
        this.Y1 = szb0.a.a(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 127);
        this.Z1 = szb0.a.a(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        int i9 = 127;
        szb0.a aVar13 = new szb0.a(i, j, i9);
        aVar13.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar13.e = 8;
        this.a2 = aVar13;
        szb0.a aVar14 = new szb0.a(i, j, i9);
        aVar14.d = 1.0f;
        aVar14.e = 0;
        this.b2 = aVar14;
    }

    public final szb0.a A(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (W(i, StoryCameraMode.CLIPS) && an9Var.y && !an9Var.p && !an9Var.j && !an9Var.j() && !an9Var.W && !an9Var.r && !an9Var.M && ynd.a() == ynd.c) {
            StoryCameraParams storyCameraParams = this.d;
            if ((storyCameraParams != null ? storyCameraParams : null).N == null) {
                return this.Z1;
            }
        }
        return this.Y1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (xsna.fm9.a.d.contains(r0.get(r4)) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final szb0.a B(an9 an9Var, int i) {
        boolean z;
        if (i == -1) {
            return null;
        }
        if ((an9Var.C || !an9Var.z) && !(z = an9Var.q) && !an9Var.i && !an9Var.g && !z && !an9Var.p) {
            boolean z2 = an9Var.e;
            LinkedList<StoryCameraMode> linkedList = this.c;
            if (z2) {
                fm9.a.getClass();
            }
            int i3 = a.$EnumSwitchMapping$0[linkedList.get(i).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                return this.k0;
            }
        }
        return this.j0;
    }

    public final szb0.a C(View view, an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 1) {
                if (epx.f(view, this.K)) {
                    return this.z0;
                }
                if (epx.f(view, this.I)) {
                    return this.x0;
                }
                if (epx.f(view, this.J)) {
                    return this.y0;
                }
                if (epx.f(view, this.L)) {
                    return this.v0;
                }
                if (epx.f(view, this.M)) {
                    return this.w0;
                }
            }
        }
        return this.q0;
    }

    public final szb0.a D(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        return (an9Var.q || an9Var.p || this.c.get(i) != StoryCameraMode.LIVE) ? this.q0 : an9Var.n ? this.s0 : this.r0;
    }

    public final szb0.a E(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        return (!W(i, StoryCameraMode.CLIPS) || !an9Var.X || an9Var.j() || an9Var.p || an9Var.q || !an9Var.y) ? this.s1 : szb0.a.a(this.t1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
    }

    public final szb0.a F(an9 an9Var, boolean z) {
        boolean z2 = true;
        boolean z3 = W(an9Var.H, StoryCameraMode.CLIPS) || W(an9Var.H, StoryCameraMode.STORY) || W(an9Var.H, StoryCameraMode.PING_PONG) || W(an9Var.H, StoryCameraMode.REVERSE) || W(an9Var.H, StoryCameraMode.STORY_VIDEO) || W(an9Var.H, StoryCameraMode.LIVE);
        if (!an9Var.j() && !an9Var.p && !an9Var.q) {
            z2 = false;
        }
        return (z3 && !z2 && an9Var.r && z) ? this.b1 : this.a1;
    }

    public final szb0.a G(int i) {
        if (i == -1) {
            return null;
        }
        if (this.c.get(i) != StoryCameraMode.LIVE || this.b.q) {
            an9 an9Var = this.b;
            if (!an9Var.e && !an9Var.i && !an9Var.g) {
                return this.f1;
            }
        }
        return this.e1;
    }

    public final szb0.a H(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (an9Var.s) {
            return this.A0;
        }
        boolean z = an9Var.D;
        szb0.a aVar = this.B0;
        if (!z && an9Var.A) {
            L.l("CameraUIPositionsImpl", "Mask HIDDEN position masksEnabled - " + an9Var.D + " | masksWasInited - " + an9Var.A);
            return aVar;
        }
        if (an9Var.i || an9Var.g || an9Var.e || an9Var.q || an9Var.p) {
            StringBuilder sb = new StringBuilder("Mask HIDDEN position waitingForProcessing - ");
            sb.append(an9Var.i);
            sb.append(" | processing - ");
            sb.append(an9Var.g);
            sb.append(" | progress - ");
            sb.append(an9Var.e);
            sb.append(" | livesForced - ");
            sb.append(an9Var.q);
            sb.append(" | editorForced - ");
            L.l("CameraUIPositionsImpl", defpackage.q0.a(sb, an9Var.p, ' '));
            return aVar;
        }
        StoryCameraMode storyCameraMode = this.c.get(i);
        fm9.a.getClass();
        if (fm9.a.b.contains(storyCameraMode)) {
            return an9Var.n ? this.F0 : this.D0;
        }
        if (storyCameraMode != StoryCameraMode.LIVE) {
            L.l("CameraUIPositionsImpl", "Mask HIDDEN position");
            return aVar;
        }
        if (an9Var.t) {
            return this.E0;
        }
        L.l("CameraUIPositionsImpl", "Mask HIDDEN LIVE position");
        return this.C0;
    }

    public final szb0.a I(LinkedList linkedList, an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.s && an9Var.D && !an9Var.e && !an9Var.i && !an9Var.g) {
            Object obj = linkedList.get(i);
            StoryCameraMode storyCameraMode = StoryCameraMode.LIVE;
            if ((obj != storyCameraMode || an9Var.t) && !an9Var.p) {
                if (an9Var.q) {
                    return an9Var.r ? linkedList.size() == 1 ? this.X0 : this.W0 : this.Z0;
                }
                StoryCameraMode storyCameraMode2 = (StoryCameraMode) linkedList.get(i);
                if (storyCameraMode2 != storyCameraMode) {
                    fm9.a.getClass();
                    if (fm9.a.b.contains(storyCameraMode2) && an9Var.r) {
                        return this.Y0;
                    }
                } else if (an9Var.r) {
                    return this.V0;
                }
            }
        }
        return this.U0;
    }

    public final szb0.a J(int i) {
        if (i == -1) {
            return null;
        }
        an9 an9Var = this.b;
        if (!an9Var.i && !an9Var.g && !an9Var.e && !an9Var.q && !an9Var.p && !an9Var.j) {
            fm9.a.getClass();
            if (!fm9.a.c.contains(this.c.get(i))) {
                StoryCameraParams storyCameraParams = this.d;
                if ((storyCameraParams != null ? storyCameraParams : null).o != StoryCameraTarget.CLIP_FRAGMENT) {
                    return this.g0;
                }
            }
        }
        return this.f0;
    }

    public final szb0.a K(an9 an9Var, int i) {
        boolean z = an9Var.i;
        if (!z && !z && !an9Var.g && !an9Var.e && !an9Var.q && !an9Var.p) {
            LinkedList<StoryCameraMode> linkedList = this.c;
            if (linkedList.size() > 0 && i >= 0 && linkedList.get(i) == StoryCameraMode.QR_SCANNER && !an9Var.Q) {
                return this.i0;
            }
        }
        return this.h0;
    }

    public final szb0.a L(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.q && !an9Var.p && !an9Var.R && !an9Var.m && !an9Var.Q) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 2) {
                return this.j1;
            }
        }
        return this.i1;
    }

    public final szb0.a M(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 2) {
                return this.l1;
            }
        }
        return this.k1;
    }

    public final szb0.a N(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 2) {
                return this.n1;
            }
        }
        return this.m1;
    }

    public final szb0.a O(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.i && !an9Var.q && !an9Var.e && !an9Var.g && !an9Var.p) {
            int i3 = a.$EnumSwitchMapping$0[this.c.get(i).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3 && an9Var.F) {
                return this.G0;
            }
        }
        return this.H0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (xsna.fm9.a.e.contains(r0.get(r4)) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final szb0.a P(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if ((an9Var.E || !an9Var.B) && !an9Var.i && !an9Var.g && !an9Var.q && !an9Var.p) {
            boolean z = an9Var.e;
            LinkedList<StoryCameraMode> linkedList = this.c;
            if (z) {
                fm9.a.getClass();
            }
            int i3 = a.$EnumSwitchMapping$0[linkedList.get(i).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                return this.p0;
            }
        }
        return this.o0;
    }

    public final szb0.a Q(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if ((an9Var.E || !an9Var.B) && !an9Var.i && !an9Var.g && !an9Var.e && !an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 1) {
                return an9Var.n ? this.n0 : this.m0;
            }
        }
        return this.l0;
    }

    public final szb0.a R(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.i && !an9Var.g && !an9Var.e && !an9Var.q && !an9Var.p) {
            LinkedList<StoryCameraMode> linkedList = this.c;
            if (linkedList.size() > 1 && i >= 0) {
                linkedList.get(i);
                StoryCameraMode storyCameraMode = StoryCameraMode.QR_SCANNER;
            }
            if (!an9Var.j) {
                return this.P0;
            }
        }
        return this.O0;
    }

    public final szb0.a S(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.i && !an9Var.g && !an9Var.e && !an9Var.q && !an9Var.p) {
            LinkedList<StoryCameraMode> linkedList = this.c;
            if ((linkedList.size() != 1 || i < 0 || linkedList.get(i) != StoryCameraMode.QR_SCANNER) && !W(i, StoryCameraMode.VMOJI_CAPTURE) && !an9Var.M && !an9Var.X) {
                return this.P0;
            }
        }
        return this.O0;
    }

    public final szb0.a T(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (!an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 3) {
                return this.p1;
            }
        }
        return this.o1;
    }

    public final szb0.a U(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        if (an9Var.c && !an9Var.q && !an9Var.p) {
            if (a.$EnumSwitchMapping$0[this.c.get(i).ordinal()] == 3) {
                return this.r1;
            }
        }
        return this.q1;
    }

    public final void V() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i;
        int i3;
        View view2 = this.m;
        float f = c2;
        if (view2 != null) {
            if (this.b.n) {
                int i4 = (sqe0.b(view2).widthPixels / 2) - (((int) ShutterButton.U) / 2);
                qcy<Object>[] qcyVarArr = bwt0.a;
                i3 = (i4 - ((int) view2.getResources().getDimension(R.dimen.camera_icon_size))) - ((int) f);
            } else {
                i3 = 0;
            }
            bwt0.f0(view2, i3, 0, 0, 0, 14);
        }
        View view3 = this.n;
        if (view3 != null) {
            if (this.b.n) {
                int i5 = (sqe0.b(view3).widthPixels / 2) - (((int) ShutterButton.U) / 2);
                qcy<Object>[] qcyVarArr2 = bwt0.a;
                i = (i5 - ((int) view3.getResources().getDimension(R.dimen.camera_icon_size))) - ((int) f);
            } else {
                i = 0;
            }
            bwt0.f0(view3, 0, 0, i, 0, 11);
        }
        LinkedList<StoryCameraMode> linkedList = this.c;
        int size = linkedList.size();
        int i6 = h2;
        int i7 = p2;
        int i8 = k2;
        if (size <= 1 && !sdi.q(linkedList, StoryCameraMode.CLIPS) && !sdi.q(linkedList, StoryCameraMode.LIVE)) {
            ShutterButton shutterButton = this.u;
            if (shutterButton != null && (layoutParams2 = shutterButton.getLayoutParams()) != null) {
                if (!this.b.n) {
                    i6 = g2;
                }
                layoutParams2.height = i6;
            }
            View view4 = this.m;
            int i9 = j2;
            if (view4 != null) {
                bwt0.f0(view4, 0, 0, 0, this.b.n ? i8 : i9, 7);
            }
            View view5 = this.n;
            if (view5 != null) {
                bwt0.f0(view5, 0, 0, 0, this.b.n ? i8 : i9, 7);
            }
            View view6 = this.s;
            if (view6 != null) {
                an9 an9Var = this.b;
                boolean z = an9Var.n;
                if (z && an9Var.q) {
                    i7 *= 4;
                } else if (!z) {
                    i7 = o2;
                }
                bwt0.f0(view6, 0, 0, 0, i7, 7);
            }
            View view7 = this.q;
            if (view7 != null) {
                f4m.j(view7);
                return;
            }
            return;
        }
        ShutterButton shutterButton2 = this.u;
        if (shutterButton2 != null && (layoutParams = shutterButton2.getLayoutParams()) != null) {
            if (!this.b.n) {
                i6 = f2;
            }
            layoutParams.height = i6;
        }
        View view8 = this.m;
        int i10 = i2;
        if (view8 != null) {
            bwt0.f0(view8, 0, 0, 0, this.b.n ? i8 : i10, 7);
        }
        View view9 = this.n;
        if (view9 != null) {
            bwt0.f0(view9, 0, 0, 0, this.b.n ? i8 : i10, 7);
        }
        View view10 = this.s;
        if (view10 != null) {
            if (!this.b.n) {
                i7 = n2;
            }
            bwt0.f0(view10, 0, 0, 0, i7, 7);
        }
        if (sdi.q(linkedList, StoryCameraMode.CLIPS) || sdi.q(linkedList, StoryCameraMode.LIVE)) {
            View view11 = this.q;
            if (view11 != null) {
                f4m.j(view11);
                return;
            }
            return;
        }
        if (this.b.Q || (view = this.q) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final boolean W(int i, StoryCameraMode storyCameraMode) {
        LinkedList<StoryCameraMode> linkedList = this.c;
        return linkedList.size() > 0 && i >= 0 && linkedList.get(i) == storyCameraMode;
    }

    public final void X(LinearLayout linearLayout) {
        this.Y = linearLayout;
    }

    public final void Y(MasksWrap masksWrap) {
        this.g = masksWrap;
    }

    public final void Z(an9 an9Var) {
        this.b = an9Var;
    }

    @Override // xsna.fm9
    public final void a() {
        int childCount;
        View view = this.E;
        szb0 szb0Var = this.f;
        if (view != null) {
            an9 an9Var = this.b;
            szb0.a D = D(an9Var, an9Var.H);
            an9 an9Var2 = this.b;
            szb0Var.b(view, D, D(an9Var2, an9Var2.I), this.b.J);
        }
        View view2 = this.D;
        if (view2 != null) {
            an9 an9Var3 = this.b;
            szb0.a n = n(an9Var3, an9Var3.H);
            an9 an9Var4 = this.b;
            szb0Var.b(view2, n, n(an9Var4, an9Var4.I), this.b.J);
        }
        View view3 = this.o;
        if (view3 != null) {
            szb0Var.b(view3, G(this.b.H), G(this.b.I), this.b.J);
        }
        View view4 = this.B;
        if (view4 != null) {
            szb0Var.b(view4, J(this.b.H), J(this.b.I), this.b.J);
        }
        View view5 = this.A;
        if (view5 != null) {
            an9 an9Var5 = this.b;
            szb0.a B = B(an9Var5, an9Var5.H);
            an9 an9Var6 = this.b;
            szb0Var.b(view5, B, B(an9Var6, an9Var6.I), this.b.J);
        }
        View view6 = this.x;
        if (view6 != null) {
            an9 an9Var7 = this.b;
            szb0.a Q = Q(an9Var7, an9Var7.H);
            an9 an9Var8 = this.b;
            szb0Var.b(view6, Q, Q(an9Var8, an9Var8.I), this.b.J);
        }
        View view7 = this.w;
        if (view7 != null) {
            an9 an9Var9 = this.b;
            szb0.a P = P(an9Var9, an9Var9.H);
            an9 an9Var10 = this.b;
            szb0Var.b(view7, P, P(an9Var10, an9Var10.I), this.b.J);
        }
        View view8 = this.v;
        if (view8 != null) {
            an9 an9Var11 = this.b;
            szb0.a H = H(an9Var11, an9Var11.H);
            an9 an9Var12 = this.b;
            szb0Var.b(view8, H, H(an9Var12, an9Var12.I), this.b.J);
        }
        View view9 = this.z;
        if (view9 != null) {
            an9 an9Var13 = this.b;
            szb0.a R = R(an9Var13, an9Var13.H);
            an9 an9Var14 = this.b;
            szb0Var.b(view9, R, R(an9Var14, an9Var14.I), this.b.J);
        }
        View view10 = this.G;
        if (view10 != null) {
            an9 an9Var15 = this.b;
            szb0.a y = y(an9Var15, an9Var15.H);
            an9 an9Var16 = this.b;
            szb0Var.b(view10, y, y(an9Var16, an9Var16.I), this.b.J);
        }
        View view11 = this.y;
        if (view11 != null) {
            an9 an9Var17 = this.b;
            szb0.a S = S(an9Var17, an9Var17.H);
            an9 an9Var18 = this.b;
            szb0Var.b(view11, S, S(an9Var18, an9Var18.I), this.b.J);
        }
        View view12 = this.s;
        if (view12 != null) {
            an9 an9Var19 = this.b;
            int i = an9Var19.H;
            LinkedList<StoryCameraMode> linkedList = this.c;
            szb0.a I = I(linkedList, an9Var19, i);
            an9 an9Var20 = this.b;
            szb0Var.b(view12, I, I(linkedList, an9Var20, an9Var20.I), this.b.J);
        }
        View view13 = this.F;
        if (view13 != null) {
            an9 an9Var21 = this.b;
            szb0.a O = O(an9Var21, an9Var21.H);
            an9 an9Var22 = this.b;
            szb0Var.b(view13, O, O(an9Var22, an9Var22.I), this.b.J);
        }
        View view14 = this.H;
        if (view14 != null) {
            an9 an9Var23 = this.b;
            int i3 = an9Var23.H;
            szb0.a aVar = this.g1;
            szb0.a aVar2 = this.h1;
            szb0.a aVar3 = i3 == -1 ? null : an9Var23.h ? aVar2 : aVar;
            if (an9Var23.I == -1) {
                aVar = null;
            } else if (an9Var23.h) {
                aVar = aVar2;
            }
            szb0Var.b(view14, aVar3, aVar, an9Var23.J);
        }
        View view15 = this.h;
        if (view15 != null) {
            an9 an9Var24 = this.b;
            szb0.a L = L(an9Var24, an9Var24.H);
            an9 an9Var25 = this.b;
            szb0Var.b(view15, L, L(an9Var25, an9Var25.I), this.b.J);
        }
        View view16 = this.i;
        if (view16 != null) {
            an9 an9Var26 = this.b;
            szb0.a M = M(an9Var26, an9Var26.H);
            an9 an9Var27 = this.b;
            szb0Var.b(view16, M, M(an9Var27, an9Var27.I), this.b.J);
        }
        View view17 = this.j;
        if (view17 != null) {
            an9 an9Var28 = this.b;
            szb0.a N = N(an9Var28, an9Var28.H);
            an9 an9Var29 = this.b;
            szb0Var.b(view17, N, N(an9Var29, an9Var29.I), this.b.J);
        }
        View view18 = this.N;
        if (view18 != null) {
            an9 an9Var30 = this.b;
            szb0.a T = T(an9Var30, an9Var30.H);
            an9 an9Var31 = this.b;
            szb0Var.b(view18, T, T(an9Var31, an9Var31.I), this.b.J);
        }
        View view19 = this.O;
        if (view19 != null) {
            an9 an9Var32 = this.b;
            szb0.a U = U(an9Var32, an9Var32.H);
            an9 an9Var33 = this.b;
            szb0Var.b(view19, U, U(an9Var33, an9Var33.I), this.b.J);
        }
        View view20 = this.C;
        if (view20 != null) {
            an9 an9Var34 = this.b;
            szb0.a K = K(an9Var34, an9Var34.H);
            an9 an9Var35 = this.b;
            szb0Var.b(view20, K, K(an9Var35, an9Var35.I), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.b.J));
        }
        View view21 = this.V;
        ViewGroup viewGroup = view21 instanceof ViewGroup ? (ViewGroup) view21 : null;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 0) {
            an9 an9Var36 = this.b;
            szb0.a v = v(an9Var36, an9Var36.H);
            an9 an9Var37 = this.b;
            szb0.a v2 = v(an9Var37, an9Var37.I);
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null) {
                    szb0Var.b(childAt, v, v2, this.b.J);
                }
            }
        }
        an9 an9Var38 = this.b;
        if (an9Var38.I != -1) {
            View view22 = this.V;
            szb0.a w = w(an9Var38, an9Var38.H);
            an9 an9Var39 = this.b;
            szb0Var.b(view22, w, w(an9Var39, an9Var39.I), this.b.J);
        }
        View view23 = this.W;
        an9 an9Var40 = this.b;
        szb0.a u = u(an9Var40, an9Var40.H);
        an9 an9Var41 = this.b;
        szb0Var.b(view23, u, u(an9Var41, an9Var41.I), this.b.J);
        View view24 = this.P;
        an9 an9Var42 = this.b;
        szb0.a t = t(an9Var42, an9Var42.H);
        an9 an9Var43 = this.b;
        szb0Var.b(view24, t, t(an9Var43, an9Var43.I), this.b.J);
        View view25 = this.Q;
        an9 an9Var44 = this.b;
        szb0.a o = o(an9Var44, an9Var44.H);
        an9 an9Var45 = this.b;
        szb0Var.b(view25, o, o(an9Var45, an9Var45.I), this.b.J);
        View view26 = this.R;
        an9 an9Var46 = this.b;
        szb0.a s = s(an9Var46, an9Var46.H);
        an9 an9Var47 = this.b;
        szb0Var.b(view26, s, s(an9Var47, an9Var47.I), this.b.J);
        View view27 = this.S;
        an9 an9Var48 = this.b;
        szb0.a r = r(an9Var48, an9Var48.H);
        an9 an9Var49 = this.b;
        szb0Var.b(view27, r, r(an9Var49, an9Var49.I), this.b.J);
        View view28 = this.T;
        an9 an9Var50 = this.b;
        szb0.a q = q(an9Var50, an9Var50.H);
        an9 an9Var51 = this.b;
        szb0Var.b(view28, q, q(an9Var51, an9Var51.I), this.b.J);
        View view29 = this.U;
        an9 an9Var52 = this.b;
        szb0.a p = p(an9Var52, an9Var52.H);
        an9 an9Var53 = this.b;
        szb0Var.b(view29, p, p(an9Var53, an9Var53.I), this.b.J);
        View view30 = this.b0;
        an9 an9Var54 = this.b;
        szb0.a A = A(an9Var54, an9Var54.H);
        an9 an9Var55 = this.b;
        szb0Var.b(view30, A, A(an9Var55, an9Var55.I), this.b.J);
        View view31 = this.c0;
        an9 an9Var56 = this.b;
        szb0.a E = E(an9Var56, an9Var56.H);
        an9 an9Var57 = this.b;
        szb0Var.b(view31, E, E(an9Var57, an9Var57.I), this.b.J);
    }

    public final void a0(View view, boolean z) {
        szb0.a aVar;
        if (view == null) {
            return;
        }
        if (view.equals(this.z) || view.equals(this.y)) {
            aVar = z ? this.P0 : this.O0;
        } else if (!view.equals(this.C)) {
            return;
        } else {
            aVar = z ? this.i0 : this.h0;
        }
        this.f.e(view, aVar, true, null);
    }

    @Override // xsna.fm9
    public final void b() {
        float a2;
        if (this.q != null) {
            szb0.a aVar = this.d0;
            aVar.b = r0.getHeight() * 2;
            aVar.e = 8;
            szb0.a aVar2 = this.e0;
            aVar2.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar2.e = 0;
        }
        if (this.o != null) {
            szb0.a aVar3 = this.e1;
            aVar3.d = -1.0f;
            aVar3.e = 8;
            this.f1.d = 1.0f;
            aVar3.e = 0;
        }
        if (this.C != null) {
            szb0.a aVar4 = this.h0;
            aVar4.d = -1.0f;
            aVar4.b = -iah0.a(24);
            aVar4.e = 8;
            szb0.a aVar5 = this.i0;
            aVar5.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar5.d = 1.0f;
            aVar5.e = 0;
        }
        View view = this.B;
        float f = c2;
        if (view != null) {
            szb0.a aVar6 = this.f0;
            aVar6.a = -f;
            aVar6.d = -1.0f;
            aVar6.c = 0.6f;
            aVar6.e = 8;
            szb0.a aVar7 = this.g0;
            aVar7.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar7.d = 1.0f;
            aVar7.c = 1.0f;
            aVar7.e = 0;
        }
        if (this.A != null) {
            szb0.a aVar8 = this.j0;
            aVar8.a = -f;
            aVar8.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar8.d = -1.0f;
            aVar8.c = 0.9f;
            aVar8.e = 8;
            szb0.a aVar9 = this.k0;
            aVar9.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar9.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar9.d = 1.0f;
            aVar9.c = 1.0f;
            aVar9.e = 0;
        }
        if (this.E != null) {
            szb0.a aVar10 = this.q0;
            aVar10.b = -iah0.a(24);
            aVar10.c = 0.8f;
            aVar10.d = -1.0f;
            aVar10.e = 8;
            float a3 = iah0.a(95);
            szb0.a aVar11 = this.r0;
            aVar11.b = a3;
            aVar11.c = 1.0f;
            aVar11.d = 1.0f;
            aVar11.e = 0;
            float a4 = iah0.a(10);
            szb0.a aVar12 = this.s0;
            aVar12.b = a4;
            aVar12.c = 1.0f;
            aVar12.d = 1.0f;
            aVar12.e = 0;
        }
        View view2 = this.D;
        if (view2 != null) {
            float translationY = view2.getTranslationY();
            szb0.a aVar13 = this.t0;
            aVar13.b = translationY;
            aVar13.a = view2.getTranslationX();
            aVar13.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar13.e = 8;
            float translationY2 = view2.getTranslationY();
            szb0.a aVar14 = this.u0;
            aVar14.b = translationY2;
            aVar14.a = view2.getTranslationX();
            aVar14.d = 1.0f;
            aVar14.e = 0;
        }
        if (this.x != null) {
            szb0.a aVar15 = this.l0;
            aVar15.a = f;
            aVar15.d = -1.0f;
            aVar15.c = 0.6f;
            aVar15.e = 8;
            szb0.a aVar16 = this.m0;
            aVar16.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar16.d = 1.0f;
            aVar16.c = 1.0f;
            aVar16.e = 0;
            szb0.a aVar17 = this.n0;
            aVar17.d = 1.0f;
            aVar17.c = 1.0f;
            aVar17.e = 0;
            aVar17.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.w != null) {
            szb0.a aVar18 = this.o0;
            aVar18.a = f;
            aVar18.d = -1.0f;
            aVar18.c = 0.9f;
            aVar18.e = 8;
            szb0.a aVar19 = this.p0;
            aVar19.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar19.d = 1.0f;
            aVar19.c = 1.0f;
            aVar19.e = 0;
        }
        if (this.v != null) {
            szb0.a aVar20 = this.B0;
            aVar20.a = -f;
            aVar20.d = -1.0f;
            aVar20.c = 0.9f;
            aVar20.e = 8;
            szb0.a aVar21 = this.C0;
            aVar21.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar21.d = -1.0f;
            aVar21.c = 0.9f;
            aVar21.e = 8;
            szb0.a aVar22 = this.D0;
            aVar22.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar22.d = 1.0f;
            aVar22.c = 1.0f;
            aVar22.e = 0;
            szb0.a aVar23 = this.A0;
            aVar23.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar23.d = 0.5f;
            aVar23.c = 1.0f;
            aVar23.e = 0;
            szb0.a aVar24 = this.F0;
            aVar24.d = 1.0f;
            aVar24.c = 1.0f;
            aVar24.e = 0;
            aVar24.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = -d2;
            szb0.a aVar25 = this.E0;
            aVar25.a = f3;
            aVar25.d = 1.0f;
            aVar25.c = 1.0f;
            aVar25.e = 0;
        }
        if (this.m != null) {
            szb0.a aVar26 = this.K0;
            aVar26.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar26.e = 8;
            aVar26.f = 150L;
            szb0.a aVar27 = this.L0;
            aVar27.d = 1.0f;
            aVar27.e = 0;
            aVar27.f = 350L;
        }
        if (this.n != null) {
            szb0.a aVar28 = this.M0;
            aVar28.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar28.e = 8;
            aVar28.f = 150L;
            szb0.a aVar29 = this.N0;
            aVar29.d = 1.0f;
            aVar29.e = 0;
            aVar29.f = 350L;
        }
        if (this.y != null) {
            szb0.a aVar30 = this.O0;
            aVar30.d = -1.0f;
            aVar30.b = -r0.getHeight();
            aVar30.e = 8;
            szb0.a aVar31 = this.P0;
            aVar31.d = 1.0f;
            aVar31.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar31.e = 0;
        }
        if (this.u != null) {
            szb0.a aVar32 = this.Q0;
            aVar32.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar32.e = 8;
            aVar32.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            szb0.a aVar33 = this.R0;
            aVar33.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar33.e = 8;
            WeakHashMap weakHashMap = j6r0.a;
            aVar33.b = iah0.a(96.0f);
            szb0.a aVar34 = this.S0;
            aVar34.d = 1.0f;
            aVar34.e = 0;
            aVar34.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            iz8 iz8Var = this.e;
            Float valueOf = iz8Var != null ? Float.valueOf(iz8Var.d) : null;
            szb0.a aVar35 = this.T0;
            aVar35.d = 1.0f;
            aVar35.b = (valueOf == null || valueOf.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? -e2 : 0.0f;
            aVar35.e = 0;
        }
        View view3 = this.s;
        szb0.a aVar36 = this.Y0;
        szb0.a aVar37 = this.U0;
        if (view3 != null) {
            aVar37.b = iah0.a(55.0f);
            aVar37.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar37.e = 8;
            float a5 = iah0.a(50.0f);
            szb0.a aVar38 = this.V0;
            aVar38.b = a5;
            aVar38.d = 1.0f;
            aVar38.e = 0;
            iz8 iz8Var2 = this.e;
            if (iz8Var2 != null) {
                float f4 = iz8Var2.d;
                float f5 = m2;
                float f6 = l2;
                if (f4 > f5 + f6) {
                    f4 = (f4 - f5) - f6;
                } else if (f4 > f5) {
                    f4 = 0.0f;
                }
                a2 = iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) - f4;
            } else {
                a2 = iah0.a(100.0f);
            }
            szb0.a aVar39 = this.W0;
            aVar39.b = a2;
            aVar39.d = 1.0f;
            aVar39.e = 0;
            float b = iah0.b(20.0f) + aVar39.b;
            szb0.a aVar40 = this.Z0;
            aVar40.b = b;
            aVar40.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar40.e = 8;
            aVar36.b = iah0.a(35.0f);
            aVar36.d = 1.0f;
            aVar36.e = 0;
            float a6 = iah0.a(70.0f);
            szb0.a aVar41 = this.X0;
            aVar41.b = a6;
            aVar41.d = 1.0f;
            aVar41.e = 0;
        }
        MasksWrap masksWrap = this.g;
        if (masksWrap != null && masksWrap.getClipsGalleryListContainer() != null) {
            this.a1.b = aVar37.b - aVar36.b;
        }
        if (this.Y != null) {
            szb0.a aVar42 = this.U1;
            aVar42.b = -r0.getHeight();
            aVar42.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar42.e = 8;
            szb0.a aVar43 = this.V1;
            aVar43.d = 1.0f;
            aVar43.e = 0;
        }
        if (this.Z != null) {
            this.W1.e = 8;
            this.X1.e = 0;
        }
        if (this.t != null) {
            szb0.a aVar44 = this.c1;
            aVar44.e = 8;
            aVar44.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            szb0.a aVar45 = this.d1;
            aVar45.e = 0;
            aVar45.d = 1.0f;
        }
        if (this.F != null) {
            szb0.a aVar46 = this.G0;
            aVar46.d = 1.0f;
            aVar46.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar46.e = 0;
            szb0.a aVar47 = this.H0;
            aVar47.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            WeakHashMap weakHashMap2 = j6r0.a;
            aVar47.b = -iah0.a(48.0f);
            aVar47.e = 8;
        }
        if (this.G != null) {
            szb0.a aVar48 = this.J0;
            aVar48.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar48.e = 8;
            szb0.a aVar49 = this.I0;
            aVar49.d = 1.0f;
            aVar49.e = 0;
        }
        if (this.H != null) {
            szb0.a aVar50 = this.h1;
            aVar50.d = 1.0f;
            aVar50.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar50.e = 0;
            szb0.a aVar51 = this.g1;
            aVar51.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            WeakHashMap weakHashMap3 = j6r0.a;
            aVar51.b = -iah0.a(48.0f);
            aVar51.e = 8;
        }
        if (this.h != null) {
            szb0.a aVar52 = this.i1;
            aVar52.b = -iah0.a(24);
            aVar52.c = 0.8f;
            aVar52.d = -1.0f;
            aVar52.e = 8;
            szb0.a aVar53 = this.j1;
            aVar53.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            aVar53.c = 1.0f;
            aVar53.d = 1.0f;
            aVar53.e = 0;
        }
        if (this.i != null) {
            szb0.a aVar54 = this.k1;
            aVar54.d = -1.0f;
            aVar54.e = 8;
            aVar54.b = r0.getHeight() / 2.0f;
            szb0.a aVar55 = this.l1;
            aVar55.d = 1.0f;
            aVar55.e = 0;
            aVar55.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.j != null) {
            szb0.a aVar56 = this.m1;
            aVar56.d = -1.0f;
            aVar56.e = 8;
            szb0.a aVar57 = this.n1;
            aVar57.d = 1.0f;
            aVar57.e = 0;
        }
        if (this.N != null) {
            szb0.a aVar58 = this.o1;
            aVar58.d = -1.0f;
            aVar58.e = 8;
            szb0.a aVar59 = this.p1;
            aVar59.d = 1.0f;
            aVar59.e = 0;
        }
        if (this.O != null) {
            szb0.a aVar60 = this.q1;
            aVar60.d = -1.0f;
            aVar60.e = 8;
            szb0.a aVar61 = this.r1;
            aVar61.d = 1.0f;
            aVar61.e = 0;
        }
    }

    public final void b0() {
        View view = this.a0;
        if (view != null) {
            View view2 = this.R;
            if (view2 != null && bwt0.K(view2)) {
                int width = view2.getWidth();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                r2 = (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) + width;
            }
            f4m.s(r2, view);
        }
    }

    @Override // xsna.fm9
    public final void c() {
        View view;
        View view2 = this.W;
        an9 an9Var = this.b;
        szb0.a u = u(an9Var, an9Var.H);
        szb0 szb0Var = this.f;
        szb0Var.c(view2, u);
        an9 an9Var2 = this.b;
        szb0.a v = v(an9Var2, an9Var2.H);
        if (epx.f(v, this.H1) && (view = this.V) != null) {
            view.setVisibility(0);
        }
        View view3 = this.V;
        ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            szb0Var.e(childAt, v, true, new rs0(2, v, this));
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt2 = viewGroup.getChildAt(i);
            if (childAt2 != null) {
                this.f.e(childAt2, v, true, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b6, code lost:
    
        if (r5.V != false) goto L142;
     */
    @Override // xsna.fm9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        View clipsGalleryListContainer;
        RecyclerView groupedEffectView;
        TabsRecycler tabsRecycler = this.p;
        if (tabsRecycler != null) {
            an9 an9Var = this.b;
            tabsRecycler.setScrollable((an9Var.e || an9Var.g || an9Var.i || an9Var.p || an9Var.q || an9Var.n || !an9Var.O) ? false : true);
        }
        pe8 pe8Var = this.l;
        szb0 szb0Var = this.f;
        if (pe8Var != null) {
            szb0.a aVar = this.b.q ? this.v1 : this.u1;
            szb0Var.c(pe8Var.getView(), aVar);
            if (aVar.g) {
                this.l = null;
            }
        }
        if (this.k != null) {
            an9 an9Var2 = this.b;
            szb0.a aVar2 = an9Var2.p ? W(an9Var2.H, StoryCameraMode.VMOJI_CAPTURE) ? this.x1 : this.y1 : this.w1;
            p5p p5pVar = this.k;
            szb0Var.c(p5pVar != null ? p5pVar.b() : null, aVar2);
            if (aVar2.g) {
                this.k = null;
            }
        }
        View view = this.E;
        if (view != null) {
            an9 an9Var3 = this.b;
            szb0Var.c(view, D(an9Var3, an9Var3.H));
        }
        View view2 = this.D;
        if (view2 != null) {
            an9 an9Var4 = this.b;
            szb0Var.c(view2, n(an9Var4, an9Var4.H));
        }
        View view3 = this.h;
        if (view3 != null) {
            an9 an9Var5 = this.b;
            szb0Var.c(view3, L(an9Var5, an9Var5.H));
        }
        View view4 = this.i;
        if (view4 != null) {
            an9 an9Var6 = this.b;
            szb0Var.c(view4, M(an9Var6, an9Var6.H));
        }
        View view5 = this.j;
        if (view5 != null) {
            an9 an9Var7 = this.b;
            szb0Var.c(view5, N(an9Var7, an9Var7.H));
        }
        View view6 = this.N;
        if (view6 != null) {
            an9 an9Var8 = this.b;
            szb0Var.c(view6, T(an9Var8, an9Var8.H));
        }
        View view7 = this.O;
        if (view7 != null) {
            an9 an9Var9 = this.b;
            szb0Var.c(view7, U(an9Var9, an9Var9.H));
        }
        View view8 = this.q;
        LinkedList<StoryCameraMode> linkedList = this.c;
        if (view8 != null) {
            an9 an9Var10 = this.b;
            szb0Var.c(view8, (linkedList.size() == 1 || an9Var10.e || an9Var10.i || an9Var10.g || an9Var10.p || an9Var10.q || an9Var10.n || an9Var10.Q || an9Var10.m || an9Var10.j || an9Var10.U) ? this.d0 : this.e0);
        }
        AppCompatTextView appCompatTextView = this.r;
        if (appCompatTextView != null) {
            an9 an9Var11 = this.b;
            szb0Var.c(appCompatTextView, (!an9Var11.n || an9Var11.q || an9Var11.m || fxc0.B().i().d()) ? this.z1 : this.A1);
        }
        ShutterButton shutterButton = this.u;
        if (shutterButton != null) {
            an9 an9Var12 = this.b;
            boolean z = an9Var12.f;
            szb0.a aVar3 = this.R0;
            szb0.a aVar4 = this.Q0;
            if (!z && !an9Var12.q) {
                if (!an9Var12.p || linkedList.size() != 1 || linkedList.getFirst().i()) {
                    if ((!an9Var12.p || (!W(an9Var12.H, StoryCameraMode.STORY) && !W(an9Var12.H, StoryCameraMode.STORY_VIDEO) && !W(an9Var12.H, StoryCameraMode.PING_PONG))) && (!an9Var12.p || !W(an9Var12.H, StoryCameraMode.CLIPS))) {
                        aVar3 = this.S0;
                    }
                    aVar3 = aVar4;
                } else if (!W(an9Var12.H, StoryCameraMode.VMOJI_CAPTURE)) {
                    aVar3 = this.T0;
                }
                szb0Var.c(shutterButton, aVar3);
            }
        }
        View view9 = this.m;
        if (view9 != null) {
            szb0.a aVar5 = this.L0;
            aVar5.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            szb0Var.getClass();
            szb0Var.e(view9, aVar5, true, null);
        }
        View view10 = this.n;
        if (view10 != null) {
            szb0.a aVar6 = this.N0;
            aVar6.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            szb0Var.getClass();
            szb0Var.e(view10, aVar6, true, null);
        }
        View view11 = this.z;
        if (view11 != null) {
            an9 an9Var13 = this.b;
            szb0Var.c(view11, R(an9Var13, an9Var13.H));
        }
        View view12 = this.y;
        if (view12 != null) {
            an9 an9Var14 = this.b;
            szb0Var.c(view12, S(an9Var14, an9Var14.H));
        }
        View view13 = this.s;
        if (view13 != null) {
            an9 an9Var15 = this.b;
            szb0Var.c(view13, I(linkedList, an9Var15, an9Var15.H));
        }
        View view14 = this.t;
        if (view14 != null) {
            szb0Var.c(view14, this.b.g ? this.d1 : this.c1);
        }
        View view15 = this.F;
        if (view15 != null) {
            an9 an9Var16 = this.b;
            szb0Var.c(view15, O(an9Var16, an9Var16.H));
        }
        View view16 = this.G;
        if (view16 != null) {
            an9 an9Var17 = this.b;
            szb0Var.c(view16, y(an9Var17, an9Var17.H));
        }
        View view17 = this.H;
        if (view17 != null) {
            an9 an9Var18 = this.b;
            szb0Var.c(view17, an9Var18.H == -1 ? null : an9Var18.h ? this.h1 : this.g1);
        }
        View view18 = this.A;
        if (view18 != null) {
            an9 an9Var19 = this.b;
            szb0Var.c(view18, B(an9Var19, an9Var19.H));
        }
        View view19 = this.w;
        if (view19 != null) {
            an9 an9Var20 = this.b;
            szb0Var.c(view19, P(an9Var20, an9Var20.H));
        }
        View view20 = this.o;
        if (view20 != null) {
            szb0Var.c(view20, G(this.b.H));
        }
        View view21 = this.B;
        if (view21 != null) {
            szb0Var.c(view21, J(this.b.H));
        }
        View view22 = this.v;
        if (view22 != null) {
            an9 an9Var21 = this.b;
            szb0Var.c(view22, H(an9Var21, an9Var21.H));
        }
        View view23 = this.x;
        if (view23 != null) {
            an9 an9Var22 = this.b;
            szb0Var.c(view23, Q(an9Var22, an9Var22.H));
        }
        View view24 = this.C;
        if (view24 != null) {
            an9 an9Var23 = this.b;
            szb0Var.c(view24, K(an9Var23, an9Var23.H));
        }
        View view25 = this.I;
        if (view25 != null) {
            an9 an9Var24 = this.b;
            szb0Var.c(view25, C(view25, an9Var24, an9Var24.H));
        }
        View view26 = this.J;
        if (view26 != null) {
            an9 an9Var25 = this.b;
            szb0Var.c(view26, C(view26, an9Var25, an9Var25.H));
        }
        View view27 = this.K;
        if (view27 != null) {
            an9 an9Var26 = this.b;
            szb0Var.c(view27, C(view27, an9Var26, an9Var26.H));
        }
        View view28 = this.L;
        if (view28 != null) {
            an9 an9Var27 = this.b;
            szb0Var.c(view28, C(view28, an9Var27, an9Var27.H));
        }
        View view29 = this.M;
        if (view29 != null) {
            an9 an9Var28 = this.b;
            szb0Var.c(view29, C(view29, an9Var28, an9Var28.H));
        }
        c();
        View view30 = this.P;
        an9 an9Var29 = this.b;
        szb0Var.c(view30, t(an9Var29, an9Var29.H));
        View view31 = this.Q;
        an9 an9Var30 = this.b;
        szb0Var.e(view31, o(an9Var30, an9Var30.H), true, null);
        View view32 = this.R;
        an9 an9Var31 = this.b;
        szb0Var.e(view32, s(an9Var31, an9Var31.H), true, new j1(this, 15));
        View view33 = this.S;
        an9 an9Var32 = this.b;
        szb0Var.c(view33, r(an9Var32, an9Var32.H));
        View view34 = this.T;
        an9 an9Var33 = this.b;
        szb0Var.c(view34, q(an9Var33, an9Var33.H));
        View view35 = this.U;
        an9 an9Var34 = this.b;
        szb0Var.c(view35, p(an9Var34, an9Var34.H));
        View view36 = this.Y;
        an9 an9Var35 = this.b;
        int i = an9Var35.H;
        StoryCameraMode storyCameraMode = StoryCameraMode.CLIPS;
        szb0Var.c(view36, (!W(i, storyCameraMode) || an9Var35.j() || an9Var35.p || an9Var35.q || an9Var35.r || !an9Var35.y || !an9Var35.M) ? this.U1 : this.V1);
        View view37 = this.Z;
        an9 an9Var36 = this.b;
        szb0Var.c(view37, (W(an9Var36.H, storyCameraMode) && an9Var36.i() && !an9Var36.p && an9Var36.y && an9Var36.M) ? this.X1 : this.W1);
        MasksWrap masksWrap = this.g;
        if (masksWrap != null && (groupedEffectView = masksWrap.getGroupedEffectView()) != null) {
            an9 an9Var37 = this.b;
            szb0Var.c(groupedEffectView, F(an9Var37, an9Var37.w));
        }
        MasksWrap masksWrap2 = this.g;
        if (masksWrap2 != null && (clipsGalleryListContainer = masksWrap2.getClipsGalleryListContainer()) != null) {
            an9 an9Var38 = this.b;
            szb0Var.c(clipsGalleryListContainer, F(an9Var38, an9Var38.x));
        }
        szb0Var.c(this.a0, z(this.b));
        View view38 = this.b0;
        an9 an9Var39 = this.b;
        szb0Var.c(view38, A(an9Var39, an9Var39.H));
        View view39 = this.c0;
        an9 an9Var40 = this.b;
        szb0Var.c(view39, E(an9Var40, an9Var40.H));
    }

    @Override // xsna.fm9
    public final p5p e() {
        return this.k;
    }

    @Override // xsna.fm9
    public final pe8 f() {
        return this.l;
    }

    @Override // xsna.fm9
    public final void g(View view) {
        this.i = view;
    }

    @Override // xsna.fm9
    public final an9 getState() {
        return this.b;
    }

    @Override // xsna.fm9
    public final void h(p5p p5pVar) {
        this.k = p5pVar;
    }

    @Override // xsna.fm9
    public final void i(StoryCameraParams storyCameraParams) {
        this.d = storyCameraParams;
    }

    @Override // xsna.fm9
    public final void j(View view) {
        this.h = view;
    }

    @Override // xsna.fm9
    public final void k(g8p0 g8p0Var) {
        this.j = g8p0Var;
    }

    public final void l() {
        View view = this.R;
        an9 an9Var = this.b;
        szb0.a s = s(an9Var, an9Var.H);
        hd hdVar = new hd(this, 11);
        szb0 szb0Var = this.f;
        szb0Var.e(view, s, true, hdVar);
        szb0Var.c(this.a0, z(this.b));
    }

    public final LinkedList<StoryCameraMode> m() {
        return this.c;
    }

    public final szb0.a n(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        return (an9Var.q || an9Var.p || this.c.get(i) != StoryCameraMode.LIVE) ? this.t0 : this.u0;
    }

    public final szb0.a o(an9 an9Var, int i) {
        float f = this.b.K ? -r2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        szb0.a aVar = this.D1;
        aVar.b = f;
        szb0.a aVar2 = this.C1;
        aVar2.b = f;
        return (W(i, StoryCameraMode.CLIPS) && an9Var.i() && !an9Var.p && an9Var.y) ? aVar : aVar2;
    }

    public final szb0.a p(an9 an9Var, int i) {
        return (!W(i, StoryCameraMode.CLIPS) || an9Var.j() || an9Var.p || an9Var.q || !an9Var.y || an9Var.L) ? this.S1 : this.T1;
    }

    public final szb0.a q(an9 an9Var, int i) {
        return (!W(i, StoryCameraMode.CLIPS) || !an9Var.j || an9Var.j() || an9Var.p || an9Var.q || !an9Var.y) ? this.Q1 : this.R1;
    }

    public final szb0.a r(an9 an9Var, int i) {
        return (!W(i, StoryCameraMode.CLIPS) || !an9Var.j || an9Var.j() || an9Var.p || an9Var.q || !an9Var.y) ? this.O1 : this.P1;
    }

    public final szb0.a s(an9 an9Var, int i) {
        if (!W(i, StoryCameraMode.CLIPS) || !an9Var.j || an9Var.j() || an9Var.p || an9Var.q || !an9Var.y) {
            return this.N1;
        }
        return szb0.a.a(this.B1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, an9Var.l ? 1.0f : q2, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
    }

    @Override // xsna.fm9
    public final void setBroadcast(pe8 pe8Var) {
        this.l = pe8Var;
    }

    public final szb0.a t(an9 an9Var, int i) {
        return (W(i, StoryCameraMode.CLIPS) && !an9Var.p && an9Var.y) ? this.M1 : this.L1;
    }

    public final szb0.a u(an9 an9Var, int i) {
        return (W(i, StoryCameraMode.CLIPS) && an9Var.i() && !an9Var.p && an9Var.k) ? this.F1 : this.E1;
    }

    public final szb0.a v(an9 an9Var, int i) {
        return (!W(i, StoryCameraMode.CLIPS) || !an9Var.i() || an9Var.p || an9Var.k) ? this.G1 : this.H1;
    }

    public final szb0.a w(an9 an9Var, int i) {
        return (W(i, StoryCameraMode.CLIPS) && an9Var.i() && !an9Var.p) ? an9Var.k ? this.I1 : this.K1 : this.J1;
    }

    @Override // xsna.fm9
    public final StoryCameraParams x() {
        StoryCameraParams storyCameraParams = this.d;
        if (storyCameraParams != null) {
            return storyCameraParams;
        }
        return null;
    }

    public final szb0.a y(an9 an9Var, int i) {
        if (i == -1) {
            return null;
        }
        return (an9Var.q || this.c.get(i) != StoryCameraMode.LIVE || an9Var.Y) ? this.J0 : this.I0;
    }

    public final szb0.a z(an9 an9Var) {
        boolean z = (!an9Var.U || an9Var.p || an9Var.q || an9Var.j()) ? false : true;
        b0();
        return z ? this.b2 : this.a2;
    }
}
