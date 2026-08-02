package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lzy11;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.ConfigMigrationUseCase$invoke$2", f = "ConfigMigrationUseCase.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ConfigMigrationUseCase$invoke$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $completedTags;
    final /* synthetic */ InitialUseCase$Result $initialResult;
    final /* synthetic */ Set<String> $pendingTags;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.mob.domain.ConfigMigrationUseCase$invoke$2$1", f = "ConfigMigrationUseCase.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: com.yandex.mob.domain.ConfigMigrationUseCase$invoke$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ InitialUseCase$Result $initialResult;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InitialUseCase$Result initialUseCase$Result, e eVar, Continuation continuation) {
            super(2, continuation);
            this.$initialResult = initialUseCase$Result;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$initialResult, this.this$0, continuation);
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
                if (this.$initialResult == InitialUseCase$Result.ExistingUser) {
                    u uVar = this.this$0.b;
                    MobTrigger mobTrigger = MobTrigger.Migration;
                    this.label = 1;
                    if (uVar.c(mobTrigger, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.mob.domain.ConfigMigrationUseCase$invoke$2$2", f = "ConfigMigrationUseCase.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: com.yandex.mob.domain.ConfigMigrationUseCase$invoke$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Set<String> $completedTags;
        final /* synthetic */ Set<String> $pendingTags;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Set set, Set set2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$completedTags = set;
            this.$pendingTags = set2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$completedTags, this.$pendingTags, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.mob.datastore.d dVar = this.this$0.a;
                LinkedHashSet h = v4r0.h(this.$completedTags, this.$pendingTags);
                this.label = 1;
                if (dVar.p(h, this) == coroutineSingletons) {
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
    public ConfigMigrationUseCase$invoke$2(InitialUseCase$Result initialUseCase$Result, e eVar, Set set, Set set2, Continuation continuation) {
        super(2, continuation);
        this.$initialResult = initialUseCase$Result;
        this.this$0 = eVar;
        this.$completedTags = set;
        this.$pendingTags = set2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConfigMigrationUseCase$invoke$2 configMigrationUseCase$invoke$2 = new ConfigMigrationUseCase$invoke$2(this.$initialResult, this.this$0, this.$completedTags, this.$pendingTags, continuation);
        configMigrationUseCase$invoke$2.L$0 = obj;
        return configMigrationUseCase$invoke$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfigMigrationUseCase$invoke$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        noh[] nohVarArr = {tje.h(tseVar, null, null, new AnonymousClass1(this.$initialResult, this.this$0, null), 3), tje.h(tseVar, null, null, new AnonymousClass2(this.this$0, this.$completedTags, this.$pendingTags, null), 3)};
        this.L$0 = null;
        this.label = 1;
        Object c = kotlinx.coroutines.a.c(nohVarArr, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
