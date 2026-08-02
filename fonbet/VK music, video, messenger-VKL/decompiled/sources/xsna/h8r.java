package xsna;

import android.content.Context;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import com.vk.push.core.filedatastore.JsonSerializer;
import com.vk.push.core.filedatastore.migration.Migration;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class h8r<T extends JsonSerializer> implements i7f0<Context, FileDataStore<T>> {
    public final String b;
    public final JsonDeserializer<T> c;
    public final Migration<T> d;
    public final CrashReporterRepository e;
    public final boolean f;
    public final boolean g;
    public final yvj h;
    public volatile JsonSerializableFileDataStoreImpl i;

    public h8r(String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, yvj yvjVar) {
        this.b = str;
        this.c = jsonDeserializer;
        this.d = migration;
        this.e = crashReporterRepository;
        this.f = z;
        this.g = z2;
        this.h = yvjVar;
    }

    @Override // xsna.i7f0
    public final Object getValue(Context context, qcy qcyVar) {
        Context context2 = context;
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.i = new JsonSerializableFileDataStoreImpl(context2, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null, 256, null);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }
}
