package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import defpackage.dsm0;
import defpackage.esm0;
import defpackage.fsm0;
import defpackage.gsm0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uum0;
import defpackage.vum0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class d {
    public final ru.yandex.taxi.widget.c a;

    public d(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r7 == r9) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, vum0 vum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1 scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object d;
        CharSequence charSequence;
        ru.yandex.taxi.widget.c cVar = dVar.a;
        if (continuationImpl instanceof ScootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1) {
            scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1 = (ScootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = vum0Var.e;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$0 = vum0Var;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label = 1;
                    obj = d(cVar, formattedText, scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$1;
                        kotlin.b.b(obj);
                        return new dsm0(charSequence, (CharSequence) obj);
                    }
                    vum0Var = (vum0) scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText formattedText2 = vum0Var.d;
                scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$0 = null;
                scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$1 = charSequence2;
                scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label = 2;
                d = d(cVar, formattedText2, scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1);
                if (d != coroutineSingletons) {
                    charSequence = charSequence2;
                    obj = d;
                    return new dsm0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1 = new ScootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1(dVar, continuationImpl);
        Object obj2 = scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText formattedText22 = vum0Var.d;
        scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$0 = null;
        scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.L$1 = charSequence22;
        scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1.label = 2;
        d = d(cVar, formattedText22, scootersActivePassesV3RenewDisablingUiStateMapper$getBottomGroup$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:10:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, vum0 vum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1 scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1;
        int i;
        Iterator it;
        Collection collection;
        ScootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1 scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12;
        List list;
        dVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1) {
            scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1 = (ScootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = vum0Var.c;
                    if (list2 != null) {
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        it = list3.iterator();
                        collection = arrayList;
                        scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12 = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1;
                        if (it.hasNext()) {
                        }
                    }
                    list = EmptyList.a;
                    return new fsm0(list);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                collection = (Collection) scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.L$7;
                uum0 uum0Var = (uum0) scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.L$6;
                Iterator it2 = (Iterator) scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.L$4;
                Collection collection2 = (Collection) scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.L$3;
                kotlin.b.b(obj);
                scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12 = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1;
                collection.add(new esm0((CharSequence) obj, uum0Var.b));
                it = it2;
                collection = collection2;
                if (it.hasNext()) {
                    uum0Var = (uum0) it.next();
                    ru.yandex.taxi.widget.c cVar = dVar.a;
                    FormattedText formattedText = uum0Var.a;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$0 = null;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$1 = null;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$2 = null;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$3 = collection;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$4 = it;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$5 = null;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$6 = uum0Var;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.L$7 = collection;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    collection2 = collection;
                    it2 = it;
                    obj = e;
                    collection.add(new esm0((CharSequence) obj, uum0Var.b));
                    it = it2;
                    collection = collection2;
                    if (it.hasNext()) {
                        list = (List) collection;
                    }
                }
            }
        }
        scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1 = new ScootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1(dVar, continuationImpl);
        Object obj2 = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewDisablingUiStateMapper$getHintsGroup$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, vum0 vum0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1 scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object d;
        CharSequence charSequence;
        CharSequence charSequence2;
        dVar.getClass();
        if (continuationImpl instanceof ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1) {
            scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1 = (ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1 scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12 = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1;
                Object obj = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = dVar.a;
                    FormattedText formattedText = vum0Var.a;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.L$0 = vum0Var;
                    scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.L$1;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        if (charSequence2 == null) {
                            charSequence2 = "";
                        }
                        return new gsm0(charSequence, charSequence2);
                    }
                    vum0Var = (vum0) scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = dVar.a;
                FormattedText formattedText2 = vum0Var.b;
                scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.L$0 = null;
                scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.L$1 = charSequence3;
                scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12.label = 2;
                d = d(cVar2, formattedText2, scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$12);
                if (d != coroutineSingletons) {
                    obj = d;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    if (charSequence2 == null) {
                    }
                    return new gsm0(charSequence, charSequence2);
                }
                return coroutineSingletons;
            }
        }
        scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1 = new ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1(dVar, continuationImpl);
        ScootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1 scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122 = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$1;
        Object obj2 = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = dVar.a;
        FormattedText formattedText22 = vum0Var.b;
        scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122.L$0 = null;
        scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122.L$1 = charSequence32;
        scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122.label = 2;
        d = d(cVar22, formattedText22, scootersActivePassesV3RenewDisablingUiStateMapper$getTitle$122);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static Object d(ru.yandex.taxi.widget.c cVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (formattedText == null) {
            return null;
        }
        Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, continuationImpl, 30);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : (CharSequence) e;
    }
}
