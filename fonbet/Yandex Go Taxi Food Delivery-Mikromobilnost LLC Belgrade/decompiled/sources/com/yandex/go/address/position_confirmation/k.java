package com.yandex.go.address.position_confirmation;

import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.kr0;
import defpackage.nm91;
import defpackage.ny61;
import defpackage.ode0;
import defpackage.pde0;
import defpackage.pv0;
import defpackage.rde0;
import defpackage.sde0;
import defpackage.sls;
import defpackage.syb0;
import defpackage.t1a1;
import defpackage.tyb0;
import defpackage.uyb0;
import defpackage.vde0;
import defpackage.vyb0;
import defpackage.w511;
import defpackage.wde0;
import defpackage.yyb0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.PositionConfirmationScreen;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.b0;

/* loaded from: classes12.dex */
public final class k {
    public final kr0 a;

    public k(kr0 kr0Var) {
        this.a = kr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pv0 pv0Var, Screen screen, sls slsVar, sls slsVar2, ContinuationImpl continuationImpl) {
        PinPositionConfirmationStateFactory$createState$1 pinPositionConfirmationStateFactory$createState$1;
        Object obj;
        int i;
        Screen screen2;
        pv0 pv0Var2;
        sls slsVar3;
        sls slsVar4;
        b0 c;
        jsq0 jsq0Var;
        int i2;
        t1a1 vde0Var;
        if (continuationImpl instanceof PinPositionConfirmationStateFactory$createState$1) {
            pinPositionConfirmationStateFactory$createState$1 = (PinPositionConfirmationStateFactory$createState$1) continuationImpl;
            int i3 = pinPositionConfirmationStateFactory$createState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pinPositionConfirmationStateFactory$createState$1.label = i3 - Integer.MIN_VALUE;
                obj = pinPositionConfirmationStateFactory$createState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinPositionConfirmationStateFactory$createState$1.label;
                t1a1 t1a1Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinPositionConfirmationStateFactory$createState$1.L$0 = pv0Var;
                    screen2 = screen;
                    pinPositionConfirmationStateFactory$createState$1.L$1 = screen2;
                    pinPositionConfirmationStateFactory$createState$1.L$2 = slsVar;
                    pinPositionConfirmationStateFactory$createState$1.L$3 = slsVar2;
                    pinPositionConfirmationStateFactory$createState$1.label = 1;
                    Object b = ((com.yandex.go.clarify_address.a) this.a).b(pinPositionConfirmationStateFactory$createState$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    pv0Var2 = pv0Var;
                    slsVar3 = slsVar;
                    slsVar4 = slsVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar4 = (sls) pinPositionConfirmationStateFactory$createState$1.L$3;
                    slsVar3 = (sls) pinPositionConfirmationStateFactory$createState$1.L$2;
                    screen2 = (Screen) pinPositionConfirmationStateFactory$createState$1.L$1;
                    pv0 pv0Var3 = (pv0) pinPositionConfirmationStateFactory$createState$1.L$0;
                    kotlin.b.b(obj);
                    pv0Var2 = pv0Var3;
                }
                if (!((Boolean) obj).booleanValue() && (c = nm91.c(pv0Var2.a)) != null) {
                    String str = c.d;
                    String str2 = c.c;
                    jsq0Var = c.a;
                    i2 = yyb0.a[screen2.ordinal()];
                    if (jsq0Var.contains(i2 == 1 ? i2 != 2 ? null : PositionConfirmationScreen.SUMMARY : PositionConfirmationScreen.MAIN)) {
                        return tyb0.a;
                    }
                    sde0 sde0Var = c.g;
                    if (jl40.l(sde0Var, pde0.INSTANCE)) {
                        t1a1Var = wde0.b;
                    } else if (sde0Var instanceof ode0) {
                        ode0 ode0Var = (ode0) sde0Var;
                        vde0Var = new vde0(ode0Var.b, ode0Var.c, ode0Var.d, ode0Var.e, ode0Var.a, pv0Var2);
                        if (Type.POSITION_CONFIRMATION != Type.UNKNOWN && !evu0.J(c.b) && !evu0.J(str2) && !evu0.J(str) && vde0Var != null) {
                            String str3 = c.b;
                            if (str2.length() > 10) {
                                str2 = str2.substring(0, 9).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
                            }
                            uyb0 uyb0Var = new uyb0(slsVar3, str2);
                            if (str.length() > 10) {
                                str = str.substring(0, 9).concat(EllipsizedTextView.DEFAULT_ELLIPSIS);
                            }
                            return new vyb0(str3, uyb0Var, new uyb0(slsVar4, str), vde0Var, c.f);
                        }
                    } else if (!jl40.l(sde0Var, rde0.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    vde0Var = t1a1Var;
                    if (Type.POSITION_CONFIRMATION != Type.UNKNOWN) {
                        String str32 = c.b;
                        if (str2.length() > 10) {
                        }
                        uyb0 uyb0Var2 = new uyb0(slsVar3, str2);
                        if (str.length() > 10) {
                        }
                        return new vyb0(str32, uyb0Var2, new uyb0(slsVar4, str), vde0Var, c.f);
                    }
                }
                return syb0.a;
            }
        }
        pinPositionConfirmationStateFactory$createState$1 = new PinPositionConfirmationStateFactory$createState$1(this, continuationImpl);
        obj = pinPositionConfirmationStateFactory$createState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinPositionConfirmationStateFactory$createState$1.label;
        t1a1 t1a1Var2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
            String str4 = c.d;
            String str22 = c.c;
            jsq0Var = c.a;
            i2 = yyb0.a[screen2.ordinal()];
            if (jsq0Var.contains(i2 == 1 ? i2 != 2 ? null : PositionConfirmationScreen.SUMMARY : PositionConfirmationScreen.MAIN)) {
            }
        }
        return syb0.a;
    }
}
