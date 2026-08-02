package androidx.datastore.core;

import defpackage.g8e;
import defpackage.ljo;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, c cVar, ContinuationImpl continuationImpl) {
        DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
        int i;
        List list2;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        aVar.getClass();
        if (continuationImpl instanceof DataMigrationInitializer$Companion$runMigrations$1) {
            dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuationImpl;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataMigrationInitializer$Companion$runMigrations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataMigrationInitializer$Companion$runMigrations$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    wls dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, t, null);
                    dataMigrationInitializer$Companion$runMigrations$1.L$0 = t;
                    dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                    if (cVar.a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                        return obj2;
                    }
                    list2 = t;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                        ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th2) {
                            T t2 = ref$ObjectRef.element;
                            if (t2 == 0) {
                                ref$ObjectRef.element = th2;
                            } else {
                                ljo.a((Throwable) t2, th2);
                            }
                        }
                        while (it.hasNext()) {
                            tls tlsVar = (tls) it.next();
                            dataMigrationInitializer$Companion$runMigrations$1.L$0 = ref$ObjectRef;
                            dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                            dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                            if (tlsVar.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) ref$ObjectRef.element;
                        if (th == null) {
                            return zy11.a;
                        }
                        throw th;
                    }
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    kotlin.b.b(obj);
                }
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                it = list2.iterator();
                ref$ObjectRef = ref$ObjectRef2;
                while (it.hasNext()) {
                }
                th = (Throwable) ref$ObjectRef.element;
                if (th == null) {
                }
            }
        }
        dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(aVar, continuationImpl);
        Object obj3 = dataMigrationInitializer$Companion$runMigrations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataMigrationInitializer$Companion$runMigrations$1.label;
        if (i != 0) {
        }
        Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
        it = list2.iterator();
        ref$ObjectRef = ref$ObjectRef22;
        while (it.hasNext()) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (th == null) {
        }
    }
}
