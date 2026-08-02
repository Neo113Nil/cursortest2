package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.bpl0;
import defpackage.elx0;
import defpackage.ik31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qdx0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tox0;
import defpackage.uox0;
import defpackage.vbx0;
import defpackage.vcx0;
import defpackage.vom;
import defpackage.vpr;
import defpackage.wbx0;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.interactor.TariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3", f = "TariffsUiStateInteractor.kt", l = {368, 372, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$20;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3(Continuation continuation, f fVar) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3 tariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new TariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        tariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        tariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return tariffsUiStateInteractor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0297, code lost:
    
        if (r1.emit(r2, r29) != r3) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025e  */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.lang.Object[], uox0[]] */
    /* JADX WARN: Type inference failed for: r4v23, types: [uox0[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0244 -> B:13:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01e9 -> B:14:0x0201). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        Iterator it;
        Map map;
        ArrayList arrayList;
        bpl0 b;
        vpr vprVar;
        Map map2;
        List g;
        vpr vprVar2 = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            booleanValue = ((Boolean) obj4).booleanValue();
            Map map3 = (Map) obj3;
            ik31 ik31Var = (ik31) obj2;
            if (booleanValue) {
                List b2 = ((ru.yandex.taxi.preorder.summary.selector.model.vertical.a) this.this$0.g.get()).b(ik31Var, false);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : b2) {
                    elx0 elx0Var = (elx0) obj7;
                    Pair pair = new Pair(elx0Var.b, elx0Var.a);
                    Object obj8 = linkedHashMap.get(pair);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap.put(pair, obj8);
                    }
                    ((List) obj8).add(obj7);
                }
                Collection values = linkedHashMap.values();
                ArrayList arrayList2 = new ArrayList();
                it = values.iterator();
                map = map3;
                arrayList = arrayList2;
                if (!it.hasNext()) {
                }
            } else {
                b = com.yandex.go.design.compose.list.a.b(EmptyList.a, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.L$16 = null;
                this.L$17 = null;
                this.L$18 = null;
                this.L$19 = null;
                this.L$20 = null;
                this.label = 3;
            }
        } else if (i == 1) {
            int i2 = this.I$0;
            booleanValue = this.Z$0;
            ?? r4 = (uox0[]) this.L$16;
            uox0[] uox0VarArr = (uox0[]) this.L$15;
            elx0 elx0Var2 = (elx0) this.L$14;
            Iterator it2 = (Iterator) this.L$11;
            ?? r13 = (Collection) this.L$10;
            Map map4 = (Map) this.L$6;
            vpr vprVar3 = (vpr) this.L$2;
            kotlin.b.b(obj);
            map2 = map4;
            r4[i2] = obj;
            this.this$0.getClass();
            uox0VarArr[1] = new uox0(false, "", null, "", "", null, new tox0(elx0Var2.b, elx0Var2.a, elx0Var2.d, true), true, new vcx0(null, false, null), new wbx0("", new vbx0(0), false, true), new qdx0("", false, true));
            g = scc.g(uox0VarArr);
            it = it2;
            arrayList = r13;
            vprVar = vprVar3;
            ycc.r(g, arrayList);
            vprVar2 = vprVar;
            map = map2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z = this.Z$0;
            Iterator it3 = (Iterator) this.L$18;
            Collection collection = (Collection) this.L$17;
            Collection collection2 = (Collection) this.L$15;
            Iterator it4 = (Iterator) this.L$11;
            ?? r12 = (Collection) this.L$10;
            Map map5 = (Map) this.L$6;
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            Object a = obj;
            ArrayList arrayList3 = r12;
            collection2.add((uox0) a);
            ArrayList arrayList4 = arrayList3;
            if (it3.hasNext()) {
                elx0 elx0Var3 = (elx0) it3.next();
                f fVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = map5;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = arrayList4;
                this.L$11 = it4;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = collection;
                this.L$16 = null;
                this.L$17 = collection;
                this.L$18 = it3;
                this.L$19 = null;
                this.L$20 = null;
                this.Z$0 = z;
                this.label = 2;
                a = f.a(fVar, elx0Var3, map5, this);
                if (a != coroutineSingletons) {
                    collection2 = collection;
                    arrayList3 = arrayList4;
                    collection2.add((uox0) a);
                    ArrayList arrayList42 = arrayList3;
                    if (it3.hasNext()) {
                        booleanValue = z;
                        g = (List) collection;
                        map2 = map5;
                        arrayList = arrayList42;
                        it = it4;
                        ycc.r(g, arrayList);
                        vprVar2 = vprVar;
                        map = map2;
                        if (!it.hasNext()) {
                            List list = (List) it.next();
                            if (list.size() == 1) {
                                elx0 elx0Var4 = (elx0) kotlin.collections.a.P(list);
                                ?? r42 = new uox0[2];
                                f fVar2 = this.this$0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = vprVar2;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = map;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.L$10 = arrayList;
                                this.L$11 = it;
                                this.L$12 = null;
                                this.L$13 = null;
                                this.L$14 = elx0Var4;
                                this.L$15 = r42;
                                this.L$16 = r42;
                                this.L$17 = null;
                                this.L$18 = null;
                                this.L$19 = null;
                                this.L$20 = null;
                                this.Z$0 = booleanValue;
                                this.I$0 = 0;
                                this.label = 1;
                                Object a2 = f.a(fVar2, elx0Var4, map, this);
                                if (a2 != coroutineSingletons) {
                                    vpr vprVar4 = vprVar2;
                                    map2 = map;
                                    ArrayList arrayList5 = arrayList;
                                    Iterator it5 = it;
                                    r42[0] = a2;
                                    this.this$0.getClass();
                                    r42[1] = new uox0(false, "", null, "", "", null, new tox0(elx0Var4.b, elx0Var4.a, elx0Var4.d, true), true, new vcx0(null, false, null), new wbx0("", new vbx0(0), false, true), new qdx0("", false, true));
                                    g = scc.g(r42);
                                    it = it5;
                                    arrayList = arrayList5;
                                    vprVar = vprVar4;
                                    ycc.r(g, arrayList);
                                    vprVar2 = vprVar;
                                    map = map2;
                                    if (!it.hasNext()) {
                                        b = com.yandex.go.design.compose.list.a.b(arrayList, vom.R);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.L$11 = null;
                                        this.L$12 = null;
                                        this.L$13 = null;
                                        this.L$14 = null;
                                        this.L$15 = null;
                                        this.L$16 = null;
                                        this.L$17 = null;
                                        this.L$18 = null;
                                        this.L$19 = null;
                                        this.L$20 = null;
                                        this.label = 3;
                                    }
                                }
                            } else {
                                List list2 = list;
                                ArrayList arrayList6 = new ArrayList(tcc.n(list2, 10));
                                it4 = it;
                                arrayList42 = arrayList;
                                map5 = map;
                                vprVar = vprVar2;
                                z = booleanValue;
                                it3 = list2.iterator();
                                collection = arrayList6;
                                if (it3.hasNext()) {
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
