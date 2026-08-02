package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.HashMap;

/* compiled from: CorruptedFileDrawable.java */
/* loaded from: classes15.dex */
public final class owj extends Drawable {
    public static final HashMap<String, StaticLayout> a = new HashMap<>();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(-16777216);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        String str = width + BundleUtil.UNDERLINE_TAG + height;
        HashMap<String, StaticLayout> hashMap = a;
        StaticLayout staticLayout = hashMap.get(str);
        if (staticLayout == null) {
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(-1);
            textPaint.setAntiAlias(true);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(Math.min(width, height) / 12);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            StaticLayout staticLayout2 = new StaticLayout(context.getResources().getString(R.string.picker_file_corrupted_or_deleted), textPaint, Math.min(width, height), Layout.Alignment.ALIGN_NORMAL, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            hashMap.put(width + BundleUtil.UNDERLINE_TAG + height, staticLayout2);
            staticLayout = staticLayout2;
        }
        int save = canvas.save();
        canvas.translate(staticLayout.getWidth() / 2, (canvas.getHeight() / 2) - (staticLayout.getHeight() / 2));
        staticLayout.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
