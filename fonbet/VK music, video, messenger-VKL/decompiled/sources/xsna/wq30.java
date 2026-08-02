package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftSticker;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.span.SpanPressableTextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.stickers.views.particles.ParticleView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hzp0;

/* compiled from: MsgPartGiftHolder.kt */
/* loaded from: classes2.dex */
public final class wq30 extends hr30<AttachWithId, br30> {
    public static final /* synthetic */ int y = 0;
    public Context d;
    public View e;
    public VKEnhancedImageView f;
    public CardView g;
    public VKImageView h;
    public ImageView i;
    public VKImageView j;
    public ParticleView k;
    public AnimatedGiftView l;
    public TextView m;
    public SpanPressableTextView n;
    public VkSimpleButton o;
    public VkSimpleButton p;
    public TimeAndStatusView q;
    public ImageView r;
    public VKImageView s;
    public br30 t;
    public pk30 u;
    public CharSequence v;
    public final ybq w = new ybq(this, 3);
    public final v5t x = new v5t(R.layout.vkim_msg_part_gift);

    /* compiled from: MsgPartGiftHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftRarity.Type.values().length];
            try {
                iArr[GiftRarity.Type.UNCOMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftRarity.Type.RARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftRarity.Type.LEGENDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftRarity.Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TimeAndStatusView timeAndStatusView = this.q;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0627  */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v33, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v42, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v54, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v64, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v69, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v81, types: [xsna.zjt] */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [com.vk.im.ui.views.msg.TimeAndStatusView] */
    /* JADX WARN: Type inference failed for: r9v33 */
    @Override // xsna.hr30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(br30 br30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        GiftBackground a2;
        int i;
        int i2;
        VkSimpleButton vkSimpleButton;
        Pair pair;
        Integer num;
        GiftVotesAttachment giftVotesAttachment;
        ImageSize Cb;
        String str;
        Image image;
        String str2;
        List<GiftBackground> list;
        br30 br30Var2 = br30Var;
        int i3 = br30Var2.d;
        long j = br30Var2.g;
        CharSequence charSequence = br30Var2.c;
        this.u = pk30Var;
        this.t = br30Var2;
        VKEnhancedImageView vKEnhancedImageView = this.f;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.clear();
        VKEnhancedImageView vKEnhancedImageView2 = this.f;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setOnLoadCallback(null);
        CardView cardView = this.g;
        if (cardView == null) {
            cardView = null;
        }
        cardView.setCardBackgroundColor(0);
        CardView cardView2 = this.g;
        if (cardView2 == null) {
            cardView2 = null;
        }
        cardView2.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        f4m.j(vKImageView);
        ImageView imageView = this.i;
        if (imageView == null) {
            imageView = null;
        }
        f4m.j(imageView);
        VKImageView vKImageView2 = this.j;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        f4m.j(vKImageView2);
        ParticleView particleView = this.k;
        if (particleView == null) {
            particleView = null;
        }
        f4m.j(particleView);
        AnimatedGiftView animatedGiftView = this.l;
        if (animatedGiftView == null) {
            animatedGiftView = null;
        }
        f4m.j(animatedGiftView);
        SpanPressableTextView spanPressableTextView = this.n;
        if (spanPressableTextView == null) {
            spanPressableTextView = null;
        }
        f4m.j(spanPressableTextView);
        VkSimpleButton vkSimpleButton2 = this.p;
        if (vkSimpleButton2 == null) {
            vkSimpleButton2 = null;
        }
        f4m.j(vkSimpleButton2);
        ImageView imageView2 = this.r;
        if (imageView2 == null) {
            imageView2 = null;
        }
        f4m.j(imageView2);
        VKImageView vKImageView3 = this.s;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        f4m.j(vKImageView3);
        Context context = this.d;
        if (context == null) {
            context = null;
        }
        int a3 = e3m.a(R.dimen.vkim_gift_size, context);
        CardView cardView3 = this.g;
        View view = cardView3 == null ? null : cardView3;
        if (cardView3 == null) {
            cardView3 = null;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) cardView3.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) bVar).width = a3;
        ((ViewGroup.MarginLayoutParams) bVar).height = a3;
        view.setLayoutParams(bVar);
        this.v = null;
        CardView cardView4 = this.g;
        if (cardView4 == null) {
            cardView4 = null;
        }
        ybq ybqVar = this.w;
        jjc.f(ybqVar, cardView4);
        CardView cardView5 = this.g;
        if (cardView5 == null) {
            cardView5 = null;
        }
        cardView5.setOnLongClickListener(new yq30(this, br30Var2, br30Var2, br30Var2));
        AttachGift attachGift = (AttachGift) br30Var2.n;
        if (myc0.f(charSequence)) {
            SpanPressableTextView spanPressableTextView2 = this.n;
            if (spanPressableTextView2 == null) {
                spanPressableTextView2 = null;
            }
            spanPressableTextView2.setVisibility(0);
            SpanPressableTextView spanPressableTextView3 = this.n;
            if (spanPressableTextView3 == null) {
                spanPressableTextView3 = null;
            }
            spanPressableTextView3.setText(charSequence);
            SpanPressableTextView spanPressableTextView4 = this.n;
            if (spanPressableTextView4 == null) {
                spanPressableTextView4 = null;
            }
            spanPressableTextView4.setOnSpanClickListener(ub80Var);
        }
        GiftType giftType = attachGift.l;
        GiftType giftType2 = GiftType.GIFT_CARD;
        if (giftType == giftType2) {
            GiftCard giftCard = attachGift.q;
            if (giftCard == null || (list = giftCard.c) == null) {
                a2 = null;
            } else {
                Serializer.c<GiftBackground> cVar = GiftBackground.CREATOR;
                a2 = GiftBackground.a.a(list, dhr0.M());
            }
        } else {
            boolean M = dhr0.M();
            Serializer.c<GiftBackground> cVar2 = GiftBackground.CREATOR;
            a2 = GiftBackground.a.a(attachGift.k, M);
        }
        CardView cardView6 = this.g;
        if (cardView6 == null) {
            cardView6 = null;
        }
        cardView6.setCardBackgroundColor((a2 == null || (str2 = a2.b) == null) ? 0 : Color.parseColor(str2));
        Context context2 = this.d;
        if (context2 == null) {
            context2 = null;
        }
        int a4 = e3m.a(attachGift.g() ? R.dimen.vkim_limited_gift_margin : R.dimen.vkim_gift_margin, context2);
        AnimatedGiftView animatedGiftView2 = this.l;
        if (animatedGiftView2 == null) {
            animatedGiftView2 = null;
        }
        bwt0.e0(animatedGiftView2, a4, a4, a4, a4);
        VKEnhancedImageView vKEnhancedImageView3 = this.f;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        bwt0.e0(vKEnhancedImageView3, a4, a4, a4, a4);
        if (a2 != null && (image = a2.c) != null) {
            Context context3 = this.d;
            if (context3 == null) {
                context3 = null;
            }
            ImageSize Cb2 = image.Cb(e3m.a(R.dimen.vkim_gift_size, context3), true, false);
            String str3 = Cb2 != null ? Cb2.d.d : null;
            VKImageView vKImageView4 = this.j;
            if (vKImageView4 == null) {
                vKImageView4 = null;
            }
            vKImageView4.setVisibility(0);
            VKImageView vKImageView5 = this.j;
            if (vKImageView5 == null) {
                vKImageView5 = null;
            }
            vKImageView5.load(str3);
        }
        VKEnhancedImageView vKEnhancedImageView4 = this.f;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        vKEnhancedImageView4.setVisibility(0);
        VKEnhancedImageView vKEnhancedImageView5 = this.f;
        if (vKEnhancedImageView5 == null) {
            vKEnhancedImageView5 = null;
        }
        vKEnhancedImageView5.setIgnoreTrafficSaverPredicate(new vg0(23));
        if (attachGift.g()) {
            ParticleView particleView2 = this.k;
            if (particleView2 == null) {
                particleView2 = null;
            }
            particleView2.setAnimationType(new haq(new ml90(new tye0(524024), new ll90(523902), new iaq(4), 24)));
            VKEnhancedImageView vKEnhancedImageView6 = this.f;
            if (vKEnhancedImageView6 == null) {
                vKEnhancedImageView6 = null;
            }
            if (vKEnhancedImageView6.isImageLoaded()) {
                x(attachGift);
            } else {
                VKEnhancedImageView vKEnhancedImageView7 = this.f;
                if (vKEnhancedImageView7 == null) {
                    vKEnhancedImageView7 = null;
                }
                vKEnhancedImageView7.setOnLoadCallback(new xq30(this, attachGift));
            }
        }
        VKEnhancedImageView vKEnhancedImageView8 = this.f;
        if (vKEnhancedImageView8 == null) {
            vKEnhancedImageView8 = null;
        }
        vKEnhancedImageView8.setRemoteImage(attachGift.f);
        GiftAnimation giftAnimation = attachGift.j;
        if (giftAnimation == null || !giftAnimation.V0()) {
            AnimatedGiftView animatedGiftView3 = this.l;
            if (animatedGiftView3 == null) {
                animatedGiftView3 = null;
            }
            f4m.j(animatedGiftView3);
        } else {
            AnimatedGiftView animatedGiftView4 = this.l;
            if (animatedGiftView4 == null) {
                animatedGiftView4 = null;
            }
            animatedGiftView4.setVisibility(0);
            AnimatedGiftView animatedGiftView5 = this.l;
            if (animatedGiftView5 == null) {
                animatedGiftView5 = null;
            }
            AnimatedGiftView.b(animatedGiftView5, attachGift.j, false, new dy0(18, this, attachGift), 2);
        }
        int i4 = 3;
        if (!attachGift.g()) {
            CardView cardView7 = this.g;
            if (cardView7 == null) {
                cardView7 = null;
            }
            jjc.g(cardView7, new ftm(attachGift, this, br30Var2, 3));
        }
        VkSimpleButton vkSimpleButton3 = this.p;
        if (vkSimpleButton3 == null) {
            vkSimpleButton3 = null;
        }
        jjc.g(vkSimpleButton3, new uf1(26, this, attachGift));
        boolean z = br30Var2.f;
        User user = br30Var2.e;
        Serializer.c<Peer> cVar3 = Peer.CREATOR;
        boolean z2 = Peer.a.f(j) == Peer.Type.USER && user != null && (user.ka() || user.i || user.j);
        boolean z3 = !z2;
        GiftType giftType3 = attachGift.l;
        boolean z4 = giftType3 == giftType2;
        long j2 = attachGift.b;
        if (z4) {
            TextView textView = this.m;
            if (textView == null) {
                textView = null;
            }
            his0.v(textView, R.drawable.vk_icon_gift_16, 0);
            TextView textView2 = this.m;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(R.string.vkim_msg_list_gift_certificate_title);
            VkSimpleButton vkSimpleButton4 = this.o;
            if (vkSimpleButton4 == null) {
                vkSimpleButton4 = null;
            }
            vkSimpleButton4.setText(R.string.vkim_msg_list_gift_certificate_button);
            VkSimpleButton vkSimpleButton5 = this.o;
            if (vkSimpleButton5 == null) {
                vkSimpleButton5 = null;
            }
            jjc.g(vkSimpleButton5, new xxh(this, br30Var2, attachGift, i4));
            if (z) {
                w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
            } else {
                w(attachGift, z3, R.string.vkim_msg_list_gift_stickers_button_reply_more);
            }
        } else {
            if (giftType3 != GiftType.IMAGE_STATUS && giftType3 != GiftType.IMAGE_STATUS_PACK) {
                if (j2 == 10101) {
                    TextView textView3 = this.m;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    TextView textView4 = this.m;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    textView4.setText(R.string.vkim_msg_list_gift_random_pack);
                    if (z) {
                        VkSimpleButton vkSimpleButton6 = this.o;
                        if (vkSimpleButton6 == null) {
                            vkSimpleButton6 = null;
                        }
                        vkSimpleButton6.setText(R.string.vkim_msg_list_gift_random_pack_open_roulette);
                        VkSimpleButton vkSimpleButton7 = this.o;
                        if (vkSimpleButton7 == null) {
                            vkSimpleButton7 = null;
                        }
                        i = 17;
                        jjc.g(vkSimpleButton7, new rm0(17, this, attachGift));
                        w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
                    } else {
                        i = 17;
                        u(attachGift, z3);
                    }
                } else {
                    i = 17;
                    if (!attachGift.e()) {
                        if (attachGift.g()) {
                            GiftRarity giftRarity = attachGift.g;
                            if (giftRarity != null) {
                                int i5 = a.$EnumSwitchMapping$0[giftRarity.c.ordinal()];
                                if (i5 == 1) {
                                    pair = new Pair(Integer.valueOf(R.drawable.vk_icon_sparkle_16), Integer.valueOf(R.attr.vk_ui_accent_green));
                                } else if (i5 == 2) {
                                    pair = new Pair(Integer.valueOf(R.drawable.vk_icon_diamond_16), Integer.valueOf(R.attr.vk_ui_accent_purple));
                                } else if (i5 == 3) {
                                    pair = new Pair(Integer.valueOf(R.drawable.vk_icon_crown_16), Integer.valueOf(R.attr.vk_ui_accent_raspberry_pink));
                                } else {
                                    if (i5 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pair = new Pair(Integer.valueOf(R.drawable.vk_icon_gift_16), null);
                                }
                                int intValue = ((Number) pair.d()).intValue();
                                Integer num2 = (Integer) pair.g();
                                TextView textView5 = this.m;
                                if (textView5 == null) {
                                    textView5 = null;
                                }
                                textView5.setText(giftRarity.b);
                                TextView textView6 = this.m;
                                if (textView6 == null) {
                                    textView6 = null;
                                }
                                his0.v(textView6, intValue, 0);
                                VKImageView vKImageView6 = this.h;
                                if (vKImageView6 == null) {
                                    vKImageView6 = null;
                                }
                                Drawable background = vKImageView6.getBackground();
                                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                                String str4 = giftRarity.h;
                                if (str4 != null) {
                                    num = Integer.valueOf(Color.parseColor(str4));
                                } else if (num2 != null) {
                                    int intValue2 = num2.intValue();
                                    Context context4 = this.d;
                                    if (context4 == null) {
                                        context4 = null;
                                    }
                                    num = Integer.valueOf(krv0.m(intValue2, context4));
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    VKImageView vKImageView7 = this.h;
                                    if (vKImageView7 == null) {
                                        vKImageView7 = null;
                                    }
                                    vKImageView7.setVisibility(0);
                                    VKImageView vKImageView8 = this.h;
                                    if (vKImageView8 == null) {
                                        vKImageView8 = null;
                                    }
                                    vKImageView8.setImageResource(intValue);
                                    if (gradientDrawable != null) {
                                        gradientDrawable.setColor(num.intValue());
                                    }
                                }
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                if (z) {
                                    VkSimpleButton vkSimpleButton8 = this.o;
                                    if (vkSimpleButton8 == null) {
                                        vkSimpleButton8 = null;
                                    }
                                    vkSimpleButton8.setText(R.string.vkim_msg_list_gift_simple_button_my);
                                    VkSimpleButton vkSimpleButton9 = this.o;
                                    if (vkSimpleButton9 == null) {
                                        vkSimpleButton9 = null;
                                    }
                                    jjc.f(ybqVar, vkSimpleButton9);
                                    w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
                                    ref$ObjectRef.element = Boolean.FALSE;
                                } else {
                                    ref$ObjectRef.element = Boolean.TRUE;
                                    u(attachGift, z3);
                                }
                                CardView cardView8 = this.g;
                                CardView cardView9 = cardView8 == null ? null : cardView8;
                                i2 = 17;
                                wa waVar = new wa(br30Var2, ref$ObjectRef, this, attachGift, 4);
                                attachGift = attachGift;
                                jjc.g(cardView9, waVar);
                                ImageView imageView3 = this.i;
                                if (imageView3 == null) {
                                    imageView3 = null;
                                }
                                imageView3.setVisibility(0);
                                if (z) {
                                    int i6 = 1;
                                    new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.GIFT, Collections.singletonList(Integer.valueOf((int) j2)), i6, CommonVasStat$TypeIvasItemViews.BlockType.SEND_ELEMENT, null, null, null, i6, Long.valueOf(j), null, null, null, 3696, null)).a();
                                }
                            }
                        } else {
                            i2 = 17;
                            if (attachGift.f() || attachGift.d()) {
                                if (attachGift.d()) {
                                    TextView textView7 = this.m;
                                    if (textView7 == null) {
                                        textView7 = null;
                                    }
                                    vkSimpleButton = null;
                                    textView7.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                    TextView textView8 = this.m;
                                    if (textView8 == null) {
                                        textView8 = null;
                                    }
                                    textView8.setText(R.string.vkim_msg_list_gift_simple_title_any_animated_sticker);
                                } else {
                                    vkSimpleButton = null;
                                    TextView textView9 = this.m;
                                    if (textView9 == null) {
                                        textView9 = null;
                                    }
                                    his0.v(textView9, R.drawable.vk_icon_gift_16, 0);
                                    TextView textView10 = this.m;
                                    if (textView10 == null) {
                                        textView10 = null;
                                    }
                                    textView10.setText(R.string.vkim_msg_list_gift_simple_title_any_sticker);
                                }
                                if (z) {
                                    VkSimpleButton vkSimpleButton10 = this.o;
                                    if (vkSimpleButton10 == null) {
                                        vkSimpleButton10 = vkSimpleButton;
                                    }
                                    vkSimpleButton10.setText(R.string.vkim_msg_list_gift_simple_button_choose);
                                    VkSimpleButton vkSimpleButton11 = this.o;
                                    if (vkSimpleButton11 == null) {
                                        vkSimpleButton11 = vkSimpleButton;
                                    }
                                    jjc.g(vkSimpleButton11, new com.vk.im.engine.commands.messages.a(28, this, attachGift));
                                    w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
                                } else {
                                    u(attachGift, z3);
                                }
                                if (i3 > 0) {
                                    VkSimpleButton vkSimpleButton12 = this.o;
                                    if (vkSimpleButton12 == null) {
                                        vkSimpleButton12 = vkSimpleButton;
                                    }
                                    vkSimpleButton12.setText(R.string.vkim_msg_list_gift_stickers_button_reply);
                                    VkSimpleButton vkSimpleButton13 = this.o;
                                    if (vkSimpleButton13 == null) {
                                        vkSimpleButton13 = vkSimpleButton;
                                    }
                                    jjc.g(vkSimpleButton13, new du0(i2, this, attachGift));
                                    VkSimpleButton vkSimpleButton14 = this.p;
                                    if (vkSimpleButton14 == null) {
                                        vkSimpleButton14 = vkSimpleButton;
                                    }
                                    f4m.j(vkSimpleButton14);
                                }
                                giftVotesAttachment = attachGift.r;
                                if (giftVotesAttachment != null) {
                                    View view2 = this.r;
                                    if (view2 == null) {
                                        view2 = vkSimpleButton;
                                    }
                                    f4m.j(view2);
                                    View view3 = this.s;
                                    if (view3 == null) {
                                        view3 = vkSimpleButton;
                                    }
                                    f4m.j(view3);
                                } else {
                                    View view4 = this.r;
                                    if (view4 == null) {
                                        view4 = vkSimpleButton;
                                    }
                                    view4.setVisibility(0);
                                    View view5 = this.s;
                                    if (view5 == null) {
                                        view5 = vkSimpleButton;
                                    }
                                    view5.setVisibility(0);
                                    boolean z5 = i3 > 0;
                                    Context context5 = this.d;
                                    ?? r4 = context5;
                                    if (context5 == null) {
                                        r4 = vkSimpleButton;
                                    }
                                    int a5 = e3m.a(z5 ? R.dimen.vkim_gift_size_with_votes_reply : R.dimen.vkim_gift_size_with_votes, r4);
                                    View view6 = this.g;
                                    View view7 = view6 == null ? vkSimpleButton : view6;
                                    if (view6 == null) {
                                        view6 = vkSimpleButton;
                                    }
                                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) view6.getLayoutParams();
                                    ((ViewGroup.MarginLayoutParams) bVar2).width = a5;
                                    ((ViewGroup.MarginLayoutParams) bVar2).height = a5;
                                    view7.setLayoutParams(bVar2);
                                    View view8 = this.s;
                                    View view9 = view8 == null ? vkSimpleButton : view8;
                                    if (view8 == null) {
                                        view8 = vkSimpleButton;
                                    }
                                    ConstraintLayout.b bVar3 = (ConstraintLayout.b) view8.getLayoutParams();
                                    ((ViewGroup.MarginLayoutParams) bVar3).width = a5;
                                    ((ViewGroup.MarginLayoutParams) bVar3).height = a5;
                                    view9.setLayoutParams(bVar3);
                                    Context context6 = this.d;
                                    ?? r42 = context6;
                                    if (context6 == null) {
                                        r42 = vkSimpleButton;
                                    }
                                    int a6 = e3m.a(R.dimen.vkim_gift_size_with_votes, r42);
                                    Image image2 = giftVotesAttachment.c;
                                    if (image2 != null && (Cb = image2.Cb(a6, true, false)) != null && (str = Cb.d.d) != null) {
                                        VKImageView vKImageView9 = this.s;
                                        ?? r43 = vKImageView9;
                                        if (vKImageView9 == null) {
                                            r43 = vkSimpleButton;
                                        }
                                        r43.load(str);
                                    }
                                    TextView textView11 = this.m;
                                    if (textView11 == null) {
                                        textView11 = vkSimpleButton;
                                    }
                                    this.v = textView11.getText();
                                    Context context7 = this.d;
                                    ?? r44 = context7;
                                    if (context7 == null) {
                                        r44 = vkSimpleButton;
                                    }
                                    Resources resources = r44.getResources();
                                    int i7 = giftVotesAttachment.b;
                                    String quantityString = resources.getQuantityString(R.plurals.vkim_msg_list_gift_votes, i7, Integer.valueOf(i7));
                                    TextView textView12 = this.m;
                                    if (textView12 == null) {
                                        textView12 = vkSimpleButton;
                                    }
                                    textView12.setText(((Object) this.v) + " · " + quantityString);
                                    View view10 = this.s;
                                    if (view10 == null) {
                                        view10 = vkSimpleButton;
                                    }
                                    view10.setOnClickListener(new tkc(this, 4));
                                }
                                jr30 jr30Var = br30Var2.b;
                                TimeAndStatusView timeAndStatusView = this.q;
                                hr30.l(timeAndStatusView != null ? vkSimpleButton : timeAndStatusView, jr30Var, false);
                            }
                            TextView textView13 = this.m;
                            if (textView13 == null) {
                                textView13 = null;
                            }
                            his0.v(textView13, R.drawable.vk_icon_gift_16, 0);
                            TextView textView14 = this.m;
                            if (textView14 == null) {
                                textView14 = null;
                            }
                            textView14.setText(R.string.vkim_msg_list_gift_simple_title);
                            if (z) {
                                VkSimpleButton vkSimpleButton15 = this.o;
                                if (vkSimpleButton15 == null) {
                                    vkSimpleButton15 = null;
                                }
                                vkSimpleButton15.setText(R.string.vkim_msg_list_gift_simple_button_my);
                                VkSimpleButton vkSimpleButton16 = this.o;
                                if (vkSimpleButton16 == null) {
                                    vkSimpleButton16 = null;
                                }
                                jjc.f(ybqVar, vkSimpleButton16);
                                w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
                            } else {
                                u(attachGift, z3);
                            }
                        }
                        vkSimpleButton = null;
                        if (i3 > 0) {
                        }
                        giftVotesAttachment = attachGift.r;
                        if (giftVotesAttachment != null) {
                        }
                        jr30 jr30Var2 = br30Var2.b;
                        TimeAndStatusView timeAndStatusView2 = this.q;
                        hr30.l(timeAndStatusView2 != null ? vkSimpleButton : timeAndStatusView2, jr30Var2, false);
                    }
                    GiftSticker giftSticker = attachGift.h;
                    if (giftSticker == null || !giftSticker.c) {
                        TextView textView15 = this.m;
                        if (textView15 == null) {
                            textView15 = null;
                        }
                        textView15.setText(R.string.vkim_msg_list_gift_stickers_title);
                        TextView textView16 = this.m;
                        if (textView16 == null) {
                            textView16 = null;
                        }
                        his0.v(textView16, R.drawable.vk_icon_gift_16, 0);
                    } else {
                        TextView textView17 = this.m;
                        if (textView17 == null) {
                            textView17 = null;
                        }
                        textView17.setText(R.string.vkim_msg_list_gift_stickers_style_title);
                        TextView textView18 = this.m;
                        if (textView18 == null) {
                            textView18 = null;
                        }
                        his0.v(textView18, R.drawable.vk_icon_sticker_smile_outline_16, 0);
                    }
                    VkSimpleButton vkSimpleButton17 = this.o;
                    if (vkSimpleButton17 == null) {
                        vkSimpleButton17 = null;
                    }
                    vkSimpleButton17.setText(R.string.vkim_msg_list_market_button);
                    VkSimpleButton vkSimpleButton18 = this.o;
                    if (vkSimpleButton18 == null) {
                        vkSimpleButton18 = null;
                    }
                    jjc.g(vkSimpleButton18, new zq30(this, br30Var2, br30Var2, br30Var2));
                    VkSimpleButton vkSimpleButton19 = this.o;
                    if (vkSimpleButton19 == null) {
                        vkSimpleButton19 = null;
                    }
                    vkSimpleButton19.setOnLongClickListener(new ar30(this, br30Var2, br30Var2, br30Var2));
                    if (!z2) {
                        VkSimpleButton vkSimpleButton20 = this.p;
                        if (vkSimpleButton20 == null) {
                            vkSimpleButton20 = null;
                        }
                        vkSimpleButton20.setVisibility(0);
                        if (z) {
                            VkSimpleButton vkSimpleButton21 = this.p;
                            if (vkSimpleButton21 == null) {
                                vkSimpleButton21 = null;
                            }
                            vkSimpleButton21.setText(R.string.vkim_msg_list_gift_random_pack_reply);
                        } else {
                            VkSimpleButton vkSimpleButton22 = this.p;
                            if (vkSimpleButton22 == null) {
                                vkSimpleButton22 = null;
                            }
                            vkSimpleButton22.setText(R.string.vkim_msg_list_gift_stickers_button_reply_more);
                        }
                        VkSimpleButton vkSimpleButton23 = this.p;
                        if (vkSimpleButton23 == null) {
                            vkSimpleButton23 = null;
                        }
                        jjc.g(vkSimpleButton23, new sf4(12, this, attachGift));
                    }
                }
                i2 = i;
                vkSimpleButton = null;
                if (i3 > 0) {
                }
                giftVotesAttachment = attachGift.r;
                if (giftVotesAttachment != null) {
                }
                jr30 jr30Var22 = br30Var2.b;
                TimeAndStatusView timeAndStatusView22 = this.q;
                hr30.l(timeAndStatusView22 != null ? vkSimpleButton : timeAndStatusView22, jr30Var22, false);
            }
            TextView textView19 = this.m;
            if (textView19 == null) {
                textView19 = null;
            }
            his0.v(textView19, R.drawable.vk_icon_smile_16, 0);
            boolean z6 = attachGift.l == GiftType.IMAGE_STATUS_PACK;
            int i8 = z6 ? R.string.vkim_msg_list_gift_image_status_pack_title : R.string.vkim_msg_list_gift_image_status_title;
            TextView textView20 = this.m;
            if (textView20 == null) {
                textView20 = null;
            }
            textView20.setText(i8);
            if (z) {
                VkSimpleButton vkSimpleButton24 = this.o;
                if (vkSimpleButton24 == null) {
                    vkSimpleButton24 = null;
                }
                vkSimpleButton24.setText(z6 ? R.string.vkim_msg_list_gift_image_status_button : R.string.vkim_msg_list_gift_image_status_button_open);
                VkSimpleButton vkSimpleButton25 = this.o;
                if (vkSimpleButton25 == null) {
                    vkSimpleButton25 = null;
                }
                jjc.g(vkSimpleButton25, new g86(13, this, attachGift));
                w(attachGift, z3, R.string.vkim_msg_list_gift_random_pack_reply);
            } else {
                VkSimpleButton vkSimpleButton26 = this.o;
                if (vkSimpleButton26 == null) {
                    vkSimpleButton26 = null;
                }
                vkSimpleButton26.setText(R.string.vkim_msg_list_gift_image_status_button_catalog);
                VkSimpleButton vkSimpleButton27 = this.o;
                if (vkSimpleButton27 == null) {
                    vkSimpleButton27 = null;
                }
                jjc.g(vkSimpleButton27, new c2u(this, 16));
                w(attachGift, z3, R.string.vkim_msg_list_gift_stickers_button_reply_more);
            }
        }
        vkSimpleButton = null;
        i2 = 17;
        if (i3 > 0) {
        }
        giftVotesAttachment = attachGift.r;
        if (giftVotesAttachment != null) {
        }
        jr30 jr30Var222 = br30Var2.b;
        TimeAndStatusView timeAndStatusView222 = this.q;
        hr30.l(timeAndStatusView222 != null ? vkSimpleButton : timeAndStatusView222, jr30Var222, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        View c = this.x.c(layoutInflater, viewGroup);
        this.e = c;
        this.f = (VKEnhancedImageView) c.findViewById(R.id.gift_image);
        this.g = (CardView) c.findViewById(R.id.gift_card_view);
        this.i = (ImageView) c.findViewById(R.id.glass_image_view);
        this.j = (VKImageView) c.findViewById(R.id.background_image_view);
        this.k = (ParticleView) c.findViewById(R.id.background_animation_view);
        this.h = (VKImageView) c.findViewById(R.id.gift_badge);
        this.l = (AnimatedGiftView) c.findViewById(R.id.animated_gift);
        this.m = (TextView) c.findViewById(R.id.gift_title);
        this.n = (SpanPressableTextView) c.findViewById(R.id.gift_description);
        this.o = (VkSimpleButton) c.findViewById(R.id.gift_first_button);
        this.p = (VkSimpleButton) c.findViewById(R.id.gift_second_button);
        this.q = (TimeAndStatusView) c.findViewById(R.id.time_and_status);
        this.r = (ImageView) c.findViewById(R.id.votes_plus_icon);
        this.s = (VKImageView) c.findViewById(R.id.votes_image);
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        VKEnhancedImageView vKEnhancedImageView = this.f;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setOnLoadCallback(null);
        VKImageView vKImageView = this.s;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.clear();
        this.u = null;
        this.t = null;
    }

    public final void s(br30 br30Var, AttachGift attachGift) {
        int i = br30Var.d;
        long j = br30Var.h;
        Long valueOf = i > 0 ? null : br30Var.f ? Long.valueOf(j) : Long.valueOf(br30Var.g);
        if (valueOf != null) {
            j = valueOf.longValue();
        }
        long j2 = j;
        String str = attachGift.o;
        if (str == null) {
            t(br30Var);
            return;
        }
        zal0 a2 = g2v.d().a();
        Context context = this.d;
        a2.x(context == null ? null : context, str, "gift_snippet", j2);
    }

    public final void t(br30 br30Var) {
        User user;
        boolean z = br30Var.f;
        long j = z ? br30Var.h : br30Var.g;
        String str = (z || (user = br30Var.e) == null) ? null : user.s;
        UserProfile userProfile = new UserProfile();
        userProfile.c = new UserId(j);
        zal0 a2 = g2v.d().a();
        Context context = this.d;
        a2.f(context != null ? context : null, userProfile, str);
    }

    public final void u(AttachGift attachGift, boolean z) {
        if (z) {
            VkSimpleButton vkSimpleButton = this.o;
            if (vkSimpleButton == null) {
                vkSimpleButton = null;
            }
            vkSimpleButton.setText(R.string.vkim_msg_list_gift_stickers_button_reply_more);
            VkSimpleButton vkSimpleButton2 = this.o;
            jjc.g(vkSimpleButton2 != null ? vkSimpleButton2 : null, new hl1(21, this, attachGift));
        }
    }

    public final void w(AttachGift attachGift, boolean z, int i) {
        if (z) {
            VkSimpleButton vkSimpleButton = this.p;
            if (vkSimpleButton == null) {
                vkSimpleButton = null;
            }
            vkSimpleButton.setVisibility(0);
            VkSimpleButton vkSimpleButton2 = this.p;
            if (vkSimpleButton2 == null) {
                vkSimpleButton2 = null;
            }
            vkSimpleButton2.setText(i);
            VkSimpleButton vkSimpleButton3 = this.p;
            jjc.g(vkSimpleButton3 != null ? vkSimpleButton3 : null, new o43(29, this, attachGift));
        }
    }

    public final void x(AttachGift attachGift) {
        if (attachGift.g()) {
            ParticleView particleView = this.k;
            if (particleView == null) {
                particleView = null;
            }
            particleView.setVisibility(0);
            ParticleView particleView2 = this.k;
            ParticleView particleView3 = particleView2 != null ? particleView2 : null;
            particleView3.m = false;
            particleView3.w.cancel();
            particleView3.removeCallbacks(particleView3.t);
            particleView3.i();
        }
    }
}
