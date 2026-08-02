package com.yandex.plus.home.api.prefetch;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.gw00;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rne0;
import defpackage.skd0;
import defpackage.sne0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$loadPrefetch$1", f = "PrefetchManager.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$loadPrefetch$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$loadPrefetch$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrefetchManager$loadPrefetch$1 prefetchManager$loadPrefetch$1 = new PrefetchManager$loadPrefetch$1(this.this$0, continuation);
        prefetchManager$loadPrefetch$1.L$0 = obj;
        return prefetchManager$loadPrefetch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchManager$loadPrefetch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Result.Failure failure;
        Throwable a;
        boolean z;
        List list2;
        Object failure2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                if (!((File) this.this$0.e.getValue()).exists() && !((File) this.this$0.e.getValue()).mkdirs()) {
                    skd0.h(PlusLogTag.SDK, "Prefetch directory is unavailable", null);
                    return zy11.a;
                }
                String str = (String) this.this$0.b.invoke();
                File[] listFiles = ((File) this.this$0.e.getValue()).listFiles();
                List d0 = listFiles != null ? j73.d0(listFiles) : EmptyList.a;
                try {
                    PrefetchManager$loadPrefetch$1$1$1 prefetchManager$loadPrefetch$1$1$1 = new PrefetchManager$loadPrefetch$1$1$1(this.this$0, str, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = d0;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = com.yandex.plus.home.common.utils.a.e(8, 1000L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 2.0d, null, prefetchManager$loadPrefetch$1$1$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = d0;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    list = d0;
                    failure = new Result.Failure(e);
                    obj = failure;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    z = obj instanceof Result.Failure;
                    if (!z) {
                    }
                    if (z) {
                    }
                    list2 = (List) obj;
                    if (list2 != null) {
                    }
                    return zy11.a;
                } catch (Throwable th) {
                    th = th;
                    list = d0;
                    failure = new Result.Failure(th);
                    obj = failure;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    z = obj instanceof Result.Failure;
                    if (!z) {
                    }
                    if (z) {
                    }
                    list2 = (List) obj;
                    if (list2 != null) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$2;
                try {
                    b.b(obj);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    failure = new Result.Failure(e);
                    obj = failure;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    z = obj instanceof Result.Failure;
                    if (!z) {
                    }
                    if (z) {
                    }
                    list2 = (List) obj;
                    if (list2 != null) {
                    }
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    failure = new Result.Failure(th);
                    obj = failure;
                    a = Result.a(obj);
                    if (a != null) {
                    }
                    z = obj instanceof Result.Failure;
                    if (!z) {
                    }
                    if (z) {
                    }
                    list2 = (List) obj;
                    if (list2 != null) {
                    }
                    return zy11.a;
                }
            }
            a = Result.a(obj);
            if (a != null) {
                skd0.c(PlusLogTag.SDK, "Loading prefetch.txt failed", a);
            }
            z = obj instanceof Result.Failure;
            if (!z) {
                skd0.b(PlusLogTag.SDK, "prefetch.txt loaded successfully: " + ((List) obj));
            }
            if (z) {
                obj = null;
            }
            list2 = (List) obj;
            if (list2 != null) {
                List<String> list3 = list2;
                a aVar = this.this$0;
                for (String str2 : list3) {
                    aVar.getClass();
                    String d = a.d(str2);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((File) obj2).getName(), d)) {
                            break;
                        }
                    }
                    File file = (File) obj2;
                    if (file != null) {
                        skd0.b(PlusLogTag.SDK, "Found previously saved file for url = " + str2);
                        aVar.f().put(d, new sne0(file));
                    } else {
                        String d2 = a.d(str2);
                        pzt0 N = tje.N(aVar.d, null, CoroutineStart.LAZY, new PrefetchManager$startLoadingWithRetry$job$1(aVar, d2, str2, null), 1);
                        aVar.f().put(d2, new rne0(N));
                        N.start();
                    }
                }
                this.this$0.getClass();
                List list4 = list3;
                ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a.d((String) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!arrayList.contains(((File) obj3).getName())) {
                        arrayList2.add(obj3);
                    }
                }
                int d3 = gw00.d(tcc.n(arrayList2, 10));
                if (d3 < 16) {
                    d3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d3);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    File file2 = (File) next;
                    try {
                        failure2 = Boolean.valueOf(file2.delete());
                    } catch (Throwable th3) {
                        failure2 = new Result.Failure(th3);
                    }
                    Throwable a2 = Result.a(failure2);
                    if (a2 != null) {
                        skd0.h(PlusLogTag.SDK, "File deletion failed fileName = " + file2.getName() + ", exception = " + a2.getMessage(), null);
                    }
                    if (failure2 instanceof Result.Failure) {
                        failure2 = null;
                    }
                    linkedHashMap.put(next, (Boolean) failure2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (jl40.l(entry.getValue(), Boolean.TRUE)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                ArrayList arrayList3 = new ArrayList(tcc.n(keySet, 10));
                Iterator it4 = keySet.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((File) it4.next()).getName());
                }
                skd0.b(PlusLogTag.SDK, "Deleted unnecessary files - " + arrayList3);
            }
            return zy11.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
