package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: MarketStickerView.kt */
/* loaded from: classes6.dex */
public final class ye10 extends FrameLayout {
    public final VkImage b;
    public final VkText c;
    public final VkText d;
    public final VkImageSimple e;
    public b f;

    /* compiled from: MarketStickerView.kt */
    public interface a {

        /* compiled from: MarketStickerView.kt */
        /* renamed from: xsna.ye10$a$a, reason: collision with other inner class name */
        public static final class C4097a implements a {
            public static final C4097a a = new C4097a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4097a);
            }

            public final int hashCode() {
                return -1656530669;
            }

            public final String toString() {
                return "NoPhoto";
            }
        }

        /* compiled from: MarketStickerView.kt */
        @vby
        public static final class b implements a {
            public final String a;

            public /* synthetic */ b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof b) {
                    return epx.f(this.a, ((b) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return air.b(')', "Url(url=", this.a);
            }
        }
    }

    /* compiled from: MarketStickerView.kt */
    public static final class b {
        public final a a;
        public final d.a b;
        public final c c;
        public final boolean d;

        public b(a aVar, d.a aVar2, c cVar, boolean z) {
            this.a = aVar;
            this.b = aVar2;
            this.c = cVar;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b.a)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(photo=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", isRestricted=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MarketStickerView.kt */
    public interface c {

        /* compiled from: MarketStickerView.kt */
        @vby
        public static final class a implements c {
            public final float a;

            public /* synthetic */ a(float f) {
                this.a = f;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return Float.compare(this.a, ((a) obj).a) == 0;
                }
                return false;
            }

            public final int hashCode() {
                return Float.hashCode(this.a);
            }

            public final String toString() {
                return "Rating(value=" + this.a + ')';
            }
        }

        /* compiled from: MarketStickerView.kt */
        public static final class b implements c {
            public final float a;
            public final String b;

            public b(float f, String str) {
                this.a = f;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Float.compare(this.a, bVar.a) == 0 && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Float.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RatingAndReviewsCount(rating=");
                sb.append(this.a);
                sb.append(", reviewCountText=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: MarketStickerView.kt */
        @vby
        /* renamed from: xsna.ye10$c$c, reason: collision with other inner class name */
        public static final class C4098c implements c {
            public final String a;

            public /* synthetic */ C4098c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C4098c) {
                    return epx.f(this.a, ((C4098c) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return air.b(')', "Text(value=", this.a);
            }
        }
    }

    /* compiled from: MarketStickerView.kt */
    public interface d {

        /* compiled from: MarketStickerView.kt */
        @vby
        public static final class a implements d {
            public final String a;

            public /* synthetic */ a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return epx.f(this.a, ((a) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return air.b(')', "Text(value=", this.a);
            }
        }
    }

    public ye10(Context context) {
        super(context, null, 0);
        String str = "";
        this.f = new b(a.C4097a.a, new d.a(str), new c.C4098c(str), false);
        LayoutInflater.from(context).inflate(R.layout.sticker_market_view, (ViewGroup) this, true);
        VkImage vkImage = (VkImage) findViewById(R.id.marketPhoto);
        this.b = vkImage;
        this.c = (VkText) findViewById(R.id.marketTitle);
        this.d = (VkText) findViewById(R.id.marketSubtitle);
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.marketPhotoRestrictionIcon);
        this.e = vkImageSimple;
        vkImage.setCornerRadius(cn70.a() * 6.0f);
        vkImage.J0(getPlaceholderDrawable(), ImageView.ScaleType.CENTER);
        vkImage.setBackgroundDrawable(getBackgroundDrawable());
        vkImageSimple.setImageDrawable(getRestrictionDrawable());
    }

    private final Drawable getBackgroundDrawable() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        return m33.a(R.drawable.bg_market_sticker_photo, context);
    }

    private final PorterDuffColorFilter getBlurOverlayFilter() {
        return new PorterDuffColorFilter(getContext().getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
    }

    private final Drawable getPlaceholderDrawable() {
        return enj.e(R.drawable.vk_icon_market_outline_20, R.attr.vk_ui_icon_medium, getContext());
    }

    private final Drawable getRestrictionDrawable() {
        return enj.e(R.drawable.vk_icon_hide_outline_20, R.attr.vk_ui_icon_contrast, getContext());
    }

    private final Drawable getSubtitleRatingDrawable() {
        return krv0.f(R.drawable.vk_icon_favorite_12, R.attr.vk_ui_icon_contrast, getContext());
    }

    private final void setUpIsRestricted(boolean z) {
        bwt0.p0(this.e, z);
        jwx jwxVar = z ? new jwx(2, 15) : null;
        PorterDuffColorFilter blurOverlayFilter = z ? getBlurOverlayFilter() : null;
        VkImage vkImage = this.b;
        vkImage.setActualColorFilter(blurOverlayFilter);
        kci.o(vkImage, jwxVar);
        if (z) {
            VkText vkText = this.c;
            vkText.setText("");
            VkText vkText2 = this.d;
            vkText2.setText("");
            vkText2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            vkText.setText(getContext().getString(R.string.story_market_sticker_restriction_title));
            vkText2.setText(getContext().getString(R.string.story_market_sticker_restriction_subtitle));
        }
    }

    private final void setUpPhoto(a.C4097a c4097a) {
        this.b.o0(null, null);
    }

    /* renamed from: setUpPhoto-X1CbZI4, reason: not valid java name */
    private final void m425setUpPhotoX1CbZI4(String str) {
        this.b.o0(str, null);
    }

    private final void setUpState(b bVar) {
        setUpPhoto(bVar.a);
        setUpTitle(bVar.b);
        setUpSubtitle(bVar.c);
        setUpIsRestricted(bVar.d);
    }

    private final void setUpSubtitle(c cVar) {
        VkText vkText = this.d;
        vkText.setText("");
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (cVar instanceof c.C4098c) {
            m426setUpSubtitle8HWtI70(((c.C4098c) cVar).a);
        } else if (cVar instanceof c.a) {
            m427setUpSubtitleC1Xpixo(((c.a) cVar).a);
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            setUpSubtitle((c.b) cVar);
        }
    }

    /* renamed from: setUpSubtitle-8HWtI70, reason: not valid java name */
    private final void m426setUpSubtitle8HWtI70(String str) {
        this.d.setText(str);
    }

    /* renamed from: setUpSubtitle-C1Xpixo, reason: not valid java name */
    private final void m427setUpSubtitleC1Xpixo(float f) {
        String valueOf = String.valueOf(f);
        VkText vkText = this.d;
        vkText.setText(valueOf);
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds(getSubtitleRatingDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setUpTitle(d dVar) {
        if (!(dVar instanceof d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m428setUpTitleFMmmbd4(((d.a) dVar).a);
    }

    /* renamed from: setUpTitle-FMmmbd4, reason: not valid java name */
    private final void m428setUpTitleFMmmbd4(String str) {
        this.c.setText(str);
    }

    public final b getState() {
        return this.f;
    }

    public final void setState(b bVar) {
        this.f = bVar;
        setUpState(bVar);
    }

    private final void setUpPhoto(a aVar) {
        VkImage vkImage = this.b;
        vkImage.o0(null, null);
        vkImage.setVkPostprocessor(null);
        vkImage.setActualColorFilter((ColorFilter) null);
        bwt0.p0(this.e, false);
        if (aVar instanceof a.b) {
            m425setUpPhotoX1CbZI4(((a.b) aVar).a);
        } else {
            if (!(aVar instanceof a.C4097a)) {
                throw new NoWhenBranchMatchedException();
            }
            setUpPhoto((a.C4097a) aVar);
        }
    }

    private final void setUpSubtitle(c.b bVar) {
        String str = bVar.a + " · " + bVar.b;
        VkText vkText = this.d;
        vkText.setText(str);
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds(getSubtitleRatingDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
