package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.newsfeed.impl.data.network.dto.mappers.NewsfeedItemMapper;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class bm01 implements ttz0 {
    public final Object b;

    public /* synthetic */ bm01(Object obj) {
        this.b = obj;
    }

    public String a() {
        Bundle bundle = (Bundle) this.b;
        if (bundle == null || !m63.g(bundle) || bundle.getBoolean("promo_ok")) {
            return null;
        }
        String string = bundle.getString("white_label_flow_input_sat");
        if (string != null) {
            return string;
        }
        par0.a.getClass();
        par0.b("White label flow input SAT is null");
        return null;
    }

    public void b(String str, String str2, String str3) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.IN_APP_REVIEW.h(), null, str, null, str2, null, (String) com.vk.core.apps.a.c.getValue(), null, (String) this.b, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1366, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
        L.e("InAppReview", str + '-' + str2);
    }

    @Override // xsna.ttz0
    public void zza(@Nullable Bitmap bitmap) {
        o100 o100Var = hp01.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int a = (int) uq.a(f, 9.0f, 16.0f, 0.5f);
            float f2 = (a - height) / 2.0f;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, a, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((hp01) this.b).c(0, bitmap2);
    }

    public bm01(bpn0 bpn0Var) {
        this.b = new NewsfeedItemMapper(bpn0Var);
    }
}
