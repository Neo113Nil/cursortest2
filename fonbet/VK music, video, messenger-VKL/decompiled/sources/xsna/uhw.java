package xsna;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class uhw implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uhw(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebImageSize e;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                VKImageController vKImageController = (VKImageController) obj3;
                WebImage webImage = (WebImage) obj2;
                VKImageController.b bVar = (VKImageController.b) obj;
                int measuredWidth = vKImageController.getView().getMeasuredWidth();
                if (measuredWidth > 0) {
                    vKImageController.f((webImage == null || (e = webImage.e(measuredWidth)) == null) ? null : e.b, bVar);
                    break;
                }
                break;
            case 1:
                UnityAds.load$lambda$22$lambda$21$lambda$20((IUnityAdsLoadListener) obj3, (String) obj2, (Throwable) obj);
                break;
            default:
                String str = (String) obj2;
                List list = zfz0.d;
                qjz0 qjz0Var = xr50.d;
                Objects.requireNonNull(qjz0Var);
                o8z0.d(new p6z0((zfz0) obj3, (t8z0) obj, u3z0.a(str, 1, qjz0Var), str, 1));
                break;
        }
    }
}
