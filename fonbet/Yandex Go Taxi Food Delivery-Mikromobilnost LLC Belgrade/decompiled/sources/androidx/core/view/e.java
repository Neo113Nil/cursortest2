package androidx.core.view;

import defpackage.n751;
import defpackage.q651;
import defpackage.u651;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    n751 mDispachedInsets;
    private final int mDispatchMode;

    public e(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public void onEnd(u651 u651Var) {
    }

    public void onPrepare(u651 u651Var) {
    }

    public abstract n751 onProgress(n751 n751Var, List list);

    public abstract q651 onStart(u651 u651Var, q651 q651Var);
}
