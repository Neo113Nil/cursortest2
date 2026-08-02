package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;

/* compiled from: Utils.java */
/* loaded from: classes7.dex */
public final class d3r0 {
    @Nullable
    public static Activity a(Context context) {
        boolean z;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }

    public static int b(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
