package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.common.links.LinksParserData;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: CommunityInvitedByItem.kt */
/* loaded from: classes5.dex */
public final class h6h extends we6 {
    public final i6h g;
    public final sdz h;
    public final go1 i;
    public final dof j;
    public final izs<View, s3q0> k;
    public final int l = -30;

    /* compiled from: CommunityInvitedByItem.kt */
    public static final class a extends vif0<h6h> {
        public final izs<View, s3q0> n;
        public final TextView o;
        public final TextView p;
        public final View q;
        public final VKImageView r;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, izs<? super View, s3q0> izsVar) {
            super(viewGroup, R.layout.item_community_invited, 0);
            this.n = izsVar;
            this.o = (TextView) this.itemView.findViewById(R.id.text);
            TextView textView = (TextView) this.itemView.findViewById(R.id.accept);
            this.p = textView;
            this.q = this.itemView.findViewById(R.id.reject);
            this.r = (VKImageView) this.itemView.findViewById(R.id.photo);
            if (izsVar != 0) {
                izsVar.invoke(textView);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vif0
        public final void i6(h6h h6hVar) {
            Pair pair;
            h6h h6hVar2 = h6hVar;
            i6h i6hVar = h6hVar2.g;
            t230 t230Var = i6hVar.b;
            int i = i6hVar.c;
            sdz sdzVar = ((h6h) this.m).h;
            LinksParserData linksParserData = new LinksParserData(4, (Bundle) null, R.color.vk_blue_600, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16378);
            if (t230Var instanceof UserProfile) {
                int i2 = i == 0 ? R.string.group_inviter : R.string.group_inviter_event;
                StringBuilder sb = new StringBuilder("'''[id");
                UserProfile userProfile = (UserProfile) t230Var;
                sb.append(userProfile.c);
                sb.append('|');
                pair = new Pair(userProfile.h, sdzVar.d(h6(i2, i5s.a(sb, userProfile.e, "]'''")), linksParserData));
            } else if (t230Var instanceof Group) {
                StringBuilder sb2 = new StringBuilder("'''[club");
                Group group = (Group) t230Var;
                sb2.append(group.c);
                sb2.append('|');
                pair = new Pair(group.e, sdzVar.d(h6(R.string.group_inviter_community, i5s.a(sb2, group.d, "]'''")), linksParserData));
            } else {
                pair = new Pair(null, null);
            }
            String str = (String) pair.d();
            CharSequence charSequence = (CharSequence) pair.g();
            this.r.load(str);
            this.o.setText(charSequence);
            TextView textView = this.p;
            textView.setText(R.string.community_inv_accept_redesign);
            textView.setOnClickListener(new hmb(i6hVar, this, h6hVar2));
            this.q.setOnClickListener(new v9b(h6hVar2, 1));
        }
    }

    public h6h(i6h i6hVar, sdz sdzVar, go1 go1Var, dof dofVar, izs izsVar) {
        this.g = i6hVar;
        this.h = sdzVar;
        this.i = go1Var;
        this.j = dofVar;
        this.k = izsVar;
        this.b = false;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup, this.k);
    }

    @Override // xsna.we6
    public final int h() {
        return this.l;
    }
}
