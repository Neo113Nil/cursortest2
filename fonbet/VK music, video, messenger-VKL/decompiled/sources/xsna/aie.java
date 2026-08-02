package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.vk.core.fragments.FragmentImpl;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import xsna.pge;

/* compiled from: ClipsInterestsResultConsumerImpl.kt */
/* loaded from: classes17.dex */
public final class aie implements f5z, zhe {
    public final pge b;
    public WeakReference<Context> d;
    public androidx.lifecycle.m c = new androidx.lifecycle.m(this, true);
    public final ug50<b> e = new ug50<>(b.NOTHING);
    public final c f = new c();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final androidx.lifecycle.m i = this.c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsInterestsResultConsumerImpl.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NOTHING;
        public static final b SHOW;

        static {
            b bVar = new b("NOTHING", 0);
            NOTHING = bVar;
            b bVar2 = new b("SHOW", 1);
            SHOW = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsInterestsResultConsumerImpl.kt */
    public static final class c implements pge.a {
        public c() {
        }

        @Override // xsna.pge.a
        public final void a() {
            aie.this.e.i(b.SHOW);
        }
    }

    /* compiled from: ClipsInterestsResultConsumerImpl.kt */
    public static final class d implements fr70, g0t {
        public final /* synthetic */ j9 b;

        public d(j9 j9Var) {
            this.b = j9Var;
        }

        @Override // xsna.fr70
        public final /* synthetic */ void a(Object obj) {
            this.b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fr70) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public aie(pge pgeVar) {
        this.b = pgeVar;
    }

    @Override // xsna.zhe
    public final void a(FragmentImpl fragmentImpl) {
        mbs mbsVar = fragmentImpl.D;
        if (!this.c.d.a(Lifecycle.State.INITIALIZED)) {
            this.c = new androidx.lifecycle.m(this, true);
        }
        mbsVar.a(new a(mbsVar));
        this.h.add(mbsVar);
        Context requireContext = fragmentImpl.requireContext();
        Lifecycle.State state = this.c.d;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.a(state2)) {
            return;
        }
        this.c.e(state2);
        this.d = new WeakReference<>(requireContext);
        this.e.e(this, new d(new j9(this, 24)));
        this.b.b(this.f);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.i;
    }

    /* compiled from: ClipsInterestsResultConsumerImpl.kt */
    public final class a implements obs {
        public final mbs b;

        public a(mbs mbsVar) {
            this.b = mbsVar;
        }

        @Override // xsna.obs
        public final void onDestroy() {
            aie aieVar = aie.this;
            LinkedHashSet linkedHashSet = aieVar.h;
            boolean isEmpty = linkedHashSet.isEmpty();
            mbs mbsVar = this.b;
            mbsVar.d(this);
            aieVar.g.remove(mbsVar);
            linkedHashSet.remove(mbsVar);
            if (isEmpty) {
                return;
            }
            aieVar.c.e(Lifecycle.State.DESTROYED);
            aieVar.b.a(aieVar.f);
            aieVar.d = null;
            aieVar.e.k(b.NOTHING);
        }

        @Override // xsna.obs
        public final void onPause() {
            aie aieVar = aie.this;
            LinkedHashSet linkedHashSet = aieVar.g;
            linkedHashSet.remove(this.b);
            if (linkedHashSet.isEmpty()) {
                Lifecycle.State state = Lifecycle.State.CREATED;
                if (aieVar.c.d.a(Lifecycle.State.INITIALIZED)) {
                    aieVar.c.e(state);
                }
            }
        }

        @Override // xsna.obs
        public final void onResume() {
            aie aieVar = aie.this;
            aieVar.g.add(this.b);
            Lifecycle.State state = aieVar.c.d;
            Lifecycle.State state2 = Lifecycle.State.RESUMED;
            if (state.a(state2) || !aieVar.c.d.a(Lifecycle.State.INITIALIZED)) {
                return;
            }
            aieVar.c.e(state2);
        }

        @Override // xsna.obs
        public final void onStop() {
            aie aieVar = aie.this;
            LinkedHashSet linkedHashSet = aieVar.g;
            linkedHashSet.remove(this.b);
            if (linkedHashSet.isEmpty()) {
                Lifecycle.State state = Lifecycle.State.CREATED;
                if (aieVar.c.d.a(Lifecycle.State.INITIALIZED)) {
                    aieVar.c.e(state);
                }
            }
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }
}
