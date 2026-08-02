package coil3.graphics;

import defpackage.d9;
import defpackage.iyg;
import defpackage.lg70;
import defpackage.ny61;
import defpackage.onq0;
import defpackage.ulo;
import defpackage.wxg;
import defpackage.xev;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.a;

/* renamed from: coil3.decode.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138a implements iyg {
    public final xev a;
    public final lg70 b;
    public final onq0 c;
    public final ulo d;

    public C0138a(xev xevVar, lg70 lg70Var, onq0 onq0Var, ulo uloVar) {
        this.a = xevVar;
        this.b = lg70Var;
        this.c = onq0Var;
        this.d = uloVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((kotlinx.coroutines.sync.b) r7).b(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.iyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0135BitmapFactoryDecoder$decode$1 c0135BitmapFactoryDecoder$decode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        Throwable th;
        Object obj2;
        Object r;
        try {
            if (continuationImpl instanceof C0135BitmapFactoryDecoder$decode$1) {
                c0135BitmapFactoryDecoder$decode$1 = (C0135BitmapFactoryDecoder$decode$1) continuationImpl;
                int i2 = c0135BitmapFactoryDecoder$decode$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0135BitmapFactoryDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = c0135BitmapFactoryDecoder$decode$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c0135BitmapFactoryDecoder$decode$1.label;
                    if (i != 0) {
                        b.b(obj3);
                        obj = this.c;
                        c0135BitmapFactoryDecoder$decode$1.L$0 = obj;
                        c0135BitmapFactoryDecoder$decode$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj2 = (onq0) c0135BitmapFactoryDecoder$decode$1.L$0;
                            try {
                                b.b(obj3);
                                wxg wxgVar = (wxg) obj3;
                                ((kotlinx.coroutines.sync.b) obj2).f();
                                return wxgVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((kotlinx.coroutines.sync.b) obj2).f();
                                throw th;
                            }
                        }
                        onq0 onq0Var = (onq0) c0135BitmapFactoryDecoder$decode$1.L$0;
                        b.b(obj3);
                        obj = onq0Var;
                    }
                    d9 d9Var = new d9(24, this);
                    c0135BitmapFactoryDecoder$decode$1.L$0 = obj;
                    c0135BitmapFactoryDecoder$decode$1.label = 2;
                    r = a.r(d9Var, c0135BitmapFactoryDecoder$decode$1);
                    if (r != coroutineSingletons) {
                        Object obj4 = obj;
                        obj3 = r;
                        obj2 = obj4;
                        wxg wxgVar2 = (wxg) obj3;
                        ((kotlinx.coroutines.sync.b) obj2).f();
                        return wxgVar2;
                    }
                    return coroutineSingletons;
                }
            }
            d9 d9Var2 = new d9(24, this);
            c0135BitmapFactoryDecoder$decode$1.L$0 = obj;
            c0135BitmapFactoryDecoder$decode$1.label = 2;
            r = a.r(d9Var2, c0135BitmapFactoryDecoder$decode$1);
            if (r != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Object obj5 = obj;
            th = th3;
            obj2 = obj5;
            ((kotlinx.coroutines.sync.b) obj2).f();
            throw th;
        }
        c0135BitmapFactoryDecoder$decode$1 = new C0135BitmapFactoryDecoder$decode$1(this, continuationImpl);
        Object obj32 = c0135BitmapFactoryDecoder$decode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0135BitmapFactoryDecoder$decode$1.label;
        if (i != 0) {
        }
    }
}
