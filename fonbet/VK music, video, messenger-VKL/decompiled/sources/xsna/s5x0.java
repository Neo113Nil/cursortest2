package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vk.log.L;
import com.vk.medianative.MediaNative;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import ru.ok.call_effects.AnimojiEffect;

/* compiled from: VoipVmojiDrawable.kt */
/* loaded from: classes7.dex */
public final class s5x0 extends Drawable {
    public static final /* synthetic */ int e = 0;
    public final Paint a = new Paint(2);
    public final Bitmap b;
    public final Rect c;
    public final int d;

    public s5x0(CallId callId, String str, int i, int i2, boolean z) {
        Bitmap softwareRasterizeSvg;
        ArrayList arrayList = ds2.a;
        this.d = ds2.a(str, callId.b);
        i2 = z ? Math.min(i, i2) : i2;
        if (MediaNative.isGLEffectsLibSupported()) {
            softwareRasterizeSvg = AnimojiEffect.Companion.softwareRasterizeSvg(str, i, i2);
        } else {
            L.l("VoipVmojiDrawable", "tried to resterize vmoji without attached GLEffectsLib");
            softwareRasterizeSvg = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        this.b = softwareRasterizeSvg;
        this.c = softwareRasterizeSvg != null ? new Rect(0, 0, softwareRasterizeSvg.getWidth(), softwareRasterizeSvg.getHeight()) : new Rect(0, 0, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.c, getBounds(), this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
