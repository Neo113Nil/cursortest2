package com.yandex.go.eboks.objects.data;

import defpackage.ahn;
import defpackage.ffx;
import defpackage.k0v0;
import defpackage.lz40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.xgn;
import defpackage.ygn;
import defpackage.zgn;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class a implements ahn {
    public final n0 a;
    public final n0 b;

    public a() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.a = ffx.b(0, 1, bufferOverflow);
        this.b = ffx.b(0, 1, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4, types: [lz40] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n0 n0Var, zgn zgnVar, ContinuationImpl continuationImpl) {
        EboksObjectsClientEventRepositoryImpl$handleClientEvent$1 eboksObjectsClientEventRepositoryImpl$handleClientEvent$1;
        int i;
        n0 n0Var2;
        if (continuationImpl instanceof EboksObjectsClientEventRepositoryImpl$handleClientEvent$1) {
            eboksObjectsClientEventRepositoryImpl$handleClientEvent$1 = (EboksObjectsClientEventRepositoryImpl$handleClientEvent$1) continuationImpl;
            int i2 = eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k0v0 j = n0Var.j();
                    EboksObjectsClientEventRepositoryImpl$handleClientEvent$2 eboksObjectsClientEventRepositoryImpl$handleClientEvent$2 = new EboksObjectsClientEventRepositoryImpl$handleClientEvent$2(2, null);
                    eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.L$0 = n0Var;
                    eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.L$1 = zgnVar;
                    eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.label = 1;
                    n0Var2 = n0Var;
                    if (e.x(j, eboksObjectsClientEventRepositoryImpl$handleClientEvent$2, eboksObjectsClientEventRepositoryImpl$handleClientEvent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zgnVar = (zgn) eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.L$1;
                    ?? r6 = (lz40) eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.L$0;
                    kotlin.b.b(obj);
                    n0Var2 = r6;
                }
                com.yandex.go.eboks.objects.domain.model.a aVar = new com.yandex.go.eboks.objects.domain.model.a();
                n0Var2.g(new Pair(zgnVar, aVar));
                return aVar;
            }
        }
        eboksObjectsClientEventRepositoryImpl$handleClientEvent$1 = new EboksObjectsClientEventRepositoryImpl$handleClientEvent$1(this, continuationImpl);
        Object obj2 = eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsClientEventRepositoryImpl$handleClientEvent$1.label;
        if (i != 0) {
        }
        com.yandex.go.eboks.objects.domain.model.a aVar2 = new com.yandex.go.eboks.objects.domain.model.a();
        n0Var2.g(new Pair(zgnVar, aVar2));
        return aVar2;
    }

    public final Object b(zgn zgnVar, ContinuationImpl continuationImpl) {
        if (zgnVar instanceof ygn) {
            return a(this.a, zgnVar, continuationImpl);
        }
        if (zgnVar instanceof xgn) {
            return a(this.b, zgnVar, continuationImpl);
        }
        w511.b();
        return null;
    }
}
