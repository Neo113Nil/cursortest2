package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.media.MediaDescriptionCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: AndroidAutoApiMappings.kt */
/* loaded from: classes16.dex */
public final class b22 {

    /* compiled from: AndroidAutoApiMappings.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayState.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoopMode.values().length];
            try {
                iArr2[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoopMode.TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final MediaDescriptionCompat a(Context context, String str, boolean z) {
        Bitmap c;
        Bitmap bitmap = null;
        if (!z) {
            bn40.h("Non-shuffled fast play not yet implemented");
            return null;
        }
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_shuffle_outline_56, context);
        if (a2 != null && (c = xjo.c(a2, 0, 0, 7)) != null) {
            Bitmap.Config config = c.getConfig();
            if (config == null) {
                bitmap = c;
            } else {
                bitmap = c.copy(config, true);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            }
        }
        return new MediaDescriptionCompat.Builder().setMediaId(str).setTitle(context.getString(R.string.android_auto_shuffle)).setIconBitmap(bitmap).build();
    }
}
