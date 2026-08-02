package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemBackgroundStyle;
import com.vk.toggle.data.RecommendationsItemBadgeStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vkontakte.android.data.b;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import xsna.bwy;
import xsna.z0e0;

/* compiled from: ProfilesRecommendationsAdapter.kt */
/* loaded from: classes4.dex */
public final class j1e0 extends androidx.recyclerview.widget.x<z0e0, vif0<?>> implements vic {
    public final sbf0 c;
    public final h170 d;
    public String e;
    public String f;
    public jzd0 g;
    public RecyclerView h;
    public bwy i;
    public final oef0 j;
    public final b k;

    /* compiled from: ProfilesRecommendationsAdapter.kt */
    public static final class a extends m.e<z0e0> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(z0e0 z0e0Var, z0e0 z0e0Var2) {
            return z0e0Var.equals(z0e0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(z0e0 z0e0Var, z0e0 z0e0Var2) {
            z0e0 z0e0Var3 = z0e0Var;
            z0e0 z0e0Var4 = z0e0Var2;
            if ((z0e0Var3 instanceof z0e0.c) && (z0e0Var4 instanceof z0e0.c)) {
                return z0e0Var3.equals(z0e0Var4);
            }
            if (!(z0e0Var3 instanceof z0e0.b) || !(z0e0Var4 instanceof z0e0.b)) {
                return ((z0e0Var3 instanceof z0e0.a) && (z0e0Var4 instanceof z0e0.a)) ? z0e0Var3.equals(z0e0Var4) : ((z0e0Var3 instanceof z0e0.d) && (z0e0Var4 instanceof z0e0.d)) ? epx.f(((z0e0.d) z0e0Var3).a.d().c, ((z0e0.d) z0e0Var4).a.d().c) : (z0e0Var3 instanceof z0e0.e) && (z0e0Var4 instanceof z0e0.e);
            }
            ((z0e0.b) z0e0Var3).getClass();
            ((z0e0.b) z0e0Var4).getClass();
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(z0e0 z0e0Var, z0e0 z0e0Var2) {
            return this.a;
        }
    }

    /* compiled from: ProfilesRecommendationsAdapter.kt */
    public static final class b implements lbf0 {
        public final j1e0 a;
        public final f880 b;
        public final q010 c;

        public b(j1e0 j1e0Var, f880 f880Var, q010 q010Var) {
            this.a = j1e0Var;
            this.b = f880Var;
            this.c = q010Var;
        }

        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
            j1e0 j1e0Var = (j1e0) this.c.c;
            j1e0 j1e0Var2 = (j1e0) this.b.c;
            Object c = this.a.c(i);
            z0e0.d dVar = c instanceof z0e0.d ? (z0e0.d) c : null;
            if (dVar == null) {
                return;
            }
            RecommendedProfile recommendedProfile = dVar.a;
            if (kbf0Var.equals(kci.d)) {
                jzd0 jzd0Var = j1e0Var2.g;
                if (jzd0Var != null) {
                    jzd0Var.f(recommendedProfile);
                    return;
                }
                return;
            }
            if (kbf0Var.equals(jcr.c)) {
                jzd0 jzd0Var2 = j1e0Var2.g;
                if (jzd0Var2 != null) {
                    jzd0Var2.g(recommendedProfile, vif0Var);
                    return;
                }
                return;
            }
            if (kbf0Var.equals(xus.c)) {
                jzd0 jzd0Var3 = j1e0Var2.g;
                if (jzd0Var3 != null) {
                    jzd0Var3.d(recommendedProfile, j1e0Var.f);
                    return;
                }
                return;
            }
            if (!kbf0Var.equals(sni.f)) {
                throw new NoWhenBranchMatchedException();
            }
            UserProfile d = recommendedProfile.d();
            String str = j1e0Var.f;
            int a = pvo0.a();
            String str2 = "friend_recomm_view:" + d.c + ':' + str + ':' + d.J;
            if (com.vkontakte.android.data.b.i(str2)) {
                return;
            }
            String str3 = d.c + '|' + a + "||" + str + "||" + d.J;
            b.d dVar2 = new b.d("show_user_rec");
            dVar2.b = true;
            dVar2.c = true;
            dVar2.b(str3, "user_ids");
            dVar2.e();
            com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str2);
        }
    }

    public j1e0(sbf0 sbf0Var, h170 h170Var) {
        super(new a());
        this.c = sbf0Var;
        this.d = h170Var;
        this.e = "user_rec";
        this.i = bwy.d.a;
        this.j = new oef0();
        this.k = new b(this, new f880(this, 14), new q010(this, 23));
    }

    public final Object c(int i) {
        return j5g.b0(i, getCurrentList());
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        UserId userId;
        Object c = c(i);
        z0e0.d dVar = c instanceof z0e0.d ? (z0e0.d) c : null;
        if (dVar == null || (userId = dVar.a.d().c) == null) {
            return 0L;
        }
        return userId.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object c = c(i);
        if (c instanceof z0e0.c) {
            return 2;
        }
        if (c instanceof z0e0.a) {
            return 6;
        }
        if (c instanceof z0e0.b) {
            ((z0e0.b) c).getClass();
            return 0;
        }
        if (c instanceof z0e0.e) {
            return 7;
        }
        if (c instanceof z0e0.f) {
            return 5;
        }
        String str = this.e;
        if (epx.f(str, "holiday_friends")) {
            return 4;
        }
        return epx.f(str, "inline_user_rec") ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.h = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        Object c = c(i);
        switch (vif0Var.getItemViewType()) {
            case 0:
                if (!(vif0Var instanceof iqw) || !(c instanceof z0e0.b)) {
                    if ((vif0Var instanceof jqw) && (c instanceof z0e0.a)) {
                        ((jqw) vif0Var).V5(c);
                        break;
                    }
                } else {
                    iqw iqwVar = (iqw) vif0Var;
                    boolean z = ((z0e0.b) c).a;
                    jzd0 jzd0Var = this.g;
                    iqwVar.V5(Boolean.valueOf(z));
                    iqwVar.p = jzd0Var;
                    break;
                }
                break;
            case 1:
            case 3:
            case 4:
                if (!(vif0Var instanceof hh) || !(c instanceof z0e0.d)) {
                    if ((vif0Var instanceof pef0) && (c instanceof z0e0.d)) {
                        ((pef0) vif0Var).V5(((z0e0.d) c).a);
                        break;
                    }
                } else {
                    ((hh) vif0Var).q6(((z0e0.d) c).a, this.f, this.g);
                    break;
                }
                break;
            case 2:
                if ((vif0Var instanceof xvw) && (c instanceof z0e0.c)) {
                    ((xvw) vif0Var).V5(((z0e0.c) c).a);
                    break;
                }
                break;
            case 5:
                if (vif0Var instanceof ubf0) {
                    ((ubf0) vif0Var).V5(Boolean.valueOf(epx.f(this.i, bwy.c.a)));
                    break;
                }
                break;
            case 6:
                if (!(vif0Var instanceof nqw) || !(c instanceof z0e0.b)) {
                    if ((vif0Var instanceof jqw) && (c instanceof z0e0.a)) {
                        ((jqw) vif0Var).V5(c);
                        break;
                    }
                } else {
                    nqw nqwVar = (nqw) vif0Var;
                    ((z0e0.b) c).getClass();
                    nqwVar.n = this.g;
                    nqwVar.V5(null);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        gtl0 obf0Var;
        gtl0 obf0Var2;
        if (i == 0) {
            return new iqw(viewGroup);
        }
        h170 h170Var = this.d;
        oef0 oef0Var = this.j;
        sbf0 sbf0Var = this.c;
        switch (i) {
            case 2:
                xvw xvwVar = new xvw(viewGroup);
                xvwVar.s = this.f;
                return xvwVar;
            case 3:
                return new zcc(viewGroup);
            case 4:
                if (h170Var.d()) {
                    RecommendationsItemBadgeStyle recommendationsItemBadgeStyle = sbf0Var.b;
                    RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle = sbf0Var.a;
                    RecommendationsItemImageStyle recommendationsItemImageStyle = sbf0Var.c;
                    obf0Var = new pbf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, recommendationsItemBadgeStyle, recommendationsItemBackgroundStyle, recommendationsItemImageStyle);
                } else {
                    RecommendationsItemBadgeStyle recommendationsItemBadgeStyle2 = sbf0Var.b;
                    RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle2 = sbf0Var.a;
                    RecommendationsItemImageStyle recommendationsItemImageStyle2 = sbf0Var.c;
                    obf0Var = new obf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, recommendationsItemBadgeStyle2, recommendationsItemBackgroundStyle2, recommendationsItemImageStyle2, sbf0Var.d);
                }
                return new pef0(oef0Var, obf0Var);
            case 5:
                return new ubf0(viewGroup, ActionButtonStyle.PrimaryWithNoShadow, sbf0Var.c, sbf0Var.d, null);
            case 6:
                return new jqw(viewGroup, new g880(this, 14));
            case 7:
                return new tbf0(viewGroup, new m960(this, 18), sbf0Var, false);
            default:
                if (h170Var.d()) {
                    RecommendationsItemBadgeStyle recommendationsItemBadgeStyle3 = sbf0Var.b;
                    RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle3 = sbf0Var.a;
                    RecommendationsItemImageStyle recommendationsItemImageStyle3 = sbf0Var.c;
                    obf0Var2 = new pbf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, recommendationsItemBadgeStyle3, recommendationsItemBackgroundStyle3, recommendationsItemImageStyle3);
                } else {
                    RecommendationsItemBadgeStyle recommendationsItemBadgeStyle4 = sbf0Var.b;
                    RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle4 = sbf0Var.a;
                    RecommendationsItemImageStyle recommendationsItemImageStyle4 = sbf0Var.c;
                    obf0Var2 = new obf0(viewGroup, this.k, ActionButtonStyle.PrimaryWithNoShadow, recommendationsItemBadgeStyle4, recommendationsItemBackgroundStyle4, recommendationsItemImageStyle4, sbf0Var.d);
                }
                return new pef0(oef0Var, obf0Var2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (this.h == recyclerView) {
            this.h = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        vif0 vif0Var = (vif0) e0Var;
        d3m.b(vif0Var.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        super.onViewDetachedFromWindow(vif0Var);
    }
}
