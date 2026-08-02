package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes9.dex */
public class ez2 implements gz2 {
    public final View a;

    @Override // defpackage.gz2
    public void a() {
        this.a.setVisibility(4);
    }

    @Override // defpackage.gz2
    public void b() {
        this.a.setVisibility(0);
    }

    public void c() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void d() {
        View view;
        View view2 = this.a;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new ce0(view, 18));
    }
}
