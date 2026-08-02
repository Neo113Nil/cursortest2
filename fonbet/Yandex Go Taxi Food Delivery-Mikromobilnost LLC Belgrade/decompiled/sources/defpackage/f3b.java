package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.rights.ChatRightsFlag;

/* loaded from: classes15.dex */
public final class f3b {
    public final ChatRequest a;
    public final j3b b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public f3b(ChatRequest chatRequest, j3b j3bVar, m150 m150Var, r2c0 r2c0Var, boolean z, boolean z2, x270 x270Var) {
        this.a = chatRequest;
        this.b = j3bVar;
        this.c = z;
        this.d = z2;
        this.e = r2c0Var.b;
        this.f = j3bVar.I;
        this.g = m150Var.b;
        this.h = j3bVar.e;
        this.i = j3bVar.j;
        this.j = j3bVar.G;
        this.k = j73.y(r2c0Var.a, j3bVar.b);
        this.l = j3bVar.H;
        wbz0 wbz0Var = s8b.c;
        int i = j3bVar.i;
        wbz0Var.getClass();
        this.m = new s8b(i).f(ChatRightsFlag.Leave);
        this.n = j3bVar.C;
    }
}
