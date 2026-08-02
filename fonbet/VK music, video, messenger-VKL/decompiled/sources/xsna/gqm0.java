package xsna;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import xsna.b330;

/* compiled from: StringLoader.java */
/* loaded from: classes12.dex */
public final class gqm0<Data> implements b330<String, Data> {
    public final b330<Uri, Data> a;

    /* compiled from: StringLoader.java */
    public static final class a implements c330<String, AssetFileDescriptor> {
        @Override // xsna.c330
        public final b330<String, AssetFileDescriptor> d(@NonNull j540 j540Var) {
            return new gqm0(j540Var.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements c330<String, ParcelFileDescriptor> {
        @Override // xsna.c330
        @NonNull
        public final b330<String, ParcelFileDescriptor> d(@NonNull j540 j540Var) {
            return new gqm0(j540Var.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements c330<String, InputStream> {
        @Override // xsna.c330
        @NonNull
        public final b330<String, InputStream> d(@NonNull j540 j540Var) {
            return new gqm0(j540Var.b(Uri.class, InputStream.class));
        }
    }

    public gqm0(b330<Uri, Data> b330Var) {
        this.a = b330Var;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull String str, int i, int i2, @NonNull au80 au80Var) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile != null) {
            b330<Uri, Data> b330Var = this.a;
            if (b330Var.b(fromFile)) {
                return b330Var.a(fromFile, i, i2, au80Var);
            }
        }
        return null;
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull String str) {
        return true;
    }
}
