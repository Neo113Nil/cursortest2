package com.yandex.go.chargers.multiorder.ui;

import defpackage.bdc;
import defpackage.e5a;
import defpackage.f5a;
import defpackage.g5a;
import defpackage.kdc;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5a;
import defpackage.q3a;
import defpackage.s5a;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.w511;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lnoh;", "", "Lt5a;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toItemUiState$2", f = "ChargersMultiOrderUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toItemUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<s5a> $orders;
    final /* synthetic */ g5a $this_toItemUiState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lt5a;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toItemUiState$2$1", f = "ChargersMultiOrderUiStateMapper.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toItemUiState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<s5a> $orders;
        final /* synthetic */ g5a $this_toItemUiState;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g5a g5aVar, g gVar, List list, Continuation continuation) {
            super(2, continuation);
            this.$this_toItemUiState = g5aVar;
            this.this$0 = gVar;
            this.$orders = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_toItemUiState, this.this$0, this.$orders, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                g5a g5aVar = this.$this_toItemUiState;
                if (!(g5aVar instanceof e5a)) {
                    if (g5aVar instanceof f5a) {
                        return this.$orders;
                    }
                    w511.b();
                    return null;
                }
                ru.yandex.taxi.widget.c cVar = this.this$0.c;
                FormattedText formattedText = ((e5a) g5aVar).b;
                this.label = 1;
                obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            CharSequence charSequence = (CharSequence) obj;
            String str = ((e5a) this.$this_toItemUiState).c;
            String a = str != null ? ((m7x0) this.this$0.b).a(str) : null;
            e5a e5aVar = (e5a) this.$this_toItemUiState;
            q3a q3aVar = e5aVar.d;
            kdc e = ((ufu) this.this$0.a).e(e5aVar.e);
            if (e == null) {
                e = new bdc(xng0.controlMain);
            }
            return Collections.singletonList(new p5a(charSequence, a, q3aVar, e, ((e5a) this.$this_toItemUiState).f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateMapper$toItemUiState$2(g5a g5aVar, g gVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$this_toItemUiState = g5aVar;
        this.this$0 = gVar;
        this.$orders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersMultiOrderUiStateMapper$toItemUiState$2 chargersMultiOrderUiStateMapper$toItemUiState$2 = new ChargersMultiOrderUiStateMapper$toItemUiState$2(this.$this_toItemUiState, this.this$0, this.$orders, continuation);
        chargersMultiOrderUiStateMapper$toItemUiState$2.L$0 = obj;
        return chargersMultiOrderUiStateMapper$toItemUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toItemUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.h(tseVar, null, null, new AnonymousClass1(this.$this_toItemUiState, this.this$0, this.$orders, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
