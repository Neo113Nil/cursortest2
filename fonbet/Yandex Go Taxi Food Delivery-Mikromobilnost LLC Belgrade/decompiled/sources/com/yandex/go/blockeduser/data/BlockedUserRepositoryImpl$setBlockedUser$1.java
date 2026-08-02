package com.yandex.go.blockeduser.data;

import defpackage.m46;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.blockeduser.data.BlockedUserRepositoryImpl$setBlockedUser$1", f = "BlockedUserRepositoryImpl.kt", l = {34, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BlockedUserRepositoryImpl$setBlockedUser$1 extends SuspendLambda implements wls {
    final /* synthetic */ m46 $blockedUser;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedUserRepositoryImpl$setBlockedUser$1(c cVar, m46 m46Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$blockedUser = m46Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockedUserRepositoryImpl$setBlockedUser$1(this.this$0, this.$blockedUser, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockedUserRepositoryImpl$setBlockedUser$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.a;
            this.label = 1;
            obj = eVar.a.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            r0 r0Var = this.this$0.c;
            m46 m46Var = this.$blockedUser;
            this.label = 2;
            r0Var.emit(m46Var, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
