package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class h3c0 {
    public final Context a;

    public h3c0(Context context) {
        this.a = context;
    }

    public final cst0 a(int i, FrameLayout frameLayout) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            View inflate = LayoutInflater.from(this.a).inflate(valueOf.intValue(), frameLayout);
            if (inflate != null) {
                KeyEvent.Callback findViewById = inflate.findViewById(rdh0.eats_placeholder_splash_view);
                if (findViewById instanceof cst0) {
                    return (cst0) findViewById;
                }
            }
        }
        return null;
    }
}
