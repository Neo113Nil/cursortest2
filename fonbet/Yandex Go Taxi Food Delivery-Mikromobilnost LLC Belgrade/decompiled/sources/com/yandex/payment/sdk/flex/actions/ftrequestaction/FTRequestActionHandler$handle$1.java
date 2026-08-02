package com.yandex.payment.sdk.flex.actions.ftrequestaction;

import defpackage.agr;
import defpackage.d6w;
import defpackage.dhr;
import defpackage.hja1;
import defpackage.iho;
import defpackage.k6p;
import defpackage.kvj0;
import defpackage.kyj0;
import defpackage.lkr;
import defpackage.m5p;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n891;
import defpackage.nja1;
import defpackage.nkr;
import defpackage.ny61;
import defpackage.qyj0;
import defpackage.r6p;
import defpackage.rs20;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u5p;
import defpackage.uyj;
import defpackage.v6p;
import defpackage.wls;
import defpackage.y22;
import defpackage.y6i0;
import defpackage.yfr;
import defpackage.zrm;
import defpackage.zy11;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.actions.ftrequestaction.FTRequestActionHandler$handle$1", f = "FTRequestActionHandler.kt", l = {53, HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FTRequestActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ agr $action;
    final /* synthetic */ yfr $context;
    final /* synthetic */ iho $ftRequestActionEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTRequestActionHandler$handle$1(yfr yfrVar, a aVar, agr agrVar, iho ihoVar, Continuation continuation) {
        super(2, continuation);
        this.$context = yfrVar;
        this.this$0 = aVar;
        this.$action = agrVar;
        this.$ftRequestActionEvent = ihoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FTRequestActionHandler$handle$1(this.$context, this.this$0, this.$action, this.$ftRequestActionEvent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FTRequestActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01d0 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:7:0x0025, B:8:0x0172, B:10:0x017c, B:12:0x0180, B:13:0x0196, B:16:0x01aa, B:20:0x01ca, B:22:0x01d0, B:23:0x01d5, B:26:0x0034, B:27:0x0067, B:29:0x0087, B:30:0x0096, B:32:0x009c, B:34:0x00b0, B:37:0x00dd, B:41:0x00b6, B:43:0x00ba, B:44:0x00c7, B:46:0x00cd, B:48:0x00bf, B:50:0x00c3, B:53:0x00e1, B:54:0x00e8, B:56:0x00ee, B:57:0x00fd, B:59:0x0103, B:61:0x0119, B:62:0x0126, B:64:0x012c, B:67:0x0135, B:72:0x011e, B:74:0x0122, B:77:0x0139, B:78:0x0140, B:85:0x003b, B:87:0x003f, B:89:0x0053, B:91:0x0059, B:93:0x005f, B:98:0x01dd, B:99:0x01e4), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yfr yfrVar;
        rs20 rs20Var;
        Map map;
        Map map2;
        u5p u5pVar;
        Object obj2;
        Object obj3;
        Pair pair;
        int i;
        List list;
        d6w n;
        Map map3;
        yfr yfrVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
        } catch (Exception e) {
            List list2 = this.$action.k;
            if (list2 != null && (yfrVar = this.$context) != null) {
                zrm zrmVar = yfrVar.a;
                String th = e.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                nja1.f(linkedHashMap, list2, th);
                ((dhr) zrmVar.c).invoke(linkedHashMap);
            }
            this.$action.m.invoke();
            ((y22) this.this$0.d).a(iho.b(this.$ftRequestActionEvent, e.toString(), 2));
        }
        if (i2 == 0) {
            b.b(obj);
            if (this.$context == null) {
                throw new IllegalStateException("FlexActionHandlingContext should be provided to FTRequestActionHandler");
            }
            nkr nkrVar = this.this$0.c;
            this.label = 1;
            qyj0 e2 = n891.e(nkrVar.a.b());
            kyj0 kyj0Var = e2 instanceof kyj0 ? (kyj0) e2 : null;
            obj = (kyj0Var == null || (rs20Var = (rs20) kyj0Var.a) == null) ? null : rs20Var.a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u5pVar = (u5p) this.L$1;
                b.b(obj);
                kvj0 kvj0Var = (kvj0) obj;
                i = kvj0Var.w;
                list = this.$action.j;
                if (list != null && (yfrVar2 = this.$context) != null) {
                    zrm zrmVar2 = yfrVar2.a;
                    Integer num = new Integer(i);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    nja1.f(linkedHashMap2, list, num);
                    ((dhr) zrmVar2.c).invoke(linkedHashMap2);
                }
                Map b = hja1.b(kvj0Var);
                n = y6i0.n(200, 300);
                int i3 = n.a;
                if (i <= n.b || i3 > i) {
                    map3 = this.$action.i;
                    if (map3 != null) {
                        ((com.yandex.payment.sdk.utils.dtotransporter.a) u5pVar).d(b, map3);
                    }
                    this.$action.m.invoke();
                } else {
                    ((com.yandex.payment.sdk.utils.dtotransporter.a) u5pVar).d(b, this.$action.h);
                    this.$action.l.invoke();
                    ((y22) this.this$0.d).a(this.$ftRequestActionEvent.d(null));
                }
                return zy11.a;
            }
            b.b(obj);
        }
        lkr lkrVar = this.this$0.b;
        zrm zrmVar3 = this.$context.a;
        lkrVar.getClass();
        com.yandex.payment.sdk.utils.dtotransporter.a aVar = new com.yandex.payment.sdk.utils.dtotransporter.a(zrmVar3, (String) obj);
        LinkedHashMap a = aVar.a(this.$action.g);
        Map map4 = this.$action.f;
        if (map4 != null) {
            a aVar2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map4.entrySet()) {
                String str = (String) entry.getKey();
                r6p r6pVar = (r6p) entry.getValue();
                if (r6pVar == null) {
                    pair = new Pair(str, null);
                } else {
                    v6p v6pVar = r6pVar.a;
                    if (v6pVar != null) {
                        obj3 = aVar.c(v6pVar);
                    } else {
                        m5p m5pVar = r6pVar.b;
                        obj3 = m5pVar != null ? m5pVar.a : null;
                    }
                    String c = a.c(aVar2, obj3);
                    pair = c != null ? new Pair(str, URLEncoder.encode(c, "UTF-8")) : null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map = kotlin.collections.b.s(arrayList);
        } else {
            map = null;
        }
        Map map5 = this.$action.e;
        if (map5 != null) {
            a aVar3 = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map5.entrySet()) {
                String str2 = (String) entry2.getKey();
                r6p r6pVar2 = (r6p) entry2.getValue();
                v6p v6pVar2 = r6pVar2.a;
                if (v6pVar2 != null) {
                    obj2 = aVar.c(v6pVar2);
                } else {
                    m5p m5pVar2 = r6pVar2.b;
                    obj2 = m5pVar2 != null ? m5pVar2.a : null;
                }
                String c2 = a.c(aVar3, obj2);
                Pair pair2 = c2 != null ? new Pair(str2, c2) : null;
                if (pair2 != null) {
                    arrayList2.add(pair2);
                }
            }
            map2 = kotlin.collections.b.s(arrayList2);
        } else {
            map2 = null;
        }
        String str3 = this.$action.b;
        agr agrVar = this.$action;
        k6p k6pVar = new k6p(agrVar.c, agrVar.a, map2, map, a);
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        FTRequestActionHandler$handle$1$response$1 fTRequestActionHandler$handle$1$response$1 = new FTRequestActionHandler$handle$1$response$1(this.this$0, k6pVar, this.$action, null);
        this.L$0 = null;
        this.L$1 = aVar;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        obj = tje.k0(mdhVar, fTRequestActionHandler$handle$1$response$1, this);
        if (obj != coroutineSingletons) {
            u5pVar = aVar;
            kvj0 kvj0Var2 = (kvj0) obj;
            i = kvj0Var2.w;
            list = this.$action.j;
            if (list != null) {
                zrm zrmVar22 = yfrVar2.a;
                Integer num2 = new Integer(i);
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                nja1.f(linkedHashMap22, list, num2);
                ((dhr) zrmVar22.c).invoke(linkedHashMap22);
            }
            Map b2 = hja1.b(kvj0Var2);
            n = y6i0.n(200, 300);
            int i32 = n.a;
            if (i <= n.b) {
            }
            map3 = this.$action.i;
            if (map3 != null) {
            }
            this.$action.m.invoke();
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
