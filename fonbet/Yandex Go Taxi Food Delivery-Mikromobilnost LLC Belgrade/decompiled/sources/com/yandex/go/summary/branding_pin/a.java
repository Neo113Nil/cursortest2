package com.yandex.go.summary.branding_pin;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.fef;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.oj6;
import defpackage.pex0;
import defpackage.pj6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public a(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BrandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1 brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1;
        int i;
        pj6 pj6Var;
        if (continuation instanceof BrandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1) {
            brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1 = (BrandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    i iVar = this.b;
                    iVar.getClass();
                    Iterator it = pex0Var.S.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        pj6Var = pj6.f;
                        if (!hasNext) {
                            break;
                        }
                        ServiceLevel.Branding branding = (ServiceLevel.Branding) it.next();
                        ServiceLevel.Branding.Type type = branding.c;
                        String str = branding.e;
                        if ((type == null ? -1 : oj6.a[type.ordinal()]) == 5) {
                            fef c = pex0Var.c();
                            String str2 = branding.k;
                            String str3 = branding.f;
                            if (str != null && str3 != null && str2 != null) {
                                String a = iVar.c.a(c, str, false, true);
                                ServiceLevel.Branding.IconAppearance iconAppearance = branding.r;
                                pj6Var = new pj6(a, str3, str2, iconAppearance != null ? iconAppearance.a : null, iconAppearance != null ? iconAppearance.b : null);
                            }
                        }
                    }
                    brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.L$0 = null;
                    brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.L$1 = null;
                    brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.L$2 = null;
                    brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.L$3 = null;
                    brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pj6Var, brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1 = new BrandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingPinInteractorImpl$brandingComboInnerPinStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
