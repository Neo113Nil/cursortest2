package com.yandex.go.taxi.order.superapp.orders.ui;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6y0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$setHeaderDialogueIcon$1", f = "TaxiOrderViewHolder.kt", l = {425}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderViewHolder$setHeaderDialogueIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewHolder$setHeaderDialogueIcon$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderViewHolder$setHeaderDialogueIcon$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderViewHolder$setHeaderDialogueIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar3 = this.this$0;
                try {
                    g16 b = bVar3.S.b().b(this.$url);
                    this.L$0 = bVar3;
                    this.L$1 = bVar3;
                    this.label = 1;
                    Object a = b.a(this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar3;
                    obj = a;
                    bVar2 = bVar;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    bVar.x0.setTitleAlignment(1);
                    bVar.x0.clearLeadView();
                    bVar.T0.b("setHeaderDialogueIcon", th, new y6y0(2));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$1;
                bVar2 = (b) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    bVar.x0.setTitleAlignment(1);
                    bVar.x0.clearLeadView();
                    bVar.T0.b("setHeaderDialogueIcon", th, new y6y0(2));
                    return zy11.a;
                }
            }
            bVar2.x0.setLeadImage((Bitmap) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
