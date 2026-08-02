package xsna;

import android.net.Uri;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ yw(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "ActionButtonsToolbarButtonBack");
                qgi0.h(tgi0Var, this.c);
                return s3q0.a;
            case 1:
                return ((Uri.Builder) obj).encodedAuthority(this.c);
            default:
                b6m.e().e(new jbs((FragmentImpl) obj), this.c);
                return s3q0.a;
        }
    }
}
