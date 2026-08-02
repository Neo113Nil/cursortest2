package com.yandex.go.scooters.data.mapper;

import defpackage.a3o;
import defpackage.b4o;
import defpackage.cno0;
import defpackage.f3p0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.g590;
import defpackage.i8w0;
import defpackage.jl40;
import defpackage.k6a0;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.o20;
import defpackage.p20;
import defpackage.pdc;
import defpackage.q3p0;
import defpackage.s20;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tl90;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import defpackage.v20;
import defpackage.w20;
import defpackage.xdf;
import defpackage.z20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class d {
    public final tt2 a;
    public final pdc b;
    public final xdf c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final q3p0 e;
    public final c f;
    public final ru.yandex.taxi.widget.c g;
    public final cno0 h;
    public final f3p0 i;

    public d(tt2 tt2Var, pdc pdcVar, xdf xdfVar, ru.yandex.taxi.widget.utils.e eVar, q3p0 q3p0Var, c cVar, ru.yandex.taxi.widget.c cVar2, cno0 cno0Var, f3p0 f3p0Var) {
        this.a = tt2Var;
        this.b = pdcVar;
        this.c = xdfVar;
        this.d = eVar;
        this.e = q3p0Var;
        this.f = cVar;
        this.g = cVar2;
        this.h = cno0Var;
        this.i = f3p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r12 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, v20 v20Var, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersPassMapper$mapToActivePassesInfo$1 scootersPassMapper$mapToActivePassesInfo$1;
        Object obj;
        int i;
        FormattedText formattedText;
        List list;
        CharSequence charSequence;
        z20 z20Var;
        CharSequence charSequence2;
        CharSequence charSequence3;
        FormattedText formattedText2;
        fef fefVar2;
        List list2;
        Object d;
        CharSequence charSequence4;
        dVar.getClass();
        if (continuationImpl instanceof ScootersPassMapper$mapToActivePassesInfo$1) {
            scootersPassMapper$mapToActivePassesInfo$1 = (ScootersPassMapper$mapToActivePassesInfo$1) continuationImpl;
            int i2 = scootersPassMapper$mapToActivePassesInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassMapper$mapToActivePassesInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPassMapper$mapToActivePassesInfo$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassMapper$mapToActivePassesInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z20 z20Var2 = v20Var.a;
                    if (z20Var2 == null || (formattedText = z20Var2.a) == null || (list = v20Var.b) == null || list.isEmpty()) {
                        return null;
                    }
                    scootersPassMapper$mapToActivePassesInfo$1.L$0 = v20Var;
                    scootersPassMapper$mapToActivePassesInfo$1.L$1 = fefVar;
                    scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$3 = list;
                    scootersPassMapper$mapToActivePassesInfo$1.label = 1;
                    obj2 = dVar.c(formattedText, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence4 = (CharSequence) scootersPassMapper$mapToActivePassesInfo$1.L$5;
                            charSequence2 = (CharSequence) scootersPassMapper$mapToActivePassesInfo$1.L$4;
                            kotlin.b.b(obj2);
                            return new w20(charSequence2, charSequence4, (List) obj2);
                        }
                        charSequence2 = (CharSequence) scootersPassMapper$mapToActivePassesInfo$1.L$4;
                        list2 = (List) scootersPassMapper$mapToActivePassesInfo$1.L$3;
                        fefVar2 = (fef) scootersPassMapper$mapToActivePassesInfo$1.L$1;
                        kotlin.b.b(obj2);
                        charSequence3 = (CharSequence) obj2;
                        fef fefVar3 = fefVar2;
                        list = list2;
                        fefVar = fefVar3;
                        scootersPassMapper$mapToActivePassesInfo$1.L$0 = null;
                        scootersPassMapper$mapToActivePassesInfo$1.L$1 = null;
                        scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
                        scootersPassMapper$mapToActivePassesInfo$1.L$3 = null;
                        scootersPassMapper$mapToActivePassesInfo$1.L$4 = charSequence2;
                        scootersPassMapper$mapToActivePassesInfo$1.L$5 = charSequence3;
                        scootersPassMapper$mapToActivePassesInfo$1.label = 3;
                        d = dVar.d(list, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
                        if (d != obj) {
                            CharSequence charSequence5 = charSequence3;
                            obj2 = d;
                            charSequence4 = charSequence5;
                            return new w20(charSequence2, charSequence4, (List) obj2);
                        }
                        return obj;
                    }
                    List list3 = (List) scootersPassMapper$mapToActivePassesInfo$1.L$3;
                    fefVar = (fef) scootersPassMapper$mapToActivePassesInfo$1.L$1;
                    v20 v20Var2 = (v20) scootersPassMapper$mapToActivePassesInfo$1.L$0;
                    kotlin.b.b(obj2);
                    list = list3;
                    v20Var = v20Var2;
                }
                charSequence = (CharSequence) obj2;
                z20Var = v20Var.a;
                if (z20Var != null || (formattedText2 = z20Var.b) == null) {
                    charSequence2 = charSequence;
                    charSequence3 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$0 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$1 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$3 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$4 = charSequence2;
                    scootersPassMapper$mapToActivePassesInfo$1.L$5 = charSequence3;
                    scootersPassMapper$mapToActivePassesInfo$1.label = 3;
                    d = dVar.d(list, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
                    if (d != obj) {
                    }
                    return obj;
                }
                scootersPassMapper$mapToActivePassesInfo$1.L$0 = null;
                scootersPassMapper$mapToActivePassesInfo$1.L$1 = fefVar;
                scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
                scootersPassMapper$mapToActivePassesInfo$1.L$3 = list;
                scootersPassMapper$mapToActivePassesInfo$1.L$4 = charSequence;
                scootersPassMapper$mapToActivePassesInfo$1.label = 2;
                Object c = dVar.c(formattedText2, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
                if (c != obj) {
                    obj2 = c;
                    charSequence2 = charSequence;
                    List list4 = list;
                    fefVar2 = fefVar;
                    list2 = list4;
                    charSequence3 = (CharSequence) obj2;
                    fef fefVar32 = fefVar2;
                    list = list2;
                    fefVar = fefVar32;
                    scootersPassMapper$mapToActivePassesInfo$1.L$0 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$1 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$3 = null;
                    scootersPassMapper$mapToActivePassesInfo$1.L$4 = charSequence2;
                    scootersPassMapper$mapToActivePassesInfo$1.L$5 = charSequence3;
                    scootersPassMapper$mapToActivePassesInfo$1.label = 3;
                    d = dVar.d(list, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
                    if (d != obj) {
                    }
                }
                return obj;
            }
        }
        scootersPassMapper$mapToActivePassesInfo$1 = new ScootersPassMapper$mapToActivePassesInfo$1(dVar, continuationImpl);
        Object obj22 = scootersPassMapper$mapToActivePassesInfo$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassMapper$mapToActivePassesInfo$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj22;
        z20Var = v20Var.a;
        if (z20Var != null) {
        }
        charSequence2 = charSequence;
        charSequence3 = null;
        scootersPassMapper$mapToActivePassesInfo$1.L$0 = null;
        scootersPassMapper$mapToActivePassesInfo$1.L$1 = null;
        scootersPassMapper$mapToActivePassesInfo$1.L$2 = null;
        scootersPassMapper$mapToActivePassesInfo$1.L$3 = null;
        scootersPassMapper$mapToActivePassesInfo$1.L$4 = charSequence2;
        scootersPassMapper$mapToActivePassesInfo$1.L$5 = charSequence3;
        scootersPassMapper$mapToActivePassesInfo$1.label = 3;
        d = dVar.d(list, fefVar, scootersPassMapper$mapToActivePassesInfo$1);
        if (d != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, b4o.a aVar, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersPassMapper$mapToEntranceBadge$1 scootersPassMapper$mapToEntranceBadge$1;
        int i;
        String str;
        kdc b;
        dVar.getClass();
        if (continuationImpl instanceof ScootersPassMapper$mapToEntranceBadge$1) {
            scootersPassMapper$mapToEntranceBadge$1 = (ScootersPassMapper$mapToEntranceBadge$1) continuationImpl;
            int i2 = scootersPassMapper$mapToEntranceBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassMapper$mapToEntranceBadge$1.label = i2 - Integer.MIN_VALUE;
                ScootersPassMapper$mapToEntranceBadge$1 scootersPassMapper$mapToEntranceBadge$12 = scootersPassMapper$mapToEntranceBadge$1;
                Object obj = scootersPassMapper$mapToEntranceBadge$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassMapper$mapToEntranceBadge$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = aVar.a;
                    str = aVar.b;
                    if (formattedText != null && str != null) {
                        ru.yandex.taxi.widget.c cVar = dVar.g;
                        FormattedText c = f9s.c(dVar.c, fefVar, formattedText);
                        scootersPassMapper$mapToEntranceBadge$12.L$0 = null;
                        scootersPassMapper$mapToEntranceBadge$12.L$1 = null;
                        scootersPassMapper$mapToEntranceBadge$12.L$2 = null;
                        scootersPassMapper$mapToEntranceBadge$12.L$3 = str;
                        scootersPassMapper$mapToEntranceBadge$12.label = 1;
                        obj = ru.yandex.taxi.widget.c.e(cVar, c, null, false, scootersPassMapper$mapToEntranceBadge$12, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) scootersPassMapper$mapToEntranceBadge$12.L$3;
                kotlin.b.b(obj);
                CharSequence charSequence = (CharSequence) obj;
                b = ((ufu) dVar.b).b(str);
                if (b != null) {
                    return new a3o(charSequence, b);
                }
                return null;
            }
        }
        scootersPassMapper$mapToEntranceBadge$1 = new ScootersPassMapper$mapToEntranceBadge$1(dVar, continuationImpl);
        ScootersPassMapper$mapToEntranceBadge$1 scootersPassMapper$mapToEntranceBadge$122 = scootersPassMapper$mapToEntranceBadge$1;
        Object obj2 = scootersPassMapper$mapToEntranceBadge$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassMapper$mapToEntranceBadge$122.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        b = ((ufu) dVar.b).b(str);
        if (b != null) {
        }
        return null;
    }

    public final Object c(FormattedText formattedText, fef fefVar, Continuation continuation) {
        return ru.yandex.taxi.widget.c.e(this.g, f9s.c(this.c, fefVar, formattedText), null, false, continuation, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01ab -> B:12:0x01b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersPassMapper$mapToActivePass$1 scootersPassMapper$mapToActivePass$1;
        int i;
        Collection arrayList;
        Iterator it;
        fef fefVar2;
        fef fefVar3;
        Collection collection;
        Iterator it2;
        s20 s20Var;
        String str;
        CharSequence charSequence;
        Collection collection2;
        boolean z;
        k6a0 k6a0Var;
        o20 o20Var;
        k6a0 k6a0Var2;
        Object c;
        Collection collection3;
        String str2;
        Object c2;
        if (continuationImpl instanceof ScootersPassMapper$mapToActivePass$1) {
            scootersPassMapper$mapToActivePass$1 = (ScootersPassMapper$mapToActivePass$1) continuationImpl;
            int i2 = scootersPassMapper$mapToActivePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassMapper$mapToActivePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassMapper$mapToActivePass$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassMapper$mapToActivePass$1.label;
                int i3 = 2;
                int i4 = 1;
                k6a0 k6a0Var3 = null;
                if (i == 0) {
                    if (i == 1) {
                        arrayList = (Collection) scootersPassMapper$mapToActivePass$1.L$9;
                        str2 = (String) scootersPassMapper$mapToActivePass$1.L$8;
                        s20 s20Var2 = (s20) scootersPassMapper$mapToActivePass$1.L$7;
                        it = (Iterator) scootersPassMapper$mapToActivePass$1.L$5;
                        collection3 = (Collection) scootersPassMapper$mapToActivePass$1.L$4;
                        fef fefVar4 = (fef) scootersPassMapper$mapToActivePass$1.L$1;
                        kotlin.b.b(obj);
                        fefVar3 = fefVar4;
                        s20Var = s20Var2;
                        CharSequence charSequence2 = (CharSequence) obj;
                        boolean l = jl40.l(s20Var.b, Boolean.TRUE);
                        FormattedText formattedText = s20Var.e;
                        scootersPassMapper$mapToActivePass$1.L$0 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$1 = fefVar3;
                        scootersPassMapper$mapToActivePass$1.L$2 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$3 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$4 = collection3;
                        scootersPassMapper$mapToActivePass$1.L$5 = it;
                        scootersPassMapper$mapToActivePass$1.L$6 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$7 = s20Var;
                        scootersPassMapper$mapToActivePass$1.L$8 = str2;
                        scootersPassMapper$mapToActivePass$1.L$9 = charSequence2;
                        scootersPassMapper$mapToActivePass$1.L$10 = arrayList;
                        scootersPassMapper$mapToActivePass$1.Z$0 = l;
                        scootersPassMapper$mapToActivePass$1.label = i3;
                        c2 = c(formattedText, fefVar3, scootersPassMapper$mapToActivePass$1);
                        if (c2 != obj2) {
                        }
                        return obj2;
                    }
                    if (i == 2) {
                        z = scootersPassMapper$mapToActivePass$1.Z$0;
                        collection2 = (Collection) scootersPassMapper$mapToActivePass$1.L$10;
                        charSequence = (CharSequence) scootersPassMapper$mapToActivePass$1.L$9;
                        str = (String) scootersPassMapper$mapToActivePass$1.L$8;
                        s20Var = (s20) scootersPassMapper$mapToActivePass$1.L$7;
                        it2 = (Iterator) scootersPassMapper$mapToActivePass$1.L$5;
                        collection = (Collection) scootersPassMapper$mapToActivePass$1.L$4;
                        fefVar3 = (fef) scootersPassMapper$mapToActivePass$1.L$1;
                        kotlin.b.b(obj);
                        CharSequence charSequence3 = (CharSequence) obj;
                        int i5 = s20Var.f;
                        k6a0Var = s20Var.h;
                        if (k6a0Var != null) {
                        }
                        o20Var = null;
                        Boolean bool = s20Var.c;
                        FormattedText formattedText2 = s20Var.g;
                        k6a0Var2 = null;
                        scootersPassMapper$mapToActivePass$1.L$0 = null;
                        scootersPassMapper$mapToActivePass$1.L$1 = fefVar3;
                        scootersPassMapper$mapToActivePass$1.L$2 = null;
                        scootersPassMapper$mapToActivePass$1.L$3 = null;
                        scootersPassMapper$mapToActivePass$1.L$4 = collection;
                        scootersPassMapper$mapToActivePass$1.L$5 = it2;
                        scootersPassMapper$mapToActivePass$1.L$6 = null;
                        scootersPassMapper$mapToActivePass$1.L$7 = null;
                        scootersPassMapper$mapToActivePass$1.L$8 = str;
                        scootersPassMapper$mapToActivePass$1.L$9 = charSequence;
                        scootersPassMapper$mapToActivePass$1.L$10 = charSequence3;
                        scootersPassMapper$mapToActivePass$1.L$11 = bool;
                        scootersPassMapper$mapToActivePass$1.L$12 = o20Var;
                        scootersPassMapper$mapToActivePass$1.L$13 = collection2;
                        scootersPassMapper$mapToActivePass$1.Z$0 = z;
                        scootersPassMapper$mapToActivePass$1.I$0 = i5;
                        scootersPassMapper$mapToActivePass$1.label = 3;
                        c = c(formattedText2, fefVar3, scootersPassMapper$mapToActivePass$1);
                        if (c != obj2) {
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = scootersPassMapper$mapToActivePass$1.I$0;
                    collection2 = (Collection) scootersPassMapper$mapToActivePass$1.L$13;
                    CharSequence charSequence4 = (CharSequence) scootersPassMapper$mapToActivePass$1.L$10;
                    CharSequence charSequence5 = (CharSequence) scootersPassMapper$mapToActivePass$1.L$9;
                    Iterator it3 = (Iterator) scootersPassMapper$mapToActivePass$1.L$5;
                    Collection collection4 = (Collection) scootersPassMapper$mapToActivePass$1.L$4;
                    fef fefVar5 = (fef) scootersPassMapper$mapToActivePass$1.L$1;
                    kotlin.b.b(obj);
                    Iterator it4 = it3;
                    k6a0Var2 = null;
                    collection2.add(new p20(charSequence5, charSequence4, i6));
                    it = it4;
                    k6a0Var3 = k6a0Var2;
                    arrayList = collection4;
                    fefVar2 = fefVar5;
                    i3 = 2;
                    i4 = 1;
                    if (!it.hasNext()) {
                        return (List) arrayList;
                    }
                    s20 s20Var3 = (s20) it.next();
                    String str3 = s20Var3.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    FormattedText formattedText3 = s20Var3.d;
                    scootersPassMapper$mapToActivePass$1.L$0 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$1 = fefVar2;
                    scootersPassMapper$mapToActivePass$1.L$2 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$3 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$4 = arrayList;
                    scootersPassMapper$mapToActivePass$1.L$5 = it;
                    scootersPassMapper$mapToActivePass$1.L$6 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$7 = s20Var3;
                    scootersPassMapper$mapToActivePass$1.L$8 = str3;
                    scootersPassMapper$mapToActivePass$1.L$9 = arrayList;
                    scootersPassMapper$mapToActivePass$1.L$10 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$11 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$12 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.L$13 = k6a0Var3;
                    scootersPassMapper$mapToActivePass$1.label = i4;
                    Object c3 = c(formattedText3, fefVar2, scootersPassMapper$mapToActivePass$1);
                    if (c3 != obj2) {
                        fefVar3 = fefVar2;
                        s20Var = s20Var3;
                        str2 = str3;
                        obj = c3;
                        collection3 = arrayList;
                        CharSequence charSequence22 = (CharSequence) obj;
                        boolean l2 = jl40.l(s20Var.b, Boolean.TRUE);
                        FormattedText formattedText4 = s20Var.e;
                        scootersPassMapper$mapToActivePass$1.L$0 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$1 = fefVar3;
                        scootersPassMapper$mapToActivePass$1.L$2 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$3 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$4 = collection3;
                        scootersPassMapper$mapToActivePass$1.L$5 = it;
                        scootersPassMapper$mapToActivePass$1.L$6 = k6a0Var3;
                        scootersPassMapper$mapToActivePass$1.L$7 = s20Var;
                        scootersPassMapper$mapToActivePass$1.L$8 = str2;
                        scootersPassMapper$mapToActivePass$1.L$9 = charSequence22;
                        scootersPassMapper$mapToActivePass$1.L$10 = arrayList;
                        scootersPassMapper$mapToActivePass$1.Z$0 = l2;
                        scootersPassMapper$mapToActivePass$1.label = i3;
                        c2 = c(formattedText4, fefVar3, scootersPassMapper$mapToActivePass$1);
                        if (c2 != obj2) {
                            Iterator it5 = it;
                            charSequence = charSequence22;
                            obj = c2;
                            it2 = it5;
                            collection2 = arrayList;
                            z = l2;
                            collection = collection3;
                            str = str2;
                            CharSequence charSequence32 = (CharSequence) obj;
                            int i52 = s20Var.f;
                            k6a0Var = s20Var.h;
                            if (k6a0Var != null) {
                                String str4 = k6a0Var.a;
                                if (str4 == null || str4.length() == 0) {
                                    k6a0Var = k6a0Var3;
                                }
                                if (k6a0Var != null) {
                                    jl40.l(k6a0Var.b, Boolean.TRUE);
                                    o20Var = new o20();
                                    Boolean bool2 = s20Var.c;
                                    FormattedText formattedText22 = s20Var.g;
                                    k6a0Var2 = null;
                                    scootersPassMapper$mapToActivePass$1.L$0 = null;
                                    scootersPassMapper$mapToActivePass$1.L$1 = fefVar3;
                                    scootersPassMapper$mapToActivePass$1.L$2 = null;
                                    scootersPassMapper$mapToActivePass$1.L$3 = null;
                                    scootersPassMapper$mapToActivePass$1.L$4 = collection;
                                    scootersPassMapper$mapToActivePass$1.L$5 = it2;
                                    scootersPassMapper$mapToActivePass$1.L$6 = null;
                                    scootersPassMapper$mapToActivePass$1.L$7 = null;
                                    scootersPassMapper$mapToActivePass$1.L$8 = str;
                                    scootersPassMapper$mapToActivePass$1.L$9 = charSequence;
                                    scootersPassMapper$mapToActivePass$1.L$10 = charSequence32;
                                    scootersPassMapper$mapToActivePass$1.L$11 = bool2;
                                    scootersPassMapper$mapToActivePass$1.L$12 = o20Var;
                                    scootersPassMapper$mapToActivePass$1.L$13 = collection2;
                                    scootersPassMapper$mapToActivePass$1.Z$0 = z;
                                    scootersPassMapper$mapToActivePass$1.I$0 = i52;
                                    scootersPassMapper$mapToActivePass$1.label = 3;
                                    c = c(formattedText22, fefVar3, scootersPassMapper$mapToActivePass$1);
                                    if (c != obj2) {
                                        charSequence5 = charSequence;
                                        charSequence4 = charSequence32;
                                        obj = c;
                                        i6 = i52;
                                        it4 = it2;
                                        collection4 = collection;
                                        fefVar5 = fefVar3;
                                        collection2.add(new p20(charSequence5, charSequence4, i6));
                                        it = it4;
                                        k6a0Var3 = k6a0Var2;
                                        arrayList = collection4;
                                        fefVar2 = fefVar5;
                                        i3 = 2;
                                        i4 = 1;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            }
                            o20Var = null;
                            Boolean bool22 = s20Var.c;
                            FormattedText formattedText222 = s20Var.g;
                            k6a0Var2 = null;
                            scootersPassMapper$mapToActivePass$1.L$0 = null;
                            scootersPassMapper$mapToActivePass$1.L$1 = fefVar3;
                            scootersPassMapper$mapToActivePass$1.L$2 = null;
                            scootersPassMapper$mapToActivePass$1.L$3 = null;
                            scootersPassMapper$mapToActivePass$1.L$4 = collection;
                            scootersPassMapper$mapToActivePass$1.L$5 = it2;
                            scootersPassMapper$mapToActivePass$1.L$6 = null;
                            scootersPassMapper$mapToActivePass$1.L$7 = null;
                            scootersPassMapper$mapToActivePass$1.L$8 = str;
                            scootersPassMapper$mapToActivePass$1.L$9 = charSequence;
                            scootersPassMapper$mapToActivePass$1.L$10 = charSequence32;
                            scootersPassMapper$mapToActivePass$1.L$11 = bool22;
                            scootersPassMapper$mapToActivePass$1.L$12 = o20Var;
                            scootersPassMapper$mapToActivePass$1.L$13 = collection2;
                            scootersPassMapper$mapToActivePass$1.Z$0 = z;
                            scootersPassMapper$mapToActivePass$1.I$0 = i52;
                            scootersPassMapper$mapToActivePass$1.label = 3;
                            c = c(formattedText222, fefVar3, scootersPassMapper$mapToActivePass$1);
                            if (c != obj2) {
                            }
                        }
                    }
                    return obj2;
                }
                kotlin.b.b(obj);
                List list2 = list;
                arrayList = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                fefVar2 = fefVar;
                if (!it.hasNext()) {
                }
            }
        }
        scootersPassMapper$mapToActivePass$1 = new ScootersPassMapper$mapToActivePass$1(this, continuationImpl);
        Object obj3 = scootersPassMapper$mapToActivePass$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassMapper$mapToActivePass$1.label;
        int i32 = 2;
        int i42 = 1;
        k6a0 k6a0Var32 = null;
        if (i == 0) {
        }
    }

    public final Object e(fef fefVar, tl90 tl90Var, boolean z, ContinuationImpl continuationImpl) {
        if (tl90Var == null) {
            return null;
        }
        g590 g590Var = tl90Var.a;
        i8w0 i8w0Var = tl90Var.b;
        this.a.getClass();
        return tje.k0(uyj.a, new ScootersPassMapper$mapToScootersPass$2(g590Var, this, fefVar, i8w0Var, tl90Var, z, null), continuationImpl);
    }
}
