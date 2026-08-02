package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes9.dex */
public final class ckf0 {
    public final Activity a;
    public SimpleSpinnerModalView b;

    public ckf0(Activity activity) {
        this.a = activity;
    }

    public final void a() {
        ViewGroup viewGroup;
        if (this.b == null && (viewGroup = (ViewGroup) this.a.findViewById(teh0.top_fullscreen_modal_views_container)) != null) {
            SimpleSpinnerModalView.Companion.getClass();
            this.b = yes0.c(viewGroup, true, false);
        }
    }
}
