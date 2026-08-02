package xsna;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.sharing.core.view.InterceptingBottomSheetBehavior;
import one.video.controls.views.VideoShortActions;
import org.webrtc.RenderSynchronizer;
import ru.ok.proto.okmp.OkmpPublisher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kl2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ml2 ml2Var = (ml2) obj;
                LottieAnimationView lottieAnimationView = ml2Var.d;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.m0();
                d3m.e(ml2Var.f, (r15 & 1) != 0 ? 300L : 50L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                break;
            case 1:
                float f = CameraUIView.w1;
                ((CameraUIView) obj).N();
                break;
            case 2:
                int i2 = FeedRecyclerPaginatedView.U;
                dhr0.a.getClass();
                dhr0.D().getClass();
                com.vk.core.ui.themes.a.b((SwipeDrawableRefreshLayout) obj);
                break;
            case 3:
                ImContactsListFragment imContactsListFragment = (ImContactsListFragment) obj;
                qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
                if (imContactsListFragment.getView() != null) {
                    imContactsListFragment.io().b1();
                    AppBarLayout.d dVar = (AppBarLayout.d) imContactsListFragment.ho().getLayoutParams();
                    imContactsListFragment.e0 = dVar.a;
                    dVar.a = 0;
                    break;
                }
                break;
            case 4:
                InterceptingBottomSheetBehavior interceptingBottomSheetBehavior = (InterceptingBottomSheetBehavior) obj;
                int i3 = InterceptingBottomSheetBehavior.s0;
                if (interceptingBottomSheetBehavior.M != 4) {
                    interceptingBottomSheetBehavior.X(4);
                    break;
                }
                break;
            case 5:
                ((OkmpPublisher) obj).lambda$stop$5();
                break;
            case 6:
                ((PhotoViewer) obj).k();
                break;
            case 7:
                ProductsPhotoOverlayView productsPhotoOverlayView = (ProductsPhotoOverlayView) obj;
                int i4 = ProductsPhotoOverlayView.e;
                productsPhotoOverlayView.requestLayout();
                gzs<s3q0> gzsVar = productsPhotoOverlayView.b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 8:
                ((RenderSynchronizer) obj).lambda$registerListener$1();
                break;
            case 9:
                View view = (View) obj;
                view.requestLayout();
                view.invalidate();
                break;
            case 10:
                rxo0 rxo0Var = (rxo0) obj;
                rxo0Var.a.play(rxo0Var.c[1], 1.0f, 1.0f, 0, 0, 1.0f);
                break;
            default:
                dp2.c(((VideoShortActions) obj).x, null, false, 29);
                break;
        }
    }
}
