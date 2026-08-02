package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vm8 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vm8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ym8 ym8Var = (ym8) this.c;
                ym8Var.g.a();
                ym8Var.a.b();
                return null;
            default:
                yj9 yj9Var = (yj9) this.c;
                ImageSize Fb = yj9Var.c.Fb(iah0.f().widthPixels, false);
                int b = cn70.b(360);
                float f = b;
                int b2 = an10.b(f / Fb.E0());
                Bitmap createBitmap = Bitmap.createBitmap(b, b2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(dhr0.t.c(R.attr.vk_ui_image_placeholder_alpha));
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, b2, paint);
                yj9Var.a(canvas, b, b2);
                return createBitmap;
        }
    }
}
