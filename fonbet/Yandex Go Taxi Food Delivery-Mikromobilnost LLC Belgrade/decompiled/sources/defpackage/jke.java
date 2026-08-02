package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes11.dex */
public class jke {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
