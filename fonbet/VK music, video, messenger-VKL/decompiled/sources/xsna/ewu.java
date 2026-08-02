package xsna;

import android.view.View;
import java.util.ArrayList;

/* compiled from: HeaderBindDelegate.kt */
/* loaded from: classes4.dex */
public final class ewu implements cvu0 {
    public final /* synthetic */ f0z a;
    public final /* synthetic */ fwu b;
    public final /* synthetic */ jr50 c;
    public final /* synthetic */ hz7 d;

    public ewu(f0z f0zVar, fwu fwuVar, jr50 jr50Var, hz7 hz7Var) {
        this.a = f0zVar;
        this.b = fwuVar;
        this.c = jr50Var;
        this.d = hz7Var;
    }

    @Override // xsna.cvu0
    public final void b() {
        this.a.invoke(this.b.a);
    }

    @Override // xsna.cvu0
    public final void e(View view) {
        ArrayList arrayList;
        egz0 c = this.c.d().c();
        if (c == null || (arrayList = c.b) == null) {
            return;
        }
        this.d.invoke(view, arrayList);
    }

    @Override // xsna.cvu0
    public final void f() {
        this.a.invoke(this.b.a);
    }

    @Override // xsna.cvu0
    public final void c() {
    }

    @Override // xsna.cvu0
    public final void d() {
    }

    @Override // xsna.cvu0
    public final void g() {
    }

    @Override // xsna.cvu0
    public final void a(zjt zjtVar) {
    }
}
