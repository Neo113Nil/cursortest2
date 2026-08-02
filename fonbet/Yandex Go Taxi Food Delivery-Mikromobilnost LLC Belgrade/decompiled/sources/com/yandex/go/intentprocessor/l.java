package com.yandex.go.intentprocessor;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.yb.domain.x;
import com.yandex.go.yb.domain.y;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cxq0;
import defpackage.dms;
import defpackage.dq0;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.ha1;
import defpackage.ic20;
import defpackage.j18;
import defpackage.jfb;
import defpackage.m5u;
import defpackage.mc20;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.q5z;
import defpackage.ri1;
import defpackage.v770;
import defpackage.vu2;
import defpackage.x7w;
import defpackage.z0h;
import defpackage.zls;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes.dex */
public final class l implements x7w {
    public final ru.yandex.taxi.deeplinks.f a;
    public final Set b;
    public final Set c;
    public final com.yandex.go.blockeduser.data.c d;
    public final y e;
    public final com.yandex.go.ypay.impl.a f;
    public final ha1 g;
    public final cxq0 h;
    public final d i;
    public final ru.yandex.taxi.deeplinks.b j;

    public l(ru.yandex.taxi.deeplinks.f fVar, Set set, Set set2, com.yandex.go.blockeduser.data.c cVar, y yVar, com.yandex.go.ypay.impl.a aVar, ha1 ha1Var, cxq0 cxq0Var, d dVar, ru.yandex.taxi.deeplinks.b bVar) {
        this.a = fVar;
        this.b = set;
        this.c = set2;
        this.d = cVar;
        this.e = yVar;
        this.f = aVar;
        this.g = ha1Var;
        this.h = cxq0Var;
        this.i = dVar;
        this.j = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x014a, code lost:
    
        if (r5 == r4) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x02c6, code lost:
    
        if (r2 == r4) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e4  */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, mc20] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x02c6 -> B:12:0x02c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x022b -> B:48:0x0230). Please report as a decompilation issue!!! */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        PriorityIntentHandlerImpl$processIntent$1 priorityIntentHandlerImpl$processIntent$1;
        int i;
        oep0 oep0Var2;
        Object s;
        Intent intent2;
        Intent intent3;
        oep0 oep0Var3;
        o5u o5uVar;
        Uri uri;
        v770 v770Var;
        Intent intent4;
        Iterator it;
        v770 v770Var2;
        oep0 oep0Var4;
        Intent intent5;
        Uri uri2;
        v770 v770Var3;
        o5u o5uVar2;
        Iterator it2;
        v770 v770Var4;
        DeeplinkSource deeplinkSource;
        PriorityIntentHandlerImpl$processIntent$1 priorityIntentHandlerImpl$processIntent$12;
        Uri uri3;
        Intent intent6 = intent;
        if (continuation instanceof PriorityIntentHandlerImpl$processIntent$1) {
            priorityIntentHandlerImpl$processIntent$1 = (PriorityIntentHandlerImpl$processIntent$1) continuation;
            int i2 = priorityIntentHandlerImpl$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priorityIntentHandlerImpl$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = priorityIntentHandlerImpl$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = priorityIntentHandlerImpl$processIntent$1.label;
                cxq0 cxq0Var = this.h;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (q5z.H(intent6)) {
                            oep0Var2 = oep0Var;
                            priorityIntentHandlerImpl$processIntent$1.L$0 = oep0Var2;
                            priorityIntentHandlerImpl$processIntent$1.L$1 = intent6;
                            priorityIntentHandlerImpl$processIntent$1.label = 1;
                            j18 j18Var = new j18(1, dvw.b(priorityIntentHandlerImpl$processIntent$1));
                            Ref$ObjectRef y = b64.y(j18Var);
                            ic20 ic20Var = new ic20(2, y);
                            cl7 cl7Var = new cl7(j18Var, ic20Var);
                            this.g.b(intent6, new dq0(8, new PriorityIntentHandlerImpl$processIntent$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0)));
                            y.element = mc20.w;
                            if (cl7Var.c()) {
                                ic20Var.invoke();
                            } else {
                                j18Var.w(new dx60(cl7Var, 3));
                            }
                            s = j18Var.s();
                            break;
                        }
                        return n5u.a;
                    case 1:
                        intent6 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$1;
                        oep0 oep0Var5 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        s = obj;
                        oep0Var2 = oep0Var5;
                        Intent intent7 = (Intent) s;
                        if (this.d.a()) {
                            return new m5u(false, false);
                        }
                        priorityIntentHandlerImpl$processIntent$1.L$0 = oep0Var2;
                        priorityIntentHandlerImpl$processIntent$1.L$1 = intent6;
                        priorityIntentHandlerImpl$processIntent$1.L$2 = intent7;
                        priorityIntentHandlerImpl$processIntent$1.label = 2;
                        Object c = this.j.c(intent6, priorityIntentHandlerImpl$processIntent$1);
                        if (c != coroutineSingletons) {
                            intent2 = intent6;
                            intent3 = intent7;
                            oep0Var3 = oep0Var2;
                            obj = c;
                            o5uVar = (o5u) obj;
                            if (!(o5uVar instanceof m5u)) {
                                return o5uVar;
                            }
                            Uri data = intent3.getData();
                            String stringExtra = intent2.getStringExtra("KEY_OPEN_REASON");
                            v770 v770Var5 = stringExtra == null ? v770.c : evu0.J(stringExtra) ? v770.b : new v770(stringExtra);
                            if (data != null) {
                                y yVar = this.e;
                                yVar.d.a.getClass();
                                if ((ExternalSchemesInteractor.a(data) || "yandex_bank".equalsIgnoreCase(data.getAuthority())) && !data.isOpaque()) {
                                    yVar.b.b(new x(yVar, data, v770Var5), Events$Zalogin$LoginContext.BANK);
                                    return new m5u(true, false);
                                }
                                priorityIntentHandlerImpl$processIntent$1.L$0 = oep0Var3;
                                priorityIntentHandlerImpl$processIntent$1.L$1 = intent2;
                                priorityIntentHandlerImpl$processIntent$1.L$2 = null;
                                priorityIntentHandlerImpl$processIntent$1.L$3 = data;
                                priorityIntentHandlerImpl$processIntent$1.L$4 = v770Var5;
                                priorityIntentHandlerImpl$processIntent$1.label = 3;
                                Boolean a = this.f.a(data);
                                if (a != coroutineSingletons) {
                                    Intent intent8 = intent2;
                                    uri = data;
                                    v770Var = v770Var5;
                                    obj = a;
                                    intent4 = intent8;
                                    if (!((Boolean) obj).booleanValue()) {
                                        if (this.a.c(uri)) {
                                            v770 v770Var6 = v770Var;
                                            it = this.b.iterator();
                                            if (!it.hasNext()) {
                                                zls a2 = ru.yandex.taxi.deeplinks.a.a((vu2) it.next());
                                                priorityIntentHandlerImpl$processIntent$1.L$0 = oep0Var3;
                                                priorityIntentHandlerImpl$processIntent$1.L$1 = intent4;
                                                priorityIntentHandlerImpl$processIntent$1.L$2 = null;
                                                priorityIntentHandlerImpl$processIntent$1.L$3 = uri;
                                                priorityIntentHandlerImpl$processIntent$1.L$4 = v770Var6;
                                                priorityIntentHandlerImpl$processIntent$1.L$5 = null;
                                                priorityIntentHandlerImpl$processIntent$1.L$6 = it;
                                                priorityIntentHandlerImpl$processIntent$1.L$7 = null;
                                                priorityIntentHandlerImpl$processIntent$1.L$8 = null;
                                                priorityIntentHandlerImpl$processIntent$1.label = 4;
                                                Object invoke = a2.invoke(oep0Var3, uri, priorityIntentHandlerImpl$processIntent$1);
                                                if (invoke != coroutineSingletons) {
                                                    oep0Var4 = oep0Var3;
                                                    intent5 = intent4;
                                                    uri2 = uri;
                                                    v770Var3 = v770Var6;
                                                    obj = invoke;
                                                    o5uVar2 = (o5u) obj;
                                                    if (!(o5uVar2 instanceof m5u)) {
                                                        return o5uVar2;
                                                    }
                                                    v770Var6 = v770Var3;
                                                    uri = uri2;
                                                    intent4 = intent5;
                                                    oep0Var3 = oep0Var4;
                                                    if (!it.hasNext()) {
                                                        priorityIntentHandlerImpl$processIntent$1.L$0 = oep0Var3;
                                                        priorityIntentHandlerImpl$processIntent$1.L$1 = intent4;
                                                        priorityIntentHandlerImpl$processIntent$1.L$2 = null;
                                                        priorityIntentHandlerImpl$processIntent$1.L$3 = uri;
                                                        priorityIntentHandlerImpl$processIntent$1.L$4 = v770Var6;
                                                        priorityIntentHandlerImpl$processIntent$1.L$5 = null;
                                                        priorityIntentHandlerImpl$processIntent$1.L$6 = null;
                                                        priorityIntentHandlerImpl$processIntent$1.L$7 = null;
                                                        priorityIntentHandlerImpl$processIntent$1.L$8 = null;
                                                        priorityIntentHandlerImpl$processIntent$1.label = 5;
                                                        Object b = this.i.b(uri, priorityIntentHandlerImpl$processIntent$1);
                                                        if (b != coroutineSingletons) {
                                                            v770 v770Var7 = v770Var6;
                                                            obj = b;
                                                            v770Var2 = v770Var7;
                                                            if (!((Boolean) obj).booleanValue()) {
                                                                return new m5u(true, false);
                                                            }
                                                            String authority = uri.getAuthority();
                                                            if (authority != null && !evu0.J(authority)) {
                                                                DeeplinkSource deeplinkSource2 = (DeeplinkSource) ffx.R(intent4, "deeplink_source", DeeplinkSource.class);
                                                                if (deeplinkSource2 == null) {
                                                                    deeplinkSource2 = DeeplinkSource.UNSPECIFIED;
                                                                }
                                                                it2 = this.c.iterator();
                                                                v770Var4 = v770Var2;
                                                                deeplinkSource = deeplinkSource2;
                                                                priorityIntentHandlerImpl$processIntent$12 = priorityIntentHandlerImpl$processIntent$1;
                                                                uri3 = uri;
                                                                if (it2.hasNext()) {
                                                                    dms b2 = ru.yandex.taxi.deeplinks.a.b((z0h) it2.next());
                                                                    priorityIntentHandlerImpl$processIntent$12.L$0 = oep0Var3;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$1 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$2 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$3 = uri3;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$4 = v770Var4;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$5 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$6 = deeplinkSource;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$7 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$8 = it2;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$9 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.L$10 = null;
                                                                    priorityIntentHandlerImpl$processIntent$12.label = 6;
                                                                    obj = b2.invoke(oep0Var3, uri3, v770Var4, deeplinkSource, priorityIntentHandlerImpl$processIntent$12);
                                                                    break;
                                                                }
                                                            } else {
                                                                ((jfb) cxq0Var.b).getClass();
                                                                if (uri.isHierarchical() && uri.getQueryParameterNames().contains("ref")) {
                                                                    ((ri1) cxq0Var.c).a = cxq0Var.s(uri);
                                                                }
                                                                return new m5u(false, false);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return new m5u(true, false);
                                }
                            }
                            return n5u.a;
                        }
                        return coroutineSingletons;
                    case 2:
                        intent3 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$2;
                        intent2 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$1;
                        oep0Var3 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        o5uVar = (o5u) obj;
                        if (!(o5uVar instanceof m5u)) {
                        }
                        break;
                    case 3:
                        v770Var = (v770) priorityIntentHandlerImpl$processIntent$1.L$4;
                        uri = (Uri) priorityIntentHandlerImpl$processIntent$1.L$3;
                        intent4 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$1;
                        oep0Var3 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return new m5u(true, false);
                    case 4:
                        it = (Iterator) priorityIntentHandlerImpl$processIntent$1.L$6;
                        v770Var3 = (v770) priorityIntentHandlerImpl$processIntent$1.L$4;
                        uri2 = (Uri) priorityIntentHandlerImpl$processIntent$1.L$3;
                        intent5 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$1;
                        oep0Var4 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        o5uVar2 = (o5u) obj;
                        if (!(o5uVar2 instanceof m5u)) {
                        }
                        break;
                    case 5:
                        v770Var2 = (v770) priorityIntentHandlerImpl$processIntent$1.L$4;
                        uri = (Uri) priorityIntentHandlerImpl$processIntent$1.L$3;
                        intent4 = (Intent) priorityIntentHandlerImpl$processIntent$1.L$1;
                        oep0Var3 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 6:
                        it2 = (Iterator) priorityIntentHandlerImpl$processIntent$1.L$8;
                        DeeplinkSource deeplinkSource3 = (DeeplinkSource) priorityIntentHandlerImpl$processIntent$1.L$6;
                        v770 v770Var8 = (v770) priorityIntentHandlerImpl$processIntent$1.L$4;
                        Uri uri4 = (Uri) priorityIntentHandlerImpl$processIntent$1.L$3;
                        oep0 oep0Var6 = (oep0) priorityIntentHandlerImpl$processIntent$1.L$0;
                        kotlin.b.b(obj);
                        deeplinkSource = deeplinkSource3;
                        priorityIntentHandlerImpl$processIntent$12 = priorityIntentHandlerImpl$processIntent$1;
                        uri3 = uri4;
                        oep0Var3 = oep0Var6;
                        v770Var4 = v770Var8;
                        o5u o5uVar3 = (o5u) obj;
                        if (o5uVar3 instanceof m5u) {
                            ((jfb) cxq0Var.b).getClass();
                            if (uri3.isHierarchical() && uri3.getQueryParameterNames().contains("ref")) {
                                ((ri1) cxq0Var.c).a = cxq0Var.s(uri3);
                            }
                            return o5uVar3;
                        }
                        if (it2.hasNext()) {
                        }
                        return n5u.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        priorityIntentHandlerImpl$processIntent$1 = new PriorityIntentHandlerImpl$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = priorityIntentHandlerImpl$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priorityIntentHandlerImpl$processIntent$1.label;
        cxq0 cxq0Var2 = this.h;
        switch (i) {
        }
    }
}
