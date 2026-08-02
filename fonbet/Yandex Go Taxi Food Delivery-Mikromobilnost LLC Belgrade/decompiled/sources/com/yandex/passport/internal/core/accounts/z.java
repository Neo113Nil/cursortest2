package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class z {
    public final g a;
    public final t b;
    public final n c;
    public final com.yandex.passport.internal.flags.j d;
    public final i3y e = kotlin.a.a(new com.yandex.passport.internal.d(5, this));

    public z(g gVar, t tVar, n nVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = gVar;
        this.b = tVar;
        this.c = nVar;
        this.d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0033, code lost:
    
        if (r0 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zy11 a(y yVar) {
        ModernAccount e;
        boolean z;
        a0 a = yVar.a();
        boolean b = yVar.b();
        boolean c = yVar.c();
        RevokePlace d = yVar.d();
        boolean z2 = a instanceof w;
        i3y i3yVar = this.e;
        zy11 zy11Var = zy11.a;
        if (z2) {
            e = ((w) a).m0();
        } else {
            if (!(a instanceof x)) {
                w511.b();
                return null;
            }
            e = ((com.yandex.passport.internal.b) i3yVar.getValue()).e(((x) a).m0());
        }
        Uid masterUid = e.getMasterUid();
        if (masterUid == null || !((Boolean) this.d.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
            this.a.c(e, b, c, d, yVar.e());
            return zy11Var;
        }
        ArrayList c2 = this.b.c(masterUid, (com.yandex.passport.internal.b) i3yVar.getValue());
        ArrayList arrayList = new ArrayList();
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            ModernAccount e2 = ((com.yandex.passport.internal.b) i3yVar.getValue()).e(((com.yandex.passport.internal.entities.k) it.next()).d());
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        Iterator it2 = arrayList.iterator();
        boolean z3 = false;
        loop1: while (true) {
            z = z3;
            while (it2.hasNext()) {
                ModernAccount modernAccount = (ModernAccount) it2.next();
                this.a.c(modernAccount, b, c, d, yVar.e());
                if (jl40.l(modernAccount.getUid(), e.getUid())) {
                    break;
                }
            }
            z3 = true;
        }
        if (!z) {
            this.a.c(e, b, c, d, yVar.e());
        }
        return zy11Var;
    }
}
