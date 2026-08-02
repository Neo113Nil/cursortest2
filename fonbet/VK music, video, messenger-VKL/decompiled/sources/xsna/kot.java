package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.e3m;
import xsna.t69;

/* compiled from: GestureFeedbackOnboardingViewHolder.kt */
/* loaded from: classes7.dex */
public final class kot extends vfz<t69.a.b> {
    public final q69 l;
    public final View m;
    public final RecyclerView n;
    public final View o;
    public final String p;

    public kot(ViewGroup viewGroup, q69 q69Var) {
        super(R.layout.voip_onboarding_gesture_reactions_item_view, viewGroup);
        this.l = q69Var;
        View findViewById = this.itemView.findViewById(R.id.close);
        this.m = findViewById;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.feedback_recycler_view);
        this.n = recyclerView;
        this.o = this.itemView.findViewById(R.id.trigger);
        this.p = cqm0.e(this.itemView.getContext().getString(R.string.voip_feature_onboarding_gesture_feedback_title) + this.itemView.getContext().getString(R.string.voip_feature_onboarding_gesture_feedback_subtitle) + ' ');
        View view = this.itemView;
        view.setClipToOutline(true);
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        view.findViewById(R.id.background).setBackgroundColor(context.getColor(R.color.vk_azure_A400));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(new iot());
        findViewById.setContentDescription(findViewById.getContext().getString(R.string.voip_accessibility_icon_close_call_onboarding_banner));
        awt0.o(findViewById, new pwk(findViewById, 15));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t69.a.b bVar) {
        List<b69> list = bVar.d;
        bwt0.i0(this.m, new cws(this, 3));
        bwt0.i0(this.o, new wcg(this, 18));
        RecyclerView.Adapter adapter = this.n.getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.onboarding.ui.recycler.GestureFeedbackItemOnboardingAdapter");
        }
        iot iotVar = (iot) adapter;
        List<b69> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new d1f0((b69) it.next()));
        }
        iotVar.setItems(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append(this.p);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = ((b69) it2.next()).c;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        sb.append(j5g.g0(arrayList2, ", ", null, null, 0, null, 62));
        String sb2 = sb.toString();
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(R.string.voip_accessibility_call_onboarding_banner, sb2));
    }
}
