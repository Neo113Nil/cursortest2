package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details;

import defpackage.avj0;
import defpackage.cmf0;
import defpackage.jrj;
import defpackage.k7x0;
import defpackage.krj;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wlf0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ krj b;
    public final /* synthetic */ wlf0 c;
    public final /* synthetic */ cmf0 w;

    public b(vpr vprVar, krj krjVar, wlf0 wlf0Var, cmf0 cmf0Var) {
        this.a = vprVar;
        this.b = krjVar;
        this.c = wlf0Var;
        this.w = cmf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1 discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1;
        int i;
        int i2;
        if (continuation instanceof DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1) {
            discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1 = (DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1) continuation;
            int i3 = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    krj krjVar = this.b;
                    mrj mrjVar = krjVar.c;
                    mrj mrjVar2 = krjVar.c;
                    mrjVar.getClass();
                    cmf0 cmf0Var = this.w;
                    CharSequence charSequence = cmf0Var.a;
                    wlf0 wlf0Var = this.c;
                    DiscountsPromoCodeDetailsUiStateMapper$DiscountsPromoCodeDetailsExtendedStatus a = d.a(wlf0Var);
                    int[] iArr = e.a;
                    int i4 = iArr[a.ordinal()];
                    if (i4 == 1) {
                        i2 = mqg0.component_red_toxic;
                    } else if (i4 == 2) {
                        i2 = mqg0.component_gray_400;
                    } else if (i4 == 3) {
                        i2 = mqg0.component_blue_normal;
                    } else {
                        if (i4 != 4) {
                            w511.b();
                            return null;
                        }
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        charSequence = d.b(charSequence, new ForegroundColorSpanFix(((avj0) ((zuj0) mrjVar.b)).a(i2)));
                    }
                    zuj0 zuj0Var = (zuj0) mrjVar2.b;
                    int i5 = iArr[d.a(wlf0Var).ordinal()] == 2 ? mqg0.component_gray_400 : 0;
                    ArrayList arrayList = cmf0Var.b;
                    CharSequence charSequence2 = charSequence;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zuj0 zuj0Var2 = zuj0Var;
                        arrayList2.add(d.b((CharSequence) it.next(), new AbsoluteSizeSpanFix((int) ((avj0) zuj0Var2).b(mrg0.component_text_size_body), false), i5 != 0 ? new ForegroundColorSpanFix(((avj0) zuj0Var).a(i5)) : null));
                        zuj0Var = zuj0Var2;
                    }
                    zuj0 zuj0Var3 = (zuj0) mrjVar2.b;
                    int i6 = e.a[d.a(wlf0Var).ordinal()] == 2 ? mqg0.component_gray_400 : 0;
                    ArrayList arrayList3 = cmf0Var.c;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        zuj0 zuj0Var4 = zuj0Var3;
                        arrayList4.add(d.b((CharSequence) it2.next(), new AbsoluteSizeSpanFix((int) ((avj0) zuj0Var4).b(mrg0.component_text_size_body), false), i6 != 0 ? new ForegroundColorSpanFix(((avj0) zuj0Var3).a(i6)) : null));
                        zuj0Var3 = zuj0Var4;
                    }
                    mrjVar2.getClass();
                    String str = cmf0Var.d;
                    if (str == null) {
                        str = "";
                    }
                    jrj jrjVar = new jrj(charSequence2, arrayList2, arrayList4, str.length() != 0 ? ((m7x0) ((k7x0) mrjVar2.c)).a(str) : null, EmptyList.a);
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jrjVar, discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1 = new DiscountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discountsPromoCodeDetailsUiStateInteractor$informationUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
