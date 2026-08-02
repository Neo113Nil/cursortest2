package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.q2;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class o extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.usecase.ui.x c;
    public final boolean d;
    public final List e;

    public o(com.yandex.passport.internal.usecase.ui.x xVar, boolean z, List list) {
        this.c = xVar;
        this.d = z;
        this.e = list;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        if (!jl40.l((n) obj, n.a)) {
            w511.b();
            return null;
        }
        ListBuilder a = rcc.a();
        List list = this.e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x((d1) it.next()));
        }
        a.addAll(arrayList);
        if (this.d) {
            a.add(y.a);
        }
        a(new s(a.j()));
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        b0 b0Var = (b0) obj;
        if (b0Var == null) {
            w511.b();
            return null;
        }
        z zVar = b0Var.a;
        boolean z = zVar instanceof x;
        zy11 zy11Var = zy11.a;
        if (z) {
            Object k = k((x) zVar, (ContinuationImpl) continuation);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11Var;
        }
        if (zVar instanceof y) {
            a(new r(new q2(null)));
            return zy11Var;
        }
        w511.b();
        return null;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new p(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(x xVar, ContinuationImpl continuationImpl) {
        BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1 bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1;
        int i;
        ModernAccount modernAccount;
        Uid uid;
        if (continuationImpl instanceof BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1) {
            bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1 = (BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1) continuationImpl;
            int i2 = bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a(new q(xVar.a.a));
                    com.yandex.passport.internal.usecase.ui.w wVar = new com.yandex.passport.internal.usecase.ui.w(xVar.a.a);
                    bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.L$0 = this;
                    bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.label = 1;
                    obj = this.c.a(wVar, bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (o) bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.L$0;
                    kotlin.b.b(obj);
                }
                modernAccount = (ModernAccount) obj;
                if (modernAccount != null || (uid = modernAccount.getUid()) == null) {
                    ny61.r("No related accounts to create a profile.");
                    return null;
                }
                this.a(new r(new q2(uid)));
                return zy11.a;
            }
        }
        bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1 = new BouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1(this, continuationImpl);
        Object obj2 = bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bouncerMasterChooserStoreFactory$ExecutorImpl$onAccountPhoneNumber$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (modernAccount != null) {
        }
        ny61.r("No related accounts to create a profile.");
        return null;
    }
}
