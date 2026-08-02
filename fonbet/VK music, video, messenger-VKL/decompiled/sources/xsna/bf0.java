package xsna;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.PostInteract;
import kotlin.LazyThreadSafetyMode;
import xsna.uij0;

/* compiled from: AdDescriptionHolder.kt */
/* loaded from: classes4.dex */
public final class bf0 extends wf0 implements View.OnClickListener, f8q {
    public final LinearLayout E;
    public final SquareExcerptTextView F;
    public final r8q G;
    public final SpannableStringBuilder H;
    public final x7q I;
    public gzs<s3q0> J;
    public final s1q K;
    public final Object L;

    public bf0(ViewGroup viewGroup) {
        super(R.layout.news_shitty_description, viewGroup);
        this.E = (LinearLayout) this.itemView.findViewById(R.id.description_container);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.text_container);
        SquareExcerptTextView squareExcerptTextView = (SquareExcerptTextView) this.itemView.findViewById(R.id.description);
        this.F = squareExcerptTextView;
        o7q o7qVar = new o7q();
        r8q r8qVar = new r8q(viewGroup2, squareExcerptTextView, this, o7qVar);
        this.G = r8qVar;
        this.K = new s1q(3, 0, 52);
        this.L = msy.a(LazyThreadSafetyMode.NONE, new af0(0));
        getContext();
        squareExcerptTextView.setAvailableShowMoreExpandSpanMeasureStrategy(true);
        squareExcerptTextView.setExpandAnimationController(o7qVar);
        x7q x7qVar = new x7q();
        x7qVar.g(false);
        this.I = x7qVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xwk.d().a().p(this.itemView.getContext(), uij0.c.a));
        this.H = spannableStringBuilder;
        spannableStringBuilder.setSpan(x7qVar, 0, spannableStringBuilder.length(), 33);
        r8qVar.x = R.attr.vk_ui_text_subhead;
        x7qVar.j();
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        int i;
        ShitAttachment shitAttachment2 = shitAttachment;
        r8q r8qVar = this.G;
        boolean z = r8qVar.o;
        SquareExcerptTextView squareExcerptTextView = this.F;
        squareExcerptTextView.setShouldTruncate(z);
        s1q s1qVar = this.K;
        if (z) {
            i = s1qVar.a;
            int i2 = s1qVar.b + i;
            if (i2 >= i) {
                i = i2;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        squareExcerptTextView.setMaxLines(i);
        squareExcerptTextView.setMaxExcerptLines(z ? s1qVar.a : Integer.MAX_VALUE);
        squareExcerptTextView.setMinTrimmedLines(s1qVar.b);
        squareExcerptTextView.setEllipsize(z ? TextUtils.TruncateAt.END : null);
        squareExcerptTextView.setShowMoreText(this.H);
        bwt0.p0(this.E, !drm0.N(shitAttachment2.A));
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        cf0 cf0Var = obj instanceof cf0 ? (cf0) obj : null;
        if (cf0Var == null) {
            return;
        }
        if (drm0.N(cf0Var.h)) {
            bwt0.p0(squareExcerptTextView, false);
        } else {
            r8qVar.a(q6(), cf0Var.i, this.w, this.u);
            bwt0.p0(squareExcerptTextView, true);
        }
    }

    @Override // xsna.f8q
    public final void K0(gzs<s3q0> gzsVar) {
        this.J = gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T extends com.vk.feed.core.models.news.NewsEntry, com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T extends com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [xsna.bf0, xsna.qi6] */
    @Override // xsna.f8q
    public final void P2() {
        u1c0 j6 = j6();
        NewsEntry newsEntry = j6 != null ? j6.a : null;
        ?? r1 = newsEntry != null ? newsEntry : 0;
        if (r1 == 0) {
            r1 = this.p;
        }
        if (r1 != 0) {
            this.p = r1;
            E6(r1);
        }
        ShitAttachment shitAttachment = (ShitAttachment) q6();
        if (shitAttachment != null) {
            p4r p4rVar = (p4r) this.L.getValue();
            UserId o = k9q0.o(shitAttachment);
            Integer valueOf = Integer.valueOf(di60.n(shitAttachment));
            String str = shitAttachment.Q.b;
            u1c0 J0 = J0();
            Integer valueOf2 = Integer.valueOf(J0 != null ? J0.k : 0);
            p4rVar.getClass();
            p4r.b(o, valueOf, valueOf2, str);
        }
    }

    @Override // xsna.f8q
    public final void Z0(boolean z) {
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.expand);
        }
        ShitAttachment q6 = q6();
        if (q6 != null) {
            hd60.a().m1(q6);
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        ShitAttachment shitAttachment;
        Integer num;
        ol60 ol60Var = u1c0Var.h;
        cf0 cf0Var = ol60Var instanceof cf0 ? (cf0) ol60Var : null;
        ClickArea clickArea = (cf0Var == null || (shitAttachment = cf0Var.j) == null || (num = shitAttachment.h0) == null) ? null : new ClickArea(num.intValue());
        boolean z = (clickArea == null || clickArea.a(AdClickContext.DESCRIPTION)) ? false : true;
        this.G.b(u1c0Var, z ? new s1q(0, 0, 55) : null, true, this.I, z, true, !z);
        super.a6(u1c0Var);
    }

    @Override // xsna.f8q
    public final void h() {
        SquareExcerptTextView squareExcerptTextView = this.F;
        squareExcerptTextView.setShouldTruncate(false);
        squareExcerptTextView.setEllipsize(null);
        squareExcerptTextView.setMaxLines(Integer.MAX_VALUE);
        squareExcerptTextView.setMaxExcerptLines(Integer.MAX_VALUE);
        squareExcerptTextView.sendAccessibilityEvent(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.G.onClick(view);
    }

    @Override // xsna.f8q
    public final gzs<s3q0> r3() {
        return this.J;
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        ShitAttachment q6 = q6();
        if (q6 == null || !q6.O) {
            return;
        }
        R6(AdClickContext.TEXT);
    }

    @Override // xsna.f8q
    public final void x2(boolean z) {
    }
}
