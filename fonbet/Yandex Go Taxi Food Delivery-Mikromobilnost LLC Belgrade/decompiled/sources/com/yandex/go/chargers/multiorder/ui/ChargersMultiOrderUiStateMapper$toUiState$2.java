package com.yandex.go.chargers.multiorder.ui;

import defpackage.c4a;
import defpackage.d4a;
import defpackage.h5a;
import defpackage.i5a;
import defpackage.m5a;
import defpackage.mvg;
import defpackage.n5a;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rl9;
import defpackage.tje;
import defpackage.tse;
import defpackage.u5a;
import defpackage.v5a;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv5a;", "<anonymous>", "(Ltse;)Lv5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toUiState$2", f = "ChargersMultiOrderUiStateMapper.kt", l = {72, HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_GR3410_12_256, 74, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ rl9 $activeOrdersState;
    final /* synthetic */ i5a $multiOrderUi;
    final /* synthetic */ c4a $rawButton;
    final /* synthetic */ d4a $rawLabel;
    final /* synthetic */ String $selectedModeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderUiStateMapper$toUiState$2(String str, rl9 rl9Var, i5a i5aVar, g gVar, c4a c4aVar, d4a d4aVar, Continuation continuation) {
        super(2, continuation);
        this.$selectedModeId = str;
        this.$activeOrdersState = rl9Var;
        this.$multiOrderUi = i5aVar;
        this.this$0 = gVar;
        this.$rawButton = c4aVar;
        this.$rawLabel = d4aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersMultiOrderUiStateMapper$toUiState$2 chargersMultiOrderUiStateMapper$toUiState$2 = new ChargersMultiOrderUiStateMapper$toUiState$2(this.$selectedModeId, this.$activeOrdersState, this.$multiOrderUi, this.this$0, this.$rawButton, this.$rawLabel, continuation);
        chargersMultiOrderUiStateMapper$toUiState$2.L$0 = obj;
        return chargersMultiOrderUiStateMapper$toUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01cb, code lost:
    
        if (r6 == r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARN: Type inference failed for: r3v18, types: [noh] */
    /* JADX WARN: Type inference failed for: r5v8, types: [noh] */
    /* JADX WARN: Type inference failed for: r6v6, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v10, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        String str;
        noh h3;
        Object s;
        noh nohVar;
        h5a h5aVar;
        Object k;
        noh nohVar2;
        CharSequence charSequence;
        n5a n5aVar;
        Object k2;
        Object k3;
        CharSequence charSequence2;
        n5a n5aVar2;
        Object k4;
        n5a n5aVar3;
        List list;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$title$1(this.$multiOrderUi, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$headerButton$1(this.$rawButton, this.this$0, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$headerLabel$1(this.$rawLabel, this.this$0, null), 3);
            qoh h6 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$orders$1(this.this$0, this.$activeOrdersState, null), 3);
            h2 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$tabsConfigAsync$1(this.this$0, this.$activeOrdersState, this.$selectedModeId, null), 3);
            String str2 = this.$selectedModeId;
            if (str2 == null) {
                i5a i5aVar = this.$activeOrdersState.b;
                String str3 = i5aVar != null ? i5aVar.d : null;
                if (str3 != null) {
                    str = str3;
                } else if (i5aVar == null || (h5aVar = (h5a) kotlin.collections.a.R(i5aVar.e)) == null) {
                    str = null;
                } else {
                    str2 = h5aVar.a;
                }
                h3 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1(this.$multiOrderUi, h6, str, this.this$0, null), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = null;
                this.L$7 = h3;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    nohVar = h5;
                }
                return coroutineSingletons;
            }
            str = str2;
            h3 = tje.h(tseVar, null, null, new ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1(this.$multiOrderUi, h6, str, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h5;
            this.L$4 = null;
            this.L$5 = h2;
            this.L$6 = null;
            this.L$7 = h3;
            this.label = 1;
            s = h4.s(this);
            if (s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$8;
                nohVar2 = (noh) this.L$7;
                ?? r7 = (noh) this.L$5;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                h2 = r7;
                k = obj;
                n5aVar = (m5a) k;
                if (n5aVar == null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = h2;
                    this.L$6 = null;
                    this.L$7 = nohVar2;
                    this.L$8 = charSequence;
                    this.label = 3;
                    k2 = nohVar.k(this);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = charSequence;
                this.L$9 = n5aVar;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                charSequence = (CharSequence) this.L$8;
                nohVar2 = (noh) this.L$7;
                ?? r6 = (noh) this.L$5;
                kotlin.b.b(obj);
                h2 = r6;
                k2 = obj;
                n5aVar = (n5a) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = h2;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = charSequence;
                this.L$9 = n5aVar;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    charSequence2 = charSequence;
                    n5aVar2 = n5aVar;
                    List list2 = (List) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = charSequence2;
                    this.L$9 = n5aVar2;
                    this.L$10 = list2;
                    this.label = 5;
                    k4 = h2.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$10;
                n5aVar3 = (n5a) this.L$9;
                charSequence3 = (CharSequence) this.L$8;
                kotlin.b.b(obj);
                k4 = obj;
                return new v5a(charSequence3, n5aVar3, list, (u5a) k4);
            }
            n5aVar2 = (n5a) this.L$9;
            CharSequence charSequence4 = (CharSequence) this.L$8;
            ?? r5 = (noh) this.L$5;
            kotlin.b.b(obj);
            h2 = r5;
            charSequence2 = charSequence4;
            k3 = obj;
            List list22 = (List) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = charSequence2;
            this.L$9 = n5aVar2;
            this.L$10 = list22;
            this.label = 5;
            k4 = h2.k(this);
            if (k4 != coroutineSingletons) {
                n5aVar3 = n5aVar2;
                list = list22;
                charSequence3 = charSequence2;
                return new v5a(charSequence3, n5aVar3, list, (u5a) k4);
            }
            return coroutineSingletons;
        }
        h3 = (noh) this.L$7;
        ?? r3 = (noh) this.L$5;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        h2 = r3;
        s = obj;
        CharSequence charSequence5 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = null;
        this.L$5 = h2;
        this.L$6 = null;
        this.L$7 = h3;
        this.L$8 = charSequence5;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = h3;
            charSequence = charSequence5;
            n5aVar = (m5a) k;
            if (n5aVar == null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = h2;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = charSequence;
            this.L$9 = n5aVar;
            this.label = 4;
            k3 = nohVar2.k(this);
            if (k3 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
