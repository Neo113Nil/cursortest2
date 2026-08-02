package xsna;

import android.view.View;
import com.ironsource.W2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oyl0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ oyl0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bwt0.p0(this.c, true);
                break;
            default:
                W2.a.a(this.c);
                break;
        }
    }
}
