package com.yandex.go.blockeduser;

import defpackage.c46;
import defpackage.e46;
import defpackage.k46;
import defpackage.l46;
import defpackage.m46;
import defpackage.ny61;
import defpackage.p36;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ e46 a;
    public final /* synthetic */ c46 b;

    public d(e46 e46Var, c46 c46Var) {
        this.a = e46Var;
        this.b = c46Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BlockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1 blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        if (continuation instanceof BlockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1) {
            blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1 = (BlockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p36 p36Var = ((m46) obj).a;
                    blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                    blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                    e46 e46Var = this.a;
                    l46 l46Var = e46Var.A;
                    String Ig = e46Var.z.Ig();
                    l46Var.b.getClass();
                    obj2 = tje.k0(uyj.a, new BlockedUserViewStateFactory$create$2(p36Var, l46Var, Ig, null), blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                this.b.render((k46) obj2);
                return zy11.a;
            }
        }
        blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1 = new BlockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockedUserPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        if (i != 0) {
        }
        this.b.render((k46) obj22);
        return zy11.a;
    }
}
