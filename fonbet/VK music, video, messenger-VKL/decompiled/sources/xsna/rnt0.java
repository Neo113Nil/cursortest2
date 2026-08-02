package xsna;

import android.view.View;
import android.widget.EditText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class rnt0 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rnt0(View view, Object obj, int i) {
        this.b = i;
        this.c = view;
        this.d = obj;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        switch (this.b) {
            case 0:
                this.c.removeOnLayoutChangeListener((qnt0) this.d);
                break;
            default:
                ((EditText) this.c).removeTextChangedListener((zvt0) this.d);
                break;
        }
    }
}
