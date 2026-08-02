package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import xsna.gzs;
import xsna.oq4;

/* loaded from: classes7.dex */
public abstract class y {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public static final void b(gzs gzsVar) {
        gzsVar.invoke();
    }

    public static void a(gzs gzsVar) {
        if (a()) {
            gzsVar.invoke();
        } else {
            a.post(new oq4(2, gzsVar));
        }
    }
}
