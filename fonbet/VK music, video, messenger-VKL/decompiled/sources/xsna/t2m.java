package xsna;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdDescriptionView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import xsna.uij0;

/* compiled from: DescriptionViewHelperV2.kt */
/* loaded from: classes4.dex */
public final class t2m implements f8q {
    public final ViewGroup b;
    public final SquareExcerptTextView c;
    public final s1q d;
    public final SpannableStringBuilder e;
    public final x7q f;
    public final r8q g;
    public NewsEntry h;
    public PostInteract i;
    public String j;
    public izs<? super View, s3q0> k;
    public gzs<s3q0> l;

    public t2m(MyTargetAdDescriptionView myTargetAdDescriptionView) {
        ViewGroup rootContainer = myTargetAdDescriptionView.getRootContainer();
        this.b = rootContainer;
        ViewGroup textContainer = myTargetAdDescriptionView.getTextContainer();
        SquareExcerptTextView descriptionView = myTargetAdDescriptionView.getDescriptionView();
        this.c = descriptionView;
        this.d = new s1q(3, 0, 52);
        o7q o7qVar = new o7q();
        r8q r8qVar = new r8q(textContainer, descriptionView, this, o7qVar);
        this.g = r8qVar;
        rootContainer.getContext();
        descriptionView.setAvailableShowMoreExpandSpanMeasureStrategy(true);
        descriptionView.setExpandAnimationController(o7qVar);
        x7q x7qVar = new x7q();
        x7qVar.g(false);
        this.f = x7qVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xwk.d().a().p(textContainer.getContext(), uij0.c.a));
        this.e = spannableStringBuilder;
        spannableStringBuilder.setSpan(x7qVar, 0, spannableStringBuilder.length(), 33);
        r8qVar.x = R.attr.vk_ui_text_subhead;
        x7qVar.j();
    }

    @Override // xsna.f8q
    public final void K0(gzs<s3q0> gzsVar) {
        this.l = gzsVar;
    }

    public final void a(u1c0 u1c0Var, MyTargetNativeAdEntry myTargetNativeAdEntry, PostInteract postInteract, String str) {
        this.h = myTargetNativeAdEntry;
        this.i = postInteract;
        this.j = str;
        r8q.c(this.g, u1c0Var, null, true, this.f, false, 18);
    }

    public final void b() {
        int i;
        boolean z = this.g.o;
        SquareExcerptTextView squareExcerptTextView = this.c;
        squareExcerptTextView.setShouldTruncate(z);
        s1q s1qVar = this.d;
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
        squareExcerptTextView.setShowMoreText(this.e);
    }

    public final void c(String str) {
        b();
        ViewGroup viewGroup = this.b;
        if (str == null || str.length() == 0) {
            bwt0.p0(viewGroup, false);
            return;
        }
        ej90 ej90Var = new ej90(str, str, str);
        this.g.a(this.h, ej90Var, this.i, this.j);
        bwt0.p0(viewGroup, true);
    }

    @Override // xsna.f8q
    public final void h() {
        SquareExcerptTextView squareExcerptTextView = this.c;
        squareExcerptTextView.setShouldTruncate(false);
        squareExcerptTextView.setEllipsize(null);
        squareExcerptTextView.setMaxLines(Integer.MAX_VALUE);
        squareExcerptTextView.setMaxExcerptLines(Integer.MAX_VALUE);
        squareExcerptTextView.sendAccessibilityEvent(8);
    }

    @Override // xsna.f8q
    public final gzs<s3q0> r3() {
        return this.l;
    }

    @Override // xsna.f8q
    public final void x2(boolean z) {
        izs<? super View, s3q0> izsVar = this.k;
        if (izsVar != null) {
            izsVar.invoke(this.b);
        }
    }

    @Override // xsna.f8q
    public final void P2() {
    }

    @Override // xsna.f8q
    public final void Z0(boolean z) {
    }
}
