package com.yandex.messaging.profile;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1", f = "AppDatabaseCleaner.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AppDatabaseCleaner$scheduleCleanupUnusedResources$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "synced", "inBackground"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$2", f = "AppDatabaseCleaner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.Z$0 = booleanValue;
            anonymousClass2.Z$1 = booleanValue2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(this.Z$0 && this.Z$1);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "shouldCleanup"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$3", f = "AppDatabaseCleaner.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    if (!this.Z$0) {
                        return Boolean.FALSE;
                    }
                    b bVar = this.this$0;
                    this.label = 1;
                    Object a = b.a(bVar, this);
                    this = a;
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    this = this;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                this.this$0.c.reportError("tech_db_cleanup_error", th);
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$4", f = "AppDatabaseCleaner.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.profile.AppDatabaseCleaner$scheduleCleanupUnusedResources$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(2, continuation);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass4) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(this.Z$0);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDatabaseCleaner$scheduleCleanupUnusedResources$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppDatabaseCleaner$scheduleCleanupUnusedResources$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDatabaseCleaner$scheduleCleanupUnusedResources$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new m0(new pb(bVar.e.c, 7), bVar.f.e, new AnonymousClass2(3, null))), new AnonymousClass3(this.this$0, null));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(2, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.x(I, anonymousClass4, this) == coroutineSingletons) {
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
