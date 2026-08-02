package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import defpackage.l5p0;
import defpackage.ny61;
import defpackage.t5p0;
import defpackage.w5p0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a implements l5p0 {
    public final /* synthetic */ ScootersPackageItemViewImplV2 a;

    public a(ScootersPackageItemViewImplV2 scootersPackageItemViewImplV2) {
        this.a = scootersPackageItemViewImplV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.l5p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ScootersPackageItemViewImplV2$bindPrice$1$execute$1 scootersPackageItemViewImplV2$bindPrice$1$execute$1;
        int i;
        w5p0 binding;
        t5p0 unused;
        if (continuation instanceof ScootersPackageItemViewImplV2$bindPrice$1$execute$1) {
            scootersPackageItemViewImplV2$bindPrice$1$execute$1 = (ScootersPackageItemViewImplV2$bindPrice$1$execute$1) continuation;
            int i2 = scootersPackageItemViewImplV2$bindPrice$1$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackageItemViewImplV2$bindPrice$1$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPackageItemViewImplV2$bindPrice$1$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackageItemViewImplV2$bindPrice$1$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersPackageItemViewImplV2 scootersPackageItemViewImplV2 = this.a;
                    binding = scootersPackageItemViewImplV2.getBinding();
                    RobotoTextView robotoTextView = binding.b;
                    unused = scootersPackageItemViewImplV2.scootersTariffPriceFormatMapper;
                    throw null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                RobotoTextView robotoTextView2 = (RobotoTextView) scootersPackageItemViewImplV2$bindPrice$1$execute$1.L$0;
                kotlin.b.b(obj);
                robotoTextView2.setText((CharSequence) obj);
                return zy11.a;
            }
        }
        scootersPackageItemViewImplV2$bindPrice$1$execute$1 = new ScootersPackageItemViewImplV2$bindPrice$1$execute$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersPackageItemViewImplV2$bindPrice$1$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackageItemViewImplV2$bindPrice$1$execute$1.label;
        if (i != 0) {
        }
    }
}
