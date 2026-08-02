package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import com.yandex.plus.log.api.LogPriority;
import defpackage.gdg;
import defpackage.kdg;
import defpackage.ldg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.scc;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.PlusDailyViewController$onViewAttachedToWindow$1", f = "PlusDailyViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusDailyViewController$onViewAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusDailyViewController$onViewAttachedToWindow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusDailyViewController$onViewAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlusDailyViewController$onViewAttachedToWindow$1 plusDailyViewController$onViewAttachedToWindow$1 = (PlusDailyViewController$onViewAttachedToWindow$1) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        plusDailyViewController$onViewAttachedToWindow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        ldg ldgVar = aVar.o;
        pgz pgzVar = aVar.h;
        if (ldgVar == null) {
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "PlusDailyViewController", "onViewAttachedToWindow() daily content is empty");
            }
            return zy11.a;
        }
        kdg kdgVar = ldgVar.a;
        gdg gdgVar = ldgVar.b;
        String str2 = kdgVar.a;
        if (gdgVar == null || (str = gdgVar.a) == null) {
            Collections.singletonList(str2);
            throw null;
        }
        scc.g(str2, str);
        throw null;
    }
}
