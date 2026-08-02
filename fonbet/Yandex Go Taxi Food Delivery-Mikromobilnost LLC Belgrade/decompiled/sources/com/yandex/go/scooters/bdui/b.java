package com.yandex.go.scooters.bdui;

import defpackage.ck11;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sb2;
import defpackage.sz20;
import defpackage.tz20;
import defpackage.uz20;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ androidx.compose.animation.core.a a;
    public final /* synthetic */ oz40 b;

    public b(androidx.compose.animation.core.a aVar, oz40 oz40Var) {
        this.a = aVar;
        this.b = oz40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(uz20 uz20Var, Continuation continuation) {
        ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1 scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1;
        int i;
        if (continuation instanceof ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1) {
            scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1 = (ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1) continuation;
            int i2 = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1 scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12 = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1;
                Object obj = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = uz20Var instanceof sz20;
                    oz40 oz40Var = this.b;
                    if (z) {
                        oz40Var.setValue(Boolean.TRUE);
                        Float f = new Float(0.0f);
                        ck11 K = sb2.K(250, 0, null, 6);
                        scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12.L$0 = null;
                        scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12.label = 1;
                        if (androidx.compose.animation.core.a.d(this.a, f, K, null, null, scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$12, 12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (!jl40.l(uz20Var, tz20.a)) {
                            w511.b();
                            return null;
                        }
                        oz40Var.setValue(Boolean.FALSE);
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1 = new ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1(this, continuation);
        ScootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1 scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$122 = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$1;
        Object obj2 = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBduiScreenKt$rememberDecoupledScrim$2$1$1$emit$122.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
