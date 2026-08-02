package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkFeedLinkPrimaryCell.kt */
/* loaded from: classes18.dex */
public final class quu0 extends ConstraintLayout {
    public a A;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public com.vk.core.view.components.picture.c x;
    public CharSequence y;
    public CharSequence z;

    /* compiled from: VkFeedLinkPrimaryCell.kt */
    public interface a {

        /* compiled from: VkFeedLinkPrimaryCell.kt */
        /* renamed from: xsna.quu0$a$a, reason: collision with other inner class name */
        public static final class C3574a implements a {
            public static final C3574a a = new C3574a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3574a);
            }

            public final int hashCode() {
                return 268429286;
            }

            public final String toString() {
                return "Chevron";
            }
        }
    }

    public quu0(Context context) {
        super(context, null, 0);
        x9l0 x9l0Var = new x9l0(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, x9l0Var);
        this.u = msy.a(lazyThreadSafetyMode, new lqs0(this, 9));
        this.v = msy.a(lazyThreadSafetyMode, new x2j0(this, 22));
        this.w = msy.a(lazyThreadSafetyMode, new h6m0(this, 23));
        View.inflate(context, R.layout.feed_link_primary_cell, this);
        setPaddingRelative(e3m.a(R.dimen.vk_ui_base_padding_horizontal, context), e3m.a(R.dimen.vk_ui_spacing_size_xs, context), e3m.a(R.dimen.vk_ui_base_padding_horizontal, context), e3m.a(R.dimen.vk_ui_spacing_size_xs, context));
        getLeftPicture().setCornerRadius(VkPicture.CornerRadius.Large);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkPicture getLeftPicture() {
        return (VkPicture) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final FrameLayout getRightContainer() {
        return (FrameLayout) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getSubtitleText() {
        return (VkText) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getTitleText() {
        return (VkText) this.u.getValue();
    }

    public final com.vk.core.view.components.picture.c getPictureContent() {
        return this.x;
    }

    @Override // android.view.View
    public final a getRight() {
        return this.A;
    }

    public final CharSequence getSubtitle() {
        return this.z;
    }

    public final CharSequence getTitle() {
        return this.y;
    }

    public final void setPictureContent(com.vk.core.view.components.picture.c cVar) {
        this.x = cVar;
        getLeftPicture().setContent(cVar);
    }

    public final void setRight(a aVar) {
        this.A = aVar;
        if (aVar == null) {
            bwt0.p0(getRightContainer(), false);
            return;
        }
        if (!(aVar instanceof a.C3574a)) {
            throw new NoWhenBranchMatchedException();
        }
        VkImageSimple vkImageSimple = new VkImageSimple(getContext(), null, 6, 0);
        vkImageSimple.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(16), cn70.b(24)));
        vkImageSimple.setImageDrawable(krv0.f(R.drawable.vk_icon_chevron_compact_right_24, R.attr.vk_ui_icon_tertiary, vkImageSimple.getContext()));
        getRightContainer().addView(vkImageSimple);
        bwt0.p0(vkImageSimple, true);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.z = charSequence;
        bwt0.p0(getSubtitleText(), this.z != null);
        getSubtitleText().setText(this.z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.y = charSequence;
        bwt0.p0(getTitleText(), this.y != null);
        getTitleText().setText(this.y);
    }
}
