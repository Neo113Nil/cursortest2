package xsna;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.io.InputStream;
import xsna.b330;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes12.dex */
public final class bx3<Data> implements b330<Uri, Data> {
    public final AssetManager a;
    public final Object b;

    /* compiled from: AssetUriLoader.java */
    public interface a<Data> {
        buk<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements c330<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // xsna.bx3.a
        public final buk<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new j8r(assetManager, str);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, AssetFileDescriptor> d(j540 j540Var) {
            return new bx3(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements c330<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // xsna.bx3.a
        public final buk<InputStream> a(AssetManager assetManager, String str) {
            return new pom0(assetManager, str);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, InputStream> d(j540 j540Var) {
            return new bx3(this.a, this);
        }
    }

    public bx3(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xsna.bx3$a] */
    @Override // xsna.b330
    public final b330.a a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        return new b330.a(new qp70(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return X3.i.b.equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
