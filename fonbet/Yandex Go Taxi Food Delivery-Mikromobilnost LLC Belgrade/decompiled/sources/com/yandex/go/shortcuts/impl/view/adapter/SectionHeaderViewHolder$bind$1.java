package com.yandex.go.shortcuts.impl.view.adapter;

import defpackage.d1q0;
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
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.SectionHeaderViewHolder$bind$1", f = "SectionHeaderViewHolder.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SectionHeaderViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ d1q0 $data;
    Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeaderViewHolder$bind$1(q qVar, d1q0 d1q0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$data = d1q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionHeaderViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SectionHeaderViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                q qVar2 = this.this$0;
                d1q0 d1q0Var = this.$data;
                ru.yandex.taxi.widget.c cVar = qVar2.T;
                FormattedText formattedText = d1q0Var.b;
                this.L$0 = qVar2;
                this.label = 1;
                Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                qVar = qVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qVar = (q) this.L$0;
                kotlin.b.b(obj);
            }
            q.d0(qVar, (CharSequence) obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            jst.e.k(th, "Title of section header fail loading");
        }
        return zy11.a;
    }
}
