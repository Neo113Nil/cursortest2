package com.yandex.go.requirements.ui.selector.compound.child;

import defpackage.apb;
import defpackage.avj0;
import defpackage.b580;
import defpackage.bpb;
import defpackage.ejj0;
import defpackage.evu0;
import defpackage.gmw0;
import defpackage.gob;
import defpackage.gvd;
import defpackage.hob;
import defpackage.iob;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.lpb;
import defpackage.nvo;
import defpackage.ny61;
import defpackage.p1b;
import defpackage.scc;
import defpackage.sk7;
import defpackage.sud;
import defpackage.tcc;
import defpackage.tud;
import defpackage.vpr;
import defpackage.y6i0;
import defpackage.ycc;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ sk7 b;
    public final /* synthetic */ iob c;

    public a(vpr vprVar, sk7 sk7Var, iob iobVar) {
        this.a = vprVar;
        this.b = sk7Var;
        this.c = iobVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        Throwable th;
        apb apbVar;
        Iterator it;
        Throwable th2;
        Object obj3;
        if (continuation instanceof ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) {
            childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = (ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
                Throwable th3 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    p1b p1bVar = (p1b) this.b.w;
                    iob iobVar = this.c;
                    int i3 = iobVar.c;
                    gmw0 gmw0Var = iobVar.b;
                    Iterator it2 = ((List) obj).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (jl40.l(((b580) obj2).a, gmw0Var.c)) {
                            break;
                        }
                    }
                    b580 b580Var = (b580) obj2;
                    p1bVar.getClass();
                    List list = b580Var != null ? b580Var.e : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ejj0 p = gmw0Var.p((String) it3.next());
                        if (p != null) {
                            arrayList.add(p);
                        }
                    }
                    ArrayList arrayList2 = gmw0Var.t.a;
                    if (arrayList2.isEmpty()) {
                        apbVar = null;
                        th = null;
                    } else {
                        int size = arrayList.size();
                        SetBuilder setBuilder = new SetBuilder();
                        int i4 = 0;
                        setBuilder.add(0);
                        ycc.r(y6i0.n(1, size), setBuilder);
                        if (i3 >= size) {
                            setBuilder.add(Integer.valueOf(size));
                        }
                        SetBuilder b = setBuilder.b();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th4 = th3;
                                scc.m();
                                throw th4;
                            }
                            sud b2 = ((gvd) p1bVar.b).b(gmw0Var, arrayList, i4);
                            if (b2 != null) {
                                boolean contains = b.contains(Integer.valueOf(i4));
                                bpb bpbVar = new bpb(b2.a);
                                if (i4 == 0) {
                                    bpbVar = th3;
                                }
                                ArrayList<tud> arrayList4 = b2.c;
                                th2 = th3;
                                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                                for (tud tudVar : arrayList4) {
                                    Iterator it5 = it4;
                                    String str = tudVar.a;
                                    String str2 = tudVar.d;
                                    String str3 = tudVar.e;
                                    String str4 = (str3 == null || evu0.J(str3)) ? th2 : str3;
                                    boolean z = tudVar.f;
                                    boolean z2 = tudVar.g;
                                    String str5 = tudVar.c;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    arrayList5.add(new hob(str, str2, str4, z, z2, str5, new nvo(tudVar.a, i4)));
                                    it4 = it5;
                                }
                                it = it4;
                                obj3 = new lpb(contains, bpbVar, arrayList5);
                            } else {
                                it = it4;
                                th2 = th3;
                                obj3 = th2;
                            }
                            if (obj3 != null) {
                                arrayList3.add(obj3);
                            }
                            it4 = it;
                            i4 = i5;
                            th3 = th2;
                        }
                        th = th3;
                        apbVar = new apb(gmw0Var.j.a, arrayList3, new gob(((avj0) ((zuj0) p1bVar.a)).h(kyh0.summary_tariff_card_compoundoption_childchair_close_button)));
                    }
                    if (apbVar != null) {
                        Throwable th5 = th;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$0 = th5;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$1 = th5;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$2 = th5;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$3 = th5;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.L$4 = th5;
                        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(apbVar, childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1 = new ChildCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj42 = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = childCompoundOptionSelectUiStateInteractor$uiStateFlow$$inlined$mapNotNull$1$2$1.label;
        Throwable th32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
