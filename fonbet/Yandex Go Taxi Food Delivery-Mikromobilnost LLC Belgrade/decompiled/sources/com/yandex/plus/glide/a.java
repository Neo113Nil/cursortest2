package com.yandex.plus.glide;

import android.widget.ImageView;
import defpackage.a5d0;
import defpackage.ait;
import defpackage.iax0;
import defpackage.ny61;
import defpackage.o6j0;
import defpackage.p5j0;
import defpackage.ph91;
import defpackage.tls;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final p5j0 a;
    public final tls b;

    public a(p5j0 p5j0Var, tls tlsVar) {
        this.a = p5j0Var;
        this.b = tlsVar;
    }

    public final void a(a5d0 a5d0Var) {
        iax0 iax0Var = (ait) ((GlideImageLoader$wrap$1) this.b).invoke(a5d0Var);
        Executor executor = ph91.a;
        p5j0 p5j0Var = this.a;
        p5j0Var.F(iax0Var, null, p5j0Var, executor);
    }

    public final void b(ImageView imageView) {
        this.a.G(imageView);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:17)(1:19)))|34|6|7|(0)(0)|12|13|(2:15|17)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r0 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GlideImageLoader$GlideImageRequestWrapper$submit$1 glideImageLoader$GlideImageRequestWrapper$submit$1;
        Object obj;
        int i;
        Throwable a;
        if (continuationImpl instanceof GlideImageLoader$GlideImageRequestWrapper$submit$1) {
            glideImageLoader$GlideImageRequestWrapper$submit$1 = (GlideImageLoader$GlideImageRequestWrapper$submit$1) continuationImpl;
            int i2 = glideImageLoader$GlideImageRequestWrapper$submit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glideImageLoader$GlideImageRequestWrapper$submit$1.label = i2 - Integer.MIN_VALUE;
                obj = glideImageLoader$GlideImageRequestWrapper$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = glideImageLoader$GlideImageRequestWrapper$submit$1.label;
                p5j0 p5j0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o6j0 o6j0Var = new o6j0(Integer.MIN_VALUE, Integer.MIN_VALUE);
                    p5j0Var.F(o6j0Var, o6j0Var, p5j0Var, ph91.b);
                    glideImageLoader$GlideImageRequestWrapper$submit$1.L$0 = null;
                    glideImageLoader$GlideImageRequestWrapper$submit$1.L$1 = null;
                    glideImageLoader$GlideImageRequestWrapper$submit$1.L$2 = null;
                    glideImageLoader$GlideImageRequestWrapper$submit$1.I$0 = 0;
                    glideImageLoader$GlideImageRequestWrapper$submit$1.I$1 = 0;
                    glideImageLoader$GlideImageRequestWrapper$submit$1.label = 1;
                    obj = com.yandex.plus.home.common.utils.a.a(o6j0Var, glideImageLoader$GlideImageRequestWrapper$submit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null && (obj = p5j0Var.w) == null) {
                    throw a;
                }
                return obj;
            }
        }
        glideImageLoader$GlideImageRequestWrapper$submit$1 = new GlideImageLoader$GlideImageRequestWrapper$submit$1(this, continuationImpl);
        obj = glideImageLoader$GlideImageRequestWrapper$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = glideImageLoader$GlideImageRequestWrapper$submit$1.label;
        p5j0 p5j0Var2 = this.a;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
            throw a;
        }
        return obj;
    }
}
