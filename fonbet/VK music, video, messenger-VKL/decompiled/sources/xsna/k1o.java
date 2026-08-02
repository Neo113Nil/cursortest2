package xsna;

import android.view.KeyEvent;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k1o implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ k1o(KeyEvent.Callback callback, int i, int i2) {
        this.b = i2;
        this.d = callback;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                l1o l1oVar = (l1o) this.d;
                LinearLayoutManager linearLayoutManager = l1oVar.c;
                int i = this.c;
                linearLayoutManager.scrollToPosition(i);
                l1oVar.a(i);
                break;
            default:
                ((ner0) this.d).setMax(this.c);
                break;
        }
    }
}
