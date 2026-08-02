package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.image_viewer.GalleryViewerModalView;
import java.util.Iterator;
import kotlin.collections.a;
import ru.yandex.taxi.design.ScalableImageView;
import ru.yandex.taxi.design.StoryProgressComponent;

/* loaded from: classes12.dex */
public final class iss implements ct31 {
    public final /* synthetic */ GalleryViewerModalView a;
    public final /* synthetic */ jss b;

    public iss(GalleryViewerModalView galleryViewerModalView, jss jssVar) {
        this.a = galleryViewerModalView;
        this.b = jssVar;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.a.wasManuallyScrolled = true;
        }
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        int i2;
        yrs sliderAdapter;
        boolean z;
        fss fssVar;
        int i3;
        ScalableImageView scalableImageView;
        GalleryViewerModalView galleryViewerModalView = this.a;
        galleryViewerModalView.currentImageIndex = i;
        StoryProgressComponent storyProgressComponent = this.b.d;
        i2 = galleryViewerModalView.currentImageIndex;
        storyProgressComponent.setCurrentMedia(i2 + 1).invalidateComponent();
        sliderAdapter = galleryViewerModalView.getSliderAdapter();
        Iterator it = a.O0(sliderAdapter.f).iterator();
        while (true) {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                break;
            }
            FrameLayout frameLayout = (FrameLayout) sliderAdapter.c.findViewWithTag(((kps0) ((hrv) irvVar.next()).b).b);
            if (frameLayout != null && (scalableImageView = (ScalableImageView) frameLayout.findViewById(qih0.image)) != null) {
                scalableImageView.resetZoomAnimated();
            }
        }
        z = galleryViewerModalView.wasManuallyScrolled;
        if (z) {
            fssVar = galleryViewerModalView.galleryViewerAnalyticsProxy;
            i3 = galleryViewerModalView.currentImageIndex;
            fssVar.o(i3 + 1);
            galleryViewerModalView.wasManuallyScrolled = false;
        }
    }
}
