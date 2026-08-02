package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PostingDateFormatter.kt */
/* loaded from: classes4.dex */
public final class gec0 {
    public static String a(Context context, Date date) {
        return pvo0.j(date.getTime(), false, false) + ' ' + context.getString(R.string.date_at) + ' ' + new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
    }
}
