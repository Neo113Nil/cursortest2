package xsna;

import android.view.View;
import android.view.ViewStub;

/* compiled from: LazyVc.kt */
/* loaded from: classes2.dex */
public class eyy {
    public final int a;
    public final View b;
    public boolean c;
    public View d;

    public eyy(int i, View view) {
        this.a = i;
        this.b = view;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        View inflate = ((ViewStub) this.b.findViewById(this.a)).inflate();
        this.d = inflate;
        this.c = true;
        b(inflate);
    }

    public void b(View view) {
    }
}
