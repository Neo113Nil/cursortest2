package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes12.dex */
public final class oag0 implements mag0<Uri, Drawable> {
    public static final ht80<Resources.Theme> b = new ht80<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, ht80.e);
    public final Context a;

    public oag0(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // xsna.mag0
    @Nullable
    public final /* bridge */ /* synthetic */ hag0<Drawable> a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return c(uri, au80Var);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull Uri uri, @NonNull au80 au80Var) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hag0 c(@NonNull Uri uri, @NonNull au80 au80Var) {
        Context createPackageContext;
        List<String> pathSegments;
        int parseInt;
        Drawable a;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.a;
        if (!authority.equals(context.getPackageName())) {
            try {
                createPackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(i6n0.a(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
            }
            pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = createPackageContext.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    throw new IllegalArgumentException(i6n0.a(uri, "Failed to find resource id for: "));
                }
            } else {
                if (pathSegments.size() != 1) {
                    throw new IllegalArgumentException(i6n0.a(uri, "Unrecognized Uri format: "));
                }
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException(i6n0.a(uri, "Unrecognized Uri format: "), e2);
                }
            }
            Resources.Theme theme = !authority.equals(context.getPackageName()) ? (Resources.Theme) au80Var.c(b) : null;
            a = theme != null ? rjo.a(context, createPackageContext, parseInt, null) : rjo.a(context, context, parseInt, theme);
            if (a == null) {
                return new d670(a);
            }
            return null;
        }
        createPackageContext = context;
        pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
        }
        if (!authority.equals(context.getPackageName())) {
        }
        if (theme != null) {
        }
        if (a == null) {
        }
    }
}
