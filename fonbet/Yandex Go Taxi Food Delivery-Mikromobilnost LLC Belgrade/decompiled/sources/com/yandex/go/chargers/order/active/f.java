package com.yandex.go.chargers.order.active;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.al9;
import defpackage.bdc;
import defpackage.bl9;
import defpackage.c6a;
import defpackage.cl9;
import defpackage.dl9;
import defpackage.el9;
import defpackage.fca;
import defpackage.g16;
import defpackage.g8e;
import defpackage.gba;
import defpackage.gca;
import defpackage.hba;
import defpackage.hca;
import defpackage.iba;
import defpackage.ica;
import defpackage.jba;
import defpackage.jca;
import defpackage.k7x0;
import defpackage.kba;
import defpackage.kca;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.oma;
import defpackage.pav;
import defpackage.pma;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.w511;
import defpackage.xng0;
import defpackage.yca;
import defpackage.zk9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class f {
    public final Context a;
    public final pav b;
    public final k7x0 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final ru.yandex.taxi.widget.c e;

    public f(Context context, pav pavVar, k7x0 k7x0Var, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = eVar;
        this.e = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x015a -> B:21:0x015d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, kca kcaVar, String str, ContinuationImpl continuationImpl) {
        ChargersActiveOrderMapper$mapToUiStateModel$1 chargersActiveOrderMapper$mapToUiStateModel$1;
        int i;
        gba gbaVar;
        Iterator it;
        Collection collection;
        String str2;
        gba gbaVar2;
        CharSequence charSequence;
        kca kcaVar2;
        pav pavVar = fVar.b;
        if (continuationImpl instanceof ChargersActiveOrderMapper$mapToUiStateModel$1) {
            chargersActiveOrderMapper$mapToUiStateModel$1 = (ChargersActiveOrderMapper$mapToUiStateModel$1) continuationImpl;
            int i2 = chargersActiveOrderMapper$mapToUiStateModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderMapper$mapToUiStateModel$1.label = i2 - Integer.MIN_VALUE;
                ChargersActiveOrderMapper$mapToUiStateModel$1 chargersActiveOrderMapper$mapToUiStateModel$12 = chargersActiveOrderMapper$mapToUiStateModel$1;
                Object obj = chargersActiveOrderMapper$mapToUiStateModel$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderMapper$mapToUiStateModel$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (kcaVar instanceof jca) {
                        return null;
                    }
                    if (kcaVar instanceof ica) {
                        ru.yandex.taxi.widget.c cVar = fVar.e;
                        FormattedText formattedText = ((ica) kcaVar).a;
                        chargersActiveOrderMapper$mapToUiStateModel$12.L$0 = kcaVar;
                        chargersActiveOrderMapper$mapToUiStateModel$12.L$1 = null;
                        chargersActiveOrderMapper$mapToUiStateModel$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, chargersActiveOrderMapper$mapToUiStateModel$12, 30);
                    } else if (kcaVar instanceof fca) {
                        chargersActiveOrderMapper$mapToUiStateModel$12.L$0 = null;
                        chargersActiveOrderMapper$mapToUiStateModel$12.L$1 = null;
                        chargersActiveOrderMapper$mapToUiStateModel$12.label = 3;
                        obj = fVar.e((fca) kcaVar, chargersActiveOrderMapper$mapToUiStateModel$12);
                    } else {
                        boolean z = kcaVar instanceof hca;
                        gba gbaVar3 = gba.a;
                        if (z) {
                            ArrayList arrayList = ((hca) kcaVar).a;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            it = arrayList.iterator();
                            collection = arrayList2;
                            str2 = str;
                            gbaVar2 = gbaVar3;
                            if (it.hasNext()) {
                            }
                        } else {
                            if (!(kcaVar instanceof gca)) {
                                w511.b();
                                return null;
                            }
                            chargersActiveOrderMapper$mapToUiStateModel$12.L$0 = null;
                            chargersActiveOrderMapper$mapToUiStateModel$12.L$1 = null;
                            chargersActiveOrderMapper$mapToUiStateModel$12.L$2 = gbaVar3;
                            chargersActiveOrderMapper$mapToUiStateModel$12.label = 5;
                            obj = fVar.d((gca) kcaVar, str, pavVar, chargersActiveOrderMapper$mapToUiStateModel$12);
                            if (obj != obj2) {
                                gbaVar = gbaVar3;
                                return new dl9(Collections.singletonList(obj), gbaVar);
                            }
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    kcaVar = (kca) chargersActiveOrderMapper$mapToUiStateModel$12.L$0;
                    kotlin.b.b(obj);
                    CharSequence charSequence2 = (CharSequence) obj;
                    ru.yandex.taxi.widget.c cVar2 = fVar.e;
                    FormattedText formattedText2 = ((ica) kcaVar).b;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$0 = kcaVar;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$1 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$2 = charSequence2;
                    chargersActiveOrderMapper$mapToUiStateModel$12.label = 2;
                    obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, chargersActiveOrderMapper$mapToUiStateModel$12, 30);
                    if (obj != obj2) {
                        charSequence = charSequence2;
                        kcaVar2 = kcaVar;
                        ica icaVar = (ica) kcaVar2;
                        return new bl9(charSequence, (CharSequence) obj, icaVar.d, ((m7x0) fVar.c).a(icaVar.c), icaVar.f);
                    }
                    return obj2;
                }
                if (i == 2) {
                    CharSequence charSequence3 = (CharSequence) chargersActiveOrderMapper$mapToUiStateModel$12.L$2;
                    kcaVar2 = (kca) chargersActiveOrderMapper$mapToUiStateModel$12.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence3;
                    ica icaVar2 = (ica) kcaVar2;
                    return new bl9(charSequence, (CharSequence) obj, icaVar2.d, ((m7x0) fVar.c).a(icaVar2.c), icaVar2.f);
                }
                if (i == 3) {
                    kotlin.b.b(obj);
                    return (el9) obj;
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gbaVar = (gba) chargersActiveOrderMapper$mapToUiStateModel$12.L$2;
                    kotlin.b.b(obj);
                    return new dl9(Collections.singletonList(obj), gbaVar);
                }
                collection = (Collection) chargersActiveOrderMapper$mapToUiStateModel$12.L$9;
                it = (Iterator) chargersActiveOrderMapper$mapToUiStateModel$12.L$6;
                Collection collection2 = (Collection) chargersActiveOrderMapper$mapToUiStateModel$12.L$5;
                gbaVar2 = (gba) chargersActiveOrderMapper$mapToUiStateModel$12.L$2;
                String str3 = (String) chargersActiveOrderMapper$mapToUiStateModel$12.L$1;
                kotlin.b.b(obj);
                collection.add((cl9) obj);
                collection = collection2;
                str2 = str3;
                if (it.hasNext()) {
                    gca gcaVar = (gca) it.next();
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$0 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$1 = str2;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$2 = gbaVar2;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$3 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$4 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$5 = collection;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$6 = it;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$7 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$8 = null;
                    chargersActiveOrderMapper$mapToUiStateModel$12.L$9 = collection;
                    chargersActiveOrderMapper$mapToUiStateModel$12.label = 4;
                    Object d = fVar.d(gcaVar, str2, pavVar, chargersActiveOrderMapper$mapToUiStateModel$12);
                    if (d != obj2) {
                        str3 = str2;
                        obj = d;
                        collection2 = collection;
                        collection.add((cl9) obj);
                        collection = collection2;
                        str2 = str3;
                        if (it.hasNext()) {
                            return new dl9((List) collection, gbaVar2);
                        }
                    }
                    return obj2;
                }
            }
        }
        chargersActiveOrderMapper$mapToUiStateModel$1 = new ChargersActiveOrderMapper$mapToUiStateModel$1(fVar, continuationImpl);
        ChargersActiveOrderMapper$mapToUiStateModel$1 chargersActiveOrderMapper$mapToUiStateModel$122 = chargersActiveOrderMapper$mapToUiStateModel$1;
        Object obj3 = chargersActiveOrderMapper$mapToUiStateModel$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderMapper$mapToUiStateModel$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0114 -> B:11:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0123 -> B:12:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        ChargersActiveOrderMapper$mapNotifications$1 chargersActiveOrderMapper$mapNotifications$1;
        int i;
        Collection arrayList;
        Iterator it;
        Collection collection;
        Iterator it2;
        c6a c6aVar;
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        FormattedText formattedText;
        if (continuationImpl instanceof ChargersActiveOrderMapper$mapNotifications$1) {
            chargersActiveOrderMapper$mapNotifications$1 = (ChargersActiveOrderMapper$mapNotifications$1) continuationImpl;
            int i2 = chargersActiveOrderMapper$mapNotifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderMapper$mapNotifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderMapper$mapNotifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderMapper$mapNotifications$1.label;
                ru.yandex.taxi.widget.c cVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    arrayList = (Collection) chargersActiveOrderMapper$mapNotifications$1.L$9;
                    String str4 = (String) chargersActiveOrderMapper$mapNotifications$1.L$8;
                    str2 = (String) chargersActiveOrderMapper$mapNotifications$1.L$7;
                    c6a c6aVar2 = (c6a) chargersActiveOrderMapper$mapNotifications$1.L$6;
                    Iterator it3 = (Iterator) chargersActiveOrderMapper$mapNotifications$1.L$4;
                    Collection collection2 = (Collection) chargersActiveOrderMapper$mapNotifications$1.L$3;
                    kotlin.b.b(obj);
                    it2 = it3;
                    collection = collection2;
                    c6aVar = c6aVar2;
                    str = str4;
                    str3 = str2;
                    charSequence = (CharSequence) obj;
                    formattedText = c6aVar.d;
                    if (formattedText == null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (Collection) chargersActiveOrderMapper$mapNotifications$1.L$11;
                    charSequence = (CharSequence) chargersActiveOrderMapper$mapNotifications$1.L$10;
                    str = (String) chargersActiveOrderMapper$mapNotifications$1.L$9;
                    str3 = (String) chargersActiveOrderMapper$mapNotifications$1.L$8;
                    c6aVar = (c6a) chargersActiveOrderMapper$mapNotifications$1.L$6;
                    it2 = (Iterator) chargersActiveOrderMapper$mapNotifications$1.L$4;
                    collection = (Collection) chargersActiveOrderMapper$mapNotifications$1.L$3;
                    kotlin.b.b(obj);
                    CharSequence charSequence2 = (CharSequence) obj;
                    it = it2;
                    arrayList.add(new yca(str3, str, charSequence, charSequence2, c6aVar.e));
                    arrayList = collection;
                    if (it.hasNext()) {
                        c6a c6aVar3 = (c6a) it.next();
                        str2 = c6aVar3.a;
                        String str5 = c6aVar3.b;
                        str = str5 != null ? ((m7x0) this.c).a(str5) : null;
                        FormattedText formattedText2 = c6aVar3.c;
                        chargersActiveOrderMapper$mapNotifications$1.L$0 = null;
                        chargersActiveOrderMapper$mapNotifications$1.L$1 = null;
                        chargersActiveOrderMapper$mapNotifications$1.L$2 = null;
                        chargersActiveOrderMapper$mapNotifications$1.L$3 = arrayList;
                        chargersActiveOrderMapper$mapNotifications$1.L$4 = it;
                        chargersActiveOrderMapper$mapNotifications$1.L$5 = null;
                        chargersActiveOrderMapper$mapNotifications$1.L$6 = c6aVar3;
                        chargersActiveOrderMapper$mapNotifications$1.L$7 = str2;
                        chargersActiveOrderMapper$mapNotifications$1.L$8 = str;
                        chargersActiveOrderMapper$mapNotifications$1.L$9 = arrayList;
                        chargersActiveOrderMapper$mapNotifications$1.L$10 = null;
                        chargersActiveOrderMapper$mapNotifications$1.L$11 = null;
                        chargersActiveOrderMapper$mapNotifications$1.label = 1;
                        Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersActiveOrderMapper$mapNotifications$1, 30);
                        if (i3 != coroutineSingletons) {
                            it2 = it;
                            collection = arrayList;
                            c6aVar = c6aVar3;
                            obj = i3;
                            str3 = str2;
                            charSequence = (CharSequence) obj;
                            formattedText = c6aVar.d;
                            if (formattedText == null) {
                                chargersActiveOrderMapper$mapNotifications$1.L$0 = null;
                                chargersActiveOrderMapper$mapNotifications$1.L$1 = null;
                                chargersActiveOrderMapper$mapNotifications$1.L$2 = null;
                                chargersActiveOrderMapper$mapNotifications$1.L$3 = collection;
                                chargersActiveOrderMapper$mapNotifications$1.L$4 = it2;
                                chargersActiveOrderMapper$mapNotifications$1.L$5 = null;
                                chargersActiveOrderMapper$mapNotifications$1.L$6 = c6aVar;
                                chargersActiveOrderMapper$mapNotifications$1.L$7 = null;
                                chargersActiveOrderMapper$mapNotifications$1.L$8 = str3;
                                chargersActiveOrderMapper$mapNotifications$1.L$9 = str;
                                chargersActiveOrderMapper$mapNotifications$1.L$10 = charSequence;
                                chargersActiveOrderMapper$mapNotifications$1.L$11 = arrayList;
                                chargersActiveOrderMapper$mapNotifications$1.label = 2;
                                obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersActiveOrderMapper$mapNotifications$1, 30);
                            } else {
                                charSequence2 = null;
                                it = it2;
                                arrayList.add(new yca(str3, str, charSequence, charSequence2, c6aVar.e));
                                arrayList = collection;
                                if (it.hasNext()) {
                                    return (List) arrayList;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        chargersActiveOrderMapper$mapNotifications$1 = new ChargersActiveOrderMapper$mapNotifications$1(this, continuationImpl);
        Object obj2 = chargersActiveOrderMapper$mapNotifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderMapper$mapNotifications$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00fb -> B:11:0x00fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        ChargersActiveOrderMapper$mapPopup$1 chargersActiveOrderMapper$mapPopup$1;
        int i;
        ArrayList arrayList;
        Iterator it;
        Collection collection;
        ArrayList arrayList2;
        Iterator it2;
        String str;
        String str2;
        pma pmaVar;
        Object i2;
        if (continuationImpl instanceof ChargersActiveOrderMapper$mapPopup$1) {
            chargersActiveOrderMapper$mapPopup$1 = (ChargersActiveOrderMapper$mapPopup$1) continuationImpl;
            int i3 = chargersActiveOrderMapper$mapPopup$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderMapper$mapPopup$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderMapper$mapPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderMapper$mapPopup$1.label;
                ru.yandex.taxi.widget.c cVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        collection = (Collection) chargersActiveOrderMapper$mapPopup$1.L$9;
                        String str3 = (String) chargersActiveOrderMapper$mapPopup$1.L$8;
                        String str4 = (String) chargersActiveOrderMapper$mapPopup$1.L$7;
                        pma pmaVar2 = (pma) chargersActiveOrderMapper$mapPopup$1.L$6;
                        it2 = (Iterator) chargersActiveOrderMapper$mapPopup$1.L$4;
                        ?? r10 = (Collection) chargersActiveOrderMapper$mapPopup$1.L$3;
                        kotlin.b.b(obj);
                        str2 = str3;
                        pmaVar = pmaVar2;
                        str = str4;
                        arrayList2 = r10;
                        CharSequence charSequence = (CharSequence) obj;
                        FormattedText formattedText = pmaVar.d;
                        chargersActiveOrderMapper$mapPopup$1.L$0 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$1 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$2 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$3 = arrayList2;
                        chargersActiveOrderMapper$mapPopup$1.L$4 = it2;
                        chargersActiveOrderMapper$mapPopup$1.L$5 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$6 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$7 = str;
                        chargersActiveOrderMapper$mapPopup$1.L$8 = str2;
                        chargersActiveOrderMapper$mapPopup$1.L$9 = charSequence;
                        chargersActiveOrderMapper$mapPopup$1.L$10 = collection;
                        chargersActiveOrderMapper$mapPopup$1.label = 2;
                        i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, chargersActiveOrderMapper$mapPopup$1, 30);
                        if (i2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) chargersActiveOrderMapper$mapPopup$1.L$10;
                    CharSequence charSequence2 = (CharSequence) chargersActiveOrderMapper$mapPopup$1.L$9;
                    str2 = (String) chargersActiveOrderMapper$mapPopup$1.L$8;
                    str = (String) chargersActiveOrderMapper$mapPopup$1.L$7;
                    it2 = (Iterator) chargersActiveOrderMapper$mapPopup$1.L$4;
                    ?? r102 = (Collection) chargersActiveOrderMapper$mapPopup$1.L$3;
                    kotlin.b.b(obj);
                    ArrayList arrayList3 = r102;
                    collection.add(new oma(charSequence2, (CharSequence) obj, str2, str));
                    it = it2;
                    arrayList = arrayList3;
                    if (it.hasNext()) {
                        pma pmaVar3 = (pma) it.next();
                        String str5 = pmaVar3.a;
                        String str6 = pmaVar3.b;
                        FormattedText formattedText2 = pmaVar3.c;
                        chargersActiveOrderMapper$mapPopup$1.L$0 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$1 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$2 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$3 = arrayList;
                        chargersActiveOrderMapper$mapPopup$1.L$4 = it;
                        chargersActiveOrderMapper$mapPopup$1.L$5 = null;
                        chargersActiveOrderMapper$mapPopup$1.L$6 = pmaVar3;
                        chargersActiveOrderMapper$mapPopup$1.L$7 = str6;
                        chargersActiveOrderMapper$mapPopup$1.L$8 = str5;
                        chargersActiveOrderMapper$mapPopup$1.L$9 = arrayList;
                        chargersActiveOrderMapper$mapPopup$1.L$10 = null;
                        chargersActiveOrderMapper$mapPopup$1.label = 1;
                        Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, chargersActiveOrderMapper$mapPopup$1, 30);
                        if (i4 != coroutineSingletons) {
                            str2 = str5;
                            pmaVar = pmaVar3;
                            str = str6;
                            ArrayList arrayList4 = arrayList;
                            obj = i4;
                            it2 = it;
                            collection = arrayList4;
                            arrayList2 = arrayList4;
                            CharSequence charSequence3 = (CharSequence) obj;
                            FormattedText formattedText3 = pmaVar.d;
                            chargersActiveOrderMapper$mapPopup$1.L$0 = null;
                            chargersActiveOrderMapper$mapPopup$1.L$1 = null;
                            chargersActiveOrderMapper$mapPopup$1.L$2 = null;
                            chargersActiveOrderMapper$mapPopup$1.L$3 = arrayList2;
                            chargersActiveOrderMapper$mapPopup$1.L$4 = it2;
                            chargersActiveOrderMapper$mapPopup$1.L$5 = null;
                            chargersActiveOrderMapper$mapPopup$1.L$6 = null;
                            chargersActiveOrderMapper$mapPopup$1.L$7 = str;
                            chargersActiveOrderMapper$mapPopup$1.L$8 = str2;
                            chargersActiveOrderMapper$mapPopup$1.L$9 = charSequence3;
                            chargersActiveOrderMapper$mapPopup$1.L$10 = collection;
                            chargersActiveOrderMapper$mapPopup$1.label = 2;
                            i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, chargersActiveOrderMapper$mapPopup$1, 30);
                            if (i2 != coroutineSingletons) {
                                charSequence2 = charSequence3;
                                obj = i2;
                                arrayList3 = arrayList2;
                                collection.add(new oma(charSequence2, (CharSequence) obj, str2, str));
                                it = it2;
                                arrayList = arrayList3;
                                if (it.hasNext()) {
                                    return arrayList;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        chargersActiveOrderMapper$mapPopup$1 = new ChargersActiveOrderMapper$mapPopup$1(this, continuationImpl);
        Object obj2 = chargersActiveOrderMapper$mapPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderMapper$mapPopup$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r14 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(gca gcaVar, String str, pav pavVar, ContinuationImpl continuationImpl) {
        ChargersActiveOrderMapper$mapToButton$1 chargersActiveOrderMapper$mapToButton$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        gca gcaVar2;
        pav pavVar2;
        CharSequence charSequence;
        gca gcaVar3;
        CharSequence charSequence2;
        Object b;
        hba hbaVar;
        if (continuationImpl instanceof ChargersActiveOrderMapper$mapToButton$1) {
            chargersActiveOrderMapper$mapToButton$1 = (ChargersActiveOrderMapper$mapToButton$1) continuationImpl;
            int i2 = chargersActiveOrderMapper$mapToButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderMapper$mapToButton$1.label = i2 - Integer.MIN_VALUE;
                ChargersActiveOrderMapper$mapToButton$1 chargersActiveOrderMapper$mapToButton$12 = chargersActiveOrderMapper$mapToButton$1;
                obj = chargersActiveOrderMapper$mapToButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderMapper$mapToButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((str == null || !gcaVar.b) ? null : str) != null) {
                        List<Object> list = gcaVar.a.a;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        for (Object obj2 : list) {
                            if (obj2 instanceof FormattedText.h) {
                                FormattedText.h hVar = (FormattedText.h) obj2;
                                obj2 = FormattedText.h.e(hVar, g8e.p(hVar.a, " • ", str), null, null, 2046);
                            }
                            arrayList.add(obj2);
                        }
                        FormattedText formattedText = new FormattedText(arrayList);
                        chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar;
                        chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                        chargersActiveOrderMapper$mapToButton$12.L$2 = pavVar;
                        chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                        chargersActiveOrderMapper$mapToButton$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(this.e, formattedText, null, false, chargersActiveOrderMapper$mapToButton$12, 30);
                    }
                    FormattedText formattedText2 = gcaVar.a;
                    chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar;
                    chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$2 = pavVar;
                    chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                    chargersActiveOrderMapper$mapToButton$12.label = 2;
                    obj = ru.yandex.taxi.widget.c.e(this.e, formattedText2, null, false, chargersActiveOrderMapper$mapToButton$12, 30);
                    if (obj != coroutineSingletons) {
                        gcaVar2 = gcaVar;
                        pavVar2 = pavVar;
                        charSequence = (CharSequence) obj;
                        gcaVar3 = gcaVar2;
                        charSequence2 = charSequence;
                        hba hbaVar2 = gcaVar3.d;
                        g16 k = pavVar2.b().b(((m7x0) this.c).a(gcaVar3.c)).k(s8o.m(new bdc(xng0.textOnControl), this.a));
                        chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar3;
                        chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                        chargersActiveOrderMapper$mapToButton$12.L$2 = null;
                        chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                        chargersActiveOrderMapper$mapToButton$12.L$4 = charSequence2;
                        chargersActiveOrderMapper$mapToButton$12.L$5 = hbaVar2;
                        chargersActiveOrderMapper$mapToButton$12.label = 3;
                        b = ru.yandex.taxi.utils.a.b(k, chargersActiveOrderMapper$mapToButton$12);
                        if (b != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hba hbaVar3 = (hba) chargersActiveOrderMapper$mapToButton$12.L$5;
                        charSequence2 = (CharSequence) chargersActiveOrderMapper$mapToButton$12.L$4;
                        gcaVar3 = (gca) chargersActiveOrderMapper$mapToButton$12.L$0;
                        kotlin.b.b(obj);
                        hbaVar = hbaVar3;
                        return new cl9(charSequence2, hbaVar, (Bitmap) obj, this.d.v(gcaVar3.e), gcaVar3.f, gcaVar3.g);
                    }
                    pavVar2 = (pav) chargersActiveOrderMapper$mapToButton$12.L$2;
                    gcaVar2 = (gca) chargersActiveOrderMapper$mapToButton$12.L$0;
                    kotlin.b.b(obj);
                    charSequence = (CharSequence) obj;
                    gcaVar3 = gcaVar2;
                    charSequence2 = charSequence;
                    hba hbaVar22 = gcaVar3.d;
                    g16 k2 = pavVar2.b().b(((m7x0) this.c).a(gcaVar3.c)).k(s8o.m(new bdc(xng0.textOnControl), this.a));
                    chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar3;
                    chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$2 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$4 = charSequence2;
                    chargersActiveOrderMapper$mapToButton$12.L$5 = hbaVar22;
                    chargersActiveOrderMapper$mapToButton$12.label = 3;
                    b = ru.yandex.taxi.utils.a.b(k2, chargersActiveOrderMapper$mapToButton$12);
                    if (b != coroutineSingletons) {
                        hbaVar = hbaVar22;
                        obj = b;
                        return new cl9(charSequence2, hbaVar, (Bitmap) obj, this.d.v(gcaVar3.e), gcaVar3.f, gcaVar3.g);
                    }
                    return coroutineSingletons;
                }
                pavVar = (pav) chargersActiveOrderMapper$mapToButton$12.L$2;
                gcaVar = (gca) chargersActiveOrderMapper$mapToButton$12.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    pav pavVar3 = pavVar;
                    gcaVar3 = gcaVar;
                    pavVar2 = pavVar3;
                    charSequence2 = charSequence;
                    hba hbaVar222 = gcaVar3.d;
                    g16 k22 = pavVar2.b().b(((m7x0) this.c).a(gcaVar3.c)).k(s8o.m(new bdc(xng0.textOnControl), this.a));
                    chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar3;
                    chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$2 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                    chargersActiveOrderMapper$mapToButton$12.L$4 = charSequence2;
                    chargersActiveOrderMapper$mapToButton$12.L$5 = hbaVar222;
                    chargersActiveOrderMapper$mapToButton$12.label = 3;
                    b = ru.yandex.taxi.utils.a.b(k22, chargersActiveOrderMapper$mapToButton$12);
                    if (b != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                FormattedText formattedText22 = gcaVar.a;
                chargersActiveOrderMapper$mapToButton$12.L$0 = gcaVar;
                chargersActiveOrderMapper$mapToButton$12.L$1 = null;
                chargersActiveOrderMapper$mapToButton$12.L$2 = pavVar;
                chargersActiveOrderMapper$mapToButton$12.L$3 = null;
                chargersActiveOrderMapper$mapToButton$12.label = 2;
                obj = ru.yandex.taxi.widget.c.e(this.e, formattedText22, null, false, chargersActiveOrderMapper$mapToButton$12, 30);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        chargersActiveOrderMapper$mapToButton$1 = new ChargersActiveOrderMapper$mapToButton$1(this, continuationImpl);
        ChargersActiveOrderMapper$mapToButton$1 chargersActiveOrderMapper$mapToButton$122 = chargersActiveOrderMapper$mapToButton$1;
        obj = chargersActiveOrderMapper$mapToButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderMapper$mapToButton$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj;
        if (charSequence != null) {
        }
        FormattedText formattedText222 = gcaVar.a;
        chargersActiveOrderMapper$mapToButton$122.L$0 = gcaVar;
        chargersActiveOrderMapper$mapToButton$122.L$1 = null;
        chargersActiveOrderMapper$mapToButton$122.L$2 = pavVar;
        chargersActiveOrderMapper$mapToButton$122.L$3 = null;
        chargersActiveOrderMapper$mapToButton$122.label = 2;
        obj = ru.yandex.taxi.widget.c.e(this.e, formattedText222, null, false, chargersActiveOrderMapper$mapToButton$122, 30);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r4 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fca fcaVar, ContinuationImpl continuationImpl) {
        ChargersActiveOrderMapper$mapToUiStateBanner$1 chargersActiveOrderMapper$mapToUiStateBanner$1;
        int i;
        kba kbaVar;
        Object e;
        kba kbaVar2;
        Object e2;
        CharSequence charSequence;
        kba kbaVar3;
        fca fcaVar2;
        jba jbaVar;
        fca fcaVar3;
        kba kbaVar4;
        CharSequence charSequence2;
        fca fcaVar4 = fcaVar;
        if (continuationImpl instanceof ChargersActiveOrderMapper$mapToUiStateBanner$1) {
            chargersActiveOrderMapper$mapToUiStateBanner$1 = (ChargersActiveOrderMapper$mapToUiStateBanner$1) continuationImpl;
            int i2 = chargersActiveOrderMapper$mapToUiStateBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderMapper$mapToUiStateBanner$1.label = i2 - Integer.MIN_VALUE;
                ChargersActiveOrderMapper$mapToUiStateBanner$1 chargersActiveOrderMapper$mapToUiStateBanner$12 = chargersActiveOrderMapper$mapToUiStateBanner$1;
                Object obj = chargersActiveOrderMapper$mapToUiStateBanner$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderMapper$mapToUiStateBanner$12.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kbaVar = fcaVar4.c;
                    FormattedText formattedText = fcaVar4.a;
                    if (kbaVar instanceof jba) {
                        chargersActiveOrderMapper$mapToUiStateBanner$12.L$0 = fcaVar4;
                        chargersActiveOrderMapper$mapToUiStateBanner$12.L$1 = kbaVar;
                        chargersActiveOrderMapper$mapToUiStateBanner$12.label = 1;
                        Object e3 = ru.yandex.taxi.widget.c.e(this.e, formattedText, null, false, chargersActiveOrderMapper$mapToUiStateBanner$12, 30);
                        if (e3 != coroutineSingletons) {
                            kbaVar2 = kbaVar;
                            obj = e3;
                            CharSequence charSequence3 = (CharSequence) obj;
                            FormattedText formattedText2 = fcaVar4.b;
                            chargersActiveOrderMapper$mapToUiStateBanner$12.L$0 = fcaVar4;
                            chargersActiveOrderMapper$mapToUiStateBanner$12.L$1 = kbaVar2;
                            chargersActiveOrderMapper$mapToUiStateBanner$12.L$2 = charSequence3;
                            chargersActiveOrderMapper$mapToUiStateBanner$12.label = 2;
                            e2 = ru.yandex.taxi.widget.c.e(this.e, formattedText2, null, false, chargersActiveOrderMapper$mapToUiStateBanner$12, 30);
                            if (e2 != coroutineSingletons) {
                            }
                        }
                    } else {
                        if (!(kbaVar instanceof iba)) {
                            w511.b();
                            return null;
                        }
                        chargersActiveOrderMapper$mapToUiStateBanner$12.L$0 = fcaVar4;
                        chargersActiveOrderMapper$mapToUiStateBanner$12.L$1 = kbaVar;
                        chargersActiveOrderMapper$mapToUiStateBanner$12.label = 3;
                        e = ru.yandex.taxi.widget.c.e(this.e, formattedText, null, false, chargersActiveOrderMapper$mapToUiStateBanner$12, 30);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kba kbaVar5 = (kba) chargersActiveOrderMapper$mapToUiStateBanner$12.L$1;
                    fca fcaVar5 = (fca) chargersActiveOrderMapper$mapToUiStateBanner$12.L$0;
                    kotlin.b.b(obj);
                    kbaVar2 = kbaVar5;
                    fcaVar4 = fcaVar5;
                    CharSequence charSequence32 = (CharSequence) obj;
                    FormattedText formattedText22 = fcaVar4.b;
                    chargersActiveOrderMapper$mapToUiStateBanner$12.L$0 = fcaVar4;
                    chargersActiveOrderMapper$mapToUiStateBanner$12.L$1 = kbaVar2;
                    chargersActiveOrderMapper$mapToUiStateBanner$12.L$2 = charSequence32;
                    chargersActiveOrderMapper$mapToUiStateBanner$12.label = 2;
                    e2 = ru.yandex.taxi.widget.c.e(this.e, formattedText22, null, false, chargersActiveOrderMapper$mapToUiStateBanner$12, 30);
                    if (e2 != coroutineSingletons) {
                        charSequence = charSequence32;
                        obj = e2;
                        kbaVar3 = kbaVar2;
                        fcaVar2 = fcaVar4;
                        CharSequence charSequence4 = (CharSequence) obj;
                        hba hbaVar = fcaVar2.d;
                        jbaVar = (jba) kbaVar3;
                        if (jbaVar.a.length() > 0) {
                        }
                        return new al9(charSequence, charSequence4, hbaVar, str, fcaVar2.f);
                    }
                    return coroutineSingletons;
                }
                if (i == 2) {
                    CharSequence charSequence5 = (CharSequence) chargersActiveOrderMapper$mapToUiStateBanner$12.L$2;
                    kbaVar3 = (kba) chargersActiveOrderMapper$mapToUiStateBanner$12.L$1;
                    fcaVar2 = (fca) chargersActiveOrderMapper$mapToUiStateBanner$12.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence5;
                    CharSequence charSequence42 = (CharSequence) obj;
                    hba hbaVar2 = fcaVar2.d;
                    jbaVar = (jba) kbaVar3;
                    if (jbaVar.a.length() > 0) {
                        str = ((m7x0) this.c).a(jbaVar.a);
                    }
                    return new al9(charSequence, charSequence42, hbaVar2, str, fcaVar2.f);
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CharSequence charSequence6 = (CharSequence) chargersActiveOrderMapper$mapToUiStateBanner$12.L$2;
                    kbaVar4 = (kba) chargersActiveOrderMapper$mapToUiStateBanner$12.L$1;
                    fcaVar3 = (fca) chargersActiveOrderMapper$mapToUiStateBanner$12.L$0;
                    kotlin.b.b(obj);
                    charSequence2 = charSequence6;
                    return new zk9(charSequence2, (CharSequence) obj, fcaVar3.d, ((iba) kbaVar4).a, fcaVar3.f);
                }
                kba kbaVar6 = (kba) chargersActiveOrderMapper$mapToUiStateBanner$12.L$1;
                fca fcaVar6 = (fca) chargersActiveOrderMapper$mapToUiStateBanner$12.L$0;
                kotlin.b.b(obj);
                kbaVar = kbaVar6;
                fcaVar4 = fcaVar6;
                e = obj;
                CharSequence charSequence7 = (CharSequence) e;
                FormattedText formattedText3 = fcaVar4.b;
                chargersActiveOrderMapper$mapToUiStateBanner$12.L$0 = fcaVar4;
                chargersActiveOrderMapper$mapToUiStateBanner$12.L$1 = kbaVar;
                chargersActiveOrderMapper$mapToUiStateBanner$12.L$2 = charSequence7;
                chargersActiveOrderMapper$mapToUiStateBanner$12.label = 4;
                Object e4 = ru.yandex.taxi.widget.c.e(this.e, formattedText3, null, false, chargersActiveOrderMapper$mapToUiStateBanner$12, 30);
                if (e4 != coroutineSingletons) {
                    fcaVar3 = fcaVar4;
                    kbaVar4 = kbaVar;
                    charSequence2 = charSequence7;
                    obj = e4;
                    return new zk9(charSequence2, (CharSequence) obj, fcaVar3.d, ((iba) kbaVar4).a, fcaVar3.f);
                }
                return coroutineSingletons;
            }
        }
        chargersActiveOrderMapper$mapToUiStateBanner$1 = new ChargersActiveOrderMapper$mapToUiStateBanner$1(this, continuationImpl);
        ChargersActiveOrderMapper$mapToUiStateBanner$1 chargersActiveOrderMapper$mapToUiStateBanner$122 = chargersActiveOrderMapper$mapToUiStateBanner$1;
        Object obj2 = chargersActiveOrderMapper$mapToUiStateBanner$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderMapper$mapToUiStateBanner$122.label;
        String str2 = null;
        if (i != 0) {
        }
    }
}
