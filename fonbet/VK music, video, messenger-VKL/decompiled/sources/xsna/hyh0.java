package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchGamesInServiceCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchGroupMembersCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchInCommunityCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.apps.SearchMiniAppsInServiceCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.iqh0;
import xsna.mzh0;

/* compiled from: SearchResultVHFactory.kt */
/* loaded from: classes5.dex */
public final class hyh0 {

    /* compiled from: SearchResultVHFactory.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<f5z> {
        @Override // xsna.gzs
        public final f5z invoke() {
            return ((FragmentImpl) this.receiver).getViewLifecycleOwner();
        }
    }

    /* compiled from: SearchResultVHFactory.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<f5z> {
        @Override // xsna.gzs
        public final f5z invoke() {
            return ((FragmentImpl) this.receiver).getViewLifecycleOwner();
        }
    }

    /* compiled from: SearchResultVHFactory.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<f5z> {
        @Override // xsna.gzs
        public final f5z invoke() {
            return ((FragmentImpl) this.receiver).getViewLifecycleOwner();
        }
    }

    public static SearchFeatureCatalogRootVh a(iqh0 iqh0Var, zqh0 zqh0Var, yzh0 yzh0Var) {
        if (iqh0Var instanceof iqh0.a) {
            FragmentImpl fragmentImpl = ((iqh0.a) iqh0Var).c;
            return new SearchGamesInServiceCatalogRootVh(fragmentImpl.getArguments(), fragmentImpl.kn(), new o5a(fragmentImpl), zqh0Var, new a(0, fragmentImpl, FragmentImpl.class, "getViewLifecycleOwner", "getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0));
        }
        if (iqh0Var instanceof iqh0.b) {
            iqh0.b bVar = (iqh0.b) iqh0Var;
            FragmentImpl fragmentImpl2 = bVar.c;
            Bundle arguments = fragmentImpl2.getArguments();
            FragmentActivity kn = fragmentImpl2.kn();
            o5a o5aVar = new o5a(fragmentImpl2);
            b bVar2 = new b(0, fragmentImpl2, FragmentImpl.class, "getViewLifecycleOwner", "getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0);
            UserId userId = bVar.e;
            mzh0.b bVar3 = mzh0.b.a;
            mzh0.a aVar = bVar.d;
            bVar3.getClass();
            return new SearchGroupMembersCatalogRootVh(userId, arguments, kn, o5aVar, zqh0Var, bVar2, yzh0Var, aVar == null ? false : aVar.a);
        }
        if (iqh0Var instanceof iqh0.d) {
            iqh0.d dVar = (iqh0.d) iqh0Var;
            FragmentImpl fragmentImpl3 = dVar.c;
            return new SearchOwnerVideosCatalogRootVh(dVar.d, fragmentImpl3.getArguments(), fragmentImpl3.kn(), new o5a(fragmentImpl3), zqh0Var, fragmentImpl3.getViewLifecycleOwner());
        }
        if (iqh0Var instanceof iqh0.e) {
            iqh0.e eVar = (iqh0.e) iqh0Var;
            FragmentImpl fragmentImpl4 = eVar.c;
            return new SearchInCommunityCatalogRootVh(eVar.d, fragmentImpl4.getArguments(), fragmentImpl4.kn(), new o5a(fragmentImpl4), zqh0Var, fragmentImpl4.getViewLifecycleOwner(), eVar.e);
        }
        if (!(iqh0Var instanceof iqh0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentImpl fragmentImpl5 = ((iqh0.c) iqh0Var).c;
        return new SearchMiniAppsInServiceCatalogRootVh(fragmentImpl5.getArguments(), fragmentImpl5.kn(), new o5a(fragmentImpl5), zqh0Var, new c(0, fragmentImpl5, FragmentImpl.class, "getViewLifecycleOwner", "getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0));
    }
}
