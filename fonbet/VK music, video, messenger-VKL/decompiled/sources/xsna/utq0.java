package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.gift.Gift;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.stickers.views.gift.GiftView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfilePromoBirthdayViewHolder.kt */
/* loaded from: classes5.dex */
public final class utq0 extends aq6<UserProfileAdapterItem.PromoButtons.BirthdayPromo.a> {
    public static final /* synthetic */ int t = 0;
    public final slq0 n;
    public final zuq0 o;
    public final VkGroupHeader p;
    public final View q;
    public final View r;
    public final bpn0 s;

    /* compiled from: UserProfilePromoBirthdayViewHolder.kt */
    public final class a extends zoj0<CatalogedGift, AbstractC3833a<?>> {
        public ExtendedUserProfile e;

        /* compiled from: UserProfilePromoBirthdayViewHolder.kt */
        /* renamed from: xsna.utq0$a$a, reason: collision with other inner class name */
        public abstract class AbstractC3833a<T> extends RecyclerView.e0 {
            public AbstractC3833a() {
                throw null;
            }
        }

        /* compiled from: UserProfilePromoBirthdayViewHolder.kt */
        public final class b extends AbstractC3833a<CatalogedGift> {
            public final GiftView l;
            public final View m;

            public b(View view) {
                super(view);
                this.l = (GiftView) this.itemView.findViewById(R.id.gift_view);
                this.m = this.itemView.findViewById(R.id.badge);
            }
        }

        /* compiled from: UserProfilePromoBirthdayViewHolder.kt */
        public final class c extends AbstractC3833a<s3q0> {
            public final VkCard l;

            public c(View view) {
                super(view);
                VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.card);
                vkCard.setBackgroundColor(0);
                this.l = vkCard;
            }
        }

        public a() {
        }

        @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return super.getItemCount() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                int i2 = utq0.t;
                return R.layout.item_birthday_promo_gift_more;
            }
            int i3 = utq0.t;
            return R.layout.item_birthday_promo_gift;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UserId userId;
            AbstractC3833a abstractC3833a = (AbstractC3833a) e0Var;
            if (!(abstractC3833a instanceof b)) {
                if (abstractC3833a instanceof c) {
                    c cVar = (c) abstractC3833a;
                    s3q0 s3q0Var = s3q0.a;
                    VkCard vkCard = cVar.l;
                    a aVar = a.this;
                    bwt0.i0(vkCard, new twi0(7, aVar, utq0.this));
                    return;
                }
                return;
            }
            b bVar = (b) abstractC3833a;
            CatalogedGift catalogedGift = (CatalogedGift) this.c.c(i);
            a aVar2 = a.this;
            Gift gift = catalogedGift.b;
            GiftView giftView = bVar.l;
            ExtendedUserProfile extendedUserProfile = aVar2.e;
            if (extendedUserProfile == null || (userId = bwd0.l(extendedUserProfile).c) == null) {
                userId = UserId.d;
            }
            int layoutPosition = bVar.getLayoutPosition();
            int i2 = GiftView.A;
            giftView.c(gift, userId, layoutPosition, 4, false);
            bwt0.p0(bVar.m, catalogedGift.c);
            bwt0.i0(bVar.itemView, new m0i(aVar2, utq0.this, catalogedGift, 8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View b2 = tf3.b(viewGroup, i, viewGroup, false);
            int i2 = utq0.t;
            return i == R.layout.item_birthday_promo_gift ? new b(b2) : new c(b2);
        }
    }

    public utq0(View view, hpq0 hpq0Var, khc0 khc0Var) {
        super(view);
        this.n = hpq0Var;
        this.o = khc0Var;
        this.p = (VkGroupHeader) this.itemView.findViewById(R.id.title_group_header);
        NestedScrollableRecyclerView nestedScrollableRecyclerView = (NestedScrollableRecyclerView) this.itemView.findViewById(R.id.recycler);
        this.q = this.itemView.findViewById(R.id.show);
        this.r = this.itemView.findViewById(R.id.container);
        bpn0 bpn0Var = new bpn0(new ajd0(this, 15));
        this.s = bpn0Var;
        this.itemView.getContext();
        nestedScrollableRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nestedScrollableRecyclerView.setAdapter((a) bpn0Var.getValue());
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.PromoButtons.BirthdayPromo.a aVar = (UserProfileAdapterItem.PromoButtons.BirthdayPromo.a) obj;
        VkGroupHeader.d dVar = new VkGroupHeader.d(aVar.d, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.p;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSubtitle(new VkGroupHeader.c(aVar.e, null, null, 14));
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.b(new rp1(24, this, aVar), this.itemView.getContext().getString(R.string.accessibility_dismiss)), 3));
        bpn0 bpn0Var = this.s;
        ((a) bpn0Var.getValue()).setItems(aVar.f);
        ((a) bpn0Var.getValue()).e = aVar.g;
        this.r.setBackgroundResource(aVar.b.h());
        hpg hpgVar = new hpg(4, this, aVar);
        View view = this.q;
        view.setOnClickListener(hpgVar);
        MergeMode mergeMode = aVar.b;
        view.setBackgroundResource((mergeMode == MergeMode.MergeBottom || mergeMode == MergeMode.MergeBoth) ? R.drawable.profile_button_ripple_bottom_rounded_8dp : R.drawable.profile_button_ripple_bottom_rounded_20dp);
    }
}
