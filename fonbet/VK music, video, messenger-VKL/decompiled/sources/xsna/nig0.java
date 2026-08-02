package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import xsna.us2;

/* compiled from: ReviewsMapper.kt */
/* loaded from: classes18.dex */
public final class nig0 {
    public static final void a(us2.b bVar, String str, String str2) {
        StringBuilder sb = bVar.b;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (sb.length() > 0) {
            bVar.g("\n\n");
        }
        int length = sb.length();
        bVar.g(str.concat(": "));
        bVar.d(new hik0(0L, 0L, b6s.i, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), length, str.length() + length);
        bVar.g(str2);
    }

    public static final us2 b(Context context, String str, String str2, String str3) {
        us2.b bVar = new us2.b();
        a(bVar, context.getString(R.string.market_item_review_item_pros), str);
        a(bVar, context.getString(R.string.market_item_review_item_cons), str2);
        a(bVar, context.getString(R.string.market_item_review_item_comment), str3);
        return bVar.n();
    }

    public static final SpannableStringBuilder c(Context context, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            String string = context.getString(R.string.market_item_review_item_pros);
            Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            spannableStringBuilder.append(string, new qup0(a), 33);
            spannableStringBuilder.append((CharSequence) "\n".concat(str));
        }
        if (str2 != null && str2.length() != 0) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n");
            }
            String string2 = context.getString(R.string.market_item_review_item_cons);
            Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
            TextSizeUnit textSizeUnit2 = TextSizeUnit.SP;
            spannableStringBuilder.append(string2, new qup0(a2), 33);
            spannableStringBuilder.append((CharSequence) "\n".concat(str2));
        }
        if (str3 != null && str3.length() != 0) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n");
            }
            String string3 = context.getString(R.string.market_item_review_item_comment);
            Typeface a3 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
            TextSizeUnit textSizeUnit3 = TextSizeUnit.SP;
            spannableStringBuilder.append(string3, new qup0(a3), 33);
            spannableStringBuilder.append((CharSequence) "\n".concat(str3));
        }
        return spannableStringBuilder;
    }
}
