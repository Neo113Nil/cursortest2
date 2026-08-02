package com.yandex.passport.internal.ui.bouncer.sloth;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.sloth.ui.u0;
import defpackage.ins0;
import defpackage.shd;
import defpackage.yv5;

/* loaded from: classes2.dex */
public final class f extends ins0 implements yv5 {
    public final boolean D;
    public final b E;
    public final ComposeView F;

    static {
        shd shdVar = ComposeView.Companion;
    }

    public f(Activity activity, boolean z, b bVar) {
        this.D = z;
        this.E = bVar;
        this.F = new ComposeView(activity, null, 0, 6, null);
    }

    @Override // defpackage.yv5
    public final void c(Object obj) {
        this.F.setContent(new androidx.compose.runtime.internal.a(85521244, new e(this, (u0) obj, 1), true));
    }

    @Override // defpackage.ins0
    public final View e() {
        return this.F;
    }
}
