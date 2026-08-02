package com.yandex.go.chargers.discounts.list.ui;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto;
import com.yandex.go.chargers.discounts.data.models.a0;
import defpackage.as9;
import defpackage.av9;
import defpackage.aw9;
import defpackage.bw9;
import defpackage.cw9;
import defpackage.dms;
import defpackage.dw9;
import defpackage.ir9;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow9;
import defpackage.spa;
import defpackage.tu9;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.xu9;
import defpackage.ycc;
import defpackage.yu9;
import defpackage.zu9;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lzu9;", "discounts", "Low9;", "selectedDiscount", "Lcom/yandex/go/chargers/discounts/list/ui/ChargersDiscountsListUiState$Content$DiscountsTabType;", "selectedDiscountTab", "Ldw9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lzu9;Low9;Lcom/yandex/go/chargers/discounts/list/ui/ChargersDiscountsListUiState$Content$DiscountsTabType;)Ldw9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2", f = "ChargersDiscountsListUiStateInteractor.kt", l = {141, 150}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2 extends SuspendLambda implements dms {
    final /* synthetic */ String $deeplinkEntryPointValue;
    final /* synthetic */ ChargersDiscountsListEntryPoint $entryPoint;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2(h hVar, ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, String str, Continuation continuation) {
        super(5, continuation);
        this.this$0 = hVar;
        this.$entryPoint = chargersDiscountsListEntryPoint;
        this.$deeplinkEntryPointValue = str;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2 chargersDiscountsListUiStateInteractor$getListUiStateFlow$2 = new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2(this.this$0, this.$entryPoint, this.$deeplinkEntryPointValue, (Continuation) obj5);
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$2.L$0 = (zu9) obj2;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$2.L$1 = (ow9) obj3;
        chargersDiscountsListUiStateInteractor$getListUiStateFlow$2.L$2 = (ChargersDiscountsListUiState$Content$DiscountsTabType) obj4;
        return chargersDiscountsListUiStateInteractor$getListUiStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x013e, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0140, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cb, code lost:
    
        if (r0 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0149  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x013e -> B:6:0x0141). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object value;
        dw9 dw9Var;
        Iterator it;
        h hVar;
        Collection collection;
        as9 a2;
        zu9 zu9Var = (zu9) this.L$0;
        ow9 ow9Var = (ow9) this.L$1;
        ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType = (ChargersDiscountsListUiState$Content$DiscountsTabType) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EmptyList emptyList = EmptyList.a;
        Object obj2 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!(zu9Var instanceof yu9)) {
                if (zu9Var instanceof xu9) {
                    return new bw9(((xu9) zu9Var).a);
                }
                w511.b();
                return null;
            }
            yu9 yu9Var = (yu9) zu9Var;
            this.this$0.getClass();
            ChargersDiscountsTabDto chargersDiscountsTabDto = (ChargersDiscountsTabDto) kotlin.collections.a.R(yu9Var.a.c);
            ChargersDiscountsListUiState$Content$DiscountsTabType b = chargersDiscountsTabDto == null ? ChargersDiscountsListUiState$Content$DiscountsTabType.RENTAL_PROMO : i.b(chargersDiscountsTabDto);
            if (chargersDiscountsListUiState$Content$DiscountsTabType == null) {
                spa spaVar = this.this$0.i;
                spaVar.a.l(b);
                r0 r0Var = spaVar.c;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, v4r0.i((Set) value, b)));
            }
            if (chargersDiscountsListUiState$Content$DiscountsTabType != null) {
                b = chargersDiscountsListUiState$Content$DiscountsTabType;
            }
            h hVar2 = this.this$0;
            i iVar = hVar2.g;
            Set set = (Set) hVar2.i.c.getValue();
            this.L$0 = zu9Var;
            this.L$1 = ow9Var;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            a = iVar.a(yu9Var, b, set, ow9Var, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
            a = obj;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$11;
            collection = (Collection) this.L$9;
            hVar = (h) this.L$7;
            dw9Var = (dw9) this.L$5;
            kotlin.b.b(obj);
            Object a3 = obj;
            tu9 tu9Var = (tu9) a3;
            if (tu9Var != null) {
                collection.add(tu9Var);
            }
            if (it.hasNext()) {
                List list = (List) collection;
                h hVar3 = this.this$0;
                av9 av9Var = hVar3.j;
                ir9 ir9Var = av9Var.c;
                av9Var.c = null;
                if (ir9Var != null) {
                    ChargersDiscountTypeDto chargersDiscountTypeDto = ir9Var.a;
                    for (Object obj3 : list) {
                        tu9 tu9Var2 = (tu9) obj3;
                        if (jl40.l(tu9Var2.b().b, ir9Var.b) && (chargersDiscountTypeDto == ChargersDiscountTypeDto.EMPTY || tu9Var2.b().a == chargersDiscountTypeDto)) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    tu9 tu9Var3 = (tu9) obj2;
                    if (tu9Var3 != null && (a2 = tu9Var3.a()) != null) {
                        hVar3.b(a2, tu9Var3.b(), true);
                        return cw9.a;
                    }
                }
                if (dw9Var instanceof aw9) {
                    this.this$0.e.e(this.$entryPoint, ((yu9) zu9Var).b, null, ((aw9) dw9Var).e, emptyList, this.$deeplinkEntryPointValue, null, null);
                }
                return dw9Var;
            }
            a0 a0Var = (a0) it.next();
            com.yandex.go.chargers.discounts.data.mappers.b bVar = hVar.c;
            this.L$0 = zu9Var;
            this.L$1 = ow9Var;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = dw9Var;
            this.L$6 = null;
            this.L$7 = hVar;
            this.L$8 = null;
            this.L$9 = collection;
            this.L$10 = null;
            this.L$11 = it;
            this.L$12 = null;
            this.L$13 = null;
            this.L$14 = null;
            this.label = 2;
            a3 = bVar.a(a0Var, ow9Var, this);
        }
        dw9 dw9Var2 = (dw9) a;
        List list2 = ((yu9) zu9Var).a.c;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            List list3 = ((ChargersDiscountsTabDto) it2.next()).d;
            if (list3 == null) {
                list3 = emptyList;
            }
            ycc.r(list3, arrayList);
        }
        h hVar4 = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        dw9Var = dw9Var2;
        it = arrayList.iterator();
        hVar = hVar4;
        collection = arrayList2;
        if (it.hasNext()) {
        }
    }
}
