package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import xsna.b330;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes12.dex */
public final class jfq0<Data> implements b330<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));
    public final b330<e1u, Data> a;

    /* compiled from: UrlUriLoader.java */
    public static class a implements c330<Uri, InputStream> {
        @Override // xsna.c330
        @NonNull
        public final b330<Uri, InputStream> d(j540 j540Var) {
            return new jfq0(j540Var.b(e1u.class, InputStream.class));
        }
    }

    public jfq0(b330<e1u, Data> b330Var) {
        this.a = b330Var;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        return this.a.a(new e1u(uri.toString()), i, i2, au80Var);
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
