package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao50;
import xsna.di6;
import xsna.hm50;
import xsna.kj50;
import xsna.mk50;
import xsna.vl50;
import xsna.wn50;
import xsna.xn50;
import xsna.yn50;

/* compiled from: MviComponent.kt */
/* loaded from: classes2.dex */
public abstract class yj50<VM extends di6<VS, A, VE, NE>, VS extends ao50, A extends kj50, V extends wn50<VS, A>, VE extends yn50, NE extends vl50, R extends hm50<NE>> implements xn50<VM, VS, A> {
    public static final /* synthetic */ qcy<Object>[] m;
    public final Fragment b;
    public final mg8 c;
    public final Class<A> d;
    public final boolean e;
    public final a f;
    public final HashMap<Pair<Class<?>, String>, tjt<?>> g;
    public V h;
    public final bpn0 i;
    public final io.reactivex.rxjava3.disposables.b j;
    public final io.reactivex.rxjava3.core.w k;
    public final ArrayList l;

    /* compiled from: MviComponent.kt */
    public static final class a<F extends vk50<?, ?> & g4z, S> extends z4z<F, S> implements i7f0<yj50<?, ?, ?, ?, ?, ?, ?>, F> {
        @Override // xsna.i7f0
        public final Object getValue(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, qcy qcyVar) {
            F a = a();
            if (a != 0) {
                return (vk50) a;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(yj50.class, SignalingProtocol.KEY_FEATURE, "getFeature()Lcom/vk/im/mvicomponent/BaseMviFeature;", 0);
        fpf0.a.getClass();
        m = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yj50(Fragment fragment, mg8 mg8Var, Class<A> cls, boolean z) {
        this.b = fragment;
        this.c = mg8Var;
        this.d = cls;
        this.e = z;
        this.f = new a(getClass().getCanonicalName(), fragment, new dd4(this, 5), this instanceof quk0 ? (quk0) this : null);
        this.g = new HashMap<>();
        this.i = new bpn0(new vex(this, 8));
        this.j = new io.reactivex.rxjava3.disposables.b();
        this.k = io.reactivex.rxjava3.schedulers.a.b();
        asu0 asu0Var = asu0.a;
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        asu0Var.getClass();
        new io.reactivex.rxjava3.internal.schedulers.d(je00.b, true);
        this.l = new ArrayList();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        throw new IllegalStateException("Unreachable code");
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        throw new IllegalStateException("Unreachable code");
    }

    @Override // xsna.xn50
    public /* bridge */ /* synthetic */ void R4(vk50 vk50Var) {
    }

    public abstract VM a(Bundle bundle);

    public abstract R b();

    public final mk50 c(LayoutInflater layoutInflater, ViewGroup viewGroup, bv1 bv1Var) {
        if (!this.e) {
            V d = d();
            this.h = d;
            View c = d.c(layoutInflater, viewGroup);
            return c != null ? new mk50.c(c) : mk50.a.a;
        }
        if (bv1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        V d2 = d();
        this.h = d2;
        if (!(d2 instanceof fi6)) {
            throw new IllegalArgumentException("createViewAsync can only be used with BaseMviViewController");
        }
        fi6 fi6Var = (fi6) d2;
        if (fi6Var.c == null) {
            throw new IllegalArgumentException("createViewAsync can only be used with async view controller");
        }
        this.j.b(fi6Var.e.subscribe(new d120(new oh3(22, this, bv1Var), 5)));
        View c2 = fi6Var.c(layoutInflater, viewGroup);
        return c2 != null ? new mk50.c(c2) : mk50.a.a;
    }

    public abstract V d();

    public final <T extends g4z> T e(Class<T> cls, String str, gzs<? extends T> gzsVar) {
        Pair<Class<?>, String> pair = new Pair<>(cls, str);
        HashMap<Pair<Class<?>, String>, tjt<?>> hashMap = this.g;
        tjt<?> tjtVar = hashMap.get(pair);
        if (tjtVar != null) {
            return (T) tjtVar.a();
        }
        tjt<?> tjtVar2 = new tjt<>(cls.getName().concat(str), this.b.kn(), gzsVar);
        hashMap.put(pair, tjtVar2);
        return (T) tjtVar2.a();
    }

    @Override // xsna.xn50
    public final void e2(A a2) {
        xn50.a.c(this, a2);
    }

    @Override // xsna.xn50
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final VM getFeature() {
        return (VM) this.f.getValue(this, m[0]);
    }

    public final void g() {
        k(new Cnew(this, 14));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b.getViewLifecycleOwner();
    }

    public final void h() {
        R4(getFeature());
    }

    public final void i() {
        this.l.clear();
        V v = this.h;
        if (v != null) {
            v.onDestroyView();
        }
        this.j.e();
        this.g.clear();
        this.h = null;
    }

    public final void j(View view, Bundle bundle) {
        k(new nuj(this, 26));
    }

    public final void k(gzs<s3q0> gzsVar) {
        if (this.e) {
            V v = this.h;
            if ((v instanceof fi6) && !(((fi6) v).e.P0() instanceof mk50.c)) {
                this.l.add(gzsVar);
                return;
            }
        }
        gzsVar.invoke();
    }

    public final void l(gzs<s3q0> gzsVar) {
        k(new mn0(2, gzsVar));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return a(bundle);
    }
}
