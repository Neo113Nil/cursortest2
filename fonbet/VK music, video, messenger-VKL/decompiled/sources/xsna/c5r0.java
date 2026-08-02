package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.vk.core.tool.view.SimpleRatioFrameLayout;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.uxpolls.domain.exception.LoadWebAppError;
import com.vk.uxpolls.domain.exception.RetrievePollsError;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.concurrent.TimeUnit;

/* compiled from: UxPollsHolder.kt */
/* loaded from: classes4.dex */
public final class c5r0 extends qi6<UxPollsEntry> implements dub0, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int K = 0;
    public final w5r0 C;
    public final zqw D;
    public final FrameLayout E;
    public final SimpleRatioFrameLayout F;
    public final ProgressBar G;
    public PollsWebView H;
    public boolean I;
    public final io.reactivex.rxjava3.disposables.b J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c5r0(ViewGroup viewGroup, w5r0 w5r0Var, zqw zqwVar) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.ux_polls_container);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(gbg0.a(frameLayout.getResources(), 20.0f));
        this.C = w5r0Var;
        this.D = zqwVar;
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.ux_polls_container);
        this.E = frameLayout2;
        SimpleRatioFrameLayout simpleRatioFrameLayout = new SimpleRatioFrameLayout(this.itemView.getContext(), null, 6, 0);
        this.F = simpleRatioFrameLayout;
        ProgressBar progressBar = new ProgressBar(this.itemView.getContext());
        this.G = progressBar;
        this.J = new io.reactivex.rxjava3.disposables.b();
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(gbg0.a(this.itemView.getResources(), 48.0f), gbg0.a(this.itemView.getResources(), 48.0f), 17));
        simpleRatioFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 1));
        simpleRatioFrameLayout.setOrientation(0);
        simpleRatioFrameLayout.setRatio(1.7777778f);
        simpleRatioFrameLayout.setVisibility(4);
        frameLayout2.addView(simpleRatioFrameLayout);
        frameLayout2.addView(progressBar);
        this.itemView.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.dub0
    public final void A9() {
        UxPollsEntry q6 = q6();
        String str = com.vk.newsfeed.common.util.k.a;
        if (q6 == null) {
            return;
        }
        b.d dVar = new b.d("uxpoll_block_click");
        dVar.b(q6.j.b, "track_code");
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.c()), "at");
        dVar.e();
    }

    @Override // xsna.qi6
    public final void E6(UxPollsEntry uxPollsEntry) {
        UxPollsEntry uxPollsEntry2 = uxPollsEntry;
        this.F.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 1));
        PollsWebView pollsWebView = this.H;
        if (pollsWebView != null) {
            pollsWebView.setPollsListener(null);
            this.E.removeView(pollsWebView);
        }
        this.H = null;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new ra9(this, uxPollsEntry2, 1));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.J.b(vVar.q(asu0.m()).m(asu0Var.d()).subscribe(new h4f0(new r50(1, this, c5r0.class, "addUxPollsView", "addUxPollsView(Lcom/vk/uxpolls/presentation/view/PollsWebView;)V", 0, 7), 11), new dpo0(new t50(com.vk.metrics.eventtracking.b.a, 16), 3)));
    }

    @Override // xsna.dub0
    public final void Gk() {
        bwt0.p0(this.G, false);
        zqw zqwVar = this.D;
        if (zqwVar != null) {
            zqwVar.a(TimeUnit.HOURS.toMillis(4L));
        }
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        PollsWebView pollsWebView = this.H;
        if (pollsWebView != null) {
            pollsWebView.setPollsListener(null);
            this.E.removeView(pollsWebView);
        }
        this.H = null;
        this.J.e();
    }

    @Override // xsna.dub0
    public final void J6(Throwable th) {
        if ((th instanceof RetrievePollsError) || (th instanceof LoadWebAppError)) {
            this.I = false;
            p870.f().e(100, q6());
        }
    }

    @Override // xsna.dub0
    public final void i1() {
        this.I = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.J.e();
        if (this.I) {
            this.I = false;
            p870.f().e(100, q6());
        }
    }

    @Override // xsna.dub0
    public final void on() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // xsna.dub0
    public final void v9(int i) {
    }
}
