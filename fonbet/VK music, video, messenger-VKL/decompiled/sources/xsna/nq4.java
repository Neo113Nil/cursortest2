package xsna;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.ironsource.B;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.stories.design.view.archive.StoryArchiveFastScrollView;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import com.vk.voip.VoipCallActivity;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nq4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nq4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar;
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                break;
            case 1:
                Iterator it = ((dy4) this.c).i.iterator();
                while (it.hasNext()) {
                    ((com.vk.music.player.e) it.next()).B1();
                }
                break;
            case 2:
                B.b((B) this.c);
                break;
            case 3:
                VkOnboardingHighlighter.e((VkOnboardingHighlighter) this.c, false, null, false, null, 12);
                break;
            case 4:
                y8i.d((y8i) this.c);
                break;
            case 5:
                FastScroller fastScroller = (FastScroller) this.c;
                if (!fastScroller.isPressed() && fastScroller.i && (izsVar = fastScroller.t) != null) {
                    fastScroller.i = false;
                    TextView textView = fastScroller.g;
                    if (textView != null) {
                        izsVar.invoke(textView.animate()).setListener(new olq(textView, fastScroller)).start();
                        break;
                    }
                }
                break;
            case 6:
                ((elm0) this.c).d(false);
                break;
            case 7:
                nnz nnzVar = (nnz) this.c;
                nnzVar.f();
                oiz presenter = nnzVar.b.getPresenter();
                if (presenter != null) {
                    presenter.h();
                    break;
                }
                break;
            case 8:
                b3f0 b3f0Var = (b3f0) this.c;
                gzs<s3q0> gzsVar = b3f0Var.d;
                m3r m3rVar = b3f0Var.a;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                bwt0.p0(m3rVar, false);
                m3rVar.setSelectedReactionPosition(-1);
                for (f3r f3rVar : b3f0Var.b.getReactionViews()) {
                    f3rVar.e();
                    f3rVar.c();
                }
                m3rVar.setPopupHideInProgress$design_release(false);
                b3f0Var.c.b();
                break;
            case 9:
                StandalonePlayerFragment standalonePlayerFragment = (StandalonePlayerFragment) this.c;
                int i = StandalonePlayerFragment.a0;
                standalonePlayerFragment.tn();
                break;
            case 10:
                StoryArchiveFastScrollView storyArchiveFastScrollView = (StoryArchiveFastScrollView) this.c;
                int i2 = StoryArchiveFastScrollView.h;
                storyArchiveFastScrollView.c();
                break;
            case 11:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) this.c;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    break;
                }
                break;
            case 12:
                ((ikv0) this.c).a();
                break;
            case 13:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.c;
                int i3 = VoipCallActivity.P;
                voipCallActivity.getWindow().addFlags(67108864);
                break;
            case 14:
                ((yads.fl2) this.c).g();
                break;
            default:
                yads.jm.a((yads.jm) this.c);
                break;
        }
    }
}
