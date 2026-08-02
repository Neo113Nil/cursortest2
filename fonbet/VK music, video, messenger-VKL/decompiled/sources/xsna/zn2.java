package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zn2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ zn2(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.bringToFront();
                return s3q0.a;
            case 1:
                return (ViewStub) this.c.findViewById(R.id.dialog_footer_actions_container_stub);
            case 2:
                return bwt0.G(this.c);
            default:
                View inflate = e3m.b(this.c.getContext()).inflate(R.layout.popup_footer_full_date, (ViewGroup) null, false);
                u11.h(-2, -2, inflate);
                return inflate;
        }
    }
}
