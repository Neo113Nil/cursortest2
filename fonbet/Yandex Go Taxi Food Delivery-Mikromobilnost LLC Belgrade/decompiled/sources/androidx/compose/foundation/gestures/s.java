package androidx.compose.foundation.gestures;

import defpackage.fwi;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class s implements fwi {
    public final /* synthetic */ fwi a;
    public boolean b;
    public boolean c;
    public final kotlinx.coroutines.sync.a w = new kotlinx.coroutines.sync.a(false);

    public s(fwi fwiVar) {
        this.a = fwiVar;
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return this.a.I(f);
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.a.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.a.W(f);
    }

    public final void a() {
        this.c = true;
        kotlinx.coroutines.sync.a aVar = this.w;
        if (aVar.c()) {
            aVar.d(null);
        }
    }

    public final void b() {
        this.b = true;
        kotlinx.coroutines.sync.a aVar = this.w;
        if (aVar.c()) {
            aVar.d(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        int i;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i2 = pressGestureScopeImpl$reset$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$reset$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pressGestureScopeImpl$reset$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pressGestureScopeImpl$reset$1.label = 1;
                    if (this.w.a(pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.b = false;
                this.c = false;
                return zy11.a;
            }
        }
        pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
        Object obj2 = pressGestureScopeImpl$reset$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pressGestureScopeImpl$reset$1.label;
        if (i != 0) {
        }
        this.b = false;
        this.c = false;
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i2 = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pressGestureScopeImpl$tryAwaitRelease$1.label;
                kotlinx.coroutines.sync.a aVar = this.w;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!this.b && !this.c) {
                        pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                        if (aVar.a(pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(this.b);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                aVar.d(null);
                return Boolean.valueOf(this.b);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
        Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pressGestureScopeImpl$tryAwaitRelease$1.label;
        kotlinx.coroutines.sync.a aVar2 = this.w;
        if (i != 0) {
        }
        aVar2.d(null);
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.a.f0(f);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.a.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.a.i0(j);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.a.n(f);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.u0();
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.a.w0(f);
    }
}
