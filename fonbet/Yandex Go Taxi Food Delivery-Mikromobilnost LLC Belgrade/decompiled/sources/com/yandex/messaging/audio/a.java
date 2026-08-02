package com.yandex.messaging.audio;

import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.izc0;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.nd60;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rh3;
import defpackage.tje;
import defpackage.uyj;
import defpackage.ydz;
import defpackage.zy11;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a implements izc0 {
    public final ServerMessageRef a;
    public final e b;
    public final ike c = bvf0.a(uyj.a.plus(kotlinx.coroutines.a.a()));
    public ServerMessageRef w;
    public pzt0 x;

    public a(ServerMessageRef serverMessageRef, e eVar) {
        this.a = serverMessageRef;
        this.b = eVar;
        this.w = serverMessageRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.izc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        AsyncPlaylist$load$1 asyncPlaylist$load$1;
        int i;
        l8x l8xVar;
        if (continuation instanceof AsyncPlaylist$load$1) {
            asyncPlaylist$load$1 = (AsyncPlaylist$load$1) continuation;
            int i2 = asyncPlaylist$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncPlaylist$load$1.label = i2 - Integer.MIN_VALUE;
                Object obj = asyncPlaylist$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = asyncPlaylist$load$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (ydz.a.a()) {
                        this.a.toString();
                        ydz.d();
                    }
                    pzt0 pzt0Var = this.x;
                    if (pzt0Var != null) {
                        if (pzt0Var.isCancelled()) {
                            pzt0Var = null;
                        }
                    }
                    pzt0Var = tje.N(this.c, null, null, new AsyncPlaylist$startLoadingJob$1(this, null), 3);
                    this.x = pzt0Var;
                    l8xVar = pzt0Var;
                    asyncPlaylist$load$1.L$0 = l8xVar;
                    asyncPlaylist$load$1.label = 1;
                    if (l8xVar.u0(asyncPlaylist$load$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l8xVar = (l8x) asyncPlaylist$load$1.L$0;
                    kotlin.b.b(obj);
                }
                if (l8xVar.isCancelled()) {
                    return zy11.a;
                }
                throw new CancellationException();
            }
        }
        asyncPlaylist$load$1 = new AsyncPlaylist$load$1(this, (ContinuationImpl) continuation);
        Object obj2 = asyncPlaylist$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncPlaylist$load$1.label;
        if (i != 0) {
        }
        if (l8xVar.isCancelled()) {
        }
    }

    @Override // defpackage.izc0
    public final rh3 f() {
        rh3 rh3Var = (rh3) this.b.d.get(this.a);
        if (jl40.l(rh3Var, nd60.f)) {
            rh3Var = null;
        }
        if (rh3Var != null) {
            return rh3Var;
        }
        ny61.r("Initial track must be cached");
        return null;
    }

    @Override // defpackage.izc0
    public final rh3 j() {
        ServerMessageRef serverMessageRef = this.w;
        if (serverMessageRef == null) {
            return null;
        }
        rh3 rh3Var = (rh3) this.b.d.get(serverMessageRef);
        if (jl40.l(rh3Var, nd60.f)) {
            return null;
        }
        return rh3Var;
    }

    @Override // defpackage.izc0
    public final void reset() {
        if (ydz.a.a()) {
            Objects.toString(this.w);
            ydz.d();
        }
        kotlinx.coroutines.a.g(this.c.a, null);
        this.w = this.a;
    }
}
