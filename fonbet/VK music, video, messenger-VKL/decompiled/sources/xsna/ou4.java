package xsna;

import android.view.ViewGroup;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesListBehavior;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import java.lang.ref.WeakReference;
import ru.ok.media.PublisherImpl;
import xsna.faz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ou4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikv0 ikv0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qu4 qu4Var = (qu4) obj;
                zmp0.a((ViewGroup) qu4Var.a, new mk5().a(new pu4(qu4Var)));
                bwt0.r0(qu4Var.s, qu4Var.b);
                break;
            case 1:
                ((ViewPagerFixedSizeLayout) obj).requestLayout();
                break;
            case 2:
                CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = ((CommunityAddressesFragment) obj).u0;
                if (communityAddressesListBehavior == null) {
                    communityAddressesListBehavior = null;
                }
                communityAddressesListBehavior.I(-1, true);
                break;
            case 3:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) obj;
                int i2 = ContentLoadingProgressBar.d;
                contentLoadingProgressBar.getClass();
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                break;
            case 4:
                DivVisibilityActionTracker.updateVisibilityTask$lambda$0((DivVisibilityActionTracker) obj);
                break;
            case 5:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj;
                if (dVar.isShowing()) {
                    dVar.dismiss();
                    break;
                }
                break;
            case 6:
                ((quv) obj).t();
                break;
            case 7:
                ((gzs) obj).invoke();
                break;
            case 8:
                ((PublisherImpl) obj).lambda$stopNetworkLoad$6();
                break;
            case 9:
                ((IUnityAdsInitializationListener) obj).onInitializationComplete();
                break;
            case 10:
                try {
                    WeakReference<ikv0> weakReference = ((btq0) obj).d;
                    if (weakReference != null && (ikv0Var = weakReference.get()) != null) {
                        ikv0Var.a();
                        break;
                    }
                } catch (Throwable th) {
                    L.i(th);
                    return;
                }
                break;
            case 11:
                VariableMonitorView.updateTable$lambda$5((VariableMonitorView) obj);
                break;
            case 12:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                mhy.d((VkTopBar) obj);
                break;
            default:
                faz0.a aVar = (faz0.a) obj;
                daz0 daz0Var = aVar.b;
                if (!aVar.e) {
                    int i3 = aVar.c;
                    int i4 = aVar.d;
                    if (i3 < i4) {
                        if (daz0Var.a(i3)) {
                            aVar.c += 100;
                            break;
                        }
                    } else {
                        daz0Var.a(i4);
                        aVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
