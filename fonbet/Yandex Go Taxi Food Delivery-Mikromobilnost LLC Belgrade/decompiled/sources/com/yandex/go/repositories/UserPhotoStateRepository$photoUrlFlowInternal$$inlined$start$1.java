package com.yandex.go.repositories;

import defpackage.cne0;
import defpackage.jq21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.repositories.UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1", f = "UserPhotoStateRepository.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1 userPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1 = new UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1(this.this$0, continuation);
        userPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1.L$0 = obj;
        return userPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0.b;
            String Hg = hVar.Hg();
            cne0 cne0Var = (cne0) hVar.b;
            String l = cne0Var.l("user_photo_url", null);
            String l2 = cne0Var.l("user_photo_status", null);
            jq21 jq21Var = (Hg == null || l == null || l2 == null) ? null : new jq21(Hg, l, l2);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(jq21Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
