package xsna;

import android.view.View;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class u5l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5l(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            default:
                ((etv0) obj).b(false);
                ((View) this.c).callOnClick();
                return s3q0.a;
        }
    }
}
