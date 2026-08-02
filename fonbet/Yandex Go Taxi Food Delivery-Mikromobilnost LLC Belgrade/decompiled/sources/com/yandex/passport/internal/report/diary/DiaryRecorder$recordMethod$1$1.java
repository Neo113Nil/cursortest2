package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.methods.x2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryRecorder$recordMethod$1$1", f = "DiaryRecorder.kt", l = {40, 47}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DiaryRecorder$recordMethod$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ x2 $method;
    final /* synthetic */ k $this_runIf;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryRecorder$recordMethod$1$1(k kVar, x2 x2Var, Continuation continuation) {
        super(2, continuation);
        this.$this_runIf = kVar;
        this.$method = x2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiaryRecorder$recordMethod$1$1(this.$this_runIf, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiaryRecorder$recordMethod$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r1.o(r3, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.$this_runIf.c;
            String name = this.$method.a.name();
            this.$this_runIf.b.getClass();
            com.yandex.passport.internal.database.diary.a aVar = new com.yandex.passport.internal.database.diary.a(name, System.currentTimeMillis(), false);
            this.label = 1;
            a = cVar.a(aVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        k kVar = this.$this_runIf;
        x2 x2Var = this.$method;
        if (!(a instanceof Result.Failure)) {
            b bVar = kVar.d;
            this.L$0 = a;
            this.label = 2;
        }
        return zy11.a;
    }
}
