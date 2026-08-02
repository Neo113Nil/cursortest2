package com.yandex.go.chargers.order.active;

import android.graphics.Bitmap;
import com.yandex.go.design.view.GoImageView;
import defpackage.al9;
import defpackage.g16;
import defpackage.lba;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.BannerViewHolder$bindImage$1", f = "ChargersActiveOrderAdapter.kt", l = {207}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BannerViewHolder$bindImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ al9 $data;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewHolder$bindImage$1(al9 al9Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$data = al9Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannerViewHolder$bindImage$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannerViewHolder$bindImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$data.d;
            int i2 = (str == null || str.length() == 0) ? 1 : 0;
            int i3 = i2 ^ 1;
            b bVar = this.this$0;
            int i4 = b.V;
            ((lba) ((zo31) bVar.R)).c.setVisibility(i2 != 0 ? 8 : 0);
            if (i2 == 0) {
                b bVar2 = this.this$0;
                GoImageView goImageView2 = ((lba) ((zo31) bVar2.R)).c;
                g16 b = bVar2.S.b().b(this.$data.d);
                this.L$0 = goImageView2;
                this.I$0 = i3;
                this.label = 1;
                obj = ru.yandex.taxi.utils.a.b(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                goImageView = goImageView2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        goImageView = (GoImageView) this.L$0;
        kotlin.b.b(obj);
        goImageView.setImageBitmap((Bitmap) obj);
        return zy11.a;
    }
}
