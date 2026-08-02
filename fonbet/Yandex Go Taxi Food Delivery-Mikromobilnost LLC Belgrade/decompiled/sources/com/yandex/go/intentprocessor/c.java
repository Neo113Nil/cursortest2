package com.yandex.go.intentprocessor;

import android.content.Intent;
import android.net.Uri;
import defpackage.cpw0;
import defpackage.evu0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ng60;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.og21;
import defpackage.qni0;
import defpackage.rww0;
import defpackage.t61;
import defpackage.x7w;
import defpackage.zf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final Set a;
    public final rww0 b;
    public final qni0 c;
    public final ng60 d;
    public final l e;
    public final cpw0 f;

    public c(Set set, rww0 rww0Var, qni0 qni0Var, ng60 ng60Var, l lVar, cpw0 cpw0Var) {
        this.a = set;
        this.b = rww0Var;
        this.c = qni0Var;
        this.d = ng60Var;
        this.e = lVar;
        this.f = cpw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x016a -> B:10:0x0170). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, ContinuationImpl continuationImpl) {
        IntentQueueInteractor$processIntent$1 intentQueueInteractor$processIntent$1;
        int i;
        boolean z;
        Iterator it;
        oep0 oep0Var2;
        String query;
        Intent intent2 = intent;
        if (continuationImpl instanceof IntentQueueInteractor$processIntent$1) {
            intentQueueInteractor$processIntent$1 = (IntentQueueInteractor$processIntent$1) continuationImpl;
            int i2 = intentQueueInteractor$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intentQueueInteractor$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intentQueueInteractor$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intentQueueInteractor$processIntent$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.a(intent2);
                    this.b.a(intent2);
                    Uri data = intent2.getData();
                    qni0 qni0Var = this.c;
                    qni0Var.getClass();
                    if (data == null || (query = data.getQuery()) == null || !(evu0.y(query, "utm_source", false) || evu0.y(query, "utm_medium", false) || evu0.y(query, "ref", false))) {
                        z = true;
                    } else {
                        String a = og21.a(data, "utm_source");
                        String a2 = og21.a(data, "utm_medium");
                        String a3 = og21.a(data, "ref");
                        zf zfVar = qni0Var.a;
                        String str2 = (a == null || a.length() == 0) ? null : a;
                        if (a2 != null && a2.length() != 0) {
                            str = a2;
                        }
                        String str3 = (a3 == null || a3.length() == 0) ? null : a3;
                        zfVar.getClass();
                        HashMap hashMap = new HashMap();
                        if (str3 != null) {
                            hashMap.put("ref", str3);
                        }
                        if (str != null) {
                            hashMap.put("utm_medium", str);
                        }
                        if (str2 != null) {
                            hashMap.put("utm_source", str2);
                        }
                        zfVar.a.a("application.open-by-urlscheme", hashMap, 1, new HashMap());
                        if (((a == null || a.length() == 0) && (a2 == null || a2.length() == 0)) || !(a3 == null || evu0.J(a3))) {
                            z = true;
                        } else {
                            t61 t61Var = qni0Var.b;
                            t61Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            if (a3 != null) {
                                hashMap2.put("ref", a3);
                            }
                            if (a2 != null) {
                                hashMap2.put("utm_medium", a2);
                            }
                            if (a != null) {
                                hashMap2.put("utm_source", a);
                            }
                            z = true;
                            t61Var.a.a("application.open-by-urlscheme-without-ref", hashMap2, 1, new HashMap());
                        }
                    }
                    boolean booleanExtra = intent2.getBooleanExtra("ru.yandex.taxi.activity.MainActivity.SURGE_FAKE_PIN", false);
                    cpw0 cpw0Var = this.f;
                    if (booleanExtra) {
                        cpw0Var.a = z;
                    } else {
                        cpw0Var.a = false;
                    }
                    it = kotlin.collections.a.m0(this.a, Collections.singletonList(this.e)).iterator();
                    oep0Var2 = oep0Var;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) intentQueueInteractor$processIntent$1.L$3;
                    intent2 = (Intent) intentQueueInteractor$processIntent$1.L$1;
                    oep0 oep0Var3 = (oep0) intentQueueInteractor$processIntent$1.L$0;
                    kotlin.b.b(obj);
                    IntentQueueInteractor$processIntent$1 intentQueueInteractor$processIntent$12 = intentQueueInteractor$processIntent$1;
                    Iterator it3 = it2;
                    oep0Var2 = oep0Var3;
                    IntentQueueInteractor$processIntent$1 intentQueueInteractor$processIntent$13 = intentQueueInteractor$processIntent$12;
                    o5u o5uVar = (o5u) obj;
                    if (!(o5uVar instanceof m5u)) {
                        return o5uVar;
                    }
                    it = it3;
                    intentQueueInteractor$processIntent$1 = intentQueueInteractor$processIntent$13;
                    if (it.hasNext()) {
                        return n5u.a;
                    }
                    IntentQueueInteractor$Companion$processIntent$1 intentQueueInteractor$Companion$processIntent$1 = new IntentQueueInteractor$Companion$processIntent$1((x7w) it.next(), null);
                    intentQueueInteractor$processIntent$1.L$0 = oep0Var2;
                    intentQueueInteractor$processIntent$1.L$1 = intent2;
                    intentQueueInteractor$processIntent$1.L$2 = null;
                    intentQueueInteractor$processIntent$1.L$3 = it;
                    intentQueueInteractor$processIntent$1.L$4 = null;
                    intentQueueInteractor$processIntent$1.L$5 = null;
                    intentQueueInteractor$processIntent$1.label = 1;
                    Object invoke = intentQueueInteractor$Companion$processIntent$1.invoke(oep0Var2, intent2, intentQueueInteractor$processIntent$1);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    IntentQueueInteractor$processIntent$1 intentQueueInteractor$processIntent$14 = intentQueueInteractor$processIntent$1;
                    it3 = it;
                    obj = invoke;
                    intentQueueInteractor$processIntent$13 = intentQueueInteractor$processIntent$14;
                    o5u o5uVar2 = (o5u) obj;
                    if (!(o5uVar2 instanceof m5u)) {
                    }
                }
            }
        }
        intentQueueInteractor$processIntent$1 = new IntentQueueInteractor$processIntent$1(this, continuationImpl);
        Object obj2 = intentQueueInteractor$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intentQueueInteractor$processIntent$1.label;
        String str4 = null;
        if (i != 0) {
        }
    }
}
