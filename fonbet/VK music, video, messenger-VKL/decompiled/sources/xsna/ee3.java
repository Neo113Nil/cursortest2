package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.newsfeed.common.recycler.holders.recommendations.ActionButtonStyle;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AppsCarouselItemsAdapter.kt */
/* loaded from: classes4.dex */
public final class ee3 extends androidx.recyclerview.widget.x<b, RecyclerView.e0> {
    public final h170 c;
    public t1e d;
    public gzs<s3q0> e;

    /* compiled from: AppsCarouselItemsAdapter.kt */
    public static final class a implements lbf0 {
        @Override // xsna.lbf0
        public final void a(kbf0 kbf0Var, vif0<?> vif0Var, int i) {
            qq20 qq20Var = vif0Var instanceof qq20 ? (qq20) vif0Var : null;
            if (qq20Var != null) {
                if (kbf0Var.equals(jcr.c)) {
                    qq20Var.q6();
                    return;
                }
                if (kbf0Var.equals(xus.c)) {
                    qq20Var.q6();
                } else if (kbf0Var.equals(kci.d)) {
                    qq20Var.p.invoke(qq20Var.m);
                } else if (!kbf0Var.equals(sni.f)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* compiled from: AppsCarouselItemsAdapter.kt */
    public static abstract class b {

        /* compiled from: AppsCarouselItemsAdapter.kt */
        public static final class a extends b {
            public final AppCarouselItem a;

            public a(AppCarouselItem appCarouselItem) {
                this.a = appCarouselItem;
            }
        }

        /* compiled from: AppsCarouselItemsAdapter.kt */
        /* renamed from: xsna.ee3$b$b, reason: collision with other inner class name */
        public static final class C2798b extends b {
            public static final C2798b a = new C2798b();
        }

        /* compiled from: AppsCarouselItemsAdapter.kt */
        public static final class c extends b {
            public static final c a = new c();
        }
    }

    /* compiled from: AppsCarouselItemsAdapter.kt */
    public static final class c extends m.e<b> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(b bVar, b bVar2) {
            return bVar.equals(bVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            if (!(bVar3 instanceof b.a) || !(bVar4 instanceof b.a)) {
                return (bVar3 instanceof b.C2798b) && (bVar4 instanceof b.C2798b);
            }
            ApiApplication apiApplication = ((b.a) bVar3).a.f;
            UserId userId = apiApplication != null ? apiApplication.b : null;
            ApiApplication apiApplication2 = ((b.a) bVar4).a.f;
            return epx.f(userId, apiApplication2 != null ? apiApplication2.b : null);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(b bVar, b bVar2) {
            return this.a;
        }
    }

    public ee3(h170 h170Var) {
        super(new c());
        this.c = h170Var;
        this.e = new af0(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object b0 = j5g.b0(i, getCurrentList());
        if (b0 instanceof b.a) {
            return 112;
        }
        return (!epx.f(b0, b.c.a) && epx.f(b0, b.C2798b.a)) ? 113 : 111;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        AppCarouselItem appCarouselItem;
        Object b0 = j5g.b0(i, getCurrentList());
        if (e0Var instanceof qq20) {
            b.a aVar = b0 instanceof b.a ? (b.a) b0 : null;
            if (aVar == null || (appCarouselItem = aVar.a) == null) {
                return;
            }
            ((qq20) e0Var).V5(appCarouselItem);
            return;
        }
        if (e0Var instanceof fe3) {
            ((fe3) e0Var).V5(s3q0.a);
        } else if (e0Var instanceof tbf0) {
            b.C2798b c2798b = b0 instanceof b.C2798b ? (b.C2798b) b0 : null;
            if (c2798b != null) {
                ((tbf0) e0Var).V5(c2798b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 111:
                sbf0 sbf0Var = sbf0.e;
                return new ubf0(viewGroup, null, sbf0Var.c, sbf0Var.d, null);
            case 112:
                sbf0 sbf0Var2 = sbf0.e;
                return new qq20(new rq20(), this.c.d() ? new pbf0(viewGroup, new a(), ActionButtonStyle.PrimaryWithNoShadow, sbf0Var2.b, sbf0Var2.a, sbf0Var2.c) : new obf0(viewGroup, new a(), ActionButtonStyle.PrimaryWithNoShadow, sbf0Var2.b, sbf0Var2.a, sbf0Var2.c, sbf0Var2.d), new t9(this, 3));
            case 113:
                return new tbf0(viewGroup, new we0(this, 5), sbf0.e, false);
            default:
                return new fe3(viewGroup);
        }
    }
}
