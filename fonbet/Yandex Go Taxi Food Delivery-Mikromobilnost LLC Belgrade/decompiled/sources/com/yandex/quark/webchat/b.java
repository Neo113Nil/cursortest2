package com.yandex.quark.webchat;

import android.net.Uri;
import defpackage.j73;
import defpackage.ny61;
import defpackage.r941;
import defpackage.rn3;
import defpackage.s690;
import defpackage.tn3;
import defpackage.uza;
import defpackage.vpr;
import defpackage.y0x0;
import defpackage.zcx;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PageProvider$special$$inlined$mapNotNull$1$2$1 pageProvider$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof PageProvider$special$$inlined$mapNotNull$1$2$1) {
            pageProvider$special$$inlined$mapNotNull$1$2$1 = (PageProvider$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = pageProvider$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pageProvider$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pageProvider$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pageProvider$special$$inlined$mapNotNull$1$2$1.label;
                s690 s690Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y0x0 y0x0Var = (y0x0) obj;
                    Uri uri = y0x0Var.b;
                    if (uri != null) {
                        tn3 tn3Var = y0x0Var.a;
                        if (tn3Var instanceof rn3) {
                            zcx zcxVar = e.a;
                            uri = uri.buildUpon().appendQueryParameter("uid", j73.K(e.b.digest(((rn3) tn3Var).a().getBytes(uza.a)), "", new r941(2), 30)).build();
                        }
                        s690Var = new s690(uri);
                    }
                    if (s690Var != null) {
                        pageProvider$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(s690Var, pageProvider$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        pageProvider$special$$inlined$mapNotNull$1$2$1 = new PageProvider$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = pageProvider$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageProvider$special$$inlined$mapNotNull$1$2$1.label;
        s690 s690Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
