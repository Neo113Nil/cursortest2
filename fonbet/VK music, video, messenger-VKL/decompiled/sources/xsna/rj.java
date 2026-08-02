package xsna;

import android.widget.CompoundButton;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rj implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                ((sj) this.c).l.z(z);
                break;
            default:
                ((r79) this.c).q(new xcw0.h0(z));
                break;
        }
    }
}
