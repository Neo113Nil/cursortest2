package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.gift.Gift;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.gifts.GiftModalButtonType;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.stickers.views.particles.ParticleView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import xsna.dw20;
import xsna.hzp0;

/* compiled from: LimitedGiftModalPage.kt */
/* loaded from: classes6.dex */
public final class m7z implements fcn {
    public static final int c = iah0.a(8);
    public static final int d = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
    public dw20 b;

    /* compiled from: LimitedGiftModalPage.kt */
    public static final class a {

        /* compiled from: LimitedGiftModalPage.kt */
        /* renamed from: xsna.m7z$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3326a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GiftModalButtonType.values().length];
                try {
                    iArr[GiftModalButtonType.SEND_MORE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GiftModalButtonType.SEND_IN_RETURN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static void a(Context context, Gift gift, jzt jztVar) {
            GiftRarity giftRarity = gift.l;
            if (giftRarity == null) {
                return;
            }
            boolean M = dhr0.M();
            String str = giftRarity.b;
            GiftRarity.Type type = giftRarity.c;
            Integer num = giftRarity.d;
            Integer num2 = giftRarity.e;
            Integer num3 = giftRarity.f;
            Integer num4 = giftRarity.g;
            int i = m7z.d;
            String str2 = i < 48 ? gift.d : i < 96 ? gift.e : gift.f;
            GiftBackground a = giftRarity.a(M);
            b(context, new n7z(str, type, num, num2, num3, num4, str2, gift, a != null ? a.c : null), jztVar);
        }

        public static void b(Context context, n7z n7zVar, final jzt jztVar) {
            m7z m7zVar = new m7z();
            View inflate = LayoutInflater.from(context).inflate(R.layout.limited_gift_modal_page, (ViewGroup) null);
            inflate.setClipToOutline(true);
            inflate.setOutlineProvider(new t0w0(4, iah0.b(12.0f), true, false));
            VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
            vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
            vkTopBar.setInitialMode(com.vk.core.view.components.topbar.d.a);
            GiftRarity.Type type = n7zVar.b;
            int i = type == null ? -1 : o7z.$EnumSwitchMapping$0[type.ordinal()];
            Integer valueOf = i != 1 ? i != 2 ? i != 3 ? null : Integer.valueOf(R.drawable.vk_icon_crown_16) : Integer.valueOf(R.drawable.vk_icon_diamond_16) : Integer.valueOf(R.drawable.vk_icon_sparkle_16);
            if (valueOf != null) {
                ((VkImage) inflate.findViewById(R.id.gift_rarity_icon)).setImageResource(valueOf.intValue());
            }
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, n7zVar.a), null, null, null, null, 30), null, null, null, 14));
            TextView textView = (TextView) inflate.findViewById(R.id.limited_gift_amount);
            Integer num = n7zVar.c;
            Integer num2 = n7zVar.e;
            if (num != null) {
                textView.setText(xpm0.a(num.intValue()));
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.limited_gift_number);
            Integer num3 = n7zVar.f;
            if (num3 != null) {
                textView2.setText(NumberFormat.getInstance().format(Integer.valueOf(num3.intValue())));
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.limited_gift_year);
            if (num2 != null) {
                textView3.setText(num2.toString());
            }
            final k7z k7zVar = new k7z(m7zVar, 0);
            VkButton vkButton = (VkButton) inflate.findViewById(R.id.btn_gift_more);
            int i2 = C3326a.$EnumSwitchMapping$0[jztVar.a.ordinal()];
            vkButton.setText(i2 != 1 ? i2 != 2 ? R.string.limited_gift_send : R.string.limited_gift_send_in_return : R.string.limited_gift_send_more);
            vkButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.l7z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jzt.this.e.invoke();
                    k7zVar.invoke();
                }
            });
            VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.limited_gift_bg);
            Image image = n7zVar.i;
            if (image != null) {
                ImageSize Cb = image.Cb(vKImageView.getLayoutParams().width, true, false);
                vKImageView.load(Cb != null ? Cb.d.d : null);
            }
            VkImage vkImage = (VkImage) inflate.findViewById(R.id.limited_gift_image);
            String str = n7zVar.g;
            if (str != null) {
                vkImage.o0(str, null);
            }
            AnimatedGiftView animatedGiftView = (AnimatedGiftView) inflate.findViewById(R.id.animated_gift);
            zk2 zk2Var = n7zVar.h;
            if (zk2Var != null) {
                awt0.u(animatedGiftView, true);
                AnimatedGiftView.b(animatedGiftView, zk2Var, false, new gbh(vkImage, 29), 2);
            }
            ((ParticleView) inflate.findViewById(R.id.background_stars_animation)).i();
            int i3 = 1;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null);
            CommonVasStat$TypeIvasItemViews.ItemType itemType = CommonVasStat$TypeIvasItemViews.ItemType.GIFT;
            List singletonList = Collections.singletonList(Integer.valueOf(jztVar.c));
            CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.SCREEN;
            String str2 = jztVar.d;
            new hzp0.w(schemeStat$EventItem, new CommonVasStat$TypeIvasItemViews(itemType, singletonList, i3, blockType, null, null, str2 != null ? new CommonStat$TypeTrackCodeItem(str2) : null, i3, Long.valueOf(jztVar.b), null, null, null, 3632, null)).a();
            dw20.b C = new dw20.b(context, null).D0(inflate, false).C(0.4f);
            int i4 = m7z.c;
            m7zVar.b = C.o0(i4).m0(i4).n0(i4).p0(i4).I0("LimitedGiftModalPage");
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
