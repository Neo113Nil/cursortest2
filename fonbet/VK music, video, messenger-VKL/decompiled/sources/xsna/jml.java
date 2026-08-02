package xsna;

import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.exceptions.JobException;
import java.util.HashMap;

/* compiled from: DefaultSerializersProvider.kt */
/* loaded from: classes.dex */
public final class jml {
    public final HashMap<Class<?>, s7x<?>> a = new HashMap<>();
    public final HashMap<String, s7x<?>> b = new HashMap<>();

    public final synchronized s7x<InstantJob> a(InstantJob instantJob) {
        s7x<InstantJob> s7xVar;
        Class<?> cls = instantJob.getClass();
        String simpleName = cls.getSimpleName();
        s7xVar = (s7x) this.a.get(cls);
        if (s7xVar == null) {
            throw new JobException("No serializer for class: ".concat(simpleName));
        }
        return s7xVar;
    }

    public final void b(InstantJob instantJob, ny90 ny90Var) {
        a(instantJob).b(instantJob, ny90Var);
    }
}
