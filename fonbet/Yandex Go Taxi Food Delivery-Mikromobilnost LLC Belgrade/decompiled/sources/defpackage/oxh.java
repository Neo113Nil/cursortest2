package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class oxh implements vu2 {
    public final yuf0 a;
    public final z0j b;

    public oxh(yuf0 yuf0Var, z0j z0jVar) {
        this.a = yuf0Var;
        this.b = z0jVar;
    }

    @Override // defpackage.vu2
    public final Object b(oep0 oep0Var, Uri uri, Continuation continuation) {
        yuf0 yuf0Var = this.a;
        yuf0Var.getClass();
        if (jl40.l(uri.getScheme(), (String) ((i3y) yuf0Var.c).getValue()) && (jl40.l(uri.getHost(), (String) ((i3y) yuf0Var.d).getValue()) || jl40.l(uri.getHost(), (String) ((i3y) yuf0Var.e).getValue()))) {
            String path = uri.getPath();
            if (path != null ? cvu0.x(path, (String) ((i3y) yuf0Var.f).getValue(), false) : false) {
                ((pep0) oep0Var).f((m950) ((h3y) yuf0Var.b).get(), new txh(uri.toString(), new kwh(0)), hxx.a);
                this.b.b();
                return new m5u(false, false);
            }
        }
        return n5u.a;
    }
}
