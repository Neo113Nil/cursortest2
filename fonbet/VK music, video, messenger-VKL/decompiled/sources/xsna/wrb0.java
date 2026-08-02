package xsna;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.polls.ui.PollStyle;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;

/* compiled from: PollUIBuilder.kt */
/* loaded from: classes18.dex */
public final class wrb0 {
    public final int a = iah0.a(12);
    public final int b = iah0.a(6);

    /* compiled from: PollUIBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PollStyle.values().length];
            try {
                iArr[PollStyle.CONTENT_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PollStyle.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static TextPaint a(PollStyle pollStyle) {
        int i = a.$EnumSwitchMapping$0[pollStyle.ordinal()];
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            Context context = e43.a;
            com.vk.typography.b.c(textPaint, context != null ? context : null, FontFamily.MEDIUM, Float.valueOf(iah0.b(14.0f)), TextSizeUnit.PX);
            return textPaint;
        }
        if (i != 2) {
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setColor(-1);
            Context context2 = e43.a;
            com.vk.typography.b.j(textPaint2, context2 != null ? context2 : null, FontFamily.REGULAR, Float.valueOf(14.0f), 8);
            return textPaint2;
        }
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(-1);
        Context context3 = e43.a;
        com.vk.typography.b.c(textPaint3, context3 != null ? context3 : null, FontFamily.REGULAR, Float.valueOf(iah0.b(15.0f)), TextSizeUnit.PX);
        return textPaint3;
    }

    public static StaticLayout b(String str, int i, TextPaint textPaint, PollStyle pollStyle) {
        return pollStyle == PollStyle.DEFAULT ? new xxk0(str, textPaint, i, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TextUtils.TruncateAt.END, 0, 7672).a() : StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(3).setAlignment(Layout.Alignment.ALIGN_NORMAL).setBreakStrategy(2).build();
    }

    public static TextPaint c(PollStyle pollStyle) {
        int i = a.$EnumSwitchMapping$0[pollStyle.ordinal()];
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            Context context = e43.a;
            com.vk.typography.b.c(textPaint, context != null ? context : null, FontFamily.DISPLAY_MEDIUM, Float.valueOf(iah0.b(17.0f)), TextSizeUnit.PX);
            return textPaint;
        }
        if (i != 2) {
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setColor(-1);
            Context context2 = e43.a;
            com.vk.typography.b.j(textPaint2, context2 != null ? context2 : null, FontFamily.DISPLAY_MEDIUM, Float.valueOf(18.0f), 8);
            return textPaint2;
        }
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(-1);
        Context context3 = e43.a;
        com.vk.typography.b.c(textPaint3, context3 != null ? context3 : null, FontFamily.DISPLAY_MEDIUM, Float.valueOf(iah0.b(16.0f)), TextSizeUnit.PX);
        return textPaint3;
    }

    public static StaticLayout d(int i, TextPaint textPaint, String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setIncludePad(false).setBreakStrategy(2).build();
    }

    public final float e(String str, float f, int i, int i2, TextPaint textPaint) {
        float f2 = f - i2;
        float f3 = this.b;
        return StrictMath.min((((f2 - f3) - i) - f3) - iah0.a(60), textPaint.measureText(str));
    }
}
