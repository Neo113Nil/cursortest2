package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final class n9j0 {
    public final b8x0 a;
    public final z7x0 b;
    public final gl7 c;
    public final gl7 d;
    public final b e;
    public final b f;
    public boolean g = false;
    public boolean h = false;
    public o89 i;

    public n9j0(b8x0 b8x0Var, z7x0 z7x0Var) {
        this.a = b8x0Var;
        this.b = z7x0Var;
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        try {
            this.e = bVar;
            bVar.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.c = gl7Var;
        b bVar2 = new b();
        bVar2.c = new hsj0();
        gl7 gl7Var2 = new gl7(bVar2);
        bVar2.b = gl7Var2;
        try {
            this.f = bVar2;
            bVar2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            gl7Var2.a(e2);
        }
        this.d = gl7Var2;
    }

    public final void a() {
        b8x0 b8x0Var = this.a;
        if (!b8x0Var.m() || b8x0Var.l()) {
            if (!b8x0Var.m()) {
                d6z.y("The callback can only complete once.", !this.d.b.isDone());
            }
            this.f.b(null);
        }
    }
}
