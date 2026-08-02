package com.yandex.go.places.impl.domain.interactors.organizations;

import defpackage.jl40;
import defpackage.np80;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zx20;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public e(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrganizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1 organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof OrganizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1) {
            organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1 = (OrganizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1) continuation;
            int i2 = organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((np80) obj).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((zx20) obj2).a(), this.b)) {
                            break;
                        }
                    }
                    organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.L$0 = null;
                    organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.L$1 = null;
                    organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.L$2 = null;
                    organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.L$3 = null;
                    organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1 = new OrganizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1(this, continuation);
        Object obj32 = organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSearchOptionsInteractor$listenToModalContent$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
