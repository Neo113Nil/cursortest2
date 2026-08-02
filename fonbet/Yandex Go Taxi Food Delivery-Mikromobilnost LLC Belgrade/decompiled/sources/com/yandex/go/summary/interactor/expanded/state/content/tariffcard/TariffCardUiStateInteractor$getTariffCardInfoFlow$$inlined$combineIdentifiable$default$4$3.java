package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.summary.model.CarouselWithPositionUiState$CarouselPosition;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import defpackage.amj0;
import defpackage.bab;
import defpackage.dex0;
import defpackage.f6v;
import defpackage.fex0;
import defpackage.h6v;
import defpackage.hz8;
import defpackage.jrl;
import defpackage.m8u0;
import defpackage.mcx0;
import defpackage.mdx0;
import defpackage.mvg;
import defpackage.nrl;
import defpackage.ny61;
import defpackage.orl;
import defpackage.prl;
import defpackage.pz8;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.rcx0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vom;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3", f = "TariffCardUiStateInteractor.kt", l = {329, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $isDebug$inlined;
    final /* synthetic */ boolean $isRequirementsRedesignEnabled$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ dex0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\n"}, d2 = {"R", CA20Status.STATUS_REQUEST_K, "Lh6v;", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3$1", f = "TariffCardUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ f6v[] $args;
        final /* synthetic */ boolean $isRequirementsRedesignEnabled$inlined;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ dex0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f6v[] f6vVarArr, Continuation continuation, dex0 dex0Var, boolean z) {
            super(2, continuation);
            this.$args = f6vVarArr;
            this.this$0 = dex0Var;
            this.$isRequirementsRedesignEnabled$inlined = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$args, continuation, this.this$0, this.$isRequirementsRedesignEnabled$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((h6v) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.collections.builders.ListBuilder] */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            List m0;
            List list2;
            List list3;
            String str;
            CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition;
            String str2;
            List list4;
            List j;
            String str3;
            ?? j2;
            String str4;
            hz8 hz8Var;
            h6v h6vVar = (h6v) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f6v[] f6vVarArr = this.$args;
            Object obj2 = f6vVarArr[0].b;
            Object obj3 = f6vVarArr[1].b;
            Object obj4 = f6vVarArr[2].b;
            Object obj5 = f6vVarArr[3].b;
            Object obj6 = f6vVarArr[4].b;
            Object obj7 = f6vVarArr[5].b;
            Object obj8 = f6vVarArr[6].b;
            Object obj9 = f6vVarArr[7].b;
            Object obj10 = f6vVarArr[8].b;
            Object obj11 = f6vVarArr[9].b;
            Object obj12 = f6vVarArr[10].b;
            Object obj13 = f6vVarArr[11].b;
            Object obj14 = f6vVarArr[12].b;
            int i = 13;
            Object obj15 = f6vVarArr[13].b;
            List list5 = (List) f6vVarArr[14].b;
            List list6 = (List) obj15;
            List list7 = (List) obj14;
            List list8 = (List) obj13;
            List list9 = (List) obj12;
            List list10 = (List) obj11;
            mdx0 mdx0Var = (mdx0) obj10;
            List list11 = (List) obj9;
            List list12 = (List) obj8;
            List list13 = (List) obj7;
            List list14 = (List) obj6;
            List list15 = (List) obj5;
            List list16 = (List) obj4;
            Triple triple = (Triple) obj3;
            Pair pair = (Pair) obj2;
            m8u0 m8u0Var = (m8u0) pair.getFirst();
            List list17 = (List) pair.getSecond();
            pz8 pz8Var = (pz8) triple.getFirst();
            List list18 = (List) triple.getSecond();
            List list19 = (List) triple.getThird();
            this.this$0.getClass();
            if (list10.isEmpty()) {
                list = list16;
                list3 = list19;
                list2 = list15;
            } else {
                List list20 = (List) kotlin.collections.a.R(list19);
                if (list20 == null) {
                    list = list16;
                    m0 = list10;
                } else {
                    list = list16;
                    m0 = kotlin.collections.a.m0(list10, list20);
                }
                list2 = list15;
                ArrayList arrayList = new ArrayList(kotlin.collections.a.J(list19, 1));
                arrayList.add(0, m0);
                list3 = arrayList;
            }
            dex0 dex0Var = this.this$0;
            ArrayList m02 = kotlin.collections.a.m0(list6, kotlin.collections.a.m0(list7, list9));
            dex0Var.getClass();
            if (!m02.isEmpty()) {
                list12 = kotlin.collections.a.m0(list12, m02);
            }
            boolean z = this.$isRequirementsRedesignEnabled$inlined;
            dex0 dex0Var2 = this.this$0;
            List list21 = list3;
            List list22 = EmptyList.a;
            Collection collection = EmptySet.a;
            if (z) {
                dex0Var2.getClass();
                hz8 hz8Var2 = pz8Var.a;
                Collection collection2 = hz8Var2 != null ? hz8Var2.b : null;
                if (collection2 != null) {
                    collection = collection2;
                }
                Set M0 = kotlin.collections.a.M0(collection);
                ArrayList f = dex0.f(list18, M0);
                ArrayList f2 = dex0.f(list8, M0);
                List list23 = list2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list23, 10));
                Iterator it = list23.iterator();
                while (it.hasNext()) {
                    arrayList2.add(dex0.f((List) it.next(), M0));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!((List) next).isEmpty()) {
                        arrayList3.add(next);
                    }
                }
                List list24 = list;
                ArrayList arrayList4 = new ArrayList(tcc.n(list24, 10));
                Iterator it3 = list24.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(dex0.f((List) it3.next(), M0));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (!((List) next2).isEmpty()) {
                        arrayList5.add(next2);
                    }
                }
                ArrayList f3 = dex0.f(list5, M0);
                ArrayList f4 = dex0.f(list14, M0);
                ArrayList f5 = dex0.f(list12, M0);
                List list25 = list21;
                ArrayList arrayList6 = new ArrayList(tcc.n(list25, 10));
                Iterator it5 = list25.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(dex0.f((List) it5.next(), M0));
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    if (!((List) next3).isEmpty()) {
                        arrayList7.add(next3);
                    }
                }
                List list26 = (List) kotlin.collections.a.R(arrayList7);
                if (list26 != null) {
                    list22 = list26;
                }
                ArrayList m03 = kotlin.collections.a.m0(list22, f5);
                List J = kotlin.collections.a.J(arrayList7, 1);
                ArrayList f6 = dex0.f(list11, M0);
                boolean z2 = (pz8Var.b != CarouselWithPositionUiState$CarouselPosition.ABOVE_MULTI_OPTIONS || list13.isEmpty() || hz8Var2 == null) ? false : true;
                ListBuilder a = rcc.a();
                a.addAll(list17);
                if (mdx0Var != null) {
                    a.add(mdx0Var);
                    dex0.e("tariff_selector_section", a);
                }
                dex0.b(dex0Var2, a, "unsupported_section", dex0.g(f, true));
                dex0.b(dex0Var2, a, "dialogue_section", dex0.g(f2, true));
                dex0Var2.a(a, "required_alt_choice_section", dex0.h("required_alt_choice_section", arrayList3, true));
                dex0Var2.a(a, "glued_section", dex0.h("glued_section", arrayList5, true));
                dex0.b(dex0Var2, a, "glued_due_section", dex0.g(f3, true));
                dex0.b(dex0Var2, a, "coupon_section", dex0.g(f4, true));
                if (!z2 || hz8Var2 == null) {
                    str4 = "carousel_section";
                    hz8Var = hz8Var2;
                } else {
                    str4 = "carousel_section";
                    dex0.d(a, str4, 8);
                    hz8Var = hz8Var2;
                    a.add(hz8Var);
                }
                ArrayList g = dex0.g(list13, false);
                if (!g.isEmpty()) {
                    a.addAll(dex0.i(dex0Var2, g, "multi_tariff_section", ((kotlin.collections.a.R(g) instanceof prl) || (kotlin.collections.a.b0(a) instanceof prl)) ? 0 : 16));
                }
                if (!list13.isEmpty()) {
                    dex0.e("carousel_solo_group_rules_section", a);
                }
                if (!z2 && hz8Var != null) {
                    dex0.d(a, str4, 8);
                    a.add(hz8Var);
                }
                dex0.b(dex0Var2, a, "solo_section", dex0.g(m03, true));
                dex0.b(dex0Var2, a, "group_section", dex0.h("group_section", J, true));
                dex0Var2.a(a, "rules_section", dex0.g(f6, true));
                dex0.d(a, "carousel_solo_group_rules_section_bottom", 16);
                ListBuilder j3 = a.j();
                j2 = new ArrayList(tcc.n(j3, 10));
                ListIterator listIterator = j3.listIterator(0);
                int i2 = 0;
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        break;
                    }
                    Object next4 = qqyVar.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    fex0 fex0Var = (rcx0) next4;
                    if (fex0Var instanceof amj0) {
                        rcx0 rcx0Var = (rcx0) kotlin.collections.a.S(i2 - 1, j3);
                        boolean z3 = (!(rcx0Var instanceof prl) || (rcx0Var instanceof orl) || (rcx0Var instanceof nrl)) ? false : true;
                        rcx0 rcx0Var2 = (rcx0) kotlin.collections.a.S(i3, j3);
                        boolean z4 = (!(rcx0Var2 instanceof prl) || (rcx0Var2 instanceof orl) || (rcx0Var2 instanceof nrl)) ? false : true;
                        fex0Var = amj0.a((amj0) fex0Var, null, (z3 && z4) ? RequirementRoundedCornersUiState.BOTH : z3 ? RequirementRoundedCornersUiState.TOP : z4 ? RequirementRoundedCornersUiState.BOTTOM : RequirementRoundedCornersUiState.NONE, 8175);
                    }
                    j2.add(fex0Var);
                    i2 = i3;
                }
            } else {
                List list27 = list12;
                dex0Var2.getClass();
                hz8 hz8Var3 = pz8Var.a;
                CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition2 = pz8Var.b;
                Collection collection3 = hz8Var3 != null ? hz8Var3.b : null;
                if (collection3 != null) {
                    collection = collection3;
                }
                Set M02 = kotlin.collections.a.M0(collection);
                hz8 hz8Var4 = pz8Var.a;
                if (hz8Var4 == null) {
                    carouselWithPositionUiState$CarouselPosition = carouselWithPositionUiState$CarouselPosition2;
                    j = list22;
                    list4 = list14;
                    str2 = "coupon_section";
                    str = "carousel_section";
                } else {
                    str = "carousel_section";
                    carouselWithPositionUiState$CarouselPosition = carouselWithPositionUiState$CarouselPosition2;
                    str2 = "coupon_section";
                    jrl jrlVar = new jrl("carousel_section_top", 8);
                    list4 = list14;
                    jrl jrlVar2 = new jrl("carousel_section_bottom", 16);
                    ListBuilder a2 = rcc.a();
                    a2.add(jrlVar);
                    a2.add(hz8Var4);
                    a2.add(jrlVar2);
                    j = a2.j();
                }
                ListBuilder a3 = rcc.a();
                a3.addAll(list17);
                if (mdx0Var != null) {
                    dex0.e("tariff_selector_section", a3);
                    a3.add(mdx0Var);
                }
                dex0.c(a3, "unsupported_section", dex0.g(dex0.f(list18, M02), false));
                dex0.c(a3, "dialogue_section", dex0.g(dex0.f(list8, M02), false));
                List list28 = list2;
                ArrayList arrayList8 = new ArrayList(tcc.n(list28, 10));
                Iterator it7 = list28.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(dex0.f((List) it7.next(), M02));
                }
                dex0.c(a3, "required_alt_choice_section", dex0.h("required_alt_choice_section", arrayList8, false));
                List list29 = list;
                ArrayList arrayList9 = new ArrayList(tcc.n(list29, 10));
                Iterator it8 = list29.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(dex0.f((List) it8.next(), M02));
                }
                dex0.c(a3, "glued_section", dex0.h("glued_section", arrayList9, false));
                dex0.c(a3, "glued_due_section", dex0.g(dex0.f(list5, M02), false));
                dex0.c(a3, str2, dex0.g(dex0.f(list4, M02), false));
                CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition3 = carouselWithPositionUiState$CarouselPosition;
                if (carouselWithPositionUiState$CarouselPosition3 == CarouselWithPositionUiState$CarouselPosition.ABOVE_MULTI_OPTIONS) {
                    str3 = str;
                    dex0.c(a3, str3, j);
                } else {
                    str3 = str;
                }
                dex0.c(a3, "multi_tariff_section", dex0.g(list13, false));
                if (carouselWithPositionUiState$CarouselPosition3 == CarouselWithPositionUiState$CarouselPosition.ABOVE_REQUIREMENTS) {
                    dex0.c(a3, str3, j);
                }
                dex0.c(a3, "solo_section", dex0.g(dex0.f(list27, M02), false));
                List list30 = list21;
                ArrayList arrayList10 = new ArrayList(tcc.n(list30, 10));
                Iterator it9 = list30.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(dex0.f((List) it9.next(), M02));
                }
                dex0.c(a3, "group_section", dex0.h("group_section", arrayList10, false));
                a3.addAll(dex0.g(dex0.f(list11, M02), false));
                j2 = a3.j();
            }
            return new f6v(h6vVar, new mcx0(m8u0Var, com.yandex.go.design.compose.list.a.a(j2, vom.M, new bab(i, this.this$0))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3(Continuation continuation, boolean z, dex0 dex0Var, boolean z2) {
        super(3, continuation);
        this.$isDebug$inlined = z;
        this.this$0 = dex0Var;
        this.$isRequirementsRedesignEnabled$inlined = z2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3 tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3 = new TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3((Continuation) obj3, this.$isDebug$inlined, this.this$0, this.$isRequirementsRedesignEnabled$inlined);
        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3.L$0 = (vpr) obj;
        tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3.L$1 = (Object[]) obj2;
        return tariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$4$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r0.emit(r10, r9) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f6v[] f6vVarArr = (f6v[]) objArr;
            boolean z = this.$isDebug$inlined;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(f6vVarArr, null, this.this$0, this.$isRequirementsRedesignEnabled$inlined);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            obj = ru.yandex.taxi.requirements.utils.c.a(f6vVarArr, z, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
