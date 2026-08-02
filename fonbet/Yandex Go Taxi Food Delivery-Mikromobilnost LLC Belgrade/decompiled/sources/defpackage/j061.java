package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;

/* loaded from: classes4.dex */
public final class j061 implements zo31 {
    public final BottomBarNavigation a;
    public final LinearLayout b;
    public final View c;

    public j061(BottomBarNavigation bottomBarNavigation, LinearLayout linearLayout, View view) {
        this.a = bottomBarNavigation;
        this.b = linearLayout;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
