package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.divider.DividerUiState$CustomGroupTitleUiState$TextStyleUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.ah70;
import defpackage.amj0;
import defpackage.avj0;
import defpackage.bh70;
import defpackage.bmj0;
import defpackage.evu0;
import defpackage.f6v;
import defpackage.g8e;
import defpackage.h6v;
import defpackage.hkt;
import defpackage.irl;
import defpackage.jdj0;
import defpackage.kkj0;
import defpackage.kyh0;
import defpackage.lkj0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.nkj0;
import defpackage.ny61;
import defpackage.okj0;
import defpackage.pud;
import defpackage.qkj0;
import defpackage.qv10;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.tf70;
import defpackage.uij0;
import defpackage.vkj0;
import defpackage.vlj0;
import defpackage.w511;
import defpackage.wkj0;
import defpackage.x4c;
import defpackage.xtb1;
import defpackage.zg70;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRequirementsRedesignEnabled", "Lf6v;", "Lufx0;", "", "Lhkt;", "gluedRequirementsIdentifiable", "Lrcx0;", "<anonymous>", "(ZLf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.GluedRequirementsUiStateInteractor$uiStateFlow$1", f = "GluedRequirementsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GluedRequirementsUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluedRequirementsUiStateInteractor$uiStateFlow$1(v vVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        GluedRequirementsUiStateInteractor$uiStateFlow$1 gluedRequirementsUiStateInteractor$uiStateFlow$1 = new GluedRequirementsUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        gluedRequirementsUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        gluedRequirementsUiStateInteractor$uiStateFlow$1.L$0 = (f6v) obj2;
        return gluedRequirementsUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v vVar;
        boolean z;
        Iterator it;
        ArrayList arrayList;
        String str;
        uij0 uij0Var;
        v vVar2;
        Pair pair;
        qkj0 okj0Var;
        qkj0 qkj0Var;
        amj0 amj0Var;
        boolean z2 = this.Z$0;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v vVar3 = this.this$0;
        h6v h6vVar = f6vVar.a;
        List list = (List) f6vVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hkt hktVar = (hkt) it2.next();
            com.yandex.go.summary.mapper.a aVar = vVar3.b;
            aVar.getClass();
            ListBuilder a = rcc.a();
            if (hktVar.b.length() > 0) {
                String str2 = hktVar.b;
                a.add(new irl(str2, hktVar.a, str2, AppColor$Palette.TextMinor, DividerUiState$CustomGroupTitleUiState$TextStyleUiState.GLUED_REQUIREMENTS_TEXT_STYLE, z2 ? x4c.E : x4c.F, SlotSize.XS));
            }
            bh70 bh70Var = hktVar.c;
            if (bh70Var instanceof ah70) {
                ArrayList<tf70> arrayList3 = ((ah70) bh70Var).a;
                arrayList = new ArrayList();
                for (tf70 tf70Var : arrayList3) {
                    String str3 = hktVar.a;
                    String str4 = tf70Var.b;
                    String str5 = tf70Var.c;
                    if (evu0.J(str4)) {
                        if (str5 == null) {
                            str5 = "";
                        }
                        vVar2 = vVar3;
                        pair = new Pair(str5, str4);
                    } else {
                        vVar2 = vVar3;
                        if (str5 == null) {
                            str5 = "";
                        }
                        pair = new Pair(str4, str5);
                    }
                    String str6 = (String) pair.getFirst();
                    String str7 = (String) pair.getSecond();
                    jdj0 jdj0Var = new jdj0(str6, str7);
                    boolean z3 = z2;
                    Iterator it3 = it2;
                    String b = com.yandex.go.summary.mapper.a.b(aVar, str6, str7, null, 12);
                    boolean z4 = tf70Var.e > 0;
                    int i = bmj0.c[tf70Var.d.ordinal()];
                    if (i == 1) {
                        okj0Var = new okj0(z4);
                    } else if (i == 2) {
                        okj0Var = new nkj0(z4);
                    } else {
                        if (i != 3) {
                            w511.b();
                            return null;
                        }
                        qkj0Var = null;
                        if (qkj0Var != null) {
                            amj0Var = null;
                        } else {
                            String str8 = tf70Var.a;
                            amj0Var = new amj0(g8e.p(str3, "_", str8), str3, true, com.yandex.go.summary.mapper.a.c(z3), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z3), null, jdj0Var, null, qkj0Var, new vlj0(str3, str8, z4, HapticEffect.ClickMedium), b, RequirementTypeUiState.DEFAULT);
                        }
                        if (amj0Var == null) {
                            arrayList.add(amj0Var);
                        }
                        vVar3 = vVar2;
                        z2 = z3;
                        it2 = it3;
                    }
                    qkj0Var = okj0Var;
                    if (qkj0Var != null) {
                    }
                    if (amj0Var == null) {
                    }
                    vVar3 = vVar2;
                    z2 = z3;
                    it2 = it3;
                }
                vVar = vVar3;
                z = z2;
                it = it2;
            } else {
                vVar = vVar3;
                z = z2;
                it = it2;
                if (!(bh70Var instanceof zg70)) {
                    w511.b();
                    return null;
                }
                ArrayList arrayList4 = ((zg70) bh70Var).a;
                arrayList = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    pud pudVar = (pud) it4.next();
                    String str9 = hktVar.a;
                    String str10 = pudVar.b;
                    int i2 = pudVar.a;
                    if (str10 == null) {
                        str10 = "";
                    }
                    if (!evu0.J(str10) || z) {
                        str = null;
                        uij0Var = new uij0(mja1.b(str10, null, 6), null, null);
                    } else {
                        str = null;
                        uij0Var = null;
                    }
                    String str11 = pudVar.c;
                    String str12 = pudVar.d;
                    jdj0 jdj0Var2 = new jdj0(str11, str12);
                    Iterator it5 = it4;
                    String b2 = com.yandex.go.summary.mapper.a.b(aVar, str11, str12, str, 12);
                    arrayList.add(new amj0(qv10.h(i2, str9, "_"), str9, true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var2, null, pudVar.e ? new lkj0(xtb1.c(), new wkj0(str9, i2, HapticEffect.Tick), ((avj0) aVar.a).h(kyh0.common_remove)) : kkj0.a, new vkj0(str9, i2, HapticEffect.ClickMedium), b2, RequirementTypeUiState.DEFAULT));
                    it4 = it5;
                }
            }
            a.addAll(arrayList);
            arrayList2.add(a.j());
            vVar3 = vVar;
            z2 = z;
            it2 = it;
        }
        return new f6v(h6vVar, arrayList2);
    }
}
