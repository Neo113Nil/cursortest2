package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import defpackage.fa51;
import defpackage.hgz;
import defpackage.kuy;
import defpackage.ooc;
import defpackage.t951;
import defpackage.tje;
import defpackage.u2s;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public abstract class a {
    public static final /* synthetic */ int a = 0;

    static {
        hgz.o("WorkForegroundRunnable");
    }

    public static final Object a(Context context, fa51 fa51Var, kuy kuyVar, u2s u2sVar, t951 t951Var, Continuation continuation) {
        Object k0;
        return (fa51Var.q && Build.VERSION.SDK_INT < 31 && (k0 = tje.k0(ooc.o(t951Var.d), new WorkForegroundKt$workForeground$2(kuyVar, fa51Var, u2sVar, context, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? k0 : zy11.a;
    }
}
