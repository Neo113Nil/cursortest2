package com.yandex.go.places.common.ui.gallery;

import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.common.ui.gallery.OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1", f = "OrganizationAutoscrollGalleryController.kt", l = {80, 82, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $duration;
    final /* synthetic */ long $interval;
    final /* synthetic */ sls $onFinish;
    final /* synthetic */ tls $onTick;
    Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.common.ui.gallery.OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1$1", f = "OrganizationAutoscrollGalleryController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.common.ui.gallery.OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $onTick;
        final /* synthetic */ Ref$LongRef $timeLeft;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Ref$LongRef ref$LongRef, Continuation continuation) {
            super(2, continuation);
            this.$onTick = tlsVar;
            this.$timeLeft = ref$LongRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$onTick, this.$timeLeft, continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$onTick.invoke(new Long(this.$timeLeft.element));
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.common.ui.gallery.OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1$2", f = "OrganizationAutoscrollGalleryController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.common.ui.gallery.OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ sls $onFinish;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.$onFinish = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$onFinish, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$onFinish.invoke();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1(long j, long j2, tls tlsVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$duration = j;
        this.$interval = j2;
        this.$onTick = tlsVar;
        this.$onFinish = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1(this.$duration, this.$interval, this.$onTick, this.$onFinish, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (defpackage.tje.k0(r11, r6, r10) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (defpackage.tje.k0(r11, r1, r10) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0067 -> B:13:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        Ref$LongRef ref$LongRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ref$LongRef = new Ref$LongRef();
            if (ref$LongRef.element >= this.$duration) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            ref$LongRef2 = (Ref$LongRef) this.L$0;
            b.b(obj);
            ref$LongRef = ref$LongRef2;
            if (ref$LongRef.element >= this.$duration) {
                long j = this.$interval;
                this.L$0 = ref$LongRef;
                this.label = 1;
                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                    ref$LongRef2 = ref$LongRef;
                    ref$LongRef2.element += this.$interval;
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTick, ref$LongRef2, null);
                    this.L$0 = ref$LongRef2;
                    this.label = 2;
                }
            } else {
                sjh sjhVar2 = uyj.a;
                g6u g6uVar2 = o400.a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onFinish, null);
                this.L$0 = null;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        ref$LongRef2 = (Ref$LongRef) this.L$0;
        b.b(obj);
        ref$LongRef2.element += this.$interval;
        sjh sjhVar3 = uyj.a;
        g6u g6uVar3 = o400.a;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$onTick, ref$LongRef2, null);
        this.L$0 = ref$LongRef2;
        this.label = 2;
    }
}
