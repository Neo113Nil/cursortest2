package com.yandex.go.chargers.multiorder.ui;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import defpackage.bdc;
import defpackage.bvf0;
import defpackage.c4a;
import defpackage.d4a;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.krj0;
import defpackage.m5a;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.o5a;
import defpackage.pdc;
import defpackage.q5a;
import defpackage.qko;
import defpackage.r8f;
import defpackage.s5a;
import defpackage.scc;
import defpackage.taa;
import defpackage.ufu;
import defpackage.xng0;
import defpackage.z8y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class g {
    public final pdc a;
    public final k7x0 b;
    public final ru.yandex.taxi.widget.c c;

    public g(pdc pdcVar, k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = pdcVar;
        this.b = k7x0Var;
        this.c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, c4a c4aVar, ContinuationImpl continuationImpl) {
        ChargersMultiOrderUiStateMapper$toHeaderButton$1 chargersMultiOrderUiStateMapper$toHeaderButton$1;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof ChargersMultiOrderUiStateMapper$toHeaderButton$1) {
            chargersMultiOrderUiStateMapper$toHeaderButton$1 = (ChargersMultiOrderUiStateMapper$toHeaderButton$1) continuationImpl;
            int i2 = chargersMultiOrderUiStateMapper$toHeaderButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderUiStateMapper$toHeaderButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersMultiOrderUiStateMapper$toHeaderButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersMultiOrderUiStateMapper$toHeaderButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = gVar.c;
                    FormattedText formattedText = c4aVar.a;
                    chargersMultiOrderUiStateMapper$toHeaderButton$1.L$0 = c4aVar;
                    chargersMultiOrderUiStateMapper$toHeaderButton$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersMultiOrderUiStateMapper$toHeaderButton$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c4aVar = (c4a) chargersMultiOrderUiStateMapper$toHeaderButton$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                boolean z = c4aVar.b;
                String str = c4aVar.c;
                return new m5a(charSequence, z, str != null ? ((m7x0) gVar.b).a(str) : null, c4aVar.d);
            }
        }
        chargersMultiOrderUiStateMapper$toHeaderButton$1 = new ChargersMultiOrderUiStateMapper$toHeaderButton$1(gVar, continuationImpl);
        Object obj2 = chargersMultiOrderUiStateMapper$toHeaderButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersMultiOrderUiStateMapper$toHeaderButton$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        boolean z2 = c4aVar.b;
        String str2 = c4aVar.c;
        return new m5a(charSequence2, z2, str2 != null ? ((m7x0) gVar.b).a(str2) : null, c4aVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, d4a d4aVar, ContinuationImpl continuationImpl) {
        ChargersMultiOrderUiStateMapper$toHeaderLabel$1 chargersMultiOrderUiStateMapper$toHeaderLabel$1;
        int i;
        kdc e;
        gVar.getClass();
        if (continuationImpl instanceof ChargersMultiOrderUiStateMapper$toHeaderLabel$1) {
            chargersMultiOrderUiStateMapper$toHeaderLabel$1 = (ChargersMultiOrderUiStateMapper$toHeaderLabel$1) continuationImpl;
            int i2 = chargersMultiOrderUiStateMapper$toHeaderLabel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderUiStateMapper$toHeaderLabel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersMultiOrderUiStateMapper$toHeaderLabel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersMultiOrderUiStateMapper$toHeaderLabel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = gVar.c;
                    FormattedText formattedText = d4aVar.a;
                    chargersMultiOrderUiStateMapper$toHeaderLabel$1.L$0 = d4aVar;
                    chargersMultiOrderUiStateMapper$toHeaderLabel$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersMultiOrderUiStateMapper$toHeaderLabel$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d4aVar = (d4a) chargersMultiOrderUiStateMapper$toHeaderLabel$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                e = ((ufu) gVar.a).e(d4aVar.b);
                if (e == null) {
                    e = new bdc(xng0.bgMinor);
                }
                return new o5a(charSequence, e);
            }
        }
        chargersMultiOrderUiStateMapper$toHeaderLabel$1 = new ChargersMultiOrderUiStateMapper$toHeaderLabel$1(gVar, continuationImpl);
        Object obj2 = chargersMultiOrderUiStateMapper$toHeaderLabel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersMultiOrderUiStateMapper$toHeaderLabel$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        e = ((ufu) gVar.a).e(d4aVar.b);
        if (e == null) {
        }
        return new o5a(charSequence2, e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f1 -> B:10:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl, boolean z) {
        ChargersMultiOrderUiStateMapper$mapOrdersToUiState$1 chargersMultiOrderUiStateMapper$mapOrdersToUiState$1;
        int i;
        ArrayList arrayList;
        boolean z2;
        int i2;
        Iterator it;
        Object d;
        if (continuationImpl instanceof ChargersMultiOrderUiStateMapper$mapOrdersToUiState$1) {
            chargersMultiOrderUiStateMapper$mapOrdersToUiState$1 = (ChargersMultiOrderUiStateMapper$mapOrdersToUiState$1) continuationImpl;
            int i3 = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((taa) obj2).b().compareTo(ChargersActiveOrderStatus.LEASING) <= 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList();
                    z2 = z;
                    i2 = 0;
                    it = arrayList2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.I$0;
                    boolean z3 = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.Z$0;
                    it = (Iterator) chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$5;
                    ?? r5 = (Collection) chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$3;
                    kotlin.b.b(obj);
                    g gVar = this;
                    i2 = i4;
                    z2 = z3;
                    arrayList = r5;
                    s5a s5aVar = (s5a) obj;
                    if (s5aVar != null) {
                        arrayList.add(s5aVar);
                    }
                    this = gVar;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        taa taaVar = (taa) next;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$0 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$1 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$2 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$3 = arrayList;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$4 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$5 = it;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$6 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$7 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.L$8 = null;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.Z$0 = z2;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.I$0 = i5;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.I$1 = i2;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.I$2 = i2;
                        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.label = 1;
                        if (taaVar instanceof z8y) {
                            gVar = this;
                            d = bvf0.n(new ChargersMultiOrderUiStateMapper$toLeasingItem$2(gVar, (z8y) taaVar, i2, z2, null), chargersMultiOrderUiStateMapper$mapOrdersToUiState$1);
                            if (d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                d = (s5a) d;
                            }
                        } else {
                            gVar = this;
                            if ((taaVar instanceof r8f) || (taaVar instanceof qko) || (taaVar instanceof krj0)) {
                                d = gVar.d(i2, taaVar, chargersMultiOrderUiStateMapper$mapOrdersToUiState$1);
                                if (d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    d = (s5a) d;
                                }
                            } else {
                                obj = null;
                                if (obj != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i2 = i5;
                                s5a s5aVar2 = (s5a) obj;
                                if (s5aVar2 != null) {
                                }
                                this = gVar;
                                if (it.hasNext()) {
                                    return arrayList;
                                }
                            }
                        }
                        obj = d;
                        if (obj != coroutineSingletons) {
                        }
                    }
                }
            }
        }
        chargersMultiOrderUiStateMapper$mapOrdersToUiState$1 = new ChargersMultiOrderUiStateMapper$mapOrdersToUiState$1(this, continuationImpl);
        Object obj3 = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersMultiOrderUiStateMapper$mapOrdersToUiState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, taa taaVar, ContinuationImpl continuationImpl) {
        ChargersMultiOrderUiStateMapper$toInProgressItem$1 chargersMultiOrderUiStateMapper$toInProgressItem$1;
        int i2;
        String str;
        if (continuationImpl instanceof ChargersMultiOrderUiStateMapper$toInProgressItem$1) {
            chargersMultiOrderUiStateMapper$toInProgressItem$1 = (ChargersMultiOrderUiStateMapper$toInProgressItem$1) continuationImpl;
            int i3 = chargersMultiOrderUiStateMapper$toInProgressItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderUiStateMapper$toInProgressItem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersMultiOrderUiStateMapper$toInProgressItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = chargersMultiOrderUiStateMapper$toInProgressItem$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    String a = taaVar.a();
                    FormattedText d = taaVar.d();
                    chargersMultiOrderUiStateMapper$toInProgressItem$1.L$0 = null;
                    chargersMultiOrderUiStateMapper$toInProgressItem$1.L$1 = a;
                    chargersMultiOrderUiStateMapper$toInProgressItem$1.I$0 = i;
                    chargersMultiOrderUiStateMapper$toInProgressItem$1.label = 1;
                    Object i4 = ru.yandex.taxi.widget.c.i(this.c, d, null, chargersMultiOrderUiStateMapper$toInProgressItem$1, 30);
                    if (i4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = i4;
                    str = a;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = chargersMultiOrderUiStateMapper$toInProgressItem$1.I$0;
                    str = (String) chargersMultiOrderUiStateMapper$toInProgressItem$1.L$1;
                    kotlin.b.b(obj);
                }
                return new q5a(i > 0, (CharSequence) obj, str);
            }
        }
        chargersMultiOrderUiStateMapper$toInProgressItem$1 = new ChargersMultiOrderUiStateMapper$toInProgressItem$1(this, continuationImpl);
        Object obj2 = chargersMultiOrderUiStateMapper$toInProgressItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = chargersMultiOrderUiStateMapper$toInProgressItem$1.label;
        if (i2 != 0) {
        }
        return new q5a(i > 0, (CharSequence) obj2, str);
    }
}
