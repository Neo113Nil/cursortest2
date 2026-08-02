package xsna;

import android.graphics.RectF;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class igg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ igg(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                RectF rectF = new RectF();
                rectF.set(f4m.b(this.c));
                return rectF;
            case 1:
                return this.c.getContext().getString(R.string.accessibility_navigation_drawer);
            default:
                this.c.invalidate();
                return s3q0.a;
        }
    }
}
