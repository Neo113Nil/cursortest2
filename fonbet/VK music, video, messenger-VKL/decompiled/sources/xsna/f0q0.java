package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;

/* compiled from: UiStoryViewDelegate.kt */
/* loaded from: classes6.dex */
public final class f0q0 {
    public final q7r a;
    public final kl20 b;
    public final eza0 c;

    public f0q0(q7r q7rVar, kl20 kl20Var, eza0 eza0Var) {
        this.a = q7rVar;
        this.b = kl20Var;
        this.c = eza0Var;
    }

    public final void a() {
        StoryProgressView storyProgressView;
        q7r q7rVar = this.a;
        StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
        if (storyBottomViewGroup != null) {
            storyBottomViewGroup.setVisibility(8);
        }
        StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
        if (storyUploadIndicatorView != null) {
            storyUploadIndicatorView.setVisibility(8);
        }
        xaj0 xaj0Var = q7rVar.v;
        if (xaj0Var != null) {
            xaj0Var.a.setVisibility(8);
        }
        MediaAdView mediaAdView = q7rVar.z;
        if (mediaAdView != null) {
            mediaAdView.setVisibility(8);
        }
        View view = q7rVar.L;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = q7rVar.M;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        umm0 umm0Var = q7rVar.i0.b;
        if (umm0Var == null || (storyProgressView = umm0Var.b) == null) {
            return;
        }
        bwt0.p0(storyProgressView, false);
    }

    public final void b() {
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        if (mkm0Var.f || mkm0Var.n) {
            return;
        }
        mkm0Var.o = false;
        q7rVar.h0.removeCallbacksAndMessages(null);
        q7rVar.d.run();
    }

    public final void c() {
        this.a.getClass();
    }

    public final void d(StoryEntry storyEntry) {
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.i0;
        if (!mkm0Var.getStoriesContainer().Rb() || q7rVar.H == null) {
            g();
            return;
        }
        if (!mkm0Var2.getDependencies().o.m(storyEntry.c)) {
            StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
            if (storyUploadIndicatorView != null) {
                storyUploadIndicatorView.setState(StoryUploadIndicatorView.State.IDLE);
            }
            StoryUploadIndicatorView storyUploadIndicatorView2 = q7rVar.H;
            if (storyUploadIndicatorView2 != null) {
                storyUploadIndicatorView2.setVisibility(8);
            }
            StoryUploadIndicatorView storyUploadIndicatorView3 = q7rVar.H;
            if (storyUploadIndicatorView3 != null) {
                storyUploadIndicatorView3.setBackgroundColor(0);
            }
            View view = q7rVar.I;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = q7rVar.J;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            g();
            return;
        }
        StoryUploadIndicatorView storyUploadIndicatorView4 = q7rVar.H;
        if (storyUploadIndicatorView4 != null) {
            storyUploadIndicatorView4.setVisibility(0);
        }
        if (mkm0Var2.getDependencies().o.g(storyEntry.c)) {
            StoryUploadIndicatorView storyUploadIndicatorView5 = q7rVar.H;
            if (storyUploadIndicatorView5 != null) {
                storyUploadIndicatorView5.setState(StoryUploadIndicatorView.State.ERROR);
                return;
            }
            return;
        }
        StoryUploadIndicatorView storyUploadIndicatorView6 = q7rVar.H;
        if (storyUploadIndicatorView6 != null) {
            storyUploadIndicatorView6.setState(StoryUploadIndicatorView.State.PROGRESS);
        }
        float h = mkm0Var2.getDependencies().o.h(storyEntry.c);
        StoryUploadIndicatorView storyUploadIndicatorView7 = q7rVar.H;
        if (storyUploadIndicatorView7 != null) {
            storyUploadIndicatorView7.setProgress(h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Dialog dialog, final zsu zsuVar) {
        ww50 v;
        if (dialog == 0) {
            return;
        }
        try {
            dialog.show();
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.e0q0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    DialogInterface.OnDismissListener onDismissListener = zsuVar;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(dialogInterface);
                    }
                    this.a.j0.onDismiss(dialogInterface);
                }
            });
        } catch (Throwable unused) {
        }
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        Dialog currentDialog = mkm0Var.getCurrentDialog();
        if (currentDialog != null) {
            currentDialog.dismiss();
        }
        q7rVar.i0.setCurrentDialog(dialog);
        this.c.b();
        try {
            Dialog currentDialog2 = mkm0Var.getCurrentDialog();
            if (currentDialog2 != null) {
                currentDialog2.show();
            }
        } catch (Throwable unused2) {
        }
        if ((dialog instanceof fcn) && (v = s200.v(mkm0Var.getContext())) != null) {
            v.S((fcn) dialog);
        }
        mkm0Var.Q0();
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (mkm0Var.f || !mkm0Var.R0() || currentStory == null) {
            return;
        }
        mkm0Var.getDependencies().e.f(currentStory, mkm0Var.getViewEntryPoint());
    }

    public final void f(Uri uri, Throwable th) {
        q7r q7rVar = this.a;
        mkm0 mkm0Var = q7rVar.i0;
        Handler handler = q7rVar.h0;
        if (mkm0Var.f || mkm0Var.n) {
            return;
        }
        mkm0Var.getDependencies().s.j = true;
        if (th != null) {
            kl20 kl20Var = this.b;
            vrl0 a = kl20Var.a.a();
            if (a != null) {
                StoryEntry currentStory = kl20Var.a.i0.getCurrentStory();
                q7r q7rVar2 = kl20Var.a;
                a.p(currentStory, th, q7rVar2.i0.f, q7rVar2.b(), uri);
            }
        }
        q7rVar.i0.o = true;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(q7rVar.c, 0L);
    }

    public final void g() {
        StoryBottomViewGroup storyBottomViewGroup;
        q7r q7rVar = this.a;
        StoryEntry currentStory = q7rVar.i0.getCurrentStory();
        if (currentStory == null || !q7rVar.i0.R0() || (storyBottomViewGroup = q7rVar.G) == null) {
            return;
        }
        storyBottomViewGroup.B.m(currentStory, true);
    }
}
