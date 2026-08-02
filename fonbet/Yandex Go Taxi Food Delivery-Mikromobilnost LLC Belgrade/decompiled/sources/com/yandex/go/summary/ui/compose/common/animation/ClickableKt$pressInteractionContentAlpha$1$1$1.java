package com.yandex.go.summary.ui.compose.common.animation;

import defpackage.ay40;
import defpackage.g8w;
import defpackage.h8w;
import defpackage.ixe0;
import defpackage.jxe0;
import defpackage.kxe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.ClickableKt$pressInteractionContentAlpha$1$1$1", f = "Clickable.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ClickableKt$pressInteractionContentAlpha$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $alphaAnimatable;
    final /* synthetic */ h8w $interactionSource;
    final /* synthetic */ float $pressedAlpha;
    final /* synthetic */ float $unpressedAlpha;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg8w;", "interaction", "Lzy11;", "<anonymous>", "(Lg8w;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.ui.compose.common.animation.ClickableKt$pressInteractionContentAlpha$1$1$1$1", f = "Clickable.kt", l = {MSException.ERROR_INVALID_PASSWORD, 91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.animation.ClickableKt$pressInteractionContentAlpha$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ androidx.compose.animation.core.a $alphaAnimatable;
        final /* synthetic */ float $pressedAlpha;
        final /* synthetic */ float $unpressedAlpha;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a aVar, float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.$alphaAnimatable = aVar;
            this.$pressedAlpha = f;
            this.$unpressedAlpha = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alphaAnimatable, this.$pressedAlpha, this.$unpressedAlpha, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((g8w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (androidx.compose.animation.core.a.d(r6, r7, null, null, null, r13, 14) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (androidx.compose.animation.core.a.d(r2, r3, null, null, null, r13, 14) == r1) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g8w g8wVar = (g8w) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (g8wVar instanceof jxe0) {
                    androidx.compose.animation.core.a aVar = this.$alphaAnimatable;
                    Float f = new Float(this.$pressedAlpha);
                    this.L$0 = null;
                    this.label = 1;
                } else if ((g8wVar instanceof kxe0) || (g8wVar instanceof ixe0)) {
                    androidx.compose.animation.core.a aVar2 = this.$alphaAnimatable;
                    Float f2 = new Float(this.$unpressedAlpha);
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$pressInteractionContentAlpha$1$1$1(h8w h8wVar, androidx.compose.animation.core.a aVar, float f, float f2, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = h8wVar;
        this.$alphaAnimatable = aVar;
        this.$pressedAlpha = f;
        this.$unpressedAlpha = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClickableKt$pressInteractionContentAlpha$1$1$1(this.$interactionSource, this.$alphaAnimatable, this.$pressedAlpha, this.$unpressedAlpha, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$pressInteractionContentAlpha$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = ((ay40) this.$interactionSource).a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alphaAnimatable, this.$pressedAlpha, this.$unpressedAlpha, null);
            this.label = 1;
            if (e.k(n0Var, anonymousClass1, this) == coroutineSingletons) {
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
