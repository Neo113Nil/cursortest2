package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import xsna.b330;

/* compiled from: ResourceUriLoader.java */
/* loaded from: classes12.dex */
public final class cbg0<DataT> implements b330<Uri, DataT> {
    public final Context a;
    public final b330<Integer, DataT> b;

    /* compiled from: ResourceUriLoader.java */
    public static final class a implements c330<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, AssetFileDescriptor> d(@NonNull j540 j540Var) {
            return new cbg0(this.a, j540Var.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    public static final class b implements c330<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Uri, InputStream> d(@NonNull j540 j540Var) {
            return new cbg0(this.a, j540Var.b(Integer.class, InputStream.class));
        }
    }

    public cbg0(Context context, b330<Integer, DataT> b330Var) {
        this.a = context.getApplicationContext();
        this.b = b330Var;
    }

    @Override // xsna.b330
    @Nullable
    public final b330.a a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        b330<Integer, DataT> b330Var = this.b;
        if (size == 1) {
            try {
                int parseInt = Integer.parseInt(uri2.getPathSegments().get(0));
                if (parseInt != 0) {
                    return b330Var.a(Integer.valueOf(parseInt), i, i2, au80Var);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    uri2.toString();
                    return null;
                }
            } catch (NumberFormatException unused) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri2);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return b330Var.a(Integer.valueOf(identifier), i, i2, au80Var);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                uri2.toString();
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            uri2.toString();
        }
        return null;
    }

    @Override // xsna.b330
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority());
    }
}
