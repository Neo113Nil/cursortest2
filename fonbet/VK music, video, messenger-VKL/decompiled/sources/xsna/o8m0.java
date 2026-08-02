package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.attachpicker.widget.TopShadowLinearLayout;
import com.vk.dto.polls.Poll;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.dw20;

/* compiled from: StoryPollDelegate.kt */
/* loaded from: classes16.dex */
public final class o8m0 {
    public final u76 a;
    public final StickersDrawingViewGroup b;
    public final b96 c;
    public final WeakReference<Activity> d;
    public WeakReference<hpb0> e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public o8m0(Activity activity, StickersDrawingViewGroup stickersDrawingViewGroup, u76 u76Var, b96 b96Var) {
        this.a = u76Var;
        this.b = stickersDrawingViewGroup;
        this.c = b96Var;
        this.d = new WeakReference<>(activity);
        nid0 nid0Var = new nid0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, nid0Var);
        this.g = msy.a(lazyThreadSafetyMode, new x1e0(this, 12));
        this.h = msy.a(lazyThreadSafetyMode, new jcf0(this, 9));
        this.i = msy.a(lazyThreadSafetyMode, new yo80(7));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(final r8m0 r8m0Var) {
        Activity activity;
        q8m0 q8m0Var;
        Poll poll;
        q8m0 q8m0Var2;
        Poll poll2;
        q8m0 q8m0Var3;
        if (r8m0Var == null || (q8m0Var3 = r8m0Var.h) == null || !(q8m0Var3.a.isExpired() || q8m0Var3.b)) {
            ?? r2 = this.g;
            if ((r8m0Var == null || (q8m0Var2 = r8m0Var.h) == null || (poll2 = q8m0Var2.a) == null || epx.f(poll2.c, ((gpj0) r2.getValue()).getUid())) && (activity = this.d.get()) != null) {
                this.c.d();
                this.b.invalidate();
                Drawable a = m33.a(R.drawable.vk_icon_done_outline_28, e43.a);
                a.setTint(e43.a.getColor(R.color.vk_steel_gray_300));
                l7s u = bwt0.u(activity);
                final hpb0 hpb0Var = new hpb0(((gpj0) r2.getValue()).getUid(), "STORY", (r8m0Var == null || (q8m0Var = r8m0Var.h) == null || (poll = q8m0Var.a) == null) ? null : new PollAttachment(poll), 0, TimeUnit.MINUTES.toSeconds(5L) + TimeUnit.DAYS.toSeconds(1L), null, (p8m0) this.i.getValue(), this.a.b7(), 72);
                View f = hpb0Var.f(LayoutInflater.from(u), null);
                bwt0.p0((ViewGroup) hpb0Var.J.getValue(), false);
                ((TopShadowLinearLayout) hpb0Var.v.getValue()).setShadowEnabled(false);
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                dw20 I0 = ((dw20.b) new dw20.b(u, null).u0(R.style.StoryFullscreenActivityThemeDark).m(R.attr.vk_ui_background_content).F(a, null)).q(false).Z(new DialogInterface.OnDismissListener() { // from class: xsna.n8m0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        hpb0.this.l.dispose();
                        r8m0 r8m0Var2 = r8m0Var;
                        if (r8m0Var2 != null) {
                            r8m0Var2.setInEditMode(false);
                        }
                        o8m0 o8m0Var = this;
                        o8m0Var.a.e3(r8m0Var2 != null || ref$BooleanRef.element);
                        o8m0Var.b.invalidate();
                    }
                }).b0(new ap30(hpb0Var, 18)).f0(new kb40(hpb0Var, 29)).v0(R.string.poll_create).D0(f, false).c(new ts90(0.85f, 2)).R0(true).I0(null);
                hpb0Var.O = new zyl0(a, 2);
                hpb0Var.M = new com.vk.movika.sdk.base.flow.binding.l(21, this, activity);
                hpb0Var.N = new vwl(ref$BooleanRef, this, r8m0Var, I0);
                this.e = new WeakReference<>(hpb0Var);
            }
        }
    }
}
