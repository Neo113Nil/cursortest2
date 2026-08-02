package com.yandex.go.flex.main_screen.presentation.feed;

import com.yandex.go.superapp.searchbar.impl.domain.h;
import defpackage.l900;
import defpackage.m900;
import defpackage.mvg;
import defpackage.n900;
import defpackage.ny61;
import defpackage.odw0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isSuperappSearchbarEnabled", "isScrollUpButtonEnabled", "Lo900;", "<anonymous>", "(ZZ)Lo900;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.feed.MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1", f = "MainScreenFeedStateRepositoryImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1 mainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1 = new MainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1(this.this$0, (Continuation) obj3);
        mainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1.Z$0 = booleanValue;
        mainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1.Z$1 = booleanValue2;
        return mainScreenFeedStateRepositoryImpl$feedBottomViewFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!z) {
                return z2 ? m900.a : l900.a;
            }
            odw0 odw0Var = this.this$0.b;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.label = 1;
            obj = ((h) odw0Var).a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new n900(((Boolean) obj).booleanValue());
    }
}
