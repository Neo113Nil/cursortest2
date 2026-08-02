package xsna;

import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.newsfeed.common.presentation.model.items.RecommendationsCarouselItemUiDto;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemBadgeStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ayv0;
import xsna.buu0;
import xsna.cuu0;
import xsna.gko;
import xsna.tlo0;

/* compiled from: RecommendationsCarouselItemHolderV2.kt */
/* loaded from: classes4.dex */
public final class pbf0 extends gtl0 {
    public static final int w = cn70.b(16);
    public final lbf0 n;
    public final ActionButtonStyle o;
    public final RecommendationsItemBadgeStyle p;
    public final RecommendationsItemBackgroundStyle q;
    public final RecommendationsItemSizeStyle r;
    public final Object s;
    public final Object t;
    public gzs<Integer> u;
    public gzs<? extends vif0<?>> v;

    /* compiled from: RecommendationsCarouselItemHolderV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[RecommendationsItemSizeStyle.values().length];
            try {
                iArr[RecommendationsItemSizeStyle.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsItemSizeStyle.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsItemSizeStyle.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsItemBackgroundStyle.values().length];
            try {
                iArr2[RecommendationsItemBackgroundStyle.TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationsItemBackgroundStyle.TRANSPARENT_OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RecommendationsItemBackgroundStyle.GRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RecommendationsItemBadgeStyle.values().length];
            try {
                iArr3[RecommendationsItemBadgeStyle.DARKBLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[RecommendationsItemBadgeStyle.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ActionButtonStyle.values().length];
            try {
                iArr4[ActionButtonStyle.PrimaryWithNoShadow.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ActionButtonStyle.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ActionButtonStyle.ContentInverse.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public /* synthetic */ pbf0(ViewGroup viewGroup, lbf0 lbf0Var, ActionButtonStyle actionButtonStyle, RecommendationsItemBadgeStyle recommendationsItemBadgeStyle, RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle, RecommendationsItemImageStyle recommendationsItemImageStyle) {
        this(viewGroup, lbf0Var, actionButtonStyle, recommendationsItemBadgeStyle, recommendationsItemBackgroundStyle, recommendationsItemImageStyle, RecommendationsItemSizeStyle.NORMAL);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        Image image;
        ImageSize Cb;
        String str;
        int i;
        int i2;
        ArrayList arrayList;
        String str2;
        VkButton.Appearance appearance;
        String str3;
        RecommendationsCarouselItemUiDto recommendationsCarouselItemUiDto = (RecommendationsCarouselItemUiDto) obj;
        RecommendationsCarouselItemUiDto.c cVar = recommendationsCarouselItemUiDto.a;
        RecommendationsCarouselItemUiDto.b bVar = recommendationsCarouselItemUiDto.c;
        Size a2 = t6().getMediaSize().a(this.itemView.getContext());
        Pair pair = new Pair(Integer.valueOf(a2.getWidth()), Integer.valueOf(a2.getHeight()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        this.itemView.getContext();
        float a3 = e3m.a(R.dimen.recom_carousel_item_corner_radius, this.itemView.getContext());
        float b = cn70.b(2);
        buu0.a aVar = new buu0.a(a3, a3, b, b);
        if ((bVar != null ? bVar.b : null) != null) {
            RecommendationsCarouselItemUiDto.b.a aVar2 = bVar.b;
            ?? r6 = this.t;
            ((bik) r6.getValue()).g(aVar2.a, aVar2.b, aVar2.c, aVar2.d);
            int ceil = (int) Math.ceil(intValue / ((r14 - aVar2.a) / 100.0f));
            t6().setMediaPostprocessor((bik) r6.getValue());
            cuu0 t6 = t6();
            ImageSize Cb2 = bVar.a.Cb(ceil, true, false);
            t6.setMedia((Cb2 == null || (str3 = Cb2.d.d) == null) ? null : new buu0(str3, aVar, ImageView.ScaleType.FIT_XY));
        } else {
            t6().setMediaPostprocessor(null);
            t6().setMedia((bVar == null || (image = bVar.a) == null || (Cb = image.Cb(intValue2, false, false)) == null || (str = Cb.d.d) == null) ? null : new buu0(str, aVar, ImageView.ScaleType.CENTER_CROP));
        }
        this.itemView.getContext();
        cuu0 t62 = t6();
        gko.b bVar2 = gko.Companion;
        t62.setTopAction(new ytu0(new gko(R.drawable.vk_icon_dismiss_dark_20), new f880(this, 16), tq.h(tlo0.Companion, R.string.close)));
        cuu0 t63 = t6();
        tlo0.h hVar = new tlo0.h(cVar.a);
        Integer num = cVar.b;
        gko gkoVar = num != null ? new gko(num.intValue()) : null;
        Integer num2 = cVar.c;
        t63.setLabel(new auu0(hVar, null, gkoVar, num2 != null ? new b8g(num2.intValue()) : null, null, new tlo0.h(recommendationsCarouselItemUiDto.b)));
        RecommendationsCarouselItemUiDto.a aVar3 = recommendationsCarouselItemUiDto.d;
        if (aVar3 == null) {
            t6().setBadge(null);
        } else {
            this.itemView.getContext();
            cuu0 t64 = t6();
            tlo0.h hVar2 = new tlo0.h(aVar3.a);
            int[] iArr = a.$EnumSwitchMapping$2;
            RecommendationsItemBadgeStyle recommendationsItemBadgeStyle = this.p;
            int i3 = iArr[recommendationsItemBadgeStyle.ordinal()];
            if (i3 == 1) {
                i = R.attr.vk_ui_text_contrast;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.attr.vk_ui_text_primary;
            }
            x7g x7gVar = new x7g(i);
            int i4 = iArr[recommendationsItemBadgeStyle.ordinal()];
            if (i4 == 1) {
                i2 = R.attr.vk_ui_overlay_primary;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.attr.vk_ui_background_contrast_themed;
            }
            eko ekoVar = new eko(dhr0.t.b(R.drawable.recommendations_carousel_badge_bg, i2));
            RecommendationsCarouselItemUiDto.a.InterfaceC1369a interfaceC1369a = aVar3.b;
            if (interfaceC1369a instanceof RecommendationsCarouselItemUiDto.a.InterfaceC1369a.C1370a) {
                ((RecommendationsCarouselItemUiDto.a.InterfaceC1369a.C1370a) interfaceC1369a).getClass();
                new ArrayList(c5g.u(null, 10));
                throw null;
            }
            if (interfaceC1369a instanceof RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b) {
                List<Image> list = ((RecommendationsCarouselItemUiDto.a.InterfaceC1369a.b) interfaceC1369a).a;
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ImageSize Cb3 = ((Image) it.next()).Cb(w, false, false);
                    ayv0.c cVar2 = (Cb3 == null || (str2 = Cb3.d.d) == null) ? null : new ayv0.c(str2);
                    if (cVar2 != null) {
                        arrayList.add(cVar2);
                    }
                }
            } else {
                arrayList = null;
            }
            t64.setBadge(new ztu0(hVar2, x7gVar, ekoVar, arrayList));
        }
        RecommendationsCarouselItemUiDto.ActionButtonData actionButtonData = recommendationsCarouselItemUiDto.e;
        if (actionButtonData != null) {
            RecommendationsCarouselItemUiDto.ActionButtonData.ActionState actionState = actionButtonData.d;
            CharSequence charSequence = actionButtonData.a;
            ActionButtonStyle actionButtonStyle = this.o;
            if (actionButtonStyle != null) {
                this.itemView.getContext();
                VkButton.Size size = VkButton.Size.Small;
                cuu0 t65 = t6();
                tlo0.h f = u11.f(tlo0.Companion, charSequence);
                tbe0 tbe0Var = new tbe0(this, 2);
                boolean z = actionState == RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.IN_PROGRESS;
                Integer num3 = actionButtonData.c;
                gko gkoVar2 = num3 != null ? new gko(num3.intValue()) : null;
                VkButton.Mode mode = VkButton.Mode.Primary;
                int i5 = a.$EnumSwitchMapping$3[actionButtonStyle.ordinal()];
                if (i5 == 1) {
                    appearance = VkButton.Appearance.Overlay;
                } else if (i5 == 2) {
                    appearance = VkButton.Appearance.Accent;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appearance = VkButton.Appearance.Neutral;
                }
                t65.setBottomAction(new xtu0(f, tbe0Var, z, gkoVar2, size, mode, appearance, new tlo0.h(charSequence)));
                VkButton vkButton = (VkButton) t6().findViewById(R.id.carousel_card_bottom_action_button);
                if (actionState == RecommendationsCarouselItemUiDto.ActionButtonData.ActionState.COMPLETED && (this.v.invoke() instanceof idf0)) {
                    vkButton.setTextTint(R.attr.vk_ui_text_secondary);
                } else {
                    vkButton.setTextColorful(true);
                }
                v6(sni.f);
            }
        }
        t6().setBottomAction(null);
        v6(sni.f);
    }

    @Override // xsna.gtl0
    public final void q6(gzs<Integer> gzsVar) {
        this.u = gzsVar;
    }

    @Override // xsna.gtl0
    public final void s6(gzs<? extends vif0<?>> gzsVar) {
        this.v = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cuu0 t6() {
        return (cuu0) this.s.getValue();
    }

    public final void v6(kbf0 kbf0Var) {
        this.n.a(kbf0Var, this.v.invoke(), this.u.invoke().intValue());
    }

    public pbf0(ViewGroup viewGroup, lbf0 lbf0Var, ActionButtonStyle actionButtonStyle, RecommendationsItemBadgeStyle recommendationsItemBadgeStyle, RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle, RecommendationsItemImageStyle recommendationsItemImageStyle, RecommendationsItemSizeStyle recommendationsItemSizeStyle) {
        super(new cuu0(viewGroup.getContext()), viewGroup);
        cuu0.a dVar;
        this.n = lbf0Var;
        this.o = actionButtonStyle;
        this.p = recommendationsItemBadgeStyle;
        this.q = recommendationsItemBackgroundStyle;
        this.r = recommendationsItemSizeStyle;
        q010 q010Var = new q010(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, q010Var);
        Lazy a2 = msy.a(lazyThreadSafetyMode, qbf0.b);
        this.t = a2;
        this.u = new g880(this, 15);
        this.v = new m960(this, 21);
        int i = 0;
        boolean z = recommendationsItemImageStyle == RecommendationsItemImageStyle.SQUARE;
        int i2 = a.$EnumSwitchMapping$0[recommendationsItemSizeStyle.ordinal()];
        if (i2 == 1) {
            dVar = new cuu0.a.d(z);
        } else if (i2 == 2) {
            dVar = new cuu0.a.c(z);
        } else if (i2 == 3) {
            dVar = new cuu0.a.b(z);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Size a3 = dVar.a(this.itemView.getContext());
        ((bik) a2.getValue()).f(a3.getWidth(), a3.getHeight());
        t6().setMediaSize(dVar);
        t6().setCardDecorator(new rbf0(this));
        cuu0 t6 = t6();
        int i3 = a.$EnumSwitchMapping$1[recommendationsItemBackgroundStyle.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = R.drawable.recommendations_carousel_outlined_item_bg;
            } else if (i3 == 3) {
                this.itemView.getContext();
                i = R.drawable.recommendations_carousel_gray_item_bg;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        t6.setBackgroundResource(i);
        bwt0.i0(t6(), new n3b0(this, 8));
    }
}
