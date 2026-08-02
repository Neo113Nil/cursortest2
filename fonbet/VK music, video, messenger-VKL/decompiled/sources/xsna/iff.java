package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsUploadExternalDepsHolder.kt */
/* loaded from: classes17.dex */
public final class iff {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final bpn0 H;
    public final Object a;
    public final bpn0 b;
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
    public final bpn0 v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public iff(l7m l7mVar, Context context) {
        mze mzeVar = new mze(l7mVar, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, mzeVar);
        this.b = new bpn0(new oze(l7mVar, 1));
        this.c = msy.a(lazyThreadSafetyMode, new xef(l7mVar, 0));
        this.d = msy.a(lazyThreadSafetyMode, new jb(8));
        this.e = msy.a(lazyThreadSafetyMode, new cff(context, 0));
        int i = 1;
        this.f = msy.a(lazyThreadSafetyMode, new g7f(l7mVar, i));
        this.g = msy.a(lazyThreadSafetyMode, new i7f(l7mVar, i));
        this.h = msy.a(lazyThreadSafetyMode, new ji0(this, 19));
        this.i = msy.a(lazyThreadSafetyMode, new tj2(5));
        this.j = msy.a(lazyThreadSafetyMode, new z4(this, 29));
        this.k = msy.a(lazyThreadSafetyMode, new vef(l7mVar, 0));
        this.l = msy.a(lazyThreadSafetyMode, new h7f(l7mVar, 1));
        this.m = msy.a(lazyThreadSafetyMode, new fn4(4));
        this.n = msy.a(lazyThreadSafetyMode, new dff(l7mVar, 0));
        this.o = msy.a(lazyThreadSafetyMode, new mh3(2, this, context));
        this.p = msy.a(lazyThreadSafetyMode, new eff(l7mVar, 0));
        this.q = msy.a(lazyThreadSafetyMode, new defpackage.h(this, 26));
        int i2 = 0;
        this.r = msy.a(lazyThreadSafetyMode, new fff(l7mVar, i2));
        this.s = msy.a(lazyThreadSafetyMode, new gff(l7mVar, i2));
        int i3 = 1;
        this.t = msy.a(lazyThreadSafetyMode, new nze(l7mVar, i3));
        this.u = msy.a(lazyThreadSafetyMode, new pze(l7mVar, i3));
        this.v = new bpn0(new qze(l7mVar, i3));
        this.w = msy.a(lazyThreadSafetyMode, new rze(l7mVar, 1));
        this.x = msy.a(lazyThreadSafetyMode, new bu0(5));
        this.y = msy.a(lazyThreadSafetyMode, new cb(this, 22));
        int i4 = 0;
        this.z = msy.a(lazyThreadSafetyMode, new tef(l7mVar, i4));
        this.A = msy.a(lazyThreadSafetyMode, new uef(l7mVar, i4));
        this.B = msy.a(lazyThreadSafetyMode, new e4(this, 21));
        this.C = msy.a(lazyThreadSafetyMode, new gy0(this, 27));
        int i5 = 0;
        this.D = msy.a(lazyThreadSafetyMode, new wef(l7mVar, i5));
        this.E = msy.a(lazyThreadSafetyMode, new yef(l7mVar, i5));
        this.F = msy.a(lazyThreadSafetyMode, new zef(l7mVar, i5));
        this.G = msy.a(lazyThreadSafetyMode, new aff(l7mVar, i5));
        this.H = new bpn0(new bff(l7mVar, i5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dze a() {
        return (dze) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent b() {
        return (BridgeComponent) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mhd c() {
        return (mhd) this.r.getValue();
    }

    public final nne d() {
        return (nne) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mud e() {
        return (mud) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipEditComponent f() {
        return (ClipEditComponent) this.p.getValue();
    }

    public final qdz g() {
        return (qdz) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final zye h() {
        return (zye) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsUploadSdkUiComponent i() {
        return (ClipsUploadSdkUiComponent) this.a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ulf j() {
        return (ulf) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsUploadVkComponent k() {
        return (ClipsUploadVkComponent) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final imf l() {
        return (imf) this.w.getValue();
    }
}
