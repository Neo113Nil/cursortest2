package xsna;

import androidx.preference.Preference;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.profile.community.details.impl.name_history.c;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bridge.b;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import org.chromium.net.impl.JavaUrlRequestUtils;
import xsna.fit;
import xsna.ult;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tt0 implements io.reactivex.rxjava3.functions.l, AbstractPaginatedView.g, io.reactivex.rxjava3.functions.m, mw, io.reactivex.rxjava3.functions.g, Preference.b, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.c, JavaUrlRequestUtils.CheckedRunnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        Preference preference2 = (Preference) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        preference2.F(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // xsna.mw
    public void a(boolean z) {
        ((i1d) this.c).b.a(new k3d(z));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((yx5) this.c).invoke(obj, obj2);
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) this.c;
        int i2 = BonusCatalogFragment.f0;
        int b = cn70.b(112);
        int b2 = cn70.b(8);
        int b3 = cn70.b(4);
        int i3 = ((i - (b2 * 2)) + b3) / (b + b3);
        bonusCatalogFragment.b0 = i3;
        if (i3 == 0) {
            bonusCatalogFragment.b0 = 3;
        }
        return bonusCatalogFragment.b0;
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Triple) ((ec1) this.c).invoke(obj, obj2, obj3);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        GeoPostsFragment geoPostsFragment = (GeoPostsFragment) this.c;
        qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
        dlt dltVar = (dlt) geoPostsFragment.U.getValue();
        ult.c cVar = new ult.c(xn60.d.b.b);
        hmt hmtVar = (hmt) dltVar.a.invoke();
        if (hmtVar != null) {
            hmtVar.b(cVar);
        }
    }

    @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
    public void run() {
        ((JavaUploadDataSinkBase) this.c).lambda$startRead$1();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((jt) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((jt) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.e) ((com.vk.im.engine.internal.storage.delegates.messages.b) this.c).invoke(obj);
            case 2:
            case 3:
            case 10:
            case 15:
            case 16:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                return (Pair) ((i020) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((e99) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((com.vk.im.engine.internal.storage.delegates.messages.b) this.c).invoke(obj);
            case 6:
                return (qw9) ((jt) this.c).invoke(obj);
            case 7:
                return ((m7) this.c).invoke(obj);
            case 8:
                return (hda) ((g86) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.im.engine.internal.storage.delegates.messages.b) this.c).invoke(obj);
            case 11:
                return (xpe) ((iue) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((gq0) this.c).invoke(obj);
            case 13:
                return (b.a) ((g86) this.c).invoke(obj);
            case 14:
                return (c.a.C1557c) ((jt) this.c).invoke(obj);
            case 17:
                return (it80) ((o1e) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.o) ((qt0) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.e) ((jt) this.c).invoke(obj);
            case 20:
                return (Pair) ((f2s) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((g86) this.c).invoke(obj);
            case 22:
                return (ke3) ((fit.n) this.c).invoke(obj);
            case 23:
                return (Boolean) ((jt) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((pyz) this.c).invoke(obj);
        }
    }
}
