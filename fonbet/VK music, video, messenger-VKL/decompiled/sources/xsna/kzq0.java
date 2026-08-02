package xsna;

import android.app.Activity;
import com.vk.dto.common.ClipVideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: UserScheduledClipsDependenciesImpl.kt */
/* loaded from: classes5.dex */
public final class kzq0 implements l0i {
    public final h7m a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public kzq0(l7m l7mVar) {
        this.a = l7mVar;
        jaa0 jaa0Var = new jaa0(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, jaa0Var);
        this.c = msy.a(lazyThreadSafetyMode, new acp0(this, 1));
        this.d = msy.a(lazyThreadSafetyMode, new i8n0(this, 6));
        this.e = msy.a(lazyThreadSafetyMode, new prq0(this, 2));
        this.f = msy.a(lazyThreadSafetyMode, new wmd0(this, 15));
        this.g = msy.a(lazyThreadSafetyMode, new j8n0(this, 6));
        this.h = msy.a(lazyThreadSafetyMode, new sqf0(9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l0i
    public final xne Y() {
        return (xne) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l0i
    public final wzs<ClipVideoFile, Activity, s3q0> a() {
        return (wzs) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l0i
    public final e1i c() {
        return (e1i) this.h.getValue();
    }
}
