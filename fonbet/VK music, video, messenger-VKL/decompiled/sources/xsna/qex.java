package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesBlockEventDispatcher;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.aex;
import xsna.gex;
import xsna.tps0;

/* compiled from: InterestingStoriesBlockPhotoItemHolder.kt */
/* loaded from: classes4.dex */
public final class qex extends vif0<aex.a.C2538a> implements View.OnAttachStateChangeListener, ydx, gex.b {
    public static final /* synthetic */ int x = 0;
    public final gex.a n;
    public final pdx o;
    public final InterestingStoriesBlockEventDispatcher p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public aex.a.C2538a u;
    public final Object v;
    public final eiq w;

    public qex(ViewGroup viewGroup, gex.a aVar, zex zexVar, InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher) {
        super(new rex(viewGroup.getContext()), viewGroup);
        this.n = aVar;
        this.o = zexVar;
        this.p = interestingStoriesBlockEventDispatcher;
        this.itemView.getContext();
        Cnew cnew = new Cnew(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, cnew);
        Lazy a = msy.a(lazyThreadSafetyMode, new b1h(this, 24));
        this.r = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new ncg(this, 28));
        this.s = a2;
        this.t = msy.a(lazyThreadSafetyMode, new r5i(this, 23));
        this.v = msy.a(lazyThreadSafetyMode, new ocg(this, 28));
        this.w = new eiq((StoryProgressView) a2.getValue());
        this.itemView.addOnAttachStateChangeListener(this);
        this.itemView.setClipToOutline(true);
        this.itemView.setOutlineProvider(new t0w0(6, cn70.c(12), false, false));
        jjc.g(this.itemView, new fgh(this, 22));
        jjc.g((ImageView) a.getValue(), new l2i(this, 20));
        View view = this.itemView;
        tps0.a aVar2 = aVar.a;
        bwt0.m0(aVar2.a, aVar2.b, view);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ydx
    public final void F4() {
        boolean f = epx.f(this.u, this.p.g());
        ?? r1 = this.v;
        eiq eiqVar = this.w;
        if (!f) {
            eiqVar.a(new z0h(this, 23));
            ((ValueAnimator) r1.getValue()).cancel();
            return;
        }
        eiqVar.a(new z0h(this, 23));
        ((ValueAnimator) r1.getValue()).cancel();
        eiqVar.b(new x84(15));
        ((ValueAnimator) r1.getValue()).start();
        this.o.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(aex.a.C2538a c2538a) {
        aex.a.C2538a c2538a2 = c2538a;
        this.u = c2538a2;
        ((FrescoImageView) this.q.getValue()).setRemoteImage((List<? extends fxj0>) c2538a2.e);
        TextView textView = (TextView) this.t.getValue();
        StoryEntry storyEntry = c2538a2.d;
        StoryOwner storyOwner = storyEntry.l0;
        textView.setText(storyOwner != null ? storyOwner.Db() : null);
        dex.a((ImageView) this.r.getValue(), this.o.c(storyEntry));
        View view = this.itemView;
        StoryOwner storyOwner2 = storyEntry.l0;
        view.setContentDescription(h6(R.string.accessibility_discover_author, storyOwner2 != null ? storyOwner2.Db() : null));
    }

    @Override // xsna.gex.b
    public final void n5(aex aexVar) {
        if (aexVar instanceof aex.a.C2538a) {
            V5(aexVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.p.add(this);
        F4();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.p.remove(this);
        ((ValueAnimator) this.v.getValue()).cancel();
    }

    @Override // xsna.ydx
    public final void H1() {
    }

    @Override // xsna.ydx
    public final void V2() {
    }
}
