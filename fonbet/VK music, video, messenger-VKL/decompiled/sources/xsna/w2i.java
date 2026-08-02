package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunitySubscribeActionsModalBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public final class w2i extends o4h {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final w1i e;
    public final x1i f;
    public final y1i g;

    public w2i(boolean z, boolean z2, boolean z3, w1i w1iVar, x1i x1iVar, y1i y1iVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = w1iVar;
        this.f = x1iVar;
        this.g = y1iVar;
    }

    @Override // xsna.o4h
    public final List<e520> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e520(R.id.vk_community_hide_news, 0, this.c ? R.string.community_show_news : R.string.community_hide_news, 0, false, 0, 0, false, null, 0, null, false, 8178));
        if (this.d) {
            arrayList.add(new e520(R.id.vk_community_change_desicion, 0, R.string.community_event_change_decision, 1, false, 0, 0, false, null, 0, null, false, 8162));
            return arrayList;
        }
        arrayList.add(new e520(R.id.vk_community_leave_community, 0, this.b ? R.string.community_leave_public : R.string.community_leave_community, 1, true, 0, 0, false, null, 0, null, false, 8162));
        return arrayList;
    }

    @Override // xsna.o4h
    public final String b() {
        return "community_subscribe_actions_menu_tag";
    }

    @Override // xsna.o4h
    public final void c(e520 e520Var) {
        int i = e520Var.a;
        if (i == R.id.vk_community_hide_news) {
            this.e.invoke();
        } else if (i == R.id.vk_community_leave_community) {
            this.f.invoke();
        } else if (i == R.id.vk_community_change_desicion) {
            this.g.invoke();
        }
    }
}
