package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.jst;
import defpackage.l4q0;
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
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.SectionTypedHeaderViewHolder$bindDefaultAppearance$5", f = "SectionTypedHeaderViewHolder.kt", l = {197}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SectionTypedHeaderViewHolder$bindDefaultAppearance$5 extends SuspendLambda implements wls {
    final /* synthetic */ l4q0 $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTypedHeaderViewHolder$bindDefaultAppearance$5(s sVar, l4q0 l4q0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$data = l4q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionTypedHeaderViewHolder$bindDefaultAppearance$5(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SectionTypedHeaderViewHolder$bindDefaultAppearance$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l4q0 l4q0Var;
        Throwable th;
        s sVar;
        s sVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                s sVar3 = this.this$0;
                l4q0Var = this.$data;
                try {
                    ru.yandex.taxi.widget.c cVar = sVar3.U;
                    FormattedText formattedText = l4q0Var.c.b;
                    this.L$0 = sVar3;
                    this.L$1 = sVar3;
                    this.L$2 = l4q0Var;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sVar = sVar3;
                    obj = e;
                    sVar2 = sVar;
                } catch (Throwable th2) {
                    th = th2;
                    sVar = sVar3;
                    sVar.W.setTrailCompanionText(l4q0Var.c.a);
                    sVar.W.setTrailCompanionTextMaxWidth((int) (r12.getMeasuredWidth() * 0.4d));
                    jst.e.k(th, "Subtitle of section header fail loading");
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l4q0Var = (l4q0) this.L$2;
                sVar = (s) this.L$1;
                sVar2 = (s) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    sVar.W.setTrailCompanionText(l4q0Var.c.a);
                    sVar.W.setTrailCompanionTextMaxWidth((int) (r12.getMeasuredWidth() * 0.4d));
                    jst.e.k(th, "Subtitle of section header fail loading");
                    return zy11.a;
                }
            }
            sVar2.W.setTrailCompanionText((CharSequence) obj);
            sVar2.W.setTrailCompanionTextMaxWidth((int) (r11.getMeasuredWidth() * 0.4d));
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
