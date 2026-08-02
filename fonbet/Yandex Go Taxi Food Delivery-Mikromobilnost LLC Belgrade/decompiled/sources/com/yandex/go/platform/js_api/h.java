package com.yandex.go.platform.js_api;

import android.app.Activity;
import com.yandex.go.platform.js_api.models.JsFile;
import defpackage.lb20;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class h {
    public final Activity a;
    public final lb20 b;
    public final String c;

    public h(Activity activity, lb20 lb20Var, String str) {
        this.a = activity;
        this.b = lb20Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsFile jsFile, ContinuationImpl continuationImpl) {
        JsSavingHandler$save$1 jsSavingHandler$save$1;
        int i;
        if (continuationImpl instanceof JsSavingHandler$save$1) {
            jsSavingHandler$save$1 = (JsSavingHandler$save$1) continuationImpl;
            int i2 = jsSavingHandler$save$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsSavingHandler$save$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsSavingHandler$save$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsSavingHandler$save$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    JsSavingHandler$save$2 jsSavingHandler$save$2 = new JsSavingHandler$save$2(this, jsFile, null);
                    jsSavingHandler$save$1.label = 1;
                    obj = tje.k0(mdhVar, jsSavingHandler$save$2, jsSavingHandler$save$1);
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
                return ((Result) obj).getValue();
            }
        }
        jsSavingHandler$save$1 = new JsSavingHandler$save$1(this, continuationImpl);
        Object obj2 = jsSavingHandler$save$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsSavingHandler$save$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
