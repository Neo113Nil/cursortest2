package defpackage;

import android.net.Uri;
import kotlin.Pair;

/* loaded from: classes5.dex */
public abstract class ccn {
    public final String a;
    public final Object b;
    public final boolean c;
    public final wls d;
    public final boolean e;

    public ccn(String str, Object obj, boolean z, wls wlsVar, boolean z2) {
        this.a = str;
        this.b = obj;
        this.c = z;
        this.d = wlsVar;
        this.e = z2;
    }

    public Pair a() {
        return null;
    }

    public void b(Uri.Builder builder) {
        Pair a = a();
        if (a != null) {
            builder.appendQueryParameter((String) a.getFirst(), (String) a.getSecond());
        }
    }

    public /* synthetic */ ccn(String str, Object obj, wls wlsVar) {
        this(str, obj, false, wlsVar, false);
    }
}
