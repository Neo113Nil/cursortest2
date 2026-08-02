package com.yandex.go.explorer.impl.ui.map.animation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$animateSequentially$2", f = "ExplorerUnviewedHexAnimator.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerUnviewedHexAnimator$animateSequentially$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $hexCount;
    final /* synthetic */ wls $onHexAlphaUpdate;
    final /* synthetic */ tls $onHexFadeComplete;
    final /* synthetic */ wls $onMoveToHex;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$animateSequentially$2$1", f = "ExplorerUnviewedHexAnimator.kt", l = {31, 32}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.ui.map.animation.ExplorerUnviewedHexAnimator$animateSequentially$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ int $index;
        final /* synthetic */ wls $onHexAlphaUpdate;
        final /* synthetic */ tls $onHexFadeComplete;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, int i, wls wlsVar, tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$index = i;
            this.$onHexAlphaUpdate = wlsVar;
            this.$onHexFadeComplete = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$index, this.$onHexAlphaUpdate, this.$onHexFadeComplete, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (com.yandex.go.explorer.impl.ui.map.animation.a.a(r6, r1, r3, r4, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (com.yandex.go.explorer.impl.ui.map.animation.a.b(r6, r1, r4, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                int i2 = this.$index;
                wls wlsVar = this.$onHexAlphaUpdate;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            a aVar2 = this.this$0;
            int i3 = this.$index;
            wls wlsVar2 = this.$onHexAlphaUpdate;
            tls tlsVar = this.$onHexFadeComplete;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerUnviewedHexAnimator$animateSequentially$2(int i, a aVar, wls wlsVar, wls wlsVar2, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$hexCount = i;
        this.this$0 = aVar;
        this.$onMoveToHex = wlsVar;
        this.$onHexAlphaUpdate = wlsVar2;
        this.$onHexFadeComplete = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExplorerUnviewedHexAnimator$animateSequentially$2 explorerUnviewedHexAnimator$animateSequentially$2 = new ExplorerUnviewedHexAnimator$animateSequentially$2(this.$hexCount, this.this$0, this.$onMoveToHex, this.$onHexAlphaUpdate, this.$onHexFadeComplete, continuation);
        explorerUnviewedHexAnimator$animateSequentially$2.L$0 = obj;
        return explorerUnviewedHexAnimator$animateSequentially$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerUnviewedHexAnimator$animateSequentially$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:5:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        wls wlsVar;
        Integer num;
        a aVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            i = 0;
            if (i < this.$hexCount) {
                wlsVar = this.$onMoveToHex;
                num = new Integer(i);
                this.L$0 = tseVar;
                this.I$0 = i;
                this.label = 1;
                if (wlsVar.invoke(num, this) == coroutineSingletons) {
                }
                int i3 = i;
                aVar = this.this$0;
                if (!aVar.b) {
                }
            }
            return zy11.a;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        b.b(obj);
        int i32 = i;
        aVar = this.this$0;
        if (!aVar.b) {
            tje.N(tseVar, null, null, new AnonymousClass1(aVar, i32, this.$onHexAlphaUpdate, this.$onHexFadeComplete, null), 3);
            i = i32 + 1;
            if (i < this.$hexCount && !this.this$0.b) {
                wlsVar = this.$onMoveToHex;
                num = new Integer(i);
                this.L$0 = tseVar;
                this.I$0 = i;
                this.label = 1;
                if (wlsVar.invoke(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int i322 = i;
                aVar = this.this$0;
                if (!aVar.b) {
                }
            }
        }
        return zy11.a;
    }
}
