package com.yandex.payment.divkit.license;

import com.yandex.payment.divkit.usecases.h;
import defpackage.cnk;
import defpackage.edy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omk;
import defpackage.tse;
import defpackage.u2l;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.license.LicenseViewModel$loadAndShowDivJson$1", f = "LicenseViewModel.kt", l = {42, 43}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class LicenseViewModel$loadAndShowDivJson$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ edy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LicenseViewModel$loadAndShowDivJson$1(edy edyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = edyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LicenseViewModel$loadAndShowDivJson$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LicenseViewModel$loadAndShowDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            edy edyVar = this.this$0;
            h hVar = edyVar.b;
            u2l u2lVar = edyVar.w;
            this.label = 1;
            obj = hVar.b(u2lVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            b.b(obj);
        }
        edy edyVar2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        Object emit = edyVar2.y.emit(new cnk((omk) obj, Collections.singletonList(new Pair("isLightTheme", String.valueOf(edyVar2.x)))), this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
