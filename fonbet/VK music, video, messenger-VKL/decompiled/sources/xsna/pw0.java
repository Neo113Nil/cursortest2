package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;

/* compiled from: AdsItemDescriptionStateHelper.kt */
/* loaded from: classes17.dex */
public final class pw0 {
    public final xod a;

    public pw0(xod xodVar) {
        this.a = xodVar;
    }

    public static SpannableStringBuilder b(Context context, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (myc0.f(charSequence)) {
            Typeface a = cqi.a(Font.Companion, FontFamily.REGULAR, 13.0f, context);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            spannableStringBuilder.append(charSequence, new qup0(a), 33);
        }
        return spannableStringBuilder;
    }

    public static AppCompatTextView c(Context context) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Paragraph));
        appCompatTextView.setMaxLines(1);
        com.vk.typography.b.k(appCompatTextView, FontFamily.REGULAR, null, 6);
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec((iah0.f().widthPixels - e3m.a(R.dimen.clip_description_end_margin, context)) - e3m.a(R.dimen.clip_description_start_margin, context), 1073741824), 0);
        return appCompatTextView;
    }

    public final CharSequence a(String str) {
        return this.a.a(str != null ? drm0.p0(str).toString() : null, HashtagParseMode.CLIPS, MentionsParseMode.CLIPS, true);
    }
}
