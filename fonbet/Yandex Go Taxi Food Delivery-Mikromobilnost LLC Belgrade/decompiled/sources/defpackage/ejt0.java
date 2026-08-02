package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public final class ejt0 implements djt0 {
    public WeakReference a;

    public final View a() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
