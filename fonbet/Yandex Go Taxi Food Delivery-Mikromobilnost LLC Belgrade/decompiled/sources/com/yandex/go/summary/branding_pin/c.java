package com.yandex.go.summary.branding_pin;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.oj6;
import defpackage.pex0;
import defpackage.qj6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public c(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BrandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1 brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1;
        int i;
        qj6 qj6Var;
        if (continuation instanceof BrandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1) {
            brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1 = (BrandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    this.b.getClass();
                    Iterator it = pex0Var.S.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            qj6Var = qj6.f;
                            break;
                        }
                        ServiceLevel.Branding branding = (ServiceLevel.Branding) it.next();
                        ServiceLevel.Branding.Type type = branding.c;
                        if ((type == null ? -1 : oj6.a[type.ordinal()]) == 4) {
                            String str = branding.f;
                            String str2 = str == null ? "" : str;
                            String str3 = branding.e;
                            String str4 = str3 == null ? "" : str3;
                            String str5 = branding.k;
                            String str6 = str5 == null ? "" : str5;
                            ServiceLevel.Branding.IconAppearance iconAppearance = branding.r;
                            qj6Var = new qj6(str2, str4, str6, iconAppearance != null ? iconAppearance.a : null, iconAppearance != null ? iconAppearance.b : null);
                        }
                    }
                    brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.L$0 = null;
                    brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.L$1 = null;
                    brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.L$2 = null;
                    brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.L$3 = null;
                    brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qj6Var, brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1 = new BrandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingPinInteractorImpl$brandingDestinationPinStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
