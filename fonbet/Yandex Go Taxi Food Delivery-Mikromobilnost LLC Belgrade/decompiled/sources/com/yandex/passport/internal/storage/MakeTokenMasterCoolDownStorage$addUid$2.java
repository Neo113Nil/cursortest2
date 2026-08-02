package com.yandex.passport.internal.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/yandex/passport/internal/storage/l;", "it", "<anonymous>", "(Ljava/util/Set;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.storage.MakeTokenMasterCoolDownStorage$addUid$2", f = "MakeTokenMasterCoolDownStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MakeTokenMasterCoolDownStorage$addUid$2 extends SuspendLambda implements wls {
    final /* synthetic */ l $uidWithTtl;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeTokenMasterCoolDownStorage$addUid$2(l lVar, Continuation continuation) {
        super(2, continuation);
        this.$uidWithTtl = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MakeTokenMasterCoolDownStorage$addUid$2 makeTokenMasterCoolDownStorage$addUid$2 = new MakeTokenMasterCoolDownStorage$addUid$2(this.$uidWithTtl, continuation);
        makeTokenMasterCoolDownStorage$addUid$2.L$0 = obj;
        return makeTokenMasterCoolDownStorage$addUid$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MakeTokenMasterCoolDownStorage$addUid$2) create((Set) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set M0 = kotlin.collections.a.M0((Set) this.L$0);
        M0.add(this.$uidWithTtl);
        return M0;
    }
}
