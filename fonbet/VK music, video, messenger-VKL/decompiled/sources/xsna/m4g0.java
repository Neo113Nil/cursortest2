package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.e3m;

/* compiled from: ReplyStickerOverlay.kt */
/* loaded from: classes15.dex */
public interface m4g0 {
    public static final a a = a.a;

    /* compiled from: ReplyStickerOverlay.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final float b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        public static final Drawable g;

        static {
            float a2 = iah0.a(14);
            b = a2;
            new s0w0(a2, 6);
            c = iah0.a(16);
            d = iah0.a(32);
            e = iah0.a(108);
            f = iah0.a(PsExtractor.AUDIO_STREAM);
            iah0.a(36);
            iah0.a(18);
            iah0.a(12);
            iah0.a(10);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            e3m.a aVar = e3m.a;
            g = m33.a(R.drawable.bg_card_elevation_no_fill_16, context);
        }

        public static float a(Context context) {
            HashSet hashSet = iah0.a;
            float f2 = context.getResources().getDisplayMetrics().widthPixels - e;
            Float valueOf = Float.valueOf(0.5625f);
            if (Float.isNaN(0.5625f) || 0.5625f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                valueOf = null;
            }
            return (((f2 / (valueOf != null ? valueOf.floatValue() : 0.5625f)) + c) + d) + ((float) f) > ((float) iah0.f().heightPixels) ? (context.getResources().getDisplayMetrics().heightPixels - r3) * 0.5625f : f2;
        }
    }
}
