package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ d10(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setEnabled(false);
                break;
            default:
                this.c.performClick();
                ((etv0) obj).b(false);
                break;
        }
        return s3q0.a;
    }
}
