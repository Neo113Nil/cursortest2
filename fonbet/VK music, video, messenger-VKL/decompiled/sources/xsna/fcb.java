package xsna;

import android.view.KeyEvent;
import android.widget.TextView;
import xsna.kcb;
import xsna.vrh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fcb implements TextView.OnEditorActionListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fcb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.b) {
            case 0:
                kcb.a aVar = (kcb.a) this.c;
                if (i == 6) {
                    mhy.d(aVar.o);
                    break;
                }
                break;
            default:
                zuq zuqVar = (zuq) this.c;
                if (i == 3) {
                    vrh0.a aVar2 = zuqVar.i;
                    if (aVar2 != null) {
                        aVar2.c(null);
                    }
                    zuqVar.c.d0();
                    break;
                }
                break;
        }
        return true;
    }
}
