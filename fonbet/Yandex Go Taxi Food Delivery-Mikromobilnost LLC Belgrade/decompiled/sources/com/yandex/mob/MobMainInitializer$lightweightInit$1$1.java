package com.yandex.mob;

import com.yandex.mob.domain.InitialUseCase$Result;
import com.yandex.mob.domain.u;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.jr20;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo20;
import defpackage.rot;
import defpackage.tse;
import defpackage.un20;
import defpackage.wls;
import defpackage.xo20;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobMainInitializer$lightweightInit$1$1", f = "MobMainInitializer.kt", l = {52, 53, 54, 56, 62, 61}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobMainInitializer$lightweightInit$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ eyc $initialComplete;
    final /* synthetic */ oo20 $this_with;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MobMainInitializer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.mob.MobMainInitializer$lightweightInit$1$1$1", f = "MobMainInitializer.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
    /* renamed from: com.yandex.mob.MobMainInitializer$lightweightInit$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ oo20 $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oo20 oo20Var, Continuation continuation) {
            super(2, continuation);
            this.$this_with = oo20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_with, continuation);
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
                com.yandex.mob.data.c cVar = (com.yandex.mob.data.c) ((xo20) this.$this_with).K.getValue();
                this.label = 1;
                if (cVar.o(this) == coroutineSingletons) {
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
    public MobMainInitializer$lightweightInit$1$1(oo20 oo20Var, MobMainInitializer mobMainInitializer, eyc eycVar, Continuation continuation) {
        super(2, continuation);
        this.$this_with = oo20Var;
        this.this$0 = mobMainInitializer;
        this.$initialComplete = eycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobMainInitializer$lightweightInit$1$1(this.$this_with, this.this$0, this.$initialComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobMainInitializer$lightweightInit$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r9.h(r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r9.a(r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r9.c(r8) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r9 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x013b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InitialUseCase$Result initialUseCase$Result;
        com.yandex.mob.reporting.a b;
        rot rotVar;
        rot rotVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                com.yandex.mob.domain.j jVar = (com.yandex.mob.domain.j) ((xo20) this.$this_with).d.getValue();
                this.label = 1;
                obj = jVar.a(this);
                break;
            case 1:
                kotlin.b.b(obj);
                initialUseCase$Result = (InitialUseCase$Result) obj;
                un20 un20Var = (un20) ((xo20) this.$this_with).c.getValue();
                this.L$0 = initialUseCase$Result;
                this.label = 2;
                break;
            case 2:
                initialUseCase$Result = (InitialUseCase$Result) this.L$0;
                kotlin.b.b(obj);
                m mVar = (m) ((xo20) this.$this_with).I.getValue();
                this.L$0 = initialUseCase$Result;
                this.label = 3;
                break;
            case 3:
                initialUseCase$Result = (InitialUseCase$Result) this.L$0;
                kotlin.b.b(obj);
                ((u) ((xo20) this.$this_with).y.getValue()).b();
                com.yandex.mob.data.c cVar = (com.yandex.mob.data.c) ((xo20) this.$this_with).K.getValue();
                this.L$0 = initialUseCase$Result;
                this.label = 4;
                break;
            case 4:
                initialUseCase$Result = (InitialUseCase$Result) this.L$0;
                kotlin.b.b(obj);
                jr20 jr20Var = (jr20) this.this$0.c.get();
                if (jr20Var != null) {
                    jr20.b(jr20Var, (jse) ((xo20) this.$this_with).H.getValue(), new AnonymousClass1(this.$this_with, null), 2);
                }
                ((fyc) this.$initialComplete).T(initialUseCase$Result);
                rot c = ((xo20) this.$this_with).c();
                b = ((xo20) this.$this_with).b();
                com.yandex.mob.datastore.f fVar = (com.yandex.mob.datastore.f) ((xo20) this.$this_with).J.getValue();
                this.L$0 = null;
                this.L$1 = c;
                this.L$2 = b;
                this.label = 5;
                Object b2 = fVar.b(this);
                if (b2 != coroutineSingletons) {
                    rotVar = c;
                    obj = b2;
                    this.L$0 = null;
                    this.L$1 = rotVar;
                    this.L$2 = null;
                    this.label = 6;
                    obj = b.n((List) obj, this);
                    if (obj != coroutineSingletons) {
                        rotVar2 = rotVar;
                        rotVar2.b((Pair) obj);
                        jr20 jr20Var2 = (jr20) this.this$0.c.get();
                        this.this$0.e.set(jr20Var2 != null ? jr20.b(jr20Var2, (jse) ((xo20) this.$this_with).H.getValue(), new MobMainInitializer$lightweightInit$1$1$warningJob$1(this.this$0, this.$this_with, null), 2) : null);
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            case 5:
                b = (com.yandex.mob.reporting.a) this.L$2;
                rotVar = (rot) this.L$1;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = rotVar;
                this.L$2 = null;
                this.label = 6;
                obj = b.n((List) obj, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                rotVar2 = (rot) this.L$1;
                kotlin.b.b(obj);
                rotVar2.b((Pair) obj);
                jr20 jr20Var22 = (jr20) this.this$0.c.get();
                this.this$0.e.set(jr20Var22 != null ? jr20.b(jr20Var22, (jse) ((xo20) this.$this_with).H.getValue(), new MobMainInitializer$lightweightInit$1$1$warningJob$1(this.this$0, this.$this_with, null), 2) : null);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
