package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.Gift;
import com.vk.dto.gift.GiftItem;
import com.vk.stickers.views.gift.GiftView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: DetailsGiftsItem.kt */
/* loaded from: classes5.dex */
public final class l4m extends we6 {
    public final ExtendedUserProfile g;
    public final a13 h;
    public final izs<GiftItem, s3q0> i;
    public final int j = -1005;
    public int k;

    /* compiled from: DetailsGiftsItem.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final ArrayList c = new ArrayList();

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            bVar.V5(this.c.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return l4m.this.new b(viewGroup);
        }
    }

    /* compiled from: DetailsGiftsItem.kt */
    public final class b extends vif0<GiftItem> {
        public final GiftView n;
        public final ImageView o;

        public b(ViewGroup viewGroup) {
            super(viewGroup, R.layout.profile_details_gifts_one_item, 0);
            this.n = (GiftView) this.itemView.findViewById(R.id.gift_view);
            this.o = (ImageView) this.itemView.findViewById(R.id.votes_icon);
        }

        @Override // xsna.vif0
        public final void i6(GiftItem giftItem) {
            GiftItem giftItem2 = giftItem;
            l4m l4mVar = l4m.this;
            GiftView giftView = this.n;
            if (giftView != null) {
                Gift gift = giftItem2.i;
                UserId userId = bwd0.l(l4mVar.g).c;
                int layoutPosition = getLayoutPosition();
                int i = GiftView.A;
                giftView.c(gift, userId, layoutPosition, 4, false);
            }
            ImageView imageView = this.o;
            if (imageView != null) {
                bwt0.p0(imageView, giftItem2.l != null);
            }
            this.itemView.setOnClickListener(new jkc(3, l4mVar, giftItem2));
        }
    }

    /* compiled from: DetailsGiftsItem.kt */
    public static final class c extends vif0<l4m> {
        public final RecyclerView n;
        public final View o;
        public final a p;

        public c(ViewGroup viewGroup) {
            super(viewGroup, R.layout.profile_details_gifts_item, 0);
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler);
            this.n = recyclerView;
            View findViewById = this.itemView.findViewById(R.id.send_button);
            this.o = findViewById;
            a aVar = l4m.this.new a();
            this.p = aVar;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setOverScrollMode(2);
            recyclerView.setAdapter(aVar);
            recyclerView.addItemDecoration(new n4m(recyclerView));
            findViewById.setOnClickListener(new lha(1, l4m.this, this));
            ExtendedUserProfile extendedUserProfile = l4m.this.g;
            if (extendedUserProfile.a()) {
                ver0.c(this.itemView.getContext(), rsg0.y0(new szt(extendedUserProfile.a.c, 0, 6), null, null, 3).subscribe(new el6(new srg(this, 7), 17), new m4m(new y90(22), 0)));
                return;
            }
            EmptyList emptyList = EmptyList.b;
            ArrayList arrayList = aVar.c;
            arrayList.clear();
            arrayList.addAll(emptyList);
            aVar.notifyDataSetChanged();
        }

        @Override // xsna.vif0
        public final void i6(l4m l4mVar) {
            ExtendedUserProfile extendedUserProfile = l4mVar.g;
            this.o.setVisibility(bwd0.d(extendedUserProfile) ? 8 : 0);
            boolean a = extendedUserProfile.a();
            l4m l4mVar2 = l4m.this;
            RecyclerView recyclerView = this.n;
            if (a) {
                recyclerView.setVisibility(0);
                l4mVar2.k = 0;
            } else {
                recyclerView.setVisibility(8);
                l4mVar2.k = 3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l4m(ExtendedUserProfile extendedUserProfile, a13 a13Var, izs<? super GiftItem, s3q0> izsVar) {
        this.g = extendedUserProfile;
        this.h = a13Var;
        this.i = izsVar;
    }

    @Override // xsna.we6
    public final vif0<l4m> a(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    @Override // xsna.we6
    public final int g() {
        return this.k;
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }

    @Override // xsna.we6
    public final void j(int i) {
        this.k = i;
    }
}
