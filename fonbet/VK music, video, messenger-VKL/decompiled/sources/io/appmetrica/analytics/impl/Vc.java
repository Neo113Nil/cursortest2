package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes8.dex */
public abstract class Vc {
    public abstract void a(int i);

    public final synchronized void a(Context context) {
        try {
            int b = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b != libraryApiLevel) {
                if (b < libraryApiLevel) {
                    SparseArray c = c();
                    while (true) {
                        b++;
                        if (b > libraryApiLevel) {
                            break;
                        }
                        Uc uc = (Uc) c.get(b);
                        if (uc != null) {
                            uc.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
