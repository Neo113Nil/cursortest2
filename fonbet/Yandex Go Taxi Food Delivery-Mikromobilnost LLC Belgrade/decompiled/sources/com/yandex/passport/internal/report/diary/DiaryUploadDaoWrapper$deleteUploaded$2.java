package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zfs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryUploadDaoWrapper$deleteUploaded$2", f = "DiaryUploadDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DiaryUploadDaoWrapper$deleteUploaded$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $olderThan;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryUploadDaoWrapper$deleteUploaded$2(n nVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$olderThan = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiaryUploadDaoWrapper$deleteUploaded$2(this.this$0, this.$olderThan, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DiaryUploadDaoWrapper$deleteUploaded$2 diaryUploadDaoWrapper$deleteUploaded$2 = (DiaryUploadDaoWrapper$deleteUploaded$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        diaryUploadDaoWrapper$deleteUploaded$2.invokeSuspend(zy11Var);
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
        com.yandex.passport.internal.database.diary.e eVar = this.this$0.a;
        long j = this.$olderThan;
        PassportDatabase_Impl passportDatabase_Impl = eVar.a;
        passportDatabase_Impl.u0();
        com.yandex.passport.internal.database.auth_cookie.c cVar = eVar.e;
        zfs a = cVar.a();
        a.b(1, j);
        try {
            passportDatabase_Impl.v0();
            try {
                a.c();
                passportDatabase_Impl.Q0();
                cVar.k(a);
                passportDatabase_Impl.u0();
                com.yandex.passport.internal.database.auth_cookie.c cVar2 = eVar.f;
                zfs a2 = cVar2.a();
                a2.b(1, j);
                try {
                    passportDatabase_Impl.v0();
                    try {
                        a2.c();
                        passportDatabase_Impl.Q0();
                        cVar2.k(a2);
                        return zy11.a;
                    } finally {
                    }
                } catch (Throwable th) {
                    cVar2.k(a2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            cVar.k(a);
            throw th2;
        }
    }
}
