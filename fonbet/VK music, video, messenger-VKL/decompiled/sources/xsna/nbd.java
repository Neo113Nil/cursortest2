package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ClipReactionsLabelFormatter.kt */
/* loaded from: classes4.dex */
public final class nbd {
    public static String a(int i, int i2) {
        String str;
        String str2;
        if (i > 0) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            long j = i;
            str = enj.g(context.getResources(), R.plurals.counter_likes, j, R.string.counter_likes_many_default, new Object[]{uqm0.h(j)});
        } else {
            str = null;
        }
        if (i2 > 0) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            long j2 = i2;
            str2 = enj.g(context2.getResources(), R.plurals.counter_views, j2, R.string.counter_views_many_default, new Object[]{uqm0.h(j2)});
        } else {
            str2 = null;
        }
        if (str != null && str2 != null) {
            return pzl.b(str, " · ", str2);
        }
        if (str != null) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return str2;
    }
}
