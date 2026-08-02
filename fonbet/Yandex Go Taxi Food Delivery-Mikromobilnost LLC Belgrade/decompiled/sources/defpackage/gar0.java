package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class gar0 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gar0(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.R) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        View view = this.a;
        switch (i) {
            case 0:
                c.C(c.h(((mar0) obj).a, view), view);
                break;
            default:
                ((kk31) view).render(((f0v) obj).a);
                break;
        }
    }
}
