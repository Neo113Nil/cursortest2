package androidx.compose.material3;

import defpackage.g8w;
import defpackage.gtq0;
import defpackage.jxe0;
import defpackage.ltu;
import defpackage.ny61;
import defpackage.vqn;
import defpackage.y7m;
import defpackage.ztr;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class d {
    public float a;
    public float b;
    public float c;
    public float d;
    public final androidx.compose.animation.core.a e;
    public g8w f;
    public g8w g;

    public d(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new androidx.compose.animation.core.a(new y7m(f), gtq0.h, (Object) null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, zy11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g8w g8wVar, ContinuationImpl continuationImpl) {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        int i;
        androidx.compose.animation.core.a aVar = this.e;
        try {
            if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
                floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
                int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$animateElevation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        float f = g8wVar instanceof jxe0 ? this.b : g8wVar instanceof ltu ? this.c : g8wVar instanceof ztr ? this.d : this.a;
                        this.g = g8wVar;
                        if (!y7m.b(((y7m) aVar.f.getValue()).a, f)) {
                            g8w g8wVar2 = this.f;
                            floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = g8wVar;
                            floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                            if (vqn.a(aVar, f, g8wVar2, g8wVar, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g8wVar = (g8w) floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.f = g8wVar;
                    this = zy11.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            this.f = g8wVar;
            this = zy11.a;
            return this;
        } catch (Throwable th) {
            this.f = g8wVar;
            throw th;
        }
        floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
        Object obj2 = floatingActionButtonElevationAnimatable$animateElevation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        int i;
        try {
            if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
                floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
                int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        g8w g8wVar = this.g;
                        float f = g8wVar instanceof jxe0 ? this.b : g8wVar instanceof ltu ? this.c : g8wVar instanceof ztr ? this.d : this.a;
                        androidx.compose.animation.core.a aVar = this.e;
                        if (!y7m.b(((y7m) aVar.f.getValue()).a, f)) {
                            y7m y7mVar = new y7m(f);
                            floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                            if (aVar.f(y7mVar, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } finally {
            this.f = this.g;
        }
        floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
        Object obj2 = floatingActionButtonElevationAnimatable$snapElevation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
    }
}
