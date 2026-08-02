package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ij3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ij3(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                lda0.a(this.c, 0.75f, true);
                break;
            default:
                this.c.performClick();
                break;
        }
        return s3q0.a;
    }
}
