package com.yandex.go.flex.common.extensions.shortcut_shimmer;

import android.view.View;
import defpackage.d1s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$listener$1$1", f = "ShortcutShimmerExtensionHandler.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ShortcutShimmerExtensionHandler$observeTheme$listener$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ShortcutShimmeringDrawable $drawable;
    final /* synthetic */ View $this_observeTheme;
    int label;
    final /* synthetic */ d1s0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$listener$1$1$1", f = "ShortcutShimmerExtensionHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmerExtensionHandler$observeTheme$listener$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ShortcutShimmeringDrawable $drawable;
        final /* synthetic */ View $this_observeTheme;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShortcutShimmeringDrawable shortcutShimmeringDrawable, View view, Continuation continuation) {
            super(2, continuation);
            this.$drawable = shortcutShimmeringDrawable;
            this.$this_observeTheme = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$drawable, this.$this_observeTheme, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ThemeType) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ThemeType themeType = (ThemeType) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$drawable.applyTheme(themeType, this.$this_observeTheme.getContext());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutShimmerExtensionHandler$observeTheme$listener$1$1(d1s0 d1s0Var, ShortcutShimmeringDrawable shortcutShimmeringDrawable, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d1s0Var;
        this.$drawable = shortcutShimmeringDrawable;
        this.$this_observeTheme = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutShimmerExtensionHandler$observeTheme$listener$1$1(this.this$0, this.$drawable, this.$this_observeTheme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutShimmerExtensionHandler$observeTheme$listener$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.this$0.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$drawable, this.$this_observeTheme, null);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
