package com.yandex.go.scooters.passes.v2.list;

import android.content.Context;
import defpackage.a3v0;
import defpackage.b7o0;
import defpackage.bys;
import defpackage.c590;
import defpackage.c7o0;
import defpackage.ca1;
import defpackage.d7o0;
import defpackage.e7o0;
import defpackage.ejz0;
import defpackage.f0z0;
import defpackage.f7o0;
import defpackage.g0c;
import defpackage.he7;
import defpackage.jl40;
import defpackage.lgp;
import defpackage.lhj;
import defpackage.lj1;
import defpackage.omu0;
import defpackage.pw8;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.tls;
import defpackage.ur70;
import defpackage.vj90;
import defpackage.z2v0;
import defpackage.zxs;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a extends bys {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, tls tlsVar) {
        super(r1, scc.g(r5, r12, r13, new zxs(r2.a(), 0, r3, EmptyList.a, new he7(1, r0), null)));
        pw8 pw8Var = new pw8(3, tlsVar);
        int i = ejz0.S;
        g0c a = qoi0.a(e7o0.class);
        z2v0 z2v0Var = new z2v0(context, 8);
        f0z0 f0z0Var = new f0z0(12);
        zxs zxsVar = new zxs(a.a(), 0, z2v0Var, Collections.singletonList(new lgp(TitleViewHolder$Companion$itemType$3.b, TitleViewHolder$Companion$itemType$4.b, 3)), new he7(1, f0z0Var), null);
        int i2 = a3v0.S;
        g0c a2 = qoi0.a(d7o0.class);
        z2v0 z2v0Var2 = new z2v0(context, 0);
        omu0 omu0Var = new omu0(9);
        zxs zxsVar2 = new zxs(a2.a(), 0, z2v0Var2, Collections.singletonList(new lgp(SubtitleViewHolder$Companion$itemType$3.b, SubtitleViewHolder$Companion$itemType$4.b, 3)), new he7(1, omu0Var), null);
        int i3 = c590.S;
        g0c a3 = qoi0.a(c7o0.class);
        lj1 lj1Var = new lj1(context, 26);
        ur70 ur70Var = new ur70(25);
        zxs zxsVar3 = new zxs(a3.a(), 0, lj1Var, Collections.singletonList(new lgp(PackageViewHolder$Companion$itemType$3.b, PackageViewHolder$Companion$itemType$4.b, 3)), new he7(1, ur70Var), null);
        int i4 = ca1.g0;
        g0c a4 = qoi0.a(b7o0.class);
        lj1 lj1Var2 = new lj1(context, 11);
        lhj lhjVar = new lhj(26);
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        f7o0 f7o0Var = (f7o0) obj;
        f7o0 f7o0Var2 = (f7o0) obj2;
        if (!(f7o0Var instanceof c7o0) || !(f7o0Var2 instanceof c7o0)) {
            return ((f7o0Var instanceof e7o0) && (f7o0Var2 instanceof e7o0)) ? jl40.l(((e7o0) f7o0Var).a, ((e7o0) f7o0Var2).a) : ((f7o0Var instanceof d7o0) && (f7o0Var2 instanceof d7o0)) ? jl40.l(((d7o0) f7o0Var).a, ((d7o0) f7o0Var2).a) : jl40.l(f7o0Var, f7o0Var2);
        }
        c7o0 c7o0Var = (c7o0) f7o0Var;
        vj90 vj90Var = c7o0Var.a;
        CharSequence charSequence = vj90Var.d;
        c7o0 c7o0Var2 = (c7o0) f7o0Var2;
        vj90 vj90Var2 = c7o0Var2.a;
        return jl40.l(charSequence, vj90Var2.d) && jl40.l(vj90Var.e, vj90Var2.e) && jl40.l(vj90Var.f, vj90Var2.f) && jl40.l(vj90Var.g, vj90Var2.g) && c7o0Var.b == c7o0Var2.b && c7o0Var.c == c7o0Var2.c && jl40.l(c7o0Var.d, c7o0Var2.d);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        f7o0 f7o0Var = (f7o0) obj;
        f7o0 f7o0Var2 = (f7o0) obj2;
        return ((f7o0Var instanceof c7o0) && (f7o0Var2 instanceof c7o0)) ? jl40.l(((c7o0) f7o0Var).a.a, ((c7o0) f7o0Var2).a.a) : f7o0Var.getClass() == f7o0Var2.getClass();
    }
}
