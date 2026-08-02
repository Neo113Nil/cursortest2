package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.g8o0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.t8o0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8o0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lg8o0;", "<anonymous>", "(Ltse;)Lg8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$map$6", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {150, 151, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$6 extends SuspendLambda implements wls {
    final /* synthetic */ u8o0 $details;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$6(u8o0 u8o0Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$details = u8o0Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPackagesPurchaseUiStateMapper$map$6 scootersPackagesPurchaseUiStateMapper$map$6 = new ScootersPackagesPurchaseUiStateMapper$map$6(this.$details, this.this$0, continuation);
        scootersPackagesPurchaseUiStateMapper$map$6.L$0 = obj;
        return scootersPackagesPurchaseUiStateMapper$map$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$map$6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        List list;
        CharSequence charSequence;
        List list2;
        Object b;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$map$6$titleAsync$1(this.$details, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$map$6$subtitleAsync$1(this.$details, this.this$0, null), 3);
            ArrayList arrayList = this.$details.c;
            i iVar = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(tje.h(tseVar, null, null, new ScootersPackagesPurchaseUiStateMapper$map$6$itemsAsync$1$1(iVar, (t8o0) it.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = arrayList2;
            this.label = 1;
            obj = h2.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj != coroutineSingletons) {
                list = arrayList2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charSequence3 = (CharSequence) this.L$5;
                charSequence2 = (CharSequence) this.L$4;
                kotlin.b.b(obj);
                return new g8o0(charSequence2, charSequence3, (List) obj);
            }
            charSequence = (CharSequence) this.L$4;
            list2 = (List) this.L$3;
            kotlin.b.b(obj);
            CharSequence charSequence4 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence4;
            this.label = 3;
            b = kotlinx.coroutines.a.b(list2, this);
            if (b != coroutineSingletons) {
                charSequence2 = charSequence;
                charSequence3 = charSequence4;
                obj = b;
                return new g8o0(charSequence2, charSequence3, (List) obj);
            }
            return coroutineSingletons;
        }
        list = (List) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        CharSequence charSequence5 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = list;
        this.L$4 = charSequence5;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            List list3 = list;
            charSequence = charSequence5;
            obj = k;
            list2 = list3;
            CharSequence charSequence42 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            b = kotlinx.coroutines.a.b(list2, this);
            if (b != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
