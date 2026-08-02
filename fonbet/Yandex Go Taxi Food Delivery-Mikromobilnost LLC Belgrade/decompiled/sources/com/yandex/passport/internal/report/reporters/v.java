package com.yandex.passport.internal.report.reporters;

import android.net.Uri;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.b4;
import com.yandex.passport.internal.report.c3;
import com.yandex.passport.internal.report.c4;
import com.yandex.passport.internal.report.g3;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.p3;
import com.yandex.passport.internal.report.q3;
import com.yandex.passport.internal.report.t2;
import com.yandex.passport.internal.report.t3;
import com.yandex.passport.internal.report.u3;
import com.yandex.passport.internal.report.x3;
import com.yandex.passport.internal.report.y3;
import com.yandex.passport.internal.report.yd;
import defpackage.w511;

/* loaded from: classes15.dex */
public final class v extends l3 {
    public v(com.yandex.passport.internal.report.j jVar) {
        super(jVar);
    }

    public final void j(Uid uid, String str, String str2, String str3) {
        f(p3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(str2, 11), new com.yandex.passport.internal.report.i(str3, 2));
    }

    public final void k(Uid uid, String str, String str2, boolean z, boolean z2) {
        f(q3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(str2, 11), new com.yandex.passport.internal.report.i(z, 11), new com.yandex.passport.internal.report.i(z2, 13));
    }

    public final void l(Uid uid, String str, String str2, String str3) {
        boolean z = false;
        f(t3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, z), new yd(str2, 11), new com.yandex.passport.internal.report.a(str3, 19, z));
    }

    public final void m(Uid uid, String str, String str2, String str3) {
        boolean z = false;
        f(u3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, z), new yd(str2, 11), new com.yandex.passport.internal.report.a(str3, 19, z));
    }

    public final void n(Uid uid, String str, String str2, com.yandex.passport.common.ebs.n nVar) {
        String str3;
        x3 x3Var = x3.w;
        jd jdVar = new jd(Long.valueOf(uid.getValue()));
        boolean z = false;
        com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(str, 6, z);
        yd ydVar = new yd(str2, 11);
        if (nVar instanceof com.yandex.passport.common.ebs.l) {
            str3 = "success";
        } else if (nVar.equals(com.yandex.passport.common.ebs.m.a)) {
            str3 = "verified_age_restriction";
        } else if (nVar.equals(com.yandex.passport.common.ebs.j.a)) {
            str3 = "consent_needed";
        } else if (nVar.equals(com.yandex.passport.common.ebs.i.a)) {
            str3 = "bio_incorrect";
        } else {
            if (!nVar.equals(com.yandex.passport.common.ebs.k.a)) {
                w511.b();
                return;
            }
            str3 = "ebs_registration_pending";
        }
        f(x3Var, jdVar, aVar, ydVar, new yd(str3, 3, z));
    }

    public final void o(int i, Uid uid, String str, String str2, String str3) {
        f(y3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new com.yandex.passport.internal.report.i(str2, 2), new com.yandex.passport.internal.report.a(i, 3), new md(str3, 19));
    }

    public final void p(Uid uid, String str, String str2, String str3) {
        f(t2.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(str2, 11), new com.yandex.passport.internal.report.a(str3, 25));
    }

    public final void q(Uid uid, String str, String str2, String str3) {
        f(b4.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(str2, 11), new com.yandex.passport.internal.report.i(str3, 2));
    }

    public final void r(Uid uid, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z = false;
        f(c4.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, z), new yd(str2, 11), new com.yandex.passport.internal.report.a(String.valueOf(str3), 29, z), new md(String.valueOf(str4), 23, false), new yd(str5, 9), new yd(str6, 3, z));
    }

    public final void s(Uid uid, String str, Uri uri, String str2) {
        f(c3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(String.valueOf(uri), 21), new com.yandex.passport.internal.report.a(str2, 25));
    }

    public final void t(Uid uid, String str, Uri uri, String str2) {
        f(g3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(str, 6, false), new yd(String.valueOf(uri), 21), new com.yandex.passport.internal.report.a(str2, 25));
    }
}
