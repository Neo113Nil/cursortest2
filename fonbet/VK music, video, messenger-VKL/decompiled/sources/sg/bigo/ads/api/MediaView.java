package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.core.adview.f;
import sg.bigo.ads.core.adview.h;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.dm.e;

/* loaded from: classes9.dex */
public class MediaView extends sg.bigo.ads.api.a<f> {

    public interface a {
        void a(sg.bigo.ads.cz.b bVar);

        void a(boolean z);

        boolean a();

        void b();
    }

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ f a() {
        return new f(this);
    }

    public final float b(int i, int i2) {
        f viewImpl = getViewImpl();
        return viewImpl.c == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : viewImpl.c() > viewImpl.d() ? (((viewImpl.c() * i2) / viewImpl.d()) * 1.0f) / i : (((viewImpl.d() * i) / viewImpl.c()) * 1.0f) / i2;
    }

    public final void c() {
        f viewImpl = getViewImpl();
        AdImageView adImageView = viewImpl.c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            viewImpl.c.a();
            viewImpl.c = null;
        }
        sg.bigo.ads.cz.f fVar = viewImpl.b;
        if (fVar != null) {
            fVar.d();
            viewImpl.b = null;
        }
        e eVar = viewImpl.h;
        if (eVar != null) {
            eVar.destroy();
            viewImpl.h = null;
        }
    }

    public View getImage() {
        return getViewImpl().c;
    }

    @Nullable
    public VideoController getVideoController() {
        return getViewImpl().f;
    }

    public void setImageBlurBorder(boolean z) {
        getViewImpl().g = z;
    }

    public void setMediaAreaClickable(boolean z) {
        getViewImpl().e = Boolean.valueOf(z);
    }

    public void setOnAdClickListener(h hVar) {
        getViewImpl().i = hVar;
    }

    public void setOtherClickAreaClick(boolean z) {
        getViewImpl().d = Boolean.valueOf(z);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Bitmap bitmap) {
        getViewImpl().g = false;
        f viewImpl = getViewImpl();
        if (bitmap != null) {
            int a2 = sg.bigo.ads.common.utils.f.a(viewImpl.a.getContext(), 10);
            int a3 = sg.bigo.ads.common.utils.f.a(viewImpl.a.getContext(), 4);
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewImpl.a.getContext());
            roundedFrameLayout.setCornerRadius(a3);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z = (width == height && viewImpl.a.getWidth() <= viewImpl.a.getHeight()) || width > height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? -1 : -2, z ? -2 : -1, 17);
            layoutParams.setMargins(a2, a2, a2, a2);
            roundedFrameLayout.setLayoutParams(layoutParams);
            AdImageView adImageView = new AdImageView(viewImpl.a.getContext());
            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            v.a(adImageView, roundedFrameLayout, null, -1);
            v.a(roundedFrameLayout, viewImpl.a, null, -1);
            adImageView.setBlurBorder(viewImpl.g);
            adImageView.setImageBitmap(bitmap);
        }
    }

    @NonNull
    public final a b() {
        return getViewImpl();
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(@NonNull String str) {
        getViewImpl().a(str);
    }

    public final void a(@NonNull o oVar, @Nullable g gVar) {
        getViewImpl().a(oVar, gVar);
    }

    public final void a(@NonNull sg.bigo.ads.cp.a aVar, @NonNull p pVar, sg.bigo.ads.dk.c cVar) {
        getViewImpl().a(aVar, pVar, cVar);
    }

    public final void a(@NonNull sg.bigo.ads.cz.d dVar) {
        getViewImpl().a(dVar);
    }
}
