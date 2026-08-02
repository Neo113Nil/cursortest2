package androidx.compose.foundation.gestures;

import defpackage.hwd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onDoubleTap;
    final /* synthetic */ tls $onLongPress;
    final /* synthetic */ zls $onPress;
    final /* synthetic */ tls $onTap;
    final /* synthetic */ hwd0 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements wls {
        final /* synthetic */ tse $$this$coroutineScope;
        final /* synthetic */ tls $onDoubleTap;
        final /* synthetic */ tls $onLongPress;
        final /* synthetic */ zls $onPress;
        final /* synthetic */ tls $onTap;
        final /* synthetic */ s $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tse tseVar, s sVar, tls tlsVar, tls tlsVar2, zls zlsVar, tls tlsVar3, Continuation continuation) {
            super(2, continuation);
            this.$$this$coroutineScope = tseVar;
            this.$pressScope = sVar;
            this.$onDoubleTap = tlsVar;
            this.$onLongPress = tlsVar2;
            this.$onPress = zlsVar;
            this.$onTap = tlsVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.f fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
                tse tseVar = this.$$this$coroutineScope;
                s sVar = this.$pressScope;
                tls tlsVar = this.$onDoubleTap;
                tls tlsVar2 = this.$onLongPress;
                zls zlsVar = this.$onPress;
                tls tlsVar3 = this.$onTap;
                this.label = 1;
                if (z.i(fVar, tseVar, sVar, tlsVar, tlsVar2, zlsVar, tlsVar3, this) == coroutineSingletons) {
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
    public TapGestureDetectorKt$detectTapGestures$2(hwd0 hwd0Var, tls tlsVar, tls tlsVar2, zls zlsVar, tls tlsVar3, Continuation continuation) {
        super(2, continuation);
        this.$this_detectTapGestures = hwd0Var;
        this.$onDoubleTap = tlsVar;
        this.$onLongPress = tlsVar2;
        this.$onPress = zlsVar;
        this.$onTap = tlsVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            s sVar = new s(this.$this_detectTapGestures);
            hwd0 hwd0Var = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(tseVar, sVar, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
            this.label = 1;
            if (c.l(hwd0Var, anonymousClass1, this) == coroutineSingletons) {
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
