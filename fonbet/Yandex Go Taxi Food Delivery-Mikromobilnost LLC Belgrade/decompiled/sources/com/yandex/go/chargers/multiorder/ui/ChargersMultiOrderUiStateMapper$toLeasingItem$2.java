package com.yandex.go.chargers.multiorder.ui;

import defpackage.m7x0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.r5a;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.z8y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr5a;", "<anonymous>", "(Ltse;)Lr5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toLeasingItem$2", f = "ChargersMultiOrderUiStateMapper.kt", l = {HProv.PP_CONTAINER_STATUS, 147}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toLeasingItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ z8y $order;
    final /* synthetic */ boolean $showChevron;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateMapper$toLeasingItem$2(g gVar, z8y z8yVar, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$order = z8yVar;
        this.$index = i;
        this.$showChevron = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersMultiOrderUiStateMapper$toLeasingItem$2 chargersMultiOrderUiStateMapper$toLeasingItem$2 = new ChargersMultiOrderUiStateMapper$toLeasingItem$2(this.this$0, this.$order, this.$index, this.$showChevron, continuation);
        chargersMultiOrderUiStateMapper$toLeasingItem$2.L$0 = obj;
        return chargersMultiOrderUiStateMapper$toLeasingItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toLeasingItem$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        String str2;
        CharSequence charSequence;
        String str3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toLeasingItem$2$primaryLabel$1(this.this$0, this.$order, null), 3);
            h = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toLeasingItem$2$secondaryLabel$1(this.this$0, this.$order, null), 3);
            String a = ((m7x0) this.this$0.b).a(this.$order.h);
            String str4 = this.$order.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = a;
            this.L$4 = str4;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                str = a;
                str2 = str4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CharSequence charSequence2 = (CharSequence) this.L$5;
            String str5 = (String) this.L$4;
            str = (String) this.L$3;
            kotlin.b.b(obj);
            charSequence = charSequence2;
            str3 = str5;
            return new r5a(str3, charSequence, (CharSequence) obj, str, this.$index > 0, this.$showChevron);
        }
        str2 = (String) this.L$4;
        str = (String) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence3 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str;
        this.L$4 = str2;
        this.L$5 = charSequence3;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence3;
            str3 = str2;
            obj = k;
            return new r5a(str3, charSequence, (CharSequence) obj, str, this.$index > 0, this.$showChevron);
        }
        return coroutineSingletons;
    }
}
