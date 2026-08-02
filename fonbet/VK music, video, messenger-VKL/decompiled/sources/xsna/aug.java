package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.tlo0;

/* compiled from: CommunityCategorySuggestionsVh.kt */
/* loaded from: classes5.dex */
public final class aug extends vfz<i3i> {
    public final wzs<Group, String, s3q0> l;
    public final izs<i3i, s3q0> m;
    public final yzs<Group, String, View, s3q0> n;
    public final CommunityCardView o;

    public aug(Context context, jb5 jb5Var, eqd eqdVar, p3i p3iVar) {
        super(new CommunityCardView(context));
        this.l = jb5Var;
        this.m = eqdVar;
        this.n = p3iVar;
        this.o = (CommunityCardView) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(i3i i3iVar) {
        i3i i3iVar2 = i3iVar;
        this.m.invoke(i3iVar2);
        Group group = i3iVar2.b;
        nzq0 y = f870.y(group, this.itemView.getContext(), cn70.b(16));
        List<String> list = y.a;
        String str = y.b;
        tlo0.h d = oq.d(tlo0.Companion, group.d);
        Drawable z = f870.z(this.itemView.getContext(), group);
        if (z == null) {
            z = null;
        }
        CommunityCardView.d dVar = new CommunityCardView.d(d, z != null ? new eko(z) : null);
        CommunityCardView communityCardView = this.o;
        communityCardView.setTitle(dVar);
        communityCardView.setSubtitle(new CommunityCardView.c(new tlo0.h(group.z)));
        communityCardView.setUserStackBadge(new CommunityCardView.e(list, new tlo0.h(str)));
        bwt0.S(communityCardView, new mu1(10, group, this));
        StringBuilder sb = new StringBuilder();
        sb.append(group.d);
        sb.append('\n');
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        sb.append(VerifyInfoHelper.c(communityCardView.getContext(), group.y));
        sb.append('\n');
        sb.append(group.z);
        sb.append('\n');
        sb.append(str);
        sb.append('\n');
        communityCardView.setContentDescription(sb.toString());
        jjc.g(communityCardView, new td0(11, this, i3iVar2));
        Pair pair = group.j ? new Pair(communityCardView.getContext().getString(R.string.community_status_button_public_subscribed), Integer.valueOf(R.attr.vk_ui_text_secondary)) : new Pair(communityCardView.getContext().getString(R.string.join_page), null);
        communityCardView.setActionButton(new CommunityCardView.a(new tlo0.h((String) pair.d()), new km1(6, i3iVar2, this), null, (Integer) pair.g(), 60));
    }
}
