package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.ironsource.X3;

/* loaded from: classes8.dex */
public final class Sc {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Sc("jvm", "binder"));
        sparseArray.put(5890, new Sc("jvm", X3.i.b));
        sparseArray.put(5889, new Sc("jvm", X3.i.b));
        sparseArray.put(5897, new Sc("jni_native", X3.i.b));
        sparseArray.put(5898, new Sc("jni_native", X3.i.b));
    }

    public Sc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
