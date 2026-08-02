package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.cvu0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\"\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "", "labelResource", "", "upcomingLevelName", "localizeLabel", "(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;", "Landroidx/appcompat/widget/AppCompatTextView;", "distanceView", "metricsView", "localizedDistance", "Lzy11;", "setupDistanceAndMetricsViews", "(Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Ljava/lang/String;)V", "ASCII_DIGITS", "Ljava/lang/String;", "ARABIC_INDIC_DIGITS", "ARABIC_DECIMAL_SEPARATOR", "ARABIC_THOUSANDS_SEPARATOR", "EXTENDED_ARABIC_INDIC_DIGITS", "DIGITS", "REGEX", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN", "Ljava/util/regex/Pattern;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewUtilsKt {
    private static final String ARABIC_DECIMAL_SEPARATOR = "\\u066B";
    private static final String ARABIC_INDIC_DIGITS = "\\u0660-\\u0669";
    private static final String ARABIC_THOUSANDS_SEPARATOR = "\\u066C";
    private static final String ASCII_DIGITS = "\\d";
    private static final String DIGITS = "\\d\\u0660-\\u0669\\u066B\\u066C\\u06F0-\\u06F9";
    private static final String EXTENDED_ARABIC_INDIC_DIGITS = "\\u06F0-\\u06F9";
    private static final String REGEX = "^([\\d\\u0660-\\u0669\\u066B\\u066C\\u06F0-\\u06F9.,]+)\\s+([^\\d\\u0660-\\u0669\\u066B\\u066C\\u06F0-\\u06F9]+)$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static final String localizeLabel(Context context, int i, String str) {
        String string = context.getString(i);
        return str != null ? cvu0.v(string, "{}", str, false) : string;
    }

    public static final void setupDistanceAndMetricsViews(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.find()) {
            appCompatTextView.setText(str);
            appCompatTextView.setVisibility(0);
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView.setText(matcher.group(1));
            appCompatTextView2.setText(matcher.group(2));
            appCompatTextView.setVisibility(0);
            appCompatTextView2.setVisibility(0);
        }
    }
}
