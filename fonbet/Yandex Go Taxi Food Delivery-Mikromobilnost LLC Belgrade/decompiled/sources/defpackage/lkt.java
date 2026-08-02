package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectWithHeaderView;

/* loaded from: classes6.dex */
public final class lkt extends lys {
    public static final /* synthetic */ int U = 0;
    public final boolean S;
    public final i3y T;

    public lkt(RequirementOptionsSelectWithHeaderView requirementOptionsSelectWithHeaderView, gym gymVar, boolean z) {
        super(requirementOptionsSelectWithHeaderView);
        this.S = z;
        this.T = a.b(LazyThreadSafetyMode.NONE, new dnr(23, this));
        ((RequirementOptionsSelectWithHeaderView) ((View) this.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ((RequirementOptionsSelectWithHeaderView) ((View) this.R)).setBackgroundColor(c.c(xng0.bgMain, requirementOptionsSelectWithHeaderView));
        ((RequirementOptionsSelectWithHeaderView) ((View) this.R)).setHeaderBackground(dzg0.bg_transparent_ripple);
        ((RequirementOptionsSelectWithHeaderView) ((View) this.R)).getOptionSelectorView().setListener(gymVar);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i;
        ikt iktVar = (ikt) obj;
        View view = (View) this.R;
        RequirementOptionsSelectWithHeaderView requirementOptionsSelectWithHeaderView = (RequirementOptionsSelectWithHeaderView) view;
        requirementOptionsSelectWithHeaderView.update(iktVar.b);
        boolean z = iktVar.a;
        requirementOptionsSelectWithHeaderView.setHeaderBackground((z || this.S) ? dzg0.bg_transparent_ripple : dzg0.bg_group_header);
        if (z) {
            i = ((Number) this.T.getValue()).intValue();
        } else {
            if (z) {
                w511.b();
                return;
            }
            i = 0;
        }
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }
}
