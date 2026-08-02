package xsna;

import android.graphics.RectF;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hgg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ hgg(View view, int i) {
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
            default:
                return this.c.getContext().getString(R.string.back);
        }
    }
}
