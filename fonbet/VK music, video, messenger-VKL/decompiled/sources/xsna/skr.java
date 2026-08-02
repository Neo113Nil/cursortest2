package xsna;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: FirebaseStorage.java */
/* loaded from: classes13.dex */
public final class skr {

    @NonNull
    public final vhr a;

    @Nullable
    public final f9e0<yfx> b;

    @Nullable
    public final f9e0<wfx> c;

    @Nullable
    public final String d;

    public skr(@Nullable String str, @NonNull vhr vhrVar, @Nullable f9e0<yfx> f9e0Var, @Nullable f9e0<wfx> f9e0Var2) {
        this.d = str;
        this.a = vhrVar;
        this.b = f9e0Var;
        this.c = f9e0Var2;
        if (f9e0Var2 == null || f9e0Var2.get() == null) {
            return;
        }
        f9e0Var2.get().a();
    }

    public static skr a(@NonNull vhr vhrVar, @Nullable Uri uri) {
        skr skrVar;
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        tkr tkrVar = (tkr) vhrVar.b(tkr.class);
        exc0.j(tkrVar, "Firebase Storage component is not present.");
        synchronized (tkrVar) {
            skrVar = (skr) tkrVar.a.get(host);
            if (skrVar == null) {
                skrVar = new skr(host, tkrVar.b, tkrVar.c, tkrVar.d);
                tkrVar.a.put(host, skrVar);
            }
        }
        return skrVar;
    }
}
