package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public final class uyo0 extends ContextWrapper {
    public static final Object a = null;

    public static void a(@NonNull Context context) {
        if ((context instanceof uyo0) || (context.getResources() instanceof xyo0)) {
            return;
        }
        context.getResources();
        int i = hlr0.b;
    }
}
