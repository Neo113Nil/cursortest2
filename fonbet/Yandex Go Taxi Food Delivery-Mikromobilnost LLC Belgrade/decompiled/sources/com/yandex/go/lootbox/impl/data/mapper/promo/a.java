package com.yandex.go.lootbox.impl.data.mapper.promo;

import android.graphics.Bitmap;
import defpackage.bdc;
import defpackage.c4v;
import defpackage.jst;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pfv;
import defpackage.pqz;
import defpackage.qpz;
import defpackage.ufu;
import defpackage.xng0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.g;
import ru.yandex.taxi.utils.d;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a implements qpz {
    public final d a;
    public final c b;
    public final pdc c;

    public a(d dVar, c cVar, pdc pdcVar) {
        this.a = dVar;
        this.b = cVar;
        this.c = pdcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c4v c4vVar, ContinuationImpl continuationImpl) {
        LootBoxContentMapperImpl$loadIcon$1 lootBoxContentMapperImpl$loadIcon$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof LootBoxContentMapperImpl$loadIcon$1) {
            lootBoxContentMapperImpl$loadIcon$1 = (LootBoxContentMapperImpl$loadIcon$1) continuationImpl;
            int i2 = lootBoxContentMapperImpl$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxContentMapperImpl$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxContentMapperImpl$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxContentMapperImpl$loadIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    lootBoxContentMapperImpl$loadIcon$1.L$0 = null;
                    lootBoxContentMapperImpl$loadIcon$1.label = 1;
                    a = this.a.a(c4vVar, pfv.a, lootBoxContentMapperImpl$loadIcon$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    jst.e.p("Failed to load lootBox icon", a2);
                }
                if (a instanceof Result.Failure) {
                    return a;
                }
                return null;
            }
        }
        lootBoxContentMapperImpl$loadIcon$1 = new LootBoxContentMapperImpl$loadIcon$1(this, continuationImpl);
        Object obj2 = lootBoxContentMapperImpl$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxContentMapperImpl$loadIcon$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        if (a instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0246, code lost:
    
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.yandex.go.lootbox.impl.data.mapper.promo.a] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0142 -> B:13:0x0246). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x020a -> B:12:0x0213). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011a -> B:14:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, ContinuationImpl continuationImpl) {
        LootBoxContentMapperImpl$mapToEntity$1 lootBoxContentMapperImpl$mapToEntity$1;
        int i;
        Iterator it;
        String str2;
        Iterator it2;
        ArrayList arrayList;
        CommunicationItem communicationItem;
        pqz pqzVar;
        CommunicationItem communicationItem2;
        String str3;
        LootBoxContentMapperImpl$mapToEntity$1 lootBoxContentMapperImpl$mapToEntity$12;
        ArrayList arrayList2;
        Iterator it3;
        String str4;
        Bitmap bitmap;
        ActionButton actionButton;
        ru.yandex.taxi.communications.model.widgets.b bVar;
        String str5;
        Object e;
        Iterator it4;
        ActionButton actionButton2;
        Iterator it5;
        CommunicationItem communicationItem3;
        String str6;
        ArrayList arrayList3;
        String str7;
        String str8;
        ArrayList arrayList4;
        Iterator it6;
        CommunicationItem communicationItem4;
        Object e2;
        if (continuationImpl instanceof LootBoxContentMapperImpl$mapToEntity$1) {
            lootBoxContentMapperImpl$mapToEntity$1 = (LootBoxContentMapperImpl$mapToEntity$1) continuationImpl;
            int i2 = lootBoxContentMapperImpl$mapToEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxContentMapperImpl$mapToEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxContentMapperImpl$mapToEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxContentMapperImpl$mapToEntity$1.label;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList5 = new ArrayList();
                    LootBoxContentMapperImpl$mapToEntity$1 lootBoxContentMapperImpl$mapToEntity$13 = lootBoxContentMapperImpl$mapToEntity$1;
                    Iterator it7 = list.iterator();
                    String str9 = str;
                    if (!it7.hasNext()) {
                        CommunicationItem communicationItem5 = (CommunicationItem) it7.next();
                        it = communicationItem5.g.e.iterator();
                        str2 = str9;
                        it2 = it7;
                        lootBoxContentMapperImpl$mapToEntity$1 = lootBoxContentMapperImpl$mapToEntity$13;
                        arrayList = arrayList5;
                        communicationItem = communicationItem5;
                        if (it.hasNext()) {
                            actionButton = (ActionButton) it.next();
                            bVar = actionButton.e;
                            if (bVar instanceof g) {
                                c4v c4vVar = communicationItem.d;
                                lootBoxContentMapperImpl$mapToEntity$1.L$0 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$1 = str2;
                                lootBoxContentMapperImpl$mapToEntity$1.L$2 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$3 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$4 = arrayList;
                                lootBoxContentMapperImpl$mapToEntity$1.L$5 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$6 = it2;
                                lootBoxContentMapperImpl$mapToEntity$1.L$7 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$8 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$9 = communicationItem;
                                lootBoxContentMapperImpl$mapToEntity$1.L$10 = it;
                                lootBoxContentMapperImpl$mapToEntity$1.L$11 = actionButton;
                                lootBoxContentMapperImpl$mapToEntity$1.L$12 = bVar;
                                lootBoxContentMapperImpl$mapToEntity$1.L$13 = str2;
                                lootBoxContentMapperImpl$mapToEntity$1.L$14 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$15 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.L$16 = null;
                                lootBoxContentMapperImpl$mapToEntity$1.label = 1;
                                obj = a(c4vVar, lootBoxContentMapperImpl$mapToEntity$1);
                                if (obj != coroutineSingletons) {
                                    lootBoxContentMapperImpl$mapToEntity$12 = lootBoxContentMapperImpl$mapToEntity$1;
                                    communicationItem4 = communicationItem;
                                    it6 = it2;
                                    arrayList4 = arrayList;
                                    str8 = str2;
                                    str7 = str8;
                                    Bitmap bitmap2 = (Bitmap) obj;
                                    String a = ((g) bVar).getA();
                                    FormattedText formattedText = communicationItem4.c;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$0 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$1 = str8;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$2 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$3 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$4 = arrayList4;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$5 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$6 = it6;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$7 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$8 = null;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$9 = communicationItem4;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$10 = it;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$11 = actionButton;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$12 = bVar;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$13 = str7;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$14 = bitmap2;
                                    lootBoxContentMapperImpl$mapToEntity$12.L$15 = a;
                                    lootBoxContentMapperImpl$mapToEntity$12.label = 2;
                                    Iterator it8 = it6;
                                    String str10 = str8;
                                    ArrayList arrayList6 = arrayList4;
                                    e2 = c.e(this.b, formattedText, null, false, lootBoxContentMapperImpl$mapToEntity$12, 30);
                                    if (e2 != coroutineSingletons) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            pqzVar = null;
                        } else {
                            pqzVar = null;
                            lootBoxContentMapperImpl$mapToEntity$13 = lootBoxContentMapperImpl$mapToEntity$1;
                            it7 = it2;
                            if (pqzVar != null) {
                                arrayList.add(pqzVar);
                            }
                            arrayList5 = arrayList;
                            str9 = str2;
                            if (!it7.hasNext()) {
                                return arrayList5;
                            }
                        }
                    }
                } else {
                    if (i == 1) {
                        String str11 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$13;
                        bVar = (ru.yandex.taxi.communications.model.widgets.b) lootBoxContentMapperImpl$mapToEntity$1.L$12;
                        actionButton = (ActionButton) lootBoxContentMapperImpl$mapToEntity$1.L$11;
                        it = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$10;
                        CommunicationItem communicationItem6 = (CommunicationItem) lootBoxContentMapperImpl$mapToEntity$1.L$9;
                        Iterator it9 = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$6;
                        ?? r11 = (Collection) lootBoxContentMapperImpl$mapToEntity$1.L$4;
                        String str12 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$1;
                        b.b(obj);
                        lootBoxContentMapperImpl$mapToEntity$12 = lootBoxContentMapperImpl$mapToEntity$1;
                        str7 = str11;
                        communicationItem4 = communicationItem6;
                        it6 = it9;
                        arrayList4 = r11;
                        str8 = str12;
                        Bitmap bitmap22 = (Bitmap) obj;
                        String a2 = ((g) bVar).getA();
                        FormattedText formattedText2 = communicationItem4.c;
                        lootBoxContentMapperImpl$mapToEntity$12.L$0 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$1 = str8;
                        lootBoxContentMapperImpl$mapToEntity$12.L$2 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$3 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$4 = arrayList4;
                        lootBoxContentMapperImpl$mapToEntity$12.L$5 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$6 = it6;
                        lootBoxContentMapperImpl$mapToEntity$12.L$7 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$8 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$9 = communicationItem4;
                        lootBoxContentMapperImpl$mapToEntity$12.L$10 = it;
                        lootBoxContentMapperImpl$mapToEntity$12.L$11 = actionButton;
                        lootBoxContentMapperImpl$mapToEntity$12.L$12 = bVar;
                        lootBoxContentMapperImpl$mapToEntity$12.L$13 = str7;
                        lootBoxContentMapperImpl$mapToEntity$12.L$14 = bitmap22;
                        lootBoxContentMapperImpl$mapToEntity$12.L$15 = a2;
                        lootBoxContentMapperImpl$mapToEntity$12.label = 2;
                        Iterator it82 = it6;
                        String str102 = str8;
                        ArrayList arrayList62 = arrayList4;
                        e2 = c.e(this.b, formattedText2, null, false, lootBoxContentMapperImpl$mapToEntity$12, 30);
                        if (e2 != coroutineSingletons) {
                            bitmap = bitmap22;
                            obj = e2;
                            str4 = str7;
                            it3 = it82;
                            str3 = str102;
                            arrayList2 = arrayList62;
                            communicationItem2 = communicationItem4;
                            str5 = a2;
                            String obj2 = obj.toString();
                            FormattedText formattedText3 = communicationItem2.b;
                            lootBoxContentMapperImpl$mapToEntity$12.L$0 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$1 = str3;
                            lootBoxContentMapperImpl$mapToEntity$12.L$2 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$3 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$4 = arrayList2;
                            lootBoxContentMapperImpl$mapToEntity$12.L$5 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$6 = it3;
                            lootBoxContentMapperImpl$mapToEntity$12.L$7 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$8 = null;
                            lootBoxContentMapperImpl$mapToEntity$12.L$9 = communicationItem2;
                            lootBoxContentMapperImpl$mapToEntity$12.L$10 = it;
                            lootBoxContentMapperImpl$mapToEntity$12.L$11 = actionButton;
                            lootBoxContentMapperImpl$mapToEntity$12.L$12 = bVar;
                            lootBoxContentMapperImpl$mapToEntity$12.L$13 = str4;
                            lootBoxContentMapperImpl$mapToEntity$12.L$14 = bitmap;
                            lootBoxContentMapperImpl$mapToEntity$12.L$15 = str5;
                            lootBoxContentMapperImpl$mapToEntity$12.L$16 = obj2;
                            lootBoxContentMapperImpl$mapToEntity$12.label = 3;
                            Iterator it10 = it3;
                            ArrayList arrayList7 = arrayList2;
                            String str13 = str3;
                            e = c.e(this.b, formattedText3, null, false, lootBoxContentMapperImpl$mapToEntity$12, 30);
                            if (e != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 2) {
                        String str14 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$15;
                        bitmap = (Bitmap) lootBoxContentMapperImpl$mapToEntity$1.L$14;
                        str4 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$13;
                        ru.yandex.taxi.communications.model.widgets.b bVar2 = (ru.yandex.taxi.communications.model.widgets.b) lootBoxContentMapperImpl$mapToEntity$1.L$12;
                        ActionButton actionButton3 = (ActionButton) lootBoxContentMapperImpl$mapToEntity$1.L$11;
                        Iterator it11 = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$10;
                        CommunicationItem communicationItem7 = (CommunicationItem) lootBoxContentMapperImpl$mapToEntity$1.L$9;
                        Iterator it12 = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$6;
                        ?? r5 = (Collection) lootBoxContentMapperImpl$mapToEntity$1.L$4;
                        String str15 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$1;
                        b.b(obj);
                        arrayList2 = r5;
                        bVar = bVar2;
                        it3 = it12;
                        communicationItem2 = communicationItem7;
                        str3 = str15;
                        actionButton = actionButton3;
                        it = it11;
                        lootBoxContentMapperImpl$mapToEntity$12 = lootBoxContentMapperImpl$mapToEntity$1;
                        str5 = str14;
                        String obj22 = obj.toString();
                        FormattedText formattedText32 = communicationItem2.b;
                        lootBoxContentMapperImpl$mapToEntity$12.L$0 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$1 = str3;
                        lootBoxContentMapperImpl$mapToEntity$12.L$2 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$3 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$4 = arrayList2;
                        lootBoxContentMapperImpl$mapToEntity$12.L$5 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$6 = it3;
                        lootBoxContentMapperImpl$mapToEntity$12.L$7 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$8 = null;
                        lootBoxContentMapperImpl$mapToEntity$12.L$9 = communicationItem2;
                        lootBoxContentMapperImpl$mapToEntity$12.L$10 = it;
                        lootBoxContentMapperImpl$mapToEntity$12.L$11 = actionButton;
                        lootBoxContentMapperImpl$mapToEntity$12.L$12 = bVar;
                        lootBoxContentMapperImpl$mapToEntity$12.L$13 = str4;
                        lootBoxContentMapperImpl$mapToEntity$12.L$14 = bitmap;
                        lootBoxContentMapperImpl$mapToEntity$12.L$15 = str5;
                        lootBoxContentMapperImpl$mapToEntity$12.L$16 = obj22;
                        lootBoxContentMapperImpl$mapToEntity$12.label = 3;
                        Iterator it102 = it3;
                        ArrayList arrayList72 = arrayList2;
                        String str132 = str3;
                        e = c.e(this.b, formattedText32, null, false, lootBoxContentMapperImpl$mapToEntity$12, 30);
                        if (e != coroutineSingletons) {
                            it4 = it102;
                            actionButton2 = actionButton;
                            it5 = it;
                            lootBoxContentMapperImpl$mapToEntity$1 = lootBoxContentMapperImpl$mapToEntity$12;
                            communicationItem3 = communicationItem2;
                            str6 = str132;
                            arrayList3 = arrayList72;
                            e.toString();
                            String str16 = communicationItem3.a;
                            String str17 = actionButton2.b;
                            String str18 = actionButton2.c;
                            bdc bdcVar = new bdc(xng0.controlMinor);
                            ufu ufuVar = (ufu) this.c;
                            ufuVar.d(bdcVar, str18);
                            ufuVar.h(new bdc(xng0.textOnControl), actionButton2.d);
                            bVar.b();
                            pqzVar = new pqz((g) bVar);
                            it = it5;
                            communicationItem = communicationItem3;
                            it2 = it4;
                            arrayList = arrayList3;
                            str2 = str6;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ru.yandex.taxi.communications.model.widgets.b bVar3 = (ru.yandex.taxi.communications.model.widgets.b) lootBoxContentMapperImpl$mapToEntity$1.L$12;
                    actionButton2 = (ActionButton) lootBoxContentMapperImpl$mapToEntity$1.L$11;
                    it5 = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$10;
                    communicationItem3 = (CommunicationItem) lootBoxContentMapperImpl$mapToEntity$1.L$9;
                    it4 = (Iterator) lootBoxContentMapperImpl$mapToEntity$1.L$6;
                    ?? r13 = (Collection) lootBoxContentMapperImpl$mapToEntity$1.L$4;
                    str6 = (String) lootBoxContentMapperImpl$mapToEntity$1.L$1;
                    b.b(obj);
                    e = obj;
                    bVar = bVar3;
                    arrayList3 = r13;
                    e.toString();
                    String str162 = communicationItem3.a;
                    String str172 = actionButton2.b;
                    String str182 = actionButton2.c;
                    bdc bdcVar2 = new bdc(xng0.controlMinor);
                    ufu ufuVar2 = (ufu) this.c;
                    ufuVar2.d(bdcVar2, str182);
                    ufuVar2.h(new bdc(xng0.textOnControl), actionButton2.d);
                    bVar.b();
                    pqzVar = new pqz((g) bVar);
                    it = it5;
                    communicationItem = communicationItem3;
                    it2 = it4;
                    arrayList = arrayList3;
                    str2 = str6;
                }
            }
        }
        lootBoxContentMapperImpl$mapToEntity$1 = new LootBoxContentMapperImpl$mapToEntity$1(this, continuationImpl);
        Object obj3 = lootBoxContentMapperImpl$mapToEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxContentMapperImpl$mapToEntity$1.label;
        if (i != 0) {
        }
    }
}
