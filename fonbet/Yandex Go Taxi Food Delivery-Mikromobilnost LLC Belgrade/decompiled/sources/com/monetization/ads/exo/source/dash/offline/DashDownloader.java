package com.monetization.ads.exo.source.dash.offline;

import defpackage.b4a1;
import defpackage.dh81;
import defpackage.ey71;
import defpackage.ik71;
import defpackage.jt81;
import defpackage.k881;
import defpackage.ly61;
import defpackage.mn71;
import defpackage.mq81;
import defpackage.n171;
import defpackage.ng61;
import defpackage.of81;
import defpackage.op81;
import defpackage.qgg;
import defpackage.rf71;
import defpackage.tn81;
import defpackage.x281;
import defpackage.yj81;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import yads.jj0;

/* loaded from: classes7.dex */
public final class DashDownloader extends mq81 {
    private final mn71 j;

    public DashDownloader(op81 op81Var, ly61 ly61Var, Executor executor) {
        super(op81Var, new tn81(), ly61Var, executor);
        this.j = new mn71();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(n171 n171Var, k881 k881Var, long j, long j2, boolean z, ArrayList arrayList) {
        ng61 e;
        DashDownloader dashDownloader = this;
        k881 k881Var2 = k881Var;
        long j3 = j;
        int i = 0;
        while (i < k881Var2.c.size()) {
            x281 x281Var = (x281) k881Var2.c.get(i);
            try {
                int i2 = k881Var2.b;
                e = x281Var.e();
                if (e == null) {
                    try {
                        jt81 jt81Var = (jt81) dashDownloader.a(new a(n171Var, i2, x281Var), z);
                        e = jt81Var == null ? null : new qgg(jt81Var, x281Var.c, 7);
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            throw e;
                        }
                        i++;
                        dashDownloader = this;
                        k881Var2 = k881Var;
                        j3 = j;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e != null) {
                long k = e.k(j2);
                if (k == -1) {
                    throw new jj0("Unbounded segment index");
                }
                ik71 c = dashDownloader.j.c(x281Var.b);
                int i3 = rf71.a;
                String str = c.a;
                of81 of81Var = x281Var.x;
                if (of81Var != null) {
                    arrayList.add(new yj81(j3, b4a1.a(x281Var, str, of81Var, 0)));
                }
                of81 f = x281Var.f();
                if (f != null) {
                    arrayList.add(new yj81(j3, b4a1.a(x281Var, str, f, 0)));
                }
                long b = e.b();
                long j4 = (b + k) - 1;
                for (long j5 = b; j5 <= j4; j5++) {
                    arrayList.add(new yj81(e.a(j5) + j, b4a1.a(x281Var, str, e.d(j5), 0)));
                }
                i++;
                dashDownloader = this;
                k881Var2 = k881Var;
                j3 = j;
            } else {
                try {
                    throw new jj0("Missing segment index");
                } catch (IOException e4) {
                    e = e4;
                    if (z) {
                    }
                }
            }
        }
    }

    @Override // defpackage.mq81
    public final ArrayList a(n171 n171Var, dh81 dh81Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dh81Var.m.size(); i++) {
            ey71 ey71Var = (ey71) dh81Var.m.get(i);
            long g = rf71.g(ey71Var.b);
            long g2 = rf71.g(dh81Var.a(i));
            List list = ey71Var.c;
            for (int i2 = 0; i2 < list.size(); i2++) {
                a(n171Var, (k881) list.get(i2), g, g2, z, arrayList);
            }
        }
        return arrayList;
    }
}
