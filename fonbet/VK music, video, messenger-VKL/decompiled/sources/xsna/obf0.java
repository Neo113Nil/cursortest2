package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemBadgeStyle;
import com.vk.toggle.data.RecommendationsItemImageCornersRoundingStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecommendationsCarouselItemHolder.kt */
/* loaded from: classes4.dex */
public final class obf0 extends gtl0 implements View.OnClickListener {
    public final TextView A;
    public final PhotoStackView B;
    public final VkButton C;
    public final Object D;
    public final Object E;
    public final bik F;
    public gzs<Integer> G;
    public gzs<? extends vif0<?>> H;
    public final lbf0 n;
    public final ActionButtonStyle o;
    public final RecommendationsItemBadgeStyle p;
    public final RecommendationsItemSizeStyle q;
    public final View r;
    public final VkImage s;
    public final View t;
    public final View u;
    public final TextView v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;
    public final View z;

    /* compiled from: RecommendationsCarouselItemHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[RecommendationsItemSizeStyle.values().length];
            try {
                iArr[RecommendationsItemSizeStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsItemSizeStyle.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsItemSizeStyle.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsItemImageStyle.values().length];
            try {
                iArr2[RecommendationsItemImageStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationsItemImageStyle.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RecommendationsItemImageCornersRoundingStyle.values().length];
            try {
                iArr3[RecommendationsItemImageCornersRoundingStyle.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[RecommendationsItemImageCornersRoundingStyle.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RecommendationsItemBadgeStyle.values().length];
            try {
                iArr4[RecommendationsItemBadgeStyle.DARKBLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[RecommendationsItemBadgeStyle.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[RecommendationsItemBackgroundStyle.values().length];
            try {
                iArr5[RecommendationsItemBackgroundStyle.GRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[RecommendationsItemBackgroundStyle.TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[RecommendationsItemBackgroundStyle.TRANSPARENT_OUTLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ActionButtonStyle.values().length];
            try {
                iArr6[ActionButtonStyle.PrimaryWithNoShadow.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[ActionButtonStyle.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[ActionButtonStyle.ContentInverse.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public obf0(ViewGroup viewGroup, lbf0 lbf0Var, ActionButtonStyle actionButtonStyle, RecommendationsItemBadgeStyle recommendationsItemBadgeStyle, RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle, RecommendationsItemImageStyle recommendationsItemImageStyle, RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle, RecommendationsItemSizeStyle recommendationsItemSizeStyle) {
        super(viewGroup, R.layout.holder_recommendations_carousel_item, 0);
        TextView textView;
        PhotoStackView photoStackView;
        boolean z;
        View view;
        int i;
        int i2;
        float f;
        int i3;
        baf0 b;
        int i4;
        int c;
        int i5;
        boolean z2;
        VkButton.Appearance appearance;
        this.n = lbf0Var;
        this.o = actionButtonStyle;
        this.p = recommendationsItemBadgeStyle;
        this.q = recommendationsItemSizeStyle;
        View findViewById = this.itemView.findViewById(R.id.card_container);
        this.r = findViewById;
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.image);
        this.s = vkImage;
        View findViewById2 = this.itemView.findViewById(R.id.carousel_card_top_action_button);
        this.t = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_subtitle_flow);
        this.u = findViewById3;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.title);
        this.v = textView2;
        this.w = (ImageView) this.itemView.findViewById(R.id.title_icon);
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.secondary_title);
        this.x = textView3;
        TextView textView4 = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.y = textView4;
        View findViewById4 = this.itemView.findViewById(R.id.badge_container);
        this.z = findViewById4;
        TextView textView5 = (TextView) this.itemView.findViewById(R.id.badge_title);
        this.A = textView5;
        PhotoStackView photoStackView2 = (PhotoStackView) this.itemView.findViewById(R.id.badge_photostack);
        this.B = photoStackView2;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.action_button);
        this.C = vkButton;
        vex vexVar = new vex(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, vexVar);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new xm6(11, recommendationsItemImageStyle, this));
        this.E = a2;
        bik bikVar = new bik();
        this.F = bikVar;
        this.G = new da50(this, 17);
        this.H = new io60(this, 20);
        this.itemView.setClipToOutline(true);
        int i6 = a.$EnumSwitchMapping$0[recommendationsItemSizeStyle.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                bwt0.r0(t6(), findViewById);
                f4m.j(findViewById2);
                textView2.setMinHeight(cn70.b(18));
                textView2.setTextSize(14.0f);
                textView2.setMinHeight(cn70.b(16));
                textView3.setTextSize(12.0f);
                textView4.setMinHeight(cn70.b(0));
                textView4.setTextSize(12.0f);
                photoStackView = photoStackView2;
                textView = textView5;
                z = true;
                bwt0.f0(findViewById3, cn70.b(0), 0, cn70.b(0), cn70.b(4), 2);
                view = findViewById4;
                awt0.x(view, cn70.b(4), cn70.b(4), 0, cn70.b(4), 4);
                f4m.s(cn70.b(4), textView);
                i = a.$EnumSwitchMapping$1[recommendationsItemImageStyle.ordinal()];
                if (i != z) {
                    int t6 = t6();
                    bikVar.f(t6, t6);
                    f4m.o(t6, t6, vkImage);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int t62 = t6();
                    int intValue = ((Number) a2.getValue()).intValue();
                    bikVar.f(t62, intValue);
                    f4m.o(t62, intValue, vkImage);
                }
                float a3 = e3m.a(R.dimen.recom_carousel_item_corner_radius, this.itemView.getContext());
                i2 = a.$EnumSwitchMapping$2[recommendationsItemImageCornersRoundingStyle.ordinal()];
                if (i2 != z) {
                    f = a3;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = cn70.c(2);
                }
                vkImage.z0(a3, a3, f, f);
                vkImage.y0(cn70.a() * 0.5f, e3m.f(R.attr.vk_ui_image_border_alpha, this.itemView.getContext()));
                vkImage.setPaintFilterBitmap(z);
                vkImage.setPlaceholderImage(new ColorDrawable(e3m.f(R.attr.vk_ui_background_secondary, this.itemView.getContext())));
                photoStackView.v(14.5f, 1.0f, 16.0f);
                photoStackView.setDrawBorder(z);
                int[] iArr = a.$EnumSwitchMapping$3;
                i3 = iArr[recommendationsItemBadgeStyle.ordinal()];
                if (i3 != z) {
                    b = dhr0.t.b(R.drawable.recommendations_carousel_badge_bg, R.attr.vk_ui_overlay_primary);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = dhr0.t.b(R.drawable.recommendations_carousel_badge_bg, R.attr.vk_ui_background_contrast_themed);
                }
                i4 = iArr[recommendationsItemBadgeStyle.ordinal()];
                if (i4 != z) {
                    c = dhr0.t.c(R.attr.vk_ui_text_contrast);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c = dhr0.t.c(R.attr.vk_ui_text_primary);
                }
                textView.setTextColor(c);
                view.setBackground(b);
                i5 = a.$EnumSwitchMapping$4[recommendationsItemBackgroundStyle.ordinal()];
                if (i5 != z) {
                    z2 = false;
                    findViewById.setBackgroundResource(R.drawable.recommendations_carousel_gray_item_bg);
                } else if (i5 == 2) {
                    z2 = false;
                    findViewById.setBackgroundResource(0);
                    f4m.s(0, findViewById3);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    findViewById.setBackgroundResource(R.drawable.recommendations_carousel_outlined_item_bg);
                    z2 = false;
                }
                if (actionButtonStyle != null) {
                    f4m.q(cn70.b(8), findViewById3);
                    bwt0.p0(vkButton, z2);
                } else {
                    int i7 = a.$EnumSwitchMapping$5[actionButtonStyle.ordinal()];
                    if (i7 == z) {
                        appearance = VkButton.Appearance.Overlay;
                    } else if (i7 == 2) {
                        appearance = VkButton.Appearance.Accent;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        appearance = VkButton.Appearance.Neutral;
                    }
                    vkButton.setAppearance(appearance);
                }
                findViewById2.setOnClickListener(this);
                vkButton.setOnClickListener(this);
                this.itemView.setOnClickListener(this);
            }
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.r0(t6(), findViewById);
        }
        textView = textView5;
        photoStackView = photoStackView2;
        z = true;
        view = findViewById4;
        i = a.$EnumSwitchMapping$1[recommendationsItemImageStyle.ordinal()];
        if (i != z) {
        }
        float a32 = e3m.a(R.dimen.recom_carousel_item_corner_radius, this.itemView.getContext());
        i2 = a.$EnumSwitchMapping$2[recommendationsItemImageCornersRoundingStyle.ordinal()];
        if (i2 != z) {
        }
        vkImage.z0(a32, a32, f, f);
        vkImage.y0(cn70.a() * 0.5f, e3m.f(R.attr.vk_ui_image_border_alpha, this.itemView.getContext()));
        vkImage.setPaintFilterBitmap(z);
        vkImage.setPlaceholderImage(new ColorDrawable(e3m.f(R.attr.vk_ui_background_secondary, this.itemView.getContext())));
        photoStackView.v(14.5f, 1.0f, 16.0f);
        photoStackView.setDrawBorder(z);
        int[] iArr2 = a.$EnumSwitchMapping$3;
        i3 = iArr2[recommendationsItemBadgeStyle.ordinal()];
        if (i3 != z) {
        }
        i4 = iArr2[recommendationsItemBadgeStyle.ordinal()];
        if (i4 != z) {
        }
        textView.setTextColor(c);
        view.setBackground(b);
        i5 = a.$EnumSwitchMapping$4[recommendationsItemBackgroundStyle.ordinal()];
        if (i5 != z) {
        }
        if (actionButtonStyle != null) {
        }
        findViewById2.setOnClickListener(this);
        vkButton.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        Image image;
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = (RecommendationsCarouselItemUiDto) obj;
        RecommendationsCarouselItemUiDto.b bVar = recommendationsCarouselItemUiDto.c;
        RecommendationsCarouselItemUiDto.b.a aVar = bVar != null ? bVar.b : null;
        VkImage vkImage = this.s;
        if (aVar == null) {
            ImageSize Cb = (bVar == null || (image = bVar.a) == null) ? null : image.Cb(((Number) this.E.getValue()).intValue(), false, false);
            vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkImage.setVkPostprocessor(null);
            vkImage.o0(Cb != null ? Cb.d.d : null, null);
        } else {
            float f = aVar.b;
            float f2 = aVar.a;
            float f3 = aVar.c;
            float f4 = aVar.d;
            bik bikVar = this.F;
            bikVar.g(f2, f, f3, f4);
            kci.o(vkImage, bikVar);
            vkImage.setScaleType(ImageView.ScaleType.FIT_XY);
            ImageSize Cb2 = bVar.a.Cb((int) Math.ceil(t6() / ((f - f2) / 100.0f)), true, false);
            vkImage.o0(Cb2 != null ? Cb2.d.d : null, null);
        }
        RecommendationsCarouselItemUiDto.a aVar2 = recommendationsCarouselItemUiDto.d;
        View view = this.z;
        if (aVar2 == null) {
            bwt0.p0(view, false);
        } else {
            bwt0.p0(view, true);
            boolean z = aVar2.c;
            PhotoStackView photoStackView = this.B;
            photoStackView.setDrawBorder(z);
            RecommendationsCarouselItemUiDto.a.InterfaceC1369a interfaceC1369a = aVar2.b;
            if (interfaceC1369a instanceof RecommendationsCarouselItemUiDto.a.InterfaceC1369a.C1370a) {
                bwt0.p0(photoStackView, true);
                int i = a.$EnumSwitchMapping$3[this.p.ordinal()];
                if (i != 1 && i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ((RecommendationsCarouselItemUiDto.a.InterfaceC1369a.C1370a) interfaceC1369a).getClass();
                new ArrayList(c5g.u(null, 10));
                throw null;
            }
            if (interfaceC1369a instanceof RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b) {
                bwt0.p0(photoStackView, true);
                List<Image> list = ((RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b) interfaceC1369a).a;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ImageSize Cb3 = ((Image) it.next()).Cb(cn70.b(16), false, false);
                    String str = Cb3 != null ? Cb3.d.d : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                f4m.x(cn70.b(4), view);
                photoStackView.r(-1, arrayList);
            } else {
                if (interfaceC1369a != null) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(photoStackView, false);
            }
            this.A.setText(aVar2.a);
        }
        RecommendationsCarouselItemUiDto.c cVar = recommendationsCarouselItemUiDto.a;
        Integer num = cVar.b;
        ImageView imageView = this.w;
        if (num != null) {
            bwt0.p0(imageView, true);
            imageView.setImageResource(num.intValue());
            imageView.setContentDescription(null);
            Integer num2 = cVar.c;
            if (num2 != null) {
                imageView.setImageTintList(ColorStateList.valueOf(num2.intValue()));
            }
        } else {
            bwt0.p0(imageView, false);
        }
        this.v.setText(cVar.a);
        bwt0.p0(this.x, false);
        this.y.setText(recommendationsCarouselItemUiDto.b);
        RecommendationsCarouselItemUiDto.ActionButtonData actionButtonData = recommendationsCarouselItemUiDto.e;
        if (actionButtonData != null) {
            RecommendationsCarouselItemUiDto.ActionButtonData.ActionState actionState = actionButtonData.d;
            if (this.o != null) {
                boolean z2 = actionState == RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.IN_PROGRESS;
                String str2 = actionButtonData.b;
                VkButton vkButton = this.C;
                vkButton.setContentDescription(str2);
                if (z2) {
                    vkButton.setLoading(true);
                    vkButton.d5(0);
                    vkButton.setText((CharSequence) null);
                } else {
                    vkButton.setLoading(false);
                    vkButton.d5(actionButtonData.c);
                    vkButton.setText(actionButtonData.a);
                }
                if (actionState == RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.COMPLETED && (this.H.invoke() instanceof idf0)) {
                    vkButton.setTextTint(R.attr.vk_ui_text_secondary);
                } else {
                    vkButton.setTextColorful(true);
                }
            }
        }
        this.n.a(sni.f, this.H.invoke(), this.G.invoke().intValue());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        int intValue = this.G.invoke().intValue();
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        lbf0 lbf0Var = this.n;
        if (valueOf != null && valueOf.intValue() == R.id.carousel_card_top_action_button) {
            lbf0Var.a(kci.d, this.H.invoke(), intValue);
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.action_button) {
            lbf0Var.a(jcr.c, this.H.invoke(), intValue);
        } else if (valueOf != null && valueOf.intValue() == R.id.card_container) {
            lbf0Var.a(xus.c, this.H.invoke(), intValue);
        }
    }

    @Override // xsna.gtl0
    public final void q6(gzs<Integer> gzsVar) {
        this.G = gzsVar;
    }

    @Override // xsna.gtl0
    public final void s6(gzs<? extends vif0<?>> gzsVar) {
        this.H = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int t6() {
        return ((Number) this.D.getValue()).intValue();
    }

    public /* synthetic */ obf0(ViewGroup viewGroup, lbf0 lbf0Var, ActionButtonStyle actionButtonStyle, RecommendationsItemBadgeStyle recommendationsItemBadgeStyle, RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle, RecommendationsItemImageStyle recommendationsItemImageStyle, RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle) {
        this(viewGroup, lbf0Var, actionButtonStyle, recommendationsItemBadgeStyle, recommendationsItemBackgroundStyle, recommendationsItemImageStyle, recommendationsItemImageCornersRoundingStyle, RecommendationsItemSizeStyle.NORMAL);
    }
}
