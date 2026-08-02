package xsna;

import android.content.Context;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import kotlin.Lazy;

/* compiled from: VkAppImBridge.kt */
/* loaded from: classes11.dex */
public final class eau0 implements mxv {
    public final o0r0 a;
    public final pcw b;
    public final o0w c;
    public final kyv d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public eau0(o0r0 o0r0Var, pcw pcwVar, o0w o0wVar, kyv kyvVar, Lazy<? extends StoryViewerRouter> lazy, Lazy<? extends oul0> lazy2, Lazy<? extends fib> lazy3, Lazy<? extends jcq0> lazy4, Lazy<? extends NewsfeedRouterComponent> lazy5) {
        this.a = o0r0Var;
        this.b = pcwVar;
        this.c = o0wVar;
        this.d = kyvVar;
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy3;
        this.h = lazy4;
        this.i = lazy5;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mxv
    public final xyv a() {
        return new jju0(this.g, this.i);
    }

    @Override // xsna.mxv
    public final o0w b() {
        return this.c;
    }

    @Override // xsna.mxv
    public final o0r0 d() {
        return this.a;
    }

    @Override // xsna.mxv
    public final boolean f(Context context) {
        return pmr0.a(context);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mxv
    public final mdw g() {
        return new pkg(this.e, this.f);
    }

    @Override // xsna.mxv
    public final sev0 h() {
        return sev0.d;
    }

    @Override // xsna.mxv
    public final pcw i() {
        return this.b;
    }

    @Override // xsna.mxv
    public final kyv j() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mxv
    public final b7u0 k() {
        return new b7u0(this.i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mxv
    public final o0v0 l() {
        return new o0v0(this.h);
    }

    @Override // xsna.mxv
    public final xal m() {
        return vwv.c();
    }
}
