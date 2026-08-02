package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.design.view.feed.FeedProductPinView;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.n0o0;

/* compiled from: ProductsOverlayPinHolder.kt */
/* loaded from: classes18.dex */
public final class ctd0 implements dtd0 {
    public final q530 a;
    public final FeedProductPinView b;
    public Tag c;
    public boolean d;
    public gzs<s3q0> e;
    public gzs<s3q0> f;

    public ctd0(l7s l7sVar, q530 q530Var) {
        this.a = q530Var;
        FeedProductPinView feedProductPinView = new FeedProductPinView(l7sVar);
        this.b = feedProductPinView;
        FeedProductPinView.c(feedProductPinView, null, null, false, null, null, null, 991);
        feedProductPinView.setOnPinClickHandler(new ye80(this, 9));
        feedProductPinView.setOnPinCloseHandler(new akd0(this, 1));
        feedProductPinView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // xsna.dtd0
    public final void a(kg kgVar) {
        this.f = kgVar;
    }

    @Override // xsna.dtd0
    public final void c() {
        Tag tag = this.c;
        if ((tag == null || tag.l) && tag != null) {
            dtd0.b(this, tag, this.d, 4);
        }
    }

    @Override // xsna.dtd0
    public final void d(Tag tag, boolean z, String str) {
        n0o0 n0o0Var = tag.f;
        n0o0.a aVar = n0o0Var.e;
        this.c = tag;
        this.d = z;
        c530 i = i();
        String str2 = null;
        q530 q530Var = this.a;
        ModerationRestriction a = (q530Var == null || i == null) ? null : q530Var.a(i);
        if (a != null && a.h()) {
            FeedProductPinView feedProductPinView = this.b;
            FeedProductPinView.c(feedProductPinView, feedProductPinView.getContext().getString(R.string.product_photo_pin_text_for_adults), null, z, null, null, str, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            return;
        }
        String str3 = n0o0Var.c;
        String str4 = aVar != null ? aVar.a.e : null;
        if (str4 == null || str4.length() == 0) {
            if (aVar != null) {
                str2 = aVar.a.b;
            }
        } else if (aVar != null) {
            str2 = aVar.a.e;
        }
        FeedProductPinView.c(this.b, str3, str2, z, null, null, str, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
    }

    @Override // xsna.dtd0
    public final void e() {
        this.b.setTag(R.id.product_pin_test_tag, new e7b0());
    }

    @Override // xsna.dtd0
    public final void f(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    @Override // xsna.dtd0
    public final void g(ViewGroup viewGroup) {
        viewGroup.removeView(this.b);
    }

    @Override // xsna.dtd0
    public final void h(float f, float f2, ViewGroup viewGroup, RectF rectF) {
        float f3 = 1;
        RectF rectF2 = new RectF(f, f2, f + f3, f3 + f2);
        Rect rect = new Rect();
        rectF2.roundOut(rect);
        Rect rect2 = new Rect();
        rectF.roundOut(rect2);
        FeedProductPinView.c(this.b, null, null, false, rect, rect2, null, 831);
        viewGroup.addView(this.b);
    }

    public final c530 i() {
        Tag tag = this.c;
        if (tag == null) {
            return null;
        }
        return new c530(tag.l, tag.k, false, null, new d530(tag.d, Long.valueOf(tag.e), null, null));
    }
}
