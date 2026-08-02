package com.yandex.go.scooters.passes.purchase.packages;

import android.content.Context;
import defpackage.avj0;
import defpackage.bia0;
import defpackage.d8o0;
import defpackage.e8o0;
import defpackage.eq2;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ly3;
import defpackage.ny61;
import defpackage.o8o0;
import defpackage.oyr;
import defpackage.r8o0;
import defpackage.s8o0;
import defpackage.yp2;
import defpackage.z8o0;
import defpackage.zgz;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class i {
    public final Context a;
    public final zuj0 b;
    public final yp2 c;
    public final ru.yandex.taxi.widget.c d;
    public final bia0 e;

    public i(Context context, zuj0 zuj0Var, yp2 yp2Var, ru.yandex.taxi.widget.c cVar, bia0 bia0Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = yp2Var;
        this.d = cVar;
        this.e = bia0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, r8o0 r8o0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiStateMapper$map$1 scootersPackagesPurchaseUiStateMapper$map$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof ScootersPackagesPurchaseUiStateMapper$map$1) {
            scootersPackagesPurchaseUiStateMapper$map$1 = (ScootersPackagesPurchaseUiStateMapper$map$1) continuationImpl;
            int i2 = scootersPackagesPurchaseUiStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                ScootersPackagesPurchaseUiStateMapper$map$1 scootersPackagesPurchaseUiStateMapper$map$12 = scootersPackagesPurchaseUiStateMapper$map$1;
                Object obj = scootersPackagesPurchaseUiStateMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiStateMapper$map$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = iVar.d;
                    FormattedText formattedText = r8o0Var.a;
                    scootersPackagesPurchaseUiStateMapper$map$12.L$0 = r8o0Var;
                    scootersPackagesPurchaseUiStateMapper$map$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersPackagesPurchaseUiStateMapper$map$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8o0Var = (r8o0) scootersPackagesPurchaseUiStateMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                return new d8o0((CharSequence) obj, ly3.g(eq2.a, iVar.c, r8o0Var.b));
            }
        }
        scootersPackagesPurchaseUiStateMapper$map$1 = new ScootersPackagesPurchaseUiStateMapper$map$1(iVar, continuationImpl);
        ScootersPackagesPurchaseUiStateMapper$map$1 scootersPackagesPurchaseUiStateMapper$map$122 = scootersPackagesPurchaseUiStateMapper$map$1;
        Object obj2 = scootersPackagesPurchaseUiStateMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiStateMapper$map$122.label;
        if (i != 0) {
        }
        return new d8o0((CharSequence) obj2, ly3.g(eq2.a, iVar.c, r8o0Var.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r12 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, s8o0 s8o0Var, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiStateMapper$map$2 scootersPackagesPurchaseUiStateMapper$map$2;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        iVar.getClass();
        if (continuationImpl instanceof ScootersPackagesPurchaseUiStateMapper$map$2) {
            scootersPackagesPurchaseUiStateMapper$map$2 = (ScootersPackagesPurchaseUiStateMapper$map$2) continuationImpl;
            int i2 = scootersPackagesPurchaseUiStateMapper$map$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiStateMapper$map$2.label = i2 - Integer.MIN_VALUE;
                ScootersPackagesPurchaseUiStateMapper$map$2 scootersPackagesPurchaseUiStateMapper$map$22 = scootersPackagesPurchaseUiStateMapper$map$2;
                Object obj = scootersPackagesPurchaseUiStateMapper$map$22.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiStateMapper$map$22.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = iVar.d;
                    FormattedText formattedText = s8o0Var.a;
                    scootersPackagesPurchaseUiStateMapper$map$22.L$0 = s8o0Var;
                    scootersPackagesPurchaseUiStateMapper$map$22.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersPackagesPurchaseUiStateMapper$map$22, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersPackagesPurchaseUiStateMapper$map$22.L$1;
                        kotlin.b.b(obj);
                        return new e8o0(charSequence, (CharSequence) obj);
                    }
                    s8o0Var = (s8o0) scootersPackagesPurchaseUiStateMapper$map$22.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = iVar.d;
                FormattedText formattedText2 = s8o0Var.b;
                scootersPackagesPurchaseUiStateMapper$map$22.L$0 = null;
                scootersPackagesPurchaseUiStateMapper$map$22.L$1 = charSequence2;
                scootersPackagesPurchaseUiStateMapper$map$22.label = 2;
                e = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersPackagesPurchaseUiStateMapper$map$22, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new e8o0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersPackagesPurchaseUiStateMapper$map$2 = new ScootersPackagesPurchaseUiStateMapper$map$2(iVar, continuationImpl);
        ScootersPackagesPurchaseUiStateMapper$map$2 scootersPackagesPurchaseUiStateMapper$map$222 = scootersPackagesPurchaseUiStateMapper$map$2;
        Object obj2 = scootersPackagesPurchaseUiStateMapper$map$222.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiStateMapper$map$222.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        ru.yandex.taxi.widget.c cVar22 = iVar.d;
        FormattedText formattedText22 = s8o0Var.b;
        scootersPackagesPurchaseUiStateMapper$map$222.L$0 = null;
        scootersPackagesPurchaseUiStateMapper$map$222.L$1 = charSequence22;
        scootersPackagesPurchaseUiStateMapper$map$222.label = 2;
        e = ru.yandex.taxi.widget.c.e(cVar22, formattedText22, null, false, scootersPackagesPurchaseUiStateMapper$map$222, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i iVar, ArrayList arrayList, String str, boolean z, ContinuationImpl continuationImpl) {
        ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1 scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj2;
        z8o0 z8o0Var;
        CharSequence charSequence;
        iVar.getClass();
        if (continuationImpl instanceof ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1) {
            scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1 = (ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1) continuationImpl;
            int i2 = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1.label = i2 - Integer.MIN_VALUE;
                ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1 scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12 = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1;
                obj = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        return new o8o0(((avj0) iVar.b).h(kyh0.scooters_passes_purchasing), "");
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((z8o0) obj2).a, str)) {
                            break;
                        }
                    }
                    z8o0Var = (z8o0) obj2;
                    if (z8o0Var == null) {
                        zgz.a(null, new IllegalStateException(oyr.p("No packages with id `", str, "`")));
                        return new o8o0("", "");
                    }
                    ru.yandex.taxi.widget.c cVar = iVar.d;
                    FormattedText formattedText = z8o0Var.f.a;
                    scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$0 = null;
                    scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$1 = null;
                    scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$2 = z8o0Var;
                    scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.Z$0 = z;
                    scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$3;
                        kotlin.b.b(obj);
                        return new o8o0(charSequence, (CharSequence) obj);
                    }
                    z = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.Z$0;
                    z8o0Var = (z8o0) scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$2;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                ru.yandex.taxi.widget.c cVar2 = iVar.d;
                FormattedText formattedText2 = z8o0Var.f.b;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$0 = null;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$1 = null;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$2 = null;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.L$3 = charSequence2;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.Z$0 = z;
                scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12.label = 2;
                obj = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$12, 30);
                if (obj != coroutineSingletons) {
                    charSequence = charSequence2;
                    return new o8o0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1 = new ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1(iVar, continuationImpl);
        ScootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1 scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122 = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$1;
        obj = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj;
        ru.yandex.taxi.widget.c cVar22 = iVar.d;
        FormattedText formattedText22 = z8o0Var.f.b;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.L$0 = null;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.L$1 = null;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.L$2 = null;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.L$3 = charSequence22;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.Z$0 = z;
        scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122.label = 2;
        obj = ru.yandex.taxi.widget.c.e(cVar22, formattedText22, null, false, scootersPackagesPurchaseUiStateMapper$mapPurchaseButton$122, 30);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
