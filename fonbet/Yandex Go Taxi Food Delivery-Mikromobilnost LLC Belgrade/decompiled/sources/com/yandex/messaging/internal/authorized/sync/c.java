package com.yandex.messaging.internal.authorized.sync;

import defpackage.n4u0;
import defpackage.ny61;
import defpackage.r9;
import defpackage.tcc;
import defpackage.vpr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c implements n4u0 {
    public final /* synthetic */ r0 a;

    public c(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // defpackage.hnr0
    public final List b() {
        List b = this.a.b();
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((Number) it.next()).intValue() == 9));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ContactsSyncManager$special$$inlined$mapStateFlow$1$1 contactsSyncManager$special$$inlined$mapStateFlow$1$1;
        int i;
        if (continuation instanceof ContactsSyncManager$special$$inlined$mapStateFlow$1$1) {
            contactsSyncManager$special$$inlined$mapStateFlow$1$1 = (ContactsSyncManager$special$$inlined$mapStateFlow$1$1) continuation;
            int i2 = contactsSyncManager$special$$inlined$mapStateFlow$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactsSyncManager$special$$inlined$mapStateFlow$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactsSyncManager$special$$inlined$mapStateFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactsSyncManager$special$$inlined$mapStateFlow$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r9 r9Var = new r9(vprVar, 3);
                    contactsSyncManager$special$$inlined$mapStateFlow$1$1.label = 1;
                    if (this.a.collect(r9Var, contactsSyncManager$special$$inlined$mapStateFlow$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        contactsSyncManager$special$$inlined$mapStateFlow$1$1 = new ContactsSyncManager$special$$inlined$mapStateFlow$1$1(this, continuation);
        Object obj2 = contactsSyncManager$special$$inlined$mapStateFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactsSyncManager$special$$inlined$mapStateFlow$1$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        return Boolean.valueOf(((Number) this.a.getValue()).intValue() == 9);
    }
}
