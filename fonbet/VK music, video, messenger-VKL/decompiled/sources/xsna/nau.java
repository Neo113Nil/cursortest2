package xsna;

import android.app.Activity;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vk.googleump.impl.di.GoogleUMPComponentImpl;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.lau;

/* compiled from: GoogleUmpImpl.kt */
/* loaded from: classes2.dex */
public final class nau implements lau {
    public final ExecutorService a;
    public final mag b;
    public a c = new a.b();
    public final bpn0 d = new bpn0(new dgm(this, 12));
    public oau e;

    /* compiled from: GoogleUmpImpl.kt */
    public static abstract class a {

        /* compiled from: GoogleUmpImpl.kt */
        /* renamed from: xsna.nau$a$a, reason: collision with other inner class name */
        public static final class C3392a extends a {
            public final List<lau.a> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C3392a(List<? extends lau.a> list) {
                this.a = list;
            }

            @Override // xsna.nau.a
            public final List<lau.a> a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3392a) && epx.f(this.a, ((C3392a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("InProgress(requestListeners="), this.a);
            }
        }

        /* compiled from: GoogleUmpImpl.kt */
        public static final class b extends a {
            @Override // xsna.nau.a
            public final List<lau.a> a() {
                return EmptyList.b;
            }
        }

        /* compiled from: GoogleUmpImpl.kt */
        public static final class c extends a {
            public final rau a;

            public c(rau rauVar) {
                this.a = rauVar;
            }

            @Override // xsna.nau.a
            public final List<lau.a> a() {
                return EmptyList.b;
            }
        }

        public abstract List<lau.a> a();
    }

    public nau(ExecutorService executorService, mag magVar) {
        this.a = executorService;
        this.b = magVar;
    }

    @Override // xsna.lau
    public final boolean a() {
        taj0 taj0Var = (taj0) this.b.c;
        qcy<Object>[] qcyVarArr = GoogleUMPComponentImpl.b;
        return taj0Var.a(AndroidTcfDataSource.TCF_TCSTRING_KEY) || taj0Var.a("IABGPP_HDR_GppString");
    }

    @Override // xsna.lau
    public final void b() {
        a aVar = this.c;
        if (aVar instanceof a.c) {
            ((a.c) aVar).a.a.reset();
        } else if (aVar instanceof a.C3392a) {
            Iterator<T> it = ((a.C3392a) aVar).a.iterator();
            while (it.hasNext()) {
                ((lau.a) it.next()).b(g2q0.c);
            }
        }
        this.c = new a.b();
    }

    @Override // xsna.lau
    public final void c(Activity activity, lau.a aVar) {
        a aVar2 = this.c;
        if (aVar2 instanceof a.b) {
            this.c = new a.C3392a(Collections.singletonList(aVar));
            this.a.submit(new dxt(1, activity, this));
        } else if (aVar2 instanceof a.C3392a) {
            this.c = new a.C3392a(j5g.v0(aVar, ((a.C3392a) aVar2).a));
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a(((a.c) aVar2).a);
        }
    }

    @Override // xsna.lau
    public final void d(m11 m11Var) {
        this.e = m11Var;
    }

    @Override // xsna.lau
    public final int e() {
        taj0 taj0Var = (taj0) ((uxp0) this.d.getValue()).a.c;
        qcy<Object>[] qcyVarArr = GoogleUMPComponentImpl.b;
        String c = taj0Var.c();
        if (c == null) {
            c = "";
        }
        return uxp0.a(c);
    }

    @Override // xsna.lau
    public final void f(lau.b bVar) {
        uxp0 uxp0Var = (uxp0) this.d.getValue();
        taj0 taj0Var = (taj0) uxp0Var.a.c;
        qcy<Object>[] qcyVarArr = GoogleUMPComponentImpl.b;
        taj0Var.b(new uf20(uxp0Var, bVar));
    }
}
