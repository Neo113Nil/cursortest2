package com.yandex.go.shortcuts.impl.view.adapter;

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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.view.adapter.SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5", f = "SectionTypedHeaderViewHolder.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5 extends SuspendLambda implements wls {
    final /* synthetic */ l4q0 $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5(s sVar, l4q0 l4q0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$data = l4q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SectionTypedHeaderViewHolder$bindIconOnlyAppearance$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s sVar;
        l4q0 l4q0Var;
        s sVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                sVar = this.this$0;
                l4q0 l4q0Var2 = this.$data;
                try {
                    ru.yandex.taxi.widget.c cVar = sVar.U;
                    FormattedText formattedText = l4q0Var2.b.b;
                    this.L$0 = sVar;
                    this.L$1 = sVar;
                    this.L$2 = l4q0Var2;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l4q0Var = l4q0Var2;
                    obj = e;
                    sVar2 = sVar;
                } catch (Throwable unused) {
                    l4q0Var = l4q0Var2;
                    sVar.Z.setContentDescription(l4q0Var.b.a);
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
                } catch (Throwable unused2) {
                    sVar.Z.setContentDescription(l4q0Var.b.a);
                    return zy11.a;
                }
            }
            sVar2.Z.setContentDescription((CharSequence) obj);
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
