package xsna;

import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CommunityLeaveModalBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public final class l7h extends o4h {
    public final qrh b;

    public l7h(qrh qrhVar) {
        this.b = qrhVar;
    }

    @Override // xsna.o4h
    public final List<e520> a() {
        return e43.l(new e520(R.id.vk_community_leave_community, 0, R.string.community_leave_public, 0, true, 0, 0, false, null, 0, null, false, 8162), new e520(R.id.vk_community_hide_leave_menu, 0, R.string.community_leave_cancel, 1, false, 0, 0, false, null, 0, null, false, 8162));
    }

    @Override // xsna.o4h
    public final String b() {
        return "community_leave_actions_menu_tag";
    }

    @Override // xsna.o4h
    public final void c(e520 e520Var) {
        dw20 dw20Var;
        int i = e520Var.a;
        if (i == R.id.vk_community_leave_community) {
            this.b.invoke();
        } else {
            if (i != R.id.vk_community_change_desicion || (dw20Var = this.a) == null) {
                return;
            }
            dw20Var.dismiss();
        }
    }
}
