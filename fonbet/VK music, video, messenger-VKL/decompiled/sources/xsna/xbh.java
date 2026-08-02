package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xbh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ xbh(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                View view = this.c;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return s3q0.a;
            default:
                this.c.getContext();
                return Boolean.FALSE;
        }
    }
}
