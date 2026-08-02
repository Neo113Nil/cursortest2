package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.common.links.contract.AnonymousLinker;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VkLinksBridge.kt */
/* loaded from: classes11.dex */
public final class o2v0 implements qdz {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final ProfileFragmentProviderComponent F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final String M;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public o2v0(Lazy<? extends lpg0> lazy, Lazy<? extends fy9> lazy2, Lazy<? extends StoryViewerRouter> lazy3, Lazy<? extends ajg0> lazy4, Lazy<? extends hy80> lazy5, Lazy<? extends jlu0> lazy6, Lazy<? extends mh70> lazy7, Lazy<? extends zb70> lazy8, Lazy<? extends tkw0> lazy9, Lazy<? extends j2x0> lazy10, Lazy<? extends n9p0> lazy11, Lazy<? extends ie7> lazy12, Lazy<? extends sz00> lazy13, Lazy<? extends com.vk.ecomm.storefrontservices.api.a> lazy14, Lazy<? extends cp80> lazy15, Lazy<? extends kkj> lazy16, Lazy<? extends gog> lazy17, Lazy<? extends ivg> lazy18, Lazy<? extends rml0> lazy19, Lazy<? extends jwn0> lazy20, Lazy<? extends a550> lazy21, Lazy<? extends BiometricsLockComponent> lazy22, Lazy<? extends qqm> lazy23, Lazy<? extends wnr0> lazy24, Lazy<? extends xqg> lazy25, Lazy<? extends w1h> lazy26, Lazy<? extends er40> lazy27, Lazy<? extends shb0> lazy28, Lazy<? extends qct> lazy29, Lazy<? extends NewsfeedRouter> lazy30, Lazy<? extends wro> lazy31, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy9;
        this.j = lazy10;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
        this.r = lazy18;
        this.s = lazy19;
        this.t = lazy20;
        this.u = lazy21;
        this.v = lazy22;
        this.w = lazy23;
        this.x = lazy24;
        this.y = lazy25;
        this.z = lazy26;
        this.A = lazy27;
        this.B = lazy28;
        this.C = lazy29;
        this.D = lazy30;
        this.E = lazy31;
        this.F = profileFragmentProviderComponent;
        sq6 sq6Var = new sq6(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, sq6Var);
        this.H = msy.a(lazyThreadSafetyMode, new fr4(this, 10));
        this.I = msy.a(lazyThreadSafetyMode, new jnf(15));
        this.J = msy.a(lazyThreadSafetyMode, new f25(this, 7));
        this.K = msy.a(lazyThreadSafetyMode, new lnf(17));
        this.L = msy.a(lazyThreadSafetyMode, new r12(18));
        this.M = "vkontakte";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final sdz a() {
        return (sdz) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final csl b() {
        return (csl) this.L.getValue();
    }

    @Override // xsna.qdz
    public final boolean c(Context context, Uri uri, Bundle bundle) {
        maz.c(e(), context, uri.toString(), null, bundle, null, 20);
        return true;
    }

    @Override // xsna.qdz
    public final String d() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final maz e() {
        return (maz) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final urw f() {
        return (urw) this.J.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final AnonymousLinker g() {
        return (AnonymousLinker) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qdz
    public final rk8 getBrowser() {
        return (rk8) this.G.getValue();
    }

    @Override // xsna.qdz
    public final void h(Context context, ActionOpenUrl actionOpenUrl, String str) {
        com.vk.extensions.a.b(actionOpenUrl, context, null, str, null, null, null, null, null, 250);
    }
}
