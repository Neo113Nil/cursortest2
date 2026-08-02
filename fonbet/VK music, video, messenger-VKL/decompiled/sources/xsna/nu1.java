package xsna;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.gm50;
import xsna.mk50;
import xsna.v88;

/* compiled from: AllInOnePollFragment.kt */
/* loaded from: classes6.dex */
public final class nu1 extends v88 {
    public static final /* synthetic */ int n1 = 0;

    /* compiled from: AllInOnePollFragment.kt */
    public static final class a extends v88.a {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            nu1 nu1Var = new nu1();
            nu1Var.setArguments(S0());
            return nu1Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_all_in_one_poll);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ctb0 ctb0Var = (ctb0) ao50Var;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view.findViewById(R.id.polls_root_content);
        UxPollEntryPoint co = co();
        List<PollQuestion> list = co.b.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            j4r0 j4r0Var = new j4r0((PollQuestion) it.next());
            j4r0Var.b = linearLayoutCompat.getContext();
            j4r0Var.c = new ou1(1, this, nu1.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0);
            UxPollEntryPointLocation.a aVar = UxPollEntryPointLocation.Companion;
            UxPollEntryPointLocation uxPollEntryPointLocation = co.c;
            aVar.getClass();
            ype0 d = j4r0Var.d(new zpe0(UxPollEntryPointLocation.a.a(uxPollEntryPointLocation)));
            linearLayoutCompat.addView(d.getUiView(), new LinearLayoutCompat.a(-1, -2));
            arrayList.add(d);
        }
        gm50.a.b(this, ctb0Var.a, new qd1(1, this, arrayList));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        return new mk50.b(R.layout.polls_action_button);
    }

    @Override // xsna.v88
    public final dtb0 bo(UxPoll uxPoll) {
        return new pu1(uxPoll);
    }

    @Override // xsna.v88
    public final void fo(VkButton vkButton) {
        vkButton.setText(co().b.h.d);
        jjc.g(vkButton, new mz(this, 1));
    }
}
