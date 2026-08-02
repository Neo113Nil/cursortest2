package xsna;

import android.content.Context;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.LinkedList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e6h;
import xsna.w7h;
import xsna.x7h;

/* compiled from: CommunityProfileMapper.kt */
/* loaded from: classes5.dex */
public final class lrh extends kph {
    public final Context c;
    public final vig0 d;
    public final ctg e;
    public final ynh f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public lrh(Context context, vig0 vig0Var, ctg ctgVar, ynh ynhVar) {
        this.c = context;
        this.d = vig0Var;
        this.e = ctgVar;
        this.f = ynhVar;
        k5h k5hVar = new k5h(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, k5hVar);
        this.h = msy.a(lazyThreadSafetyMode, new c5f(this, 5));
        this.i = msy.a(lazyThreadSafetyMode, new jrh(this, 0));
        this.j = msy.a(lazyThreadSafetyMode, new ic(this, 29));
        this.k = msy.a(lazyThreadSafetyMode, new dne(this, 9));
        this.l = msy.a(lazyThreadSafetyMode, new krh(this, 0));
        this.m = msy.a(lazyThreadSafetyMode, new i9(18));
        this.n = msy.a(lazyThreadSafetyMode, new qc(this, 28));
        this.o = msy.a(lazyThreadSafetyMode, new i5f(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        r4h r4hVar;
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        boolean z = kn00Var.f;
        e6h a = f6h.a(extendedCommunityProfile, z);
        if (z) {
            ((x7h) this.m.getValue()).getClass();
            x7h.a a2 = x7h.a(extendedCommunityProfile);
            if (epx.f(a2, x7h.a.C3982a.a)) {
                return EmptyList.b;
            }
            if (!epx.f(a2, x7h.a.b.a)) {
                boolean z2 = a2 instanceof x7h.a.c;
                ?? r3 = this.n;
                if (!z2) {
                    if (!(a2 instanceof x7h.a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fqh fqhVar = (fqh) r3.getValue();
                    ExtendedUserProfile.e eVar = ((x7h.a.d) a2).a;
                    fqhVar.getClass();
                    LinkedList linkedList = new LinkedList();
                    pvn pvnVar = new pvn(null);
                    fqhVar.a.s(pvnVar, kn00Var);
                    z7h z7hVar = new z7h(eVar);
                    pvnVar.g(z7hVar);
                    z7hVar.a = true;
                    s3q0 s3q0Var = s3q0.a;
                    LinkedList linkedList2 = (LinkedList) pvnVar.b;
                    r4hVar = linkedList2.isEmpty() ? null : new r4h(linkedList2, null);
                    if (r4hVar != null) {
                        linkedList.add(r4hVar);
                    }
                    return linkedList;
                }
                if (epx.f(a, e6h.b.a)) {
                    w7h w7hVar = ((x7h.a.c) a2).a;
                    if (epx.f(w7hVar, w7h.a.a) || epx.f(w7hVar, w7h.d.a)) {
                        return ((bqh) this.o.getValue()).h(kn00Var);
                    }
                }
                fqh fqhVar2 = (fqh) r3.getValue();
                w7h w7hVar2 = ((x7h.a.c) a2).a;
                fqhVar2.getClass();
                LinkedList linkedList3 = new LinkedList();
                pvn pvnVar2 = new pvn(null);
                fqhVar2.a.s(pvnVar2, kn00Var);
                v7h v7hVar = new v7h(w7hVar2);
                pvnVar2.g(v7hVar);
                v7hVar.a = true;
                s3q0 s3q0Var2 = s3q0.a;
                LinkedList linkedList4 = (LinkedList) pvnVar2.b;
                r4hVar = linkedList4.isEmpty() ? null : new r4h(linkedList4, null);
                if (r4hVar != null) {
                    linkedList3.add(r4hVar);
                }
                return linkedList3;
            }
        }
        return w2h.c(extendedCommunityProfile) ? EmptyList.b : extendedCommunityProfile.g() ? ((pmh) this.h.getValue()).h(kn00Var) : bwd0.b(extendedCommunityProfile) ? ((ruh) this.i.getValue()).h(kn00Var) : bwd0.f(extendedCommunityProfile) ? ((xsh) this.k.getValue()).h(kn00Var) : bwd0.c(extendedCommunityProfile) ? ((zeh) this.l.getValue()).h(kn00Var) : s().h(kn00Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final bfh s() {
        return (bfh) this.g.getValue();
    }
}
