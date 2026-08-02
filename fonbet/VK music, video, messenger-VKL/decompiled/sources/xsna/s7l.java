package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.b330;
import xsna.r7l;

/* compiled from: DecodePath.java */
/* loaded from: classes12.dex */
public final class s7l<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends mag0<DataType, ResourceType>> b;
    public final bbg0<ResourceType, Transcode> c;
    public final svb0<List<Throwable>> d;
    public final String e;

    public s7l(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends mag0<DataType, ResourceType>> list, bbg0<ResourceType, Transcode> bbg0Var, svb0<List<Throwable>> svb0Var) {
        this.a = cls;
        this.b = list;
        this.c = bbg0Var;
        this.d = svb0Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final hag0 a(int i, int i2, com.bumptech.glide.load.data.a aVar, r7l.b bVar, @NonNull au80 au80Var) throws GlideException {
        hag0 hag0Var;
        clp0 clp0Var;
        EncodeStrategy encodeStrategy;
        boolean z;
        boolean z2;
        boolean z3;
        ady ttkVar;
        svb0<List<Throwable>> svb0Var = this.d;
        List<Throwable> c = svb0Var.c();
        nr2.r(c, "Argument must not be null");
        List<Throwable> list = c;
        try {
            hag0<ResourceType> b = b(aVar, i, i2, au80Var, list);
            svb0Var.a(list);
            r7l r7lVar = r7l.this;
            DataSource dataSource = bVar.a;
            q7l<R> q7lVar = r7lVar.b;
            Class<?> cls = b.get().getClass();
            pag0 pag0Var = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                clp0 e = q7lVar.e(cls);
                clp0Var = e;
                hag0Var = e.a(r7lVar.i, b, r7lVar.m, r7lVar.n);
            } else {
                hag0Var = b;
                clp0Var = null;
            }
            if (!b.equals(hag0Var)) {
                b.a();
            }
            if (q7lVar.c.a().d.a(hag0Var.b()) != null) {
                pag0Var = q7lVar.c.a().d.a(hag0Var.b());
                if (pag0Var == null) {
                    throw new Registry.NoResultEncoderAvailableException(hag0Var.b());
                }
                encodeStrategy = pag0Var.j(r7lVar.p);
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            pag0 pag0Var2 = pag0Var;
            ady adyVar = r7lVar.w;
            ArrayList b2 = q7lVar.b();
            int size = b2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((b330.a) b2.get(i3)).a.equals(adyVar)) {
                    z = true;
                    break;
                }
                i3++;
            }
            if (r7lVar.o.d(!z, dataSource, encodeStrategy)) {
                if (pag0Var2 == null) {
                    throw new Registry.NoResultEncoderAvailableException(hag0Var.get().getClass());
                }
                int i4 = r7l.a.c[encodeStrategy.ordinal()];
                if (i4 == 1) {
                    z2 = false;
                    z3 = true;
                    ttkVar = new ttk(r7lVar.w, r7lVar.j);
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                    z2 = false;
                    z3 = true;
                    ttkVar = new kag0(q7lVar.c.a, r7lVar.w, r7lVar.j, r7lVar.m, r7lVar.n, clp0Var, cls, r7lVar.p);
                }
                b000<Z> b000Var = (b000) b000.f.c();
                b000Var.e = z2;
                b000Var.d = z3;
                b000Var.c = hag0Var;
                r7l.c<?> cVar = r7lVar.g;
                cVar.a = ttkVar;
                cVar.b = pag0Var2;
                cVar.c = b000Var;
                hag0Var = b000Var;
            }
            return this.c.c(hag0Var, au80Var);
        } catch (Throwable th) {
            svb0Var.a(list);
            throw th;
        }
    }

    @NonNull
    public final hag0<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull au80 au80Var, List<Throwable> list) throws GlideException {
        List<? extends mag0<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        hag0<ResourceType> hag0Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            mag0<DataType, ResourceType> mag0Var = list2.get(i3);
            try {
                if (mag0Var.b(aVar.b(), au80Var)) {
                    hag0Var = mag0Var.a(aVar.b(), i, i2, au80Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(mag0Var);
                }
                list.add(e);
            }
            if (hag0Var != null) {
                break;
            }
        }
        if (hag0Var != null) {
            return hag0Var;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
