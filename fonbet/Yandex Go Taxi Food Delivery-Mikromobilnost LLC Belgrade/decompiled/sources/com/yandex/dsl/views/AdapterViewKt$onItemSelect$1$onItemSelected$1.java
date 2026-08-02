package com.yandex.dsl.views;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.v70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/widget/Adapter;", "T", "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.dsl.views.AdapterViewKt$onItemSelect$1$onItemSelected$1", f = "adapterView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class AdapterViewKt$onItemSelect$1$onItemSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $id;
    final /* synthetic */ tls $itemListener;
    final /* synthetic */ int $position;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterViewKt$onItemSelect$1$onItemSelected$1(tls tlsVar, View view, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.$itemListener = tlsVar;
        this.$view = view;
        this.$position = i;
        this.$id = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdapterViewKt$onItemSelect$1$onItemSelected$1(this.$itemListener, this.$view, this.$position, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AdapterViewKt$onItemSelect$1$onItemSelected$1 adapterViewKt$onItemSelect$1$onItemSelected$1 = (AdapterViewKt$onItemSelect$1$onItemSelected$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        adapterViewKt$onItemSelect$1$onItemSelected$1.invokeSuspend(zy11Var);
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
        tls tlsVar = this.$itemListener;
        View view = this.$view;
        tlsVar.invoke(view != null ? new v70(view, this.$position, this.$id) : null);
        return zy11.a;
    }
}
