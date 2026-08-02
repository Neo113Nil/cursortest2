package xsna;

import android.content.ContentResolver;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.jsonwebtoken.Header;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.u700;

/* compiled from: rememberLottieComposition.kt */
/* loaded from: classes12.dex */
public final class guf0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Context context, u700 u700Var, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        duf0 duf0Var;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str5;
        String str6;
        Context context2;
        String str7;
        i700 i700Var;
        Object k;
        Context context3;
        i700 i700Var2;
        String str8;
        Object k2;
        if (continuationImpl instanceof duf0) {
            duf0Var = (duf0) continuationImpl;
            int i2 = duf0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                duf0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = duf0Var.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = duf0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w800<i700> b = b(context, u700Var, str4, false);
                    if (b == null) {
                        throw new IllegalArgumentException(("Unable to create parsing task for " + u700Var + ".").toString());
                    }
                    duf0Var.L$0 = context;
                    duf0Var.L$1 = str;
                    str5 = str2;
                    duf0Var.L$2 = str5;
                    str6 = str3;
                    duf0Var.L$3 = str6;
                    duf0Var.label = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(duf0Var));
                    lq9Var.o();
                    b.b(new ztf0(lq9Var));
                    b.a(new auf0(lq9Var));
                    obj = lq9Var.n();
                    if (obj != coroutineSingletons) {
                        context2 = context;
                        str7 = str;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i700 i700Var3 = (i700) duf0Var.L$0;
                        kotlin.a.a(obj);
                        return i700Var3;
                    }
                    i700Var2 = (i700) duf0Var.L$3;
                    str8 = (String) duf0Var.L$2;
                    str5 = (String) duf0Var.L$1;
                    context3 = (Context) duf0Var.L$0;
                    kotlin.a.a(obj);
                    duf0Var.L$0 = i700Var2;
                    duf0Var.L$1 = null;
                    duf0Var.L$2 = null;
                    duf0Var.L$3 = null;
                    duf0Var.label = 3;
                    if (i700Var2.f.isEmpty()) {
                        bdn bdnVar = bdn.a;
                        k2 = myc0.k(wgl.c, new buf0(i700Var2, context3, str5, str8, null), duf0Var);
                        if (k2 != coroutineSingletons) {
                            k2 = s3q0.a;
                        }
                    } else {
                        k2 = s3q0.a;
                    }
                    return k2 != coroutineSingletons ? coroutineSingletons : i700Var2;
                }
                String str9 = (String) duf0Var.L$3;
                String str10 = (String) duf0Var.L$2;
                String str11 = (String) duf0Var.L$1;
                Context context4 = (Context) duf0Var.L$0;
                kotlin.a.a(obj);
                str5 = str10;
                str7 = str11;
                str6 = str9;
                context2 = context4;
                i700Var = (i700) obj;
                duf0Var.L$0 = context2;
                duf0Var.L$1 = str5;
                duf0Var.L$2 = str6;
                duf0Var.L$3 = i700Var;
                duf0Var.label = 2;
                if (i700Var.d.isEmpty()) {
                    bdn bdnVar2 = bdn.a;
                    k = myc0.k(wgl.c, new cuf0(i700Var, context2, str7, null), duf0Var);
                    if (k != coroutineSingletons) {
                        k = s3q0.a;
                    }
                } else {
                    k = s3q0.a;
                }
                if (k != coroutineSingletons) {
                    context3 = context2;
                    i700Var2 = i700Var;
                    str8 = str6;
                    duf0Var.L$0 = i700Var2;
                    duf0Var.L$1 = null;
                    duf0Var.L$2 = null;
                    duf0Var.L$3 = null;
                    duf0Var.label = 3;
                    if (i700Var2.f.isEmpty()) {
                    }
                    if (k2 != coroutineSingletons) {
                    }
                }
            }
        }
        duf0Var = new duf0(continuationImpl);
        Object obj2 = duf0Var.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = duf0Var.label;
        if (i != 0) {
        }
        i700Var = (i700) obj2;
        duf0Var.L$0 = context2;
        duf0Var.L$1 = str5;
        duf0Var.L$2 = str6;
        duf0Var.L$3 = i700Var;
        duf0Var.label = 2;
        if (i700Var.d.isEmpty()) {
        }
        if (k != coroutineSingletons) {
        }
    }

    public static final w800<i700> b(Context context, u700 u700Var, final String str, boolean z) {
        if (u700Var instanceof u700.e) {
            if (!epx.f(str, "__LottieInternalDefaultCacheKey__")) {
                return q700.h(context, ((u700.e) u700Var).a, str);
            }
            int i = ((u700.e) u700Var).a;
            return q700.h(context, i, q700.o(i, context));
        }
        String str2 = null;
        if (u700Var instanceof u700.f) {
            return epx.f(str, "__LottieInternalDefaultCacheKey__") ? q700.j(context, ((u700.f) u700Var).a) : q700.a(str, new ful(context, ((u700.f) u700Var).a, str, 1), null);
        }
        if (u700Var instanceof u700.c) {
            if (z) {
                return null;
            }
            ((u700.c) u700Var).getClass();
            new FileInputStream((String) null);
            epx.f(str, "__LottieInternalDefaultCacheKey__");
            brm0.v(null, Header.COMPRESSION_ALGORITHM, false);
            throw null;
        }
        if (u700Var instanceof u700.a) {
            if (epx.f(str, "__LottieInternalDefaultCacheKey__")) {
                ((u700.a) u700Var).getClass();
                return q700.b(context, null);
            }
            ((u700.a) u700Var).getClass();
            HashMap hashMap = q700.a;
            return q700.a(str, new zzd(context.getApplicationContext(), str2, str), null);
        }
        if (u700Var instanceof u700.d) {
            if (epx.f(str, "__LottieInternalDefaultCacheKey__")) {
                ((u700.d) u700Var).getClass();
                throw null;
            }
            ((u700.d) u700Var).getClass();
            return q700.a(str, new p700(), null);
        }
        if (!(u700Var instanceof u700.b)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentResolver contentResolver = context.getContentResolver();
        ((u700.b) u700Var).getClass();
        final InputStream openInputStream = contentResolver.openInputStream(null);
        if (epx.f(str, "__LottieInternalDefaultCacheKey__")) {
            throw null;
        }
        HashMap hashMap2 = q700.a;
        final Context applicationContext = context.getApplicationContext();
        return q700.a(str, new Callable() { // from class: xsna.o700
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q700.d(openInputStream, str, applicationContext);
            }
        }, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t700 c(u700 u700Var, androidx.compose.runtime.a aVar, int i) {
        aVar.T(-1248473602);
        euf0 euf0Var = new euf0(3, null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1248473602, i, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:83)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        aVar.T(1388713953);
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && aVar.J(u700Var)) || (i & 6) == 4;
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z || x == c0012a) {
            x = androidx.compose.runtime.k.b(new t700());
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        aVar.b0();
        aVar.T(1388714244);
        boolean J = aVar.J("__LottieInternalDefaultCacheKey__") | ((i3 > 4 && aVar.J(u700Var)) || (i & 6) == 4);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = b(context, u700Var, "__LottieInternalDefaultCacheKey__", true);
            aVar.R(x2);
        }
        aVar.b0();
        bap.f(u700Var, "__LottieInternalDefaultCacheKey__", new fuf0(euf0Var, context, u700Var, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", wh50Var, null), aVar, i2 | 512);
        t700 t700Var = (t700) wh50Var.getValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.b0();
        return t700Var;
    }
}
