package defpackage;

import com.google.android.datatransport.Priority;

/* loaded from: classes.dex */
public abstract class jeo {
    public static g64 f(Object obj) {
        return new g64(obj, Priority.DEFAULT, null);
    }

    public static g64 g(Object obj) {
        return new g64(obj, Priority.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract bfo b();

    public abstract Object c();

    public abstract Priority d();

    public abstract p7f0 e();
}
