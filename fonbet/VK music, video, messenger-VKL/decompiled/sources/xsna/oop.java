package xsna;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.vk.search.discover.query.SearchQueryValueHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class oop implements TextView.OnEditorActionListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oop(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.b) {
            case 0:
                pop popVar = (pop) this.c;
                if (i == 2) {
                    View view = popVar.y;
                    if (view == null) {
                        view = null;
                    }
                    if (view.isEnabled()) {
                        Object obj = popVar.o;
                        ((qop) (obj != null ? obj : null)).z0();
                        break;
                    }
                }
                break;
            default:
                xz70 xz70Var = (xz70) this.c;
                if (i == 3) {
                    z1h0 z1h0Var = xz70Var.a;
                    SearchQueryValueHelper searchQueryValueHelper = xz70Var.f;
                    if (!(z1h0Var instanceof vxh0)) {
                        xz70Var.a(searchQueryValueHelper.b());
                        xz70Var.e.d0();
                        break;
                    } else {
                        ((vxh0) z1h0Var).E2(searchQueryValueHelper.b().b);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
