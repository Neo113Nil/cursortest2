package com.yandex.go.scooters.mosru.statebar;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;
import defpackage.ad5;
import defpackage.czn0;
import defpackage.d0o0;
import defpackage.ehn0;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.gdc;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.qzn0;
import defpackage.t3u0;
import defpackage.u3u0;
import defpackage.w511;
import defpackage.wyn0;
import defpackage.yzn0;
import defpackage.zy11;
import defpackage.zzn0;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes13.dex */
public final class a extends ad5 {
    public final ehn0 A;
    public final com.yandex.go.scooters.mosru.domain.a x;
    public final com.yandex.go.scooters.mosru.data.a y;
    public final czn0 z;

    public a(com.yandex.go.scooters.mosru.domain.a aVar, com.yandex.go.scooters.mosru.data.a aVar2, czn0 czn0Var, ehn0 ehn0Var) {
        super(yzn0.class);
        this.x = aVar;
        this.y = aVar2;
        this.z = czn0Var;
        this.A = ehn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0063, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ScootersMosRuAuthStatus scootersMosRuAuthStatus, Continuation continuation) {
        ScootersMosRuStateBarPresenter$processAuthStatus$1 scootersMosRuStateBarPresenter$processAuthStatus$1;
        int i;
        qzn0 qzn0Var;
        CharSequence charSequence;
        com.yandex.go.scooters.mosru.domain.a aVar2 = aVar.x;
        if (continuation instanceof ScootersMosRuStateBarPresenter$processAuthStatus$1) {
            scootersMosRuStateBarPresenter$processAuthStatus$1 = (ScootersMosRuStateBarPresenter$processAuthStatus$1) continuation;
            int i2 = scootersMosRuStateBarPresenter$processAuthStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuStateBarPresenter$processAuthStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuStateBarPresenter$processAuthStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuStateBarPresenter$processAuthStatus$1.label;
                boolean z = false;
                zy11 zy11Var = zy11.a;
                String str = null;
                if (i != 0) {
                    b.b(obj);
                    int i3 = zzn0.a[scootersMosRuAuthStatus.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        yzn0 yzn0Var = (yzn0) aVar.Dg();
                        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION);
                        t3u0Var.b = false;
                        yzn0Var.render(new u3u0(t3u0Var));
                        return zy11Var;
                    }
                    if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    scootersMosRuStateBarPresenter$processAuthStatus$1.L$0 = null;
                    scootersMosRuStateBarPresenter$processAuthStatus$1.label = 1;
                    obj = aVar2.b(scootersMosRuStateBarPresenter$processAuthStatus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qzn0Var = (qzn0) scootersMosRuStateBarPresenter$processAuthStatus$1.L$1;
                        b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            aVar.z.b(wyn0.a);
                            yzn0 yzn0Var2 = (yzn0) aVar.Dg();
                            t3u0 t3u0Var2 = new t3u0(StateBarViewModel$Type.SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION);
                            d0o0 d0o0Var = qzn0Var.b;
                            String valueOf = String.valueOf(d0o0Var != null ? d0o0Var.a : null);
                            if (d0o0Var != null && (charSequence = d0o0Var.b) != null) {
                                str = charSequence.toString();
                            }
                            if (d0o0Var != null && !evu0.J(valueOf)) {
                                z = true;
                            }
                            t3u0Var2.b = z;
                            if (z) {
                                t3u0Var2.e = valueOf;
                                t3u0Var2.g = str;
                                t3u0Var2.h = new gdc(mqg0.component_red_normal);
                                int i4 = mqg0.component_white;
                                t3u0Var2.k = new gdc(i4);
                                t3u0Var2.l = new gdc(i4);
                                t3u0Var2.i = new fcl0(11, aVar.A);
                            }
                            yzn0Var2.render(new u3u0(t3u0Var2));
                        }
                        return zy11Var;
                    }
                    b.b(obj);
                }
                qzn0Var = (qzn0) obj;
                if (qzn0Var != null) {
                    Integer num = qzn0Var.c;
                    scootersMosRuStateBarPresenter$processAuthStatus$1.L$0 = null;
                    scootersMosRuStateBarPresenter$processAuthStatus$1.L$1 = qzn0Var;
                    scootersMosRuStateBarPresenter$processAuthStatus$1.label = 2;
                    obj = aVar2.f(num, scootersMosRuStateBarPresenter$processAuthStatus$1);
                }
                return zy11Var;
            }
        }
        scootersMosRuStateBarPresenter$processAuthStatus$1 = new ScootersMosRuStateBarPresenter$processAuthStatus$1(aVar, continuation);
        Object obj2 = scootersMosRuStateBarPresenter$processAuthStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuStateBarPresenter$processAuthStatus$1.label;
        boolean z2 = false;
        zy11 zy11Var2 = zy11.a;
        String str2 = null;
        if (i != 0) {
        }
        qzn0Var = (qzn0) obj2;
        if (qzn0Var != null) {
        }
        return zy11Var2;
    }
}
