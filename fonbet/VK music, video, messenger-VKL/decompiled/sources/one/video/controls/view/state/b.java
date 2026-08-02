package one.video.controls.view.state;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.alp;
import xsna.cmq;
import xsna.d02;
import xsna.dz5;
import xsna.f370;
import xsna.fai;
import xsna.fsk;
import xsna.g3e0;
import xsna.his0;
import xsna.hs8;
import xsna.i35;
import xsna.ilk;
import xsna.jlk;
import xsna.kn4;
import xsna.l2u0;
import xsna.l3d0;
import xsna.mbu;
import xsna.n34;
import xsna.ojz;
import xsna.ozb0;
import xsna.qso0;
import xsna.rxu;
import xsna.s101;
import xsna.s1v;
import xsna.s6s;
import xsna.smz;
import xsna.sni;
import xsna.sp;
import xsna.tci;
import xsna.u3i0;
import xsna.v3i0;
import xsna.w170;
import xsna.w6y0;
import xsna.zfg0;
import xsna.znk0;

/* compiled from: ViewVisibilityAlphaAnimationState.kt */
/* loaded from: classes8.dex */
public final class b {
    public static final l2u0 a(l2u0 l2u0Var, boolean z) {
        if (l2u0Var instanceof PlayPauseButtonViewState) {
            return a.a((PlayPauseButtonViewState) l2u0Var, false, z, null, 5);
        }
        if (l2u0Var instanceof hs8) {
            return n34.j((hs8) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof s6s) {
            return fai.i((s6s) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof rxu) {
            return sni.e((rxu) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof zfg0) {
            return dz5.q((zfg0) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof g3e0) {
            return znk0.h((g3e0) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof qso0) {
            return sp.k((qso0) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof ozb0) {
            return fsk.p((ozb0) l2u0Var, false, z, 0, 0, 13);
        }
        if (l2u0Var instanceof w170) {
            return d02.q((w170) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof l3d0) {
            return s101.k((l3d0) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof u3i0) {
            return v3i0.a((u3i0) l2u0Var, false, z, null, null, 0L, 0L, 61);
        }
        if (l2u0Var instanceof ilk) {
            return jlk.a((ilk) l2u0Var, false, z, null, 0, 0, false, null, null, null, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
        }
        if (l2u0Var instanceof mbu) {
            return his0.e((mbu) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof w6y0) {
            return s1v.d((w6y0) l2u0Var, false, z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5);
        }
        if (l2u0Var instanceof cmq) {
            return kn4.h((cmq) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof smz) {
            return f370.j((smz) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof ojz) {
            return tci.g((ojz) l2u0Var, false, z, 1);
        }
        if (l2u0Var instanceof alp) {
            return i35.d((alp) l2u0Var, false, z, 1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
