package defpackage;

import android.content.Context;
import android.net.Uri;
import com.fluttercandies.photo_manager.core.utils.a;
import com.fluttercandies.photo_manager.core.utils.b;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class chb0 {
    public static final ExecutorService d = Executors.newFixedThreadPool(5);
    public final Context a;
    public boolean b;
    public final ArrayList c = new ArrayList();

    public chb0(Context context) {
        this.a = context;
    }

    public final b a() {
        return !this.b ? a.b : hpf.b;
    }

    public final Uri b(String str) {
        b a = a();
        v2v v2vVar = b.a;
        d93 A = a.A(this.a, str);
        if (A != null) {
            return A.a();
        }
        kbs.g("Failed to find asset ".concat(str));
        return null;
    }
}
