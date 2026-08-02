package com.yandex.go.delivery.sdd_slots_selector;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ad5;
import defpackage.boi;
import defpackage.eoi;
import defpackage.foi;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.ppi;
import defpackage.uze0;
import defpackage.vts0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final uze0 A;
    public final m0 B;
    public final c x;
    public final boi y;
    public final foi z;

    public a(c cVar, boi boiVar, foi foiVar, uze0 uze0Var) {
        super(eoi.class);
        this.x = cVar;
        this.y = boiVar;
        this.z = foiVar;
        this.A = uze0Var;
        this.B = new m0(boiVar.c, ((k) uze0Var).j.a(), new DeliverySddIntervalsPresenter$slotsFlow$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0168, code lost:
    
        if (r0 != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0168 -> B:12:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x017a -> B:14:0x017b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, List list, ContinuationImpl continuationImpl) {
        DeliverySddIntervalsPresenter$createSlots$1 deliverySddIntervalsPresenter$createSlots$1;
        int i;
        Iterator it;
        Collection collection;
        Collection collection2;
        Iterator it2;
        ppi ppiVar;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        ppi ppiVar2;
        String str2;
        aVar.getClass();
        c cVar = aVar.x;
        if (continuationImpl instanceof DeliverySddIntervalsPresenter$createSlots$1) {
            deliverySddIntervalsPresenter$createSlots$1 = (DeliverySddIntervalsPresenter$createSlots$1) continuationImpl;
            int i2 = deliverySddIntervalsPresenter$createSlots$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliverySddIntervalsPresenter$createSlots$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliverySddIntervalsPresenter$createSlots$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliverySddIntervalsPresenter$createSlots$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (list == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        str2 = (String) deliverySddIntervalsPresenter$createSlots$1.L$10;
                        ppiVar2 = (ppi) deliverySddIntervalsPresenter$createSlots$1.L$9;
                        it = (Iterator) deliverySddIntervalsPresenter$createSlots$1.L$5;
                        collection = (Collection) deliverySddIntervalsPresenter$createSlots$1.L$3;
                        b.b(obj);
                        CharSequence charSequence3 = (CharSequence) obj;
                        FormattedText formattedText = ppiVar2.c;
                        deliverySddIntervalsPresenter$createSlots$1.L$0 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$1 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$2 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$3 = collection;
                        deliverySddIntervalsPresenter$createSlots$1.L$4 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$5 = it;
                        deliverySddIntervalsPresenter$createSlots$1.L$6 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$7 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$8 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$9 = ppiVar2;
                        deliverySddIntervalsPresenter$createSlots$1.L$10 = str2;
                        deliverySddIntervalsPresenter$createSlots$1.L$11 = charSequence3;
                        deliverySddIntervalsPresenter$createSlots$1.label = 2;
                        Object i3 = c.i(cVar, formattedText, null, deliverySddIntervalsPresenter$createSlots$1, 30);
                        if (i3 != coroutineSingletons) {
                            collection2 = collection;
                            ppiVar = ppiVar2;
                            charSequence = charSequence3;
                            obj = i3;
                            it2 = it;
                            str = str2;
                            charSequence2 = (CharSequence) obj;
                            FormattedText formattedText2 = ppiVar.d;
                            deliverySddIntervalsPresenter$createSlots$1.L$0 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$1 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$2 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$3 = collection2;
                            deliverySddIntervalsPresenter$createSlots$1.L$4 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$5 = it2;
                            deliverySddIntervalsPresenter$createSlots$1.L$6 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$7 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$8 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$9 = ppiVar;
                            deliverySddIntervalsPresenter$createSlots$1.L$10 = str;
                            deliverySddIntervalsPresenter$createSlots$1.L$11 = charSequence;
                            deliverySddIntervalsPresenter$createSlots$1.L$12 = charSequence2;
                            deliverySddIntervalsPresenter$createSlots$1.label = 3;
                            obj = c.i(cVar, formattedText2, null, deliverySddIntervalsPresenter$createSlots$1, 30);
                        }
                        return coroutineSingletons;
                    }
                    if (i == 2) {
                        CharSequence charSequence4 = (CharSequence) deliverySddIntervalsPresenter$createSlots$1.L$11;
                        String str3 = (String) deliverySddIntervalsPresenter$createSlots$1.L$10;
                        ppi ppiVar3 = (ppi) deliverySddIntervalsPresenter$createSlots$1.L$9;
                        Iterator it3 = (Iterator) deliverySddIntervalsPresenter$createSlots$1.L$5;
                        Collection collection3 = (Collection) deliverySddIntervalsPresenter$createSlots$1.L$3;
                        b.b(obj);
                        collection2 = collection3;
                        it2 = it3;
                        ppiVar = ppiVar3;
                        str = str3;
                        charSequence = charSequence4;
                        charSequence2 = (CharSequence) obj;
                        FormattedText formattedText22 = ppiVar.d;
                        deliverySddIntervalsPresenter$createSlots$1.L$0 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$1 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$2 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$3 = collection2;
                        deliverySddIntervalsPresenter$createSlots$1.L$4 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$5 = it2;
                        deliverySddIntervalsPresenter$createSlots$1.L$6 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$7 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$8 = null;
                        deliverySddIntervalsPresenter$createSlots$1.L$9 = ppiVar;
                        deliverySddIntervalsPresenter$createSlots$1.L$10 = str;
                        deliverySddIntervalsPresenter$createSlots$1.L$11 = charSequence;
                        deliverySddIntervalsPresenter$createSlots$1.L$12 = charSequence2;
                        deliverySddIntervalsPresenter$createSlots$1.label = 3;
                        obj = c.i(cVar, formattedText22, null, deliverySddIntervalsPresenter$createSlots$1, 30);
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence2 = (CharSequence) deliverySddIntervalsPresenter$createSlots$1.L$12;
                        charSequence = (CharSequence) deliverySddIntervalsPresenter$createSlots$1.L$11;
                        str = (String) deliverySddIntervalsPresenter$createSlots$1.L$10;
                        ppiVar = (ppi) deliverySddIntervalsPresenter$createSlots$1.L$9;
                        it2 = (Iterator) deliverySddIntervalsPresenter$createSlots$1.L$5;
                        collection2 = (Collection) deliverySddIntervalsPresenter$createSlots$1.L$3;
                        b.b(obj);
                        Iterator it4 = it2;
                        Collection collection4 = collection2;
                        vts0 vts0Var = new vts0(str, charSequence, charSequence2, (CharSequence) obj, ppiVar.g);
                        it = it4;
                        collection = collection4;
                        if (vts0Var != null) {
                            collection.add(vts0Var);
                        }
                        if (!it.hasNext()) {
                            return (List) collection;
                        }
                        nu1 nu1Var = (nu1) it.next();
                        ppiVar2 = nu1Var.f;
                        if (ppiVar2 != null) {
                            str2 = nu1Var.b;
                            FormattedText formattedText3 = ppiVar2.b;
                            deliverySddIntervalsPresenter$createSlots$1.L$0 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$1 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$2 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$3 = collection;
                            deliverySddIntervalsPresenter$createSlots$1.L$4 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$5 = it;
                            deliverySddIntervalsPresenter$createSlots$1.L$6 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$7 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$8 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$9 = ppiVar2;
                            deliverySddIntervalsPresenter$createSlots$1.L$10 = str2;
                            deliverySddIntervalsPresenter$createSlots$1.L$11 = null;
                            deliverySddIntervalsPresenter$createSlots$1.L$12 = null;
                            deliverySddIntervalsPresenter$createSlots$1.label = 1;
                            obj = c.i(cVar, formattedText3, null, deliverySddIntervalsPresenter$createSlots$1, 30);
                        } else {
                            vts0Var = null;
                            if (vts0Var != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        deliverySddIntervalsPresenter$createSlots$1 = new DeliverySddIntervalsPresenter$createSlots$1(aVar, continuationImpl);
        Object obj2 = deliverySddIntervalsPresenter$createSlots$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliverySddIntervalsPresenter$createSlots$1.label;
        if (i != 0) {
        }
    }
}
