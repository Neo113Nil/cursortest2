package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class fp8 extends wys {
    public static final /* synthetic */ int S = 0;
    public final View R;

    public fp8(View view) {
        super(view);
        this.R = view;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        View view = this.R;
        view.getContext();
        int i = ((wk80) obj).a;
        if (view.getHeight() != i) {
            c.D(view.getLayoutParams().width, i, view);
        }
    }
}
