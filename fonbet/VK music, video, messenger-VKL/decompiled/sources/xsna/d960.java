package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.tlo0;

/* compiled from: NewUserProfileOnboardingViewHolder.kt */
/* loaded from: classes5.dex */
public final class d960 extends aq6<UserProfileAdapterItem.l> {
    public final slq0 n;
    public final zuq0 o;
    public final NestedScrollableRecyclerView p;
    public final View q;
    public final bpn0 r;
    public final bpn0 s;

    /* compiled from: NewUserProfileOnboardingViewHolder.kt */
    public final class a {
        public final b.a a;
        public final int b;
        public final int c;
        public final int d;

        public a(d960 d960Var, b.a aVar) {
            this.a = aVar;
            NestedScrollableRecyclerView nestedScrollableRecyclerView = d960Var.p;
            this.b = nestedScrollableRecyclerView.getPaddingTop() + nestedScrollableRecyclerView.getPaddingBottom();
            this.c = tr.a(0, 1073741823, 0, 0);
            this.d = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(e3m.a(R.dimen.user_profile_new_user_onboarding_card_width, d960Var.itemView.getContext()), 1073741823)), 1073741824);
        }
    }

    /* compiled from: NewUserProfileOnboardingViewHolder.kt */
    public final class b extends zoj0<gd80, a> {

        /* compiled from: NewUserProfileOnboardingViewHolder.kt */
        public final class a extends vif0<gd80> {
            public final VkImage n;
            public final VkText o;
            public final VkText p;

            public a(b bVar, View view) {
                super(view);
                VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.container);
                this.n = (VkImage) this.itemView.findViewById(R.id.icon);
                this.o = (VkText) this.itemView.findViewById(R.id.action);
                this.p = (VkText) this.itemView.findViewById(R.id.hint);
                d960 d960Var = d960.this;
                vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
                bwt0.i0(vkCard, new lfa(9, this, d960Var));
            }

            @Override // xsna.vif0
            public final void i6(gd80 gd80Var) {
                gd80 gd80Var2 = gd80Var;
                bwt0.S(this.n, new cq3(24, this, gd80Var2));
                this.o.setText(gd80Var2.b);
                this.p.setText(gd80Var2.c);
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            ((a) e0Var).V5(this.c.c(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(this, tf3.b(viewGroup, R.layout.item_new_user_onboarding_card, viewGroup, false));
        }
    }

    public d960(View view, hpq0 hpq0Var, khc0 khc0Var) {
        super(view);
        this.n = hpq0Var;
        this.o = khc0Var;
        NestedScrollableRecyclerView nestedScrollableRecyclerView = (NestedScrollableRecyclerView) this.itemView.findViewById(R.id.recycler);
        this.p = nestedScrollableRecyclerView;
        this.q = this.itemView.findViewById(R.id.container);
        bpn0 bpn0Var = new bpn0(new f5x(this, 19));
        this.r = bpn0Var;
        this.s = new bpn0(new ag20(this, 9));
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.onboarding_block_header);
        vkGroupHeader.setSize(VkGroupHeader.Size.ExtraLarge);
        vkGroupHeader.setLeft(new VkGroupHeader.a.C0842a(new gko(R.drawable.vk_icon_lightbulb_outline_28), new x7g(R.attr.vk_ui_icon_accent), 4));
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.item_new_user_onboarding_title), null, null, null, 0, 510));
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.b(new xis(this, 26), new tlo0.f(R.string.accessibility_close)), 3));
        this.itemView.getContext();
        nestedScrollableRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        nestedScrollableRecyclerView.setAdapter((b) bpn0Var.getValue());
        nestedScrollableRecyclerView.addItemDecoration(new ehk0(e3m.a(R.dimen.vk_ui_spacing_size_m, this.itemView.getContext())));
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.l lVar = (UserProfileAdapterItem.l) obj;
        a aVar = (a) this.s.getValue();
        List<gd80> list = lVar.c;
        int i = aVar.c;
        int i2 = aVar.d;
        b.a aVar2 = aVar.a;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        aVar2.V5((gd80) it.next());
        aVar2.itemView.measure(i2, i);
        int measuredHeight = aVar2.itemView.getMeasuredHeight();
        while (it.hasNext()) {
            aVar2.V5((gd80) it.next());
            aVar2.itemView.measure(i2, i);
            int measuredHeight2 = aVar2.itemView.getMeasuredHeight();
            if (measuredHeight < measuredHeight2) {
                measuredHeight = measuredHeight2;
            }
        }
        bwt0.c0(measuredHeight + aVar.b, this.p);
        ((b) this.r.getValue()).setItems(list);
        this.q.setBackgroundResource(lVar.b.h());
    }
}
