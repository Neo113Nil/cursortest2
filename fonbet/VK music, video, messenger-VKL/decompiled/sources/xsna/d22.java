package xsna;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.im.engine.models.groups.WarningNotification;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.mf40;
import xsna.p810;
import xsna.rfb0;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d22 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, pcs, SwipeDrawableRefreshLayout.g, Toolbar.h, io.reactivex.rxjava3.functions.c, tq70.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d22(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).a(((c8b0) ((a9b0) this.c)).a);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (hda) ((on) obj2).invoke(obj);
            case 1:
                int i2 = AppChannelFragment.l1;
                return (WarningNotification) ((z13) obj2).invoke(obj);
            case 2:
            case 4:
            case 15:
            case 16:
            case 22:
            case 25:
            default:
                return (List) ((zl20) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((on) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((m9) obj2).invoke(obj);
            case 6:
                return (Boolean) ((z13) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((m9) obj2).invoke(obj);
            case 8:
                return (mrb) ((tza) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.e) ((m9) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((on) obj2).invoke(obj);
            case 11:
                return ((gie) obj2).invoke(obj);
            case 12:
                return (m8v) ((dhh) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((z13) obj2).invoke(obj);
            case 14:
                return (drq) ((m9) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((lrk) obj2).invoke(obj);
            case 18:
                return (of3) ((j37) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((dhh) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((m9) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((ept) obj2).invoke(obj);
            case 23:
                return (gcw) ((m9) obj2).invoke(obj);
            case 24:
                return (MarketBridgeCategory) ((sec) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((mgz) obj2).invoke(obj);
            case 27:
                return (hda) ((mf40.f) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (xbu0) ((m35) this.c).invoke(obj, obj2, obj3);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        FeedRecyclerPaginatedView feedRecyclerPaginatedView = (FeedRecyclerPaginatedView) this.c;
        izs<? super Boolean, s3q0> izsVar = feedRecyclerPaginatedView.Q;
        if (izsVar != null) {
            izsVar.invoke(Boolean.TRUE);
        }
        gzs<s3q0> gzsVar = feedRecyclerPaginatedView.F;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ImContactsListFragment imContactsListFragment = (ImContactsListFragment) this.c;
        qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
        if (menuItem.getItemId() != R.id.vkim_search_menu) {
            return true;
        }
        TextView textView = imContactsListFragment.U;
        if (textView == null) {
            textView = null;
        }
        d3m.e(textView, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new tnf(imContactsListFragment, 2), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        us6 us6Var = (us6) this.c;
        int i = us6.p1;
        if (str.hashCode() == 1974198939 && str.equals("SELECTED")) {
            us6Var.hide();
        }
    }

    public /* synthetic */ d22(g250 g250Var, a9b0 a9b0Var) {
        this.b = 28;
        this.c = a9b0Var;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (p810.c) ((xwl) this.c).invoke(obj, obj2);
    }
}
