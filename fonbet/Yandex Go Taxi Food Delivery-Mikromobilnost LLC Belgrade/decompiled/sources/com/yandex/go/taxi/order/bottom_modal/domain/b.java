package com.yandex.go.taxi.order.bottom_modal.domain;

import com.yandex.go.slot.dto.BottomModalContentItemDto$DividerLine;
import com.yandex.go.slot.dto.BottomModalContentItemDto$Slot;
import com.yandex.go.slot.dto.BottomModalContentItemDto$SpacerVertical;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenBottomModal;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.i;
import com.yandex.go.slot.dto.j;
import defpackage.bd6;
import defpackage.dd6;
import defpackage.ed6;
import defpackage.evu0;
import defpackage.fd6;
import defpackage.fef;
import defpackage.gd6;
import defpackage.hd6;
import defpackage.irs0;
import defpackage.jgv;
import defpackage.jsq0;
import defpackage.lbk0;
import defpackage.mdh;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uc6;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xss0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class b {
    public final irs0 a;
    public final lbk0 b;
    public final jgv c;
    public final e d;
    public final tt2 e;

    public b(irs0 irs0Var, lbk0 lbk0Var, jgv jgvVar, e eVar, tt2 tt2Var) {
        this.a = irs0Var;
        this.b = lbk0Var;
        this.c = jgvVar;
        this.d = eVar;
        this.e = tt2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:10:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ac -> B:11:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bc -> B:11:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:11:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, List list2, fef fefVar, ContinuationImpl continuationImpl) {
        BottomModalUiStateMapper$addContent$1 bottomModalUiStateMapper$addContent$1;
        int i;
        ArrayList arrayList;
        List list3;
        Iterator it;
        Object e;
        if (continuationImpl instanceof BottomModalUiStateMapper$addContent$1) {
            bottomModalUiStateMapper$addContent$1 = (BottomModalUiStateMapper$addContent$1) continuationImpl;
            int i2 = bottomModalUiStateMapper$addContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomModalUiStateMapper$addContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomModalUiStateMapper$addContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomModalUiStateMapper$addContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList = new ArrayList();
                    Iterator it2 = list2.iterator();
                    list3 = list;
                    it = it2;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) bottomModalUiStateMapper$addContent$1.L$7;
                    ?? r10 = (Collection) bottomModalUiStateMapper$addContent$1.L$5;
                    fefVar = (fef) bottomModalUiStateMapper$addContent$1.L$2;
                    List list4 = (List) bottomModalUiStateMapper$addContent$1.L$0;
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = r10;
                    Object obj2 = new ed6((xss0) obj);
                    arrayList = arrayList2;
                    list3 = list4;
                    if (obj2 != null) {
                        arrayList.add(obj2);
                    }
                    if (!it.hasNext()) {
                        j jVar = (j) it.next();
                        if (jVar instanceof BottomModalContentItemDto$Slot) {
                            SlotItemDto slotItemDto = ((BottomModalContentItemDto$Slot) jVar).a;
                            bottomModalUiStateMapper$addContent$1.L$0 = list3;
                            bottomModalUiStateMapper$addContent$1.L$1 = null;
                            bottomModalUiStateMapper$addContent$1.L$2 = fefVar;
                            bottomModalUiStateMapper$addContent$1.L$3 = null;
                            bottomModalUiStateMapper$addContent$1.L$4 = null;
                            bottomModalUiStateMapper$addContent$1.L$5 = arrayList;
                            bottomModalUiStateMapper$addContent$1.L$6 = null;
                            bottomModalUiStateMapper$addContent$1.L$7 = it;
                            bottomModalUiStateMapper$addContent$1.L$8 = null;
                            bottomModalUiStateMapper$addContent$1.L$9 = null;
                            bottomModalUiStateMapper$addContent$1.L$10 = null;
                            bottomModalUiStateMapper$addContent$1.label = 1;
                            e = ((com.yandex.go.slot.mapper.a) this.a).e(slotItemDto, this.b, false, false, fefVar, bottomModalUiStateMapper$addContent$1);
                            if (e == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            list4 = list3;
                            arrayList2 = arrayList;
                            obj = e;
                            Object obj22 = new ed6((xss0) obj);
                            arrayList = arrayList2;
                            list3 = list4;
                            if (obj22 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        } else {
                            if (jVar instanceof BottomModalContentItemDto$SpacerVertical) {
                                obj22 = new fd6(((BottomModalContentItemDto$SpacerVertical) jVar).a.c);
                            } else if (jVar instanceof BottomModalContentItemDto$DividerLine) {
                                obj22 = dd6.a;
                            } else {
                                if (!(jVar instanceof i)) {
                                    w511.b();
                                    return null;
                                }
                                obj22 = null;
                            }
                            if (obj22 != null) {
                            }
                            if (!it.hasNext()) {
                                list3.addAll(arrayList);
                                return zy11.a;
                            }
                        }
                    }
                }
            }
        }
        bottomModalUiStateMapper$addContent$1 = new BottomModalUiStateMapper$addContent$1(this, continuationImpl);
        Object obj3 = bottomModalUiStateMapper$addContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomModalUiStateMapper$addContent$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.go.taxi.order.bottom_modal.domain.b] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(n7v n7vVar, String str, String str2, fef fefVar, List list, ContinuationImpl continuationImpl) {
        BottomModalUiStateMapper$mapContent$1 bottomModalUiStateMapper$mapContent$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ListBuilder a;
        fef fefVar2;
        String str3;
        List list2;
        String str4;
        ListBuilder listBuilder;
        List list3;
        if (continuationImpl instanceof BottomModalUiStateMapper$mapContent$1) {
            bottomModalUiStateMapper$mapContent$1 = (BottomModalUiStateMapper$mapContent$1) continuationImpl;
            int i2 = bottomModalUiStateMapper$mapContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomModalUiStateMapper$mapContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomModalUiStateMapper$mapContent$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomModalUiStateMapper$mapContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = rcc.a();
                    bottomModalUiStateMapper$mapContent$1.L$0 = null;
                    bottomModalUiStateMapper$mapContent$1.L$1 = str;
                    bottomModalUiStateMapper$mapContent$1.L$2 = str2;
                    fefVar2 = fefVar;
                    bottomModalUiStateMapper$mapContent$1.L$3 = fefVar2;
                    bottomModalUiStateMapper$mapContent$1.L$4 = list;
                    bottomModalUiStateMapper$mapContent$1.L$5 = a;
                    bottomModalUiStateMapper$mapContent$1.L$6 = a;
                    bottomModalUiStateMapper$mapContent$1.label = 1;
                    this.e.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new BottomModalUiStateMapper$addIcon$2(n7vVar, this, a, null), bottomModalUiStateMapper$mapContent$1);
                    if (k0 != coroutineSingletons) {
                        str3 = str2;
                        list2 = list;
                        str4 = str;
                        obj = k0;
                        listBuilder = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list3 = (List) bottomModalUiStateMapper$mapContent$1.L$5;
                    kotlin.b.b(obj);
                    return ((ListBuilder) list3).j();
                }
                ?? r4 = (List) bottomModalUiStateMapper$mapContent$1.L$6;
                ?? r6 = (List) bottomModalUiStateMapper$mapContent$1.L$5;
                list2 = (List) bottomModalUiStateMapper$mapContent$1.L$4;
                fefVar2 = (fef) bottomModalUiStateMapper$mapContent$1.L$3;
                str3 = (String) bottomModalUiStateMapper$mapContent$1.L$2;
                str4 = (String) bottomModalUiStateMapper$mapContent$1.L$1;
                kotlin.b.b(obj);
                listBuilder = r4;
                a = r6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!evu0.J(str4)) {
                    listBuilder.add(new gd6(str4, booleanValue ? 0 : 20, booleanValue ? 12 : 0));
                }
                if (!evu0.J(str3)) {
                    listBuilder.add(new bd6(str3, booleanValue ? 0 : 12, booleanValue ? 16 : 0));
                }
                bottomModalUiStateMapper$mapContent$1.L$0 = null;
                bottomModalUiStateMapper$mapContent$1.L$1 = null;
                bottomModalUiStateMapper$mapContent$1.L$2 = null;
                bottomModalUiStateMapper$mapContent$1.L$3 = null;
                bottomModalUiStateMapper$mapContent$1.L$4 = null;
                bottomModalUiStateMapper$mapContent$1.L$5 = a;
                bottomModalUiStateMapper$mapContent$1.L$6 = null;
                bottomModalUiStateMapper$mapContent$1.Z$0 = booleanValue;
                bottomModalUiStateMapper$mapContent$1.label = 2;
                if (a(listBuilder, list2, fefVar2, bottomModalUiStateMapper$mapContent$1) != coroutineSingletons) {
                    list3 = a;
                    return ((ListBuilder) list3).j();
                }
                return coroutineSingletons;
            }
        }
        bottomModalUiStateMapper$mapContent$1 = new BottomModalUiStateMapper$mapContent$1(this, continuationImpl);
        Object obj2 = bottomModalUiStateMapper$mapContent$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomModalUiStateMapper$mapContent$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (!evu0.J(str4)) {
        }
        if (!evu0.J(str3)) {
        }
        bottomModalUiStateMapper$mapContent$1.L$0 = null;
        bottomModalUiStateMapper$mapContent$1.L$1 = null;
        bottomModalUiStateMapper$mapContent$1.L$2 = null;
        bottomModalUiStateMapper$mapContent$1.L$3 = null;
        bottomModalUiStateMapper$mapContent$1.L$4 = null;
        bottomModalUiStateMapper$mapContent$1.L$5 = a;
        bottomModalUiStateMapper$mapContent$1.L$6 = null;
        bottomModalUiStateMapper$mapContent$1.Z$0 = booleanValue2;
        bottomModalUiStateMapper$mapContent$1.label = 2;
        if (a(listBuilder, list2, fefVar2, bottomModalUiStateMapper$mapContent$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(uc6 uc6Var, fef fefVar, ContinuationImpl continuationImpl) {
        BottomModalUiStateMapper$mapUiState$1 bottomModalUiStateMapper$mapUiState$1;
        int i;
        if (continuationImpl instanceof BottomModalUiStateMapper$mapUiState$1) {
            bottomModalUiStateMapper$mapUiState$1 = (BottomModalUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = bottomModalUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomModalUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                BottomModalUiStateMapper$mapUiState$1 bottomModalUiStateMapper$mapUiState$12 = bottomModalUiStateMapper$mapUiState$1;
                Object obj = bottomModalUiStateMapper$mapUiState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomModalUiStateMapper$mapUiState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n7v n7vVar = uc6Var.a;
                    String str = uc6Var.b;
                    String str2 = uc6Var.c;
                    List list = uc6Var.e;
                    bottomModalUiStateMapper$mapUiState$12.L$0 = uc6Var;
                    bottomModalUiStateMapper$mapUiState$12.L$1 = null;
                    bottomModalUiStateMapper$mapUiState$12.label = 1;
                    obj = b(n7vVar, str, str2, fefVar, list, bottomModalUiStateMapper$mapUiState$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uc6Var = (uc6) bottomModalUiStateMapper$mapUiState$12.L$0;
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                jsq0 jsq0Var = uc6Var.f.b;
                boolean contains = jsq0Var.contains(SlotItemActionDto$OpenBottomModal.Properties.NavigationButtonType.BACK);
                boolean contains2 = jsq0Var.contains(SlotItemActionDto$OpenBottomModal.Properties.NavigationButtonType.CLOSE);
                boolean z = (uc6Var.f.a || contains || contains2) ? false : true;
                return new hd6(uc6Var.d, list2, contains, contains2, z, !evu0.J(uc6Var.d) && z);
            }
        }
        bottomModalUiStateMapper$mapUiState$1 = new BottomModalUiStateMapper$mapUiState$1(this, continuationImpl);
        BottomModalUiStateMapper$mapUiState$1 bottomModalUiStateMapper$mapUiState$122 = bottomModalUiStateMapper$mapUiState$1;
        Object obj3 = bottomModalUiStateMapper$mapUiState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomModalUiStateMapper$mapUiState$122.label;
        if (i != 0) {
        }
        List list22 = (List) obj3;
        jsq0 jsq0Var2 = uc6Var.f.b;
        boolean contains3 = jsq0Var2.contains(SlotItemActionDto$OpenBottomModal.Properties.NavigationButtonType.BACK);
        boolean contains22 = jsq0Var2.contains(SlotItemActionDto$OpenBottomModal.Properties.NavigationButtonType.CLOSE);
        if (uc6Var.f.a) {
        }
        return new hd6(uc6Var.d, list22, contains3, contains22, z, !evu0.J(uc6Var.d) && z);
    }
}
