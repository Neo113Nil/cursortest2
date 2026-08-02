package xsna;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ow8;
import xsna.ox8;

/* compiled from: MiniAppLocalStorageCache.kt */
@b6l(c = "com.vk.local.storage.impl.MiniAppLocalStorageCache$getMetaInfo$2", f = "MiniAppLocalStorageCache.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class wp20 extends SuspendLambda implements wzs<yvj, spj<? super ox8<? extends List<? extends ai20>>>, Object> {
    final /* synthetic */ long $appId;
    final /* synthetic */ List<String> $keys;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp20(long j, List<String> list, spj<? super wp20> spjVar) {
        super(2, spjVar);
        this.$appId = j;
        this.$keys = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        wp20 wp20Var = new wp20(this.$appId, this.$keys, spjVar);
        wp20Var.L$0 = obj;
        return wp20Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ox8<? extends List<? extends ai20>>> spjVar) {
        return ((wp20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102 A[Catch: all -> 0x00b1, LOOP:1: B:32:0x00fc->B:34:0x0102, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:7:0x0049, B:9:0x0057, B:12:0x005e, B:13:0x0069, B:15:0x006f, B:17:0x0081, B:19:0x00a5, B:22:0x00ae, B:25:0x00b6, B:31:0x00eb, B:32:0x00fc, B:34:0x0102, B:45:0x00ba, B:47:0x00c5, B:49:0x00cd, B:52:0x00dd, B:54:0x00e1, B:56:0x00e4, B:60:0x00e9), top: B:6:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x012f, TryCatch #1 {all -> 0x012f, blocks: (B:36:0x0121, B:38:0x0127, B:42:0x0131, B:63:0x011b, B:7:0x0049, B:9:0x0057, B:12:0x005e, B:13:0x0069, B:15:0x006f, B:17:0x0081, B:19:0x00a5, B:22:0x00ae, B:25:0x00b6, B:31:0x00eb, B:32:0x00fc, B:34:0x0102, B:45:0x00ba, B:47:0x00c5, B:49:0x00cd, B:52:0x00dd, B:54:0x00e1, B:56:0x00e4, B:60:0x00e9), top: B:6:0x0049, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0131 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #1 {all -> 0x012f, blocks: (B:36:0x0121, B:38:0x0127, B:42:0x0131, B:63:0x011b, B:7:0x0049, B:9:0x0057, B:12:0x005e, B:13:0x0069, B:15:0x006f, B:17:0x0081, B:19:0x00a5, B:22:0x00ae, B:25:0x00b6, B:31:0x00eb, B:32:0x00fc, B:34:0x0102, B:45:0x00ba, B:47:0x00c5, B:49:0x00cd, B:52:0x00dd, B:54:0x00e1, B:56:0x00e4, B:60:0x00e9), top: B:6:0x0049, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        ui50 ui50Var;
        long j;
        ?? failure;
        File j2;
        List<String> list2;
        ?? r3;
        nw8 nw8Var;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ui50 g = yp20.g(yp20.b, this.$appId);
            long j3 = this.$appId;
            list = this.$keys;
            this.L$0 = yvjVar;
            this.L$1 = g;
            this.L$2 = list;
            this.J$0 = j3;
            this.I$0 = 0;
            this.label = 1;
            if (g.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ui50Var = g;
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            list = (List) this.L$2;
            ui50Var = (ui50) this.L$1;
            kotlin.a.a(obj);
        }
        try {
            try {
                yp20.b.getClass();
                j2 = yp20.j(j);
                list2 = list;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (list2 != null && !list2.isEmpty()) {
                r3 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    File file = yp20.h(yp20.b, j).get((String) it.next());
                    if (file != null) {
                        File file2 = new File(file.getParentFile(), file.getName() + ".rec");
                        if (file2.exists()) {
                            Object l = yp20.l(file2);
                            if (l instanceof Result.Failure) {
                                l = null;
                            }
                            nw8Var = (nw8) l;
                            if (nw8Var == null) {
                                r3.add(nw8Var);
                            }
                        }
                    }
                    nw8Var = null;
                    if (nw8Var == null) {
                    }
                }
                Iterable<nw8> iterable = (Iterable) r3;
                failure = new ArrayList(c5g.u(iterable, 10));
                for (nw8 nw8Var2 : iterable) {
                    failure.add(new ai20(nw8Var2.a, nw8Var2.e, nw8Var2.d, nw8Var2.c, nw8Var2.f));
                }
                Throwable a = Result.a(failure);
                Object bVar = a != null ? new ox8.b((List) failure) : new ox8.a(ow8.c.a, a);
                ui50Var.c(null);
                return bVar;
            }
            File[] listFiles = j2.listFiles(new vp20());
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file3 : listFiles) {
                    yp20.b.getClass();
                    Object l2 = yp20.l(file3);
                    if (l2 instanceof Result.Failure) {
                        l2 = null;
                    }
                    nw8 nw8Var3 = (nw8) l2;
                    if (nw8Var3 != null) {
                        arrayList.add(nw8Var3);
                    }
                }
                r3 = arrayList;
            } else {
                r3 = EmptyList.b;
            }
            Iterable<nw8> iterable2 = (Iterable) r3;
            failure = new ArrayList(c5g.u(iterable2, 10));
            while (r1.hasNext()) {
            }
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
            }
            ui50Var.c(null);
            return bVar;
        } catch (Throwable th2) {
            ui50Var.c(null);
            throw th2;
        }
    }
}
