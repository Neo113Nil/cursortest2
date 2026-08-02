package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import xsna.dt1;
import xsna.q630;

/* compiled from: SearchFiltersBottomSheet.kt */
/* loaded from: classes5.dex */
public abstract class ath0 extends jmu0 {
    public static final q630 i1;
    public final nqh0 h1;

    /* compiled from: SearchFiltersBottomSheet.kt */
    public static final class a extends kmu0 {
        public final SearchParams h;
        public final tas i;
        public final FragmentManager j;

        public a(Context context, SearchParams searchParams, tas tasVar, FragmentManager fragmentManager) {
            super(context, new zsh0());
            this.h = searchParams;
            this.i = tasVar;
            this.j = fragmentManager;
            c(new b());
            F0(true);
            B(nw20.m1, false, false);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            SearchParams searchParams = this.h;
            if (searchParams instanceof VkPeopleSearchParams) {
                return new lv90(this.c, (VkPeopleSearchParams) searchParams, new p2u(23), this.i, new bbb0(this, 13));
            }
            boolean z = searchParams instanceof VkGroupsSearchParams;
            tas tasVar = this.i;
            if (z) {
                return new f1i(androidx.compose.runtime.k.b(searchParams), new dam(29), tasVar, new kld0(this, 7));
            }
            if (searchParams instanceof VkFeedSearchParams) {
                return new o4r(androidx.compose.runtime.k.b(searchParams), new cd10(14), tasVar);
            }
            throw new IllegalArgumentException("Unsupported filter parameters ".concat(qjg.a(searchParams)));
        }
    }

    /* compiled from: SearchFiltersBottomSheet.kt */
    public static final class b extends com.vk.core.ui.bottomsheet.internal.b {
        public static final int a = iah0.a(254);

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final boolean a() {
            return true;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int c(int i, int i2, int i3) {
            int i4 = i2 - i;
            int i5 = a;
            if (i4 < i5) {
                i4 = i5;
            } else if (i4 > i2 * 0.9f) {
                i4 = i2;
            }
            return i2 - i4;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int d(int i, int i2, int i3) {
            return 0;
        }
    }

    static {
        dt1.a.getClass();
        float f = 0;
        float f2 = 12;
        i1 = rte0.d(s200.E(txj0.z(q630.a.a, dt1.a.k, 2), f, f), vog0.c(f2, f2, f, f));
    }

    public ath0(nqh0 nqh0Var) {
        this.h1 = nqh0Var;
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }
}
