package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class bad0 {
    public final Context a;
    public WeakReference b = new WeakReference(null);

    public bad0(Context context) {
        this.a = context;
    }

    public final Context a() {
        Context context = (Context) this.b.get();
        return context == null ? this.a : context;
    }
}
