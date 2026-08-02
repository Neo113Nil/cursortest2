package com.yandex.go.drive.superapp;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.go.drive.sdkintegration.domain.session.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1", f = "DriveOrderActivityLifecycleListener.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1", f = "DriveOrderActivityLifecycleListener.kt", l = {40}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "experiment", "Lcom/yandex/go/drive/DriveSdkExperiment;"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @mvg(c = "com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1$2", f = "DriveOrderActivityLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(a aVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((DriveSdkExperiment) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                DriveSdkExperiment driveSdkExperiment = (DriveSdkExperiment) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return Boolean.valueOf(driveSdkExperiment.getB() || this.this$0.a.c());
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldPollDrive", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1$3", f = "DriveOrderActivityLifecycleListener.kt", l = {42}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.drive.superapp.DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements wls {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(a aVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass3;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass3) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        e eVar = this.this$0.a;
                        this.Z$0 = z;
                        this.label = 1;
                        if (eVar.a(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
                rol0 j = com.yandex.go.coroutines.b.j(kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.d(this.this$0.b.a.a(), new DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$start$1(this.this$0, null)), new AnonymousClass2(this.this$0, null)), 100L);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(j, anonymousClass3, this) == coroutineSingletons) {
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
    public DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Lifecycle lifecycle = aVar.d;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
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
