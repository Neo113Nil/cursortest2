package xsna;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.libvideo.live.impl.views.chat.a;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;
import com.vkontakte.android.R;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: ChatInlineView.java */
/* loaded from: classes3.dex */
public final class yrb extends FrameLayout implements rpb, c30 {
    public qpb b;
    public a c;
    public final LinkedList<LiveEventModel> d;
    public final FrameLayout e;
    public float f;
    public Comment g;

    public yrb(Context context) {
        super(context, null, 0);
        this.d = new LinkedList<>();
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(120.0f));
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundResource(R.drawable.scrim_bottom);
        addView(frameLayout);
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.rpb
    public final void C4(UserId userId, a.j jVar) {
        Context context = getContext();
        if (context != null) {
            xwk.e().h0().m(context, userId, new ka(jVar, 18), null);
        }
    }

    public b30 getActionLinksPresenter() {
        return null;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        qpb qpbVar = this.b;
        if (qpbVar != null) {
            qpbVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        qpb qpbVar = this.b;
        if (qpbVar != null) {
            qpbVar.release();
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.dispose();
            this.c = null;
        }
        Comment comment = this.g;
        if (comment != null) {
            comment.animate().setListener(null).cancel();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        qpb qpbVar = this.b;
        if (qpbVar != null) {
            qpbVar.resume();
        }
    }

    @Override // xsna.rr6
    public qpb getPresenter() {
        return this.b;
    }

    @Override // xsna.rr6
    public void setPresenter(qpb qpbVar) {
        this.b = qpbVar;
        io.reactivex.rxjava3.internal.operators.observable.e1 P = io.reactivex.rxjava3.core.q.P(1000L, 3000L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = P.r0(asu0Var.c()).a0(asu0Var.d());
        a aVar = new a();
        a0.subscribe(aVar);
        this.c = aVar;
    }

    /* compiled from: ChatInlineView.java */
    public class a extends io.reactivex.rxjava3.observers.a<Long> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            LiveEventModel pop;
            yrb yrbVar = yrb.this;
            FrameLayout frameLayout = yrbVar.e;
            LinkedList<LiveEventModel> linkedList = yrbVar.d;
            Comment comment = yrbVar.g;
            if (comment != null) {
                comment.animate().translationY(-100.0f).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new zrb(yrbVar, comment)).setDuration(250L).setInterpolator(new DecelerateInterpolator()).start();
                yrbVar.g = null;
            }
            if (linkedList.size() > 0 && (pop = linkedList.pop()) != null) {
                Comment comment2 = new Comment(yrbVar.getContext(), null);
                yrbVar.g = comment2;
                comment2.setModel(pop);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = iah0.a(4.0f);
                layoutParams.rightMargin = iah0.a(130.0f);
                yrbVar.g.setLayoutParams(layoutParams);
                yrbVar.addView(yrbVar.g);
                yrbVar.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                yrbVar.g.setTranslationY(100.0f);
                yrbVar.g.animate().alpha(1.0f).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setStartDelay(250L).setDuration(250L).setInterpolator(new DecelerateInterpolator()).start();
            }
            if (yrbVar.g != null) {
                if (yrbVar.f != 0.35f) {
                    yrbVar.f = 0.35f;
                    frameLayout.animate().alpha(0.35f).setDuration(500L).start();
                    return;
                }
                return;
            }
            if (yrbVar.f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                yrbVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                frameLayout.animate().alpha(yrbVar.f).setStartDelay(5000L).setDuration(500L).start();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
        }
    }

    @Override // xsna.c30
    public final void L() {
    }

    @Override // xsna.c30
    public final void O() {
    }

    @Override // xsna.c30
    public final void P() {
    }

    @Override // xsna.rpb
    public final void V1() {
    }

    @Override // xsna.rpb
    public final void c4() {
    }

    @Override // xsna.c30
    public final void d0() {
    }

    @Override // xsna.rpb
    public final void d1() {
    }

    @Override // xsna.rpb
    public final void f2() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rpb
    public final void l3() {
    }

    @Override // xsna.c30
    public final void s() {
    }

    @Override // xsna.rpb
    public final void update() {
    }

    @Override // xsna.rpb
    public final void N1(LiveEventModel liveEventModel) {
    }

    @Override // xsna.c30
    public void setActionButtonClickCount(int i) {
    }

    @Override // xsna.rpb, xsna.c30
    public void setActionLinksPresenter(b30 b30Var) {
    }

    @Override // xsna.rpb
    public void setAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
    }

    @Override // xsna.rpb
    public final void b1(boolean z, boolean z2) {
    }
}
