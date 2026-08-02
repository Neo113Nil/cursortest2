package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.SessionUnavailableType;
import com.vk.superapp.multiaccount.api.f;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import ru.ok.android.utils.Logger;
import xsna.i340;
import xsna.k240;
import xsna.mgn0;

/* compiled from: MultiAccountRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class i340 implements com.vk.superapp.multiaccount.api.d {
    public final mui0 a;
    public final com.vk.superapp.multiaccount.api.a b;
    public final io.reactivex.rxjava3.internal.schedulers.d c;
    public final io.reactivex.rxjava3.subjects.d<List<com.vk.superapp.multiaccount.api.f>> d;
    public final io.reactivex.rxjava3.internal.operators.observable.y e;
    public io.reactivex.rxjava3.disposables.c f;
    public final c g;
    public final f h;

    /* compiled from: MultiAccountRepositoryImpl.kt */
    public static final /* synthetic */ class b implements l240, g0t {
        public b() {
        }

        @Override // xsna.l240
        public final void a(k240 k240Var) {
            boolean z = k240Var instanceof k240.b;
            i340 i340Var = i340.this;
            if (!z) {
                if (k240Var instanceof k240.a) {
                    i340Var.c();
                    return;
                } else {
                    if (!epx.f(k240Var, k240.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i340Var.c();
                    return;
                }
            }
            k240.b bVar = (k240.b) k240Var;
            List<com.vk.superapp.multiaccount.api.f> d = i340Var.d();
            ArrayList arrayList = new ArrayList(c5g.u(d, 10));
            for (com.vk.superapp.multiaccount.api.f fVar : d) {
                if (epx.f(fVar.a().c(), bVar.b())) {
                    com.vk.superapp.multiaccount.api.g a = com.vk.superapp.multiaccount.api.g.a(fVar.a(), bVar.a());
                    if (fVar instanceof f.a.C1892a) {
                        fVar = f.a.C1892a.b(a);
                    } else if (fVar instanceof f.c.a) {
                        fVar = f.c.a.b((f.c.a) fVar, a);
                    } else if (fVar instanceof f.c.b) {
                        fVar = f.c.b.b((f.c.b) fVar, a);
                    } else {
                        if (!(fVar instanceof f.c.C1893c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar = f.c.C1893c.b((f.c.C1893c) fVar, a);
                    }
                }
                arrayList.add(fVar);
            }
            i340Var.d.onNext(arrayList);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l240) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, i340.this, i340.class, "updateCacheBy", "updateCacheBy(Lcom/vk/superapp/multiaccount/api/MultiAccountInfoChange;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    public static final class c extends d<f.a> {
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    public static abstract class d<T extends com.vk.superapp.multiaccount.api.f> {
        public final String a;
        public final CopyOnWriteArrayList<T> b = new CopyOnWriteArrayList<>();
        public final AtomicBoolean c = new AtomicBoolean(false);
        public io.reactivex.rxjava3.disposables.c d = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);

        /* compiled from: MultiAccountRepositoryImpl.kt */
        /* loaded from: classes6.dex */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            public a(Object obj) {
                super(1, obj, par0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
            }

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                ((par0) this.receiver).getClass();
                par0.d(th);
                return s3q0.a;
            }
        }

        public d(String str) {
            this.a = str;
        }

        public final io.reactivex.rxjava3.core.x<List<T>> a() {
            if (this.c.get()) {
                CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
                if (!copyOnWriteArrayList.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(j5g.O0(copyOnWriteArrayList));
                }
            }
            return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.j340
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File file = new File(dgn0.d().getFilesDir(), i340.d.this.a);
                    if (!file.isFile() || !file.exists()) {
                        return EmptyList.b;
                    }
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        int length = (int) file.length();
                        byte[] bArr = new byte[length];
                        dataInputStream.readFully(bArr, 0, length);
                        dataInputStream.close();
                        try {
                            return f.b.a(new JSONArray(new String(bArr, emb.b)));
                        } catch (Throwable th) {
                            par0.a.getClass();
                            par0.d(th);
                            return EmptyList.b;
                        }
                    } catch (Throwable th2) {
                        try {
                            par0.a.getClass();
                            par0.d(th2);
                            EmptyList emptyList = EmptyList.b;
                            dataInputStream.close();
                            return emptyList;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ro.e(dataInputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
            }).h(new rkz(new a(par0.a), 6)).o(EmptyList.b), new bqs(new wik(this, 27), 10));
        }

        public final void b(List<? extends T> list) {
            CopyOnWriteArrayList<T> copyOnWriteArrayList = this.b;
            copyOnWriteArrayList.clear();
            List<? extends T> list2 = list;
            if (!list2.isEmpty()) {
                copyOnWriteArrayList.addAll(list2);
            }
            this.d.dispose();
            this.d = hg1.g(new io.reactivex.rxjava3.internal.operators.completable.m(new sib(1, this, list)), new eu2(7));
        }
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    /* loaded from: classes6.dex */
    public static final class e {
        public final List<f.a> a;
        public final List<f.c> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends f.a> list, List<? extends f.c> list2) {
            this.a = list;
            this.b = list2;
        }

        public final List<f.a> a() {
            return this.a;
        }

        public final List<f.c> b() {
            return this.b;
        }

        public final ListBuilder c() {
            ListBuilder e = e43.e();
            e.addAll(this.a);
            e.addAll(this.b);
            return e.g();
        }
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    public static final class f extends d<f.c> {
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionUnavailableType.values().length];
            try {
                iArr[SessionUnavailableType.VALIDATION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionUnavailableType.BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionUnavailableType.DEACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    public i340(mui0 mui0Var, m240 m240Var, boolean z, com.vk.superapp.multiaccount.api.a aVar) {
        this.a = mui0Var;
        this.b = aVar;
        mgn0 mgn0Var = dgn0.a;
        mgn0 mgn0Var2 = dgn0.a;
        ExecutorService a2 = mgn0.h.a.a((mgn0.h) (mgn0Var2 == null ? null : mgn0Var2).j.getValue(), "multiacc-repository-thread", 5, 4);
        io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
        this.c = new io.reactivex.rxjava3.internal.schedulers.d(a2, z);
        io.reactivex.rxjava3.subjects.d<List<com.vk.superapp.multiaccount.api.f>> O0 = io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);
        this.d = O0;
        this.e = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        this.f = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        this.g = new c("MultiAccountCache.json");
        this.h = new f("MultiAccountUnavailableUsers.json");
        q55 q55Var = q55.a;
        q55.a(new a());
        ((CopyOnWriteArrayList) m240Var.b).add(new b());
        mui0Var.f(new ayi0() { // from class: xsna.g340
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                i340 i340Var = i340.this;
                i340Var.c.c(new e6(5, uxi0Var, i340Var));
            }
        });
        mui0Var.f(new ayi0() { // from class: xsna.h340
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                i340 i340Var = i340.this;
                i340Var.c.c(new x6q(2, i340Var, uxi0Var));
            }
        });
    }

    public final void a(UserId userId) {
        com.vk.superapp.multiaccount.api.f fVar;
        List<com.vk.superapp.multiaccount.api.f> d2 = d();
        ListIterator<com.vk.superapp.multiaccount.api.f> listIterator = d2.listIterator(d2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                fVar = null;
                break;
            } else {
                fVar = listIterator.previous();
                if (epx.f(fVar.a().c(), userId)) {
                    break;
                }
            }
        }
        f.c cVar = fVar instanceof f.c ? (f.c) fVar : null;
        if (cVar == null) {
            c();
        } else {
            hg1.i(new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.o(this.h.a().l(new u5(new d2y(cVar, 9), 21)), new sl30(new zl20(this, 4), 2)).q(this.c), new yyo(this, 1)), new io3(29));
        }
    }

    @Override // com.vk.superapp.multiaccount.api.d
    public final void c() {
        this.f.dispose();
        mui0 mui0Var = this.a;
        boolean isEmpty = mui0Var.e().isEmpty();
        f fVar = this.h;
        c cVar = this.g;
        if (isEmpty) {
            EmptyList emptyList = EmptyList.b;
            this.d.onNext(emptyList);
            cVar.b(emptyList);
            fVar.b(emptyList);
            return;
        }
        io.reactivex.rxjava3.core.x<List<f.a>> a2 = cVar.a();
        io.reactivex.rxjava3.core.x<List<f.c>> a3 = fVar.a();
        final w240 w240Var = new w240(0);
        io.reactivex.rxjava3.core.x B = io.reactivex.rxjava3.core.x.B(a2, a3, new io.reactivex.rxjava3.functions.c() { // from class: xsna.z240
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                return (i340.e) w240.this.invoke(obj, obj2);
            }
        });
        io.reactivex.rxjava3.internal.schedulers.d dVar = this.c;
        io.reactivex.rxjava3.internal.operators.single.o oVar = new io.reactivex.rxjava3.internal.operators.single.o(B.q(dVar).l(new ax2(new a340(this))), new c340(new b340(this, 0), 0));
        List O0 = j5g.O0(mui0Var.e());
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.f = hg1.i(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.B(oVar, xa4.I(vdx0Var.a().i(), 5, 1006).m(dVar).l(new zj0(new defpackage.y(15, this, O0), 18)), new e340(new d340())), new f340(new eej(this, 1), 0)), new x240(new ps3(this, 1), 0)), new y240(0));
    }

    @Override // com.vk.superapp.multiaccount.api.d
    public final List<com.vk.superapp.multiaccount.api.f> d() {
        List<com.vk.superapp.multiaccount.api.f> P0 = this.d.P0();
        return P0 == null ? EmptyList.b : P0;
    }

    @Override // com.vk.superapp.multiaccount.api.d
    public final void e(UserId userId, SessionUnavailableType sessionUnavailableType) {
        io.reactivex.rxjava3.internal.operators.single.d0 o = new io.reactivex.rxjava3.internal.operators.single.v(new ewk(1, sessionUnavailableType, userId)).o(Boolean.FALSE);
        int i = 22;
        hg1.i(new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.r(this.g.a(), new p5w(new g6(19, userId, this), 3)).l(new s41(new u9(i, sessionUnavailableType, this), i)), this.h.a(), new vx6(new bv4((byte) 0, 6), 24)).l(new iu4(new cww(this, 17), 21)), new d9(new d410(o, 9), 22)).q(this.c), new g9b(this, 3)), new xmz(9));
    }

    @Override // com.vk.superapp.multiaccount.api.d
    public final List<com.vk.superapp.multiaccount.api.f> f() {
        return this.g.a().c();
    }

    /* compiled from: MultiAccountRepositoryImpl.kt */
    public static final class a implements s25 {
        public a() {
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
            i340.this.c();
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void m() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void b(String str) {
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }
}
