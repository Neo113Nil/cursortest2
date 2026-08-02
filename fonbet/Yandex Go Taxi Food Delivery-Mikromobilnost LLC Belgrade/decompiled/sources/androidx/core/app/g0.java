package androidx.core.app;

import android.net.Uri;
import android.os.Bundle;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class g0 {
    public final CharSequence a;
    public final long b;
    public final x0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public g0(CharSequence charSequence, long j, x0 x0Var) {
        this.a = charSequence;
        this.b = j;
        this.c = x0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g0 g0Var = (g0) arrayList.get(i);
            x0 x0Var = g0Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = g0Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong(RemoteBioParameters.TIME, g0Var.b);
            if (x0Var != null) {
                bundle.putCharSequence("sender", x0Var.a);
                bundle.putParcelable("sender_person", f0.a(x0Var.a()));
            }
            String str = g0Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = g0Var.f;
            if (uri != null) {
                bundle.putParcelable(LaunchBrowserActivity.KEY_URI, uri);
            }
            Bundle bundle2 = g0Var.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
