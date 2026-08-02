package xsna;

import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.ReactionView;
import java.util.Optional;
import xsna.vam0;

/* compiled from: StoryReactionEditorPresenter.kt */
/* loaded from: classes16.dex */
public final class yam0 implements uyl0 {
    public final xam0 b;
    public final vam0.a c;
    public y0f0 d;
    public boolean e;
    public final io.reactivex.rxjava3.subjects.d<Optional<y0f0>> f;
    public final io.reactivex.rxjava3.disposables.c g;

    public yam0(xam0 xam0Var, vam0.a aVar, fbm0 fbm0Var, y0f0 y0f0Var, Boolean bool) {
        this.b = xam0Var;
        this.c = aVar;
        this.d = y0f0Var;
        this.e = bool == null || bool.booleanValue();
        this.f = io.reactivex.rxjava3.subjects.d.O0(Optional.ofNullable(y0f0Var));
        this.g = ktr.c(new io.reactivex.rxjava3.internal.operators.mixed.q(fbm0Var.a().l(new xhb0(new p6e0(this, 6), 7)), new xb20(new waf0(this, 14), 17))).subscribe(new fs00(new gda0(this, 20), 26), new ca10(new gz30(this), 25));
    }

    @Override // xsna.uyl0
    public final void X1(nov novVar) {
        if ((novVar instanceof abm0 ? new abm0(((abm0) novVar).getContext()) : null) == null) {
            return;
        }
        xam0 xam0Var = this.b;
        iz8 iz8Var = xam0Var.g;
        if (iz8Var != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = xam0Var.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            Float f = iz8Var.g;
            if (f == null) {
                layoutParams.gravity = 17;
            } else {
                layoutParams.gravity = 48;
                layoutParams.y = (int) f.floatValue();
            }
            layoutParams.width = -1;
            layoutParams.height = iz8Var.b;
            Window window2 = xam0Var.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
        new FrameLayout.LayoutParams(-2, -2).gravity = 17;
    }

    @Override // xsna.uyl0
    public final void k() {
        y0f0 y0f0Var = this.d;
        if (y0f0Var != null) {
            boolean z = this.e;
            vam0.a aVar = this.c;
            vam0 vam0Var = vam0.this;
            abm0 abm0Var = aVar.b;
            ReactionView reactionView = abm0Var.g;
            reactionView.setReaction(y0f0Var);
            if (z) {
                reactionView.setBubbleBackground(ReactionView.Background.BLACK);
            } else {
                reactionView.setBubbleBackground(ReactionView.Background.WHITE);
            }
            abm0Var.h = Boolean.valueOf(z);
            abm0Var.i = y0f0Var;
            u76 u76Var = vam0Var.f;
            u76Var.v2(abm0Var);
            Boolean bool = aVar.d;
            y0f0 y0f0Var2 = aVar.c;
            if (y0f0Var2 != null && bool != null && (y0f0Var.a != y0f0Var2.a || !Boolean.valueOf(z).equals(bool))) {
                u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
            }
        }
        this.b.dismiss();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.uyl0
    public final void onStart() {
    }

    @Override // xsna.uyl0
    public final void onStop() {
    }
}
