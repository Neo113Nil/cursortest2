package com.yandex.go.screenshot_screencast_tracker.impl.trackers;

import android.net.Uri;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1", f = "ScreenshotTracker.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScreenshotTracker$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $newApiEventFlow;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$2", f = "ScreenshotTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ long J$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.J$0 = ((Number) obj).longValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
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
            kotlin.b.b(obj);
            jst.e.getClass();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Landroid/net/Uri;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$4", f = "ScreenshotTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(2, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((Pair) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass4.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Number) pair.getSecond()).longValue();
            jst.e.getClass();
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/net/Uri;", "", "systemEventTime", "<destruct>"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$5", f = "ScreenshotTracker.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$start$1$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements zls {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long longValue = ((Number) obj).longValue();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(3, (Continuation) obj3);
            anonymousClass5.J$0 = longValue;
            anonymousClass5.L$0 = (Pair) obj2;
            return anonymousClass5.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j = this.J$0;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair((Uri) pair.getFirst(), new Long(Math.abs(((Number) pair.getSecond()).longValue() - j)));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotTracker$start$1(tpr tprVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$newApiEventFlow = tprVar;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScreenshotTracker$start$1(this.$newApiEventFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScreenshotTracker$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = new c(new m0(new jqr(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.o(new e(this.$newApiEventFlow)), 1000L), new AnonymousClass2(2, null), 3), new jqr(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.o(new g(this.this$0.h)), 1000L), new AnonymousClass4(2, null), 3), new AnonymousClass5(3, null)));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (cVar.collect(aVar, this) == coroutineSingletons) {
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
