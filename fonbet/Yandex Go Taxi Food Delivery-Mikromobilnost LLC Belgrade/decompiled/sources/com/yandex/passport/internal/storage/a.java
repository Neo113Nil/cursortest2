package com.yandex.passport.internal.storage;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final tpg a;

    public a(tpg tpgVar) {
        this.a = tpgVar;
    }

    public final Object a(Uid uid, int i, Continuation continuation) {
        Object a = this.a.a(new MakeTokenMasterCoolDownStorage$addUid$2(new l(uid, TimeUnit.MINUTES.toMillis(i) + System.currentTimeMillis()), null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object a = this.a.a(new MakeTokenMasterCoolDownStorage$cleanUp$2(arrayList, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uid uid, ContinuationImpl continuationImpl) {
        MakeTokenMasterCoolDownStorage$contains$1 makeTokenMasterCoolDownStorage$contains$1;
        int i;
        Iterable iterable;
        Iterator it;
        if (continuationImpl instanceof MakeTokenMasterCoolDownStorage$contains$1) {
            makeTokenMasterCoolDownStorage$contains$1 = (MakeTokenMasterCoolDownStorage$contains$1) continuationImpl;
            int i2 = makeTokenMasterCoolDownStorage$contains$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeTokenMasterCoolDownStorage$contains$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeTokenMasterCoolDownStorage$contains$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeTokenMasterCoolDownStorage$contains$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr data = this.a.getData();
                    makeTokenMasterCoolDownStorage$contains$1.L$0 = uid;
                    makeTokenMasterCoolDownStorage$contains$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(data, makeTokenMasterCoolDownStorage$contains$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid = (Uid) makeTokenMasterCoolDownStorage$contains$1.L$0;
                    kotlin.b.b(obj);
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (jl40.l(((l) it.next()).b(), uid)) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        makeTokenMasterCoolDownStorage$contains$1 = new MakeTokenMasterCoolDownStorage$contains$1(this, continuationImpl);
        Object obj2 = makeTokenMasterCoolDownStorage$contains$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeTokenMasterCoolDownStorage$contains$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
