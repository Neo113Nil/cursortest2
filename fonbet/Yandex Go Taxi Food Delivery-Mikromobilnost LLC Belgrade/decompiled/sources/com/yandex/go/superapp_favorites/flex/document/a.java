package com.yandex.go.superapp_favorites.flex.document;

import defpackage.czp0;
import defpackage.d3q0;
import defpackage.dzp0;
import defpackage.klc;
import defpackage.kq90;
import defpackage.ny61;
import defpackage.q2q0;
import defpackage.rzo;
import defpackage.s1m;
import defpackage.see;
import defpackage.u1m;
import defpackage.uwl;
import defpackage.ywl;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a implements s1m {
    public final com.yandex.go.superapp_favorites.flex.jason_state.a a;

    public a(com.yandex.go.superapp_favorites.flex.jason_state.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.s1m
    public final ywl b(kq90 kq90Var, ywl ywlVar, ywl ywlVar2, ywl ywlVar3) {
        dzp0 d0;
        dzp0 d02;
        return (!(kq90Var instanceof d3q0) || (d0 = rzo.d0(ywlVar3)) == null || (d02 = rzo.d0(ywlVar2)) == null) ? ywlVar3 : ywl.a(ywlVar3, dzp0.a(d0, d02.a, null, null, null, d02.f, 30), null, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.s1m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(klc klcVar, u1m u1mVar, kq90 kq90Var, ywl ywlVar, Throwable th, Continuation continuation) {
        SuperappFavoritesDocumentPatcher$onError$1 superappFavoritesDocumentPatcher$onError$1;
        int i;
        ywl ywlVar2;
        dzp0 dzp0Var;
        if (continuation instanceof SuperappFavoritesDocumentPatcher$onError$1) {
            superappFavoritesDocumentPatcher$onError$1 = (SuperappFavoritesDocumentPatcher$onError$1) continuation;
            int i2 = superappFavoritesDocumentPatcher$onError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappFavoritesDocumentPatcher$onError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappFavoritesDocumentPatcher$onError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappFavoritesDocumentPatcher$onError$1.label;
                if (i != 0) {
                    b.b(obj);
                    d3q0 d3q0Var = kq90Var instanceof d3q0 ? (d3q0) kq90Var : null;
                    boolean z = (d3q0Var != null ? d3q0Var.a : null) instanceof q2q0;
                    if (z) {
                        return ywlVar;
                    }
                    superappFavoritesDocumentPatcher$onError$1.L$0 = null;
                    superappFavoritesDocumentPatcher$onError$1.L$1 = null;
                    superappFavoritesDocumentPatcher$onError$1.L$2 = null;
                    superappFavoritesDocumentPatcher$onError$1.L$3 = ywlVar;
                    superappFavoritesDocumentPatcher$onError$1.L$4 = null;
                    superappFavoritesDocumentPatcher$onError$1.I$0 = z ? 1 : 0;
                    superappFavoritesDocumentPatcher$onError$1.label = 1;
                    if (this.a.a(superappFavoritesDocumentPatcher$onError$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ywlVar2 = ywlVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ywlVar2 = (ywl) superappFavoritesDocumentPatcher$onError$1.L$3;
                    b.b(obj);
                }
                uwl uwlVar = ywlVar2.d;
                uwl a = uwlVar == null ? uwl.a(uwlVar, null, null, null, 61) : null;
                see seeVar = ywlVar2.a;
                dzp0Var = seeVar instanceof dzp0 ? (dzp0) seeVar : null;
                if (dzp0Var != null) {
                    czp0 czp0Var = dzp0Var.a;
                    seeVar = dzp0.a(dzp0Var, new czp0(czp0Var.a, false, czp0Var.c, czp0Var.d, czp0Var.e, czp0Var.f, czp0Var.g), null, null, null, dzp0Var.f, 30);
                }
                return ywl.a(ywlVar2, seeVar, null, null, a, 54);
            }
        }
        superappFavoritesDocumentPatcher$onError$1 = new SuperappFavoritesDocumentPatcher$onError$1(this, (ContinuationImpl) continuation);
        Object obj2 = superappFavoritesDocumentPatcher$onError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappFavoritesDocumentPatcher$onError$1.label;
        if (i != 0) {
        }
        uwl uwlVar2 = ywlVar2.d;
        if (uwlVar2 == null) {
        }
        see seeVar2 = ywlVar2.a;
        if (seeVar2 instanceof dzp0) {
        }
        if (dzp0Var != null) {
        }
        return ywl.a(ywlVar2, seeVar2, null, null, a, 54);
    }
}
