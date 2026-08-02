package xsna;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import xsna.vdo0;

/* compiled from: StaticLayoutHelper.java */
/* loaded from: classes2.dex */
public final class byk0 {
    public static StaticLayout a(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, vdo0.e eVar, int i5, boolean z2) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, 0, i, textPaint, i2).setAlignment(alignment).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i3).setMaxLines(i4).setTextDirection(eVar == vdo0.a ? TextDirectionHeuristics.LTR : eVar == vdo0.b ? TextDirectionHeuristics.RTL : eVar == vdo0.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : eVar == vdo0.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : eVar == vdo0.e ? TextDirectionHeuristics.ANYRTL_LTR : eVar == vdo0.f.b ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR).setBreakStrategy(i5).setHyphenationFrequency(0).setIndents(null, null);
        indents.setJustificationMode(0);
        indents.setUseLineSpacingFromFallbacks(z2);
        return indents.build();
    }
}
