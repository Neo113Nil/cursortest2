package xsna;

import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import xsna.h7v;
import xsna.hg1;

/* compiled from: ChannelsOnboardingVisibilityStore.kt */
/* loaded from: classes16.dex */
public final class uhb implements thb {
    public final h7v a;
    public final cew b;
    public final io.reactivex.rxjava3.subjects.f<Boolean> c;
    public final io.reactivex.rxjava3.subjects.d d;
    public final HintId e;
    public boolean f;
    public final HintId g;
    public final boolean h;

    /* compiled from: ChannelsOnboardingVisibilityStore.kt */
    public static final class a implements h7v.b {
        public a() {
        }

        @Override // xsna.h7v.b
        public final void a(boolean z) {
            uhb uhbVar = uhb.this;
            uhbVar.c.onNext(Boolean.valueOf(!z));
            uhbVar.b.getClass();
            if (cew.h().getBoolean("pref_channels_onboarding_showed", false) != z) {
                cew.h().edit().putBoolean("pref_channels_onboarding_showed", z).apply();
            }
        }
    }

    public uhb(h7v h7vVar, cew cewVar, a1w a1wVar, boolean z) {
        this.a = h7vVar;
        this.b = cewVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        io.reactivex.rxjava3.subjects.f<Boolean> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, fVar.a0(asu0.a.d()), null, null, new yx0(N0, 22)));
        this.d = N0;
        HintId hintId = HintId.IM_ONBOARDING_BANNER_SHOW;
        this.e = hintId;
        HintId hintId2 = HintId.IM_CHANNELS_SHOWCASE_BANNER;
        this.g = hintId2;
        this.h = z;
        h7vVar.c(hintId.getId(), new a());
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hg1.v()).U(new hg1.u()), null, null, new d7(this, 18)));
        Hint p = h7vVar.p(hintId.getId());
        boolean z2 = false;
        if ((!z || h7vVar.p(hintId2.getId()) == null) && p != null) {
            cewVar.getClass();
            if (!cew.h().getBoolean("pref_channels_onboarding_showed", false)) {
                z2 = true;
            }
        }
        N0.onNext(Boolean.valueOf(z2));
    }

    @Override // xsna.thb
    public final void a() {
        if (this.f) {
            return;
        }
        this.a.b(this.e.getId());
        this.b.getClass();
        if (!cew.h().getBoolean("pref_channels_onboarding_showed", false)) {
            cew.h().edit().putBoolean("pref_channels_onboarding_showed", true).apply();
        }
        this.f = true;
    }
}
