package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.cqc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hdx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hdx(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(Boolean.valueOf(this.c));
                return Boolean.TRUE;
            default:
                cqc0.c cVar = (cqc0.c) this.d;
                View inflate = LayoutInflater.from(cVar.a).inflate(R.layout.view_posting_visibility_more_items, (ViewGroup) cVar.i, false);
                bwt0.p0(inflate, !this.c);
                return inflate;
        }
    }
}
