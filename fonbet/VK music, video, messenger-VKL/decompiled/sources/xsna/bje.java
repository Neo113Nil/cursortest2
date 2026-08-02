package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bje implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ bje(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                View view = this.c;
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                break;
            default:
                awt0.r((am) obj, this.c.getContext());
                break;
        }
        return s3q0.a;
    }
}
