package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutPostVideoTeaser.kt */
/* loaded from: classes17.dex */
public final class u1o extends FrameLayout {
    public final Object b;
    public final Object c;
    public final Object d;
    public a e;
    public CharSequence f;
    public String g;
    public gzs<s3q0> h;

    /* compiled from: DonutPostVideoTeaser.kt */
    public static final class a {
        public final float a;
        public final w5h b;

        public a(float f, w5h w5hVar) {
            this.a = f;
            this.b = w5hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CoverImage(ratio=" + this.a + ", url=" + this.b + ')';
        }
    }

    public u1o(Context context) {
        super(context, null, 0);
        trf trfVar = new trf(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, trfVar);
        this.c = msy.a(lazyThreadSafetyMode, new pce(this, 21));
        this.d = msy.a(lazyThreadSafetyMode, new dof(this, 17));
        View.inflate(context, R.layout.pds_donut_post_video_teaser, this);
        getContext();
        getSupportBadgeView().setAppearance(new VkContentBadge.Appearance.a(new x7g(R.attr.vk_ui_text_primary_invariably), new x7g(R.attr.vk_ui_background_contrast), null, 12));
        getSupportBadgeView().setMode(VkContentBadge.Mode.Primary);
        Drawable e = krv0.e(R.drawable.vk_icon_donut_color_12, getContext());
        if (e != null) {
            VkContentBadge supportBadgeView = getSupportBadgeView();
            supportBadgeView.setBefore(null);
            supportBadgeView.setBefore(new VkContentBadge.a.b(eko.b(e)));
            gpo0.a(supportBadgeView.s);
            supportBadgeView.setIconColorful(false);
            supportBadgeView.d();
            supportBadgeView.f();
        }
        getSupportBadgeView().setSize(VkContentBadge.Size.Medium);
        getSupportBadgeView().setOnClickListener(new ai0(this, 3));
        getCoverView().setPlaceholderImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, getContext())));
    }

    public static s3q0 a(u1o u1oVar, VkImage vkImage) {
        a aVar = u1oVar.e;
        u1oVar.getCoverView().o0(aVar != null ? (String) aVar.b.invoke(Integer.valueOf(vkImage.getWidth()), Integer.valueOf(vkImage.getHeight())) : null, null);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImage getCoverView() {
        return (VkImage) this.b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getDurationView() {
        return (VkText) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkContentBadge getSupportBadgeView() {
        return (VkContentBadge) this.c.getValue();
    }

    public final a getCoverImage() {
        return this.e;
    }

    public final String getDuration() {
        return this.g;
    }

    public final gzs<s3q0> getOnSupportBadgeClick() {
        return this.h;
    }

    public final CharSequence getSupportBadgeTitle() {
        return this.f;
    }

    public final void setCoverImage(a aVar) {
        this.e = aVar;
        VkImage coverView = getCoverView();
        a aVar2 = this.e;
        coverView.setAspectRatio(aVar2 != null ? aVar2.a : 1.8f);
        bwt0.S(getCoverView(), new zkh(this, 10));
    }

    public final void setDuration(String str) {
        this.g = str;
        getDurationView().setVisibility(this.g != null ? 0 : 8);
        VkText durationView = getDurationView();
        String str2 = this.g;
        if (str2 == null) {
            str2 = "";
        }
        durationView.setText(str2);
    }

    public final void setOnSupportBadgeClick(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setSupportBadgeTitle(CharSequence charSequence) {
        this.f = charSequence;
        getSupportBadgeView().setVisibility(this.f != null ? 0 : 8);
        getSupportBadgeView().setText(this.f);
    }
}
