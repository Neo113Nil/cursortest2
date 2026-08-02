package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.buu0;
import xsna.cut0;
import xsna.tlo0;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class cuu0 extends ConstraintLayout {
    public final VkImageSimple A;
    public final VkText B;
    public final VkImageSimple C;
    public final VkButton D;
    public b E;
    public a F;
    public buu0 G;
    public auu0 H;
    public ztu0 I;
    public ytu0 J;
    public xtu0 K;
    public final VkImage t;
    public final ViewGroup u;
    public final VkMiniUserStack v;
    public final VkText w;
    public final ViewGroup x;
    public final VkText y;
    public final VkText z;

    /* compiled from: VkFeedCarouselCard.kt */
    public interface a {

        /* compiled from: VkFeedCarouselCard.kt */
        /* renamed from: xsna.cuu0$a$a, reason: collision with other inner class name */
        public static final class C2686a implements a {
        }

        /* compiled from: VkFeedCarouselCard.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            @Override // xsna.cuu0.a
            public final boolean b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Large(isSquare="), this.a, ')');
            }
        }

        /* compiled from: VkFeedCarouselCard.kt */
        public static final class c implements a {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            @Override // xsna.cuu0.a
            public final boolean b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Medium(isSquare="), this.a, ')');
            }
        }

        /* compiled from: VkFeedCarouselCard.kt */
        public static final class d implements a {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            @Override // xsna.cuu0.a
            public final boolean b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Small(isSquare="), this.a, ')');
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if ((r4 instanceof xsna.cuu0.a.b) != false) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        default Size a(Context context) {
            if (this instanceof C2686a) {
                throw null;
            }
            boolean z = this instanceof d;
            int i = -2;
            int a = z ? e3m.a(R.dimen.recomm_carousel_small_item_width, context) : this instanceof c ? e3m.a(R.dimen.recomm_carousel_item_width, context) : this instanceof b ? e3m.a(R.dimen.recomm_carousel_large_item_width, context) : -2;
            if (!b()) {
                if (z) {
                    i = e3m.a(R.dimen.recomm_carousel_small_item_portrait_image_height, context);
                } else if (this instanceof c) {
                    i = e3m.a(R.dimen.recomm_carousel_portrait_image_height, context);
                }
                return new Size(a, i);
            }
            i = a;
            return new Size(a, i);
        }

        boolean b();
    }

    /* compiled from: VkFeedCarouselCard.kt */
    public interface b {

        /* compiled from: VkFeedCarouselCard.kt */
        public static final class a {
            public final float a;

            public a(float f) {
                this.a = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + qoy.b(Float.hashCode(this.a) * 31, 31, false);
            }

            public final String toString() {
                return shy.c(this.a, ", roundTop=false, roundBottom=true)", new StringBuilder("CornerConfig(radius="));
            }
        }

        /* compiled from: VkFeedCarouselCard.kt */
        /* renamed from: xsna.cuu0$b$b, reason: collision with other inner class name */
        public static final class C2687b {
            public final float a;
            public final float b;
            public final float c;

            public C2687b(float f, float f2, float f3) {
                this.a = f;
                this.b = f2;
                this.c = f3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2687b)) {
                    return false;
                }
                C2687b c2687b = (C2687b) obj;
                return Float.compare(this.a, c2687b.a) == 0 && Float.compare(this.b, c2687b.b) == 0 && Float.compare(this.c, c2687b.c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TextSizes(title=");
                sb.append(this.a);
                sb.append(", extraTitle=");
                sb.append(this.b);
                sb.append(", subtitle=");
                return xq.c(')', this.c, sb);
            }
        }

        Rect a(a aVar);

        C2687b b(a aVar);

        a c();

        Rect d(a aVar);
    }

    public cuu0(Context context) {
        super(context, null, 0);
        this.E = new wtu0();
        this.F = new a.c(true);
        LayoutInflater.from(context).inflate(R.layout.feed_carousel_card, (ViewGroup) this, true);
        VkImage vkImage = (VkImage) findViewById(R.id.carousel_card_picture);
        setupPicture(vkImage);
        this.t = vkImage;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.carousel_card_badge_container);
        setupBadgeContainer(viewGroup);
        this.u = viewGroup;
        this.v = (VkMiniUserStack) findViewById(R.id.carousel_card_badge_avatar);
        this.w = (VkText) findViewById(R.id.carousel_card_badge_title);
        this.x = (ViewGroup) findViewById(R.id.carousel_card_label_container);
        this.y = (VkText) findViewById(R.id.carousel_card_title);
        this.z = (VkText) findViewById(R.id.carousel_card_extra_title);
        this.A = (VkImageSimple) findViewById(R.id.carousel_card_trailing_title_icon);
        this.B = (VkText) findViewById(R.id.carousel_card_subtitle);
        this.C = (VkImageSimple) findViewById(R.id.carousel_card_top_action_button);
        this.D = (VkButton) findViewById(R.id.carousel_card_bottom_action_button);
        Q4(this.F);
        getContext();
    }

    private final void setupBadgeContainer(ViewGroup viewGroup) {
        viewGroup.setBackground(P4());
    }

    private final void setupPicture(VkImage vkImage) {
        vkImage.setPaintFilterBitmap(true);
        vkImage.setPlaceholderImage(new ColorDrawable(e3m.f(R.attr.vk_ui_background_secondary, vkImage.getContext())));
        vkImage.y0(iah0.b(0.5f), e3m.f(R.attr.vk_ui_image_border_alpha, vkImage.getContext()));
    }

    public final GradientDrawable P4() {
        GradientDrawable a2 = ful0.a(0);
        a2.setColor(krv0.m(R.attr.vk_ui_overlay_primary, getContext()));
        a2.setCornerRadius(e3m.a(R.dimen.recom_carousel_item_corner_radius, getContext()));
        return a2;
    }

    public final void Q4(a aVar) {
        Size a2 = aVar.a(getContext());
        Pair pair = new Pair(Integer.valueOf(a2.getWidth()), Integer.valueOf(a2.getHeight()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ConstraintLayout.b(intValue, -2);
        }
        layoutParams.width = intValue;
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
        VkImage vkImage = this.t;
        ViewGroup.LayoutParams layoutParams2 = vkImage.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ConstraintLayout.b(intValue, intValue2);
        }
        layoutParams2.width = intValue;
        layoutParams2.height = intValue2;
        vkImage.setLayoutParams(layoutParams2);
        bwt0.d(this, this.E.c().a, true, false);
        Rect a3 = this.E.a(aVar);
        bwt0.e0(this.x, a3.left, a3.top, a3.right, a3.bottom);
        Rect d = this.E.d(aVar);
        bwt0.e0(this.D, d.left, d.top, d.right, d.bottom);
        b.C2687b b2 = this.E.b(aVar);
        this.y.setTextSize(b2.a);
        this.z.setTextSize(b2.b);
        this.B.setTextSize(b2.c);
    }

    public final ztu0 getBadge() {
        return this.I;
    }

    public final xtu0 getBottomAction() {
        return this.K;
    }

    public final auu0 getLabel() {
        return this.H;
    }

    public final buu0 getMedia() {
        return this.G;
    }

    public final a getMediaSize() {
        return this.F;
    }

    public final ytu0 getTopAction() {
        return this.J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r5 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBadge(ztu0 ztu0Var) {
        Drawable P4;
        this.I = ztu0Var;
        boolean z = ztu0Var != null;
        ViewGroup viewGroup = this.u;
        awt0.v(viewGroup, z);
        if (ztu0Var != null) {
            tlo0.h hVar = ztu0Var.a;
            Context context = viewGroup.getContext();
            hVar.getClass();
            CharSequence a2 = tlo0.b.a(hVar, context);
            VkText vkText = this.w;
            ey2.i(vkText, a2);
            x7g x7gVar = ztu0Var.b;
            vkText.setTextColor(x7gVar != null ? cut0.a.a(x7gVar, viewGroup.getContext()) : krv0.m(R.attr.vk_ui_text_contrast, viewGroup.getContext()));
            VkUserStack.Size size = VkUserStack.Size.Small;
            VkMiniUserStack vkMiniUserStack = this.v;
            vkMiniUserStack.setSize(size);
            List<? extends ayv0> list = ztu0Var.d;
            if (list == null) {
                list = EmptyList.b;
            }
            vkMiniUserStack.setAvatars(list);
            eko ekoVar = ztu0Var.c;
            if (ekoVar != null) {
                viewGroup.getContext();
                P4 = ekoVar.a;
            }
            P4 = P4();
            viewGroup.setBackground(P4);
            viewGroup.getContext();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void setBottomAction(xtu0 xtu0Var) {
        CharSequence a2;
        gko gkoVar;
        this.K = xtu0Var;
        boolean z = xtu0Var != null;
        VkButton vkButton = this.D;
        awt0.v(vkButton, z);
        if (xtu0Var == null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            vkButton.setOnClickListener(null);
            return;
        }
        boolean z2 = xtu0Var.c;
        if (z2) {
            a2 = null;
        } else {
            tlo0.h hVar = xtu0Var.a;
            Context context = vkButton.getContext();
            hVar.getClass();
            a2 = tlo0.b.a(hVar, context);
        }
        vkButton.setText(a2);
        vkButton.d5((z2 || (gkoVar = xtu0Var.d) == null) ? null : Integer.valueOf(gkoVar.a));
        vkButton.setLoading(z2);
        VkButton.Size size = xtu0Var.e;
        if (size == null) {
            size = VkButton.Size.Small;
        }
        vkButton.setSize(size);
        VkButton.Mode mode = xtu0Var.f;
        if (mode == null) {
            mode = VkButton.Mode.Primary;
        }
        vkButton.setMode(mode);
        VkButton.Appearance appearance = xtu0Var.g;
        if (appearance == null) {
            appearance = VkButton.Appearance.Overlay;
        }
        vkButton.setAppearance(appearance);
        tlo0.h hVar2 = xtu0Var.h;
        vkButton.setContentDescription(hVar2 != null ? tlo0.b.a(hVar2, vkButton.getContext()) : null);
        bwt0.i0(vkButton, new f6m0(xtu0Var, 19));
    }

    public final void setCardDecorator(b bVar) {
        if (bVar == null) {
            bVar = new wtu0();
        }
        this.E = bVar;
        Q4(this.F);
    }

    public final void setLabel(auu0 auu0Var) {
        this.H = auu0Var;
        boolean z = auu0Var != null;
        ViewGroup viewGroup = this.x;
        awt0.v(viewGroup, z);
        if (auu0Var != null) {
            ey2.i(this.y, tlo0.b.a(auu0Var.a, viewGroup.getContext()));
            tlo0 tlo0Var = auu0Var.b;
            ey2.i(this.z, tlo0Var != null ? tlo0Var.a(viewGroup.getContext()) : null);
            CharSequence a2 = tlo0.b.a(auu0Var.f, viewGroup.getContext());
            boolean z2 = a2 != null;
            VkText vkText = this.B;
            bwt0.p0(vkText, z2);
            if (a2 != null) {
                vkText.setText(a2);
            }
            dko dkoVar = auu0Var.c;
            VkImageSimple vkImageSimple = this.A;
            Drawable a3 = dkoVar != null ? dkoVar.a(vkImageSimple.getContext()) : null;
            bwt0.p0(vkImageSimple, a3 != null);
            vkImageSimple.setImageDrawable(a3);
            cut0 cut0Var = auu0Var.d;
            vkImageSimple.setImageTintList(cut0Var != null ? cut0Var.c(vkImageSimple.getContext()) : null);
            tlo0 tlo0Var2 = auu0Var.e;
            vkImageSimple.setContentDescription(tlo0Var2 != null ? tlo0Var2.a(vkImageSimple.getContext()) : null);
        }
    }

    public final void setMedia(buu0 buu0Var) {
        this.G = buu0Var;
        if (buu0Var != null) {
            buu0.a aVar = buu0Var.b;
            float f = aVar.a;
            float f2 = aVar.b;
            float f3 = aVar.c;
            float f4 = aVar.d;
            VkImage vkImage = this.t;
            vkImage.z0(f, f2, f3, f4);
            ImageView.ScaleType scaleType = buu0Var.c;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.CENTER;
            }
            vkImage.setScaleType(scaleType);
            vkImage.o0(buu0Var.a, null);
            vkImage.y0(iah0.b(0.5f), e3m.f(R.attr.vk_ui_image_border_alpha, vkImage.getContext()));
            vkImage.setContentDescription(null);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void setMediaPostprocessor(mk6 mk6Var) {
        kci.o(this.t, mk6Var);
    }

    public final void setMediaSize(a aVar) {
        this.F = aVar;
        Q4(aVar);
    }

    public final void setTopAction(ytu0 ytu0Var) {
        this.J = ytu0Var;
        VkImageSimple vkImageSimple = this.C;
        vkImageSimple.getContext();
        awt0.v(vkImageSimple, ytu0Var != null);
        if (ytu0Var == null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            vkImageSimple.setOnClickListener(null);
        } else {
            vkImageSimple.setImageDrawable(gko.b(ytu0Var.a.a, vkImageSimple.getContext()));
            vkImageSimple.setContentDescription(tlo0.b.a(ytu0Var.c, vkImageSimple.getContext()));
            bwt0.i0(vkImageSimple, new yka0(ytu0Var, 27));
        }
    }
}
