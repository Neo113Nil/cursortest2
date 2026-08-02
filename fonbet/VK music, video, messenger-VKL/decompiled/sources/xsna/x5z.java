package xsna;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x5z implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x5z(int i, w920 w920Var) {
        this.c = i;
        this.d = w920Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                ImageRequestBuilder h = ImageRequestBuilder.h((Uri) obj);
                int i3 = VKImageView.l;
                h.e = eng0.c;
                if (i2 != 0) {
                    h.d = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, i2, 12);
                }
                return rhs.b().g(h.a());
            default:
                StringBuilder b = ji.b(i2, "loadNext: from cache with targetChunkSize=", " historySize=");
                b.append(((w920) obj).c().size());
                return b.toString();
        }
    }

    public /* synthetic */ x5z(Uri uri, int i) {
        this.d = uri;
        this.c = i;
    }
}
