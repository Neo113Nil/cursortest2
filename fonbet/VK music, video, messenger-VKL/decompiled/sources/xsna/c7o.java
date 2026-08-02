package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.rlottie.RLottieDrawable;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: DoubleTapInitAction.kt */
/* loaded from: classes4.dex */
public final class c7o extends gux {
    public final FeedRecyclerView a;
    public final g7o b;

    public c7o(FeedRecyclerView feedRecyclerView, g7o g7oVar) {
        this.a = feedRecyclerView;
        this.b = g7oVar;
    }

    @Override // xsna.gux
    public final void a() {
        UsableRecyclerView.t tVar = new UsableRecyclerView.t() { // from class: xsna.z6o
            @Override // me.grishka.appkit.views.UsableRecyclerView.t
            public final void a(int i, int i2, int i3, int i4) {
                c7o.this.b.l();
            }
        };
        FeedRecyclerView feedRecyclerView = this.a;
        feedRecyclerView.d.a.add(tVar);
        feedRecyclerView.e.b.add(new UsableRecyclerView.k() { // from class: xsna.a7o
            @Override // me.grishka.appkit.views.UsableRecyclerView.k
            public final boolean c(Drawable drawable) {
                return drawable == c7o.this.b.g;
            }
        });
        feedRecyclerView.f.a.add(new UsableRecyclerView.i() { // from class: xsna.b7o
            @Override // me.grishka.appkit.views.UsableRecyclerView.i
            public final void detach() {
                g7o g7oVar = c7o.this.b;
                RLottieDrawable rLottieDrawable = g7oVar.g;
                if (rLottieDrawable != null) {
                    rLottieDrawable.k();
                }
                ValueAnimator valueAnimator = g7oVar.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        });
    }
}
