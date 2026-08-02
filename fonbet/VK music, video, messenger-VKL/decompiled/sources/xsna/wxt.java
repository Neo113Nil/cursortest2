package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.search.ModernSearchView;
import com.vk.libvideo.design.view.video.VideoView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GetWorkoutsHealthConnectDelegate.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class wxt extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wxt(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ModernSearchView pi;
        switch (this.b) {
            case 0:
                xxt xxtVar = (xxt) this.receiver;
                FragmentActivity fragmentActivity = (FragmentActivity) xxtVar.c.invoke();
                if (fragmentActivity != null) {
                    m4s.y(fragmentActivity, new pxt(xxtVar, fragmentActivity, null));
                }
                break;
            case 1:
                ((uxv) this.receiver).c();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                CatalogSearchQueryViewHolder c = ((ShowAllListVh) this.receiver).c();
                if (c != null && (pi = c.pi()) != null) {
                    pi.a();
                }
                break;
            default:
                ((VideoView) this.receiver).e();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxt(Object obj, int i) {
        super(0, obj, g950.class, "hasMusicSubscriptionForOffline", "hasMusicSubscriptionForOffline()Z", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, FragmentImpl.class, "getViewLifecycleOwner", "getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0);
                break;
            case 4:
                super(0, obj, ShowAllListVh.class, "onActionClearClicked", "onActionClearClicked()V", 0);
                break;
            default:
                break;
        }
    }
}
