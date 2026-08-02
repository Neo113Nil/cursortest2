package xsna;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import xsna.b330;

/* compiled from: ResourceLoader.java */
/* loaded from: classes12.dex */
public final class wag0<Data> implements b330<Integer, Data> {
    public final b330<Uri, Data> a;
    public final Resources b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements c330<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // xsna.c330
        public final b330<Integer, AssetFileDescriptor> d(j540 j540Var) {
            return new wag0(this.a, j540Var.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements c330<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Integer, InputStream> d(j540 j540Var) {
            return new wag0(this.a, j540Var.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements c330<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Integer, Uri> d(j540 j540Var) {
            return new wag0(this.a, w3q0.a);
        }
    }

    public wag0(Resources resources, b330<Uri, Data> b330Var) {
        this.b = resources;
        this.a = b330Var;
    }

    @Override // xsna.b330
    public final b330.a a(@NonNull Integer num, int i, int i2, @NonNull au80 au80Var) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException unused) {
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i, i2, au80Var);
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Integer num) {
        return true;
    }
}
