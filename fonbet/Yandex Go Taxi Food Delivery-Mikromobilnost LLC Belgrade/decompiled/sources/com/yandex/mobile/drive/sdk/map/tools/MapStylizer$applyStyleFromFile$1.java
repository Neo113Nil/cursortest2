package com.yandex.mobile.drive.sdk.map.tools;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ps00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.tools.MapStylizer$applyStyleFromFile$1", f = "MapStylizer.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapStylizer$applyStyleFromFile$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStylizer$applyStyleFromFile$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapStylizer$applyStyleFromFile$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapStylizer$applyStyleFromFile$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.e;
            this.label = 1;
            obj = e.A(r0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            a aVar = this.this$0;
            if (aVar.g == null) {
                aVar.g = str;
            }
            for (ps00 ps00Var : aVar.f.values()) {
                String str2 = ps00Var.b;
                if (str2 == null || str2.equals("")) {
                    ps00Var.a.setMapStyle(42, str);
                    ps00Var.b = str;
                }
            }
        }
        return zy11.a;
    }
}
