package com.yandex.messaging.ui.settings.contacts;

import defpackage.a6t0;
import defpackage.aii0;
import defpackage.ba91;
import defpackage.bts;
import defpackage.c530;
import defpackage.crm;
import defpackage.did;
import defpackage.dkm0;
import defpackage.dv9;
import defpackage.f530;
import defpackage.fid;
import defpackage.hka1;
import defpackage.hq91;
import defpackage.j9a;
import defpackage.jc0;
import defpackage.jhd;
import defpackage.k3r;
import defpackage.ldc;
import defpackage.lgv;
import defpackage.ljs0;
import defpackage.mgv;
import defpackage.mrm;
import defpackage.nnm;
import defpackage.nyh0;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.oqm;
import defpackage.oub1;
import defpackage.oyh0;
import defpackage.qnm;
import defpackage.qqm;
import defpackage.rzo;
import defpackage.sls;
import defpackage.srm;
import defpackage.tbb;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tqm;
import defpackage.u3a1;
import defpackage.uq90;
import defpackage.vde;
import defpackage.vs4;
import defpackage.wde;
import defpackage.wwg;
import defpackage.xde;
import defpackage.yde;
import skeletor.render.SkeletonContentView;

/* loaded from: classes15.dex */
public final class b {
    public static final b a = new b();

    public final void a(int i, fid fidVar, sls slsVar, tls tlsVar) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-669247926);
        int i2 = i | (btsVar.e(tlsVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            com.yx360.design.compose.atoms.modal.a.a(slsVar, null, srm.a, null, null, null, null, null, wwg.S(-1025559554, true, new wde(0, tlsVar), btsVar), btsVar, ((i2 >> 3) & 14) | 805306368, 506);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(this, tlsVar, slsVar, i, 15);
        }
    }

    public final void b(yde ydeVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(91565782);
        int i2 = i | (btsVar.k(ydeVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            String e = ohb1.e(btsVar, oyh0.messaging_profile_settings_contacts_delete);
            qnm qnmVar = qnm.a;
            crm crmVar = new crm(e, new ldc(qnm.c(btsVar).b0()), 6, 1);
            crm crmVar2 = new crm(ohb1.e(btsVar, oyh0.messaging_profile_settings_contacts_delete_descr), null, 14, 0);
            mgv mgvVar = oub1.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("TrashOutlineMdRegular", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e2 = nnm.e(12.0f, 2.0f);
                e2.d(12.908f, 2.0f, 13.361f, 2.0f, 13.756f, 2.093f);
                e2.d(14.779f, 2.333f, 15.641f, 3.02f, 16.102f, 3.965f);
                e2.d(16.279f, 4.329f, 16.38f, 4.772f, 16.581f, 5.656f);
                e2.h(16.659f, 6.0f);
                e2.f(21.0f);
                e2.o(7.5f);
                e2.h(19.65f, 8.063f);
                e2.h(18.865f, 15.879f);
                e2.d(18.626f, 18.257f, 18.507f, 19.448f, 17.899f, 20.308f);
                e2.d(17.559f, 20.79f, 17.115f, 21.191f, 16.602f, 21.481f);
                e2.d(15.685f, 22.0f, 14.489f, 22.0f, 12.099f, 22.0f);
                e2.f(11.901f);
                e2.d(9.511f, 22.0f, 8.316f, 22.0f, 7.399f, 21.481f);
                e2.d(6.886f, 21.191f, 6.442f, 20.79f, 6.102f, 20.308f);
                e2.d(5.494f, 19.448f, 5.375f, 18.258f, 5.136f, 15.88f);
                e2.h(4.351f, 8.063f);
                e2.h(3.0f, 7.5f);
                e2.o(6.0f);
                e2.f(7.341f);
                e2.h(7.419f, 5.656f);
                e2.d(7.62f, 4.772f, 7.721f, 4.329f, 7.898f, 3.965f);
                e2.d(8.359f, 3.02f, 9.221f, 2.333f, 10.244f, 2.093f);
                e2.d(10.639f, 2.0f, 11.092f, 2.0f, 12.0f, 2.0f);
                e2.c();
                e2.j(5.802f, 7.5f);
                e2.h(6.628f, 15.729f);
                e2.d(6.75f, 16.946f, 6.833f, 17.758f, 6.953f, 18.378f);
                e2.d(7.068f, 18.975f, 7.195f, 19.256f, 7.327f, 19.442f);
                e2.d(7.54f, 19.744f, 7.818f, 19.994f, 8.139f, 20.176f);
                e2.d(8.338f, 20.288f, 8.629f, 20.386f, 9.234f, 20.441f);
                e2.d(9.863f, 20.499f, 10.679f, 20.5f, 11.901f, 20.5f);
                e2.f(12.099f);
                e2.d(13.321f, 20.5f, 14.138f, 20.499f, 14.767f, 20.441f);
                e2.d(15.372f, 20.386f, 15.663f, 20.288f, 15.862f, 20.176f);
                e2.d(16.184f, 19.994f, 16.461f, 19.744f, 16.674f, 19.442f);
                e2.d(16.806f, 19.256f, 16.933f, 18.975f, 17.048f, 18.378f);
                e2.d(17.167f, 17.758f, 17.25f, 16.946f, 17.372f, 15.729f);
                e2.h(18.199f, 7.5f);
                e2.f(5.802f);
                e2.c();
                e2.j(11.0f, 18.5f);
                e2.f(9.625f);
                e2.h(9.0f, 9.5f);
                e2.f(10.727f);
                e2.h(11.0f, 18.5f);
                e2.c();
                e2.j(14.375f, 18.5f);
                e2.f(13.0f);
                e2.h(13.273f, 9.5f);
                e2.f(15.0f);
                e2.h(14.375f, 18.5f);
                e2.c();
                e2.j(12.0f, 3.5f);
                e2.d(11.014f, 3.5f, 10.771f, 3.51f, 10.587f, 3.553f);
                e2.d(10.002f, 3.69f, 9.51f, 4.083f, 9.246f, 4.623f);
                e2.d(9.163f, 4.793f, 9.1f, 5.028f, 8.882f, 5.989f);
                e2.h(8.879f, 6.0f);
                e2.f(15.121f);
                e2.h(15.118f, 5.989f);
                e2.d(14.9f, 5.028f, 14.837f, 4.793f, 14.754f, 4.623f);
                e2.d(14.491f, 4.083f, 13.998f, 3.69f, 13.413f, 3.553f);
                e2.d(13.229f, 3.51f, 12.986f, 3.5f, 12.0f, 3.5f);
                e2.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e2.a);
                mgvVar = lgvVar.d();
                oub1.a = mgvVar;
            }
            ldc ldcVar = new ldc(qnm.c(btsVar).b0());
            btsVar.e0(38903447);
            tqm tqmVar = new tqm(ba91.c(mgvVar, btsVar), ldcVar);
            btsVar.t(false);
            boolean z = ydeVar.c;
            f530 d = u3a1.d(c530.a, ohb1.e(btsVar, nyh0.profile_settings_contacts_delete_test_tag));
            androidx.compose.runtime.internal.a S = wwg.S(-387230998, true, new vs4(3, ydeVar), btsVar);
            btsVar.e0(-1119786542);
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new jc0(19, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            mrm.d(crmVar, tqmVar, d, oqm.a, z, crmVar2, null, S, null, (sls) Q, btsVar, 12585984, 0, 1856);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(this, ydeVar, slsVar, i, 14);
        }
    }

    public final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(147065151);
        if ((i & 1) == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            hq91.a(ohb1.e(btsVar, oyh0.messaging_profile_settings_contacts), null, null, null, null, 0L, 0, 0L, 0, 0, null, btsVar, 0, 0, 2046);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(this, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(yde ydeVar, vde vdeVar, fid fidVar, int i) {
        Object contactsSettingsScreen$Root$1$1;
        o430 o430Var;
        vde vdeVar2;
        b bVar;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2063657189);
        int i2 = i | (btsVar.k(ydeVar) ? 4 : 2) | (btsVar.k(vdeVar) ? 32 : 16);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            k3r k3rVar = ljs0.c;
            qnm qnmVar = qnm.a;
            long a2 = qnm.c(btsVar).a();
            btsVar.e0(1548853942);
            int i3 = i2 & 112;
            int i4 = 0;
            boolean z = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z || Q == o430Var2) {
                o430Var = o430Var2;
                contactsSettingsScreen$Root$1$1 = new ContactsSettingsScreen$Root$1$1(0, vdeVar, vde.class, "onBackPressed", "onBackPressed()V", 0);
                vdeVar2 = vdeVar;
                btsVar.o0(contactsSettingsScreen$Root$1$1);
            } else {
                contactsSettingsScreen$Root$1$1 = Q;
                vdeVar2 = vdeVar;
                o430Var = o430Var2;
            }
            btsVar.t(false);
            dkm0.a(k3rVar, new androidx.compose.runtime.internal.a(-91059640, new xde(i4, (sls) ((tfx) contactsSettingsScreen$Root$1$1)), true), null, null, null, 0, a2, 0L, null, wwg.S(1879461290, true, new a(ydeVar, vdeVar2), btsVar), btsVar, 805306374, 444);
            if (((Boolean) androidx.lifecycle.compose.a.c(ydeVar.e, null, btsVar, 0, 7).getValue()).booleanValue()) {
                btsVar.e0(1548876734);
                boolean z2 = i3 == 32;
                Object Q2 = btsVar.Q();
                o430 o430Var3 = o430Var;
                if (z2 || Q2 == o430Var3) {
                    Q2 = new ContactsSettingsScreen$Root$3$1(1, vdeVar, vde.class, "onDialogButtonClicked", "onDialogButtonClicked(Z)V", 0);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                tls tlsVar = (tls) ((tfx) Q2);
                btsVar.e0(1548878871);
                boolean z3 = i3 == 32;
                Object Q3 = btsVar.Q();
                if (z3 || Q3 == o430Var3) {
                    ContactsSettingsScreen$Root$4$1 contactsSettingsScreen$Root$4$1 = new ContactsSettingsScreen$Root$4$1(0, vdeVar, vde.class, "onDialogClosed", "onDialogClosed()V", 0);
                    btsVar.o0(contactsSettingsScreen$Root$4$1);
                    Q3 = contactsSettingsScreen$Root$4$1;
                }
                btsVar.t(false);
                bVar = this;
                bVar.a(384, btsVar, (sls) ((tfx) Q3), tlsVar);
                v = btsVar.v();
                if (v == null) {
                    v.d = new j9a(bVar, ydeVar, vdeVar, i, 12);
                    return;
                }
                return;
            }
        }
        bVar = this;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public final void e(yde ydeVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-632609181);
        int i2 = i | (btsVar.k(ydeVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            crm crmVar = new crm(ohb1.e(btsVar, oyh0.messaging_profile_settings_contacts_sync), null, 14, 1);
            qnm qnmVar = qnm.a;
            mgv mgvVar = hka1.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("RepeatOutlineMdRegular", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e = nnm.e(12.006f, 4.756f);
                e.d(8.002f, 4.756f, 4.756f, 8.002f, 4.756f, 12.006f);
                e.d(4.756f, 12.281f, 4.771f, 12.553f, 4.801f, 12.82f);
                e.h(3.31f, 12.988f);
                e.d(3.274f, 12.666f, 3.256f, 12.338f, 3.256f, 12.006f);
                e.d(3.256f, 7.174f, 7.173f, 3.256f, 12.006f, 3.256f);
                e.d(14.071f, 3.256f, 15.968f, 3.971f, 17.465f, 5.168f);
                e.h(18.834f, 3.43f);
                e.h(20.406f, 8.386f);
                e.h(15.232f, 8.0f);
                e.h(16.536f, 6.346f);
                e.d(15.295f, 5.351f, 13.72f, 4.756f, 12.006f, 4.756f);
                e.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                a6t0 a6t0Var2 = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e2 = nnm.e(12.006f, 19.256f);
                e2.d(16.01f, 19.256f, 19.256f, 16.01f, 19.256f, 12.006f);
                e2.d(19.256f, 11.731f, 19.24f, 11.46f, 19.211f, 11.193f);
                e2.h(20.701f, 11.024f);
                e2.d(20.737f, 11.347f, 20.756f, 11.674f, 20.756f, 12.006f);
                e2.d(20.756f, 16.839f, 16.838f, 20.756f, 12.006f, 20.756f);
                e2.d(9.941f, 20.756f, 8.043f, 20.041f, 6.547f, 18.845f);
                e2.h(5.177f, 20.582f);
                e2.h(3.606f, 15.626f);
                e2.h(8.78f, 16.013f);
                e2.h(7.476f, 17.667f);
                e2.d(8.717f, 18.662f, 10.292f, 19.256f, 12.006f, 19.256f);
                e2.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", e2.a);
                mgvVar = lgvVar.d();
                hka1.a = mgvVar;
            }
            btsVar.e0(38903447);
            tqm tqmVar = new tqm(ba91.c(mgvVar, btsVar), null);
            btsVar.t(false);
            boolean z = ydeVar.a;
            boolean z2 = ydeVar.b;
            btsVar.e0(1693251288);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new dv9(23, tlsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            qqm qqmVar = new qqm((tls) Q, z, z2);
            f530 d = u3a1.d(c530.a, ohb1.e(btsVar, nyh0.profile_privacy_list_item_test_tag));
            btsVar.e0(1693255002);
            boolean z4 = (i3 == 32) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new jhd(9, tlsVar, ydeVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            mrm.d(crmVar, tqmVar, d, qqmVar, false, null, null, null, null, (sls) Q2, btsVar, 0, 0, 2032);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(this, ydeVar, tlsVar, i, 13);
        }
    }
}
