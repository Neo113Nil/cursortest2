package androidx.datastore.core;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.f1r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wbi0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"T", "Lwbi0;", "", "it", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class StorageConnectionKt$readData$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(3, (Continuation) obj3);
        storageConnectionKt$readData$2.L$0 = (wbi0) obj;
        return storageConnectionKt$readData$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wbi0 wbi0Var = (wbi0) this.L$0;
        this.label = 1;
        f1r f1rVar = (f1r) wbi0Var;
        if (f1rVar.c.get()) {
            ny61.r("This scope has already been closed.");
            return null;
        }
        Object a = h.a(f1rVar.a, new FileReadScope$readData$2(f1rVar, null), this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
