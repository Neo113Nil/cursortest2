package com.yandex.messaging.navigation;

import android.os.Bundle;
import com.yandex.bricks.Brick;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tse;
import defpackage.u120;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.navigation.MessengerFragment$onCreateView$1$1", f = "MessengerFragment.kt", l = {43, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class MessengerFragment$onCreateView$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ u120 $ui;
    int label;
    final /* synthetic */ MessengerFragment<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerFragment$onCreateView$1$1(MessengerFragment messengerFragment, Bundle bundle, u120 u120Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = messengerFragment;
        this.$savedInstanceState = bundle;
        this.$ui = u120Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerFragment$onCreateView$1$1(this.this$0, this.$savedInstanceState, this.$ui, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerFragment$onCreateView$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r6 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nohVar = ((MessengerFragment) this.this$0).brick;
            this.label = 1;
            obj = nohVar.k(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                throw oyr.d(obj);
            }
            kotlin.b.b(obj);
        }
        Brick brick = (Brick) obj;
        Bundle bundle = this.$savedInstanceState;
        if (bundle != null) {
            String string = bundle.getString(MessengerFragment.KEY_BRICK_ID);
            Bundle bundle2 = bundle.getBundle(MessengerFragment.KEY_BRICK_STATE);
            if (string != null && bundle2 != null) {
                brick.setRestoredInstanceState(string, bundle2);
            }
        }
        this.$ui.c.a(brick);
        Brick authBrick = this.this$0.getAuthBrick();
        if (authBrick != null) {
            this.$ui.w.a(authBrick);
        }
        ((MessengerFragment) this.this$0).currentUi = this.$ui;
        noh activityComponentAsync = this.this$0.getActivityComponentAsync();
        this.label = 2;
        obj = activityComponentAsync.k(this);
    }
}
