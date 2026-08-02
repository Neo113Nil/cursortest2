package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.ga5;
import defpackage.ha5;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.BaseShortcutViewHolder$updateBackgroundAndTitle$1", f = "BaseShortcutViewHolder.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BaseShortcutViewHolder$updateBackgroundAndTitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $altText;
    final /* synthetic */ ga5 $data;
    final /* synthetic */ ha5 $description;
    final /* synthetic */ Ref$BooleanRef $imageLoaded;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShortcutViewHolder$updateBackgroundAndTitle$1(c cVar, ga5 ga5Var, Ref$BooleanRef ref$BooleanRef, String str, ha5 ha5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$data = ga5Var;
        this.$imageLoaded = ref$BooleanRef;
        this.$altText = str;
        this.$description = ha5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseShortcutViewHolder$updateBackgroundAndTitle$1(this.this$0, this.$data, this.$imageLoaded, this.$altText, this.$description, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseShortcutViewHolder$updateBackgroundAndTitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Ref$BooleanRef ref$BooleanRef;
        String str;
        ha5 ha5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                ga5 ga5Var = this.$data;
                Ref$BooleanRef ref$BooleanRef2 = this.$imageLoaded;
                String str2 = this.$altText;
                ha5 ha5Var2 = this.$description;
                ru.yandex.taxi.widget.c cVar3 = cVar2.T;
                FormattedText formattedText = ga5Var.getBase().g.b;
                this.L$0 = cVar2;
                this.L$1 = ref$BooleanRef2;
                this.L$2 = str2;
                this.L$3 = ha5Var2;
                this.label = 1;
                Object e = ru.yandex.taxi.widget.c.e(cVar3, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                cVar = cVar2;
                ref$BooleanRef = ref$BooleanRef2;
                str = str2;
                ha5Var = ha5Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ha5Var = (ha5) this.L$3;
                str = (String) this.L$2;
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            CharSequence charSequence = (CharSequence) obj;
            if ((charSequence.length() > 0 && ref$BooleanRef.element) || str.length() == 0) {
                str = charSequence;
            }
            ha5Var.a = str;
            cVar.d0.setText(str);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.k(th, "Error while convert title in BaseShortcutViewHolder");
        }
        return zy11.a;
    }
}
