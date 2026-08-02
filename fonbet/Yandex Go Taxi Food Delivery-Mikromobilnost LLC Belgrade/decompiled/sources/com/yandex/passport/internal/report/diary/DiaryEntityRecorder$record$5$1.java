package com.yandex.passport.internal.report.diary;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryEntityRecorder$record$5$1", f = "DiaryEntityRecorder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DiaryEntityRecorder$record$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.database.diary.b $entity;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryEntityRecorder$record$5$1(c cVar, com.yandex.passport.internal.database.diary.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$entity = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiaryEntityRecorder$record$5$1(this.this$0, this.$entity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiaryEntityRecorder$record$5$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        com.yandex.passport.internal.database.diary.b bVar = this.$entity;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "parameter entity recorded: " + bVar, 8);
        }
        com.yandex.passport.internal.database.diary.d dVar = this.this$0.b;
        com.yandex.passport.internal.database.diary.b bVar2 = this.$entity;
        PassportDatabase_Impl passportDatabase_Impl = dVar.a;
        passportDatabase_Impl.u0();
        passportDatabase_Impl.v0();
        try {
            long n = dVar.c.n(bVar2);
            passportDatabase_Impl.Q0();
            passportDatabase_Impl.B0();
            Long l = new Long(n);
            LogLevel logLevel = LogLevel.DEBUG;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(logLevel, null, qv10.j(l.longValue(), "parameter entity recorded with id="), 10);
            }
            return l;
        } catch (Throwable th) {
            passportDatabase_Impl.B0();
            throw th;
        }
    }
}
