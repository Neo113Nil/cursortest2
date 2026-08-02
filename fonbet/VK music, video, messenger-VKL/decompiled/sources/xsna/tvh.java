package xsna;

import android.graphics.RectF;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ tvh(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return bwt0.F(this.c);
            case 1:
                lda0.a(this.c, 0.75f, false);
                return s3q0.a;
            default:
                return new RectF(f4m.e(this.c));
        }
    }
}
