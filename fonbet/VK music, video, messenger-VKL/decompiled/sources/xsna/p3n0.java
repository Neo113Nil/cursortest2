package xsna;

import com.vk.dto.group.GroupSuggestion;

/* compiled from: SuggestedGroupHolder.kt */
/* loaded from: classes4.dex */
public final class p3n0 extends vo6 {
    public static final int A = iah0.a(144);

    @Override // xsna.vo6
    public final int q6() {
        return A;
    }

    @Override // xsna.vo6, xsna.vif0
    /* renamed from: s6 */
    public final void i6(GroupSuggestion groupSuggestion) {
        hd60.a().T("show_group_suggestion", groupSuggestion, this.y);
        super.i6(groupSuggestion);
    }
}
