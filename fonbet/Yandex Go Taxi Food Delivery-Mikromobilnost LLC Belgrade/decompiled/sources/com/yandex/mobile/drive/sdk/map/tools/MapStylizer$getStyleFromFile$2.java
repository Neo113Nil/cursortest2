package com.yandex.mobile.drive.sdk.map.tools;

import defpackage.cma1;
import defpackage.h2b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.tools.MapStylizer$getStyleFromFile$2", f = "MapStylizer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MapStylizer$getStyleFromFile$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStylizer$getStyleFromFile$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapStylizer$getStyleFromFile$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapStylizer$getStyleFromFile$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.this$0.a.open("mapkit-style.json"), uza.a), 8192);
            try {
                String x0 = cma1.x0(bufferedReader);
                bufferedReader.close();
                return x0;
            } finally {
            }
        } catch (IOException e) {
            qgn0 qgn0Var = h2b1.c;
            if (qgn0Var != null) {
                qgn0Var.o(null, e);
            }
            return null;
        }
    }
}
