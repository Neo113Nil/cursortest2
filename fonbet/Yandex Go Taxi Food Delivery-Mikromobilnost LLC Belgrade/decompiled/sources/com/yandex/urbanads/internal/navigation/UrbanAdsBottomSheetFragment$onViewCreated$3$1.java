package com.yandex.urbanads.internal.navigation;

import android.app.Dialog;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.urbanads.internal.flex.UrbanAdsTheme;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tse;
import defpackage.w511;
import defpackage.wf21;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment$onViewCreated$3$1", f = "UrbanAdsBottomSheetFragment.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UrbanAdsBottomSheetFragment$onViewCreated$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ pey $viewLifecycleOwner;
    int label;
    final /* synthetic */ UrbanAdsBottomSheetFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment$onViewCreated$3$1$1", f = "UrbanAdsBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment$onViewCreated$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ UrbanAdsBottomSheetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, Continuation continuation) {
            super(2, continuation);
            this.this$0 = urbanAdsBottomSheetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i3y i3yVar;
            Window window;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            wf21 wf21Var = UrbanAdsTheme.Companion;
            i3yVar = this.this$0.themeId;
            String str = (String) i3yVar.getValue();
            wf21Var.getClass();
            for (UrbanAdsTheme urbanAdsTheme : UrbanAdsTheme.a()) {
                if (jl40.l(urbanAdsTheme.getThemeId(), str)) {
                    Dialog dialog = this.this$0.getDialog();
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        this.this$0.updateSystemBars(window, urbanAdsTheme, false, true);
                    }
                    return zy11.a;
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrbanAdsBottomSheetFragment$onViewCreated$3$1(pey peyVar, UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment, Continuation continuation) {
        super(2, continuation);
        this.$viewLifecycleOwner = peyVar;
        this.this$0 = urbanAdsBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UrbanAdsBottomSheetFragment$onViewCreated$3$1(this.$viewLifecycleOwner, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UrbanAdsBottomSheetFragment$onViewCreated$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pey peyVar = this.$viewLifecycleOwner;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (b0.a(peyVar, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
