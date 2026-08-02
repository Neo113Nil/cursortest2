package xsna;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes.dex */
public final class j4k {
    public qf7 a;
    public ab8 b;

    public final void a(int i, @Nullable Bundle bundle) {
        Locale locale = Locale.US;
        bundle.toString();
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            yx1 yx1Var = "clx".equals(bundle2.getString("_o")) ? this.a : this.b;
            if (yx1Var == null) {
                return;
            }
            yx1Var.onEvent(string, bundle2);
        }
    }
}
