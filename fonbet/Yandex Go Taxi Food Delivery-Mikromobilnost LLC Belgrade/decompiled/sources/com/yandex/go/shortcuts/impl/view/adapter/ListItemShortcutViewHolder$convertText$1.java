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
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.ListItemShortcutViewHolder$convertText$1", f = "ListItemShortcutViewHolder.kt", l = {371}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ListItemShortcutViewHolder$convertText$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onConverted;
    final /* synthetic */ da5 $text;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemShortcutViewHolder$convertText$1(h hVar, da5 da5Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$text = da5Var;
        this.$onConverted = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListItemShortcutViewHolder$convertText$1(this.this$0, this.$text, this.$onConverted, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ListItemShortcutViewHolder$convertText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da5 da5Var;
        Throwable th;
        tls tlsVar;
        tls tlsVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                da5Var = this.$text;
                tls tlsVar3 = this.$onConverted;
                try {
                    ru.yandex.taxi.widget.c cVar = hVar.T;
                    FormattedText formattedText = da5Var.b;
                    this.L$0 = tlsVar3;
                    this.L$1 = tlsVar3;
                    this.L$2 = da5Var;
                    this.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tlsVar2 = tlsVar3;
                    tlsVar = tlsVar2;
                } catch (Throwable th2) {
                    th = th2;
                    tlsVar = tlsVar3;
                    tlsVar.invoke(da5Var.a);
                    jst.e.k(th, "List item shortcut text fail loading");
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                da5Var = (da5) this.L$2;
                tlsVar = (tls) this.L$1;
                tlsVar2 = (tls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    tlsVar.invoke(da5Var.a);
                    jst.e.k(th, "List item shortcut text fail loading");
                    return zy11.a;
                }
            }
            CharSequence charSequence = (CharSequence) (((CharSequence) obj).length() > 0 ? obj : null);
            if (charSequence != null) {
                tlsVar2.invoke(charSequence);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
