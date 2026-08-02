package xsna;

import android.widget.CompoundButton;
import xsna.w19;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l29 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l29(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                ((o29) this.c).b.invoke(new w19.k(z));
                break;
            case 1:
                i6c i6cVar = (i6c) ((k6c) this.c).h;
                if (i6cVar != null) {
                    i6cVar.t2(z);
                    break;
                }
                break;
            default:
                vqu vquVar = (vqu) this.c;
                vquVar.getSearchParams().e = z;
                vquVar.i();
                break;
        }
    }
}
