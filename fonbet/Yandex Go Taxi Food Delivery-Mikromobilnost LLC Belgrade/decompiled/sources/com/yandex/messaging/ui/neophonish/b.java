package com.yandex.messaging.ui.neophonish;

import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.ui.neophonish.b;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.inlineNotification.DsInlineNotification$Tone;
import defpackage.a6t0;
import defpackage.aii0;
import defpackage.am50;
import defpackage.an91;
import defpackage.ba91;
import defpackage.bts;
import defpackage.c530;
import defpackage.c720;
import defpackage.cms;
import defpackage.di9;
import defpackage.did;
import defpackage.ds31;
import defpackage.f530;
import defpackage.fid;
import defpackage.fm50;
import defpackage.fqm;
import defpackage.g720;
import defpackage.gm50;
import defpackage.h6b1;
import defpackage.hs31;
import defpackage.i7f;
import defpackage.jjo;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.kla1;
import defpackage.lgv;
import defpackage.ljs0;
import defpackage.mfu;
import defpackage.mgv;
import defpackage.mo91;
import defpackage.mtm;
import defpackage.nc0;
import defpackage.nm50;
import defpackage.nnm;
import defpackage.ohb1;
import defpackage.om50;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.q7u;
import defpackage.qnm;
import defpackage.qoi0;
import defpackage.qrm;
import defpackage.rs31;
import defpackage.rzo;
import defpackage.sls;
import defpackage.squ;
import defpackage.srm;
import defpackage.t420;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tm50;
import defpackage.tse;
import defpackage.uq90;
import defpackage.ut91;
import defpackage.v620;
import defpackage.vfc;
import defpackage.vl5;
import defpackage.w4;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wwg0;
import defpackage.x3;
import defpackage.xl50;
import defpackage.xs4;
import defpackage.yd00;
import defpackage.yl50;
import defpackage.yr31;
import defpackage.yrm;
import defpackage.zl50;
import defpackage.zpn;
import defpackage.zwv;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import skeletor.render.SkeletonContentView;

/* loaded from: classes15.dex */
public abstract class b {
    public static final void a(int i, sls slsVar, DsButton$Style dsButton$Style, x3 x3Var, fid fidVar, int i2, int i3) {
        int i4;
        bts btsVar;
        x3 x3Var2;
        x3 x3Var3 = x3Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(922764948);
        int i5 = (btsVar2.c(i) ? 4 : 2) | i2 | (btsVar2.e(slsVar) ? 32 : 16);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | HProv.ALG_TYPE_SECURECHANNEL;
        } else {
            i4 = i5 | ((i2 & 4096) == 0 ? btsVar2.k(x3Var3) : btsVar2.e(x3Var3) ? 2048 : 1024);
        }
        if ((i4 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            x3Var2 = x3Var3;
            btsVar = btsVar2;
        } else {
            if (i6 != 0) {
                x3Var3 = null;
            }
            x3 x3Var4 = x3Var3;
            String e = ohb1.e(btsVar2, i);
            DsButton$Size dsButton$Size = DsButton$Size.Lg;
            f530 c = ljs0.c(c530.a, 1.0f);
            qnm.d.getClass();
            btsVar = btsVar2;
            mo91.e(e, slsVar, dsButton$Style, an91.m(c, 16.0f, 0.0f, 2), dsButton$Size, x3Var4, null, false, null, false, btsVar, (i4 & 112) | 100950400 | ((i4 << 6) & ImageMetadata.JPEG_GPS_COORDINATES), 0, MSException.RPC_S_PROTOCOL_ERROR);
            x3Var2 = x3Var4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nm50(i, slsVar, dsButton$Style, x3Var2, i2, i3);
        }
    }

    public static final void b(f530 f530Var, qrm qrmVar, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        f530 f530Var2;
        int i2;
        sls slsVar4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1176379877);
        if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i2 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(qrmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            slsVar4 = slsVar;
            i2 |= btsVar2.e(slsVar4) ? 256 : 128;
        } else {
            slsVar4 = slsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(slsVar3) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            sls slsVar5 = slsVar4;
            com.yx360.design.compose.atoms.modal.a.a(slsVar5, f530Var2, srm.a, null, null, null, null, qrmVar, wwg.S(820068249, true, new xs4(6, slsVar2, slsVar3), btsVar2), btsVar, ((i2 >> 6) & 14) | 805306368 | ((i2 << 3) & 112) | ((i2 << 21) & 234881024), 248);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, (Object) qrmVar, (Object) slsVar, (Object) slsVar2, (Object) slsVar3, i, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void c(xl50 xl50Var, f530 f530Var, fm50 fm50Var, sls slsVar, fid fidVar, int i) {
        int i2;
        int i3;
        final fm50 fm50Var2;
        Object jo0Var;
        ?? r12;
        fm50 fm50Var3;
        fm50 fm50Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(506578606);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(xl50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            fm50Var4 = fm50Var;
        } else {
            btsVar.a0();
            int i5 = i & 1;
            Object obj = did.a;
            int i6 = 0;
            if (i5 == 0 || btsVar.C()) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e || Q == obj) {
                    Q = new w4(a, i4);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(fm50.class), b, null, vfc.h(fm50.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                i3 = i2 & (-897);
                fm50Var2 = (fm50) G;
            } else {
                btsVar.Y();
                i3 = i2 & (-897);
                fm50Var2 = fm50Var;
            }
            int i7 = i3;
            btsVar.u();
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q2);
            }
            tse tseVar = (tse) Q2;
            qrm f = yrm.f(btsVar);
            btsVar.e0(-557585505);
            boolean e2 = btsVar.e(tseVar) | btsVar.k(f) | ((i7 & 7168) == 2048);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == obj) {
                Q3 = new yl50(tseVar, f, slsVar, i6);
                btsVar.o0(Q3);
            }
            sls slsVar2 = (sls) Q3;
            btsVar.t(false);
            com.yandex.messaging.auth.passport.b bVar = fm50Var2.z.b;
            yd00 yd00Var = null;
            mfu mfuVar = bVar == null ? null : new mfu(bVar.b.q().a());
            btsVar.e0(-557579706);
            if (mfuVar != null) {
                btsVar.e0(146427577);
                boolean e3 = btsVar.e(fm50Var2) | btsVar.k(slsVar2);
                Object Q4 = btsVar.Q();
                if (e3 || Q4 == obj) {
                    Q4 = new zl50(i6, fm50Var2, slsVar2);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                yd00Var = kla1.e(mfuVar, (tls) Q4, btsVar, 0);
            }
            yd00 yd00Var2 = yd00Var;
            btsVar.t(false);
            i7f i7fVar = new i7f();
            btsVar.e0(-557570631);
            boolean e4 = btsVar.e(fm50Var2);
            Object Q5 = btsVar.Q();
            if (e4 || Q5 == obj) {
                Q5 = new tls() { // from class: com.yandex.messaging.ui.neophonish.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        PollMessageDraft pollMessageDraft = (PollMessageDraft) obj2;
                        if (pollMessageDraft != null) {
                            fm50 fm50Var5 = fm50.this;
                            tje.N(ds31.a(fm50Var5), null, null, new NeophonishAttachMenuViewModel$onPollCreated$1(fm50Var5, pollMessageDraft, null), 3);
                        }
                        return zy11.a;
                    }
                };
                btsVar.o0(Q5);
            }
            btsVar.t(false);
            yd00 e5 = kla1.e(i7fVar, (tls) Q5, btsVar, 0);
            btsVar.e0(-557567617);
            boolean e6 = btsVar.e(xl50Var) | btsVar.e(tseVar) | btsVar.k(f) | btsVar.e(e5);
            Object Q6 = btsVar.Q();
            if (e6 || Q6 == obj) {
                r12 = 0;
                jo0Var = new jo0(xl50Var, tseVar, f, e5, 25);
                btsVar.o0(jo0Var);
            } else {
                jo0Var = Q6;
                r12 = 0;
            }
            sls slsVar3 = (sls) jo0Var;
            btsVar.t(r12);
            di9 di9Var = fm50Var2.c;
            btsVar.e0(-557559729);
            boolean k = btsVar.k(slsVar2) | btsVar.e(yd00Var2);
            Object Q7 = btsVar.Q();
            if (k || Q7 == obj) {
                Q7 = new am50(slsVar2, yd00Var2, r12);
                btsVar.o0(Q7);
            }
            btsVar.t(r12);
            com.yandex.messaging.core.ui.a.a(di9Var, (tls) Q7, btsVar, r12);
            btsVar.e0(-557546707);
            boolean e7 = btsVar.e(fm50Var2);
            Object Q8 = btsVar.Q();
            if (e7 || Q8 == obj) {
                fm50Var3 = fm50Var2;
                Q8 = new NeophonishAttachMenuScreenKt$NeophonishAttachMenuRoot$2$1(0, fm50Var3, fm50.class, "onGoToYandexId", "onGoToYandexId()V", 0);
                btsVar.o0(Q8);
            } else {
                fm50Var3 = fm50Var2;
            }
            btsVar.t(r12);
            b(f530Var, f, slsVar2, (sls) ((tfx) Q8), slsVar3, btsVar, (i7 >> 3) & 14);
            fm50Var4 = fm50Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) xl50Var, f530Var, (Object) fm50Var4, (cms) slsVar, i, 21);
        }
    }

    public static final void d(final f530 f530Var, final sls slsVar, final qrm qrmVar, final sls slsVar2, final sls slsVar3, final int i, final int i2, fid fidVar, final int i3) {
        int i4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1612260239);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.k(f530Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar2.k(qrmVar) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.e(slsVar3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= btsVar2.c(i) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= btsVar2.c(i2) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            com.yx360.design.compose.atoms.modal.a.a(slsVar, f530Var, srm.a, null, null, null, null, qrmVar, wwg.S(408618533, true, new om50(i2, i, slsVar2, slsVar3), btsVar2), btsVar, ((i4 >> 3) & 14) | 805306368 | ((i4 << 3) & 112) | ((i4 << 18) & 234881024), 248);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: mm50
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.d(f530.this, slsVar, qrmVar, slsVar2, slsVar3, i, i2, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void e(gm50 gm50Var, f530 f530Var, tm50 tm50Var, sls slsVar, int i, fid fidVar, int i2) {
        tm50 tm50Var2;
        int i3;
        int i4;
        f530 f530Var2;
        yd00 e;
        tm50 tm50Var3;
        tfx tfxVar;
        f530 f530Var3;
        tm50 tm50Var4;
        int i5;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1522829855);
        int i6 = i2 | (btsVar.e(gm50Var) ? 4 : 2) | 176 | (btsVar.e(slsVar) ? 2048 : 1024) | 8192;
        if ((i6 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            f530Var3 = f530Var;
            tm50Var4 = tm50Var;
            i5 = i;
        } else {
            btsVar.a0();
            int i7 = i2 & 1;
            Object obj2 = did.a;
            if (i7 == 0 || btsVar.C()) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e2 = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e2 || Q == obj2) {
                    Q = new w4(a, 17);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(tm50.class), b, null, vfc.h(tm50.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                tm50Var2 = (tm50) G;
                g720 g720Var = gm50Var.a;
                i3 = i6 & (-58241);
                i4 = jl40.l(g720Var, t420.d) ? oyh0.neophonish_upgrade_schedule_call_title : jl40.l(g720Var, c720.d) ? oyh0.neophonish_upgrade_dialog_title : jl40.l(g720Var, v620.d) ? oyh0.neophonish_upgrade_schedule_call_title : oyh0.neophonish_upgrade_dialog_title;
                f530Var2 = c530.a;
            } else {
                btsVar.Y();
                f530Var2 = f530Var;
                tm50Var2 = tm50Var;
                i3 = i6 & (-58241);
                i4 = i;
            }
            btsVar.u();
            qnm qnmVar = qnm.a;
            int i8 = ((Boolean) btsVar.m(mtm.d)).booleanValue() ? wwg0.tm_neophonish_upgrade_dark : wwg0.tm_neophonish_upgrade;
            Object Q2 = btsVar.Q();
            if (Q2 == obj2) {
                Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q2);
            }
            tse tseVar = (tse) Q2;
            qrm f = yrm.f(btsVar);
            btsVar.e0(876999395);
            int i9 = 1;
            boolean e3 = ((i3 & 7168) == 2048) | btsVar.e(tseVar) | btsVar.k(f);
            Object Q3 = btsVar.Q();
            if (e3 || Q3 == obj2) {
                Q3 = new yl50(tseVar, f, slsVar, i9);
                btsVar.o0(Q3);
            }
            sls slsVar2 = (sls) Q3;
            btsVar.t(false);
            com.yandex.messaging.auth.passport.b bVar = tm50Var2.z.b;
            mfu mfuVar = bVar == null ? null : new mfu(bVar.b.q().a());
            btsVar.e0(877005194);
            if (mfuVar == null) {
                e = null;
            } else {
                btsVar.e0(1092657149);
                boolean e4 = btsVar.e(tm50Var2) | btsVar.k(slsVar2);
                Object Q4 = btsVar.Q();
                if (e4 || Q4 == obj2) {
                    Q4 = new zl50(i9, tm50Var2, slsVar2);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                e = kla1.e(mfuVar, (tls) Q4, btsVar, 0);
            }
            btsVar.t(false);
            di9 di9Var = tm50Var2.c;
            btsVar.e0(877012301);
            boolean k = btsVar.k(slsVar2) | btsVar.e(e);
            Object Q5 = btsVar.Q();
            if (k || Q5 == obj2) {
                Q5 = new am50(slsVar2, e, 1);
                btsVar.o0(Q5);
            }
            btsVar.t(false);
            com.yandex.messaging.core.ui.a.a(di9Var, (tls) Q5, btsVar, 0);
            btsVar.e0(877025272);
            boolean e5 = btsVar.e(tm50Var2);
            Object Q6 = btsVar.Q();
            if (e5 || Q6 == obj2) {
                Object neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$2$1 = new NeophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$2$1(0, tm50Var2, tm50.class, "onUpgradeAccountClick", "onUpgradeAccountClick()V", 0);
                btsVar.o0(neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$2$1);
                Q6 = neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$2$1;
            }
            tfx tfxVar2 = (tfx) Q6;
            btsVar.t(false);
            btsVar.e0(877027394);
            if (gm50Var.b == null || gm50Var.c == null) {
                tm50Var3 = tm50Var2;
                tfxVar = null;
            } else {
                btsVar.e0(877028562);
                boolean e6 = btsVar.e(tm50Var2);
                Object Q7 = btsVar.Q();
                if (e6 || Q7 == obj2) {
                    tm50Var3 = tm50Var2;
                    Object neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$3$1 = new NeophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$3$1(0, tm50Var3, tm50.class, "onCancelSending", "onCancelSending()V", 0);
                    btsVar.o0(neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$3$1);
                    obj = neophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$3$1;
                } else {
                    tm50Var3 = tm50Var2;
                    obj = Q7;
                }
                tfxVar = (tfx) obj;
                btsVar.t(false);
            }
            btsVar.t(false);
            d(f530Var2, slsVar2, f, (sls) tfxVar2, (sls) tfxVar, i4, i8, btsVar, 6);
            btsVar = btsVar;
            f530Var3 = f530Var2;
            tm50Var4 = tm50Var3;
            i5 = i4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(gm50Var, f530Var3, tm50Var4, slsVar, i5, i2);
        }
    }

    public static final void f(int i, fid fidVar, sls slsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-777541564);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            DsInlineNotification$Tone dsInlineNotification$Tone = DsInlineNotification$Tone.Neutral;
            qnm qnmVar = qnm.a;
            mgv mgvVar = h6b1.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("InfoOutlineMdRegular", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e = nnm.e(10.75f, 7.042f);
                e.d(10.75f, 7.732f, 11.31f, 8.292f, 12.0f, 8.292f);
                e.d(12.69f, 8.292f, 13.25f, 7.732f, 13.25f, 7.042f);
                e.d(13.25f, 6.352f, 12.69f, 5.792f, 12.0f, 5.792f);
                e.d(11.31f, 5.792f, 10.75f, 6.352f, 10.75f, 7.042f);
                e.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                a6t0 a6t0Var2 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 uq90Var = new uq90();
                uq90Var.j(13.0f, 9.533f);
                uq90Var.o(18.0f);
                uq90Var.f(11.0f);
                uq90Var.o(9.533f);
                uq90Var.f(13.0f);
                uq90Var.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", uq90Var.a);
                a6t0 a6t0Var3 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e2 = nnm.e(22.0f, 12.0f);
                e2.d(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f);
                e2.d(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f);
                e2.d(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f);
                e2.d(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f);
                e2.c();
                e2.j(20.5f, 12.0f);
                e2.d(20.5f, 16.694f, 16.694f, 20.5f, 12.0f, 20.5f);
                e2.d(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12.0f);
                e2.d(3.5f, 7.306f, 7.306f, 3.5f, 12.0f, 3.5f);
                e2.d(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12.0f);
                e2.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", e2.a);
                mgvVar = lgvVar.d();
                h6b1.a = mgvVar;
            }
            ut91.b(dsInlineNotification$Tone, ba91.c(mgvVar, btsVar), ohb1.e(btsVar, oyh0.neophonish_upgrade_dialog_title), f530Var, new fqm(slsVar, null, ohb1.e(btsVar, oyh0.neophonish_upgrade_dialog_ya_id)), null, btsVar, 70 | ((i2 << 6) & 7168), 224);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar, f530Var, i, 11);
        }
    }
}
