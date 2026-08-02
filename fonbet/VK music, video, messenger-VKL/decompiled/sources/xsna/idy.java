package xsna;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: KeyEventDispatcher.java */
/* loaded from: classes11.dex */
public final class idy {

    /* compiled from: KeyEventDispatcher.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static void a() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
    }

    @SuppressLint({"LambdaLast"})
    public static boolean b(a aVar, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.superDispatchKeyEvent(keyEvent);
    }
}
