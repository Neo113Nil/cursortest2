package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.e43;

/* renamed from: io.appmetrica.analytics.impl.o5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5057o5 {
    public final C5005m5 a;
    public final C5031n5 b;

    @NonNull
    protected final Context c;
    public final C4747c5 d;
    public final A4 e;
    public final AbstractC4876h5 f;

    @NonNull
    protected final C5100pm g;
    public final InterfaceC5146rh h;
    public final T8 i;
    public final ICommonExecutor j;
    public final Rb k;
    public final E9 l;
    public final int m;

    public C5057o5(Context context, C4747c5 c4747c5, A4 a4, AbstractC4876h5 abstractC4876h5, C5100pm c5100pm, InterfaceC5146rh interfaceC5146rh, ICommonExecutor iCommonExecutor, int i, Rb rb, E9 e9) {
        this(context, c4747c5, a4, abstractC4876h5, c5100pm, interfaceC5146rh, iCommonExecutor, new T8(), i, new C5005m5(a4.a), new C5031n5(context, c4747c5), rb, e9);
    }

    public static C4931j9 c(C4927j5 c4927j5) {
        return new C4931j9(c4927j5);
    }

    public final Y8 a() {
        Context context = this.c;
        C4747c5 c4747c5 = this.d;
        return new Y8(new C4777d9(context, c4747c5), this.m);
    }

    public final X6 b(C4927j5 c4927j5) {
        return new X6(c4927j5, C5342za.I.B().c(this.c, this.d), new T6(c4927j5.c()), new C5136r7());
    }

    public final C5005m5 d() {
        return this.a;
    }

    public final C5031n5 e() {
        return this.b;
    }

    public final Ho f() {
        Ho ho;
        Lo c5036na;
        Ko D = C5342za.I.D();
        C4747c5 c4747c5 = this.d;
        synchronized (D) {
            try {
                String valueOf = String.valueOf(c4747c5);
                LinkedHashMap linkedHashMap = D.b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C4860gf c4860gf = new C4860gf(C5342za.I.B().b(D.a, c4747c5));
                    if (c4747c5.d()) {
                        String str = "appmetrica_vital_" + c4747c5.b + ".dat";
                        c5036na = new C5160s5(e43.l(new Pair(str, new C5036na(D.a, str)), new Pair("appmetrica_vital_main.dat", new C5036na(D.a, "appmetrica_vital_main.dat"))));
                    } else {
                        c5036na = new C5036na(D.a, "appmetrica_vital_" + c4747c5.b + ".dat");
                    }
                    obj = new Ho(c4860gf, c5036na, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                ho = (Ho) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ho;
    }

    public C5057o5(Context context, C4747c5 c4747c5, A4 a4, AbstractC4876h5 abstractC4876h5, C5100pm c5100pm, InterfaceC5146rh interfaceC5146rh, ICommonExecutor iCommonExecutor, T8 t8, int i, C5005m5 c5005m5, C5031n5 c5031n5, Rb rb, E9 e9) {
        this.c = context;
        this.d = c4747c5;
        this.e = a4;
        this.f = abstractC4876h5;
        this.g = c5100pm;
        this.h = interfaceC5146rh;
        this.j = iCommonExecutor;
        this.i = t8;
        this.m = i;
        this.a = c5005m5;
        this.b = c5031n5;
        this.k = rb;
        this.l = e9;
    }

    public final Tk c() {
        return new Tk(this.c, this.d);
    }

    public final Fi d(C4927j5 c4927j5) {
        Fi fi = new Fi(c4927j5, this.f.a(), this.j);
        Rb rb = this.k;
        synchronized (rb) {
            rb.c.add(fi);
        }
        return fi;
    }

    public final C4707ah a(C4927j5 c4927j5) {
        return new C4707ah(new C5172sh(c4927j5, this.h, new O3()), this.g, new C5095ph(this.e));
    }

    public static C4737bl a(C4927j5 c4927j5, Ho ho, C4902i5 c4902i5) {
        C4711al c4711al = new C4711al(ho);
        return new C4737bl(c4927j5, c4711al, c4902i5, new C5191ta(c4927j5, c4711al, new C4814el(c4927j5.h(), "foreground"), AbstractC5308y1.a(), new SystemTimeProvider()), new L2(c4927j5, c4711al, new C4814el(c4927j5.h(), L2.g), AbstractC5308y1.a(), new SystemTimeProvider()));
    }

    public static C4798e5 b() {
        return new C4798e5();
    }

    public final C5310y3 b(C4860gf c4860gf) {
        Context context = this.c;
        return new C5310y3(context, c4860gf, context.getPackageName(), new SafePackageManager());
    }

    public final C5266w9 a(C4860gf c4860gf, Ho ho, C4737bl c4737bl, X6 x6, C4922j0 c4922j0, Tk tk, Fi fi) {
        return new C5266w9(c4860gf, ho, c4737bl, x6, c4922j0, this.i, tk, this.m, new C4979l5(fi), new SystemTimeProvider());
    }

    public static Di a(C4927j5 c4927j5, C4931j9 c4931j9) {
        return new Di(c4931j9, c4927j5);
    }

    public C9 a(H9 h9, X6 x6, C4707ah c4707ah, A4 a4, C4747c5 c4747c5, C4860gf c4860gf) {
        return this.l.a(h9, x6, c4707ah, a4, c4747c5, c4860gf).a();
    }

    public final B2 a(C4860gf c4860gf) {
        return new B2(this.d, c4860gf);
    }
}
