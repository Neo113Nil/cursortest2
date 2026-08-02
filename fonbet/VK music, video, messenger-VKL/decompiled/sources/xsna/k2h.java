package xsna;

import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CommunityEventDecisionBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public final class k2h extends o4h {
    public final wzh b;
    public final l1i c;
    public final com.vk.movika.sdk.base.logic.interactor.h d;

    public k2h(wzh wzhVar, l1i l1iVar, com.vk.movika.sdk.base.logic.interactor.h hVar) {
        this.b = wzhVar;
        this.c = l1iVar;
        this.d = hVar;
    }

    @Override // xsna.o4h
    public final List<e520> a() {
        return e43.l(new e520(R.id.vk_community_join_event, 0, R.string.community_event_join, 0, false, 0, 0, false, null, 0, null, false, 8178), new e520(R.id.vk_community_join_event_unsure, 0, R.string.community_event_join_unsure, 1, false, 0, 0, false, null, 0, null, false, 8178), new e520(R.id.vk_community_leave_event, 0, R.string.group_event_leave, 2, false, 0, 0, false, null, 0, null, false, 8178));
    }

    @Override // xsna.o4h
    public final String b() {
        return "community_event_decision_menu_tag";
    }

    @Override // xsna.o4h
    public final void c(e520 e520Var) {
        int i = e520Var.a;
        if (i == R.id.vk_community_join_event) {
            this.b.invoke();
        } else if (i == R.id.vk_community_join_event_unsure) {
            this.c.invoke();
        } else if (i == R.id.vk_community_leave_event) {
            this.d.invoke();
        }
    }
}
