package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: CommunityDonutMembersItem.kt */
/* loaded from: classes5.dex */
public final class y1h extends we6 {
    public final z1h g;
    public final yqf h;
    public final v3h i;
    public final k7f j;
    public final int k = -239;

    /* compiled from: CommunityDonutMembersItem.kt */
    public final class a extends vif0<y1h> {
        @Override // xsna.vif0
        public final void i6(y1h y1hVar) {
            y1h y1hVar2 = y1hVar;
            View view = this.itemView;
            g3h g3hVar = view instanceof g3h ? (g3h) view : null;
            if (g3hVar != null) {
                g3hVar.B(y1hVar2.g);
            }
            View view2 = this.itemView;
            g3h g3hVar2 = view2 instanceof g3h ? (g3h) view2 : null;
            if (g3hVar2 != null) {
                g3hVar2.setOnSubscribedStateClick(new t9b(4, this, y1hVar2));
                g3hVar2.setOnFriendsClick(new pk(5, this, y1hVar2));
                g3hVar2.setOnMembersClick(new qk(7, this, y1hVar2));
            }
        }

        public final void q6(y1h y1hVar, boolean z) {
            z1h z1hVar = y1hVar.g;
            if (z1hVar.h || z1hVar.f.b != 0) {
                y1hVar.j.invoke(Boolean.valueOf(z));
            } else {
                int i = h7u0.p;
                h7u0.a a = h7u0.b.a(this.itemView.getContext());
                a.g0(R.string.community_members_is_hiden);
                a.U(R.string.community_hiden_members_dialog_message);
                a.c0(R.string.close, new jwd());
                a.m();
            }
            g2h g2hVar = new g2h(z1hVar.i);
            g2hVar.b = "subscribers";
            g2hVar.d = "friends";
            g2hVar.a();
        }
    }

    public y1h(z1h z1hVar, yqf yqfVar, v3h v3hVar, k7f k7fVar) {
        this.g = z1hVar;
        this.h = yqfVar;
        this.i = v3hVar;
        this.j = k7fVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        g3h g3hVar = new g3h(viewGroup.getContext());
        g3hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(g3hVar);
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
