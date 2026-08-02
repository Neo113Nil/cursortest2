package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.r7l;

/* compiled from: LoadPath.java */
/* loaded from: classes12.dex */
public final class fqz<Data, ResourceType, Transcode> {
    public final svb0<List<Throwable>> a;
    public final List<? extends s7l<Data, ResourceType, Transcode>> b;
    public final String c;

    public fqz(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<s7l<Data, ResourceType, Transcode>> list, svb0<List<Throwable>> svb0Var) {
        this.a = svb0Var;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final hag0 a(int i, int i2, com.bumptech.glide.load.data.a aVar, r7l.b bVar, @NonNull au80 au80Var) throws GlideException {
        svb0<List<Throwable>> svb0Var = this.a;
        List<Throwable> c = svb0Var.c();
        nr2.r(c, "Argument must not be null");
        List<Throwable> list = c;
        try {
            List<? extends s7l<Data, ResourceType, Transcode>> list2 = this.b;
            int size = list2.size();
            hag0 hag0Var = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    hag0Var = list2.get(i3).a(i, i2, aVar, bVar, au80Var);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (hag0Var != null) {
                    break;
                }
            }
            if (hag0Var != null) {
                return hag0Var;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            svb0Var.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
