package xsna;

import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: DurationStaticLayouts.java */
/* loaded from: classes17.dex */
public final class joo {
    public static final TextPaint a;
    public static final int b;
    public static final HashMap<Integer, StaticLayout> c;

    static {
        TextPaint textPaint = new TextPaint(1);
        a = textPaint;
        b = iah0.f().widthPixels / 3;
        textPaint.setColor(-1);
        textPaint.setTextSize((int) iah0.y(14));
        textPaint.setShadowLayer(2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -16777216);
        c = new HashMap<>();
    }
}
