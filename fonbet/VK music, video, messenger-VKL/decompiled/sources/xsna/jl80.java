package xsna;

import android.net.Uri;
import xsna.zjw;

/* compiled from: OneVideoImageLoader.kt */
/* loaded from: classes17.dex */
public final class jl80 implements zjw {
    @Override // xsna.zjw
    public final il80 a(Uri uri, zjw.a aVar, ih7... ih7VarArr) {
        io.reactivex.rxjava3.core.q i = mcr0.i(uri, 0, 0, 0, new s0v0(), null);
        asu0 asu0Var = asu0.a;
        return new il80(i.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new amt(new defpackage.m(28, ih7VarArr, aVar), 17), new lav(new owv(aVar, 20), 16)));
    }
}
