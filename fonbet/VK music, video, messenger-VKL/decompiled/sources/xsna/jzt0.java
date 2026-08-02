package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ViewPagerAdapter.kt */
/* loaded from: classes6.dex */
public final class jzt0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public List<OnboardingStep> c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        xd80 xd80Var = e0Var instanceof xd80 ? (xd80) e0Var : null;
        if (xd80Var != null) {
            OnboardingStep onboardingStep = this.c.get(i);
            TextView textView = xd80Var.o;
            TextView textView2 = xd80Var.n;
            String str = onboardingStep.c;
            String str2 = onboardingStep.b;
            xd80Var.u = onboardingStep;
            gfx0 gfx0Var = e370.b;
            (gfx0Var != null ? gfx0Var : null).getClass();
            xd80Var.r.setImageResource(dhr0.M() ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56);
            textView2.setText(str2);
            textView2.setVisibility(drm0.N(str2) ? 8 : 0);
            textView.setText(str);
            textView.setVisibility(drm0.N(str) ? 8 : 0);
            xd80Var.V5(onboardingStep);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new xd80(viewGroup);
    }
}
