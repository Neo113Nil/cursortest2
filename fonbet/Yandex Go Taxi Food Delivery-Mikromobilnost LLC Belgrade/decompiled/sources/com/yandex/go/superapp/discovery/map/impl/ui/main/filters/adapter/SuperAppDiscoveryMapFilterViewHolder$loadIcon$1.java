package com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import defpackage.auv0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter.SuperAppDiscoveryMapFilterViewHolder$loadIcon$1", f = "SuperAppDiscoveryMapFilterViewHolder.kt", l = {69}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapFilterViewHolder$loadIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $iconUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapFilterViewHolder$loadIcon$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$iconUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapFilterViewHolder$loadIcon$1(this.this$0, this.$iconUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapFilterViewHolder$loadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.U.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            SuperAppDiscoveryMapFilterViewHolder$loadIcon$1$iconByUrl$1 superAppDiscoveryMapFilterViewHolder$loadIcon$1$iconByUrl$1 = new SuperAppDiscoveryMapFilterViewHolder$loadIcon$1$iconByUrl$1(this.this$0, this.$iconUrl, null);
            this.label = 1;
            obj = tje.k0(mdhVar, superAppDiscoveryMapFilterViewHolder$loadIcon$1$iconByUrl$1, this);
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
        Drawable drawable = (BitmapDrawable) obj;
        if (drawable == null) {
            a aVar = this.this$0;
            int i2 = a.b0;
            drawable = (ColorDrawable) aVar.W.getValue();
        }
        a aVar2 = this.this$0;
        int i3 = a.b0;
        ((auv0) ((zo31) aVar2.R)).b.setImageDrawable(drawable);
        return zy11.a;
    }
}
