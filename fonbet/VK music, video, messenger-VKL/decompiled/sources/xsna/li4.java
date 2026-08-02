package xsna;

import android.view.View;
import xsna.mi4;
import xsna.uh4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class li4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ li4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((mi4.a) this.d).m.invoke(new uh4.a(this.c));
                break;
            default:
                ((fpv0) this.d).a(this.c);
                break;
        }
    }
}
