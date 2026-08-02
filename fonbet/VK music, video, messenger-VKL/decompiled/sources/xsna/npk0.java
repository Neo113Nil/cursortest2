package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.jyk0;

/* compiled from: StarsFeedbackV2Holder.kt */
/* loaded from: classes4.dex */
public final class npk0 extends qi6<NewsEntry> implements DynamicRatingView.a, View.OnClickListener, w8i {
    public final TextView C;
    public final DynamicRatingView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final Object H;
    public final io.reactivex.rxjava3.disposables.b I;
    public final Object J;
    public final Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npk0(ViewGroup viewGroup) {
        super(R.layout.post_feedback_stars_v3, viewGroup);
        viewGroup.getContext();
        this.C = (TextView) this.itemView.findViewById(R.id.tv_question);
        DynamicRatingView dynamicRatingView = (DynamicRatingView) this.itemView.findViewById(R.id.rating);
        this.D = dynamicRatingView;
        this.E = (TextView) this.itemView.findViewById(R.id.interesting);
        this.F = (TextView) this.itemView.findViewById(R.id.not_interesting);
        View findViewById = this.itemView.findViewById(R.id.hide_button);
        this.G = findViewById;
        pwh0 pwh0Var = new pwh0(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H = msy.a(lazyThreadSafetyMode, pwh0Var);
        this.I = new io.reactivex.rxjava3.disposables.b();
        this.J = msy.a(lazyThreadSafetyMode, new ia90(9));
        this.K = msy.a(lazyThreadSafetyMode, new nh(29));
        dynamicRatingView.setOnRatingChangedListener(this);
        dynamicRatingView.setLevelPaintingProvider(new a8h());
        this.itemView.addOnAttachStateChangeListener(new a());
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Feedback feedback = newsEntry.g;
        if (feedback != null && (feedback instanceof StarsFeedback)) {
            StarsFeedback starsFeedback = (StarsFeedback) feedback;
            String[] strArr = starsFeedback.g;
            int i = starsFeedback.f;
            DynamicRatingView dynamicRatingView = this.D;
            dynamicRatingView.setRatingCount(i);
            dynamicRatingView.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            jyk0.a aVar = dynamicRatingView.b;
            dynamicRatingView.k = aVar != null ? aVar.a(dynamicRatingView) : 0;
            dynamicRatingView.invalidate();
            dynamicRatingView.requestLayout();
            this.C.setText(feedback.b);
            xo9.A(this.F, strArr != null ? (String) rl3.O(strArr) : null);
            xo9.A(this.E, strArr != null ? (String) rl3.S(1, strArr) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void R6(float f) {
        NewsEntry q6 = q6();
        if (q6 == null) {
            return;
        }
        Feedback feedback = q6.g;
        if (feedback instanceof StarsFeedback) {
            StarsFeedback starsFeedback = (StarsFeedback) feedback;
            int i = (int) f;
            if (!(q6 instanceof Post)) {
                W6(q6, starsFeedback, i);
                return;
            }
            Post post = (Post) q6;
            String str = starsFeedback.d;
            if (str != null && str.length() != 0) {
                W6(post, starsFeedback, i);
            } else {
                u1c0 J0 = J0();
                rsg0.y0(yfb.x(cz60.h((cz60) this.K.getValue(), post.m, Integer.valueOf(post.n), post.L.b, Integer.valueOf(J0 != null ? J0.k : 0), null, Integer.valueOf(i), Integer.valueOf(starsFeedback.f), null, null, 400)), null, null, 3).subscribe(new m3y(new kpk0(0, this, starsFeedback), 19), new f2u(new lh(24, this, starsFeedback), 19));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void T6(NewsEntry newsEntry) {
        String Db;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        NewsEntry t6 = t6();
        if (t6 instanceof PromoPost) {
            ((PromoPost) t6).getClass();
            Db = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        } else {
            Db = newsEntry.Db();
        }
        String str = Db;
        cz60 cz60Var = (cz60) this.K.getValue();
        String str2 = newsEntry.Cb().b;
        Feedback feedback = newsEntry.g;
        itg0.m(rsg0.y0(yfb.x(cz60.b(cz60Var, null, null, str2, Integer.valueOf(i), str, feedback != null ? feedback.d : null, 3)), null, null, 3));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void U6(StarsFeedback starsFeedback) {
        starsFeedback.e = true;
        ((p870) this.H.getValue()).e(139, q6());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void W6(NewsEntry newsEntry, StarsFeedback starsFeedback, int i) {
        String Db;
        u1c0 J0 = J0();
        int i2 = J0 != null ? J0.k : 0;
        NewsEntry t6 = t6();
        if (t6 instanceof PromoPost) {
            ((PromoPost) t6).getClass();
            Db = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        } else {
            Db = newsEntry.Db();
        }
        rsg0.y0(yfb.x(cz60.h((cz60) this.K.getValue(), null, null, newsEntry.Cb().b, Integer.valueOf(i2), null, Integer.valueOf(i), null, Db, starsFeedback.d, 83)), null, null, 3).subscribe(new dh40(new ri0(27, this, starsFeedback), 16), new s520(new ufg0(4, this, starsFeedback), 20));
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewsEntry q6;
        if (jjc.b() || !epx.f(view, this.G) || (q6 = q6()) == null) {
            return;
        }
        if (q6 instanceof Post) {
            Post post = (Post) q6;
            Feedback feedback = post.g;
            String str = feedback != null ? feedback.d : null;
            if (str == null || str.length() == 0) {
                u1c0 J0 = J0();
                itg0.m(rsg0.y0(yfb.x(cz60.b((cz60) this.K.getValue(), post.m, Integer.valueOf(post.n), post.L.b, Integer.valueOf(J0 != null ? J0.k : 0), null, null, 48)), null, null, 3));
            } else {
                T6(post);
            }
        } else if (q6 instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) q6;
            u1c0 J02 = J0();
            itg0.m(rsg0.y0(yfb.x(((y11) this.J.getValue()).c(Integer.valueOf(J02 != null ? J02.k : 0), shitAttachment.v)), null, null, 3));
        } else {
            T6(q6);
        }
        Feedback feedback2 = q6.g;
        if (feedback2 != null) {
            feedback2.e = true;
        }
        ((p870) this.H.getValue()).e(128, q6());
    }

    @Override // com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView.a
    public final void v1(final float f, boolean z) {
        if (z || (f < 1.0f)) {
            return;
        }
        jjc.b();
        this.D.setLocked(true);
        io.reactivex.rxjava3.disposables.b bVar = this.I;
        bVar.e();
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.z(io.reactivex.rxjava3.core.q.B0(650L, TimeUnit.MILLISECONDS), new x150(new lpk0(this, f), 12)), io.reactivex.rxjava3.internal.functions.a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.mpk0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                float f2 = f;
                npk0 npk0Var = npk0.this;
                npk0Var.R6(f2);
                npk0Var.D.setLocked(false);
            }
        });
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        bVar.b(itg0.m(c0Var.r0(asu0.i()).a0(asu0Var.d())));
    }

    /* compiled from: StarsFeedbackV2Holder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            npk0.this.I.e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
