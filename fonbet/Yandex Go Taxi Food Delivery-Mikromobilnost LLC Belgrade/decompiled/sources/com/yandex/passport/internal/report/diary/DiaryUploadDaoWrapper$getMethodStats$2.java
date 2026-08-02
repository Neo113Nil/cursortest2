package com.yandex.passport.internal.report.diary;

import android.database.Cursor;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.iwk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.zfs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/internal/report/diary/d;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryUploadDaoWrapper$getMethodStats$2", f = "DiaryUploadDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DiaryUploadDaoWrapper$getMethodStats$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $end;
    final /* synthetic */ long $start;
    final /* synthetic */ com.yandex.passport.internal.database.diary.f $upload;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryUploadDaoWrapper$getMethodStats$2(n nVar, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$start = j;
        this.$end = j2;
        this.$upload = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiaryUploadDaoWrapper$getMethodStats$2(this.this$0, this.$start, this.$end, this.$upload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiaryUploadDaoWrapper$getMethodStats$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        long j = this.$start;
        long j2 = this.$end;
        com.yandex.passport.internal.database.diary.f fVar = this.$upload;
        eVar.getClass();
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(2, "SELECT name, COUNT(name) as count FROM diary_method WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ? GROUP BY name");
        e.b(1, j);
        e.b(2, j2);
        PassportDatabase_Impl passportDatabase_Impl = eVar.a;
        passportDatabase_Impl.u0();
        Cursor O0 = passportDatabase_Impl.O0(e);
        try {
            ArrayList arrayList = new ArrayList(O0.getCount());
            while (O0.moveToNext()) {
                arrayList.add(new d(O0.isNull(0) ? null : O0.getString(0), O0.getInt(1)));
            }
            O0.close();
            e.a();
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Got method stats: " + arrayList, 8);
            }
            long j3 = fVar.a;
            passportDatabase_Impl.u0();
            com.yandex.passport.internal.database.auth_cookie.c cVar2 = eVar.c;
            zfs a = cVar2.a();
            a.b(1, j3);
            a.b(2, j);
            a.b(3, j2);
            try {
                passportDatabase_Impl.v0();
                try {
                    a.c();
                    passportDatabase_Impl.Q0();
                    return arrayList;
                } finally {
                    passportDatabase_Impl.B0();
                }
            } finally {
                cVar2.k(a);
            }
        } catch (Throwable th) {
            O0.close();
            e.a();
            throw th;
        }
    }
}
