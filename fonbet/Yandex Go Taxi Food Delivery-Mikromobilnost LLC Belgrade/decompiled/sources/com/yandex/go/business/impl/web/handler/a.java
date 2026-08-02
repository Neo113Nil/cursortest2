package com.yandex.go.business.impl.web.handler;

import android.content.Context;
import com.yandex.go.business.impl.web.model.JsFile;
import defpackage.hst;
import defpackage.j73;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xby;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public static Result.Failure a(NullPointerException nullPointerException) {
        hst hstVar = jst.e;
        String X = kotlin.collections.a.X(j73.A(new String[]{"YangoBusiness", "JsSavingHandler", qoi0.a(nullPointerException.getClass()).d()}), Extension.DOT_CHAR, null, null, null, 62);
        String message = nullPointerException.getMessage();
        if (message == null) {
            message = "";
        }
        xby.l(hstVar, X, null, nullPointerException, message, 2);
        return new Result.Failure(nullPointerException);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(JsFile jsFile, ContinuationImpl continuationImpl) {
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
                    jsSavingHandler$save$1.L$0 = null;
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
