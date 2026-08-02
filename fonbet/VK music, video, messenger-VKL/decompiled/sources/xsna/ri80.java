package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vkontakte.android.R;
import xsna.gm50;
import xsna.mk50;
import xsna.v88;

/* compiled from: OneInOnePollFragment.kt */
/* loaded from: classes6.dex */
public final class ri80 extends v88 {
    public static final /* synthetic */ int n1 = 0;

    /* compiled from: OneInOnePollFragment.kt */
    public static final class a extends v88.a {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ri80 ri80Var = new ri80();
            ri80Var.setArguments(S0());
            return ri80Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_one_in_one_poll);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.polls_root_content);
        UxPollEntryPoint co = co();
        j4r0 j4r0Var = new j4r0((PollQuestion) j5g.Y(co.b.d));
        j4r0Var.b = frameLayout.getContext();
        j4r0Var.c = new ou1(1, this, ri80.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7);
        UxPollEntryPointLocation.a aVar = UxPollEntryPointLocation.Companion;
        UxPollEntryPointLocation uxPollEntryPointLocation = co.c;
        aVar.getClass();
        ype0 d = j4r0Var.d(new zpe0(UxPollEntryPointLocation.a.a(uxPollEntryPointLocation)));
        frameLayout.addView(d.getUiView(), new FrameLayout.LayoutParams(-1, -2));
        gm50.a.b(this, ((ctb0) ao50Var).a, new qd1(this, d));
    }

    @Override // xsna.v88, xsna.tl50
    public final /* bridge */ /* synthetic */ void Yn(ctb0 ctb0Var, View view) {
    }

    @Override // xsna.v88
    public final dtb0 bo(UxPoll uxPoll) {
        return new si80(uxPoll);
    }

    @Override // xsna.v88
    public final void eo(View view) {
    }
}
