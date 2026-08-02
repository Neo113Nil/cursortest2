package com.yandex.go.screenshot_screencast_tracker.impl;

import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.ScreenshotTracker$contentObserver$2$1;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.h;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.i3y;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2", f = "ScreenshotAndScreencastInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2$1", f = "ScreenshotAndScreencastInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.screenshot_screencast_tracker.impl.ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

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
            int addScreenRecordingCallback;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    this.this$0.c.b();
                    rfp0 rfp0Var = this.this$0.d;
                    boolean a = rfp0Var.a();
                    i3y i3yVar = rfp0Var.d;
                    if (a) {
                        addScreenRecordingCallback = ((WindowManager) rfp0Var.b.getValue()).addScreenRecordingCallback(rfp0Var.a.getMainExecutor(), (Consumer) i3yVar.getValue());
                        ((Consumer) i3yVar.getValue()).accept(Integer.valueOf(addScreenRecordingCallback));
                    } else {
                        jst.e.getClass();
                    }
                    this.label = 1;
                    if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                h hVar = this.this$0.c;
                hVar.a.getContentResolver().unregisterContentObserver((ScreenshotTracker$contentObserver$2$1) hVar.j.getValue());
                hVar.g.b();
                rfp0 rfp0Var2 = this.this$0.d;
                if (rfp0Var2.a()) {
                    ((WindowManager) rfp0Var2.b.getValue()).removeScreenRecordingCallback((Consumer) rfp0Var2.d.getValue());
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Lifecycle lifecycle = bVar.b;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
