package com.yandex.passport.internal.badges;

import com.yandex.passport.internal.report.b2;
import com.yandex.passport.internal.report.reporters.l;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.badges.BadgesStorage$isBadgesConfigUpToDate$2", f = "BadgesStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class BadgesStorage$isBadgesConfigUpToDate$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesStorage$isBadgesConfigUpToDate$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgesStorage$isBadgesConfigUpToDate$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BadgesStorage$isBadgesConfigUpToDate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.e.exists()) {
            b bVar = this.this$0;
            long j = bVar.d.getLong("last_update", 0L);
            ((com.yandex.passport.common.a) bVar.b).getClass();
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis >= 0 && currentTimeMillis < 86400000) {
                z = true;
                if (!z) {
                    l lVar = this.this$0.c;
                    lVar.getClass();
                    lVar.h(b2.w);
                }
                return Boolean.valueOf(z);
            }
        }
        z = false;
        if (!z) {
        }
        return Boolean.valueOf(z);
    }
}
