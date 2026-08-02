package xsna;

import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.photos.root.selectalbum.domain.a;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ceq0;
import xsna.dai;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yde implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yde(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        VideoRestriction videoRestriction;
        wzs wzsVar;
        int i = this.b;
        int i2 = -1;
        int i3 = 7;
        int i4 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                zde zdeVar = (zde) obj3;
                uee ueeVar = (uee) obj;
                io2 io2Var = (io2) obj2;
                ceq0 ceq0Var = ueeVar.b;
                ClipVideoFile clipVideoFile = ueeVar.a;
                int i5 = emf.a;
                if (clipVideoFile.r <= 0 && (ceq0Var == null || !ceq0Var.f())) {
                    r8 = false;
                }
                if ((ceq0Var == null && (clipVideoFile.O || r8 || ((videoRestriction = clipVideoFile.O0) != null && !videoRestriction.f))) || (((ceq0Var instanceof ceq0.e) && r8) || (((ceq0Var instanceof ceq0.g) && ((ceq0.g) ceq0Var).e()) || (ceq0Var instanceof ceq0.c) || (ceq0Var instanceof ceq0.f)))) {
                    zdeVar.h.invoke(clipVideoFile, ceq0Var != null ? Integer.valueOf(ceq0Var.b()) : null);
                } else {
                    ArrayList K0 = zdeVar.K0();
                    Iterator it = zdeVar.K0().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ClipVideoFile) it.next()).c == clipVideoFile.c) {
                                i2 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    Integer valueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
                    if (valueOf != null) {
                        zdeVar.g.invoke(Integer.valueOf(valueOf.intValue()), K0, io2Var);
                    }
                }
                break;
            case 1:
                ((Integer) obj).getClass();
                break;
            case 2:
                wh50 wh50Var = ((dai.e) obj3).b;
                if (wh50Var != null && (wzsVar = (wzs) wh50Var.getValue()) != null) {
                    wzsVar.invoke(obj, obj2);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((lb40) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ote0 ote0Var = (ote0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1968306811, intValue, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioBigPlayerControls.Content.<anonymous> (RadioBigPlayerControls.kt:35)");
                    }
                    ote0Var.d(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((ReactionsFeedFragment) obj3).a0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                break;
            case 6:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int i6 = SelectAlbumBottomSheet.p1;
                xn50.a.c((SelectAlbumBottomSheet) obj3, new a.f((Throwable) obj, booleanValue));
                break;
            case 7:
                ((Integer) obj2).getClass();
                jzn0.d((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 8:
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoMinimizableDiscoveryFragment) obj3).getFeature().C(new c.k0((VideoFile) obj, (String) obj2));
                break;
            case 9:
                ((Integer) obj2).getClass();
                you0.a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                break;
            default:
                fpx0 fpx0Var = (fpx0) obj3;
                long longValue = ((Long) obj).longValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"TimestampUpdated: timestamp=" + longValue + " isNeedReconnect=" + booleanValue2});
                }
                if (booleanValue2) {
                    fpx0Var.c.c(longValue);
                }
                QueueParams queueParams = fpx0Var.d;
                if (queueParams != null) {
                    queueParams.e = longValue;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yde(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
