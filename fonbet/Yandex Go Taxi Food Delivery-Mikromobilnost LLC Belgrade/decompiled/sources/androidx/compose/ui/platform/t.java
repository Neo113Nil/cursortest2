package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import defpackage.sls;
import defpackage.vg10;
import defpackage.wj6;
import defpackage.zy11;

/* loaded from: classes10.dex */
public abstract class t {
    public static final sls a(AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            vg10.k("Cannot configure ", abstractComposeView, " to disposeComposition at Lifecycle ON_DESTROY: ", lifecycle, "is already destroyed");
            return null;
        }
        final wj6 wj6Var = new wj6(9, abstractComposeView);
        lifecycle.a(wj6Var);
        return new sls() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Lifecycle.this.d(wj6Var);
                return zy11.a;
            }
        };
    }
}
