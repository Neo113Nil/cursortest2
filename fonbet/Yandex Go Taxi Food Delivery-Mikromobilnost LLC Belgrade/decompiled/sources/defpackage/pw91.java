package defpackage;

import android.graphics.Matrix;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsStatus$OnlineStatus;
import com.yx360.design.compose.atoms.DsStatus$Preset;
import com.yx360.design.compose.atoms.DsStatus$Size;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class pw91 {
    public static final void a(dtm dtmVar, DsStatus$Size dsStatus$Size, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(806802701);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dtmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(dsStatus$Size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else if (dtmVar instanceof ctm) {
            btsVar.e0(822465092);
            btsVar.e0(-2051676388);
            btsVar.e0(507373633);
            qnm qnmVar = qnm.a;
            long j0 = qnm.c(btsVar).j0();
            btsVar.t(false);
            btsVar.t(false);
            btsVar.e0(-2051673856);
            btsVar.e0(1673126415);
            long v = qnm.c(btsVar).v();
            btsVar.t(false);
            btsVar.t(false);
            btsVar.e0(-2051671098);
            btsVar.e0(808139929);
            long a = qnm.c(btsVar).a();
            btsVar.t(false);
            btsVar.t(false);
            d(dsStatus$Size, f530Var, null, j0, v, a, btsVar, (i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD, 0);
            btsVar.t(false);
        } else if (dtmVar instanceof DsStatus$Preset) {
            btsVar.e0(822885731);
            c((DsStatus$Preset) dtmVar, dsStatus$Size, f530Var, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            btsVar.t(false);
        } else {
            if (!(dtmVar instanceof DsStatus$OnlineStatus)) {
                throw unr0.y(-2051680157, btsVar, false);
            }
            btsVar.e0(823068259);
            b((DsStatus$OnlineStatus) dtmVar, dsStatus$Size, f530Var, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            btsVar.t(false);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new etm(dtmVar, dsStatus$Size, f530Var, i, 0);
        }
    }

    public static final void b(DsStatus$OnlineStatus dsStatus$OnlineStatus, DsStatus$Size dsStatus$Size, f530 f530Var, fid fidVar, int i) {
        int i2;
        long w;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-532036550);
        if ((i & 6) == 0) {
            i2 = (btsVar.c(dsStatus$OnlineStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(dsStatus$Size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            int i3 = gtm.c[dsStatus$OnlineStatus.ordinal()];
            if (i3 == 1) {
                btsVar.e0(-186009911);
                qnm qnmVar = qnm.a;
                w = qnm.c(btsVar).w();
                btsVar.t(false);
            } else if (i3 == 2) {
                btsVar.e0(-186007895);
                qnm qnmVar2 = qnm.a;
                w = qnm.c(btsVar).q();
                btsVar.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(-186011794, btsVar, false);
                }
                btsVar.e0(-186005879);
                qnm qnmVar3 = qnm.a;
                w = qnm.c(btsVar).D();
                btsVar.t(false);
            }
            d(dsStatus$Size, f530Var, null, 0L, w, 0L, btsVar, (i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD, 44);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(dsStatus$OnlineStatus, dsStatus$Size, f530Var, i, 2);
        }
    }

    public static final void c(DsStatus$Preset dsStatus$Preset, DsStatus$Size dsStatus$Size, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        long N;
        mgv h;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1867576704);
        if ((i & 6) == 0) {
            i2 = (btsVar.c(dsStatus$Preset.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(dsStatus$Size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 256 : 128;
        } else {
            f530Var2 = f530Var;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            int i3 = gtm.b[dsStatus$Preset.ordinal()];
            if (i3 == 1) {
                btsVar.e0(-28526492);
                qnm qnmVar = qnm.a;
                N = qnm.c(btsVar).N();
                int i4 = gtm.a[dsStatus$Size.ordinal()];
                if (i4 == 1) {
                    h = cpb1.h();
                } else if (i4 == 2) {
                    h = cpb1.h();
                } else if (i4 == 3) {
                    h = bpb1.a;
                    if (h == null) {
                        lgv lgvVar = new lgv("TickOutlineXs", 12.0f, 12.0f, 12.0f, 12.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 g = tse0.g(11.431f, 3.807f, 5.275f, 10.234f);
                        g.h(1.072f, 6.024f);
                        g.h(2.134f, 4.965f);
                        g.h(5.253f, 8.089f);
                        tse0.u(g, 10.347f, 2.77f, 11.431f, 3.807f);
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
                        h = lgvVar.d();
                        bpb1.a = h;
                    }
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return;
                    }
                    h = zob1.f();
                }
                btsVar.t(false);
            } else if (i3 == 2) {
                btsVar.e0(-28144479);
                qnm qnmVar2 = qnm.a;
                N = qnm.c(btsVar).G();
                int i5 = gtm.a[dsStatus$Size.ordinal()];
                if (i5 == 1) {
                    h = imb1.b();
                } else if (i5 == 2) {
                    h = imb1.b();
                } else if (i5 == 3) {
                    h = gmb1.a;
                    if (h == null) {
                        lgv lgvVar2 = new lgv("MinusOutlineXs", 12.0f, 12.0f, 12.0f, 12.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var2 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 uq90Var = new uq90();
                        uq90Var.j(11.0f, 6.75f);
                        uq90Var.f(1.0f);
                        uq90Var.o(5.25f);
                        uq90Var.f(11.0f);
                        uq90Var.o(6.75f);
                        uq90Var.c();
                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", uq90Var.a);
                        h = lgvVar2.d();
                        gmb1.a = h;
                    }
                } else {
                    if (i5 != 4) {
                        w511.b();
                        return;
                    }
                    h = fmb1.k();
                }
                btsVar.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(-555110323, btsVar, false);
                }
                btsVar.e0(-27758188);
                qnm qnmVar3 = qnm.a;
                N = qnm.c(btsVar).L();
                int i6 = gtm.a[dsStatus$Size.ordinal()];
                if (i6 == 1) {
                    h = vfa1.c();
                } else if (i6 == 2) {
                    h = vfa1.c();
                } else if (i6 == 3) {
                    h = qfa1.d;
                    if (h == null) {
                        lgv lgvVar3 = new lgv("QuestionOutlineXs", 12.0f, 12.0f, 12.0f, 12.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var3 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 e = nnm.e(6.429f, 9.0f);
                        e.d(6.981f, 9.0f, 7.429f, 9.448f, 7.429f, 10.0f);
                        e.d(7.429f, 10.552f, 6.981f, 11.0f, 6.429f, 11.0f);
                        e.d(5.876f, 11.0f, 5.429f, 10.552f, 5.429f, 10.0f);
                        e.d(5.429f, 9.448f, 5.876f, 9.0f, 6.429f, 9.0f);
                        e.c();
                        e.j(6.429f, 1.0f);
                        e.d(7.189f, 1.0f, 8.009f, 1.161f, 8.665f, 1.567f);
                        e.d(9.352f, 1.993f, 9.857f, 2.695f, 9.857f, 3.664f);
                        e.o(3.938f);
                        e.d(9.853f, 4.24f, 9.818f, 4.614f, 9.625f, 4.997f);
                        e.d(9.403f, 5.436f, 9.014f, 5.821f, 8.436f, 6.224f);
                        e.h(8.176f, 6.397f);
                        e.d(7.577f, 6.785f, 7.383f, 6.986f, 7.297f, 7.138f);
                        e.d(7.22f, 7.273f, 7.179f, 7.455f, 7.179f, 8.0f);
                        e.f(5.679f);
                        e.d(5.679f, 7.451f, 5.703f, 6.908f, 5.993f, 6.396f);
                        e.d(6.274f, 5.901f, 6.75f, 5.534f, 7.36f, 5.139f);
                        e.h(7.586f, 4.987f);
                        e.d(8.065f, 4.653f, 8.224f, 4.444f, 8.286f, 4.321f);
                        e.d(8.353f, 4.189f, 8.358f, 4.08f, 8.357f, 3.665f);
                        e.d(8.357f, 3.295f, 8.192f, 3.039f, 7.875f, 2.843f);
                        e.d(7.527f, 2.627f, 7.007f, 2.5f, 6.429f, 2.5f);
                        e.d(5.819f, 2.5f, 5.325f, 2.606f, 5.003f, 2.82f);
                        e.d(4.735f, 2.999f, 4.5f, 3.308f, 4.5f, 3.982f);
                        e.f(3.0f);
                        e.d(3.0f, 2.871f, 3.435f, 2.063f, 4.171f, 1.572f);
                        e.d(4.854f, 1.117f, 5.699f, 1.0f, 6.429f, 1.0f);
                        e.c();
                        lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var3, null, "", e.a);
                        h = lgvVar3.d();
                        qfa1.d = h;
                    }
                } else {
                    if (i6 != 4) {
                        w511.b();
                        return;
                    }
                    h = tea1.e;
                    if (h == null) {
                        lgv lgvVar4 = new lgv("QuestionOutlineSm", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var4 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                        uq90 e2 = nnm.e(8.07f, 11.501f);
                        e2.d(8.761f, 11.501f, 9.32f, 12.061f, 9.32f, 12.751f);
                        e2.d(9.32f, 13.441f, 8.761f, 14.001f, 8.07f, 14.001f);
                        e2.d(7.38f, 14.001f, 6.82f, 13.441f, 6.82f, 12.751f);
                        e2.d(6.82f, 12.061f, 7.38f, 11.501f, 8.07f, 11.501f);
                        e2.c();
                        e2.j(8.07f, 2.001f);
                        e2.d(8.991f, 2.001f, 9.972f, 2.196f, 10.748f, 2.677f);
                        e2.d(11.555f, 3.177f, 12.14f, 3.994f, 12.141f, 5.123f);
                        e2.o(5.462f);
                        e2.d(12.135f, 5.825f, 12.094f, 6.255f, 11.872f, 6.695f);
                        e2.d(11.616f, 7.202f, 11.161f, 7.656f, 10.456f, 8.147f);
                        e2.h(10.138f, 8.361f);
                        e2.d(9.395f, 8.842f, 9.12f, 9.111f, 8.99f, 9.34f);
                        e2.d(8.869f, 9.553f, 8.82f, 9.822f, 8.82f, 10.498f);
                        e2.f(7.32f);
                        e2.d(7.32f, 9.818f, 7.352f, 9.187f, 7.687f, 8.599f);
                        e2.d(8.012f, 8.026f, 8.568f, 7.59f, 9.323f, 7.102f);
                        e2.h(9.606f, 6.911f);
                        e2.d(10.211f, 6.488f, 10.437f, 6.21f, 10.533f, 6.02f);
                        e2.d(10.639f, 5.811f, 10.641f, 5.629f, 10.641f, 5.124f);
                        e2.h(10.629f, 4.932f);
                        e2.d(10.576f, 4.502f, 10.341f, 4.189f, 9.958f, 3.952f);
                        e2.d(9.49f, 3.662f, 8.809f, 3.501f, 8.07f, 3.501f);
                        e2.d(7.3f, 3.501f, 6.645f, 3.634f, 6.203f, 3.929f);
                        e2.d(5.815f, 4.188f, 5.5f, 4.63f, 5.5f, 5.518f);
                        e2.f(4.0f);
                        e2.d(4.0f, 4.193f, 4.515f, 3.252f, 5.371f, 2.681f);
                        e2.d(6.174f, 2.145f, 7.181f, 2.001f, 8.07f, 2.001f);
                        e2.c();
                        lgvVar4.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var4, null, "", e2.a);
                        h = lgvVar4.d();
                        tea1.e = h;
                    }
                }
                btsVar.t(false);
            }
            d(dsStatus$Size, f530Var2, ba91.c(h, btsVar), 0L, N, 0L, btsVar, ((i2 >> 3) & HProv.PP_DELETE_SAVED_PASSWD) | 512, 40);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(dsStatus$Preset, dsStatus$Size, f530Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final DsStatus$Size dsStatus$Size, final f530 f530Var, pa90 pa90Var, long j, final long j2, long j3, fid fidVar, final int i, final int i2) {
        int i3;
        pa90 pa90Var2;
        long j4;
        long j5;
        long j6;
        pa90 pa90Var3;
        long j7;
        long j8;
        int i4;
        float f;
        float f2;
        pa90 pa90Var4;
        bts btsVar;
        long j9;
        boolean z;
        final long j10;
        final pa90 pa90Var5;
        final long j11;
        int i5;
        int i6;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1407345281);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i3 = (btsVar2.c(dsStatus$Size.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            pa90Var2 = pa90Var;
            i3 |= btsVar2.e(pa90Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j;
                    if (btsVar2.d(j4)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j4 = j;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j4 = j;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.d(j2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    j5 = j3;
                    if (btsVar2.d(j5)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    j5 = j3;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                j5 = j3;
            }
            if ((74899 & i3) == 74898 || !btsVar2.E()) {
                btsVar2.a0();
                if ((i & 1) != 0 || btsVar2.C()) {
                    if (i7 != 0) {
                        pa90Var2 = null;
                    }
                    if ((i2 & 8) == 0) {
                        btsVar2.e0(507373633);
                        qnm qnmVar = qnm.a;
                        j6 = qnm.c(btsVar2).j0();
                        btsVar2.t(false);
                        i3 &= -7169;
                    } else {
                        j6 = j;
                    }
                    if ((i2 & 32) != 0) {
                        btsVar2.e0(808139929);
                        qnm qnmVar2 = qnm.a;
                        j5 = qnm.c(btsVar2).a();
                        btsVar2.t(false);
                        i3 &= -458753;
                    }
                    pa90Var3 = pa90Var2;
                    j7 = j5;
                    j8 = j6;
                } else {
                    btsVar2.Y();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    pa90Var3 = pa90Var2;
                    j7 = j5;
                    j8 = j;
                }
                btsVar2.u();
                i4 = gtm.a[dsStatus$Size.ordinal()];
                if (i4 != 1) {
                    qnm.c.getClass();
                    f = 10.0f;
                    f2 = 8.0f;
                } else if (i4 == 2) {
                    qnm.c.getClass();
                    f = 14.0f;
                    f2 = 12.0f;
                } else if (i4 == 3) {
                    qnm.c.getClass();
                    f = 20.0f;
                    f2 = 16.0f;
                } else if (i4 != 4) {
                    w511.b();
                    return;
                } else {
                    qnm.c.getClass();
                    f = 28.0f;
                    f2 = 24.0f;
                }
                byk0 byk0Var = cyk0.a;
                f530 m = ljs0.m(ymb1.l(f530Var, byk0Var), f);
                gji0 gji0Var = qke.q;
                f530 b = m4m0.b(m, j7, gji0Var);
                uo5 uo5Var = x4c.y;
                long j12 = j7;
                z910 d = pi6.d(uo5Var, false);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d2 = b.d(btsVar2, b);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var != null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                pa90 pa90Var6 = pa90Var3;
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar2, wlsVar, d);
                wls wlsVar2 = d.e;
                qje.W(btsVar2, wlsVar2, o);
                wls wlsVar3 = d.g;
                long j13 = j8;
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                }
                wls wlsVar4 = d.d;
                qje.W(btsVar2, wlsVar4, d2);
                f530 b2 = m4m0.b(ljs0.m(ymb1.l(c530.a, byk0Var), f2), j2, gji0Var);
                z910 d3 = pi6.d(uo5Var, false);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o2 = btsVar2.o();
                f530 d4 = b.d(btsVar2, b2);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, d3);
                qje.W(btsVar2, wlsVar2, o2);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
                }
                qje.W(btsVar2, wlsVar4, d4);
                btsVar2.e0(1879668559);
                if (pa90Var6 != null) {
                    j9 = j13;
                    pa90Var4 = pa90Var6;
                    z = true;
                    q4v.b(pa90Var4, null, null, j9, btsVar2, ((i3 >> 6) & 14) | 48 | (i3 & 7168), 4);
                    btsVar = btsVar2;
                } else {
                    pa90Var4 = pa90Var6;
                    btsVar = btsVar2;
                    j9 = j13;
                    z = true;
                }
                tse0.t(btsVar, false, z, z);
                j10 = j12;
                pa90Var5 = pa90Var4;
                j11 = j9;
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
                pa90Var5 = pa90Var2;
                j11 = j4;
                j10 = j5;
            }
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new wls() { // from class: ftm
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pw91.d(DsStatus$Size.this, f530Var, pa90Var5, j11, j2, j10, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        pa90Var2 = pa90Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        btsVar2.a0();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        pa90Var3 = pa90Var2;
        j7 = j5;
        j8 = j6;
        btsVar2.u();
        i4 = gtm.a[dsStatus$Size.ordinal()];
        if (i4 != 1) {
        }
        byk0 byk0Var2 = cyk0.a;
        f530 m2 = ljs0.m(ymb1.l(f530Var, byk0Var2), f);
        gji0 gji0Var2 = qke.q;
        f530 b3 = m4m0.b(m2, j7, gji0Var2);
        uo5 uo5Var2 = x4c.y;
        long j122 = j7;
        z910 d5 = pi6.d(uo5Var2, false);
        int hashCode3 = Long.hashCode(btsVar2.T);
        r1b0 o3 = btsVar2.o();
        f530 d22 = b.d(btsVar2, b3);
        ohd.G1.getClass();
        sls slsVar2 = d.b;
        if (dmw0Var != null) {
        }
    }

    public static final long g(float f, long j) {
        return ior.a(j(j) / f, k(j) / f);
    }

    public static final float h(long j, long j2) {
        return (k(j2) * k(j)) + (j(j2) * j(j));
    }

    public static final long i(long j) {
        float sqrt = (float) Math.sqrt((k(j) * k(j)) + (j(j) * j(j)));
        if (sqrt > 0.0f) {
            return g(sqrt, j);
        }
        ny61.g("Can't get the direction of a 0-length vector");
        return 0L;
    }

    public static final float j(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float k(long j) {
        return Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static f530 l(f530 f530Var, oip0 oip0Var, int i) {
        return p(f530Var, oip0Var, (i & 2) != 0, false);
    }

    public static final long m(long j, long j2) {
        return ior.a(j(j) - j(j2), k(j) - k(j2));
    }

    public static final long n(long j, long j2) {
        return ior.a(j(j2) + j(j), k(j2) + k(j));
    }

    public static final oip0 o(fid fidVar) {
        Object[] objArr = new Object[0];
        boolean c = fidVar.c(0);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (c || Q == did.a) {
            Q = new c6p0(17);
            btsVar.o0(Q);
        }
        return (oip0) cvw.W(objArr, oip0.j, (sls) Q, btsVar, 0);
    }

    public static f530 p(f530 f530Var, oip0 oip0Var, boolean z, boolean z2) {
        Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
        return lnb1.a(f530Var, orientation).k(new tjp0(null, null, oip0Var.d, oip0Var, null, orientation, z, true)).k(new blp0(oip0Var, z2));
    }

    public static final long r(float f, long j) {
        return ior.a(j(j) * f, k(j) * f);
    }

    public static final long t(long j, krl0 krl0Var) {
        float j2 = j(j);
        float k = k(j);
        float[] fArr = (float[]) krl0Var.a;
        fArr[0] = j2;
        fArr[1] = k;
        ((Matrix) krl0Var.b).mapPoints(fArr);
        long a = ior.a(fArr[0], fArr[1]);
        return ior.a(Float.intBitsToFloat((int) (a >> 32)), Float.intBitsToFloat((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public static f530 u(f530 f530Var, oip0 oip0Var, int i) {
        return p(f530Var, oip0Var, (i & 2) != 0, true);
    }

    public abstract Integer e();

    public abstract String f();

    public abstract int q();

    public abstract int s(ek51 ek51Var);
}
