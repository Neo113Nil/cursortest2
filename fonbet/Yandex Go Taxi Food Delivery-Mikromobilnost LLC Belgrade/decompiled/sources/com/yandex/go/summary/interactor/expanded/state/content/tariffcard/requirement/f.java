package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.model.CarouselWithPositionUiState$CarouselPosition;
import com.yandex.go.tariffcard.ui.model.CarouselWithPosition$Position;
import defpackage.ajz0;
import defpackage.au2;
import defpackage.avj0;
import defpackage.ax8;
import defpackage.bpl0;
import defpackage.bx8;
import defpackage.cq91;
import defpackage.cx8;
import defpackage.d47;
import defpackage.dx8;
import defpackage.ex8;
import defpackage.f6v;
import defpackage.h6v;
import defpackage.hx8;
import defpackage.hz8;
import defpackage.iz8;
import defpackage.jfv;
import defpackage.jz8;
import defpackage.kyh0;
import defpackage.mja1;
import defpackage.mq5;
import defpackage.nlb1;
import defpackage.nw8;
import defpackage.ny61;
import defpackage.ox8;
import defpackage.oz8;
import defpackage.px8;
import defpackage.pz8;
import defpackage.qx8;
import defpackage.scc;
import defpackage.sx8;
import defpackage.tcc;
import defpackage.tx8;
import defpackage.ux8;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wkb1;
import defpackage.x2v0;
import defpackage.xtb1;
import defpackage.yfv;
import defpackage.zh;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ jz8 b;

    public f(vpr vprVar, jz8 jz8Var) {
        this.a = vprVar;
        this.b = jz8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0381 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Throwable] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1 carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1;
        int i;
        CoroutineSingletons coroutineSingletons;
        jz8 jz8Var;
        hz8 hz8Var;
        int i2;
        Object obj2;
        CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition;
        Object emit;
        CoroutineSingletons coroutineSingletons2;
        jz8 jz8Var2;
        Iterator it;
        CoroutineSingletons coroutineSingletons3;
        jfv jfvVar;
        hx8 hx8Var;
        hx8 hx8Var2;
        hx8 hx8Var3;
        if (continuation instanceof CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1) {
            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1 = (CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1) continuation;
            int i3 = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label;
                jfv jfvVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    f6v f6vVar = (f6v) obj;
                    h6v h6vVar = f6vVar.a;
                    oz8 oz8Var = (oz8) f6vVar.b;
                    jz8 jz8Var3 = this.b;
                    if (oz8Var != null) {
                        jz8Var3.getClass();
                        List list = oz8Var.a.c;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it2 = list.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                ?? r13 = jfvVar2;
                                scc.m();
                                throw r13;
                            }
                            ux8 ux8Var = (ux8) next;
                            nw8 nw8Var = jz8Var3.g;
                            zuj0 zuj0Var = nw8Var.a;
                            if (ux8Var instanceof ox8) {
                                ox8 ox8Var = (ox8) ux8Var;
                                String str = ox8Var.d;
                                if (str == null) {
                                    str = "";
                                }
                                yfv yfvVar = new yfv(mja1.b(str, jfvVar2, 6));
                                String str2 = ox8Var.b;
                                AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                                ajz0 ajz0Var = new ajz0(str2, appColor$Palette);
                                au2 b = nlb1.b();
                                jz8Var2 = jz8Var3;
                                String str3 = ox8Var.c;
                                it = it2;
                                hx8Var3 = new hx8(ox8Var.a, ox8Var.c(), ox8Var.a, AppColor$Palette.BgMinor, yfvVar, ajz0Var, null, new d47(b, str3, appColor$Palette, AppColor$Palette.BgFloating), new bx8(ox8Var.a, ox8Var.f, i4, HapticEffect.ClickMedium), new zh(null, nw8.c(nw8Var, str2, null, str3, 2), null));
                            } else {
                                jz8Var2 = jz8Var3;
                                it = it2;
                                if (ux8Var instanceof px8) {
                                    px8 px8Var = (px8) ux8Var;
                                    String str4 = px8Var.c;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    yfv yfvVar2 = new yfv(mja1.b(str4, null, 6));
                                    String str5 = px8Var.b;
                                    AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
                                    ajz0 ajz0Var2 = new ajz0(str5, appColor$Palette2);
                                    au2 i6 = px8Var.d ? wkb1.i() : cq91.b();
                                    boolean z = px8Var.d;
                                    if (z) {
                                        appColor$Palette2 = AppColor$Palette.TextOnControl;
                                    }
                                    hx8Var3 = new hx8(px8Var.a, px8Var.c(), px8Var.j, AppColor$Palette.BgMinor, yfvVar2, ajz0Var2, null, new d47(i6, null, appColor$Palette2, z ? AppColor$Palette.Control : AppColor$Palette.BgFloating), new ax8(px8Var.a, z, px8Var.h, i4, z ? HapticEffect.Tick : HapticEffect.ClickMedium), new zh(z ? ((avj0) zuj0Var).h(kyh0.common_remove) : null, nw8.c(nw8Var, str5, null, null, 6), null));
                                } else {
                                    if (ux8Var instanceof qx8) {
                                        qx8 qx8Var = (qx8) ux8Var;
                                        String str6 = qx8Var.c;
                                        boolean z2 = qx8Var.d;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        yfv yfvVar3 = new yfv(mja1.b(str6, null, 6));
                                        String str7 = qx8Var.b;
                                        AppColor$Palette appColor$Palette3 = AppColor$Palette.Text;
                                        ajz0 ajz0Var3 = new ajz0(str7, appColor$Palette3);
                                        au2 i7 = z2 ? wkb1.i() : cq91.b();
                                        if (z2) {
                                            appColor$Palette3 = AppColor$Palette.TextOnControl;
                                        }
                                        hx8Var2 = new hx8(qx8Var.a, qx8Var.c(), qx8Var.a, AppColor$Palette.BgMinor, yfvVar3, ajz0Var3, null, new d47(i7, null, appColor$Palette3, z2 ? AppColor$Palette.Control : AppColor$Palette.BgFloating), new ex8(qx8Var.a, z2, i4, HapticEffect.Tick), new zh(null, nw8.c(nw8Var, str7, null, null, 6), Boolean.valueOf(z2)));
                                        coroutineSingletons3 = coroutineSingletons4;
                                    } else if (ux8Var instanceof sx8) {
                                        sx8 sx8Var = (sx8) ux8Var;
                                        String str8 = sx8Var.c;
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        yfv yfvVar4 = new yfv(mja1.b(str8, null, 6));
                                        String str9 = sx8Var.b;
                                        ajz0 ajz0Var4 = new ajz0(str9, AppColor$Palette.Text);
                                        avj0 avj0Var = (avj0) zuj0Var;
                                        String h = avj0Var.h(kyh0.requirements_carousel_unavailable_for_tariff);
                                        AppColor$Palette appColor$Palette4 = AppColor$Palette.Error;
                                        x2v0 x2v0Var = new x2v0(h, appColor$Palette4);
                                        coroutineSingletons3 = coroutineSingletons4;
                                        d47 d47Var = new d47(xtb1.c(), null, appColor$Palette4, AppColor$Palette.BgFloating);
                                        String str10 = sx8Var.a;
                                        List list2 = sx8Var.d;
                                        if (list2 == null) {
                                            list2 = EmptyList.a;
                                        }
                                        hx8Var2 = new hx8(sx8Var.a, sx8Var.f, sx8Var.e, AppColor$Palette.BgMinor, yfvVar4, ajz0Var4, x2v0Var, d47Var, new dx8(str10, list2, i4, HapticEffect.Tick), new zh(avj0Var.h(kyh0.common_remove), nw8.c(nw8Var, str9, h, null, 4), null));
                                    } else {
                                        coroutineSingletons3 = coroutineSingletons4;
                                        if (!(ux8Var instanceof tx8)) {
                                            w511.b();
                                            return null;
                                        }
                                        tx8 tx8Var = (tx8) ux8Var;
                                        String str11 = tx8Var.f;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        yfv yfvVar5 = new yfv(mja1.b(str11, null, 6));
                                        String str12 = tx8Var.e;
                                        AppColor$Palette appColor$Palette5 = AppColor$Palette.Text;
                                        ajz0 ajz0Var5 = new ajz0(str12, appColor$Palette5);
                                        String h2 = ((avj0) zuj0Var).h(kyh0.requirements_carousel_unavailable_for_tariff);
                                        x2v0 x2v0Var2 = new x2v0(h2, AppColor$Palette.Error);
                                        au2 b2 = nlb1.b();
                                        String str13 = tx8Var.c;
                                        jfvVar = null;
                                        hx8Var = new hx8(tx8Var.a, tx8Var.i, tx8Var.h, AppColor$Palette.BgMinor, yfvVar5, ajz0Var5, x2v0Var2, new d47(b2, str13, appColor$Palette5, AppColor$Palette.BgFloating), new cx8(tx8Var.a, tx8Var.d, tx8Var.b, i4, HapticEffect.ClickMedium), new zh(null, nw8.b(str12, h2, str13), null));
                                        arrayList.add(hx8Var);
                                        jfvVar2 = jfvVar;
                                        i4 = i5;
                                        coroutineSingletons4 = coroutineSingletons3;
                                        jz8Var3 = jz8Var2;
                                        it2 = it;
                                    }
                                    hx8Var = hx8Var2;
                                    jfvVar = null;
                                    arrayList.add(hx8Var);
                                    jfvVar2 = jfvVar;
                                    i4 = i5;
                                    coroutineSingletons4 = coroutineSingletons3;
                                    jz8Var3 = jz8Var2;
                                    it2 = it;
                                }
                            }
                            coroutineSingletons3 = coroutineSingletons4;
                            hx8Var = hx8Var3;
                            jfvVar = null;
                            arrayList.add(hx8Var);
                            jfvVar2 = jfvVar;
                            i4 = i5;
                            coroutineSingletons4 = coroutineSingletons3;
                            jz8Var3 = jz8Var2;
                            it2 = it;
                        }
                        coroutineSingletons = coroutineSingletons4;
                        jz8Var = jz8Var3;
                        bpl0 b3 = com.yandex.go.design.compose.list.a.b(arrayList, new mq5(13));
                        if (!b3.a.isEmpty()) {
                            hz8Var = new hz8(b3);
                            jz8Var.getClass();
                            CarouselWithPosition$Position carouselWithPosition$Position = oz8Var == null ? oz8Var.b : null;
                            i2 = carouselWithPosition$Position != null ? -1 : iz8.a[carouselWithPosition$Position.ordinal()];
                            if (i2 != -1) {
                                if (i2 == 1) {
                                    obj2 = null;
                                    carouselWithPositionUiState$CarouselPosition = CarouselWithPositionUiState$CarouselPosition.ABOVE_MULTI_OPTIONS;
                                    f6v f6vVar2 = new f6v(h6vVar, new pz8(hz8Var, carouselWithPositionUiState$CarouselPosition));
                                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$0 = obj2;
                                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$1 = obj2;
                                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$2 = obj2;
                                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$3 = obj2;
                                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                                    emit = this.a.emit(f6vVar2, carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1);
                                    coroutineSingletons2 = coroutineSingletons;
                                    if (emit == coroutineSingletons2) {
                                        return coroutineSingletons2;
                                    }
                                } else if (i2 != 2) {
                                    w511.b();
                                    return null;
                                }
                            }
                            obj2 = null;
                            carouselWithPositionUiState$CarouselPosition = CarouselWithPositionUiState$CarouselPosition.ABOVE_REQUIREMENTS;
                            f6v f6vVar22 = new f6v(h6vVar, new pz8(hz8Var, carouselWithPositionUiState$CarouselPosition));
                            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$0 = obj2;
                            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$1 = obj2;
                            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$2 = obj2;
                            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$3 = obj2;
                            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                            emit = this.a.emit(f6vVar22, carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1);
                            coroutineSingletons2 = coroutineSingletons;
                            if (emit == coroutineSingletons2) {
                            }
                        }
                    } else {
                        coroutineSingletons = coroutineSingletons4;
                        jz8Var = jz8Var3;
                    }
                    hz8Var = null;
                    jz8Var.getClass();
                    if (oz8Var == null) {
                    }
                    if (carouselWithPosition$Position != null) {
                    }
                    if (i2 != -1) {
                    }
                    obj2 = null;
                    carouselWithPositionUiState$CarouselPosition = CarouselWithPositionUiState$CarouselPosition.ABOVE_REQUIREMENTS;
                    f6v f6vVar222 = new f6v(h6vVar, new pz8(hz8Var, carouselWithPositionUiState$CarouselPosition));
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$0 = obj2;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$1 = obj2;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$2 = obj2;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.L$3 = obj2;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label = 1;
                    emit = this.a.emit(f6vVar222, carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1);
                    coroutineSingletons2 = coroutineSingletons;
                    if (emit == coroutineSingletons2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1 = new CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1(this, continuation);
        Object obj32 = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$2$1.label;
        jfv jfvVar22 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
