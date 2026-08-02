package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.da5;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.SquareButtonShortcutViewHolder$convertText$1", f = "SquareButtonShortcutViewHolder.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SquareButtonShortcutViewHolder$convertText$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onConverted;
    final /* synthetic */ da5 $text;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareButtonShortcutViewHolder$convertText$1(tls tlsVar, u uVar, da5 da5Var, Continuation continuation) {
        super(2, continuation);
        this.$onConverted = tlsVar;
        this.this$0 = uVar;
        this.$text = da5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SquareButtonShortcutViewHolder$convertText$1(this.$onConverted, this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SquareButtonShortcutViewHolder$convertText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tls tlsVar;
        da5 da5Var;
        tls tlsVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar3 = this.$onConverted;
                u uVar = this.this$0;
                da5 da5Var2 = this.$text;
                try {
                    ru.yandex.taxi.widget.c cVar = uVar.T;
                    FormattedText formattedText = da5Var2.b;
                    this.L$0 = tlsVar3;
                    this.L$1 = da5Var2;
                    this.L$2 = tlsVar3;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tlsVar2 = tlsVar3;
                    da5Var = da5Var2;
                    obj = e;
                    tlsVar = tlsVar2;
                } catch (Throwable unused) {
                    tlsVar = tlsVar3;
                    da5Var = da5Var2;
                    jst.e.getClass();
                    tlsVar.invoke(da5Var.a);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar2 = (tls) this.L$2;
                da5Var = (da5) this.L$1;
                tlsVar = (tls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    jst.e.getClass();
                    tlsVar.invoke(da5Var.a);
                    return zy11.a;
                }
            }
            tlsVar2.invoke(obj);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
