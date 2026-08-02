package com.yandex.go.summary.requirements.list.requirementgroup;

import com.yandex.go.zone.dto.objects.TariffDefinitionPresentationModal;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinitionPresentation;
import defpackage.b580;
import defpackage.fmw0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lhj0;
import defpackage.lmw0;
import defpackage.lot0;
import defpackage.mhj0;
import defpackage.mvg;
import defpackage.nhj0;
import defpackage.ny61;
import defpackage.oej0;
import defpackage.scc;
import defpackage.vpr;
import defpackage.x8;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.requirements.list.requirementgroup.RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3", f = "RequirementGroupScreenUiStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3(Continuation continuation, b bVar) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3 requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3 = new RequirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return requirementGroupScreenUiStateInteractor$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nhj0 nhj0Var;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        mhj0 mhj0Var;
        boolean z;
        Object obj3;
        Object obj4;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            TariffInfoGroupDefinition tariffInfoGroupDefinition = this.this$0.a;
            TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation = tariffInfoGroupDefinition.f;
            TariffDefinitionPresentationModal tariffDefinitionPresentationModal = tariffInfoGroupDefinitionPresentation != null ? tariffInfoGroupDefinitionPresentation.b : null;
            List<String> list = tariffInfoGroupDefinition.b;
            ArrayList arrayList3 = new ArrayList();
            for (String str : list) {
                Iterator it = this.this$0.e.getRequirements().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it.next();
                    if (jl40.l(((lmw0) obj4).getName(), str)) {
                        break;
                    }
                }
                lmw0 lmw0Var = (lmw0) obj4;
                if (lmw0Var != null) {
                    arrayList3.add(lmw0Var);
                }
            }
            if (tariffDefinitionPresentationModal == null) {
                jst.e.w(new IllegalStateException("TariffDefinitionPresentationModal = null, but SpecialNeedsModalView are already shown"));
                nhj0Var = new nhj0("", "", "", "", "", EmptyList.a);
                obj2 = null;
            } else {
                String str2 = tariffDefinitionPresentationModal.a;
                String str3 = tariffDefinitionPresentationModal.b;
                String str4 = tariffDefinitionPresentationModal.e;
                String str5 = tariffDefinitionPresentationModal.c;
                String str6 = tariffDefinitionPresentationModal.d;
                b bVar = this.this$0;
                lot0 lot0Var = bVar.b;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = ((x8) bVar.c).d;
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    lmw0 lmw0Var2 = (lmw0) arrayList3.get(i3);
                    b bVar2 = bVar;
                    if (lmw0Var2 instanceof fmw0) {
                        fmw0 fmw0Var = (fmw0) lmw0Var2;
                        String str7 = fmw0Var.a;
                        arrayList = arrayList3;
                        oej0 oej0Var = fmw0Var.m;
                        if (oej0Var != null) {
                            String b = lot0Var.b(str7);
                            Iterator it2 = arrayList5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    arrayList2 = arrayList5;
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it2.next();
                                arrayList2 = arrayList5;
                                if (jl40.l(((b580) obj3).a, str7)) {
                                    break;
                                }
                                arrayList5 = arrayList2;
                            }
                            b580 b580Var = (b580) obj3;
                            String str8 = b580Var != null ? b580Var.f : null;
                            i = size;
                            mhj0Var = new mhj0(fmw0Var.a, new RequirementGroupScreenUiStateInteractor$provideSpecialRequirements$commentModel$1(1, bVar2, b.class, "saveForNextTripsClicked", "saveForNextTripsClicked(Lru/yandex/taxi/requirements/ui/SpecialRequirementModel;)V", 0), oej0Var.a, oej0Var.b, b == null ? str8 : b, lot0Var.b(str7) != null);
                        } else {
                            arrayList2 = arrayList5;
                            i = size;
                            mhj0Var = null;
                        }
                        if (arrayList2 == null || !arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (jl40.l(((b580) it3.next()).a, str7)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        arrayList4.add(new lhj0(fmw0Var.b, fmw0Var.c, fmw0Var.p ? !z : z, mhj0Var, i3 == scc.f(arrayList), fmw0Var.a, fmw0Var.n));
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        i = size;
                    }
                    i3++;
                    arrayList3 = arrayList;
                    bVar = bVar2;
                    arrayList5 = arrayList2;
                    size = i;
                }
                nhj0Var = new nhj0(str2, str3, str4, str6, str5, arrayList4);
                obj2 = null;
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (vprVar.emit(nhj0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
