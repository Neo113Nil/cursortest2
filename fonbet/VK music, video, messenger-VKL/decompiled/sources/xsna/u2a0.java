package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: PhoneBookStoriesPhotoItemHolder.kt */
/* loaded from: classes4.dex */
public final class u2a0 extends vif0<aex.a.C2538a> implements View.OnAttachStateChangeListener, ydx, gex.b {
    public final gex.a n;
    public final pdx o;
    public final InterestingStoriesBlockEventDispatcher p;
    public final Object q;
    public final Object r;
    public aex.a.C2538a s;
    public final r2a0 t;
    public final Object u;
    public final eiq v;

    public u2a0(ViewGroup viewGroup, gex.a aVar, zex zexVar, InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher) {
        super(new v2a0(viewGroup.getContext()), viewGroup);
        this.n = aVar;
        this.o = zexVar;
        this.p = interestingStoriesBlockEventDispatcher;
        k7z k7zVar = new k7z(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, k7zVar);
        Lazy a = msy.a(lazyThreadSafetyMode, new gd70(this, 4));
        this.r = a;
        r2a0 r2a0Var = new r2a0(zexVar);
        this.t = r2a0Var;
        this.u = msy.a(lazyThreadSafetyMode, new v100(this, 15));
        this.v = new eiq((StoryProgressView) a.getValue());
        this.itemView.setClipToOutline(true);
        this.itemView.getContext();
        this.itemView.setOutlineProvider(new t0w0(6, cn70.c(12), false, false));
        jjc.g(this.itemView, new rxz(this, 11));
        Context context = this.itemView.getContext();
        View view = this.itemView;
        r2a0Var.b(context, view instanceof v2a0 ? (v2a0) view : null, new z260(this, 7));
        View view2 = this.itemView;
        tps0.a aVar2 = aVar.a;
        bwt0.m0(aVar2.a, aVar2.b, view2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ydx
    public final void F4() {
        boolean f = epx.f(this.s, this.p.g());
        ?? r1 = this.u;
        eiq eiqVar = this.v;
        if (!f) {
            eiqVar.a(new w100(this, 19));
            ((ValueAnimator) r1.getValue()).cancel();
            return;
        }
        eiqVar.a(new w100(this, 19));
        ((ValueAnimator) r1.getValue()).cancel();
        eiqVar.b(new d14(21));
        ((ValueAnimator) r1.getValue()).start();
        this.o.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(aex.a.C2538a c2538a) {
        aex.a.C2538a c2538a2 = c2538a;
        this.s = c2538a2;
        ((FrescoImageView) this.q.getValue()).setRemoteImage((List<? extends fxj0>) c2538a2.e);
        View view = this.itemView;
        StoryEntry storyEntry = c2538a2.d;
        StoryOwner storyOwner = storyEntry.l0;
        view.setContentDescription(h6(R.string.accessibility_discover_author, storyOwner != null ? storyOwner.Db() : null));
        View view2 = this.itemView;
        v2a0 v2a0Var = view2 instanceof v2a0 ? (v2a0) view2 : null;
        StoryOwner storyOwner2 = storyEntry.l0;
        String Db = storyOwner2 != null ? storyOwner2.Db() : null;
        this.t.getClass();
        if (v2a0Var != null) {
            bwt0.p0(v2a0Var.getUserNameView(), true ^ (Db == null || Db.length() == 0));
            v2a0Var.getUserNameView().setText(Db);
        }
        Context context = this.itemView.getContext();
        View view3 = this.itemView;
        r2a0.a(context, view3 instanceof v2a0 ? (v2a0) view3 : null, storyEntry);
    }

    @Override // xsna.gex.b
    public final void n5(aex aexVar) {
        if (aexVar instanceof aex.a.C2538a) {
            V5(aexVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.itemView.addOnAttachStateChangeListener(this);
        this.p.add(this);
        F4();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.itemView.removeOnAttachStateChangeListener(this);
        this.p.remove(this);
        ((ValueAnimator) this.u.getValue()).cancel();
    }

    @Override // xsna.ydx
    public final void H1() {
    }

    @Override // xsna.ydx
    public final void V2() {
    }
}
