package androidx.compose.ui.focus;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.dmm0;
import defpackage.iz40;

/* loaded from: classes.dex */
public final class a {
    public final c a;
    public final AndroidComposeView b;
    public final iz40 c = dmm0.a();
    public final iz40 d = dmm0.a();
    public boolean e;

    public a(c cVar, AndroidComposeView androidComposeView) {
        this.a = cVar;
        this.b = androidComposeView;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.b.registerOnEndApplyChangesListener(new FocusInvalidationManager$scheduleInvalidation$1(0, this, a.class, "invalidateNodes", "invalidateNodes()V", 0));
        this.e = true;
    }
}
