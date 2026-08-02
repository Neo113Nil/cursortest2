package com.yandex.go.preload;

import defpackage.ape0;
import defpackage.bpe0;
import defpackage.hdr;
import defpackage.kih;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class e {
    public final kih a;
    public final h b;
    public final bpe0 c;
    public final hdr d;
    public final a e;
    public final tt2 f;

    public e(kih kihVar, h hVar, bpe0 bpe0Var, hdr hdrVar, a aVar, tt2 tt2Var) {
        this.a = kihVar;
        this.b = hVar;
        this.c = bpe0Var;
        this.d = hdrVar;
        this.e = aVar;
        this.f = tt2Var;
    }

    public final boolean a() {
        return this.d.a && !this.b.Kg();
    }

    public final void b() {
        Object value;
        bpe0 bpe0Var = this.c;
        r0 r0Var = bpe0Var.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ape0.a((ape0) value, 2)));
        bpe0Var.a.u("completed", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zy11 c(ContinuationImpl continuationImpl) {
        PreloadInteractorImpl$waitForPreloadCompleted$1 preloadInteractorImpl$waitForPreloadCompleted$1;
        int i;
        if (continuationImpl instanceof PreloadInteractorImpl$waitForPreloadCompleted$1) {
            preloadInteractorImpl$waitForPreloadCompleted$1 = (PreloadInteractorImpl$waitForPreloadCompleted$1) continuationImpl;
            int i2 = preloadInteractorImpl$waitForPreloadCompleted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preloadInteractorImpl$waitForPreloadCompleted$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preloadInteractorImpl$waitForPreloadCompleted$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preloadInteractorImpl$waitForPreloadCompleted$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    return zy11Var;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        preloadInteractorImpl$waitForPreloadCompleted$1 = new PreloadInteractorImpl$waitForPreloadCompleted$1(this, continuationImpl);
        Object obj2 = preloadInteractorImpl$waitForPreloadCompleted$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preloadInteractorImpl$waitForPreloadCompleted$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    public final Object d(Continuation continuation) {
        ape0 ape0Var = (ape0) this.c.c.getValue();
        if (!ape0Var.b && !ape0Var.a) {
            this.f.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new PreloadInteractorImpl$waitForSplashCanClose$2(this, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        }
        return zy11.a;
    }
}
