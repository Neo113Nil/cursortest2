package xsna;

import com.vk.dto.group.GroupSuggestion;
import xsna.dek0;

/* compiled from: CircleSuggestedGroupHolder.kt */
/* loaded from: classes4.dex */
public final class ddc extends vo6 {
    public static final int A = iah0.a(80);

    @Override // xsna.vo6
    public final int q6() {
        return A;
    }

    @Override // xsna.vo6, xsna.vif0
    /* renamed from: s6 */
    public final void i6(GroupSuggestion groupSuggestion) {
        int i = dek0.a;
        dek0.b(this.o, null, new dek0.a(A / 2.0f, true), 10);
        hd60.a().T("show_group_suggestion", groupSuggestion, this.y);
        super.i6(groupSuggestion);
    }
}
