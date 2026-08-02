package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.gift.Gift;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfileGift;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.views.gift.GiftView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.h7u0;
import xsna.tlo0;

/* compiled from: UserProfileGiftsAdapter.kt */
/* loaded from: classes5.dex */
public final class ypq0 extends zoj0<GiftItem, b> {
    public final jnq0 e;

    /* compiled from: UserProfileGiftsAdapter.kt */
    public static final class a extends m.e<GiftItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(GiftItem giftItem, GiftItem giftItem2) {
            GiftItem giftItem3 = giftItem;
            GiftItem giftItem4 = giftItem2;
            return giftItem3.c == giftItem4.c && epx.f(giftItem3.g, giftItem4.g) && giftItem3.j == giftItem4.j;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(GiftItem giftItem, GiftItem giftItem2) {
            return giftItem.c == giftItem2.c;
        }
    }

    /* compiled from: UserProfileGiftsAdapter.kt */
    public static final class b extends vif0<GiftItem> implements PopupMenu.OnMenuItemClickListener {
        public final jnq0 n;
        public final GiftView o;
        public final TextView p;
        public final TextView q;
        public final TextView r;
        public final VkCell s;
        public final VkSimpleButton t;
        public final VkButton u;
        public final ImageView v;
        public final LinearLayout w;
        public final VKImageView x;
        public final TextView y;
        public final Drawable z;

        /* compiled from: UserProfileGiftsAdapter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GiftType.values().length];
                try {
                    iArr[GiftType.GIFT_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GiftType.IMAGE_STATUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GiftType.IMAGE_STATUS_PACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GiftType.RANDOM_STICKERS_PACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GiftType.REGULAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[GiftType.STICKERS_PACK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[GiftType.STICKERS_PACK_FOR_CHOICES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(View view, ViewGroup viewGroup, jnq0 jnq0Var) {
            super(view);
            this.n = jnq0Var;
            this.o = (GiftView) view.findViewById(R.id.gift_view);
            this.p = (TextView) view.findViewById(R.id.gift_type_title);
            this.q = (TextView) view.findViewById(R.id.gift_message_text);
            this.r = (TextView) view.findViewById(R.id.privacy_text);
            this.s = (VkCell) view.findViewById(R.id.profile_cell);
            this.t = (VkSimpleButton) view.findViewById(R.id.action_button);
            this.u = (VkButton) view.findViewById(R.id.reply_button);
            this.v = (ImageView) view.findViewById(R.id.votes_plus_icon);
            this.w = (LinearLayout) view.findViewById(R.id.votes_container);
            this.x = (VKImageView) view.findViewById(R.id.votes_image);
            this.y = (TextView) view.findViewById(R.id.votes_text);
            this.z = dhr0.w(R.drawable.user_placeholder_icon, viewGroup.getContext());
            jjc.g(this.itemView, new dso0(this, 6));
        }

        @Override // xsna.vif0
        public final void i6(GiftItem giftItem) {
            ImageSize Cb;
            String str;
            tlo0 h;
            String str2;
            GiftItem giftItem2 = giftItem;
            Gift gift = giftItem2.i;
            jnq0 jnq0Var = this.n;
            if (gift != null) {
                this.o.c(gift, jnq0Var.a, getLayoutPosition(), 2, true);
            }
            GiftVotesAttachment giftVotesAttachment = giftItem2.l;
            boolean z = true;
            ImageView imageView = this.v;
            GiftView giftView = this.o;
            LinearLayout linearLayout = this.w;
            if (giftVotesAttachment == null) {
                int a2 = e3m.a(R.dimen.gift_size, this.itemView.getContext());
                f4m.z(a2, a2, giftView);
                f4m.j(imageView);
                f4m.j(linearLayout);
            } else {
                int a3 = e3m.a(R.dimen.gift_votes_size, this.itemView.getContext());
                f4m.z(a3, a3, giftView);
                imageView.setVisibility(0);
                linearLayout.setVisibility(0);
                Image image = giftVotesAttachment.c;
                if (image != null && (Cb = image.Cb(cn70.b(92), true, false)) != null && (str = Cb.d.d) != null) {
                    this.x.load(str);
                }
                Resources resources = this.itemView.getContext().getResources();
                int i = giftVotesAttachment.b;
                this.y.setText(resources.getQuantityString(R.plurals.profile_gifts_votes, i, Integer.valueOf(i)));
                linearLayout.setOnClickListener(new ybq(this, 9));
            }
            TextView textView = this.p;
            textView.setVisibility(0);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            GiftType giftType = giftItem2.i.n;
            switch (giftType == null ? -1 : a.$EnumSwitchMapping$0[giftType.ordinal()]) {
                case 1:
                    his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                    textView.setText(R.string.profile_gifts_certificate);
                    break;
                case 2:
                    his0.v(textView, R.drawable.vk_icon_smile_16, 0);
                    textView.setText(R.string.profile_gifts_status);
                    break;
                case 3:
                    his0.v(textView, R.drawable.vk_icon_smile_16, 0);
                    textView.setText(R.string.profile_gifts_status_pack);
                    break;
                case 4:
                    his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                    textView.setText(R.string.profile_gifts_random_pack);
                    break;
                case 5:
                    GiftRarity giftRarity = giftItem2.i.l;
                    if (giftRarity == null) {
                        f4m.j(textView);
                        break;
                    } else {
                        GiftRarity.Type type = giftRarity.c;
                        int i2 = type == null ? -1 : o7z.$EnumSwitchMapping$0[type.ordinal()];
                        Integer valueOf = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Integer.valueOf(R.drawable.vk_icon_crown_16) : Integer.valueOf(R.drawable.vk_icon_diamond_16) : Integer.valueOf(R.drawable.vk_icon_sparkle_16);
                        if (valueOf != null) {
                            his0.v(textView, valueOf.intValue(), 0);
                        }
                        textView.setText(giftRarity.b);
                        break;
                    }
                case 6:
                    if (!giftItem2.i.h.booleanValue()) {
                        his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                        textView.setText(R.string.profile_gifts_stickers_title);
                        break;
                    } else {
                        his0.v(textView, R.drawable.vk_icon_sticker_smile_outline_16, 0);
                        textView.setText(R.string.profile_gifts_stickers_style);
                        break;
                    }
                case 7:
                    if (giftItem2.i.c != 10002) {
                        his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                        textView.setText(R.string.profile_gifts_any_sticker);
                        break;
                    } else {
                        textView.setText(R.string.profile_gifts_any_animated_sticker);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String str3 = giftItem2.g;
            TextView textView2 = this.q;
            if (str3 == null || str3.length() <= 0) {
                f4m.j(textView2);
            } else {
                ucp ucpVar = ucp.a;
                textView2.setText(ucp.i(xwk.d().a().m(giftItem2.g)));
                textView2.setVisibility(0);
            }
            TextView textView3 = this.r;
            f4m.j(textView3);
            if (jnq0Var.a()) {
                GiftCard giftCard = giftItem2.i.q;
                boolean z2 = giftCard != null && giftCard.d;
                Integer valueOf2 = (z2 && giftItem2.d()) ? Integer.valueOf(R.string.gifts_owner_message_naminal_privacy) : z2 ? Integer.valueOf(R.string.gifts_owner_naminal_privacy) : (giftItem2.d() && giftItem2.e()) ? Integer.valueOf(R.string.gifts_owner_message_privacy) : (!giftItem2.d() || giftItem2.e()) ? null : Integer.valueOf(R.string.gifts_owner_privacy);
                if (valueOf2 != null) {
                    textView3.setText(valueOf2.intValue());
                    textView3.setVisibility(0);
                }
            }
            GiftType giftType2 = giftItem2.i.n;
            int i3 = giftType2 != null ? a.$EnumSwitchMapping$0[giftType2.ordinal()] : -1;
            VkSimpleButton vkSimpleButton = this.t;
            if (i3 == 1) {
                vkSimpleButton.setText(R.string.profile_gifts_certificate_action);
                vkSimpleButton.setOnClickListener(new te5(9, giftItem2, this));
                vkSimpleButton.setVisibility(0);
            } else {
                f4m.j(vkSimpleButton);
            }
            boolean a4 = jnq0Var.a();
            VkButton vkButton = this.u;
            if (a4) {
                vkButton.setOnClickListener(new mmb(6, this, giftItem2));
                vkButton.setVisibility(0);
            } else {
                f4m.j(vkButton);
            }
            as5 as5Var = new as5();
            VkCell vkCell = this.s;
            vkCell.setLeftMainAvatarController(as5Var);
            VkCell.Left.a aVar = VkCell.Left.Companion;
            UserProfileGift userProfileGift = giftItem2.f;
            String a5 = js5.a(iah0.a(40), userProfileGift != null ? userProfileGift.g : null);
            String str4 = "";
            if (a5 == null) {
                a5 = "";
            }
            vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new vs5(this.z, a5), VkCell.Left.Main.Size.Small)));
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            if (giftItem2.f == null || giftItem2.e()) {
                h = tq.h(tlo0.Companion, R.string.gifts_anonymous);
            } else {
                tlo0.a aVar3 = tlo0.Companion;
                UserProfileGift userProfileGift2 = giftItem2.f;
                if (userProfileGift2 != null && (str2 = userProfileGift2.e) != null) {
                    str4 = str2;
                }
                h = oq.d(aVar3, str4);
            }
            VkCell.Middle.e eVar = new VkCell.Middle.e(h, 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            tlo0.a aVar4 = tlo0.Companion;
            int i4 = (int) giftItem2.h;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String k = pvo0.k(i4, context.getResources(), false);
            aVar4.getClass();
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, new VkCell.Middle.d(new tlo0.h(k), (gzs) null, 1, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 58), null, 12));
            VkCell.Right.d a6 = VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new iri0(this, 13), new tlo0.f(R.string.menu), 4), null, 27);
            UserProfileGift userProfileGift3 = giftItem2.f;
            if ((userProfileGift3 == null || !userProfileGift3.h0) && !jnq0Var.a()) {
                z = false;
            }
            vkCell.setRight(z ? a6 : null);
            jjc.g(vkCell, new c3k0(this, 6));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            UserProfileGift userProfileGift;
            int itemId = menuItem.getItemId();
            final GiftItem giftItem = (GiftItem) this.m;
            if (giftItem == null) {
                return false;
            }
            jnq0 jnq0Var = this.n;
            if (itemId == R.string.gifts_of_placeholder) {
                Context mo2getContext = jnq0Var.d.mo2getContext();
                if (mo2getContext == null || (userProfileGift = giftItem.f) == null) {
                    return true;
                }
                g2v.d().a().f(mo2getContext, userProfileGift, userProfileGift.n());
                return true;
            }
            if (itemId != R.string.delete) {
                return true;
            }
            final inq0 inq0Var = jnq0Var.c;
            Context mo2getContext2 = inq0Var.m.mo2getContext();
            if (mo2getContext2 == null) {
                return true;
            }
            h7u0.a aVar = new h7u0.a(mo2getContext2);
            aVar.g0(R.string.confirm);
            aVar.U(R.string.gift_delete_confirm);
            aVar.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.hnq0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    inq0.this.G.invoke(giftItem);
                }
            });
            aVar.W(R.string.no, null);
            aVar.m();
            return true;
        }
    }

    public ypq0(jnq0 jnq0Var) {
        super(new com.vk.lists.a(new a()));
        this.e = jnq0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(tf3.b(viewGroup, R.layout.profile_tab_gift_item, viewGroup, false), viewGroup, this.e);
    }
}
