package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import kotlin.NoWhenBranchMatchedException;
import xsna.gp20;

/* compiled from: MiniAppsCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class sq20 extends androidx.recyclerview.widget.x<gp20, RecyclerView.e0> {
    public final boolean c;
    public final h170 d;
    public wq20 e;
    public gzs<s3q0> f;

    /* compiled from: MiniAppsCarouselItemsAdapter.kt */
    public static final class a implements lbf0 {
        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
            fp20 fp20Var = vif0Var instanceof fp20 ? (fp20) vif0Var : null;
            if (fp20Var != null) {
                if (kbf0Var.equals(jcr.c)) {
                    fp20Var.q6();
                    return;
                }
                if (kbf0Var.equals(xus.c)) {
                    fp20Var.q6();
                } else if (kbf0Var.equals(kci.d)) {
                    fp20Var.o.invoke(fp20Var.m);
                } else if (!kbf0Var.equals(sni.f)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* compiled from: MiniAppsCarouselItemsAdapter.kt */
    public static final class b extends m.e<gp20> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(gp20 gp20Var, gp20 gp20Var2) {
            return gp20Var.equals(gp20Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(gp20 gp20Var, gp20 gp20Var2) {
            gp20 gp20Var3 = gp20Var;
            gp20 gp20Var4 = gp20Var2;
            if (!(gp20Var3 instanceof gp20.a) || !(gp20Var4 instanceof gp20.a)) {
                return (gp20Var3 instanceof gp20.b) && (gp20Var4 instanceof gp20.b);
            }
            ApiApplication apiApplication = ((gp20.a) gp20Var3).a.f;
            UserId userId = apiApplication != null ? apiApplication.b : null;
            ApiApplication apiApplication2 = ((gp20.a) gp20Var4).a.f;
            return epx.f(userId, apiApplication2 != null ? apiApplication2.b : null);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(gp20 gp20Var, gp20 gp20Var2) {
            return this.a;
        }
    }

    public sq20(boolean z, h170 h170Var) {
        super(new b());
        this.c = z;
        this.d = h170Var;
        this.f = new jb(25);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object b0 = j5g.b0(i, getCurrentList());
        if (b0 instanceof gp20.a) {
            return 112;
        }
        return (!epx.f(b0, gp20.c.a) && epx.f(b0, gp20.b.a)) ? 113 : 111;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        gp20 gp20Var;
        Object b0 = j5g.b0(i, getCurrentList());
        if (e0Var instanceof fp20) {
            gp20Var = b0 instanceof gp20.a ? (gp20.a) b0 : null;
            if (gp20Var != null) {
                ((fp20) e0Var).V5(gp20Var);
                return;
            }
            return;
        }
        if (e0Var instanceof fe3) {
            ((fe3) e0Var).V5(s3q0.a);
        } else if (e0Var instanceof tbf0) {
            gp20Var = b0 instanceof gp20.b ? (gp20.b) b0 : null;
            if (gp20Var != null) {
                ((tbf0) e0Var).V5(gp20Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        gtl0 obf0Var;
        boolean z = this.c;
        switch (i) {
            case 111:
                sbf0 sbf0Var = sbf0.e;
                return new ubf0(viewGroup, null, z ? RecommendationsItemImageStyle.SQUARE : sbf0Var.c, sbf0Var.d, null);
            case 112:
                sbf0 sbf0Var2 = sbf0.e;
                if (this.d.d()) {
                    obf0Var = new pbf0(viewGroup, new a(), z ? null : ActionButtonStyle.PrimaryWithNoShadow, sbf0Var2.b, sbf0Var2.a, z ? RecommendationsItemImageStyle.SQUARE : sbf0Var2.c);
                } else {
                    obf0Var = new obf0(viewGroup, new a(), z ? null : ActionButtonStyle.PrimaryWithNoShadow, sbf0Var2.b, sbf0Var2.a, z ? RecommendationsItemImageStyle.SQUARE : sbf0Var2.c, sbf0Var2.d);
                }
                return new fp20(obf0Var, new m1k(this, 26));
            case 113:
                return new tbf0(viewGroup, new r5i(this, 28), sbf0.e, false);
            default:
                return new fe3(viewGroup);
        }
    }
}
