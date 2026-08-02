package androidx.compose.ui.platform;

import defpackage.i6e0;
import defpackage.sls;
import defpackage.up31;
import defpackage.vp31;

/* loaded from: classes.dex */
public final class s implements vp31 {
    public static final s a = new s();

    @Override // defpackage.vp31
    public final sls a(AbstractComposeView abstractComposeView) {
        ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1(abstractComposeView);
        abstractComposeView.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
        up31 up31Var = new up31(abstractComposeView);
        i6e0.b(abstractComposeView).a.add(up31Var);
        return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, up31Var);
    }
}
