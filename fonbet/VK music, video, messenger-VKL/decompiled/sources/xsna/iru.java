package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsBlockTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemBadgeStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.toggle.data.RecommendationsItemSizeStyle;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwy;
import xsna.dek0;
import xsna.gpu;

/* compiled from: GroupsSuggestionsAdapter.kt */
/* loaded from: classes4.dex */
public final class iru extends zoj0<gpu, vif0<?>> {
    public final wf40 e;
    public final h170 f;
    public String h;
    public jdf0 i;
    public boolean j;
    public String g = GroupsGetSuggestionsBlockTypeDto.DEFAULT.i();
    public bwy k = bwy.d.a;
    public final hdf0 l = new hdf0(false);
    public final hdf0 m = new hdf0(true);
    public final a n = new a();

    /* compiled from: GroupsSuggestionsAdapter.kt */
    public static final class a implements lbf0 {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            idf0 idf0Var = vif0Var instanceof idf0 ? (idf0) vif0Var : null;
            if (idf0Var != null) {
                q3n0 q3n0Var = idf0Var.v;
                if (kbf0Var.equals(jcr.c)) {
                    gtl0 gtl0Var = idf0Var.o;
                    GroupSuggestion groupSuggestion = (GroupSuggestion) idf0Var.m;
                    if (groupSuggestion != null) {
                        Group group = groupSuggestion.b;
                        int i2 = group.C;
                        if (i2 == 1 || i2 == 2 || i2 == 4) {
                            q3n0Var.d(groupSuggestion, group, idf0Var.w);
                            return;
                        }
                        VkButton vkButton = (VkButton) gtl0Var.itemView.findViewById(R.id.carousel_card_bottom_action_button);
                        if (vkButton == null) {
                            vkButton = (VkButton) gtl0Var.itemView.findViewById(R.id.action_button);
                        }
                        VkButton vkButton2 = vkButton;
                        q3n0 q3n0Var2 = idf0Var.v;
                        GroupSuggestion groupSuggestion2 = (GroupSuggestion) idf0Var.m;
                        String str = idf0Var.r;
                        UiTracker uiTracker = UiTracker.a;
                        String name = UiTracker.c().name();
                        UiTrackingScreen b = UiTracker.j.b();
                        String name2 = (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
                        FullSourceJoinApi.SourceType sourceType = FullSourceJoinApi.SourceType.COMMUNITY_BLOCK_RECOM;
                        String h = sourceType.h();
                        String h2 = sourceType.h();
                        String i3 = FullSourceJoinApi.EntryServiceType.FEED.i();
                        q3n0Var2.b(groupSuggestion2, group, str, vkButton2, new FullSourceJoinApi(cqm0.m(name), name2 != null ? cqm0.m(name2) : null, h != null ? cqm0.m(h) : null, h2 != null ? cqm0.m(h2) : null, i3 != null ? cqm0.m(i3) : null, null));
                        return;
                    }
                    return;
                }
                if (kbf0Var.equals(xus.c)) {
                    GroupSuggestion groupSuggestion3 = (GroupSuggestion) idf0Var.m;
                    if (groupSuggestion3 != null) {
                        q3n0Var.e(groupSuggestion3, idf0Var.r);
                        return;
                    }
                    return;
                }
                if (!kbf0Var.equals(kci.d)) {
                    if (!kbf0Var.equals(sni.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                GroupSuggestion groupSuggestion4 = (GroupSuggestion) idf0Var.m;
                if (groupSuggestion4 != null) {
                    zqu zquVar = q3n0Var.b;
                    UserId userId = groupSuggestion4.b.c;
                    String str2 = groupSuggestion4.e;
                    zquVar.getClass();
                    tfx tfxVar = new tfx("groups.hideRecommendedGroup", new er(21), new fr(20));
                    tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                    if (str2 != null) {
                        tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
                    }
                    dz2 x = yfb.x(tfxVar);
                    x.k = true;
                    itg0.m(rsg0.y0(x, null, null, 3));
                    jdf0 jdf0Var = idf0Var.s;
                    if (jdf0Var != null) {
                        wjf0.c(jdf0Var.F.getRecyclerView(), new com.vk.movika.sdk.base.ui.z(13, jdf0Var, groupSuggestion4));
                    }
                }
            }
        }
    }

    public iru(wf40 wf40Var, h170 h170Var) {
        this.e = wf40Var;
        this.f = h170Var;
    }

    public final boolean K0() {
        return epx.f(this.k, bwy.c.a) || epx.f(this.k, bwy.a.a);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.j || K0()) {
            return 20;
        }
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (this.j || K0()) {
            return 0L;
        }
        Object c = this.c.c(i);
        gpu.a aVar = c instanceof gpu.a ? (gpu.a) c : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a.b.c.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (K0()) {
            return 5;
        }
        if (this.c.c(i) instanceof gpu.b) {
            return 6;
        }
        String str = this.g;
        if (epx.f(str, GroupsGetSuggestionsBlockTypeDto.DEFAULT.i())) {
            return 0;
        }
        if (epx.f(str, GroupsGetSuggestionsBlockTypeDto.INLINE.i())) {
            return 1;
        }
        return epx.f(str, "recommended_groups") ? 4 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        Object c = this.c.c(i);
        gpu.a aVar = c instanceof gpu.a ? (gpu.a) c : null;
        if (aVar == null) {
            return;
        }
        GroupSuggestion groupSuggestion = aVar.a;
        if (vif0Var instanceof vo6) {
            vo6 vo6Var = (vo6) vif0Var;
            vo6Var.getClass();
            vo6Var.V5(groupSuggestion);
        } else if (vif0Var instanceof idf0) {
            idf0 idf0Var = (idf0) vif0Var;
            idf0Var.s = this.i;
            idf0Var.V5(groupSuggestion);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        gtl0 obf0Var;
        gtl0 obf0Var2;
        sbf0 sbf0Var = sbf0.e;
        RecommendationsItemImageStyle recommendationsItemImageStyle = RecommendationsItemImageStyle.SQUARE;
        sbf0 a2 = sbf0.a(sbf0Var, recommendationsItemImageStyle);
        viewGroup.getContext();
        RecommendationsItemSizeStyle recommendationsItemSizeStyle = RecommendationsItemSizeStyle.LARGE;
        if (i == 1) {
            ddc ddcVar = new ddc(R.layout.friends_recomm_circle_item, viewGroup);
            ddcVar.u.setVisibility(8);
            ddcVar.y = this.h;
            return ddcVar;
        }
        h170 h170Var = this.f;
        if (i == 4) {
            if (h170Var.d()) {
                obf0Var = new pbf0(viewGroup, this.n, ActionButtonStyle.PrimaryWithNoShadow, a2.b, a2.a, a2.c, recommendationsItemSizeStyle);
            } else {
                obf0Var = new obf0(viewGroup, this.n, ActionButtonStyle.PrimaryWithNoShadow, a2.b, a2.a, a2.c, a2.d, recommendationsItemSizeStyle);
            }
            idf0 idf0Var = new idf0(this.m, obf0Var, "view_recommended_group", true);
            idf0Var.r = this.h;
            return idf0Var;
        }
        if (i == 5) {
            return new ubf0(viewGroup, ActionButtonStyle.PrimaryWithNoShadow, a2.c, a2.d, recommendationsItemSizeStyle);
        }
        if (i == 6) {
            return new tbf0(viewGroup, new wnh(this, 17), a2, true);
        }
        if (i != 7) {
            p3n0 p3n0Var = new p3n0(R.layout.groups_suggestions_item, viewGroup);
            VKImageView vKImageView = p3n0Var.o;
            njt hierarchy = vKImageView.getHierarchy();
            float a3 = cn70.a() * 8.0f;
            float a4 = cn70.a() * 8.0f;
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.e(a3, a4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            roundingParams.i = true;
            hierarchy.u(roundingParams);
            int i2 = dek0.a;
            dek0.b(vKImageView, null, new dek0.a(cn70.a() * 8.0f, false), 2);
            vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
            p3n0Var.y = this.h;
            return p3n0Var;
        }
        sbf0 a5 = sbf0.a(sbf0Var, recommendationsItemImageStyle);
        if (h170Var.d()) {
            obf0Var2 = new pbf0(viewGroup, this.n, ActionButtonStyle.PrimaryWithNoShadow, a5.b, a5.a, a5.c, RecommendationsItemSizeStyle.SMALL);
        } else {
            ActionButtonStyle actionButtonStyle = ActionButtonStyle.PrimaryWithNoShadow;
            RecommendationsItemBadgeStyle recommendationsItemBadgeStyle = a5.b;
            RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle = a5.a;
            RecommendationsItemImageStyle recommendationsItemImageStyle2 = a5.c;
            RecommendationsItemSizeStyle recommendationsItemSizeStyle2 = RecommendationsItemSizeStyle.SMALL;
            obf0Var2 = new obf0(viewGroup, this.n, actionButtonStyle, recommendationsItemBadgeStyle, recommendationsItemBackgroundStyle, recommendationsItemImageStyle2, a5.d, recommendationsItemSizeStyle2);
        }
        idf0 idf0Var2 = new idf0(this.l, obf0Var2, "show_group_suggestion", false);
        idf0Var2.r = this.h;
        return idf0Var2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        vif0 vif0Var = (vif0) e0Var;
        d3m.b(vif0Var.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        super.onViewDetachedFromWindow(vif0Var);
    }
}
