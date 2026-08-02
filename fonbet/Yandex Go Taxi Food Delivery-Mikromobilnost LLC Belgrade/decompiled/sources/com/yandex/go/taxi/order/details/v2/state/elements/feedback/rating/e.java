package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import com.yandex.go.taxi.order.models.api.response.a7;
import com.yandex.go.taxi.order.models.api.response.n5;
import defpackage.aog0;
import defpackage.bdc;
import defpackage.dvw;
import defpackage.ebv;
import defpackage.evu0;
import defpackage.g92;
import defpackage.iak0;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.j1;
import defpackage.j18;
import defpackage.jgv;
import defpackage.kdc;
import defpackage.lck0;
import defpackage.mdh;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pfv;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.rol0;
import defpackage.si3;
import defpackage.sjh;
import defpackage.sqs0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v8i0;
import defpackage.xng0;
import defpackage.yjk0;
import defpackage.ymu;
import defpackage.z9b;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public abstract class e {
    public final Context a;
    public final o2y0 b;
    public final sqs0 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final jgv e;
    public final tt2 f;
    public final pwy0 g;

    public e(Context context, o2y0 o2y0Var, sqs0 sqs0Var, ru.yandex.taxi.widget.utils.e eVar, jgv jgvVar, tt2 tt2Var, pwy0 pwy0Var) {
        this.a = context;
        this.b = o2y0Var;
        this.c = sqs0Var;
        this.d = eVar;
        this.e = jgvVar;
        this.f = tt2Var;
        this.g = pwy0Var;
    }

    public static final ibk0 a(e eVar, b2 b2Var) {
        ibk0 a = ijk0.a(eVar.c.a(b2Var));
        return a == null ? new iak0("change_rating", 0) : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, String str, ContinuationImpl continuationImpl) {
        RideCardBaseRatingSelectorDataSource$loadUnselectedImage$1 rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1;
        int i;
        Pair pair;
        eVar.getClass();
        if (continuationImpl instanceof RideCardBaseRatingSelectorDataSource$loadUnselectedImage$1) {
            rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1 = (RideCardBaseRatingSelectorDataSource$loadUnselectedImage$1) continuationImpl;
            int i2 = rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.utils.e eVar2 = eVar.d;
                    rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.L$0 = str;
                    rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.label = 1;
                    eVar2.getClass();
                    if (str == null || evu0.J(str)) {
                        obj = null;
                    } else {
                        j18 j18Var = new j18(1, dvw.b(rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1));
                        j18Var.u();
                        j18Var.w(new j1(17, eVar2.b.b().b(str).g(0, 0).e(pfv.a).h(new ymu(27, new si3(j18Var, 10), new z9b(3, j18Var, eVar2)))));
                        obj = j18Var.s();
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.L$0;
                    kotlin.b.b(obj);
                }
                pair = (Pair) obj;
                if (pair != null) {
                    return null;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) pair.getFirst();
                ebv ebvVar = (ebv) pair.getSecond();
                if (ebvVar != null && ebvVar.a) {
                    z = true;
                }
                if (z) {
                    bitmapDrawable.mutate();
                    bitmapDrawable.setColorFilter(new PorterDuffColorFilter(qje.t(xng0.controlMinor, eVar.a), PorterDuff.Mode.SRC_IN));
                }
                return pkf.g(bitmapDrawable, str + z, null);
            }
        }
        rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1 = new RideCardBaseRatingSelectorDataSource$loadUnselectedImage$1(eVar, continuationImpl);
        Object obj2 = rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$loadUnselectedImage$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        if (pair != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, String str, kdc kdcVar, ContinuationImpl continuationImpl) {
        RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1 rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1) {
            rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1 = (RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1) continuationImpl;
            int i2 = rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eVar.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1 rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1 = new RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1(eVar, str, null);
                    rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.L$0 = str;
                    rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.L$1 = kdcVar;
                    rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.label = 1;
                    obj = tje.k0(mdhVar, rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$cached$1, rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kdcVar = (kdc) rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.L$1;
                    str = (String) rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                return uiStateDrawableWrapper == null ? new g92(2, new v8i0(uiStateDrawableWrapper, kdcVar)) : new rol0(new RideCardBaseRatingSelectorDataSource$decorationFlow$1(eVar, kdcVar, new RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$2(eVar, str, null), null));
            }
        }
        rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1 = new RideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1(eVar, continuationImpl);
        Object obj2 = rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$selectedDecorationFlow$1.label;
        if (i != 0) {
        }
        UiStateDrawableWrapper uiStateDrawableWrapper2 = (UiStateDrawableWrapper) obj2;
        if (uiStateDrawableWrapper2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r11 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, String str, kdc kdcVar, ContinuationImpl continuationImpl) {
        RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1 rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1;
        int i;
        boolean booleanValue;
        String str2;
        kdc kdcVar2;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        tt2 tt2Var = eVar.f;
        if (continuationImpl instanceof RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1) {
            rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1 = (RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1) continuationImpl;
            int i2 = rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1 rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1 = new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1(eVar, str, null);
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$0 = str;
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$1 = kdcVar;
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label = 1;
                    obj = tje.k0(mdhVar, rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1, rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kdcVar2 = (kdc) rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$1;
                        str2 = (String) rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$0;
                        kotlin.b.b(obj);
                        uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                        if (uiStateDrawableWrapper == null) {
                            return new g92(2, new v8i0(uiStateDrawableWrapper, kdcVar2));
                        }
                        String str3 = str2;
                        kdcVar = kdcVar2;
                        str = str3;
                        return new rol0(new RideCardBaseRatingSelectorDataSource$decorationFlow$1(eVar, kdcVar, new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2(eVar, str, null), null));
                    }
                    kdcVar = (kdc) rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$1;
                    str = (String) rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    tt2Var.getClass();
                    sjh sjhVar2 = uyj.a;
                    mdh mdhVar2 = mdh.b;
                    RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$image$1 rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$image$1 = new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$image$1(eVar, str, null);
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$0 = str;
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.L$1 = kdcVar;
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.Z$0 = booleanValue;
                    rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label = 2;
                    obj = tje.k0(mdhVar2, rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$image$1, rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1);
                    if (obj != coroutineSingletons) {
                        kdc kdcVar3 = kdcVar;
                        str2 = str;
                        kdcVar2 = kdcVar3;
                        uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                        if (uiStateDrawableWrapper == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return new rol0(new RideCardBaseRatingSelectorDataSource$decorationFlow$1(eVar, kdcVar, new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2(eVar, str, null), null));
            }
        }
        rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1 = new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1(eVar, continuationImpl);
        Object obj2 = rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return new rol0(new RideCardBaseRatingSelectorDataSource$decorationFlow$1(eVar, kdcVar, new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2(eVar, str, null), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(n7v n7vVar, ContinuationImpl continuationImpl) {
        RideCardBaseRatingSelectorDataSource$backgroundFlow$1 rideCardBaseRatingSelectorDataSource$backgroundFlow$1;
        int i;
        String a;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        tpr l;
        if (continuationImpl instanceof RideCardBaseRatingSelectorDataSource$backgroundFlow$1) {
            rideCardBaseRatingSelectorDataSource$backgroundFlow$1 = (RideCardBaseRatingSelectorDataSource$backgroundFlow$1) continuationImpl;
            int i2 = rideCardBaseRatingSelectorDataSource$backgroundFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$backgroundFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardBaseRatingSelectorDataSource$backgroundFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$backgroundFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = this.e.a(n7vVar);
                    if (a == null) {
                        return new g92(2, null);
                    }
                    this.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RideCardBaseRatingSelectorDataSource$backgroundFlow$background$1 rideCardBaseRatingSelectorDataSource$backgroundFlow$background$1 = new RideCardBaseRatingSelectorDataSource$backgroundFlow$background$1(this, a, null);
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$1.L$0 = null;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$1.L$1 = a;
                    rideCardBaseRatingSelectorDataSource$backgroundFlow$1.label = 1;
                    obj = tje.k0(mdhVar, rideCardBaseRatingSelectorDataSource$backgroundFlow$background$1, rideCardBaseRatingSelectorDataSource$backgroundFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (String) rideCardBaseRatingSelectorDataSource$backgroundFlow$1.L$1;
                    kotlin.b.b(obj);
                }
                uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                if (uiStateDrawableWrapper == null) {
                    return new g92(2, uiStateDrawableWrapper);
                }
                l = this.d.l(a, 0, 0, pfv.a);
                return new b(l, a);
            }
        }
        rideCardBaseRatingSelectorDataSource$backgroundFlow$1 = new RideCardBaseRatingSelectorDataSource$backgroundFlow$1(this, continuationImpl);
        Object obj2 = rideCardBaseRatingSelectorDataSource$backgroundFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$backgroundFlow$1.label;
        if (i != 0) {
        }
        uiStateDrawableWrapper = (UiStateDrawableWrapper) obj2;
        if (uiStateDrawableWrapper == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(a7 a7Var, lck0 lck0Var, ContinuationImpl continuationImpl) {
        RideCardBaseRatingSelectorDataSource$baseStateFlow$1 rideCardBaseRatingSelectorDataSource$baseStateFlow$1;
        int i;
        Object obj;
        b2 b2Var;
        tpr tprVar;
        if (continuationImpl instanceof RideCardBaseRatingSelectorDataSource$baseStateFlow$1) {
            rideCardBaseRatingSelectorDataSource$baseStateFlow$1 = (RideCardBaseRatingSelectorDataSource$baseStateFlow$1) continuationImpl;
            int i2 = rideCardBaseRatingSelectorDataSource$baseStateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardBaseRatingSelectorDataSource$baseStateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardBaseRatingSelectorDataSource$baseStateFlow$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardBaseRatingSelectorDataSource$baseStateFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!ijk0.b(a7Var)) {
                        return new g92(2, new yjk0(a7Var.getA()));
                    }
                    n5 n5Var = a7Var instanceof n5 ? (n5) a7Var : null;
                    if (n5Var == null) {
                        return new g92(2, new yjk0(a7Var.getA()));
                    }
                    b2 d = n5Var.getD();
                    List f = n5Var.getF();
                    tpr t = kotlinx.coroutines.flow.e.t(new m0(g(f, RideCardItemDto$CoherentRatingSelector.DecorationStateType.SELECTED), g(f, RideCardItemDto$CoherentRatingSelector.DecorationStateType.UNSELECTED), new RideCardBaseRatingSelectorDataSource$itemsDecorationFlow$1(this, null)));
                    n7v e = n5Var.getE();
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$0 = null;
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$1 = lck0Var;
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$2 = null;
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$3 = d;
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$4 = t;
                    rideCardBaseRatingSelectorDataSource$baseStateFlow$1.label = 1;
                    Object e2 = e(e, rideCardBaseRatingSelectorDataSource$baseStateFlow$1);
                    if (e2 == obj3) {
                        return obj3;
                    }
                    obj = e2;
                    b2Var = d;
                    tprVar = t;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar = (tpr) rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$4;
                    b2 b2Var2 = (b2) rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$3;
                    lck0 lck0Var2 = (lck0) rideCardBaseRatingSelectorDataSource$baseStateFlow$1.L$1;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    b2Var = b2Var2;
                    lck0Var = lck0Var2;
                }
                o2y0 o2y0Var = this.b;
                return kotlinx.coroutines.flow.e.m(tprVar, (tpr) obj, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(o2y0Var.a(), new RideCardBaseRatingSelectorDataSource$ratingFlow$1(2, null))), kotlinx.coroutines.flow.e.t(new d(kotlinx.coroutines.flow.e.I(o2y0Var.a(), RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$1.a))), new RideCardBaseRatingSelectorDataSource$baseStateFlow$2(lck0Var, this, b2Var, null));
            }
        }
        rideCardBaseRatingSelectorDataSource$baseStateFlow$1 = new RideCardBaseRatingSelectorDataSource$baseStateFlow$1(this, continuationImpl);
        Object obj22 = rideCardBaseRatingSelectorDataSource$baseStateFlow$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardBaseRatingSelectorDataSource$baseStateFlow$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = this.b;
        return kotlinx.coroutines.flow.e.m(tprVar, (tpr) obj, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(o2y0Var2.a(), new RideCardBaseRatingSelectorDataSource$ratingFlow$1(2, null))), kotlinx.coroutines.flow.e.t(new d(kotlinx.coroutines.flow.e.I(o2y0Var2.a(), RideCardBaseRatingSelectorDataSource$needOldStarsInRatingSelectorFlow$1.a))), new RideCardBaseRatingSelectorDataSource$baseStateFlow$2(lck0Var, this, b2Var, null));
    }

    public final tpr g(List list, RideCardItemDto$CoherentRatingSelector.DecorationStateType decorationStateType) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj).a == decorationStateType) {
                break;
            }
        }
        RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState ratingItemDecorationState = (RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState) obj;
        if (ratingItemDecorationState == null) {
            return new g92(2, v8i0.c);
        }
        kdc a = this.d.a(ratingItemDecorationState.c);
        if (decorationStateType == RideCardItemDto$CoherentRatingSelector.DecorationStateType.SELECTED && a == null) {
            a = new bdc(aog0.decoratedRatingBarStarColor);
        }
        return kotlinx.coroutines.flow.e.X(this.g.a(), new RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1(null, this, ratingItemDecorationState, decorationStateType, a));
    }
}
