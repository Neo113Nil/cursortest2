package androidx.datastore.core;

import defpackage.csz;
import defpackage.f6u;
import defpackage.jo40;
import defpackage.kn2;
import defpackage.m1k;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements wls {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation continuation) {
        super(2, continuation);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MulticastFileObserver$Companion$observe$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (kotlinx.coroutines.channels.b.a(r4, r10, r9) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Map map;
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        y6f0 y6f0Var;
        m1k m1kVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var2 = (y6f0) this.L$0;
            File file = this.$file;
            kn2 kn2Var = new kn2(16, file, y6f0Var2);
            jo40 jo40Var = MulticastFileObserver.Companion;
            File parentFile = file.getParentFile();
            jo40Var.getClass();
            String path = parentFile.getCanonicalFile().getPath();
            obj2 = MulticastFileObserver.LOCK;
            synchronized (obj2) {
                try {
                    map = MulticastFileObserver.fileObservers;
                    Object obj3 = map.get(path);
                    if (obj3 == null) {
                        obj3 = new MulticastFileObserver(path, null);
                        map.put(path, obj3);
                    }
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) obj3;
                    copyOnWriteArrayList = multicastFileObserver.delegates;
                    copyOnWriteArrayList.add(kn2Var);
                    copyOnWriteArrayList2 = multicastFileObserver.delegates;
                    if (copyOnWriteArrayList2.size() == 1) {
                        multicastFileObserver.startWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f6u f6uVar = new f6u(i2, path, kn2Var);
            zy11 zy11Var = zy11.a;
            this.L$0 = y6f0Var2;
            this.L$1 = f6uVar;
            this.label = 1;
            if (((x6f0) y6f0Var2).y.o(zy11Var, this) != coroutineSingletons) {
                y6f0Var = y6f0Var2;
                m1kVar = f6uVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m1kVar = (m1k) this.L$1;
        y6f0Var = (y6f0) this.L$0;
        kotlin.b.b(obj);
        csz cszVar = new csz(9, m1kVar);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
