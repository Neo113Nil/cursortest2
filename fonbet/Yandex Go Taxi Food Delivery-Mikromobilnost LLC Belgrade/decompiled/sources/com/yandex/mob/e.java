package com.yandex.mob;

import defpackage.mo20;
import defpackage.nn20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nn20 b;

    public e(vpr vprVar, nn20 nn20Var) {
        this.a = vprVar;
        this.b = nn20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if (r10.emit(r11, r6) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r11 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1 mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1) {
            mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1 = (MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1) continuation;
            int i3 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1 mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1;
                Object obj2 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mo20 mo20Var = (mo20) obj;
                    if (!(mo20Var instanceof mo20)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.mob.domain.i iVar = this.b.c;
                    double d = mo20Var.a;
                    double d2 = mo20Var.b;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$0 = null;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$1 = null;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$2 = null;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$3 = null;
                    vprVar = this.a;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$4 = vprVar;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$5 = null;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$6 = null;
                    i2 = 0;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.I$0 = 0;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.I$1 = 0;
                    mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.label = 1;
                    obj2 = iVar.a(d, d2, mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    i2 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.I$0;
                    vprVar = (vpr) mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$0 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$1 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$2 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$3 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$4 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$5 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.L$6 = null;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.I$0 = i2;
                mobCountryProvider$countryInfoFlow$$inlined$map$1$2$12.label = 2;
            }
        }
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1 = new MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1(this, continuation);
        MobCountryProvider$countryInfoFlow$$inlined$map$1$2$1 mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$1;
        Object obj22 = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$0 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$1 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$2 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$3 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$4 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$5 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.L$6 = null;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.I$0 = i2;
        mobCountryProvider$countryInfoFlow$$inlined$map$1$2$122.label = 2;
    }
}
