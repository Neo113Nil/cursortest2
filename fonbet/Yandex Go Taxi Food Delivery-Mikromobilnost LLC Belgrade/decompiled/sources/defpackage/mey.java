package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final class mey extends ley {
    public final View b;

    public mey(iey ieyVar, View view) {
        super(ieyVar);
        this.b = view;
    }

    @Override // defpackage.ley
    public final boolean a() {
        return !this.b.isAttachedToWindow();
    }
}
