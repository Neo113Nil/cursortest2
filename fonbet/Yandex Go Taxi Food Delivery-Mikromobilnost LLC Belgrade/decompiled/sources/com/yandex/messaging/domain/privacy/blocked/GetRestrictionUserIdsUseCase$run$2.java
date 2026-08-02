package com.yandex.messaging.domain.privacy.blocked;

import android.database.Cursor;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.txj0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0006\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltxj0;", "kotlin.jvm.PlatformType", "cursor", "", "", "", "<anonymous>", "(Ltxj0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.privacy.blocked.GetRestrictionUserIdsUseCase$run$2", f = "GetRestrictionUserIdsUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetRestrictionUserIdsUseCase$run$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetRestrictionUserIdsUseCase$run$2 getRestrictionUserIdsUseCase$run$2 = new GetRestrictionUserIdsUseCase$run$2(2, continuation);
        getRestrictionUserIdsUseCase$run$2.L$0 = obj;
        return getRestrictionUserIdsUseCase$run$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetRestrictionUserIdsUseCase$run$2) create((txj0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Cursor cursor = ((txj0) this.L$0).a;
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(cursor.getString(0));
                cursor.moveToNext();
            }
            cursor2.close();
            return arrayList;
        } finally {
        }
    }
}
