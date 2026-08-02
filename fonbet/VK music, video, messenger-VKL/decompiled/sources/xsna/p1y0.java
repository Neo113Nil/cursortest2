package xsna;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p1y0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ViewGroup) ((ViewStub) ((q1y0) this.c).a.findViewById(R.id.write_bar_reply_layout_viewstub)).inflate();
            default:
                ((hrl) this.c).d = false;
                return s3q0.a;
        }
    }
}
