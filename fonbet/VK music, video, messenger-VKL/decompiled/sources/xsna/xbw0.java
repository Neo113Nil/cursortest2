package xsna;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.R;
import xsna.jr4;
import xsna.wbw0;

/* compiled from: VoiceMessageViewController.kt */
/* loaded from: classes18.dex */
public final class xbw0 extends fi6<zbw0, wbw0> {
    public final a1w f;
    public final gzs<ir4> g;
    public final izs<Integer, s3q0> h;
    public FrameLayout i;
    public ViewStub j;
    public jr4 k;

    public xbw0(a1w a1wVar, gzs gzsVar, izs izsVar) {
        super(R.layout.im_voice_message_component, new my3(R.id.audio_msg_player_container, null));
        this.f = a1wVar;
        this.g = gzsVar;
        this.h = izsVar;
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        this.i = frameLayout;
        this.j = (ViewStub) view.findViewById(R.id.audio_msg_player_stub);
        jr4 jr4Var = new jr4(this.f, this.g.invoke(), new a());
        jr4Var.D0(frameLayout.getContext(), this.i, this.j, null);
        jr4Var.Y0();
        this.k = jr4Var;
    }

    public final void R(int i) {
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ViewParent parent = frameLayout.getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        if (coordinatorLayout != null) {
            View findViewById = coordinatorLayout.findViewById(R.id.nested_coordinator);
            if (findViewById != null) {
                f4m.q(i, findViewById);
            }
            izs<Integer, s3q0> izsVar = this.h;
            if (izsVar != null) {
                izsVar.invoke(Integer.valueOf(i));
                return;
            }
            View findViewById2 = coordinatorLayout.findViewById(R.id.vkim_fab);
            if (findViewById2 != null) {
                f4m.q(e3m.a(R.dimen.vkim_fab_bottom_margin, coordinatorLayout.getContext()) + i, findViewById2);
            }
        }
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        boolean z = ((zbw0) ao50Var).a;
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        frameLayout.setVisibility(z ? 0 : 8);
        if (!z) {
            R(0);
        } else if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ybw0(this, frameLayout));
        } else {
            R(frameLayout.getHeight());
        }
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        jr4 jr4Var = this.k;
        if (jr4Var != null && jr4Var.r) {
            jr4Var.r = false;
            jr4Var.p.e();
            jr4Var.j.y(jr4Var.o);
        }
        jr4 jr4Var2 = this.k;
        if (jr4Var2 != null) {
            jr4Var2.G0();
        }
        this.k = null;
        this.i = null;
        this.j = null;
        super.onDestroyView();
    }

    /* compiled from: VoiceMessageViewController.kt */
    public static final class a implements jr4.a {
        public a() {
        }

        @Override // xsna.jr4.a
        public final void b(i34 i34Var) {
            Msg a = i34Var.b.a();
            Dialog a2 = i34Var.a.a();
            if (a2 != null) {
                xbw0.this.O(new wbw0.a(a2.Sb().longValue(), i34Var.c, a != null ? Integer.valueOf(a.b) : null));
            }
        }

        @Override // xsna.jr4.a
        public final void a() {
        }

        @Override // xsna.jr4.a
        public final void c() {
        }

        @Override // xsna.jr4.a
        public final void d() {
        }
    }
}
