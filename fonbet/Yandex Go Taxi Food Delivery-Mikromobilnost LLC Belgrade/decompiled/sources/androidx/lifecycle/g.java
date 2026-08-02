package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.tpr;

/* loaded from: classes.dex */
public abstract class g {
    public static final kotlinx.coroutines.flow.b a(tpr tprVar, Lifecycle lifecycle, Lifecycle.State state) {
        return kotlinx.coroutines.flow.e.g(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, tprVar, null));
    }
}
