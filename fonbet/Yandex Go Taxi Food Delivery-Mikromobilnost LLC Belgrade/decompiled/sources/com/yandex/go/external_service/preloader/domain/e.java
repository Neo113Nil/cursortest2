package com.yandex.go.external_service.preloader.domain;

import defpackage.evu0;
import defpackage.ny61;
import defpackage.szv0;
import defpackage.uwq0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest;

/* loaded from: classes.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ManifestLoadInteractor$preload$$inlined$map$1$2$1 manifestLoadInteractor$preload$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ManifestLoadInteractor$preload$$inlined$map$1$2$1) {
            manifestLoadInteractor$preload$$inlined$map$1$2$1 = (ManifestLoadInteractor$preload$$inlined$map$1$2$1) continuation;
            int i2 = manifestLoadInteractor$preload$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                manifestLoadInteractor$preload$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = manifestLoadInteractor$preload$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = manifestLoadInteractor$preload$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List b = ((szv0) obj).b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : b) {
                        ServiceManifest serviceManifest = ((uwq0) obj3).J;
                        if ((serviceManifest != null ? serviceManifest.a : null) == ServiceManifest.Type.EATSKIT) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        uwq0 uwq0Var = (uwq0) it.next();
                        String str = uwq0Var.h;
                        ServiceManifest serviceManifest2 = uwq0Var.J;
                        String str2 = serviceManifest2 != null ? serviceManifest2.b : null;
                        if (str == null || evu0.J(str) || str2 == null || evu0.J(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList2);
                    manifestLoadInteractor$preload$$inlined$map$1$2$1.L$0 = null;
                    manifestLoadInteractor$preload$$inlined$map$1$2$1.L$1 = null;
                    manifestLoadInteractor$preload$$inlined$map$1$2$1.L$2 = null;
                    manifestLoadInteractor$preload$$inlined$map$1$2$1.L$3 = null;
                    manifestLoadInteractor$preload$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, manifestLoadInteractor$preload$$inlined$map$1$2$1) == coroutineSingletons) {
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
        manifestLoadInteractor$preload$$inlined$map$1$2$1 = new ManifestLoadInteractor$preload$$inlined$map$1$2$1(this, continuation);
        Object obj22 = manifestLoadInteractor$preload$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = manifestLoadInteractor$preload$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
