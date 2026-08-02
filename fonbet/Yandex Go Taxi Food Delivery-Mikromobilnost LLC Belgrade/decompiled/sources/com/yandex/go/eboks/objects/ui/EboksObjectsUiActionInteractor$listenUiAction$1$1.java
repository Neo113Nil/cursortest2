package com.yandex.go.eboks.objects.ui;

import defpackage.din;
import defpackage.gw00;
import defpackage.kin;
import defpackage.mhn;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nhn;
import defpackage.ny61;
import defpackage.ohn;
import defpackage.oin;
import defpackage.phn;
import defpackage.pin;
import defpackage.rcc;
import defpackage.rhn;
import defpackage.rin;
import defpackage.rsn;
import defpackage.scc;
import defpackage.sin;
import defpackage.tcc;
import defpackage.tin;
import defpackage.uin;
import defpackage.v4r0;
import defpackage.vin;
import defpackage.vj00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luin;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.eboks.objects.ui.EboksObjectsUiActionInteractor$listenUiAction$1$1", f = "EboksObjectsUiActionInteractor.kt", l = {47, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EboksObjectsUiActionInteractor$listenUiAction$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rsn $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EboksObjectsUiActionInteractor$listenUiAction$1$1(vin vinVar, rsn rsnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vinVar;
        this.$it = rsnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EboksObjectsUiActionInteractor$listenUiAction$1$1 eboksObjectsUiActionInteractor$listenUiAction$1$1 = new EboksObjectsUiActionInteractor$listenUiAction$1$1(this.this$0, this.$it, continuation);
        eboksObjectsUiActionInteractor$listenUiAction$1$1.L$0 = obj;
        return eboksObjectsUiActionInteractor$listenUiAction$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EboksObjectsUiActionInteractor$listenUiAction$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x032f, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r3, r1, r25) == r2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0331, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x030d, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r3, r1, r25) == r2) goto L97;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ListBuilder j;
        int i3;
        LinkedHashMap linkedHashMap;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        List g;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        int i5 = 1;
        if (i4 == 0) {
            b.b(obj);
            vin vinVar = this.this$0;
            rsn rsnVar = this.$it;
            kin kinVar = (kin) rsnVar.a;
            kin kinVar2 = (kin) rsnVar.b;
            vinVar.getClass();
            oin oinVar = oin.a;
            oin oinVar2 = oin.b;
            List list = kinVar2.a;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
            for (Object obj2 : list) {
                linkedHashMap3.put(((rhn) obj2).a, obj2);
            }
            if (kinVar == null) {
                ListBuilder a = rcc.a();
                a.add(oinVar2);
                Iterator it2 = linkedHashMap3.values().iterator();
                while (it2.hasNext()) {
                    a.add(vinVar.a((rhn) it2.next()));
                }
                a.add(oinVar);
                vj00 vj00Var = kinVar2.b;
                if (vj00Var != null) {
                    a.add(new rin(vj00Var));
                }
                j = a.j();
                i = 1;
                i2 = 0;
            } else {
                List list2 = kinVar.a;
                int d2 = gw00.d(tcc.n(list2, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                for (Object obj3 : list2) {
                    linkedHashMap4.put(((rhn) obj3).a, obj3);
                }
                ListBuilder a2 = rcc.a();
                a2.add(oinVar2);
                Set g2 = v4r0.g(linkedHashMap3.keySet(), linkedHashMap4.keySet());
                ArrayList arrayList = new ArrayList();
                Iterator it3 = g2.iterator();
                while (it3.hasNext()) {
                    rhn rhnVar = (rhn) linkedHashMap3.get((String) it3.next());
                    if (rhnVar != null) {
                        arrayList.add(rhnVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(vinVar.a((rhn) it4.next()));
                }
                a2.addAll(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = linkedHashMap3.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    rhn rhnVar2 = (rhn) linkedHashMap4.get(entry.getKey());
                    rhn rhnVar3 = (rhn) entry.getValue();
                    if (rhnVar2 == null) {
                        g = EmptyList.a;
                        i3 = i5;
                        linkedHashMap = linkedHashMap4;
                    } else {
                        i3 = i5;
                        if ((rhnVar2 instanceof nhn) && (rhnVar3 instanceof nhn)) {
                            nhn nhnVar = (nhn) rhnVar3;
                            nhn nhnVar2 = (nhn) rhnVar2;
                            linkedHashMap = linkedHashMap4;
                            if (nhnVar.c == nhnVar2.c) {
                                Set g3 = v4r0.g(nhnVar.b, nhnVar2.b);
                                String str = nhnVar.a;
                                Set set = g3;
                                ArrayList arrayList4 = new ArrayList(tcc.n(set, 10));
                                Iterator it6 = set.iterator();
                                while (it6.hasNext()) {
                                    arrayList4.add(((mhn) it6.next()).d);
                                }
                                g = Collections.singletonList(new sin(str, g3, arrayList4, kotlin.collections.a.U(nhnVar.b, nhnVar2.b), v4r0.g(nhnVar2.b, nhnVar.b), vinVar.c.a));
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                        }
                        if ((rhnVar2 instanceof phn) && (rhnVar3 instanceof phn)) {
                            phn phnVar = (phn) rhnVar3;
                            phn phnVar2 = (phn) rhnVar2;
                            if (phnVar.c == phnVar2.c) {
                                Set g4 = v4r0.g(phnVar.b, phnVar2.b);
                                String str2 = phnVar.a;
                                Set set2 = g4;
                                it = it5;
                                linkedHashMap2 = linkedHashMap3;
                                ArrayList arrayList5 = new ArrayList(tcc.n(set2, 10));
                                Iterator it7 = set2.iterator();
                                while (it7.hasNext()) {
                                    arrayList5.add(((ohn) it7.next()).d);
                                }
                                g = Collections.singletonList(new tin(str2, g4, arrayList5, v4r0.g(phnVar2.b, phnVar.b)));
                                ycc.r(g, arrayList3);
                                i5 = i3;
                                linkedHashMap4 = linkedHashMap;
                                it5 = it;
                                linkedHashMap3 = linkedHashMap2;
                            }
                        }
                        it = it5;
                        linkedHashMap2 = linkedHashMap3;
                        pin pinVar = new pin(rhnVar2.a);
                        uin a3 = vinVar.a(rhnVar3);
                        uin[] uinVarArr = new uin[2];
                        uinVarArr[0] = pinVar;
                        uinVarArr[i3] = a3;
                        g = scc.g(uinVarArr);
                        ycc.r(g, arrayList3);
                        i5 = i3;
                        linkedHashMap4 = linkedHashMap;
                        it5 = it;
                        linkedHashMap3 = linkedHashMap2;
                    }
                    it = it5;
                    linkedHashMap2 = linkedHashMap3;
                    ycc.r(g, arrayList3);
                    i5 = i3;
                    linkedHashMap4 = linkedHashMap;
                    it5 = it;
                    linkedHashMap3 = linkedHashMap2;
                }
                i = i5;
                i2 = 0;
                a2.addAll(arrayList3);
                Set g5 = v4r0.g(linkedHashMap4.keySet(), linkedHashMap3.keySet());
                ArrayList arrayList6 = new ArrayList(tcc.n(g5, 10));
                Iterator it8 = g5.iterator();
                while (it8.hasNext()) {
                    arrayList6.add(new pin((String) it8.next()));
                }
                a2.addAll(arrayList6);
                a2.add(oinVar);
                vj00 vj00Var2 = kinVar2.b;
                if (vj00Var2 != null) {
                    a2.add(new rin(vj00Var2));
                }
                j = a2.j();
            }
            din dinVar = vinVar.b;
            List list3 = kinVar2.a;
            ArrayList arrayList7 = new ArrayList(tcc.n(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList7.add(((rhn) it9.next()).b);
            }
            Iterator it10 = arrayList7.iterator();
            int i6 = i2;
            while (it10.hasNext()) {
                i6 += ((Set) it10.next()).size();
            }
            dinVar.d(i6);
            g gVar = new g(j);
            this.L$0 = vprVar;
            this.label = i;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        vin vinVar2 = this.this$0;
        mth B = e.B(vinVar2.d.b, new EboksObjectsUiActionInteractor$listenClientEvents$$inlined$flatMapConcat$1(null, vinVar2, (kin) this.$it.b));
        this.L$0 = null;
        this.label = 2;
    }
}
