package xsna;

import android.app.Activity;
import com.vk.dto.common.ClipVideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityScheduledClipsDependenciesImpl.kt */
/* loaded from: classes5.dex */
public final class n0i implements l0i {
    public final h7m a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public n0i(l7m l7mVar) {
        this.a = l7mVar;
        sbg sbgVar = new sbg(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, sbgVar);
        this.c = msy.a(lazyThreadSafetyMode, new tbg(this, 8));
        this.d = msy.a(lazyThreadSafetyMode, new m3g(this, 4));
        int i = 26;
        this.e = msy.a(lazyThreadSafetyMode, new im0(this, i));
        this.f = msy.a(lazyThreadSafetyMode, new ra(this, i));
        this.g = msy.a(lazyThreadSafetyMode, new h20(this, 22));
        this.h = msy.a(lazyThreadSafetyMode, new nm0(9));
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
