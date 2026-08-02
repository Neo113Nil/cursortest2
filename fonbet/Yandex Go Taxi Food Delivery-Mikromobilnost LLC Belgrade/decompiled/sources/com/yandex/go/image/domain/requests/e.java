package com.yandex.go.image.domain.requests;

import android.content.Context;
import coil3.request.CachePolicy;
import defpackage.aev;
import defpackage.gev;
import defpackage.m9o;
import defpackage.mev;
import defpackage.ny61;
import defpackage.oav;
import defpackage.pwy0;
import defpackage.qci0;
import defpackage.sci0;
import defpackage.t3v0;
import defpackage.vac;
import defpackage.w511;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e {
    public final Context a;
    public final oav b;
    public final pwy0 c;
    public aev d;

    public e(Context context, oav oavVar, pwy0 pwy0Var) {
        this.a = context;
        this.b = oavVar;
        this.c = pwy0Var;
        aev aevVar = new aev(context);
        aevVar.h = vac.a;
        aevVar.i = CachePolicy.DISABLED;
        this.d = aevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CoilFileRequest$submit$1 coilFileRequest$submit$1;
        int i;
        mev mevVar;
        if (continuationImpl instanceof CoilFileRequest$submit$1) {
            coilFileRequest$submit$1 = (CoilFileRequest$submit$1) continuationImpl;
            int i2 = coilFileRequest$submit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coilFileRequest$submit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coilFileRequest$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coilFileRequest$submit$1.label;
                oav oavVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gev a = this.d.a();
                    coilFileRequest$submit$1.L$0 = null;
                    coilFileRequest$submit$1.label = 1;
                    obj = ((coil3.c) oavVar).c(a, coilFileRequest$submit$1);
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
                mevVar = (mev) obj;
                if (!(mevVar instanceof m9o)) {
                    throw ((m9o) mevVar).c;
                }
                if (!(mevVar instanceof t3v0)) {
                    w511.b();
                    return null;
                }
                String str = ((t3v0) mevVar).e;
                if (str == null) {
                    ny61.r("Missing cache key after load");
                    return null;
                }
                sci0 sci0Var = (sci0) ((coil3.c) oavVar).a.e.getValue();
                if (sci0Var == null) {
                    ny61.r("Missing cache instance in ImageLoader");
                    return null;
                }
                qci0 a2 = sci0Var.a(str);
                if (a2 == null) {
                    ny61.r("Missing snapshot for key from ImageLoader");
                    return null;
                }
                File file = a2.c().toFile();
                com.yandex.go.image.internal.coil.utils.a.a(a2);
                return file;
            }
        }
        coilFileRequest$submit$1 = new CoilFileRequest$submit$1(this, continuationImpl);
        Object obj2 = coilFileRequest$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coilFileRequest$submit$1.label;
        oav oavVar2 = this.b;
        if (i != 0) {
        }
        mevVar = (mev) obj2;
        if (!(mevVar instanceof m9o)) {
        }
    }
}
