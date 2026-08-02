package xsna;

import com.vk.core.compose.generated.VkColorToken;
import kotlin.LazyThreadSafetyMode;
import xsna.dai;
import xsna.dt1;
import xsna.rmw;
import xsna.wkj;

/* compiled from: MediaViewState.kt */
/* loaded from: classes2.dex */
public final class q020 {
    public final rmw a;
    public final Integer b;
    public final wkj c;
    public final dt1 d;
    public final float e;
    public final pco f;
    public final VkColorToken g;
    public final boolean h;
    public final boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public q020(rmw rmwVar, Integer num, wkj wkjVar, dt1 dt1Var, pco pcoVar, VkColorToken vkColorToken, boolean z, int i) {
        rmwVar = (i & 1) != 0 ? null : rmwVar;
        num = (i & 2) != 0 ? null : num;
        wkjVar = (i & 4) != 0 ? wkj.a.b : wkjVar;
        if ((i & 8) != 0) {
            dt1.a.getClass();
            dt1Var = dt1.a.f;
        }
        vkColorToken = (i & 64) != 0 ? VkColorToken.ImagePlaceholder : vkColorToken;
        z = (i & 128) != 0 ? false : z;
        boolean z2 = (i & 256) == 0;
        this.a = rmwVar;
        this.b = num;
        this.c = wkjVar;
        this.d = dt1Var;
        this.e = 1.0f;
        this.f = pcoVar;
        this.g = vkColorToken;
        this.h = z;
        this.i = z2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, new se0(14));
        this.k = at.c(lazyThreadSafetyMode);
        this.l = msy.a(lazyThreadSafetyMode, new h13(10));
        this.m = msy.a(lazyThreadSafetyMode, new te0(12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.b a() {
        return (dai.b) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c b() {
        return (dai.c) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.d<rmw.e> c() {
        return (dai.d) this.m.getValue();
    }

    public final boolean d() {
        return this.b != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zoi<Boolean> e() {
        return (zoi) this.l.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q020)) {
            return false;
        }
        q020 q020Var = (q020) obj;
        return epx.f(this.a, q020Var.a) && epx.f(this.b, q020Var.b) && epx.f(this.c, q020Var.c) && epx.f(this.d, q020Var.d) && Float.compare(this.e, q020Var.e) == 0 && epx.f(this.f, q020Var.f) && this.g == q020Var.g && this.h == q020Var.h && this.i == q020Var.i;
    }

    public final int hashCode() {
        rmw rmwVar = this.a;
        int hashCode = (rmwVar == null ? 0 : rmwVar.hashCode()) * 31;
        Integer num = this.b;
        int a = io.reactivex.rxjava3.subjects.b.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31);
        pco pcoVar = this.f;
        int hashCode2 = (a + (pcoVar == null ? 0 : Float.hashCode(pcoVar.b))) * 31;
        VkColorToken vkColorToken = this.g;
        return Boolean.hashCode(this.i) + qoy.b((hashCode2 + (vkColorToken != null ? vkColorToken.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaViewState(image=");
        sb.append(this.a);
        sb.append(", blurRadius=");
        sb.append(this.b);
        sb.append(", contentScale=");
        sb.append(this.c);
        sb.append(", alignment=");
        sb.append(this.d);
        sb.append(", alpha=");
        sb.append(this.e);
        sb.append(", cornersSize=");
        sb.append(this.f);
        sb.append(", backgroundColor=");
        sb.append(this.g);
        sb.append(", isCustomMediaEnabled=");
        sb.append(this.h);
        sb.append(", isSkeleton=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
