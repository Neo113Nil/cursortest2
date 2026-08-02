package xsna;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: UseCase.java */
/* loaded from: classes11.dex */
public abstract class vfq0 {

    @Nullable
    public androidx.camera.core.impl.u<?> d;

    @NonNull
    public androidx.camera.core.impl.u<?> e;

    @NonNull
    public androidx.camera.core.impl.u<?> f;
    public Size g;

    @Nullable
    public androidx.camera.core.impl.u<?> h;

    @Nullable
    public Rect i;
    public CameraInternal j;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public c c = c.INACTIVE;
    public androidx.camera.core.impl.r k = androidx.camera.core.impl.r.a();

    /* compiled from: UseCase.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UseCase.java */
    public interface b {
        void b();

        void c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UseCase.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c ACTIVE;
        public static final c INACTIVE;

        static {
            c cVar = new c(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = cVar;
            c cVar2 = new c("INACTIVE", 1);
            INACTIVE = cVar2;
            $VALUES = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: UseCase.java */
    public interface d {
        void a(@NonNull vfq0 vfq0Var);

        void f(@NonNull vfq0 vfq0Var);

        void i(@NonNull vfq0 vfq0Var);

        void j(@NonNull vfq0 vfq0Var);
    }

    public vfq0(@NonNull androidx.camera.core.impl.u<?> uVar) {
        this.e = uVar;
        this.f = uVar;
    }

    @Nullable
    public final CameraInternal a() {
        CameraInternal cameraInternal;
        synchronized (this.b) {
            cameraInternal = this.j;
        }
        return cameraInternal;
    }

    @NonNull
    public final CameraControlInternal b() {
        synchronized (this.b) {
            try {
                CameraInternal cameraInternal = this.j;
                if (cameraInternal == null) {
                    return CameraControlInternal.a;
                }
                return cameraInternal.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final String c() {
        CameraInternal a2 = a();
        obr.e(a2, "No camera attached to use case: " + this);
        return a2.c().a;
    }

    @Nullable
    public abstract androidx.camera.core.impl.u<?> d(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory);

    @NonNull
    public final String e() {
        return this.f.i("<UnknownUseCase-" + hashCode() + ">");
    }

    @NonNull
    public abstract u.a<?, ?, ?> f(@NonNull Config config);

    public final boolean g(@NonNull String str) {
        if (a() == null) {
            return false;
        }
        return Objects.equals(str, c());
    }

    @NonNull
    public final androidx.camera.core.impl.u<?> h(@NonNull ui9 ui9Var, @Nullable androidx.camera.core.impl.u<?> uVar, @Nullable androidx.camera.core.impl.u<?> uVar2) {
        androidx.camera.core.impl.n z;
        if (uVar2 != null) {
            z = androidx.camera.core.impl.n.A(uVar2);
            z.s.remove(x3o0.o);
        } else {
            z = androidx.camera.core.impl.n.z();
        }
        TreeMap<Config.a<?>, Map<Config.OptionPriority, Object>> treeMap = z.s;
        for (Config.a<?> aVar : this.e.e()) {
            z.B(aVar, this.e.h(aVar), this.e.f(aVar));
        }
        if (uVar != null) {
            for (Config.a<?> aVar2 : uVar.e()) {
                if (!aVar2.b().equals(x3o0.o.a)) {
                    z.B(aVar2, uVar.h(aVar2), uVar.f(aVar2));
                }
            }
        }
        if (treeMap.containsKey(androidx.camera.core.impl.l.d)) {
            androidx.camera.core.impl.a aVar3 = androidx.camera.core.impl.l.b;
            if (treeMap.containsKey(aVar3)) {
                treeMap.remove(aVar3);
            }
        }
        return p(ui9Var, f(z));
    }

    public final void i() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).j(this);
        }
    }

    public final void j() {
        int i = a.a[this.c.ordinal()];
        HashSet hashSet = this.a;
        if (i == 1) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).i(this);
            }
        } else {
            if (i != 2) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).f(this);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void k(@NonNull CameraInternal cameraInternal, @Nullable androidx.camera.core.impl.u<?> uVar, @Nullable androidx.camera.core.impl.u<?> uVar2) {
        synchronized (this.b) {
            this.j = cameraInternal;
            this.a.add(cameraInternal);
        }
        this.d = uVar;
        this.h = uVar2;
        androidx.camera.core.impl.u<?> h = h(cameraInternal.c(), this.d, this.h);
        this.f = h;
        b l = h.l();
        if (l != null) {
            l.b();
        }
        l();
    }

    public final void n(@NonNull CameraInternal cameraInternal) {
        o();
        b l = this.f.l();
        if (l != null) {
            l.c();
        }
        synchronized (this.b) {
            obr.b(cameraInternal == this.j);
            this.a.remove(this.j);
            this.j = null;
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.u, androidx.camera.core.impl.u<?>] */
    @NonNull
    public androidx.camera.core.impl.u<?> p(@NonNull ui9 ui9Var, @NonNull u.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    @NonNull
    public abstract Size r(@NonNull Size size);

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.camera.core.impl.u, androidx.camera.core.impl.u<?>] */
    public final boolean s(int i) {
        Size j;
        int p = ((androidx.camera.core.impl.l) this.f).p(-1);
        if (p != -1 && p == i) {
            return false;
        }
        u.a<?, ?, ?> f = f(this.e);
        androidx.camera.core.impl.l lVar = (androidx.camera.core.impl.l) f.b();
        int p2 = lVar.p(-1);
        if (p2 == -1 || p2 != i) {
            ((l.a) f).c(i);
        }
        if (p2 != -1 && i != -1 && p2 != i) {
            if (Math.abs(cdi.K(i) - cdi.K(p2)) % 180 == 90 && (j = lVar.j()) != null) {
                ((l.a) f).a(new Size(j.getHeight(), j.getWidth()));
            }
        }
        this.e = f.b();
        CameraInternal a2 = a();
        if (a2 == null) {
            this.f = this.e;
            return true;
        }
        this.f = h(a2.c(), this.d, this.h);
        return true;
    }

    public void l() {
    }

    public void m() {
    }

    public void o() {
    }

    public void q() {
    }
}
