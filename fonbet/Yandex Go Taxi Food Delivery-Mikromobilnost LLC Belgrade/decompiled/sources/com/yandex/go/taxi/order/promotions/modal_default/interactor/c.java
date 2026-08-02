package com.yandex.go.taxi.order.promotions.modal_default.interactor;

import android.graphics.drawable.Drawable;
import defpackage.cr70;
import defpackage.dr70;
import defpackage.irs0;
import defpackage.jr70;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.my20;
import defpackage.nr70;
import defpackage.ny61;
import defpackage.or70;
import defpackage.oxu0;
import defpackage.p2y0;
import defpackage.pkf;
import defpackage.pr70;
import defpackage.pwy0;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final pwy0 a;
    public final e b;
    public final k7x0 c;
    public final oxu0 d;
    public final irs0 e;
    public final my20 f;
    public final p2y0 g;

    public c(pwy0 pwy0Var, e eVar, k7x0 k7x0Var, oxu0 oxu0Var, irs0 irs0Var, my20 my20Var, p2y0 p2y0Var) {
        this.a = pwy0Var;
        this.b = eVar;
        this.c = k7x0Var;
        this.d = oxu0Var;
        this.e = irs0Var;
        this.f = my20Var;
        this.g = p2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, pr70 pr70Var, ContinuationImpl continuationImpl) {
        OrderDefaultModalInteractor$mapHeader$1 orderDefaultModalInteractor$mapHeader$1;
        int i;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        String str;
        int i2;
        cVar.getClass();
        if (continuationImpl instanceof OrderDefaultModalInteractor$mapHeader$1) {
            orderDefaultModalInteractor$mapHeader$1 = (OrderDefaultModalInteractor$mapHeader$1) continuationImpl;
            int i3 = orderDefaultModalInteractor$mapHeader$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                orderDefaultModalInteractor$mapHeader$1.label = i3 - Integer.MIN_VALUE;
                Object obj = orderDefaultModalInteractor$mapHeader$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderDefaultModalInteractor$mapHeader$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    or70 or70Var = pr70Var.d;
                    String str2 = or70Var.b;
                    String str3 = or70Var.a;
                    if (str3.length() <= 0) {
                        str3 = str2.length() > 0 ? ((m7x0) cVar.c).a(str2) : null;
                    }
                    if (str3 == null) {
                        uiStateDrawableWrapper = null;
                        nr70 nr70Var = pr70Var.h;
                        CharSequence charSequence = pr70Var.c;
                        CharSequence charSequence2 = pr70Var.b;
                        i2 = jr70.a[nr70Var.a.ordinal()];
                        if (i2 == 1) {
                            return new cr70(uiStateDrawableWrapper, charSequence2, charSequence, pr70Var.d.c);
                        }
                        if (i2 == 2) {
                            return new dr70(uiStateDrawableWrapper, charSequence2, charSequence);
                        }
                        w511.b();
                        return null;
                    }
                    e eVar = cVar.b;
                    orderDefaultModalInteractor$mapHeader$1.L$0 = pr70Var;
                    orderDefaultModalInteractor$mapHeader$1.L$1 = str3;
                    orderDefaultModalInteractor$mapHeader$1.L$2 = null;
                    orderDefaultModalInteractor$mapHeader$1.label = 1;
                    Object k = e.k(eVar, str3, null, orderDefaultModalInteractor$mapHeader$1, 14);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str4 = str3;
                    obj = k;
                    str = str4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) orderDefaultModalInteractor$mapHeader$1.L$1;
                    pr70Var = (pr70) orderDefaultModalInteractor$mapHeader$1.L$0;
                    kotlin.b.b(obj);
                }
                uiStateDrawableWrapper = pkf.g((Drawable) obj, str, null);
                nr70 nr70Var2 = pr70Var.h;
                CharSequence charSequence3 = pr70Var.c;
                CharSequence charSequence22 = pr70Var.b;
                i2 = jr70.a[nr70Var2.a.ordinal()];
                if (i2 == 1) {
                }
            }
        }
        orderDefaultModalInteractor$mapHeader$1 = new OrderDefaultModalInteractor$mapHeader$1(cVar, continuationImpl);
        Object obj2 = orderDefaultModalInteractor$mapHeader$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderDefaultModalInteractor$mapHeader$1.label;
        if (i != 0) {
        }
        uiStateDrawableWrapper = pkf.g((Drawable) obj2, str, null);
        nr70 nr70Var22 = pr70Var.h;
        CharSequence charSequence32 = pr70Var.c;
        CharSequence charSequence222 = pr70Var.b;
        i2 = jr70.a[nr70Var22.a.ordinal()];
        if (i2 == 1) {
        }
    }
}
