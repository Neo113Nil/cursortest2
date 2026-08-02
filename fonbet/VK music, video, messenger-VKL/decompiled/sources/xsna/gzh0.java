package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.vkontakte.android.R;

/* compiled from: SearchSuggestHolder.kt */
/* loaded from: classes5.dex */
public final class gzh0 extends vif0<Object> {
    public static final /* synthetic */ int n = 0;

    /* compiled from: SearchSuggestHolder.kt */
    public static final class a {
        public static SpannableString a(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(context.getResources().getString(R.string.discover_search_suggest));
            spannableStringBuilder.append(" ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            qaz qazVar = new qaz(new he40(str, 10));
            qazVar.b = true;
            spannableStringBuilder.setSpan(qazVar, length, spannableStringBuilder.length(), 0);
            return SpannableString.valueOf(spannableStringBuilder);
        }
    }
}
