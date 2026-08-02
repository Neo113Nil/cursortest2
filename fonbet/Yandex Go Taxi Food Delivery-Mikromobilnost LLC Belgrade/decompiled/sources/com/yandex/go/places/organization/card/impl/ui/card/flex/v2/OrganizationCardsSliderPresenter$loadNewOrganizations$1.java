package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ne80;
import defpackage.nh80;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.th80;
import defpackage.tse;
import defpackage.uc4;
import defpackage.wac0;
import defpackage.wls;
import defpackage.xac0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderPresenter$loadNewOrganizations$1", f = "OrganizationCardsSliderPresenter.kt", l = {NetworkRequestException.INVALID_RANGE, 417}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardsSliderPresenter$loadNewOrganizations$1 extends SuspendLambda implements wls {
    final /* synthetic */ uc4 $bbox;
    int I$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardsSliderPresenter$loadNewOrganizations$1(g gVar, uc4 uc4Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$bbox = uc4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardsSliderPresenter$loadNewOrganizations$1(this.this$0, this.$bbox, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardsSliderPresenter$loadNewOrganizations$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0033, code lost:
    
        if (kotlinx.coroutines.a.i(500, r14) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        boolean booleanValue;
        List list;
        boolean z;
        xac0 xac0Var;
        Integer num;
        xac0 xac0Var2;
        Boolean bool;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            i = !gVar.d0 ? 1 : 0;
            gVar.d0 = true;
            this.I$0 = i;
            this.label = 1;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.I$0;
                kotlin.b.b(obj);
                List list2 = (List) obj;
                wac0 wac0Var = (wac0) this.this$0.l0.getValue();
                booleanValue = (wac0Var != null || (xac0Var2 = wac0Var.i) == null || (bool = xac0Var2.a) == null) ? false : bool.booleanValue();
                g gVar2 = this.this$0;
                if (booleanValue) {
                    if (i2 != 0) {
                        ne80 ne80Var = (ne80) kotlin.collections.a.R(gVar2.Z);
                        ListBuilder a = rcc.a();
                        if (ne80Var != null) {
                            a.add(ne80Var);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!jl40.l(((ne80) obj2).a, ne80Var != null ? ne80Var.a : null)) {
                                arrayList.add(obj2);
                            }
                        }
                        a.addAll(arrayList);
                        list = a.j();
                    } else {
                        gVar2.getClass();
                        list = list2;
                    }
                    if (!list.isEmpty()) {
                        g gVar3 = this.this$0;
                        int size = list2.size();
                        z = i2 != 0;
                        gVar3.b0 = false;
                        gVar3.Z = list;
                        if (z) {
                            ((nh80) gVar3.Dg()).Pb(size);
                        } else {
                            ((nh80) gVar3.Dg()).va();
                        }
                    }
                } else {
                    wac0 wac0Var2 = (wac0) gVar2.l0.getValue();
                    int intValue = (wac0Var2 == null || (xac0Var = wac0Var2.i) == null || (num = xac0Var.b) == null) ? 0 : num.intValue();
                    Iterator it = gVar2.Z.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        if (jl40.l(((ne80) it.next()).a, gVar2.a0.a)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i4 < 0 ? 0 : i4;
                    int i6 = i5 - intValue;
                    int i7 = i6 < 0 ? 0 : i6;
                    int i8 = i5 + 1;
                    int size2 = gVar2.Z.size();
                    if (i8 > size2) {
                        i8 = size2;
                    }
                    List subList = gVar2.Z.subList(i7, i8);
                    List list3 = subList;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ne80) it2.next()).a);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!arrayList2.contains(((ne80) obj3).a)) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList m0 = kotlin.collections.a.m0(arrayList3, subList);
                    int size3 = subList.size() - 1;
                    int size4 = arrayList3.size();
                    th80 th80Var = new th80(size3, i5, size4, i7, (gVar2.Z.size() - i5) - 1, m0);
                    if (size4 > 0) {
                        g gVar4 = this.this$0;
                        z = i2 != 0;
                        gVar4.b0 = false;
                        gVar4.Z = m0;
                        if (z) {
                            ((nh80) gVar4.Dg()).Pb(size4);
                        } else {
                            ((nh80) gVar4.Dg()).Be(th80Var);
                        }
                    }
                }
                return zy11.a;
            }
            i = this.I$0;
            kotlin.b.b(obj);
        }
        g gVar5 = this.this$0;
        com.yandex.go.places.organization.card.impl.domain.interactors.flex.b bVar = gVar5.K;
        uc4 uc4Var = this.$bbox;
        String str = gVar5.W;
        if (str == null) {
            str = "";
        }
        boolean z2 = !gVar5.j0;
        this.I$0 = i;
        this.label = 2;
        obj = bVar.b(uc4Var, str, z2, this);
        if (obj != coroutineSingletons) {
            i2 = i;
            List list22 = (List) obj;
            wac0 wac0Var3 = (wac0) this.this$0.l0.getValue();
            if (wac0Var3 != null) {
            }
            g gVar22 = this.this$0;
            if (booleanValue) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
