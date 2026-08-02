package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import defpackage.i5p0;
import defpackage.k5p0;
import defpackage.l5p0;
import defpackage.ny61;
import defpackage.t5p0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class b implements l5p0 {
    public final /* synthetic */ ScootersTariffItemViewImplV2 a;
    public final /* synthetic */ i5p0 b;

    public b(ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2, i5p0 i5p0Var) {
        this.a = scootersTariffItemViewImplV2;
        this.b = i5p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.l5p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ScootersTariffItemViewImplV2$bindPrice$1$execute$1 scootersTariffItemViewImplV2$bindPrice$1$execute$1;
        int i;
        k5p0 binding;
        t5p0 t5p0Var;
        Object k0;
        RobotoTextView robotoTextView;
        if (continuation instanceof ScootersTariffItemViewImplV2$bindPrice$1$execute$1) {
            scootersTariffItemViewImplV2$bindPrice$1$execute$1 = (ScootersTariffItemViewImplV2$bindPrice$1$execute$1) continuation;
            int i2 = scootersTariffItemViewImplV2$bindPrice$1$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTariffItemViewImplV2$bindPrice$1$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTariffItemViewImplV2$bindPrice$1$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTariffItemViewImplV2$bindPrice$1$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2 = this.a;
                    binding = scootersTariffItemViewImplV2.getBinding();
                    RobotoTextView priceTextView = binding.b.getPriceTextView();
                    t5p0Var = scootersTariffItemViewImplV2.scootersTariffPriceFormatMapper;
                    CharSequence charSequence = this.b.d;
                    scootersTariffItemViewImplV2$bindPrice$1$execute$1.L$0 = priceTextView;
                    scootersTariffItemViewImplV2$bindPrice$1$execute$1.label = 1;
                    if (charSequence == null) {
                        t5p0Var.getClass();
                        k0 = "";
                    } else {
                        t5p0Var.a.getClass();
                        k0 = tje.k0(uyj.a, new ScootersTariffPriceFormatMapper$formatPrice$2(charSequence, t5p0Var, null), scootersTariffItemViewImplV2$bindPrice$1$execute$1);
                    }
                    obj = k0;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    robotoTextView = priceTextView;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    robotoTextView = (RobotoTextView) scootersTariffItemViewImplV2$bindPrice$1$execute$1.L$0;
                    kotlin.b.b(obj);
                }
                robotoTextView.setText((CharSequence) obj);
                return zy11.a;
            }
        }
        scootersTariffItemViewImplV2$bindPrice$1$execute$1 = new ScootersTariffItemViewImplV2$bindPrice$1$execute$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersTariffItemViewImplV2$bindPrice$1$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTariffItemViewImplV2$bindPrice$1$execute$1.label;
        if (i != 0) {
        }
        robotoTextView.setText((CharSequence) obj2);
        return zy11.a;
    }
}
