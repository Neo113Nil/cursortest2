package com.yandex.go.order.tariffs_suggest.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.response.TariffsSuggestDto;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.fef;
import defpackage.gdc;
import defpackage.gp8;
import defpackage.hp8;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final e a;
    public final xdf b;
    public final zuj0 c;

    public a(e eVar, xdf xdfVar, zuj0 zuj0Var) {
        this.a = eVar;
        this.b = xdfVar;
        this.c = zuj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e5 -> B:10:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, Set set, fef fefVar, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        OrderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1 orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1;
        a aVar2;
        int i;
        Set set2;
        fef fefVar2;
        boolean z3;
        boolean z4;
        Iterator it;
        Ref$BooleanRef ref$BooleanRef;
        Collection collection;
        int i2;
        aVar.getClass();
        if (continuationImpl instanceof OrderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1) {
            orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1 = (OrderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1) continuationImpl;
            int i3 = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.label = i3 - Integer.MIN_VALUE;
                aVar2 = aVar;
                Object obj = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    List list2 = list;
                    Collection arrayList = new ArrayList(tcc.n(list2, 10));
                    set2 = set;
                    fefVar2 = fefVar;
                    z3 = z;
                    z4 = z2;
                    it = list2.iterator();
                    ref$BooleanRef = ref$BooleanRef2;
                    collection = arrayList;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.I$0;
                    boolean z5 = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.Z$1;
                    boolean z6 = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.Z$0;
                    Collection collection2 = (Collection) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$10;
                    Iterator it2 = (Iterator) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$7;
                    Collection collection3 = (Collection) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$6;
                    Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$3;
                    fefVar2 = (fef) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$2;
                    Set set3 = (Set) orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$1;
                    b.b(obj);
                    it = it2;
                    boolean z7 = z6;
                    z4 = z5;
                    i2 = i4;
                    ref$BooleanRef = ref$BooleanRef3;
                    Collection collection4 = collection3;
                    hp8 hp8Var = (hp8) obj;
                    if (hp8Var.g) {
                        ref$BooleanRef.element = true;
                    }
                    collection2.add(hp8Var);
                    aVar2 = aVar;
                    collection = collection4;
                    set2 = set3;
                    z3 = z7;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        TariffsSuggestDto.TariffDetailsDto tariffDetailsDto = (TariffsSuggestDto.TariffDetailsDto) next;
                        int i6 = i2 == 0 ? 1 : 0;
                        boolean z8 = ref$BooleanRef.element;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$0 = null;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$1 = set2;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$2 = fefVar2;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$3 = ref$BooleanRef;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$4 = null;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$5 = null;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$6 = collection;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$7 = it;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$8 = null;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$9 = null;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.L$10 = collection;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.Z$0 = z3;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.Z$1 = z4;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.I$0 = i5;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.I$1 = i2;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.I$2 = i6;
                        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.label = 1;
                        Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                        Object n = bvf0.n(new OrderWithTariffSuggestMapper$mapTariffDetailsUiState$2(tariffDetailsDto, z4, set2, z8, z3, i6, aVar2, fefVar2, null), orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1);
                        if (n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        set3 = set2;
                        z7 = z3;
                        i2 = i5;
                        collection2 = collection;
                        collection4 = collection2;
                        obj = n;
                        ref$BooleanRef = ref$BooleanRef4;
                        hp8 hp8Var2 = (hp8) obj;
                        if (hp8Var2.g) {
                        }
                        collection2.add(hp8Var2);
                        aVar2 = aVar;
                        collection = collection4;
                        set2 = set3;
                        z3 = z7;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        aVar2 = aVar;
        orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1 = new OrderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1(aVar2, continuationImpl);
        Object obj2 = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderWithTariffSuggestMapper$mapListOfTariffDetailsUiState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, TariffsSuggestDto.TariffDetailsDto tariffDetailsDto, ContinuationImpl continuationImpl) {
        OrderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1 orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof OrderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1) {
            orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1 = (OrderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1) continuationImpl;
            int i2 = orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.a;
                    String str = tariffDetailsDto.d;
                    orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.L$0 = tariffDetailsDto;
                    orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.label = 1;
                    obj = e.f(eVar, str, null, orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tariffDetailsDto = (TariffsSuggestDto.TariffDetailsDto) orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.L$0;
                    b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                String str2 = tariffDetailsDto.i;
                boolean z = tariffDetailsDto.j;
                return new gp8(bitmapDrawable, str2, !z ? new bdc(xng0.everFront) : new bdc(xng0.textMain), !z ? new gdc(mqg0.component_green_normal) : new bdc(xng0.bgMain));
            }
        }
        orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1 = new OrderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1(aVar, continuationImpl);
        Object obj2 = orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderWithTariffSuggestMapper$mapSuggestTariffIconUiState$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        String str22 = tariffDetailsDto.i;
        boolean z2 = tariffDetailsDto.j;
        if (!z2) {
        }
        return new gp8(bitmapDrawable2, str22, !z2 ? new bdc(xng0.everFront) : new bdc(xng0.textMain), !z2 ? new gdc(mqg0.component_green_normal) : new bdc(xng0.bgMain));
    }

    public final Object c(TariffsSuggestDto.ButtonsList buttonsList, boolean z, boolean z2, Continuation continuation) {
        return bvf0.n(new OrderWithTariffSuggestMapper$mapButtonUiState$2(buttonsList, z, z2, this, null), continuation);
    }

    public final Object d(TariffsSuggestDto tariffsSuggestDto, fef fefVar, Set set, boolean z, Continuation continuation) {
        return bvf0.n(new OrderWithTariffSuggestMapper$mapCardTariffsSuggestUiState$2(this, tariffsSuggestDto, set, fefVar, z, null), continuation);
    }
}
