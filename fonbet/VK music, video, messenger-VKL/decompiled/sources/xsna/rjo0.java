package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;
import xsna.us2;

/* compiled from: TextLinkScope.kt */
/* loaded from: classes11.dex */
public final class rjo0 {
    public final wh50 a = androidx.compose.runtime.k.b(null);
    public us2 b;
    public final SnapshotStateList<izs<tbo0, s3q0>> c;

    /* compiled from: TextLinkScope.kt */
    @b6l(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ zaz $linkStateObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zaz zazVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$linkStateObserver = zazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$linkStateObserver, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zaz zazVar = this.$linkStateObserver;
                this.label = 1;
                zazVar.getClass();
                fh50 fh50Var = new fh50((Object) null);
                caj0 b = zazVar.a.b();
                yaz yazVar = new yaz(fh50Var, zazVar);
                b.getClass();
                Object k = caj0.k(b, yazVar, this);
                if (k != obj2) {
                    k = s3q0.a;
                }
                if (k == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class b implements kgn {
        public final /* synthetic */ izs b;

        public b(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            rjo0.this.c.remove(this.b);
        }
    }

    public rjo0(us2 us2Var) {
        m4k0 m4k0Var = new m4k0(7);
        us2Var.getClass();
        us2.b bVar = new us2.b(us2Var);
        ArrayList arrayList = bVar.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) m4k0Var.invoke(((us2.b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                us2.d dVar = (us2.d) list.get(i2);
                arrayList3.add(new us2.b.a(dVar.a, dVar.b, dVar.c, dVar.d));
            }
            g5g.y(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = bVar.n();
        this.c = new SnapshotStateList<>();
    }

    public static us2.d c(us2.d dVar, ljo0 ljo0Var) {
        int c = ljo0Var.b.c(r3.f - 1, false);
        if (dVar.b < c) {
            return us2.d.a(dVar, null, Math.min(dVar.c, c), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        char c;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(1154651354);
        char c2 = 2;
        int i2 = (M.y(this) ? 4 : 2) | i;
        ?? r9 = 0;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1154651354, i2, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            keq0 keq0Var = (keq0) M.r(uvi.s);
            us2 us2Var = this.b;
            List a2 = us2Var.a(us2Var.c.length());
            int size = a2.size();
            int i3 = 0;
            while (i3 < size) {
                us2.d dVar = (us2.d) a2.get(i3);
                int i4 = dVar.b;
                T t = dVar.a;
                if (i4 != dVar.c) {
                    M.K(725478935);
                    Object x = M.x();
                    Object obj = a.C0011a.a;
                    if (x == obj) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var = (sg50) x;
                    c = c2;
                    q630 a3 = rdu.a(q630.a.a, new hmj0(1, this, dVar));
                    Object x2 = M.x();
                    if (x2 == obj) {
                        z = true;
                        x2 = new zzl0(5);
                        M.R(x2);
                    } else {
                        z = true;
                    }
                    q630 a4 = pgv.a(egi0.b(a3, r9, (izs) x2).g(new sko0(new sff(this, dVar))), sg50Var);
                    ulb0.a.getClass();
                    q630 c3 = e7b0.c(a4, y000.d);
                    boolean y = M.y(this) | M.J(dVar) | M.y(keq0Var);
                    Object x3 = M.x();
                    if (y || x3 == obj) {
                        x3 = new com.vk.movika.sdk.base.ui.i(this, dVar, keq0Var);
                        M.R(x3);
                    }
                    ja8.a(ojc.d(c3, sg50Var, null, false, null, null, (gzs) x3, IronSourceError.ERROR_CODE_INIT_FAILED), M, r9);
                    q8z q8zVar = (q8z) t;
                    tjo0 b2 = q8zVar.b();
                    if (b2 == null || (b2.a == null && b2.b == null && b2.c == null && b2.d == null)) {
                        M.K(728331710);
                        M.j();
                    } else {
                        M.K(726303039);
                        Object x4 = M.x();
                        if (x4 == obj) {
                            x4 = new zaz(sg50Var);
                            M.R(x4);
                        }
                        zaz zazVar = (zaz) x4;
                        s3q0 s3q0Var = s3q0.a;
                        Object x5 = M.x();
                        if (x5 == obj) {
                            x5 = new a(zazVar, null);
                            M.R(x5);
                        }
                        bap.g(s3q0Var, (wzs) x5, M, 6);
                        rg50 rg50Var = zazVar.b;
                        rg50 rg50Var2 = zazVar.b;
                        Boolean valueOf = Boolean.valueOf((((wak0) rg50Var).getIntValue() & 2) != 0 ? z : false);
                        Boolean valueOf2 = Boolean.valueOf((((wak0) rg50Var2).getIntValue() & 1) != 0 ? z : false);
                        Boolean valueOf3 = Boolean.valueOf((((wak0) rg50Var2).getIntValue() & 4) != 0 ? z : false);
                        tjo0 b3 = q8zVar.b();
                        hik0 hik0Var = b3 != null ? b3.a : null;
                        tjo0 b4 = q8zVar.b();
                        hik0 hik0Var2 = b4 != null ? b4.b : null;
                        tjo0 b5 = q8zVar.b();
                        hik0 hik0Var3 = b5 != null ? b5.c : null;
                        tjo0 b6 = q8zVar.b();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, hik0Var, hik0Var2, hik0Var3, b6 != null ? b6.d : null};
                        boolean y2 = M.y(this) | M.J(dVar);
                        Object x6 = M.x();
                        if (y2 || x6 == obj) {
                            x6 = new evh0(this, dVar, zazVar, 4);
                            M.R(x6);
                        }
                        b(objArr, (izs) x6, M, (i2 << 6) & 896);
                        M.j();
                    }
                    M.j();
                } else {
                    c = c2;
                    M.K(728345598);
                    M.j();
                }
                i3++;
                c2 = c;
                r9 = 0;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uog(this, i, 9);
        }
    }

    public final void b(Object[] objArr, izs<? super tbo0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2083052099);
        int i2 = (i & 48) == 0 ? (M.y(izsVar) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= M.y(this) ? 256 : 128;
        }
        M.W(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (M.o(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= M.y(obj) ? 4 : 0;
        }
        M.a0();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2083052099, i3, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            rmk0 rmk0Var = new rmk0(2);
            rmk0Var.a(izsVar);
            rmk0Var.b(objArr);
            ArrayList<Object> arrayList = rmk0Var.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean y = M.y(this) | ((i3 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new fo6(26, this, izsVar);
                M.R(x);
            }
            bap.d(array, (izs) x, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yoj(i, 2, this, objArr, izsVar);
        }
    }
}
