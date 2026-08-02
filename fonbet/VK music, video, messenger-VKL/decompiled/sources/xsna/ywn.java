package xsna;

import android.content.Context;
import android.widget.Toast;
import com.vk.core.preference.Preference;
import com.vk.core.view.search.ModernSearchView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ywn implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ywn(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                cxn.e(context, "Regular");
                return s3q0.a;
            case 1:
                h94 h94Var = ModernSearchView.y;
                return Boolean.valueOf(vtk0.d().b(context));
            case 2:
                return Preference.h(context, 0, "notifications_enabled");
            default:
                Toast.makeText(context, "on search field clicked", 0).show();
                return s3q0.a;
        }
    }

    public /* synthetic */ ywn(cxn cxnVar, Context context) {
        this.b = 0;
        this.c = context;
    }
}
