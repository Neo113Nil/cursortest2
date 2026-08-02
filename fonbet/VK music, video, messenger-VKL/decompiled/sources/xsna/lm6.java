package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.search.params.api.SearchParams;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import kotlin.LazyThreadSafetyMode;
import xsna.mzh0;

/* compiled from: BaseSearchParamsDelegate.kt */
/* loaded from: classes5.dex */
public abstract class lm6<P extends SearchParams> {
    public final FragmentImpl a;
    public final arh0 b;
    public final mv90 c;
    public final b d;
    public final f0i0 e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new gy0(this, 8));
    public final P g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: BaseSearchParamsDelegate.kt */
    public final class a implements krh0<P> {
        public final /* synthetic */ r620 a;

        public a(r620 r620Var) {
            this.a = r620Var;
        }

        @Override // xsna.krh0
        public final void a(SearchParams searchParams) {
            r620 r620Var = this.a;
            String V = r620Var.d.V();
            com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
            com.vk.catalog2.common.ui.holders.search.b.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_FILTERS, V);
            int i = ify.a;
            Context requireContext = r620Var.a.requireContext();
            h4 h4Var = new h4(3, r620Var, searchParams);
            if (!ify.e(ify.c)) {
                h4Var.invoke();
            } else {
                ify.a(new hfy(h4Var));
                mhy.b(requireContext);
            }
        }
    }

    /* compiled from: BaseSearchParamsDelegate.kt */
    public interface b {
        String V();
    }

    public lm6(FragmentImpl fragmentImpl, mzh0.a aVar, arh0 arh0Var, mv90 mv90Var, b bVar, f0i0 f0i0Var) {
        this.a = fragmentImpl;
        this.b = arh0Var;
        this.c = mv90Var;
        this.d = bVar;
        this.e = f0i0Var;
        this.g = mv90Var.c;
    }
}
