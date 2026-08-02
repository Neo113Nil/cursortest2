package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;
import xsna.b330;
import xsna.buk;

/* compiled from: DirectResourceLoader.java */
/* loaded from: classes12.dex */
public final class pzm<DataT> implements b330<Integer, DataT> {
    public final Context a;
    public final Object b;

    /* compiled from: DirectResourceLoader.java */
    public static final class a implements c330<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.pzm.e
        public final void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // xsna.pzm.e
        public final Class<AssetFileDescriptor> b() {
            return AssetFileDescriptor.class;
        }

        @Override // xsna.pzm.e
        public final Object c(int i, @Nullable Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Integer, AssetFileDescriptor> d(@NonNull j540 j540Var) {
            return new pzm(this.a, this);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class b implements c330<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // xsna.pzm.e
        public final /* bridge */ /* synthetic */ void a(Drawable drawable) throws IOException {
        }

        @Override // xsna.pzm.e
        public final Class<Drawable> b() {
            return Drawable.class;
        }

        @Override // xsna.pzm.e
        public final Object c(int i, @Nullable Resources.Theme theme, Resources resources) {
            Context context = this.a;
            return rjo.a(context, context, i, theme);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Integer, Drawable> d(@NonNull j540 j540Var) {
            return new pzm(this.a, this);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class c implements c330<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // xsna.pzm.e
        public final void a(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // xsna.pzm.e
        public final Class<InputStream> b() {
            return InputStream.class;
        }

        @Override // xsna.pzm.e
        public final Object c(int i, @Nullable Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i);
        }

        @Override // xsna.c330
        @NonNull
        public final b330<Integer, InputStream> d(@NonNull j540 j540Var) {
            return new pzm(this.a, this);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    public interface e<DataT> {
        void a(DataT datat) throws IOException;

        Class<DataT> b();

        Object c(int i, @Nullable Resources.Theme theme, Resources resources);
    }

    public pzm(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.pzm$e] */
    @Override // xsna.b330
    public final b330.a a(@NonNull Integer num, int i, int i2, @NonNull au80 au80Var) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) au80Var.c(oag0.b);
        return new b330.a(new qp70(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }

    @Override // xsna.b330
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Integer num) {
        return true;
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class d<DataT> implements buk<DataT> {

        @Nullable
        public final Resources.Theme b;
        public final Resources c;
        public final e<DataT> d;
        public final int e;

        @Nullable
        public DataT f;

        public d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.b = theme;
            this.c = resources;
            this.d = eVar;
            this.e = i;
        }

        @Override // xsna.buk
        public final void a() {
            DataT datat = this.f;
            if (datat != null) {
                try {
                    this.d.a(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // xsna.buk
        @NonNull
        public final Class<DataT> b() {
            return this.d.b();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // xsna.buk
        public final void d(@NonNull Priority priority, @NonNull buk.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.d.c(this.e, this.b, this.c);
                this.f = r4;
                aVar.c(r4);
            } catch (Resources.NotFoundException e) {
                aVar.f(e);
            }
        }

        @Override // xsna.buk
        @NonNull
        public final DataSource e() {
            return DataSource.LOCAL;
        }

        @Override // xsna.buk
        public final void cancel() {
        }
    }
}
