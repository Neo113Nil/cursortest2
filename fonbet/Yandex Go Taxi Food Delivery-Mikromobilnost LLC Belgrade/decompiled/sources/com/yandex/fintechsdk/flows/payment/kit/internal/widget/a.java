package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import defpackage.cke;
import defpackage.jse;
import defpackage.l351;
import defpackage.li3;
import defpackage.m351;
import defpackage.ny61;
import defpackage.v920;
import defpackage.wxk;
import defpackage.xvf0;
import defpackage.yzh;
import defpackage.z131;
import defpackage.z22;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final z22 a;
    public final jse b;
    public final com.yandex.fintechsdk.adapters.divkit.sdk.impl.api.a c;
    public final b d;
    public final com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a e;
    public final Scenario.Widget f;

    public a(wxk wxkVar, z22 z22Var, jse jseVar, com.yandex.fintechsdk.adapters.divkit.sdk.impl.api.a aVar, b bVar, com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a aVar2, Scenario.Widget widget) {
        this.a = z22Var;
        this.b = jseVar;
        this.c = aVar;
        this.d = bVar;
        this.e = aVar2;
        this.f = widget;
        if (aVar.a != null) {
            return;
        }
        yzh yzhVar = new yzh();
        yzhVar.a = new v920(new cke(), wxkVar);
        aVar.a = yzhVar;
        v920 v920Var = (v920) yzhVar.a;
        if (v920Var == null) {
            return;
        }
        ((com.yandex.div.core.expression.variables.a) ((xvf0) v920Var.b).get()).i(new z131(DivkitThemeChangeListener.THEME_VARIABLE_NAME, wxkVar.c.getTheme().getKey()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkedHashMap linkedHashMap, String str, ContinuationImpl continuationImpl) {
        WidgetController$loadWidget$1 widgetController$loadWidget$1;
        int i;
        Object a;
        if (continuationImpl instanceof WidgetController$loadWidget$1) {
            widgetController$loadWidget$1 = (WidgetController$loadWidget$1) continuationImpl;
            int i2 = widgetController$loadWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetController$loadWidget$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetController$loadWidget$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetController$loadWidget$1.label;
                z22 z22Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new li3(this.f));
                    b bVar = this.d;
                    bVar.b = linkedHashMap;
                    bVar.c = str;
                    widgetController$loadWidget$1.L$0 = str;
                    widgetController$loadWidget$1.label = 1;
                    a = this.c.a(bVar, widgetController$loadWidget$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) widgetController$loadWidget$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (Result.a(a) == null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new l351(str));
                    return a;
                }
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new m351(str));
                return a;
            }
        }
        widgetController$loadWidget$1 = new WidgetController$loadWidget$1(this, continuationImpl);
        Object obj2 = widgetController$loadWidget$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetController$loadWidget$1.label;
        z22 z22Var2 = this.a;
        if (i != 0) {
        }
        if (Result.a(a) == null) {
        }
    }
}
