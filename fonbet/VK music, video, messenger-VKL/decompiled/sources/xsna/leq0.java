package xsna;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import xsna.b330;

/* compiled from: UriLoader.java */
/* loaded from: classes12.dex */
public final class leq0<Data> implements b330<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(X3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "android.resource")));
    public final Object a;

    /* compiled from: UriLoader.java */
    public static final class a implements c330<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xsna.leq0.c
        public final buk<AssetFileDescriptor> a(Uri uri) {
            return new yw3(this.a, uri);
        }

        @Override // xsna.c330
        public final b330<Uri, AssetFileDescriptor> d(j540 j540Var) {
            return new leq0(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements c330<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xsna.leq0.c
        public final buk<ParcelFileDescriptor> a(Uri uri) {
            return new k8r(this.a, uri);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, ParcelFileDescriptor> d(j540 j540Var) {
            return new leq0(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        buk<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements c330<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // xsna.leq0.c
        public final buk<InputStream> a(Uri uri) {
            return new wom0(this.a, uri);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, InputStream> d(j540 j540Var) {
            return new leq0(this);
        }
    }

    public leq0(c<Data> cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, xsna.leq0$c] */
    @Override // xsna.b330
    public final b330.a a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        return new b330.a(new qp70(uri2), this.a.a(uri2));
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
