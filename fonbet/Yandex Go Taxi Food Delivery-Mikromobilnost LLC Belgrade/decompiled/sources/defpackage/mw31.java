package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public final /* synthetic */ class mw31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ mw31(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.setVisibility(8);
                break;
            default:
                view.setVisibility(0);
                break;
        }
    }
}
