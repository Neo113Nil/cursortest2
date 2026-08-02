package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.text.DecimalFormat;

/* compiled from: VideoSegmentFormatter.kt */
/* loaded from: classes14.dex */
public final class ift0 implements com.vk.core.utils.b {
    @Override // com.vk.core.utils.b
    public final SpannableStringBuilder a(Context context, VideoFile videoFile) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ylw ylwVar = new ylw(R.drawable.vk_icon_view_12);
        ylwVar.c = 3;
        ylwVar.h = R.attr.vk_ui_icon_tertiary;
        ylwVar.f = iah0.a(-1);
        spannableStringBuilder.append((CharSequence) ylwVar.b(context));
        spannableStringBuilder.append((CharSequence) " ");
        if (uqm0.g(videoFile.L8())) {
            spannableStringBuilder.append((CharSequence) uqm0.f(videoFile.L8()));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) String.valueOf(videoFile.L8()));
        return spannableStringBuilder;
    }

    @Override // com.vk.core.utils.b
    public final String b(Context context, VideoFile videoFile) {
        if (videoFile.L8() < 0) {
            return "";
        }
        long L8 = videoFile.L8();
        gpt0 gpt0Var = gpt0.a;
        Resources resources = context.getResources();
        DecimalFormat decimalFormat = z8s.a;
        return z8s.b(resources, L8, R.plurals.video_views, R.string.video_views_count_formatted);
    }

    @Override // com.vk.core.utils.b
    public final CharSequence c(Context context, MusicVideoFile musicVideoFile) {
        return s490.d(context, s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary);
    }

    public final void d(TextView textView, VideoFile videoFile) {
        MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
        if (musicVideoFile == null || !musicVideoFile.A1) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView.getContext()), (Drawable) null);
            textView.setCompoundDrawablePadding(iah0.a(4));
        }
    }
}
