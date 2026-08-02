package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import android.view.View;
import android.view.ViewGroup;
import defpackage.j170;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1", f = "SuperAppMainOnboardingView.kt", l = {333, 341}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ j170 $onboarding;
    final /* synthetic */ String $shortcutId;
    int label;
    final /* synthetic */ b this$0;
    final /* synthetic */ SuperAppMainOnboardingView this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1(b bVar, String str, j170 j170Var, SuperAppMainOnboardingView superAppMainOnboardingView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$shortcutId = str;
        this.$onboarding = j170Var;
        this.this$1 = superAppMainOnboardingView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1(this.this$0, this.$shortcutId, this.$onboarding, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002a, code lost:
    
        if (com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.b.I(r7, r1, r6) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        View view;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String str = this.$shortcutId;
            this.label = 1;
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
        list = SuperAppMainOnboardingView.overlappingContainers;
        SuperAppMainOnboardingView superAppMainOnboardingView = this.this$1;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                String str2 = (String) it.next();
                view = superAppMainOnboardingView.mainScreenRoot;
                ViewGroup viewGroup = (ViewGroup) view.findViewWithTag(str2);
                if (viewGroup != null && viewGroup.getChildCount() > 0) {
                    break;
                }
            } else {
                b bVar2 = this.this$0;
                String str3 = this.$shortcutId;
                j170 j170Var = this.$onboarding;
                this.label = 2;
                if (b.h(bVar2, str3, j170Var, this) == coroutineSingletons) {
                }
            }
        }
        return coroutineSingletons;
    }
}
