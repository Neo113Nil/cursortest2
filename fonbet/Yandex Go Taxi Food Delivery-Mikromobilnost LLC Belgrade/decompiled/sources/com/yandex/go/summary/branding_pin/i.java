package com.yandex.go.summary.branding_pin;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.lub0;
import defpackage.nj6;
import defpackage.ny61;
import defpackage.oj6;
import defpackage.pex0;
import defpackage.rj6;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.xdf;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class i implements nj6 {
    public final wiq0 a;
    public final f1c0 b;
    public final xdf c;

    public i(wiq0 wiq0Var, f1c0 f1c0Var, xdf xdfVar) {
        this.a = wiq0Var;
        this.b = f1c0Var;
        this.c = xdfVar;
    }

    public static final rj6 a(i iVar, pex0 pex0Var) {
        iVar.getClass();
        for (ServiceLevel.Branding branding : pex0Var.S) {
            ServiceLevel.Branding.Type type = branding.c;
            int i = type == null ? -1 : oj6.a[type.ordinal()];
            if (i == 2) {
                String str = branding.i;
                return new rj6(str != null ? str : "", 14);
            }
            if (i == 3) {
                String str2 = branding.f;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = branding.e;
                return new rj6(branding.g, branding.h, str2, str3 != null ? str3 : "");
            }
        }
        return rj6.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, ContinuationImpl continuationImpl) {
        BrandingPinInteractorImpl$isPinV2ExperimentEnabled$1 brandingPinInteractorImpl$isPinV2ExperimentEnabled$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof BrandingPinInteractorImpl$isPinV2ExperimentEnabled$1) {
            brandingPinInteractorImpl$isPinV2ExperimentEnabled$1 = (BrandingPinInteractorImpl$isPinV2ExperimentEnabled$1) continuationImpl;
            int i2 = brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f1c0 f1c0Var = iVar.b;
                    brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.label = 1;
                    obj = f1c0Var.a(brandingPinInteractorImpl$isPinV2ExperimentEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((e1c0) obj).b);
            }
        }
        brandingPinInteractorImpl$isPinV2ExperimentEnabled$1 = new BrandingPinInteractorImpl$isPinV2ExperimentEnabled$1(iVar, continuationImpl);
        Object obj2 = brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingPinInteractorImpl$isPinV2ExperimentEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((e1c0) obj2).b);
    }

    public static lub0 e(pex0 pex0Var) {
        for (ServiceLevel.Branding branding : pex0Var.S) {
            ServiceLevel.Branding.Type type = branding.c;
            if ((type == null ? -1 : oj6.a[type.ordinal()]) == 1) {
                String str = branding.k;
                ServiceLevel.Branding.IconAppearance iconAppearance = branding.r;
                return new lub0(str, iconAppearance != null ? iconAppearance.b : null, iconAppearance != null ? iconAppearance.a : null);
            }
        }
        return lub0.d;
    }

    public final tpr c() {
        return kotlinx.coroutines.flow.e.t(new f(((k) this.a).j.b(), this));
    }

    public final tpr d() {
        wiq0 wiq0Var = this.a;
        return kotlinx.coroutines.flow.e.t(new m0(((k) wiq0Var).j.b(), kotlinx.coroutines.flow.e.t(new h(((k) wiq0Var).j.b(), this)), new BrandingPinInteractorImpl$brandingSourcePinStateFlow$1(this, null)));
    }
}
