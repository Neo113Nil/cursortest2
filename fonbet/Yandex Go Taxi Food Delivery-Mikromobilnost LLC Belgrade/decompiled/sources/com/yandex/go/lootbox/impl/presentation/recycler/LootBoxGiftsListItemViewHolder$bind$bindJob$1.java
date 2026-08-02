package com.yandex.go.lootbox.impl.presentation.recycler;

import defpackage.avj0;
import defpackage.eqz;
import defpackage.k2h0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.nac;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.presentation.recycler.LootBoxGiftsListItemViewHolder$bind$bindJob$1", f = "LootBoxGiftsListItemViewHolder.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxGiftsListItemViewHolder$bind$bindJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ eqz $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxGiftsListItemViewHolder$bind$bindJob$1(a aVar, eqz eqzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = eqzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxGiftsListItemViewHolder$bind$bindJob$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxGiftsListItemViewHolder$bind$bindJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$data.c;
            int u = tje.u(40, ((avj0) aVar.W).a);
            nac nacVar = (nac) aVar.T.a(aVar.Z.getLeadImageView());
            nacVar.f(u, u);
            nacVar.e(k2h0.default_gift_icon);
            nacVar.c(((m7x0) aVar.S).a(str));
            a aVar2 = this.this$0;
            eqz eqzVar = this.$data;
            FormattedText formattedText = eqzVar.a;
            FormattedText formattedText2 = eqzVar.b;
            this.label = 1;
            if (a.c0(aVar2, formattedText, formattedText2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
