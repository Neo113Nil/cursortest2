package xsna;

import android.view.View;
import com.vkontakte.android.ui.widget.MenuListView;

/* compiled from: MenuListView.java */
/* loaded from: classes7.dex */
public final class x720 implements View.OnClickListener {
    public final /* synthetic */ MenuListView b;

    public x720(MenuListView menuListView) {
        this.b = menuListView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lyd.g().x(this.b.getContext(), false);
    }
}
