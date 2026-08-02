package com.yandex.passport.internal.report.diary;

import android.database.Cursor;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.iwk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryUploadDaoWrapper$getFirstIssueTimestamp$2", f = "DiaryUploadDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DiaryUploadDaoWrapper$getFirstIssueTimestamp$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryUploadDaoWrapper$getFirstIssueTimestamp$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiaryUploadDaoWrapper$getFirstIssueTimestamp$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiaryUploadDaoWrapper$getFirstIssueTimestamp$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Long l = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.database.diary.e eVar = this.this$0.a;
        eVar.getClass();
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(0, "SELECT min(issuedAt) FROM diary_method");
        PassportDatabase_Impl passportDatabase_Impl = eVar.a;
        passportDatabase_Impl.u0();
        Cursor O0 = passportDatabase_Impl.O0(e);
        try {
            if (O0.moveToFirst() && !O0.isNull(0)) {
                l = Long.valueOf(O0.getLong(0));
            }
            return l;
        } finally {
            O0.close();
            e.a();
        }
    }
}
