package com.yandex.go.yb.qr.ui;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.qr.ui.YbQrViewHolder$attach$2", f = "YbQrViewHolder.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbQrViewHolder$attach$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbQrViewHolder$attach$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbQrViewHolder$attach$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbQrViewHolder$attach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GoView goView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            GoView goView2 = aVar.i;
            Drawable drawable = aVar.h.getDrawable();
            this.L$0 = goView2;
            this.label = 1;
            aVar.c.getClass();
            obj = tje.k0(uyj.a, new YbQrViewHolder$createShadowDrawable$2(aVar, drawable, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            goView = goView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goView = (GoView) this.L$0;
            b.b(obj);
        }
        goView.setBackground((Drawable) obj);
        return zy11.a;
    }
}
