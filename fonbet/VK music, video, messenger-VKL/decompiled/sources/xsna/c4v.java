package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.core.view.components.cell.VkCell;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.PostActions;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import kotlin.NoWhenBranchMatchedException;
import xsna.d4v;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: HideOptionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class c4v extends rp6<d4v, NewsEntry> implements View.OnClickListener {
    public final NewsfeedRouter E;
    public final c1c0 F;
    public final VkCell G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4v(NewsfeedRouter newsfeedRouter, c1c0 c1c0Var, ViewGroup viewGroup) {
        super(R.layout.news_item_hide_option_button, viewGroup);
        viewGroup.getContext();
        this.E = newsfeedRouter;
        this.F = c1c0Var;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.item_hide_option_button);
        this.G = vkCell;
        getContext();
        vkCell.setOnClickListener(this);
    }

    @Override // xsna.rp6
    public final void R6(d4v d4vVar) {
        d4v d4vVar2 = d4vVar;
        dko dkoVar = d4vVar2.h;
        getContext();
        VkCell.Left.b a = dkoVar != null ? VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(dkoVar, VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(d4vVar2.k)), 8)) : null;
        VkCell vkCell = this.G;
        vkCell.setLeft(a);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        SpannableStringBuilder c = cqm0.c(e3m.f(d4vVar2.l, this.itemView.getContext()), d4vVar2.i);
        aVar2.getClass();
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(new tlo0.h(c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d4v d4vVar;
        if (jjc.b() || (d4vVar = (d4v) this.C) == null) {
            return;
        }
        d4v.a aVar = d4vVar.j;
        NewsEntry newsEntry = d4vVar.m;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        boolean z = aVar instanceof d4v.a.b;
        c1c0 c1c0Var = this.F;
        if (z) {
            d4v.a.b bVar = (d4v.a.b) aVar;
            if (bVar.a == 8) {
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context = this.itemView.getContext();
                permissionHelper.getClass();
                PermissionHelper.g(permissionHelper, context, PermissionHelper.h, PermissionHelper.i, R.string.vk_permissions_ad_location, 0, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
            }
            c1c0Var.I(this.itemView.getContext(), newsEntry, bVar.a);
            return;
        }
        if (aVar instanceof d4v.a.c) {
            PostInteract Ab = PostInteract.Ab(this.u, newsEntry);
            if (Ab != null) {
                Ab.n = i;
                Ab.zb(PostInteract.Type.hide);
            }
            c1c0Var.N(this.itemView.getContext(), newsEntry, this.u, NewsfeedAddBanTypeDto.ALWAYS);
            return;
        }
        if (aVar instanceof d4v.a.f) {
            PostInteract Ab2 = PostInteract.Ab(this.u, newsEntry);
            if (Ab2 != null) {
                Ab2.n = i;
                Ab2.zb(PostInteract.Type.hide);
            }
            c1c0Var.N(this.itemView.getContext(), newsEntry, this.u, NewsfeedAddBanTypeDto.WEEK);
            return;
        }
        if (aVar instanceof d4v.a.d) {
            c1c0Var.g(newsEntry, ((d4v.a.d) aVar).a, this.u);
            return;
        }
        if (aVar instanceof d4v.a.i) {
            this.E.y(this.itemView.getContext());
            return;
        }
        if (aVar instanceof d4v.a.e) {
            c1c0Var.W(this.itemView.getContext(), ((d4v.a.e) aVar).a, this.u);
            return;
        }
        if (epx.f(aVar, d4v.a.h.a)) {
            s980 s980Var = this.y;
            if (s980Var != null) {
                s980Var.d9(newsEntry, t6(), PostActions.ACTION_REPORT.h(), i);
                return;
            }
            return;
        }
        if (aVar instanceof d4v.a.C2706a) {
            c1c0Var.l(((d4v.a.C2706a) aVar).a, newsEntry);
        } else {
            if (!(aVar instanceof d4v.a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            c1c0Var.X(this.itemView.getContext(), newsEntry, ((d4v.a.g) aVar).a);
        }
    }
}
