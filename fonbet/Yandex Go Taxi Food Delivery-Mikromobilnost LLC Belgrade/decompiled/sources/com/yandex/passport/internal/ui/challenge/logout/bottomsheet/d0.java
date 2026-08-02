package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class d0 extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.flags.j d;
    public final com.yandex.passport.internal.core.accounts.t e;
    public final Uid f;
    public final boolean g;
    public final boolean h;

    public d0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.core.accounts.t tVar, Uid uid, boolean z, boolean z2) {
        this.c = dVar;
        this.d = jVar;
        this.e = tVar;
        this.f = uid;
        this.g = z;
        this.h = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        ?? r11;
        if (!jl40.l((c0) obj, c0.a)) {
            w511.b();
            return null;
        }
        com.yandex.passport.internal.b a = this.c.a();
        Uid uid = this.f;
        ModernAccount e = a.e(uid);
        if (e == null) {
            throw new PassportAccountNotFoundException(uid);
        }
        ArrayList f = a.f();
        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((ModernAccount) it.next()).getUid());
        }
        Uid masterUid = ((Boolean) this.d.b(com.yandex.passport.internal.flags.q.r0)).booleanValue() ? e.getMasterUid() : null;
        if (masterUid != null) {
            ArrayList c = this.e.c(masterUid, a);
            r11 = new ArrayList();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (arrayList.contains(((com.yandex.passport.internal.entities.k) next).a)) {
                    r11.add(next);
                }
            }
        } else {
            r11 = EmptyList.a;
        }
        List list = r11;
        boolean z = (e.isMailish() || e.isPdd() || e.getUid().getEnvironment() == Environment.TEAM_PRODUCTION || e.getUid().getEnvironment() == Environment.TEAM_TESTING) ? false : true;
        boolean z2 = this.g;
        if (z2 || z) {
            a(new e0(new o0(this.f, e.getMasterUid(), !this.h, z, z2, list)));
        } else {
            f(j0.a);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new f0(th));
    }
}
