package com.ybsdk.core.utils.ext;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import coil.a;
import coil.drawable.MovieDrawable;
import coil.drawable.ScaleDrawable;
import defpackage.abm;
import defpackage.ail0;
import defpackage.axj;
import defpackage.bcv;
import defpackage.bev;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.i9v;
import defpackage.ixw0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oac;
import defpackage.oq90;
import defpackage.pac;
import defpackage.rcv;
import defpackage.s59;
import defpackage.sjh;
import defpackage.sms;
import defpackage.teb;
import defpackage.tev;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vam;
import defpackage.w511;
import defpackage.wis0;
import defpackage.xga1;
import java.io.File;
import java.util.ArrayList;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class a {
    public static coil.c a;

    public static final void a(bev bevVar, dcv dcvVar) {
        if (dcvVar instanceof ccv) {
            bevVar.j(((ccv) dcvVar).a());
        } else if (dcvVar instanceof bcv) {
            bevVar.k(((bcv) dcvVar).a());
        } else {
            if (dcvVar == null) {
                return;
            }
            w511.b();
        }
    }

    public static bev b(Context context, int i, boolean z) {
        if ((i & 2) != 0) {
            z = true;
        }
        teb tebVar = new teb(24);
        bev bevVar = new bev(context);
        bevVar.a();
        bevVar.c(z);
        bevVar.h(new pac(tebVar, tebVar));
        return bevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(String str, vam vamVar, Context context, boolean z, ContinuationImpl continuationImpl) {
        CoilExtKt$downloadDrawable$1 coilExtKt$downloadDrawable$1;
        int i;
        String str2;
        Throwable th;
        if (continuationImpl instanceof CoilExtKt$downloadDrawable$1) {
            coilExtKt$downloadDrawable$1 = (CoilExtKt$downloadDrawable$1) continuationImpl;
            int i2 = coilExtKt$downloadDrawable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilExtKt$downloadDrawable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilExtKt$downloadDrawable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilExtKt$downloadDrawable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        return null;
                    }
                    try {
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        try {
                            str2 = str;
                            try {
                                CoilExtKt$downloadDrawable$2 coilExtKt$downloadDrawable$2 = new CoilExtKt$downloadDrawable$2(context, z, str2, vamVar, null);
                                coilExtKt$downloadDrawable$1.L$0 = str2;
                                coilExtKt$downloadDrawable$1.label = 1;
                                obj = tje.k0(mdhVar, coilExtKt$downloadDrawable$2, coilExtKt$downloadDrawable$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                str = str2;
                            } catch (Throwable th2) {
                                th = th2;
                                str = str2;
                                i5z0.a.f(th, g8e.o("failed to download image: ", str), new Object[0]);
                                return null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            i5z0.a.f(th, g8e.o("failed to download image: ", str), new Object[0]);
                            return null;
                        }
                    } catch (Throwable th4) {
                        str2 = str;
                        th = th4;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) coilExtKt$downloadDrawable$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        th = th;
                        i5z0.a.f(th, g8e.o("failed to download image: ", str), new Object[0]);
                        return null;
                    }
                }
                return (abm) obj;
            }
        }
        coilExtKt$downloadDrawable$1 = new CoilExtKt$downloadDrawable$1(continuationImpl);
        Object obj2 = coilExtKt$downloadDrawable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilExtKt$downloadDrawable$1.label;
        if (i != 0) {
        }
        return (abm) obj2;
    }

    public static final void d(bev bevVar, Object obj, tev tevVar, Context context) {
        wis0 wis0Var = null;
        if (tevVar != null) {
            if (tevVar.b() == 0 || tevVar.a() == 0) {
                tevVar = null;
            }
            if (tevVar != null) {
                float f = context.getResources().getDisplayMetrics().density;
                wis0Var = xga1.a((int) (tevVar.b() * f), (int) (tevVar.a() * f));
            }
        }
        if (obj != null) {
            bevVar.f(obj);
        }
        if (wis0Var != null) {
            bevVar.n(wis0Var);
        }
    }

    public static final void e(bev bevVar, String str, tev tevVar, Context context) {
        String a2 = rcv.a(str, tevVar, context);
        i5z0.a.a(g8e.o("Load image from url: ", a2), new Object[0]);
        d(bevVar, a2, tevVar, context);
    }

    public static final coil.c f() {
        coil.c cVar = a;
        if (cVar != null) {
            return cVar;
        }
        ny61.r("Call initializeImageClient before imageClient usage");
        return null;
    }

    public static void g(Context context) {
        coil.b bVar = new coil.b(context);
        bVar.d = kotlin.a.a(new oac(EmptyList.a, 0));
        a.C0028a c0028a = new a.C0028a();
        ixw0 ixw0Var = new ixw0(0);
        ArrayList arrayList = c0028a.e;
        arrayList.add(ixw0Var);
        arrayList.add(new i9v(0));
        bVar.f = c0028a.c();
        axj axjVar = new axj();
        File o = kotlin.io.b.o(context.getCacheDir(), "custom_image_cache");
        String str = oq90.b;
        axjVar.a = sms.e(o);
        axjVar.c = 0.024d;
        bVar.c = new InitializedLazyImpl(axjVar.a());
        bVar.e = new s59(ail0.a);
        a = bVar.a();
    }

    public static final void h(Drawable drawable) {
        if (drawable instanceof AnimatedImageDrawable) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            animatedImageDrawable.setRepeatCount(0);
            animatedImageDrawable.start();
        } else if (drawable instanceof MovieDrawable) {
            MovieDrawable movieDrawable = (MovieDrawable) drawable;
            movieDrawable.setRepeatCount(0);
            movieDrawable.start();
        } else if (drawable instanceof ScaleDrawable) {
            h(((ScaleDrawable) drawable).getChild());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Drawable drawable) {
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
