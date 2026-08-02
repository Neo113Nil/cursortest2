package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.gm50;
import xsna.mk50;
import xsna.v88;

/* compiled from: OneByOneGroupedPollFragment.kt */
/* loaded from: classes6.dex */
public final class ji80 extends v88 {
    public static final /* synthetic */ int n1 = 0;

    /* compiled from: OneByOneGroupedPollFragment.kt */
    public static final class a extends v88.a {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ji80 ji80Var = new ji80();
            ji80Var.setArguments(S0());
            return ji80Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_one_by_one_poll);
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        nw20 nw20Var = new nw20(context, i);
        nw20Var.j = true;
        return nw20Var;
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ctb0 ctb0Var = (ctb0) ao50Var;
        TextView textView = (TextView) view.findViewById(R.id.poll_progress_text);
        UxPollEntryPoint co = co();
        n8 n8Var = new n8(1, this, ji80.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8);
        uqb0 uqb0Var = new uqb0();
        uqb0Var.x0(s3j.class, new lx60(7, co, n8Var));
        uqb0Var.hasStableIds();
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.poll_current_question);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setAdapter(uqb0Var);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            ((androidx.recyclerview.widget.n0) recyclerView.getItemAnimator()).g = false;
        }
        new hzt0(viewPager2);
        Pair pair = new Pair(viewPager2, uqb0Var);
        gm50.a.b(this, ctb0Var.a, new zkk(this, textView, (uqb0) pair.g(), (ViewPager2) pair.d(), 3));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        return new mk50.b(R.layout.polls_action_button);
    }

    @Override // xsna.v88
    public final dtb0 bo(UxPoll uxPoll) {
        return new li80(uxPoll);
    }

    @Override // xsna.v88
    public final void fo(VkButton vkButton) {
        jjc.g(vkButton, new px30(this, 12));
    }
}
