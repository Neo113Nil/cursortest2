package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.LinkVh;

/* compiled from: LinkVh.kt */
/* loaded from: classes16.dex */
public final class icz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ icz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                LinkVh linkVh = (LinkVh) this.c;
                View view = linkVh.l;
                if (view == null) {
                    view = null;
                }
                linkVh.b(view.getContext());
                return s3q0.a;
            default:
                gzg0 gzg0Var = (gzg0) this.c;
                s3q0 s3q0Var = s3q0.a;
                gzg0Var.resumeWith(s3q0Var);
                return s3q0Var;
        }
    }
}
