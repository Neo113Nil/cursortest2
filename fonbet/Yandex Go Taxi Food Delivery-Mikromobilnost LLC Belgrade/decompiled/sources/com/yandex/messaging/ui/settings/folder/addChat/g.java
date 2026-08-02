package com.yandex.messaging.ui.settings.folder.addChat;

import android.content.Context;
import androidx.compose.animation.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yx360.design.compose.atoms.DsAvatar$Size;
import com.yx360.design.compose.atoms.DsCheckbox$State;
import com.yx360.design.compose.atoms.DsSearch$Size;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aom;
import defpackage.aui0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cms;
import defpackage.cq91;
import defpackage.crm;
import defpackage.cyk0;
import defpackage.did;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fc0;
import defpackage.fid;
import defpackage.g0;
import defpackage.g1b1;
import defpackage.gja1;
import defpackage.hc0;
import defpackage.i43;
import defpackage.i9a1;
import defpackage.ic0;
import defpackage.j0;
import defpackage.jc0;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.kbm;
import defpackage.kc0;
import defpackage.l5f;
import defpackage.l690;
import defpackage.lc0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.m5f;
import defpackage.mc0;
import defpackage.mqm;
import defpackage.mrm;
import defpackage.n5f;
import defpackage.nc0;
import defpackage.o430;
import defpackage.o5f;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.os;
import defpackage.oyh0;
import defpackage.oz40;
import defpackage.p5f;
import defpackage.pa90;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qnm;
import defpackage.quz;
import defpackage.qza1;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sqm;
import defpackage.tc0;
import defpackage.tls;
import defpackage.u3a1;
import defpackage.uic;
import defpackage.unr0;
import defpackage.v5;
import defpackage.vc0;
import defpackage.vqb1;
import defpackage.vqm;
import defpackage.w2o;
import defpackage.wc0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wwg0;
import defpackage.x4c;
import defpackage.xjx;
import defpackage.xx8;
import defpackage.y8e;
import defpackage.yb0;
import defpackage.ymb1;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zqm;
import defpackage.zv91;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes11.dex */
public abstract class g {
    public static final void a(yb0 yb0Var, tls tlsVar, tls tlsVar2, tls tlsVar3, tls tlsVar4, tls tlsVar5, boolean z, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-54766889);
        int i2 = i | (btsVar.k(yb0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.e(tlsVar3) ? 2048 : 1024) | (btsVar.e(tlsVar4) ? 16384 : 8192) | (btsVar.e(tlsVar5) ? 131072 : 65536) | (btsVar.a(z) ? 1048576 : 524288) | (btsVar.k(f530Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if ((4793491 & i2) == 4793490 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            aui0 d = gja1.d(qza1.e(), 0L, 0L, 0.0f, btsVar, 0, 30);
            f530 b = m4m0.b(f530Var, qnm.c(btsVar).e(), qke.q);
            qnm.d.getClass();
            sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            e(yb0Var.c, tlsVar5, yb0Var.d, tlsVar3, tlsVar4, d, yb0Var.b, !yb0Var.h, z, ljs0.c(c530.a, 1.0f), btsVar, ((i2 >> 12) & 112) | 805306368 | (i2 & 7168) | (57344 & i2) | (234881024 & (i2 << 6)));
            btsVar = btsVar;
            if (yb0Var.f.isEmpty() && yb0Var.e.isEmpty()) {
                btsVar.e0(-1527939644);
                j(null, btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(-121764203);
                c(yb0Var, tlsVar, tlsVar2, d, btsVar, i2 & 1022);
                btsVar.t(false);
            }
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fc0(yb0Var, tlsVar, tlsVar2, tlsVar3, tlsVar4, tlsVar5, z, f530Var, i);
        }
    }

    public static final void b(l5f l5fVar, Set set, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(218254188);
        int i2 = (btsVar.k(l5fVar) ? 4 : 2) | i | (btsVar.k(set) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            boolean contains = set.contains(l5fVar.getId());
            btsVar.e0(1668849977);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new j0(10, tlsVar, l5fVar);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            btsVar.t(false);
            qnm qnmVar = qnm.a;
            f530 d = u3a1.d(m4m0.b(c530.a, qnm.c(btsVar).a(), qke.q), "folder_add_chats_list_chat_item");
            if (l5fVar instanceof o5f) {
                btsVar.e0(1668857985);
                h((o5f) l5fVar, contains, slsVar, d, btsVar, 0);
                btsVar.t(false);
            } else if (l5fVar instanceof p5f) {
                btsVar.e0(1668865418);
                i(0, btsVar, slsVar, d, contains);
                btsVar.t(false);
            } else {
                if (!(l5fVar instanceof n5f)) {
                    throw unr0.y(1668856386, btsVar, false);
                }
                btsVar.e0(1668871911);
                g(0, btsVar, slsVar, d, contains);
                btsVar.t(false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(l5fVar, set, tlsVar, i, 4);
        }
    }

    public static final void c(yb0 yb0Var, tls tlsVar, tls tlsVar2, pa90 pa90Var, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        tls tlsVar4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1349885002);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(yb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar2.e(tlsVar3) ? 32 : 16;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & 384) == 0) {
            tlsVar4 = tlsVar2;
            i2 |= btsVar2.e(tlsVar4) ? 256 : 128;
        } else {
            tlsVar4 = tlsVar2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(pa90Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            f530 a = androidx.compose.ui.input.nestedscroll.b.a(c530.a, y8e.a, null);
            qnm.e.getClass();
            f530 d = u3a1.d(ymb1.l(a, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), "folder_add_chats_list");
            btsVar2.e0(-774776061);
            boolean e = ((i2 & 14) == 4) | ((i2 & 112) == 32) | btsVar2.e(pa90Var) | ((i2 & 896) == 256);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                lc0 lc0Var = new lc0((Object) yb0Var, tlsVar3, pa90Var, tlsVar4, 0);
                btsVar2.o0(lc0Var);
                Q = lc0Var;
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            adb1.a(d, null, null, null, null, null, false, null, (tls) Q, btsVar, 0, 510);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) yb0Var, tlsVar, (cms) tlsVar2, (Object) pa90Var, i, 1);
        }
    }

    public static final void d(List list, tls tlsVar, tls tlsVar2, pa90 pa90Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        tls tlsVar3;
        tls tlsVar4;
        l690 l690Var;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1178799040);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar2.e(tlsVar3) ? 32 : 16;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & 384) == 0) {
            tlsVar4 = tlsVar2;
            i2 |= btsVar2.e(tlsVar4) ? 256 : 128;
        } else {
            tlsVar4 = tlsVar2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(pa90Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.k(f530Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar2);
            btsVar2.e0(213233969);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(EmptyList.a);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            btsVar2.t(false);
            btsVar2.e0(213236747);
            int i4 = i3 & 14;
            boolean k = (i4 == 4) | btsVar2.k(a);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                Q2 = new AddChatsFolderContentKt$FilterAndChatsItemsListContent$1$1(list, a, oz40Var, null);
                btsVar2.o0(Q2);
            }
            btsVar2.t(false);
            zpn.e(btsVar2, (wls) Q2, list);
            qnm.c.getClass();
            l690 l690Var2 = new l690(16.0f, 4.0f, 16.0f, 4.0f);
            qnm.d.getClass();
            i43 i43Var = new i43(4.0f, true, new quz(11));
            btsVar2.e0(213257749);
            boolean e = (i4 == 4) | ((i3 & 112) == 32) | btsVar2.e(pa90Var) | ((i3 & 896) == 256);
            Object Q3 = btsVar2.Q();
            if (e || Q3 == o430Var) {
                l690Var = l690Var2;
                lc0 lc0Var = new lc0((Object) list, tlsVar3, pa90Var, tlsVar4, 1);
                btsVar2.o0(lc0Var);
                Q3 = lc0Var;
            } else {
                l690Var = l690Var2;
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            adb1.b(f530Var, a, l690Var, i43Var, null, null, false, null, (tls) Q3, btsVar, (i3 >> 12) & 14, 488);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(list, tlsVar, tlsVar2, pa90Var, f530Var, i, 0);
        }
    }

    public static final void e(String str, tls tlsVar, List list, tls tlsVar2, tls tlsVar3, pa90 pa90Var, int i, boolean z, boolean z2, f530 f530Var, fid fidVar, int i2) {
        int i3;
        tls tlsVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1070307819);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.k(list) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            tlsVar4 = tlsVar2;
            i3 |= btsVar.e(tlsVar4) ? 2048 : 1024;
        } else {
            tlsVar4 = tlsVar2;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(tlsVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar.e(pa90Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar.c(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= btsVar.a(z) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i2) == 0) {
            i3 |= btsVar.a(z2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i2) == 0) {
            i3 |= btsVar.k(f530Var) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((306783379 & i3) == 306783378 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            qnm.e.getClass();
            int i4 = i3;
            f530 b = m4m0.b(ymb1.l(f530Var, cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3)), qnm.c(btsVar).a(), qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            boolean z3 = z && !z2;
            w2o a2 = k.e(null, 3).a(k.d(null, null, 13));
            zmo a3 = k.f(null, 3).a(k.l(null, null, 13));
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            qnm.d.getClass();
            androidx.compose.animation.g.b(uic.a, z3, an91.m(c, 16.0f, 0.0f, 2), a2, a3, null, wwg.S(1469813433, true, new tc0(i), btsVar), btsVar, 1600518, 16);
            String e = ohb1.e(btsVar, oyh0.folder_add_chat_find_hint);
            DsSearch$Size dsSearch$Size = DsSearch$Size.Lg;
            qnm.c.getClass();
            zv91.a(str, e, dsSearch$Size, tlsVar, i9a1.c(an91.n(c530Var, 16.0f, 2.0f, 16.0f, 4.0f)), true, xjx.g, btsVar, (i4 & 14) | 14352768 | ((i4 << 6) & 7168), 0);
            oeb1.c(btsVar, ljs0.m(c530Var, 2.0f));
            d(list, tlsVar4, tlsVar3, pa90Var, ooc.d(androidx.compose.ui.input.nestedscroll.b.a(pw91.u(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 14), y8e.a, null), null, 3), btsVar, (i4 >> 6) & 8190);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mc0(str, tlsVar, list, tlsVar2, tlsVar3, pa90Var, i, z, z2, f530Var, i2);
        }
    }

    public static final void f(final m5f m5fVar, boolean z, final tls tlsVar, pa90 pa90Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(837004436);
        int i2 = i | (btsVar2.k(m5fVar) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128) | (btsVar2.e(pa90Var) ? 2048 : 1024) | (btsVar2.k(f530Var) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            qnm.e.getClass();
            final int i3 = 0;
            zqm zqmVar = new zqm(wwg.S(-220619251, true, new vc0(m5fVar, pa90Var, i3), btsVar2));
            crm crmVar = new crm(m5fVar.b, null, 14, 1);
            DsCheckbox$State dsCheckbox$State = z ? DsCheckbox$State.Selected : DsCheckbox$State.Unselected;
            btsVar2.e0(-1198144694);
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            boolean z2 = (i4 == 256) | (i5 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new v5(tlsVar, m5fVar);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            mqm mqmVar = new mqm(dsCheckbox$State, (tls) Q);
            f530 c = ljs0.c(f530Var, 1.0f);
            btsVar2.e0(-1198140411);
            boolean z3 = (i5 == 4) | (i4 == 256);
            Object Q2 = btsVar2.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new sls() { // from class: gc0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        m5f m5fVar2 = m5fVar;
                        tls tlsVar2 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar2.invoke(m5fVar2.a);
                                break;
                            default:
                                tlsVar2.invoke(m5fVar2.a);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q2);
            }
            btsVar2.t(false);
            f530 a = exw0.a(c, zy11.a, new f((sls) Q2));
            btsVar2.e0(-1198138875);
            boolean z4 = (i5 == 4) | (i4 == 256);
            Object Q3 = btsVar2.Q();
            if (z4 || Q3 == o430Var) {
                final int i6 = 1;
                Q3 = new sls() { // from class: gc0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i62 = i6;
                        zy11 zy11Var = zy11.a;
                        m5f m5fVar2 = m5fVar;
                        tls tlsVar2 = tlsVar;
                        switch (i62) {
                            case 0:
                                tlsVar2.invoke(m5fVar2.a);
                                break;
                            default:
                                tlsVar2.invoke(m5fVar2.a);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q3);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            mrm.f(crmVar, zqmVar, a, mqmVar, false, null, null, (sls) Q3, btsVar, 0, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 0, (cms) tlsVar, (Object) m5fVar, (Object) pa90Var, (Object) f530Var, z);
        }
    }

    public static final void g(int i, fid fidVar, sls slsVar, f530 f530Var, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-793848175);
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sqm sqmVar = new sqm(g1b1.a(btsVar), null, 12);
            crm crmVar = new crm(ohb1.e(btsVar, oyh0.unavailable_chat), null, 14, 1);
            DsCheckbox$State dsCheckbox$State = z ? DsCheckbox$State.Selected : DsCheckbox$State.Unselected;
            btsVar.e0(822672531);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new ic0(0, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            mqm mqmVar = new mqm(dsCheckbox$State, (tls) Q);
            f530 c = ljs0.c(f530Var, 1.0f);
            btsVar.e0(822676526);
            boolean z3 = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new jc0(0, slsVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            mrm.d(crmVar, sqmVar, exw0.a(c, zy11.a, new f((sls) Q2)), mqmVar, false, null, null, null, null, null, btsVar, 0, 0, 4080);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kc0(z, slsVar, f530Var, i, 0);
        }
    }

    public static final void h(o5f o5fVar, boolean z, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-205508362);
        int i2 = i | (btsVar.k(o5fVar) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            vqm vqmVar = new vqm(wwg.S(1044786351, true, new wc0(o5fVar, 0), btsVar));
            String str = o5fVar.b;
            if (str == null) {
                str = "";
            }
            crm crmVar = new crm(str, null, 14, 1);
            DsCheckbox$State dsCheckbox$State = z ? DsCheckbox$State.Selected : DsCheckbox$State.Unselected;
            btsVar.e0(-1821780283);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new ic0(2, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            mqm mqmVar = new mqm(dsCheckbox$State, (tls) Q);
            f530 c = ljs0.c(f530Var, 1.0f);
            btsVar.e0(-1821776288);
            boolean z3 = i3 == 256;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new jc0(2, slsVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            mrm.d(crmVar, vqmVar, exw0.a(c, zy11.a, new f((sls) Q2)), mqmVar, false, null, null, null, null, null, btsVar, 0, 0, 4080);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(o5fVar, z, slsVar, f530Var, i, 1);
        }
    }

    public static final void i(int i, fid fidVar, sls slsVar, f530 f530Var, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-973338274);
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sqm sqmVar = new sqm(new aom(kbm.a(vqb1.e(wwg0.msg_ic_saved_messages, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)), btsVar)), DsAvatar$Size.M24, 4);
            crm crmVar = new crm(ohb1.e(btsVar, oyh0.messaging_saved_messages_chat), null, 14, 1);
            DsCheckbox$State dsCheckbox$State = z ? DsCheckbox$State.Selected : DsCheckbox$State.Unselected;
            btsVar.e0(1350968264);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new ic0(1, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            mqm mqmVar = new mqm(dsCheckbox$State, (tls) Q);
            btsVar.e0(1350970967);
            boolean z3 = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new jc0(1, slsVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            mrm.d(crmVar, sqmVar, f530Var, mqmVar, false, null, null, null, null, (sls) Q2, btsVar, i2 & 896, 0, 2032);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kc0(z, slsVar, f530Var, i, 1);
        }
    }

    public static final void j(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-408012619);
        int i2 = 2;
        if (((i | 6) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            String e = ohb1.e(btsVar, oyh0.folder_add_chat_empty_query_title);
            String e2 = ohb1.e(btsVar, oyh0.folder_add_chat_empty_query_description);
            k3r k3rVar = ljs0.c;
            qnm qnmVar = qnm.a;
            qnm.e.getClass();
            cq91.a(e, e2, m4m0.b(ymb1.l(k3rVar, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), qnm.c(btsVar).a(), qke.q), null, null, btsVar, 0, 24);
            f530Var = c530.a;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, i2);
        }
    }
}
