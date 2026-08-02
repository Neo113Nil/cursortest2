package xsna;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VkExternalAuthUrlProvider.kt */
/* loaded from: classes.dex */
public final class atu0 {
    public static final Object b = msy.a(LazyThreadSafetyMode.NONE, new ib3(20));
    public final ConcurrentHashMap<Integer, wmu0> a = new ConcurrentHashMap<>();

    /* compiled from: VkExternalAuthUrlProvider.kt */
    /* loaded from: classes15.dex */
    public static abstract class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: VkExternalAuthUrlProvider.kt */
        /* renamed from: xsna.atu0$a$a, reason: collision with other inner class name */
        public static final class C2573a extends a {
        }

        /* compiled from: VkExternalAuthUrlProvider.kt */
        public static final class b extends a {
        }

        public a(int i, String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    public final io.reactivex.rxjava3.core.x<wmu0> a(int i) {
        wmu0 wmu0Var = this.a.get(Integer.valueOf(i));
        if (wmu0Var != null) {
            return io.reactivex.rxjava3.core.x.k(wmu0Var);
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(vdx0Var.e().g(i), new xvq0(new d6c(this, i, 2), 7));
    }
}
