package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.narratives.Narrative;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.hvd0;

/* compiled from: ProfileContentNarrativeAdapter.kt */
/* loaded from: classes5.dex */
public final class evd0 extends zoj0<Narrative, d> {
    public final hvd0.f e;
    public final hvd0.g f;

    /* compiled from: ProfileContentNarrativeAdapter.kt */
    public static final class a extends m.e<Narrative> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(Narrative narrative, Narrative narrative2) {
            Narrative narrative3 = narrative;
            Narrative narrative4 = narrative2;
            return (!narrative3.equals(narrative4) || epx.f(narrative3.d, narrative4.d) || epx.f(narrative3.e, narrative4.e) || narrative3.Ab() == narrative4.Ab() || narrative3.h == narrative4.h) ? false : true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Narrative narrative, Narrative narrative2) {
            return narrative.equals(narrative2);
        }
    }

    /* compiled from: ProfileContentNarrativeAdapter.kt */
    public static final class b implements VkTile.g {
        public final VkAvatar a;

        public b(Context context) {
            this.a = new VkAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            if (hVar instanceof c) {
                VkAvatar vkAvatar = this.a;
                ViewGroup.LayoutParams layoutParams = vkAvatar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                bVar.G = "1:1";
                vkAvatar.setLayoutParams(bVar);
                vkAvatar.W0(new pdu0(), false);
                u1u0.g(vkAvatar);
                bwt0.S(vkAvatar, new i0b0(hVar, 6));
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ProfileContentNarrativeAdapter.kt */
    public static final class c implements VkTile.h {
        public final ebx a;
        public final baf0 b;

        public c(ebx ebxVar, baf0 baf0Var) {
            this.a = ebxVar;
            this.b = baf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NarrativesAvatarParams(url=" + this.a + ", placeholderDrawable=" + this.b + ')';
        }
    }

    /* compiled from: ProfileContentNarrativeAdapter.kt */
    public static final class d extends vif0<Narrative> {
        public final wzs<Narrative, WeakReference<View>, s3q0> n;
        public final wzs<Narrative, WeakReference<View>, s3q0> o;
        public final VkTile p;

        public d(ViewGroup viewGroup, hvd0.f fVar, hvd0.g gVar) {
            super(viewGroup, R.layout.profile_item_content_narrative_item, 0);
            this.n = fVar;
            this.o = gVar;
            VkTile vkTile = (VkTile) this.itemView.findViewById(R.id.horizontal_list_item);
            this.p = vkTile;
            vkTile.setVisualContentController(new b(this.itemView.getContext()));
            bwt0.i0(this.itemView, new d0w(this, 18));
            bwt0.k0(this.itemView, new qw30(this, 23));
        }

        @Override // xsna.vif0
        public final void i6(Narrative narrative) {
            Narrative narrative2 = narrative;
            VkTile.e eVar = new VkTile.e(oq.d(tlo0.Companion, narrative2.d), 2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
            VkTile vkTile = this.p;
            vkTile.setTitle(eVar);
            vkTile.setVisualContentParams(new c(new ebx(narrative2, 22), dhr0.t.b(R.drawable.bg_narrative_cover_placeholder, R.attr.vk_ui_image_placeholder)));
            vkTile.setTextAlignment(VkTile.TextAlignment.Center);
            u1u0.g(this.itemView);
        }
    }

    public evd0(hvd0.f fVar, hvd0.g gVar) {
        super(new com.vk.lists.a(new a()));
        this.e = fVar;
        this.f = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((d) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(viewGroup, this.e, this.f);
    }
}
