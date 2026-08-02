package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.n0q0;

/* compiled from: SearchIntegrationCatalogRootViewHolderLifecycleHelper.kt */
/* loaded from: classes16.dex */
public final class vvh0<VH extends CatalogRootViewHolder & n0q0> {
    public final VH a;
    public final UiTracker b;
    public final t98 c;
    public a d;
    public MobileOfficialAppsCoreNavStat$EventScreen e;

    /* compiled from: SearchIntegrationCatalogRootViewHolderLifecycleHelper.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public static a a(a aVar, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            aVar.getClass();
            return new a(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchLifecycleState(isOwnerResumed=");
            sb.append(this.a);
            sb.append(", isSearchActive=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public vvh0(SearchFollowersCatalogRootVh searchFollowersCatalogRootVh, t98 t98Var) {
        UiTracker uiTracker = UiTracker.a;
        a aVar = new a(false, false);
        this.a = searchFollowersCatalogRootVh;
        this.b = uiTracker;
        this.c = t98Var;
        this.d = aVar;
    }

    public final void a(a aVar) {
        FragmentImpl fragmentImpl;
        FragmentActivity activity;
        UiTracker.a f;
        boolean z = aVar.b;
        a aVar2 = this.d;
        this.d = aVar;
        boolean z2 = aVar2.a;
        boolean z3 = aVar2.b;
        boolean z4 = z2 && z3;
        boolean z5 = aVar.a;
        boolean z6 = z5 && z;
        VH vh = this.a;
        if (z4 != z6) {
            if (z5 && z) {
                vh.M();
            } else {
                vh.K();
            }
        }
        if (z3 != z) {
            UiTracker uiTracker = this.b;
            if (z) {
                VH vh2 = vh;
                uiTracker.getClass();
                l1q0 l1q0Var = UiTracker.i;
                if (l1q0Var.c()) {
                    boolean z7 = l1q0Var.b;
                    l1q0Var.b = false;
                    if (!z7) {
                        l1q0Var.f(UiTracker.e().g(vh2), true);
                    }
                }
                this.e = UiTracker.c();
                return;
            }
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.e;
            this.e = null;
            uiTracker.getClass();
            if (UiTracker.c() != mobileOfficialAppsCoreNavStat$EventScreen || (activity = (fragmentImpl = (FragmentImpl) this.c.b).getActivity()) == null || (f = UiTracker.f(activity)) == null) {
                return;
            }
            UiTracker.i.c = true;
            f.a(null, fragmentImpl, false);
        }
    }
}
