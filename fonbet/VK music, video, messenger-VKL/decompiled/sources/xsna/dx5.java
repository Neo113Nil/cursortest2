package xsna;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: Background.kt */
/* loaded from: classes11.dex */
public final class dx5 extends q630.c implements lio, hr70, fgi0 {
    public long p;
    public yk8 q;
    public float r;
    public r5j0 s;
    public long t;
    public LayoutDirection u;
    public androidx.compose.ui.graphics.c v;
    public r5j0 w;
    public androidx.compose.ui.graphics.c x;

    @Override // xsna.hr70
    public final void D1() {
        this.t = 9205357640488583168L;
        this.u = null;
        this.v = null;
        this.w = null;
        mio.a(this);
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        qgi0.p(tgi0Var, this.s);
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        androidx.compose.ui.graphics.c cVar;
        androidx.compose.ui.graphics.c cVar2;
        Path path;
        er9 er9Var = toyVar.b;
        if (this.s == androidx.compose.ui.graphics.e.a) {
            if (!l5g.d(this.p, l5g.k)) {
                oio.P(toyVar, this.p, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            yk8 yk8Var = this.q;
            if (yk8Var != null) {
                oio.x1(toyVar, yk8Var, 0L, 0L, this.r, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            }
        } else {
            if (mxj0.b(er9Var.d(), this.t) && toyVar.getLayoutDirection() == this.u && epx.f(this.w, this.s)) {
                cVar = this.v;
            } else {
                ir70.a(this, new rp1(2, this, toyVar));
                cVar = this.x;
                this.x = null;
            }
            this.v = cVar;
            this.t = er9Var.d();
            this.u = toyVar.getLayoutDirection();
            this.w = this.s;
            if (l5g.d(this.p, l5g.k)) {
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                androidx.compose.ui.graphics.d.c(toyVar, cVar2, this.p, null, 60);
            }
            yk8 yk8Var2 = this.q;
            if (yk8Var2 != null) {
                float f = this.r;
                if ((56 & 4) != 0) {
                    f = 1.0f;
                }
                float f2 = f;
                qbr qbrVar = qbr.a;
                if (cVar2 instanceof c.b) {
                    zhf0 zhf0Var = ((c.b) cVar2).a;
                    float f3 = zhf0Var.a;
                    float f4 = zhf0Var.b;
                    toyVar.t0(yk8Var2, (4294967295L & Float.floatToRawIntBits(f4)) | (Float.floatToRawIntBits(f3) << 32), androidx.compose.ui.graphics.d.d(zhf0Var), f2, qbrVar, null, 3);
                } else {
                    if (cVar2 instanceof c.C0013c) {
                        c.C0013c c0013c = (c.C0013c) cVar2;
                        path = c0013c.b;
                        if (path == null) {
                            aog0 aog0Var = c0013c.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (aog0Var.h >> 32));
                            float f5 = aog0Var.a;
                            float f6 = aog0Var.b;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            float b = aog0Var.b();
                            float a = aog0Var.a();
                            toyVar.T0(yk8Var2, floatToRawIntBits, (Float.floatToRawIntBits(a) & 4294967295L) | (Float.floatToRawIntBits(b) << 32), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f2, qbrVar, null, 3);
                        }
                    } else {
                        if (!(cVar2 instanceof c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        path = ((c.a) cVar2).a;
                    }
                    toyVar.B1(path, yk8Var2, f2, qbrVar, null, 3);
                }
            }
        }
        toyVar.s1();
    }

    @Override // xsna.fgi0
    public final boolean w1() {
        return false;
    }
}
