package coil3.graphics;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import coil3.size.ScaleDrawable;
import defpackage.cma1;
import defpackage.g6u;
import defpackage.iyg;
import defpackage.j0;
import defpackage.lg70;
import defpackage.ny61;
import defpackage.o400;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uh;
import defpackage.uyj;
import defpackage.wxg;
import defpackage.xev;
import defpackage.xi91;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.a;

/* renamed from: coil3.gif.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C0141a implements iyg {
    public final xev a;
    public final lg70 b;
    public final boolean c;

    public C0141a(xev xevVar, lg70 lg70Var, boolean z) {
        this.a = xevVar;
        this.b = lg70Var;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.iyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AnimatedImageDecoder$decode$1 animatedImageDecoder$decode$1;
        Object obj;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        Object r;
        Object b;
        Ref$BooleanRef ref$BooleanRef2;
        if (continuationImpl instanceof AnimatedImageDecoder$decode$1) {
            animatedImageDecoder$decode$1 = (AnimatedImageDecoder$decode$1) continuationImpl;
            int i2 = animatedImageDecoder$decode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animatedImageDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = animatedImageDecoder$decode$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedImageDecoder$decode$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ref$BooleanRef = new Ref$BooleanRef();
                    j0 j0Var = new j0(28, this, ref$BooleanRef);
                    animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
                    animatedImageDecoder$decode$1.label = 1;
                    r = a.r(j0Var, animatedImageDecoder$decode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$BooleanRef2 = (Ref$BooleanRef) animatedImageDecoder$decode$1.L$0;
                        b.b(obj2);
                        return new wxg(cma1.k((Drawable) obj2), ref$BooleanRef2.element);
                    }
                    Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) animatedImageDecoder$decode$1.L$0;
                    b.b(obj2);
                    r = obj2;
                    ref$BooleanRef = ref$BooleanRef3;
                }
                animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
                animatedImageDecoder$decode$1.label = 2;
                b = b((Drawable) r, animatedImageDecoder$decode$1);
                if (b != obj) {
                    Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                    obj2 = b;
                    ref$BooleanRef2 = ref$BooleanRef4;
                    return new wxg(cma1.k((Drawable) obj2), ref$BooleanRef2.element);
                }
                return obj;
            }
        }
        animatedImageDecoder$decode$1 = new AnimatedImageDecoder$decode$1(this, continuationImpl);
        Object obj22 = animatedImageDecoder$decode$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedImageDecoder$decode$1.label;
        if (i != 0) {
        }
        animatedImageDecoder$decode$1.L$0 = ref$BooleanRef;
        animatedImageDecoder$decode$1.label = 2;
        b = b((Drawable) r, animatedImageDecoder$decode$1);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Drawable drawable, ContinuationImpl continuationImpl) {
        AnimatedImageDecoder$wrapDrawable$1 animatedImageDecoder$wrapDrawable$1;
        int i;
        if (continuationImpl instanceof AnimatedImageDecoder$wrapDrawable$1) {
            animatedImageDecoder$wrapDrawable$1 = (AnimatedImageDecoder$wrapDrawable$1) continuationImpl;
            int i2 = animatedImageDecoder$wrapDrawable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animatedImageDecoder$wrapDrawable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = animatedImageDecoder$wrapDrawable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedImageDecoder$wrapDrawable$1.label;
                lg70 lg70Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    uh uhVar = xi91.a;
                    if (((Number) s8o.p(lg70Var, uhVar)).intValue() != -2) {
                        ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) s8o.p(lg70Var, uhVar)).intValue());
                    }
                    sls slsVar = (sls) s8o.p(lg70Var, xi91.c);
                    sls slsVar2 = (sls) s8o.p(lg70Var, xi91.d);
                    if (slsVar != null || slsVar2 != null) {
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a.x;
                        AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(drawable, slsVar, slsVar2, null);
                        animatedImageDecoder$wrapDrawable$1.L$0 = drawable;
                        animatedImageDecoder$wrapDrawable$1.label = 1;
                        if (tje.k0(g6uVar, animatedImageDecoder$wrapDrawable$2, animatedImageDecoder$wrapDrawable$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) animatedImageDecoder$wrapDrawable$1.L$0;
                    b.b(obj);
                }
                return new ScaleDrawable(drawable, lg70Var.c);
            }
        }
        animatedImageDecoder$wrapDrawable$1 = new AnimatedImageDecoder$wrapDrawable$1(this, continuationImpl);
        Object obj2 = animatedImageDecoder$wrapDrawable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedImageDecoder$wrapDrawable$1.label;
        lg70 lg70Var2 = this.b;
        if (i != 0) {
        }
        return new ScaleDrawable(drawable, lg70Var2.c);
    }
}
