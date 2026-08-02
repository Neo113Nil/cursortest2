package com.yandex.go.chargers.multiorder.ui;

import defpackage.bvf0;
import defpackage.g5a;
import defpackage.i5a;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lt5a;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1", f = "ChargersMultiOrderUiStateMapper.kt", l = {61, 64, 64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1 extends SuspendLambda implements wls {
    final /* synthetic */ i5a $multiOrderUi;
    final /* synthetic */ noh $orders;
    final /* synthetic */ String $selectedModeId;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
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
    public ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1(i5a i5aVar, noh nohVar, String str, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$multiOrderUi = i5aVar;
        this.$orders = nohVar;
        this.$selectedModeId = str;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1(this.$multiOrderUi, this.$orders, this.$selectedModeId, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderUiStateMapper$toUiState$2$uiList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0196  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0186 -> B:15:0x018c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        ListBuilder a;
        noh nohVar;
        Iterator it;
        Collection collection;
        ListBuilder listBuilder;
        Object k;
        List list;
        noh nohVar2;
        g gVar2;
        Object obj2;
        ListBuilder listBuilder2;
        ?? r11;
        Collection collection2;
        Collection collection3;
        g5a g5aVar;
        g gVar3;
        Object n;
        Object b;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 3;
        if (i == 0) {
            kotlin.b.b(obj);
            i5a i5aVar = this.$multiOrderUi;
            noh nohVar3 = this.$orders;
            String str = this.$selectedModeId;
            gVar = this.this$0;
            a = rcc.a();
            if (i5aVar == null) {
                this.L$0 = a;
                this.L$1 = null;
                this.L$2 = a;
                this.label = 1;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                    list = a;
                }
                return coroutineSingletons;
            }
            List list3 = i5aVar.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list3) {
                g5a g5aVar2 = (g5a) obj3;
                if (str == null || jl40.l(g5aVar2.a(), str)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            nohVar = nohVar3;
            it = arrayList.iterator();
            collection = arrayList2;
            listBuilder = a;
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                gVar3 = (g) this.L$13;
                g5aVar = (g5a) this.L$12;
                it = (Iterator) this.L$9;
                collection3 = (Collection) this.L$8;
                collection2 = (Collection) this.L$5;
                r11 = (List) this.L$4;
                ?? r12 = (List) this.L$2;
                g gVar4 = (g) this.L$1;
                noh nohVar4 = (noh) this.L$0;
                kotlin.b.b(obj);
                nohVar2 = nohVar4;
                gVar2 = gVar4;
                obj2 = obj;
                listBuilder2 = r12;
                this.L$0 = nohVar2;
                this.L$1 = gVar2;
                this.L$2 = listBuilder2;
                this.L$3 = null;
                this.L$4 = r11;
                this.L$5 = collection2;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = collection3;
                this.L$9 = it;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.label = i2;
                gVar3.getClass();
                n = bvf0.n(new ChargersMultiOrderUiStateMapper$toItemUiState$2(g5aVar, gVar3, (List) obj2, null), this);
                if (n != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) this.L$2;
                ?? r0 = (List) this.L$0;
                kotlin.b.b(obj);
                a = r0;
                b = obj;
                list2.addAll(tcc.o((Iterable) b));
                return a.j();
            }
            Iterator it2 = (Iterator) this.L$9;
            collection = (Collection) this.L$8;
            Collection collection4 = (Collection) this.L$5;
            ?? r9 = (List) this.L$4;
            ?? r10 = (List) this.L$2;
            g gVar5 = (g) this.L$1;
            noh nohVar5 = (noh) this.L$0;
            kotlin.b.b(obj);
            a = r10;
            gVar = gVar5;
            Iterator it3 = it2;
            nohVar2 = nohVar5;
            n = obj;
            ListBuilder listBuilder3 = r9;
            collection4.add((noh) n);
            it = it3;
            listBuilder = listBuilder3;
            nohVar = nohVar2;
            i2 = 3;
            if (it.hasNext()) {
                g5a g5aVar3 = (g5a) it.next();
                this.L$0 = nohVar;
                this.L$1 = gVar;
                this.L$2 = a;
                this.L$3 = null;
                this.L$4 = listBuilder;
                this.L$5 = collection;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = collection;
                this.L$9 = it;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = g5aVar3;
                this.L$13 = gVar;
                this.label = 2;
                obj2 = nohVar.k(this);
                if (obj2 != coroutineSingletons) {
                    nohVar2 = nohVar;
                    gVar2 = gVar;
                    collection3 = collection;
                    collection2 = collection3;
                    g5aVar = g5aVar3;
                    listBuilder2 = a;
                    r11 = listBuilder;
                    gVar3 = gVar2;
                    this.L$0 = nohVar2;
                    this.L$1 = gVar2;
                    this.L$2 = listBuilder2;
                    this.L$3 = null;
                    this.L$4 = r11;
                    this.L$5 = collection2;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = collection3;
                    this.L$9 = it;
                    this.L$10 = null;
                    this.L$11 = null;
                    this.L$12 = null;
                    this.L$13 = null;
                    this.label = i2;
                    gVar3.getClass();
                    n = bvf0.n(new ChargersMultiOrderUiStateMapper$toItemUiState$2(g5aVar, gVar3, (List) obj2, null), this);
                    if (n != coroutineSingletons) {
                        it3 = it;
                        collection = collection3;
                        collection4 = collection2;
                        listBuilder3 = r11;
                        a = listBuilder2;
                        gVar = gVar2;
                        collection4.add((noh) n);
                        it = it3;
                        listBuilder = listBuilder3;
                        nohVar = nohVar2;
                        i2 = 3;
                        if (it.hasNext()) {
                            this.L$0 = a;
                            this.L$1 = null;
                            this.L$2 = listBuilder;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.label = 4;
                            b = kotlinx.coroutines.a.b((List) collection, this);
                            if (b != coroutineSingletons) {
                                list2 = listBuilder;
                                list2.addAll(tcc.o((Iterable) b));
                                return a.j();
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        list = (List) this.L$2;
        ?? r02 = (List) this.L$0;
        kotlin.b.b(obj);
        a = r02;
        k = obj;
        list.addAll((Collection) k);
        return a.j();
    }
}
