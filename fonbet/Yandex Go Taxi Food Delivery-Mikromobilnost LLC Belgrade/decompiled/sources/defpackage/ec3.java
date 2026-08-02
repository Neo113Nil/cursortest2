package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.yandex.go.shortcuts.impl.ui.shortcutview.ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1;
import com.yandex.go.shortcuts.impl.ui.shortcutview.ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3;
import com.yandex.go.taxi.order.info.OrderInfoModalView;
import com.yandex.go.taxi.order.info.OrderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.DefaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1;
import ru.yandex.taxi.stories.domain.CommonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1;
import ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1;
import ru.yandex.taxi.transition.AttachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1;

/* loaded from: classes6.dex */
public final class ec3 implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener w;

    public /* synthetic */ ec3(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener, View view, int i) {
        this.a = i;
        this.b = viewTreeObserver;
        this.w = onPreDrawListener;
        this.c = view;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        View view = this.c;
        ViewTreeObserver viewTreeObserver = this.b;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.w;
        switch (i) {
            case 0:
                AttachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1 attachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1 = (AttachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(attachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(attachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
            case 1:
                BaseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1 baseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1 = (BaseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(baseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(baseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
            case 2:
                DefaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1 defaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1 = (DefaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    ((CameraPreview) view).getViewTreeObserver().removeOnPreDrawListener(defaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(defaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
            case 3:
                HubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1 hubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1 = (HubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    ((HubFooterView) view).getViewTreeObserver().removeOnPreDrawListener(hubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(hubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
            case 4:
                ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1 imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1 = (ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
            case 5:
                ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3 imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3 = (ImageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(imageLoaderDelegateImpl$loadImage$$inlined$doOnPreDrawCancelable$3);
                    break;
                }
            case 6:
                CommonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1 commonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1 = (CommonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    ((ImageView) view).getViewTreeObserver().removeOnPreDrawListener(commonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(commonImageLoaderDelegate$loadStoryPreview$$inlined$doOnPreDraw$1);
                    break;
                }
            default:
                OrderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1 orderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1 = (OrderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1) onPreDrawListener;
                if (!viewTreeObserver.isAlive()) {
                    ((OrderInfoModalView) view).getViewTreeObserver().removeOnPreDrawListener(orderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1);
                    break;
                } else {
                    viewTreeObserver.removeOnPreDrawListener(orderInfoModalView$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1);
                    break;
                }
        }
    }
}
