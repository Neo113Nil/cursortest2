package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.assessment.BadAssessmentReason;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: BadAssessmentReasonSelectionFragment.kt */
/* loaded from: classes7.dex */
public final class hy5 extends j56 {
    public View h;
    public View i;
    public RecyclerView j;
    public BadAssessmentReason k;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.h = view.findViewById(R.id.send_button);
        this.i = view.findViewById(R.id.skip_button);
        this.j = (RecyclerView) view.findViewById(R.id.recycler_view);
        View view2 = this.h;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2, new x7(this, 7));
        View view3 = this.h;
        if (view3 == null) {
            view3 = null;
        }
        view3.setEnabled(this.k != null);
        View view4 = this.i;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.i0(view4, new fb(this, 5));
        s8f0 s8f0Var = new s8f0(rl3.u0(BadAssessmentReason.values()), new com.vk.im.ui.fragments.b(this, 6), new a8(this, 7));
        RecyclerView recyclerView = this.j;
        if (recyclerView == null) {
            recyclerView = null;
        }
        androidx.recyclerview.widget.n nVar = new androidx.recyclerview.widget.n(requireContext());
        Context requireContext = requireContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.voip_quality_assessment_list_divider, requireContext);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        nVar.b = a;
        recyclerView.addItemDecoration(nVar);
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.j;
        (recyclerView3 != null ? recyclerView3 : null).setAdapter(s8f0Var);
    }

    @Override // xsna.j56
    public final int tn() {
        return R.layout.voip_call_quality_bad_assessment_reason_selection_fragment;
    }
}
