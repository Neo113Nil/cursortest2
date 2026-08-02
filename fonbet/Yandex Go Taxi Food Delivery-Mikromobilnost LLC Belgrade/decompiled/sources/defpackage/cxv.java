package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public abstract class cxv {
    public static final Map a = b.i(new Pair(Integer.valueOf(ung0.ybColor_fill_color1_200), Integer.valueOf(ung0.ybColor_fill_color1_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color2_200), Integer.valueOf(ung0.ybColor_fill_color2_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color3_200), Integer.valueOf(ung0.ybColor_fill_color3_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color4_200), Integer.valueOf(ung0.ybColor_fill_color4_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color5_200), Integer.valueOf(ung0.ybColor_fill_color5_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color6_200), Integer.valueOf(ung0.ybColor_fill_color6_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color7_200), Integer.valueOf(ung0.ybColor_fill_color7_600)), new Pair(Integer.valueOf(ung0.ybColor_fill_color8_200), Integer.valueOf(ung0.ybColor_fill_color8_600)));

    public static final BitmapDrawable a(Context context, int i, int i2, String str) {
        List W;
        String str2;
        String ch;
        int abs = Math.abs(str.hashCode());
        Map map = a;
        int size = abs % (map.size() - 1);
        CoreShapeDrawable g = jra1.g(i, i2, str, context, a.J0(map.keySet()));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        g.setBounds(0, 0, i, i2);
        g.draw(canvas);
        Paint paint = new Paint();
        paint.setColor(rje.a(context, ((Number) a.L(map.values(), size)).intValue()));
        paint.setAntiAlias(true);
        paint.setTextSize(context.getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(wuj0.b(x4h0.ya_medium, context));
        float descent = (i2 / 2.0f) - ((paint.descent() + paint.ascent()) / 2.0f);
        W = evu0.W(str, new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        String str3 = (String) a.S(0, W);
        Character v0 = str3 != null ? gvu0.v0(str3) : null;
        String str4 = "";
        if (v0 == null || (str2 = v0.toString()) == null) {
            str2 = "";
        }
        if (W.size() == 2) {
            String str5 = (String) a.S(1, W);
            Character v02 = str5 != null ? gvu0.v0(str5) : null;
            if (v02 != null && (ch = v02.toString()) != null) {
                str4 = ch;
            }
        }
        canvas.drawText(str2.concat(str4), i / 2.0f, descent, paint);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
