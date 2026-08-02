package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ox8;

/* compiled from: MiniAppLocalStorageCache.kt */
@b6l(c = "com.vk.local.storage.impl.MiniAppLocalStorageCache$deleteMany$2", f = "MiniAppLocalStorageCache.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class rp20 extends SuspendLambda implements wzs<yvj, spj<? super ox8.b<evl>>, Object> {
    final /* synthetic */ long $appId;
    final /* synthetic */ List<String> $keys;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp20(long j, List<String> list, spj<? super rp20> spjVar) {
        super(2, spjVar);
        this.$appId = j;
        this.$keys = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rp20 rp20Var = new rp20(this.$appId, this.$keys, spjVar);
        rp20Var.L$0 = obj;
        return rp20Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ox8.b<evl>> spjVar) {
        return ((rp20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ui50 g;
        long j;
        List<String> list;
        Object failure;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g = yp20.g(yp20.b, this.$appId);
            j = this.$appId;
            List<String> list2 = this.$keys;
            this.L$0 = yvjVar;
            this.L$1 = g;
            this.L$2 = list2;
            this.J$0 = j;
            this.I$0 = 0;
            this.label = 1;
            if (g.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            list = (List) this.L$2;
            g = (ui50) this.L$1;
            kotlin.a.a(obj);
        }
        try {
            l9r h = yp20.h(yp20.b, j);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                iyx.e(yvjVar.getCoroutineContext());
                File file = h.get(str);
                File file2 = file != null ? new File(file.getParentFile(), file.getName() + ".rec") : null;
                if ((file == null || !file.exists()) && (file2 == null || !file2.exists())) {
                    arrayList2.add(str);
                }
                if (file != null) {
                    try {
                        if (file.exists()) {
                            synchronized (h) {
                                h.d().s(l9r.e(str));
                            }
                        }
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                }
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
                arrayList.add(str);
                failure = s3q0.a;
                Throwable a = Result.a(failure);
                if (a != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.deleteMany fail appId=" + j + " key=" + str + ": " + a.getMessage()});
                    }
                    arrayList2.add(str);
                }
            }
            ox8.b bVar = new ox8.b(new evl(arrayList, arrayList2));
            g.c(null);
            return bVar;
        } catch (Throwable th2) {
            g.c(null);
            throw th2;
        }
    }
}
