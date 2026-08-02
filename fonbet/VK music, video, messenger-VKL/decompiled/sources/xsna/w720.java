package xsna;

import android.app.Activity;
import android.view.View;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.ui.widget.MenuListView;

/* compiled from: MenuListView.java */
/* loaded from: classes7.dex */
public final class w720 implements View.OnClickListener {
    public final /* synthetic */ MenuListView b;

    public w720(MenuListView menuListView) {
        this.b = menuListView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuListView menuListView = this.b;
        if (((Activity) menuListView.getContext()).isTaskRoot()) {
            ((SlidingPaneLayout) menuListView.getParent()).a();
            return;
        }
        Activity activity = (Activity) menuListView.getContext();
        FragmentImpl u = activity instanceof ey50 ? ((ey50) activity).Y().u() : null;
        if (u == null) {
            activity.finish();
        } else {
            if (u.a0()) {
                return;
            }
            activity.finish();
        }
    }
}
