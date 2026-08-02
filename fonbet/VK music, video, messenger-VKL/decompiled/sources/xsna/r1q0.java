package xsna;

import android.view.View;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;

/* compiled from: UiTrackingOnClickListener.kt */
/* loaded from: classes17.dex */
public class r1q0 implements View.OnClickListener {
    public final SchemeStat$TypeClickItem.Subtype b;

    /* compiled from: UiTrackingOnClickListener.kt */
    public static final class a {
        public static final void a(SchemeStat$TypeClickItem.Subtype subtype) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeClickItem(subtype), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }

    public r1q0(SchemeStat$TypeClickItem.Subtype subtype) {
        this.b = subtype;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a.a(this.b);
    }
}
