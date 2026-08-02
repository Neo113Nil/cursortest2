package com.yandex.go.agreement.interactor;

import android.os.SystemClock;
import com.yandex.go.agreement.api.AcceptanceChangeSource;
import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import com.yandex.go.agreement.trackable.repository.b;
import defpackage.bd;
import defpackage.bk1;
import defpackage.cd;
import defpackage.cne0;
import defpackage.dd;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.of;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zj1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.c;

/* loaded from: classes.dex */
public final class a implements bk1 {
    public final zj1 a;
    public final of b;
    public final b c;

    public a(zj1 zj1Var, of ofVar, b bVar) {
        this.a = zj1Var;
        this.b = ofVar;
        this.c = bVar;
    }

    public final void a(dd ddVar) {
        of ofVar = this.b;
        if (ofVar.a.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES").contains(ddVar.a())) {
            return;
        }
        cne0 cne0Var = ofVar.a;
        HashSet hashSet = new HashSet(cne0Var.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES"));
        hashSet.add(ddVar.a());
        cne0Var.t("ru.yandex.taxi.gdpr.NEED_SEND_TYPES", hashSet);
        d(ddVar);
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Set set, ContinuationImpl continuationImpl) {
        AgreementInteractorImpl$getAllAcceptancesToSend$1 agreementInteractorImpl$getAllAcceptancesToSend$1;
        int i;
        Set M0;
        Set set2;
        if (continuationImpl instanceof AgreementInteractorImpl$getAllAcceptancesToSend$1) {
            agreementInteractorImpl$getAllAcceptancesToSend$1 = (AgreementInteractorImpl$getAllAcceptancesToSend$1) continuationImpl;
            int i2 = agreementInteractorImpl$getAllAcceptancesToSend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementInteractorImpl$getAllAcceptancesToSend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementInteractorImpl$getAllAcceptancesToSend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementInteractorImpl$getAllAcceptancesToSend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set set3 = set;
                    ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                    Iterator it = set3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CachedTrackableAcceptance((String) it.next(), 14));
                    }
                    M0 = kotlin.collections.a.M0(arrayList);
                    agreementInteractorImpl$getAllAcceptancesToSend$1.L$0 = null;
                    agreementInteractorImpl$getAllAcceptancesToSend$1.L$1 = M0;
                    agreementInteractorImpl$getAllAcceptancesToSend$1.L$2 = null;
                    agreementInteractorImpl$getAllAcceptancesToSend$1.L$3 = M0;
                    agreementInteractorImpl$getAllAcceptancesToSend$1.label = 1;
                    obj = this.c.c(agreementInteractorImpl$getAllAcceptancesToSend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set2 = M0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set2 = (Set) agreementInteractorImpl$getAllAcceptancesToSend$1.L$3;
                    M0 = (Set) agreementInteractorImpl$getAllAcceptancesToSend$1.L$1;
                    kotlin.b.b(obj);
                }
                set2.addAll((Collection) obj);
                return M0;
            }
        }
        agreementInteractorImpl$getAllAcceptancesToSend$1 = new AgreementInteractorImpl$getAllAcceptancesToSend$1(this, continuationImpl);
        Object obj2 = agreementInteractorImpl$getAllAcceptancesToSend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementInteractorImpl$getAllAcceptancesToSend$1.label;
        if (i != 0) {
        }
        set2.addAll((Collection) obj2);
        return M0;
    }

    public final void c() {
        List<dd> a = this.b.a();
        c cVar = this.a.a;
        if (a.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (dd ddVar : a) {
            if (ddVar instanceof bd) {
                String str = ((bd) ddVar).h;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            } else if (!(ddVar instanceof cd)) {
                w511.b();
                return;
            } else {
                String d = ((cd) ddVar).d();
                if (d != null) {
                    linkedHashSet2.add(d);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            cVar.a((String) it.next());
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            cVar.a((String) it2.next());
        }
    }

    public final void d(dd ddVar) {
        of ofVar = this.b;
        List a = ofVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (!jl40.l((dd) obj, ddVar)) {
                arrayList.add(obj);
            }
        }
        ofVar.b(arrayList, AcceptanceChangeSource.USER_ACTION);
    }

    public final void e(ArrayList arrayList, AcceptanceChangeSource acceptanceChangeSource) {
        Object obj;
        ArrayList arrayList2 = new ArrayList(arrayList);
        of ofVar = this.b;
        List<dd> a = ofVar.a();
        ConcurrentHashMap concurrentHashMap = ofVar.d;
        for (dd ddVar : a) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(ddVar, (dd) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                arrayList2.add(ddVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dd ddVar2 = (dd) it2.next();
            Long l = (Long) concurrentHashMap.get(ddVar2.a());
            if (l != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                if (ddVar2 instanceof bd) {
                    if (elapsedRealtime <= ((bd) ddVar2).i) {
                        arrayList2.remove(ddVar2);
                    }
                } else if (!(ddVar2 instanceof cd)) {
                    w511.b();
                    return;
                }
                concurrentHashMap.remove(ddVar2.a());
            } else if (ofVar.a.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES").contains(ddVar2.a())) {
                arrayList2.remove(ddVar2);
            }
        }
        ofVar.b(arrayList2, acceptanceChangeSource);
        c();
    }
}
