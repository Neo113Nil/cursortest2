package xsna;

import android.view.View;

/* compiled from: ClipsGridToolbarOffsetController.kt */
/* loaded from: classes17.dex */
public final class see {
    public final View a;
    public final boolean b;
    public int c;
    public int d;

    public see(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    public final void a() {
        int i = this.b ? this.c + this.d : this.d;
        int i2 = i > 0 ? 0 : 8;
        View view = this.a;
        view.setVisibility(i2);
        bwt0.c0(i, view);
    }
}
