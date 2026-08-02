package xsna;

import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BackgroundPrefetchUtils.kt */
/* loaded from: classes2.dex */
public final class fx5 {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new la0(2));

    public static x9g0 a(Context context) {
        HashSet hashSet = iah0.a;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        float max = Math.max(i, i2);
        if (max > 2048.0f) {
            return new x9g0(max, i, i2, 8);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public static ImageRequestBuilder b(Uri uri, x9g0 x9g0Var) {
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        h.b = ImageRequest.RequestLevel.FULL_FETCH;
        h.j = Priority.HIGH;
        h.d = x9g0Var;
        h.f = (liw) a.getValue();
        h.h = false;
        return h;
    }
}
