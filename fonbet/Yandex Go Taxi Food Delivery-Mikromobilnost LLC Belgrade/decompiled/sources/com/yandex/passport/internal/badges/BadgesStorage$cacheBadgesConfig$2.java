package com.yandex.passport.internal.badges;

import android.content.SharedPreferences;
import com.yandex.passport.internal.report.d2;
import com.yandex.passport.internal.report.e2;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.reporters.l;
import com.yandex.passport.internal.report.yd;
import defpackage.g3r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.badges.BadgesStorage$cacheBadgesConfig$2", f = "BadgesStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class BadgesStorage$cacheBadgesConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $rawConfig;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesStorage$cacheBadgesConfig$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$rawConfig = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgesStorage$cacheBadgesConfig$2(this.this$0, this.$rawConfig, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BadgesStorage$cacheBadgesConfig$2 badgesStorage$cacheBadgesConfig$2 = (BadgesStorage$cacheBadgesConfig$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        badgesStorage$cacheBadgesConfig$2.invokeSuspend(zy11Var);
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
        try {
            g3r.g(this.this$0.e, this.$rawConfig);
            b bVar = this.this$0;
            SharedPreferences.Editor edit = bVar.d.edit();
            ((com.yandex.passport.common.a) bVar.b).getClass();
            edit.putLong("last_update", System.currentTimeMillis());
            edit.commit();
            l lVar = this.this$0.c;
            lVar.getClass();
            lVar.h(e2.w);
        } catch (Exception e) {
            l lVar2 = this.this$0.c;
            lVar2.getClass();
            lVar2.f(d2.w, new yd(e), new ld(e));
        }
        return zy11.a;
    }
}
