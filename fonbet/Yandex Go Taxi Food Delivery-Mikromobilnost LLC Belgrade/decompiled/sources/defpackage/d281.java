package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.a;
import yads.mg2;
import yads.og2;

/* loaded from: classes7.dex */
public final class d281 {
    public final a a = gtq0.a();
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        og2 og2Var;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof og2) {
                og2Var = (og2) continuationImpl;
                int i2 = og2Var.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    og2Var.e = i2 - Integer.MIN_VALUE;
                    Object obj = og2Var.c;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = og2Var.e;
                    boolean z = true;
                    if (i != 0) {
                        b.b(obj);
                        a aVar = this.a;
                        og2Var.b = aVar;
                        og2Var.e = 1;
                        if (aVar.a(og2Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = og2Var.b;
                        b.b(obj);
                    }
                    c();
                    if (this.b.size() < 5) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            c();
            if (this.b.size() < 5) {
            }
            return Boolean.valueOf(z);
        } finally {
            g050Var.d(null);
        }
        og2Var = new og2(this, continuationImpl);
        Object obj2 = og2Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = og2Var.e;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004c, B:13:0x0056, B:14:0x0069), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sd81 sd81Var, Object obj, ContinuationImpl continuationImpl) {
        mg2 mg2Var;
        int i;
        a aVar;
        ArrayList arrayList = this.b;
        try {
            if (continuationImpl instanceof mg2) {
                mg2Var = (mg2) continuationImpl;
                int i2 = mg2Var.g;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mg2Var.g = i2 - Integer.MIN_VALUE;
                    Object obj2 = mg2Var.e;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mg2Var.g;
                    if (i != 0) {
                        b.b(obj2);
                        mg2Var.b = sd81Var;
                        mg2Var.c = obj;
                        aVar = this.a;
                        mg2Var.d = aVar;
                        mg2Var.g = 1;
                        if (aVar.a(mg2Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = mg2Var.d;
                        obj = mg2Var.c;
                        sd81 sd81Var2 = mg2Var.b;
                        b.b(obj2);
                        aVar = r7;
                        sd81Var = sd81Var2;
                    }
                    c();
                    if (arrayList.size() < 5) {
                        arrayList.add(new qp71(sd81Var, obj, System.currentTimeMillis() + 86400000));
                    }
                    zy11 zy11Var = zy11.a;
                    aVar.d(null);
                    return zy11Var;
                }
            }
            c();
            if (arrayList.size() < 5) {
            }
            zy11 zy11Var2 = zy11.a;
            aVar.d(null);
            return zy11Var2;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        mg2Var = new mg2(this, continuationImpl);
        Object obj22 = mg2Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mg2Var.g;
        if (i != 0) {
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (System.currentTimeMillis() > ((qp71) next).c) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.remove((qp71) it2.next());
        }
    }
}
