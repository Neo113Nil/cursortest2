package com.yandex.go.sharing_personal_goals;

import defpackage.crr0;
import defpackage.fcb1;
import defpackage.jl40;
import defpackage.jrr0;
import defpackage.krr0;
import defpackage.msr0;
import defpackage.mvg;
import defpackage.nsr0;
import defpackage.ny61;
import defpackage.osr0;
import defpackage.tcc;
import defpackage.tqr0;
import defpackage.uqr0;
import defpackage.vqr0;
import defpackage.w511;
import defpackage.wqr0;
import defpackage.xqr0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkrr0;", "sharingPersonalGoals", "", "selectedGoalId", "Lpsr0;", "<anonymous>", "(Lkrr0;Ljava/lang/String;)Lpsr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.SharingPersonalGoalsUiStateInteractor$uiStateFlow$1", f = "SharingPersonalGoalsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharingPersonalGoalsUiStateInteractor$uiStateFlow$1 sharingPersonalGoalsUiStateInteractor$uiStateFlow$1 = new SharingPersonalGoalsUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        sharingPersonalGoalsUiStateInteractor$uiStateFlow$1.L$0 = (krr0) obj;
        sharingPersonalGoalsUiStateInteractor$uiStateFlow$1.L$1 = (String) obj2;
        return sharingPersonalGoalsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterator it;
        String str2;
        Iterator it2;
        jrr0 jrr0Var;
        jrr0 jrr0Var2;
        krr0 krr0Var = (krr0) this.L$0;
        String str3 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (krr0Var == null) {
            return null;
        }
        List list = krr0Var.b;
        List list2 = krr0Var.c;
        CharSequence charSequence = krr0Var.a;
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (obj2 instanceof tqr0) {
                arrayList.add(obj2);
            }
        }
        if (str3 != null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (jl40.l(((tqr0) it3.next()).a, str3)) {
                        break;
                    }
                }
            }
            str3 = null;
        }
        tqr0 tqr0Var = (tqr0) kotlin.collections.a.R(arrayList);
        if (tqr0Var != null) {
            str3 = tqr0Var.a;
            str = str3;
            ArrayList arrayList2 = new ArrayList();
            it = list3.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!arrayList.isEmpty()) {
                        String obj3 = charSequence != null ? charSequence.toString() : null;
                        str2 = obj3 != null ? obj3 : "";
                        List list4 = list2;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(fcb1.c((crr0) it4.next()));
                        }
                        CharSequence charSequence2 = krr0Var.d;
                        return new msr0(str2, arrayList2, str, arrayList3, charSequence2 != null ? charSequence2.toString() : null);
                    }
                    boolean z = list3 instanceof Collection;
                    if (!z || !list3.isEmpty()) {
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            if (((xqr0) it5.next()) instanceof vqr0) {
                                String obj4 = charSequence != null ? charSequence.toString() : null;
                                str2 = obj4 != null ? obj4 : "";
                                List list5 = list2;
                                ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                                Iterator it6 = list5.iterator();
                                while (it6.hasNext()) {
                                    arrayList4.add(fcb1.c((crr0) it6.next()));
                                }
                                return new osr0(8, str2, arrayList2, arrayList4);
                            }
                        }
                    }
                    if (!z || !list3.isEmpty()) {
                        Iterator it7 = list3.iterator();
                        while (it7.hasNext()) {
                            if (((xqr0) it7.next()) instanceof uqr0) {
                                String obj5 = charSequence != null ? charSequence.toString() : null;
                                str2 = obj5 != null ? obj5 : "";
                                List list6 = list2;
                                ArrayList arrayList5 = new ArrayList(tcc.n(list6, 10));
                                Iterator it8 = list6.iterator();
                                while (it8.hasNext()) {
                                    arrayList5.add(fcb1.c((crr0) it8.next()));
                                }
                                return new nsr0(8, str2, arrayList2, arrayList5);
                            }
                        }
                    }
                    String obj6 = charSequence != null ? charSequence.toString() : null;
                    str2 = obj6 != null ? obj6 : "";
                    List list7 = list2;
                    ArrayList arrayList6 = new ArrayList(tcc.n(list7, 10));
                    Iterator it9 = list7.iterator();
                    while (it9.hasNext()) {
                        arrayList6.add(fcb1.c((crr0) it9.next()));
                    }
                    return new msr0(26, str2, arrayList6);
                }
                xqr0 xqr0Var = (xqr0) it.next();
                if (xqr0Var instanceof tqr0) {
                    tqr0 tqr0Var2 = (tqr0) xqr0Var;
                    String str4 = tqr0Var2.a;
                    String obj7 = tqr0Var2.b.toString();
                    CharSequence charSequence3 = tqr0Var2.c;
                    String obj8 = charSequence3 != null ? charSequence3.toString() : null;
                    String str5 = obj8 == null ? "" : obj8;
                    CharSequence charSequence4 = tqr0Var2.h;
                    it2 = it;
                    jrr0Var = new jrr0(str4, obj7, str5, charSequence4 != null ? charSequence4.toString() : null, tqr0Var2.f, tqr0Var2.g, tqr0Var2.d, tqr0Var2.e, jl40.l(tqr0Var2.a, str), true, SharingPersonalGoalsProgressStyle.SUCCESS);
                } else {
                    it2 = it;
                    if (xqr0Var instanceof vqr0) {
                        vqr0 vqr0Var = (vqr0) xqr0Var;
                        String str6 = vqr0Var.a;
                        String obj9 = vqr0Var.b.toString();
                        CharSequence charSequence5 = vqr0Var.c;
                        String obj10 = charSequence5 != null ? charSequence5.toString() : null;
                        String str7 = obj10 == null ? "" : obj10;
                        CharSequence charSequence6 = vqr0Var.h;
                        jrr0Var2 = new jrr0(str6, obj9, str7, charSequence6 != null ? charSequence6.toString() : null, vqr0Var.f, vqr0Var.g, vqr0Var.d, vqr0Var.e, SharingPersonalGoalsProgressStyle.SUCCESS);
                    } else if (xqr0Var instanceof uqr0) {
                        uqr0 uqr0Var = (uqr0) xqr0Var;
                        String str8 = uqr0Var.a;
                        String obj11 = uqr0Var.b.toString();
                        CharSequence charSequence7 = uqr0Var.c;
                        String obj12 = charSequence7 != null ? charSequence7.toString() : null;
                        String str9 = obj12 == null ? "" : obj12;
                        CharSequence charSequence8 = uqr0Var.h;
                        jrr0Var2 = new jrr0(str8, obj11, str9, charSequence8 != null ? charSequence8.toString() : null, uqr0Var.f, uqr0Var.g, uqr0Var.d, uqr0Var.e, SharingPersonalGoalsProgressStyle.SUCCESS);
                    } else {
                        if (!jl40.l(xqr0Var, wqr0.a)) {
                            w511.b();
                            return null;
                        }
                        jrr0Var = null;
                    }
                    jrr0Var = jrr0Var2;
                }
                if (jrr0Var != null) {
                    arrayList2.add(jrr0Var);
                }
                it = it2;
            }
        } else {
            str = null;
            ArrayList arrayList22 = new ArrayList();
            it = list3.iterator();
            while (true) {
                if (it.hasNext()) {
                }
                it = it2;
            }
        }
    }
}
