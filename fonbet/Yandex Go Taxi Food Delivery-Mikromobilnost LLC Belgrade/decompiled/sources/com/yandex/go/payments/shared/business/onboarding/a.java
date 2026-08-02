package com.yandex.go.payments.shared.business.onboarding;

import android.net.Uri;
import com.yandex.go.payments.shared.business.c;
import defpackage.b64;
import defpackage.czo0;
import defpackage.fw6;
import defpackage.hbp0;
import defpackage.nw6;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.pux0;
import defpackage.sr3;
import defpackage.tb;
import defpackage.tje;
import defpackage.tmr0;
import defpackage.xw6;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class a {
    public final c a;
    public final fw6 b;
    public final hbp0 c = new hbp0(new czo0(14), "BusinessAccountDeeplinkInteractorScope", null);
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final sr3 h;

    public a(c cVar, o3h o3hVar, fw6 fw6Var) {
        this.a = cVar;
        this.b = fw6Var;
        ((pux0) o3hVar).getClass();
        String str = pux0.c;
        this.d = str;
        this.e = b64.j(str, "://coopaccount?type=business");
        this.f = MetaDataField.SCREEN_FIELD;
        this.g = "type";
        this.h = new sr3(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Uri uri, nw6 nw6Var, ContinuationImpl continuationImpl) {
        BusinessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1 businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1;
        int i;
        tmr0 tmr0Var;
        aVar.getClass();
        if (continuationImpl instanceof BusinessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1) {
            businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1 = (BusinessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1) continuationImpl;
            int i2 = businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if ("create".equals(uri.getQueryParameter(aVar.f))) {
                        c cVar = aVar.a;
                        businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.L$0 = null;
                        businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.L$1 = nw6Var;
                        businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.L$2 = null;
                        businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.label = 1;
                        obj = e.y(new com.yandex.go.payments.shared.business.b(e.T(cVar.d.a.a(), 1), cVar), businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nw6Var = (nw6) businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.L$1;
                kotlin.b.b(obj);
                tmr0Var = (tmr0) kotlin.collections.a.R((List) obj);
                if (tmr0Var != null) {
                    ((xw6) nw6Var).a(tmr0Var);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1 = new BusinessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1(aVar, continuationImpl);
        Object obj2 = businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessAccountDeeplinkInteractor$tryExecuteCreateScreenStrategy$1.label;
        if (i != 0) {
        }
        tmr0Var = (tmr0) kotlin.collections.a.R((List) obj2);
        if (tmr0Var != null) {
        }
        return Boolean.FALSE;
    }

    public final void b(Uri uri, xw6 xw6Var, tb tbVar) {
        hbp0 hbp0Var = this.c;
        hbp0Var.f();
        tje.N(hbp0Var.c(), this.h, null, new BusinessAccountDeeplinkInteractor$processDeeplink$1(this, uri, xw6Var, tbVar, null), 2);
    }
}
