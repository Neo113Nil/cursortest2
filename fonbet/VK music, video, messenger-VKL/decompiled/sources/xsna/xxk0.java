package xsna;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StaticLayoutBuilder.kt */
/* loaded from: classes17.dex */
public final class xxk0 {
    public final CharSequence a;
    public final TextPaint b;
    public final int c;
    public final int d;
    public final Layout.Alignment e;
    public final float f;
    public final float g;
    public final TextUtils.TruncateAt h;
    public final int i;
    public final int j;
    public final TextDirectionHeuristic k;

    public xxk0(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
        i = (i3 & 4) != 0 ? (int) textPaint.measureText(charSequence.toString()) : i;
        int length = charSequence.length();
        alignment = (i3 & 32) != 0 ? Layout.Alignment.ALIGN_NORMAL : alignment;
        f = (i3 & 64) != 0 ? 1.0f : f;
        f2 = (i3 & 128) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f2;
        truncateAt = (i3 & 512) != 0 ? null : truncateAt;
        i2 = (i3 & 2048) != 0 ? truncateAt == null ? Integer.MAX_VALUE : 1 : i2;
        textDirectionHeuristic = (i3 & 4096) != 0 ? TextDirectionHeuristics.LTR : textDirectionHeuristic;
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = length;
        this.e = alignment;
        this.f = f;
        this.g = f2;
        this.h = truncateAt;
        this.i = i;
        this.j = i2;
        this.k = textDirectionHeuristic;
    }

    public final StaticLayout a() {
        return StaticLayout.Builder.obtain(this.a, 0, this.d, this.b, this.c).setAlignment(this.e).setEllipsize(this.h).setEllipsizedWidth(this.i).setIncludePad(false).setLineSpacing(this.g, this.f).setMaxLines(this.j).setTextDirection(this.k).build();
    }
}
