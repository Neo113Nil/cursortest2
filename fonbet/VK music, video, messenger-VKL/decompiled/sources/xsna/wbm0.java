package xsna;

import android.animation.Animator;
import com.vk.stories.design.view.editor.StoryStylePickerView;

/* compiled from: StoryRepostStyleDialog.kt */
/* loaded from: classes16.dex */
public final class wbm0 implements izs<Animator, s3q0> {
    public final /* synthetic */ nxt0 b;
    public final /* synthetic */ xbm0 c;

    public wbm0(nxt0 nxt0Var, xbm0 xbm0Var) {
        this.b = nxt0Var;
        this.c = xbm0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Animator animator) {
        nxt0 nxt0Var = this.b;
        if (nxt0Var instanceof r4g0) {
            ((r4g0) nxt0Var).getVideo().u();
        }
        xbm0 xbm0Var = this.c;
        zbm0 zbm0Var = xbm0Var.f;
        StoryStylePickerView storyStylePickerView = xbm0Var.i;
        if (storyStylePickerView != null) {
            storyStylePickerView.a(zbm0Var.a(nxt0Var), zbm0Var.d(), new defpackage.h0(24, xbm0Var, nxt0Var));
        }
        StoryStylePickerView storyStylePickerView2 = xbm0Var.i;
        if (storyStylePickerView2 != null) {
            storyStylePickerView2.setVisibility(0);
        }
        return s3q0.a;
    }
}
