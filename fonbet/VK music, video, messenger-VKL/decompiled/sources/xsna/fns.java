package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.d;
import xsna.ikv0;

/* compiled from: FriendsCleanupMessageDialog.kt */
/* loaded from: classes15.dex */
public final class fns extends d.a {
    public final long c;

    public fns(Context context, int i) {
        super(context);
        this.c = 4000L;
        l(i);
    }

    @Override // androidx.appcompat.app.d.a
    public final androidx.appcompat.app.d m() {
        View decorView;
        Activity h = e3m.h(getContext());
        Window window = h != null ? h.getWindow() : null;
        if (window != null) {
            int i = ikv0.e;
            ikv0.b.a(window);
        }
        androidx.appcompat.app.d m = super.m();
        Window window2 = m.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setBackgroundResource(R.color.transparent);
        }
        i0q0.d(this.c, new ou4(m, 5));
        return m;
    }
}
