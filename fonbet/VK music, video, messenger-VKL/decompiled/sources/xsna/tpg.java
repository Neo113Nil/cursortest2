package xsna;

import android.view.ViewGroup;

/* compiled from: CommunityAdBannerItem.kt */
/* loaded from: classes5.dex */
public final class tpg extends we6 {
    public final upg g;
    public final z8f h;
    public final l00 i;
    public final int j = -250;

    /* compiled from: CommunityAdBannerItem.kt */
    public final class a extends vif0<tpg> {
        @Override // xsna.vif0
        public final void i6(tpg tpgVar) {
            tpg tpgVar2 = tpgVar;
            rpg rpgVar = (rpg) this.itemView;
            rpgVar.setComposeViewModel(tpgVar2.g);
            rpgVar.setOnHideClicked(new wze(tpgVar2, 4));
            rpgVar.setOnUrlButtonClicked(new go1(tpgVar2, 25));
        }
    }

    public tpg(upg upgVar, z8f z8fVar, l00 l00Var) {
        this.g = upgVar;
        this.h = z8fVar;
        this.i = l00Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        rpg rpgVar = new rpg(viewGroup.getContext());
        rpgVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(rpgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpg)) {
            return false;
        }
        tpg tpgVar = (tpg) obj;
        return epx.f(this.g, tpgVar.g) && epx.f(this.h, tpgVar.h) && epx.f(this.i, tpgVar.i);
    }

    @Override // xsna.we6
    public final int h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.g.hashCode() * 31;
        z8f z8fVar = this.h;
        return this.i.hashCode() + ((hashCode + (z8fVar == null ? 0 : z8fVar.hashCode())) * 31);
    }

    public final String toString() {
        return "CommunityAdBannerItem(model=" + this.g + ", onHideClicked=" + this.h + ", onUrlButtonClicked=" + this.i + ')';
    }
}
