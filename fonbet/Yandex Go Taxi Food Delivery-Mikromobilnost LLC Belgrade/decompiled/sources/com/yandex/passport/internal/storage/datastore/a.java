package com.yandex.passport.internal.storage.datastore;

import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a {
    public final tpg a;
    public final tpr b;

    public a(tpg tpgVar) {
        this.a = tpgVar;
        this.b = tpgVar.getData();
    }

    public final Object a(kme0 kme0Var, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(this.a, new DataStoreManagerImpl$deletePreference$2(kme0Var, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object b(kme0 kme0Var, Set set, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(this.a, new DataStoreManagerImpl$editPreference$2(kme0Var, set, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(b bVar, ContinuationImpl continuationImpl) {
        DataStoreManagerImpl$getPreference$1 dataStoreManagerImpl$getPreference$1;
        int i;
        if (continuationImpl instanceof DataStoreManagerImpl$getPreference$1) {
            dataStoreManagerImpl$getPreference$1 = (DataStoreManagerImpl$getPreference$1) continuationImpl;
            int i2 = dataStoreManagerImpl$getPreference$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreManagerImpl$getPreference$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataStoreManagerImpl$getPreference$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreManagerImpl$getPreference$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dataStoreManagerImpl$getPreference$1.L$0 = bVar;
                    dataStoreManagerImpl$getPreference$1.label = 1;
                    obj = e.y(this.b, dataStoreManagerImpl$getPreference$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) dataStoreManagerImpl$getPreference$1.L$0;
                    kotlin.b.b(obj);
                }
                Object c = ((mme0) obj).c(bVar.a());
                return c != null ? EmptySet.a : c;
            }
        }
        dataStoreManagerImpl$getPreference$1 = new DataStoreManagerImpl$getPreference$1(this, continuationImpl);
        Object obj2 = dataStoreManagerImpl$getPreference$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreManagerImpl$getPreference$1.label;
        if (i != 0) {
        }
        Object c2 = ((mme0) obj2).c(bVar.a());
        if (c2 != null) {
        }
    }
}
