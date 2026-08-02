package xsna;

import android.content.Context;
import android.text.Annotation;
import android.text.SpannedString;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.e4s;

/* compiled from: FollowersModeSettingsDataBuilder.kt */
/* loaded from: classes5.dex */
public final class f4s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static e4s a(Context context, boolean z) {
        e4s.a aVar;
        ?? r4;
        boolean z2 = !z;
        if (z) {
            CharSequence text = context.getText(R.string.user_profile_edit_silent_mode_enabled_description);
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                Object[] spans = spannedString.getSpans(0, spannedString.length(), Annotation.class);
                r4 = new ArrayList();
                for (Object obj : spans) {
                    if (epx.f(((Annotation) obj).getValue(), "silent_mode")) {
                        r4.add(obj);
                    }
                }
            } else {
                r4 = EmptyList.b;
            }
            s8u0 s8u0Var = new s8u0(0);
            int i = s8u0Var.i(new klv0(VkTypographyToken.FootnoteNormal, VkColorToken.TextSecondary));
            try {
                s8u0Var.e(text.toString());
                if (text instanceof SpannedString) {
                    for (Annotation annotation : (Iterable) r4) {
                        s8u0Var.d(new klv0(VkTypographyToken.FootnoteNormal, VkColorToken.TextLink), ((SpannedString) text).getSpanStart(annotation), ((SpannedString) text).getSpanEnd(annotation));
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i);
                aVar = new e4s.a.b(s8u0Var);
            } catch (Throwable th) {
                s8u0Var.f(i);
                throw th;
            }
        } else {
            aVar = e4s.a.C2777a.b;
        }
        return new e4s(z2, aVar);
    }
}
