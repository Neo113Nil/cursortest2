package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.czd0;
import xsna.hg1;
import xsna.tca0;

/* compiled from: PhotoTagsInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class tca0 implements oca0 {
    public final bda0 a;
    public final io.reactivex.rxjava3.subjects.h b;
    public final CopyOnWriteArrayList<qba0> c;
    public io.reactivex.rxjava3.disposables.c d;
    public final io.reactivex.rxjava3.internal.operators.observable.b0 e;

    /* compiled from: PhotoTagsInteractorImpl.kt */
    public static abstract class a {

        /* compiled from: PhotoTagsInteractorImpl.kt */
        /* renamed from: xsna.tca0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3738a extends a {

            /* compiled from: PhotoTagsInteractorImpl.kt */
            /* renamed from: xsna.tca0$a$a$a, reason: collision with other inner class name */
            public static final class C3739a extends AbstractC3738a {
                public final Set<qba0> a;

                public C3739a(Set<qba0> set) {
                    this.a = set;
                }
            }

            /* compiled from: PhotoTagsInteractorImpl.kt */
            /* renamed from: xsna.tca0$a$a$b */
            public static final class b extends AbstractC3738a {
                public final Set<qba0> a;

                public b(Set<qba0> set) {
                    this.a = set;
                }
            }

            /* compiled from: PhotoTagsInteractorImpl.kt */
            /* renamed from: xsna.tca0$a$a$c */
            public static final class c extends AbstractC3738a {
                public final int a;

                public c(int i) {
                    this.a = i;
                }
            }
        }

        /* compiled from: PhotoTagsInteractorImpl.kt */
        public static final class b extends a {
            public final boolean a;
            public final UserId b;
            public final int c;
            public final int d;

            public b(int i, int i2, UserId userId, boolean z) {
                this.a = z;
                this.b = userId;
                this.c = i;
                this.d = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + shy.a(0, shy.a(this.c, shy.a(0, bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Update(reload=");
                sb.append(this.a);
                sb.append(", userId=");
                sb.append(this.b);
                sb.append(", offset=0, count=");
                sb.append(this.c);
                sb.append(", recognitionOffset=0, recognitionCount=");
                return vu5.b(sb, this.d, ')');
            }
        }
    }

    /* compiled from: PhotoTagsInteractorImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof zaa0);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final zaa0 invoke(Object obj) {
            if (obj != null) {
                return (zaa0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.PhotoRemoveEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof a.AbstractC3738a);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class f implements izs {
        public static final f b = new f();

        @Override // xsna.izs
        public final a.AbstractC3738a invoke(Object obj) {
            if (obj != null) {
                return (a.AbstractC3738a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.photos.root.photoflow.domain.PhotoTagsInteractorImpl.Action.Modificators");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class g implements izs {
        public static final g b = new g();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof a.b);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class h implements izs {
        public static final h b = new h();

        @Override // xsna.izs
        public final a.b invoke(Object obj) {
            if (obj != null) {
                return (a.b) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.photos.root.photoflow.domain.PhotoTagsInteractorImpl.Action.Update");
        }
    }

    public tca0(bda0 bda0Var) {
        this.a = bda0Var;
        io.reactivex.rxjava3.subjects.h M0 = io.reactivex.rxjava3.subjects.d.N0().M0();
        this.b = M0;
        this.c = new CopyOnWriteArrayList<>();
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(M0, new hg1.c3(g.b)).U(new hg1.b3(h.b)), io.reactivex.rxjava3.internal.functions.a.a, new mh40(new e6g(this), 5)).s0(new nh40(new af50(this, 8), 5));
        fa faVar = new fa(this, 10);
        s0.getClass();
        this.e = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(s0, io.reactivex.rxjava3.internal.functions.a.d, faVar).g0().O0(), new bdz(new h630(this, 16), 13), io.reactivex.rxjava3.internal.functions.a.c).G(new jf1(this, 5));
    }

    public static void d(qba0 qba0Var) {
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0Var.a(new zaa0(-9000, qba0Var.a.c));
        ysg0Var.a(new czd0.a());
    }

    @Override // xsna.oca0
    public final io.reactivex.rxjava3.internal.operators.completable.w a(Set set) {
        return this.a.a(set).g(new rca0(0, this, set));
    }

    @Override // xsna.oca0
    public final io.reactivex.rxjava3.internal.operators.completable.w b(final Set set) {
        return this.a.b(set).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.pca0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                io.reactivex.rxjava3.subjects.h hVar = tca0.this.b;
                Set set2 = set;
                hVar.onNext(new tca0.a.AbstractC3738a.C3739a(set2));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    tca0.d((qba0) it.next());
                }
            }
        });
    }

    @Override // xsna.oca0
    public final io.reactivex.rxjava3.internal.operators.observable.c0 c(int i, int i2, UserId userId, boolean z) {
        wmz wmzVar = new wmz(new sca0(i, i2, this, z, userId), 14);
        io.reactivex.rxjava3.internal.operators.observable.b0 b0Var = this.e;
        b0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(b0Var, wmzVar, io.reactivex.rxjava3.internal.functions.a.c);
    }
}
