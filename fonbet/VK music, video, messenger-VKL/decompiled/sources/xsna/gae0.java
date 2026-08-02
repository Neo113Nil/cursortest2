package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.network.proxy.VkProxyProvider;
import com.vk.network.proxy.data.VkProxyPreferences;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.Interceptor;
import xsna.dev0;
import xsna.pev0;

/* compiled from: ProxyInitializer.kt */
/* loaded from: classes.dex */
public final class gae0 implements gzs<dev0> {
    public final Context b;
    public final mqa c;
    public final bae0 d;
    public final Interceptor e;
    public final s73 f;
    public final boolean g;
    public final Lazy<Boolean> h;

    /* compiled from: ProxyInitializer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<z560> {
        @Override // xsna.gzs
        public final z560 invoke() {
            return (z560) ((Future) this.receiver).get();
        }
    }

    /* compiled from: ProxyInitializer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<qae0> {
        @Override // xsna.gzs
        public final qae0 invoke() {
            return (qae0) ((Future) this.receiver).get();
        }
    }

    public gae0(Context context, mqa mqaVar, bae0 bae0Var, Interceptor interceptor, s73 s73Var, boolean z, Lazy lazy) {
        this.b = context;
        this.c = mqaVar;
        this.d = bae0Var;
        this.e = interceptor;
        this.f = s73Var;
        this.g = z;
        this.h = lazy;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dev0 invoke() {
        bae0 bae0Var = this.d;
        if (!bae0Var.a) {
            dev0.a.getClass();
            return dev0.a.a();
        }
        asu0.a.getClass();
        ny70 ny70Var = new ny70(new rx70(new a(0, asu0.h().submit(new Callable() { // from class: xsna.cae0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new z560(gae0.this.c);
            }
        }), Future.class, "get", "get()Ljava/lang/Object;", 0), null, Collections.singletonList(this.e), true, 18), this.g ? new bpn0(new v62(this, 5)) : new InitializedLazyImpl(c(new b(0, asu0.h().submit(new Callable() { // from class: xsna.dae0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new qae0(gae0.this.c);
            }
        }), Future.class, "get", "get()Ljava/lang/Object;", 0))));
        Context context = this.b;
        cj00 cj00Var = new cj00(context, ny70Var);
        gzs<Boolean> gzsVar = bae0Var.b;
        pev0.a aVar = new pev0.a(gzsVar, gzsVar, bae0Var.c, bae0Var.d.invoke().booleanValue());
        VkProxyPreferences vkProxyPreferences = new VkProxyPreferences();
        pev0 pev0Var = new pev0(aVar, vkProxyPreferences, this.c, new kae0(vkProxyPreferences, aVar), cj00Var, new kpy(this, 3));
        io.reactivex.rxjava3.internal.operators.observable.p1 p1Var = new io.reactivex.rxjava3.internal.operators.observable.p1(((mir) rhr.i.getValue()).f.a0(io.reactivex.rxjava3.schedulers.a.b()), new d43(new qo70(1), 1));
        io.reactivex.rxjava3.internal.operators.observable.j1 G = sa30.G();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
        new io.reactivex.rxjava3.internal.operators.observable.y(io.reactivex.rxjava3.core.q.m(p1Var, new io.reactivex.rxjava3.internal.operators.observable.y(G, qVar, aVar2), new u45(new eae0())).a0(io.reactivex.rxjava3.schedulers.a.b()), qVar, aVar2).subscribe(new d67(new c67(pev0Var, 2), 1));
        return new VkProxyProvider(new kev0(new pgn(cj00Var), new hju0(), new rsr(), new czu0(cj00Var, new s3a(7)), new hdv0(cj00Var, pev0Var), new uwu0(cj00Var, pev0Var)), new jev0(context, new fae0()), pev0Var, new s9e0(), asu0.r());
    }

    public final rx70 c(gzs<? extends z560> gzsVar) {
        return new rx70(gzsVar, new z9e0(this.c, BuildInfo.h()), e43.l(this.e, new nae0()), false, 16);
    }
}
