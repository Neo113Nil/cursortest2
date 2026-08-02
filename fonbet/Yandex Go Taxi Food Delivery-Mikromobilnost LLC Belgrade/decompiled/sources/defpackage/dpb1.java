package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dpb1 {
    public static final void a(final b411 b411Var, final l8v l8vVar, final String str, final String str2, final String str3, final ldc ldcVar, final ldc ldcVar2, final Long l, final boolean z, final float f, final sls slsVar, fid fidVar, final int i, final int i2) {
        int i3;
        String str4;
        ldc ldcVar3;
        ldc ldcVar4;
        final Long l2;
        sls slsVar2;
        int i4;
        String str5;
        float f2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1433220095);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar2.k(b411Var) : btsVar2.e(b411Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? btsVar2.k(l8vVar) : btsVar2.e(l8vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(str) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            str4 = str2;
            i3 |= btsVar2.k(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.k(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            ldcVar3 = ldcVar;
            i3 |= btsVar2.k(ldcVar3) ? 131072 : 65536;
        } else {
            ldcVar3 = ldcVar;
        }
        if ((1572864 & i) == 0) {
            ldcVar4 = ldcVar2;
            i3 |= btsVar2.k(ldcVar4) ? 1048576 : 524288;
        } else {
            ldcVar4 = ldcVar2;
        }
        if ((12582912 & i) == 0) {
            l2 = l;
            i3 |= btsVar2.k(l2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        } else {
            l2 = l;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar2.a(z) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i3 |= btsVar2.b(f) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            slsVar2 = slsVar;
            i4 = i2 | (btsVar2.e(slsVar2) ? 4 : 2);
        } else {
            slsVar2 = slsVar;
            i4 = i2;
        }
        if (btsVar2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            float d = cjb1.d(314.0f, 298.0f, f);
            boolean z2 = f >= 0.5f;
            final b411 b411Var2 = z ? z311.a : b411Var;
            final String str6 = str4;
            final ldc ldcVar5 = ldcVar3;
            final ldc ldcVar6 = ldcVar4;
            final sls slsVar3 = slsVar2;
            zls zlsVar = new zls() { // from class: t640
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                        a411 a411Var = a411.a;
                        b411 b411Var3 = b411.this;
                        boolean l3 = jl40.l(b411Var3, a411Var);
                        l8v l8vVar2 = l8vVar;
                        String str7 = str;
                        String str8 = str6;
                        ldc ldcVar7 = ldcVar5;
                        ldc ldcVar8 = ldcVar6;
                        float f3 = f;
                        sls slsVar4 = slsVar3;
                        if (l3) {
                            btsVar3.e0(-475594451);
                            tl91.b(l8vVar2, str7, str8, ldcVar7, ldcVar8, f3, slsVar4, btsVar3, 0);
                            btsVar3.t(false);
                        } else if (jl40.l(b411Var3, y311.a)) {
                            btsVar3.e0(-1858154742);
                            pl91.a(l8vVar2, str7, str8, ldcVar7, ldcVar8, f3, slsVar4, btsVar3, 0);
                            btsVar3.t(false);
                        } else {
                            if (!jl40.l(b411Var3, z311.a)) {
                                throw unr0.y(-475596008, btsVar3, false);
                            }
                            btsVar3.e0(-475569325);
                            sl91.a(str7, str8, l2, f3, btsVar3, 0);
                            btsVar3.t(false);
                        }
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            };
            str5 = str;
            f2 = f;
            btsVar = btsVar2;
            gpb1.c(null, z2, d, wwg.S(374923679, true, zlsVar, btsVar2), wwg.S(-2090837280, true, new fon(str3, b411Var2, str5, f2), btsVar2), btsVar, 27648, 1);
        } else {
            str5 = str;
            f2 = f;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final String str7 = str5;
            final float f3 = f2;
            v.d = new wls() { // from class: u640
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    dpb1.a(b411.this, l8vVar, str7, str2, str3, ldcVar, ldcVar2, l, z, f3, slsVar, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(f530 f530Var, sls slsVar, float f, sls slsVar2, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(396254625);
        int i2 = i | 6 | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.b(f) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            float w0 = ((fwi) btsVar.m(j.h)).w0(f);
            f530Var2 = c530.a;
            f530 m = ljs0.m(f530Var2, f);
            boolean b = btsVar.b(w0);
            Object Q = btsVar.Q();
            int i3 = 5;
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new qjf0(w0, slsVar2, i3);
                btsVar.o0(Q);
            }
            f530 c = bzk0.c(eja1.y(m, (tls) Q), AppColor$Palette.BgFloating, cyk0.a);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = ly3.i(btsVar);
            }
            f530 d = u3a1.d(an91.k(q791.b(c, (zx40) Q2, null, false, null, null, slsVar, 28), 16.0f), "ticket_close_btn");
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            o4b1.b(mt71.m(dzg0.ic_cross_close_white, 0, btsVar), ohb1.e(btsVar, kyh0.common_close), ljs0.m(f530Var2, 24.0f), null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar), 5), btsVar, 392, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zvc(f530Var2, slsVar, f, slsVar2, i);
        }
    }

    public static final ComponentCallbacks c(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == null) {
                FragmentActivity activity = fragment.getActivity();
                if (p7u.class.isInstance(activity)) {
                    return activity;
                }
                Application application = activity != null ? activity.getApplication() : null;
                if (p7u.class.isInstance(application)) {
                    return application;
                }
                ny61.g(b64.l("No ", p7u.class.getSimpleName(), " was found for ", fragment.getClass().getCanonicalName()));
                return null;
            }
        } while (!p7u.class.isInstance(fragment2));
        return fragment2;
    }
}
