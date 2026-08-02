package com.ybsdk.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.screens.spoilerOnboarding.SpoilerOnboardingFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.ew2;
import defpackage.hw2;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.pey;
import defpackage.qa50;
import defpackage.qoi0;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.vvt0;
import defpackage.wls;
import defpackage.xlp0;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1", f = "SpoilerOnboardingManagerImpl.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.utils.SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1$1", f = "SpoilerOnboardingManagerImpl.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.utils.SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "<unused var>", "<anonymous>", "(V)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "com.ybsdk.utils.SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1$1$1", f = "SpoilerOnboardingManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.ybsdk.utils.SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00921 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00921(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00921(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00921 c00921 = (C00921) create((zy11) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00921.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b bVar = this.this$0;
                tfl0 tfl0Var = bVar.c;
                ew2 ew2Var = bVar.f.g;
                kgx kgxVar = com.ybsdk.persistence.b.l[4];
                if (!ew2Var.a().booleanValue() && !bVar.g) {
                    if (bVar.i.isEnabled()) {
                        qa50 qa50Var = tfl0Var.a.a;
                        if (qa50Var == null || ((hw2) qa50Var).h().F("SpoilerOnboardingScreen") == null) {
                            tfl0Var.h(new FragmentScreen("SpoilerOnboardingScreen", false, null, null, qoi0.a(SpoilerOnboardingFragment.class), OpenScreenRequirement.WithoutRequirements.INSTANCE, 14, null));
                        }
                    } else {
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(bVar.b, null, 0, 6, null);
                        bottomSheetDialogView.render(new BottomSheetDialogView.State((d) new e(null, null, new xlp0(14, bottomSheetDialogView, bVar, ref$BooleanRef), 3), (YbButtonViewGroup.b) null, (h) null, true, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65526));
                        bVar.g = true;
                        BottomSheetDialogView.show$default(bottomSheetDialogView, bVar.a, null, 2, null);
                    }
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                n0 n0Var = ((vvt0) bVar.d).e;
                C00921 c00921 = new C00921(bVar, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(n0Var, c00921, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            pey peyVar = bVar.e.a;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (b0.a(peyVar, state, anonymousClass1, this) == coroutineSingletons) {
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
