package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import xsna.b330;
import xsna.gso0;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes12.dex */
public final class ez10 implements b330<Uri, InputStream> {
    public final Context a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements c330<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, InputStream> d(j540 j540Var) {
            return new ez10(this.a);
        }
    }

    public ez10(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // xsna.b330
    public final b330.a<InputStream> a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        qp70 qp70Var = new qp70(uri2);
        Context context = this.a;
        return new b330.a<>(qp70Var, gso0.c(context, uri2, new gso0.a(context.getContentResolver())));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return c4g0.y(uri2) && !uri2.getPathSegments().contains("video");
    }
}
