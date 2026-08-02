package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes10.dex */
public final class n1 extends Lambda implements izs {
    public static final n1 b = new n1();

    public n1() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
